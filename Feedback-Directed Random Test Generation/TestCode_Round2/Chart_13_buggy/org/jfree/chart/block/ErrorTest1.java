package org.jfree.chart.block;

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
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D17", size2D8.equals(size2D17) ? size2D8.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeNN(blockContainer21, graphics2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D20", size2D12.equals(size2D20) ? size2D12.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement16.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) size2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D18", size2D15.equals(size2D18) ? size2D15.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement10.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement10.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D10", size2D4.equals(size2D10) ? size2D4.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) 100.0d);
        borderArrangement8.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D10", size2D3.equals(size2D10) ? size2D3.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean22 = borderArrangement15.equals((java.lang.Object) 0.0f);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D14", size2D3.equals(size2D14) ? size2D3.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 100.0d);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement10.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) (byte) 0);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement15.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement15.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement0.add(block14, (java.lang.Object) blockContainer25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean25 = borderArrangement21.equals((java.lang.Object) (byte) 0);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement21.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement21.arrangeNN(blockContainer32, graphics2D33);
        borderArrangement0.add(block20, (java.lang.Object) blockContainer32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement7.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement7.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) size2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D10", size2D3.equals(size2D10) ? size2D3.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement9.arrangeNN(blockContainer14, graphics2D15);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean21 = borderArrangement17.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement17.arrangeNN(blockContainer22, graphics2D23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) graphics2D23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (-1.0f));
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement10.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement10.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block9, (java.lang.Object) blockContainer23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement11.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass24 = borderArrangement11.getClass();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement16.equals(obj22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement16.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) size2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D10", size2D7.equals(size2D10) ? size2D7.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement17.arrangeNN(blockContainer22, graphics2D23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement17.equals(obj23);
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 100.0d);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement17.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) size2D30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement14.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement14.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement6.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement6.arrangeNN(blockContainer14, graphics2D15);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement10.equals((java.lang.Object) (byte) 0);
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement10.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement10.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement0.add(block9, (java.lang.Object) graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        java.lang.Class<?> wildcardClass10 = size2D9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D9", size2D3.equals(size2D9) ? size2D3.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement10.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = borderArrangement10.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = size2D10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D10", size2D4.equals(size2D10) ? size2D4.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean17 = borderArrangement8.equals((java.lang.Object) 100L);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement8.equals(obj21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement8.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) size2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 100L);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean22 = borderArrangement18.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement18.arrangeNN(blockContainer23, graphics2D24);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement18.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block17, (java.lang.Object) graphics2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) 0);
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement20.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) size2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean18 = borderArrangement14.equals((java.lang.Object) (byte) 0);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement14.add(block23, obj24);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1L);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement8.arrangeNN(blockContainer13, graphics2D14);
        boolean boolean17 = borderArrangement8.equals((java.lang.Object) 100L);
        borderArrangement8.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement7.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement7.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass17 = borderArrangement11.getClass();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement11.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) size2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        borderArrangement4.clear();
        boolean boolean8 = borderArrangement4.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement4.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement4.arrangeNN(blockContainer12, graphics2D13);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) graphics2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement4", borderArrangement0.equals(borderArrangement4) ? borderArrangement0.hashCode() == borderArrangement4.hashCode() : true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement10.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement10.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.add(block9, (java.lang.Object) graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D10", size2D5.equals(size2D10) ? size2D5.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement17.equals(obj23);
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 100.0d);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement17.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement17.arrangeNN(blockContainer32, graphics2D33);
        borderArrangement0.add(block16, (java.lang.Object) blockContainer32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean24 = borderArrangement20.equals((java.lang.Object) (byte) 0);
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement20.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement0.add(block19, (java.lang.Object) blockContainer27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D18", size2D15.equals(size2D18) ? size2D15.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass21 = borderArrangement17.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D18", size2D8.equals(size2D18) ? size2D8.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D11", size2D5.equals(size2D11) ? size2D5.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D14", size2D5.equals(size2D14) ? size2D5.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass19 = borderArrangement9.getClass();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = size2D16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) 100L);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement16.arrangeNN(blockContainer29, graphics2D30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) blockContainer29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D19", size2D10.equals(size2D19) ? size2D10.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D19", size2D10.equals(size2D19) ? size2D10.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) (-1.0f));
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement21.arrangeNN(blockContainer31, graphics2D32);
        borderArrangement0.add(block20, (java.lang.Object) graphics2D32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) 0);
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) (short) 1);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement9.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.add(block8, (java.lang.Object) graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        borderArrangement6.clear();
        boolean boolean10 = borderArrangement6.equals((java.lang.Object) (byte) 0);
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement6.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement6.clear();
        boolean boolean17 = borderArrangement6.equals((java.lang.Object) true);
        borderArrangement6.clear();
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement6.add(block19, obj20);
        borderArrangement0.add(block5, obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement14.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement14.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block13, (java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement9.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) graphics2D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement8.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement0.add(block7, (java.lang.Object) graphics2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement19.equals(obj25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement19.arrangeNN(blockContainer27, graphics2D28);
        boolean boolean31 = borderArrangement19.equals((java.lang.Object) 100);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement19.arrangeNN(blockContainer32, graphics2D33);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) graphics2D33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement7.equals(obj13);
        boolean boolean16 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        boolean boolean19 = borderArrangement7.equals((java.lang.Object) (short) -1);
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement7.equals(obj20);
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement7.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) size2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement16.arrangeNN(blockContainer18, graphics2D19);
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) (short) 0);
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement16.getClass();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement9.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) size2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass16 = borderArrangement10.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) (-1.0f));
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement9.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement0.add(block8, (java.lang.Object) blockContainer18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 10.0d);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (short) 10);
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement7.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Class<?> wildcardClass19 = borderArrangement7.getClass();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (short) 10);
        borderArrangement12.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) (byte) 0);
        borderArrangement15.clear();
        boolean boolean22 = borderArrangement15.equals((java.lang.Object) 1L);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block14, (java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) 100L);
        borderArrangement10.clear();
        boolean boolean22 = borderArrangement10.equals((java.lang.Object) "hi!");
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = size2D13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement10.equals(obj16);
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) 100.0d);
        borderArrangement10.clear();
        boolean boolean22 = borderArrangement10.equals((java.lang.Object) (short) -1);
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement10.equals(obj23);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement10.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement12.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = size2D16.getClass();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) size2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement7.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean16 = borderArrangement7.equals((java.lang.Object) 100L);
        boolean boolean18 = borderArrangement7.equals((java.lang.Object) 1.0f);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeNN(blockContainer21, graphics2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D20", size2D10.equals(size2D20) ? size2D10.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) 0);
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (short) 1);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement17.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement17.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement0.add(block16, (java.lang.Object) graphics2D29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement13.equals(obj19);
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement13.equals((java.lang.Object) (byte) 10);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement10.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D7", size2D4.equals(size2D7) ? size2D4.hashCode() == size2D7.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Class<?> wildcardClass12 = size2D11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D11", size2D4.equals(size2D11) ? size2D4.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D9 and size2D15", size2D9.equals(size2D15) ? size2D9.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (-1.0f));
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) size2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement12.equals(obj18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement12.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement12.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block11, (java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement6.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement6.equals(obj12);
        boolean boolean15 = borderArrangement6.equals((java.lang.Object) 100.0d);
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement11.arrangeNN(blockContainer12, graphics2D13);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = size2D15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D15", size2D3.equals(size2D15) ? size2D3.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D20", size2D10.equals(size2D20) ? size2D10.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement6.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement6.equals((java.lang.Object) 1);
        borderArrangement6.clear();
        boolean boolean17 = borderArrangement6.equals((java.lang.Object) (short) -1);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement15.equals(obj21);
        java.lang.Class<?> wildcardClass23 = borderArrangement15.getClass();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement15.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) 1);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean24 = borderArrangement15.equals((java.lang.Object) 100L);
        boolean boolean26 = borderArrangement15.equals((java.lang.Object) 1.0f);
        borderArrangement15.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement15.add(block28, obj29);
        borderArrangement0.add(block14, (java.lang.Object) block28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) 0);
        boolean boolean11 = borderArrangement6.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement6.add(block12, obj13);
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement6.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement15.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) 0);
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (short) 1);
        borderArrangement8.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement20.equals(obj26);
        boolean boolean29 = borderArrangement20.equals((java.lang.Object) 100.0d);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.util.Size2D size2D35 = borderArrangement20.arrangeNN(blockContainer33, graphics2D34);
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.util.Size2D size2D38 = borderArrangement20.arrangeNN(blockContainer36, graphics2D37);
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) size2D38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D13", size2D8.equals(size2D13) ? size2D8.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D9", size2D5.equals(size2D9) ? size2D5.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D19", size2D8.equals(size2D19) ? size2D8.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) 100.0d);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement14.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block13, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 100.0d);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement12.arrangeNN(blockContainer21, graphics2D22);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) graphics2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 100L);
        borderArrangement17.clear();
        boolean boolean29 = borderArrangement17.equals((java.lang.Object) "hi!");
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement17.arrangeNN(blockContainer31, graphics2D32);
        borderArrangement0.add(block16, (java.lang.Object) graphics2D32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D6 and size2D9", size2D6.equals(size2D9) ? size2D6.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (-1.0f));
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement20.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement0.add(block19, (java.lang.Object) blockContainer29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 10.0d);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement10.equals((java.lang.Object) (byte) 0);
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement10.equals(obj17);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D9 and size2D13", size2D9.equals(size2D13) ? size2D9.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement8.equals(obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement8.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        borderArrangement6.clear();
        boolean boolean10 = borderArrangement6.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement6.arrangeNN(blockContainer11, graphics2D12);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) size2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement16.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement16.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block15, (java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Class<?> wildcardClass20 = size2D19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D19", size2D10.equals(size2D19) ? size2D10.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement8.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement8.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) size2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement9.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement9.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) blockContainer16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement15.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) 0);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 1);
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement13.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 100.0d);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement15.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) blockContainer25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Class<?> wildcardClass12 = borderArrangement7.getClass();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D10", size2D3.equals(size2D10) ? size2D3.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D14", size2D3.equals(size2D14) ? size2D3.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement8.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        borderArrangement4.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement4.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement4.clear();
        boolean boolean12 = borderArrangement4.equals((java.lang.Object) 1);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement4", borderArrangement0.equals(borderArrangement4) ? borderArrangement0.hashCode() == borderArrangement4.hashCode() : true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement17.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block16, (java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D13", size2D10.equals(size2D13) ? size2D10.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement11.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement11.clear();
        boolean boolean26 = borderArrangement11.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement11.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement0.add(block10, (java.lang.Object) graphics2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement17.equals(obj23);
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 100.0d);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement17.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement17.getClass();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = size2D18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D18", size2D8.equals(size2D18) ? size2D8.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) 0);
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement7.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement7.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) size2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean16 = borderArrangement9.equals((java.lang.Object) 0.0f);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D8", size2D5.equals(size2D8) ? size2D5.hashCode() == size2D8.hashCode() : true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement5.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement5.arrangeNN(blockContainer13, graphics2D14);
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement5", borderArrangement0.equals(borderArrangement5) ? borderArrangement0.hashCode() == borderArrangement5.hashCode() : true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D18", size2D8.equals(size2D18) ? size2D8.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement16.equals(obj22);
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) 100.0d);
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) 0);
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement16.arrangeNN(blockContainer22, graphics2D23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) graphics2D23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D11", size2D3.equals(size2D11) ? size2D3.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement12.equals(obj18);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) 100.0d);
        borderArrangement12.clear();
        boolean boolean24 = borderArrangement12.equals((java.lang.Object) (short) -1);
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement12.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement0.add(block11, (java.lang.Object) graphics2D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D14", size2D3.equals(size2D14) ? size2D3.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) 100.0d);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement17.arrangeNN(blockContainer29, graphics2D30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) blockContainer29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        java.lang.Class<?> wildcardClass10 = size2D9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D9", size2D4.equals(size2D9) ? size2D4.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement7.arrangeNN(blockContainer11, graphics2D12);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) graphics2D12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        borderArrangement12.clear();
        boolean boolean19 = borderArrangement12.equals((java.lang.Object) 1L);
        borderArrangement12.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean13 = borderArrangement9.equals((java.lang.Object) (byte) 0);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement19.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) "");
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D14", size2D10.equals(size2D14) ? size2D10.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) 0);
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement20.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement20.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement0.add(block19, (java.lang.Object) blockContainer30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement20.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement20.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement20.getClass();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean22 = borderArrangement15.equals((java.lang.Object) 0.0f);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement15.arrangeNN(blockContainer29, graphics2D30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) graphics2D30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement18.equals(obj24);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) 100.0d);
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement18.arrangeNN(blockContainer29, graphics2D30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D20", size2D10.equals(size2D20) ? size2D10.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement11.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement11.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) block22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = size2D16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D13 and size2D16", size2D13.equals(size2D16) ? size2D13.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D10", size2D3.equals(size2D10) ? size2D3.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement11.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) 0);
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement19.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.Block block30 = null;
        java.lang.Object obj31 = null;
        borderArrangement19.add(block30, obj31);
        boolean boolean33 = borderArrangement0.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement17.equals(obj23);
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 100.0d);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement17.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement0.add(block16, (java.lang.Object) graphics2D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement13.equals(obj22);
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement13.equals(obj26);
        borderArrangement0.add(block12, obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement12.equals(obj18);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) 100.0d);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement12.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block11, (java.lang.Object) blockContainer24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean24 = borderArrangement15.equals((java.lang.Object) 100L);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement15.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement0.add(block14, (java.lang.Object) graphics2D29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement18.equals(obj24);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) 100.0d);
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement18.arrangeNN(blockContainer29, graphics2D30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) blockContainer29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = size2D10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D10", size2D7.equals(size2D10) ? size2D7.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D15", size2D3.equals(size2D15) ? size2D3.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) 0);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 1);
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement13.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement13.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block12, (java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement17.equals(obj23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement17.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement17.clear();
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement17.equals(obj29);
        java.lang.Class<?> wildcardClass31 = borderArrangement17.getClass();
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement15.add(block24, obj25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement15.arrangeNN(blockContainer27, graphics2D28);
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) graphics2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement9.equals(obj15);
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 100.0d);
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement9.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement14.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block13, (java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement9.add(block12, obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement9.arrangeNN(blockContainer15, graphics2D16);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D12", size2D7.equals(size2D12) ? size2D7.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean17 = borderArrangement13.equals((java.lang.Object) (byte) 0);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement13.add(block22, obj23);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement13.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement0.add(block12, (java.lang.Object) blockContainer30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement16.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement16.clear();
        boolean boolean23 = borderArrangement16.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement16.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block15, (java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement11.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) 100);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean17 = borderArrangement10.equals((java.lang.Object) 0.0f);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement10.add(block24, obj25);
        boolean boolean27 = borderArrangement0.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) (byte) 0);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement16.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement16.arrangeNN(blockContainer27, graphics2D28);
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = size2D14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D9 and size2D14", size2D9.equals(size2D14) ? size2D9.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (short) 10);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D16", size2D8.equals(size2D16) ? size2D8.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement9.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) 1);
        borderArrangement9.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement8.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement0.add(block17, obj18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement23.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) 100.0d);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) 0);
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (short) 1);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement14.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement14.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D19", size2D10.equals(size2D19) ? size2D10.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = size2D14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D14", size2D3.equals(size2D14) ? size2D3.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 100.0d);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement14.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block13, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 100.0d);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean13 = borderArrangement9.equals((java.lang.Object) (byte) 0);
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement9.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement9.clear();
        boolean boolean20 = borderArrangement9.equals((java.lang.Object) true);
        borderArrangement9.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement9.equals(obj22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement9.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block8, (java.lang.Object) blockContainer24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D15", size2D8.equals(size2D15) ? size2D8.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D18", size2D10.equals(size2D18) ? size2D10.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement8.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = size2D15.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement19.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass28 = borderArrangement19.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D18", size2D12.equals(size2D18) ? size2D12.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D11", size2D5.equals(size2D11) ? size2D5.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement20.equals(obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement20.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement14.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass22 = borderArrangement14.getClass();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement12.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement12.clear();
        boolean boolean23 = borderArrangement12.equals((java.lang.Object) true);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement12.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) blockContainer24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean21 = borderArrangement17.equals((java.lang.Object) (byte) 0);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement17.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement17.clear();
        boolean boolean28 = borderArrangement17.equals((java.lang.Object) true);
        borderArrangement17.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement17.equals(obj30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D11", size2D3.equals(size2D11) ? size2D3.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D15", size2D3.equals(size2D15) ? size2D3.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) 100L);
        borderArrangement12.clear();
        boolean boolean24 = borderArrangement12.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement12.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) graphics2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (short) 10);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement16.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement16.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) blockContainer28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (short) 10);
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement7.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement7.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement19.equals(obj25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement19.arrangeNN(blockContainer27, graphics2D28);
        boolean boolean31 = borderArrangement19.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass32 = borderArrangement19.getClass();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 1);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement11.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement0.add(block10, (java.lang.Object) graphics2D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D15", size2D3.equals(size2D15) ? size2D3.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) 0);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement13.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block12, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D14", size2D5.equals(size2D14) ? size2D5.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement20.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement20.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement0.add(block19, (java.lang.Object) graphics2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D15", size2D3.equals(size2D15) ? size2D3.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement10.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement10.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.add(block9, (java.lang.Object) graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement18.equals(obj24);
        java.lang.Class<?> wildcardClass26 = borderArrangement18.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D20", size2D12.equals(size2D20) ? size2D12.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D13", size2D7.equals(size2D13) ? size2D7.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) 0);
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement10.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) 0.0d);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement10.arrangeNN(blockContainer21, graphics2D22);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) size2D23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) 0.0f);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement16.equals(obj22);
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) 100.0d);
        borderArrangement16.clear();
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement16.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement0.add(block15, (java.lang.Object) graphics2D30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        java.lang.Class<?> wildcardClass10 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D6 and size2D9", size2D6.equals(size2D9) ? size2D6.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = size2D14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D14", size2D5.equals(size2D14) ? size2D5.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        borderArrangement8.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement8.equals(obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement8.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = borderArrangement8.getClass();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) "");
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D13", size2D7.equals(size2D13) ? size2D7.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) 0.0f);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement14.arrangeNN(blockContainer29, graphics2D30);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (-1.0f));
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
        java.lang.Class<?> wildcardClass27 = size2D26.getClass();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 100.0d);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement10.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D12", size2D7.equals(size2D12) ? size2D7.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean26 = borderArrangement17.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement17.arrangeNN(blockContainer27, graphics2D28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement17.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement0.add(block16, (java.lang.Object) graphics2D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement7.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement7.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.add(block6, (java.lang.Object) blockContainer11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement8.equals(obj12);
        borderArrangement0.add(block7, obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement15.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) 1);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) 0);
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement7.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement7.add(block18, obj19);
        borderArrangement0.add(block6, obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = size2D13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D13", size2D10.equals(size2D13) ? size2D10.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 100L);
        borderArrangement9.clear();
        boolean boolean21 = borderArrangement9.equals((java.lang.Object) "hi!");
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement9.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) size2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement12.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement11.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 100L);
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement12.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement11.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.add(block10, (java.lang.Object) graphics2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D20", size2D10.equals(size2D20) ? size2D10.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement20.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean27 = borderArrangement20.equals((java.lang.Object) 0.0f);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement10.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement21.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement13.equals(obj19);
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement13.equals((java.lang.Object) (byte) 10);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = size2D18.getClass();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) size2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D18", size2D3.equals(size2D18) ? size2D3.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D14", size2D3.equals(size2D14) ? size2D3.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement8.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement8.arrangeNN(blockContainer15, graphics2D16);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) graphics2D16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = size2D16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D16", size2D10.equals(size2D16) ? size2D10.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean15 = borderArrangement11.equals((java.lang.Object) (byte) 0);
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement11.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement11.clear();
        boolean boolean22 = borderArrangement11.equals((java.lang.Object) true);
        borderArrangement11.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement11.equals(obj24);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement11.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block10, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D16", size2D8.equals(size2D16) ? size2D8.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D14", size2D8.equals(size2D14) ? size2D8.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement7.getClass();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D10", size2D4.equals(size2D10) ? size2D4.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement16.equals(obj22);
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement16.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block15, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean24 = borderArrangement20.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement20.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean29 = borderArrangement20.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement20.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement0.add(block19, (java.lang.Object) graphics2D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) (byte) 0);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement16.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement19.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 100.0d);
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement19.arrangeNN(blockContainer31, graphics2D32);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) blockContainer31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D10", size2D4.equals(size2D10) ? size2D4.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement17.equals(obj24);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement17.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) graphics2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement7.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement7.arrangeNN(blockContainer15, graphics2D16);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) size2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D18", size2D15.equals(size2D18) ? size2D15.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement8.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement8.add(block17, obj18);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement8.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block7, (java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement8.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) blockContainer17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean21 = borderArrangement17.equals((java.lang.Object) (byte) 0);
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement17.equals(obj24);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement17.arrangeNN(blockContainer27, graphics2D28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement17.arrangeNN(blockContainer30, graphics2D31);
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) graphics2D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) 0);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 0.0d);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement13.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D11", size2D4.equals(size2D11) ? size2D4.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 1);
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement11.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement11.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D10", size2D3.equals(size2D10) ? size2D3.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement14.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) 1.0f);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement14.equals(obj24);
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) 0L);
        borderArrangement14.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) 0);
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement11.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.add(block10, (java.lang.Object) blockContainer17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D17", size2D7.equals(size2D17) ? size2D7.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D13", size2D10.equals(size2D13) ? size2D10.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 100.0d);
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) (short) -1);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement11.equals(obj24);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement11.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement11.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) "");
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement18.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block17, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 100.0d);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D12", size2D7.equals(size2D12) ? size2D7.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 100.0d);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement13.getClass();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Class<?> wildcardClass20 = size2D19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D19", size2D12.equals(size2D19) ? size2D12.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (-1.0f));
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) 1.0f);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement12.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block11, (java.lang.Object) blockContainer23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D14", size2D3.equals(size2D14) ? size2D3.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D18", size2D15.equals(size2D18) ? size2D15.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D12", size2D7.equals(size2D12) ? size2D7.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass21 = borderArrangement11.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass16 = borderArrangement10.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D9", size2D3.equals(size2D9) ? size2D3.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement10.equals(obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement10.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement10.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement10.equals(obj22);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D6 and size2D11", size2D6.equals(size2D11) ? size2D6.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement9.arrangeNN(blockContainer11, graphics2D12);
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 10.0d);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement9.add(block17, obj18);
        boolean boolean20 = borderArrangement0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean10 = borderArrangement5.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement5.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement5.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement5.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement5.equals(obj17);
        borderArrangement5.clear();
        borderArrangement5.clear();
        borderArrangement5.clear();
        borderArrangement5.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement5", borderArrangement0.equals(borderArrangement5) ? borderArrangement0.hashCode() == borderArrangement5.hashCode() : true);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D13", size2D10.equals(size2D13) ? size2D10.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 10.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) 0);
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement9.add(block15, obj16);
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement9.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement9.arrangeNN(blockContainer22, graphics2D23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) blockContainer22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement13.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Class<?> wildcardClass12 = size2D11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement9.equals(obj15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement9.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement9.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement9.equals(obj21);
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement9.getClass();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement0.add(block17, obj18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean24 = borderArrangement20.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement20.add(block25, obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement20.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 10.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) 0.0f);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement19.arrangeNN(blockContainer20, graphics2D21);
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement19.equals(obj23);
        java.lang.Class<?> wildcardClass25 = borderArrangement19.getClass();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Class<?> wildcardClass20 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D19", size2D10.equals(size2D19) ? size2D10.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement16.add(block19, obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement16.arrangeNN(blockContainer22, graphics2D23);
        java.lang.Class<?> wildcardClass25 = size2D24.getClass();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) size2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D9 and size2D14", size2D9.equals(size2D14) ? size2D9.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement15.equals(obj21);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block14, (java.lang.Object) blockContainer24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) 100);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D15", size2D10.equals(size2D15) ? size2D10.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement19.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement19.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block18, (java.lang.Object) blockContainer24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement15.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass22 = borderArrangement15.getClass();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) (byte) 0);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement15.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement15.clear();
        boolean boolean26 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement15.add(block28, obj29);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement15.arrangeNN(blockContainer31, graphics2D32);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) blockContainer31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement6.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement6.equals(obj12);
        boolean boolean15 = borderArrangement6.equals((java.lang.Object) 100.0d);
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement6.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement6.clear();
        borderArrangement6.clear();
        java.lang.Class<?> wildcardClass22 = borderArrangement6.getClass();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        java.lang.Class<?> wildcardClass11 = size2D10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D6 and size2D10", size2D6.equals(size2D10) ? size2D6.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean24 = borderArrangement20.equals((java.lang.Object) (byte) 0);
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement20.arrangeNN(blockContainer26, graphics2D27);
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement20.add(block29, obj30);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.util.Size2D size2D37 = borderArrangement20.arrangeNN(blockContainer35, graphics2D36);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) size2D37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) 100L);
        borderArrangement16.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D12", size2D7.equals(size2D12) ? size2D7.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean13 = borderArrangement9.equals((java.lang.Object) (byte) 0);
        borderArrangement9.clear();
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement9.equals(obj15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement9.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.add(block8, (java.lang.Object) graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) (byte) 0);
        borderArrangement16.clear();
        boolean boolean23 = borderArrangement16.equals((java.lang.Object) 1L);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement16.arrangeNN(blockContainer25, graphics2D26);
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement16.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) graphics2D29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) 0);
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement14.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement12.equals(obj18);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) 100.0d);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement12.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement21.equals(obj27);
        boolean boolean30 = borderArrangement21.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement21.arrangeNN(blockContainer31, graphics2D32);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.util.Size2D size2D37 = borderArrangement21.arrangeNN(blockContainer35, graphics2D36);
        borderArrangement0.add(block20, (java.lang.Object) blockContainer35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = size2D15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) "");
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement9.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement9.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Class<?> wildcardClass12 = size2D11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D11", size2D3.equals(size2D11) ? size2D3.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D17", size2D12.equals(size2D17) ? size2D12.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) 0.0f);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement18.arrangeNN(blockContainer31, graphics2D32);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) size2D33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement14.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 10.0d);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D12", size2D7.equals(size2D12) ? size2D7.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean17 = borderArrangement10.equals((java.lang.Object) 0.0f);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement10.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) size2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) 100L);
        boolean boolean24 = borderArrangement13.equals((java.lang.Object) 1.0f);
        borderArrangement13.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D19", size2D8.equals(size2D19) ? size2D8.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) 0);
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement18.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) 100.0d);
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement8.arrangeNN(blockContainer18, graphics2D19);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) size2D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean17 = borderArrangement13.equals((java.lang.Object) (byte) 0);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement13.add(block22, obj23);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement13.arrangeNN(blockContainer30, graphics2D31);
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) graphics2D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean27 = borderArrangement23.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement23.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement23.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement23.arrangeNN(blockContainer32, graphics2D33);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) blockContainer32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement13.equals(obj19);
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) 100.0d);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement13.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D20", size2D10.equals(size2D20) ? size2D10.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) 0);
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement19.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement15.equals(obj21);
        boolean boolean24 = borderArrangement15.equals((java.lang.Object) 100.0d);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement15.arrangeNN(blockContainer28, graphics2D29);
        java.lang.Class<?> wildcardClass31 = borderArrangement15.getClass();
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement9.arrangeNN(blockContainer14, graphics2D15);
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 1.0f);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        boolean boolean22 = borderArrangement9.equals((java.lang.Object) 0L);
        boolean boolean24 = borderArrangement9.equals((java.lang.Object) false);
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement9.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block8, (java.lang.Object) graphics2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (-1.0f));
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement12.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement12.clear();
        java.lang.Class<?> wildcardClass24 = borderArrangement12.getClass();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement8.equals(obj14);
        boolean boolean17 = borderArrangement8.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement8.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement8.clear();
        boolean boolean23 = borderArrangement8.equals((java.lang.Object) (byte) 10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement12.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement12.clear();
        boolean boolean23 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) 100.0d);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement14.arrangeNN(blockContainer25, graphics2D26);
        java.lang.Class<?> wildcardClass28 = borderArrangement14.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D12", size2D8.equals(size2D12) ? size2D8.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean17 = borderArrangement8.equals((java.lang.Object) 100L);
        borderArrangement8.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        boolean boolean20 = borderArrangement11.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement11.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement18.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement10.equals(obj16);
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) 100.0d);
        borderArrangement10.clear();
        boolean boolean22 = borderArrangement10.equals((java.lang.Object) (short) -1);
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement10.equals(obj23);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement10.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement13.arrangeNN(blockContainer15, graphics2D16);
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) (short) 0);
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement18.equals(obj24);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement18.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement18.clear();
        boolean boolean33 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) 0);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement17.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement0.add(block16, (java.lang.Object) blockContainer22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean24 = borderArrangement15.equals((java.lang.Object) 100L);
        boolean boolean26 = borderArrangement15.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement15.add(block27, obj28);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement14.equals(obj23);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) -1);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (short) 10);
        borderArrangement13.clear();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        borderArrangement6.clear();
        boolean boolean10 = borderArrangement6.equals((java.lang.Object) (byte) 0);
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement6.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement6.clear();
        boolean boolean17 = borderArrangement6.equals((java.lang.Object) true);
        borderArrangement6.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement6.equals(obj19);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement13.equals(obj19);
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) 100.0d);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement13.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) 0);
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement19.add(block25, obj26);
        borderArrangement0.add(block18, obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) size2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean25 = borderArrangement21.equals((java.lang.Object) (byte) 0);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement21.arrangeNN(blockContainer27, graphics2D28);
        org.jfree.chart.block.Block block30 = null;
        java.lang.Object obj31 = null;
        borderArrangement21.add(block30, obj31);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.util.Size2D size2D38 = borderArrangement21.arrangeNN(blockContainer36, graphics2D37);
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) blockContainer36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement14.equals(obj23);
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement14.equals(obj27);
        borderArrangement14.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D6 and size2D9", size2D6.equals(size2D9) ? size2D6.hashCode() == size2D9.hashCode() : true);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean17 = borderArrangement13.equals((java.lang.Object) (byte) 0);
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement13.equals(obj20);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = size2D13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D13", size2D3.equals(size2D13) ? size2D3.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D15", size2D5.equals(size2D15) ? size2D5.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D17", size2D10.equals(size2D17) ? size2D10.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (short) 10);
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement18.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement7.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement7.clear();
        boolean boolean14 = borderArrangement7.equals((java.lang.Object) 10L);
        borderArrangement7.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (short) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement0.add(block17, obj18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeNN(blockContainer23, graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D22", size2D3.equals(size2D22) ? size2D3.hashCode() == size2D22.hashCode() : true);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) 0);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement12.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) size2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement12.equals(obj18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement12.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean24 = borderArrangement12.equals((java.lang.Object) 100);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement12.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) -1);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (-1.0f));
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement13.arrangeNN(blockContainer22, graphics2D23);
        java.lang.Class<?> wildcardClass25 = borderArrangement13.getClass();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) 0);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement0.add(block11, (java.lang.Object) graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D11 and size2D15", size2D11.equals(size2D15) ? size2D11.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 10);
        borderArrangement11.clear();
        borderArrangement11.clear();
        java.lang.Class<?> wildcardClass19 = borderArrangement11.getClass();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = size2D17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement12.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement12.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement0.add(block11, (java.lang.Object) blockContainer19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement13.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean21 = borderArrangement17.equals((java.lang.Object) (byte) 0);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement17.arrangeNN(blockContainer23, graphics2D24);
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement17.add(block26, obj27);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement17.arrangeNN(blockContainer31, graphics2D32);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) blockContainer31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Class<?> wildcardClass17 = size2D16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D16", size2D3.equals(size2D16) ? size2D3.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 100.0d);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean17 = borderArrangement13.equals((java.lang.Object) (byte) 0);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement13.clear();
        boolean boolean24 = borderArrangement13.equals((java.lang.Object) true);
        borderArrangement13.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement13.equals(obj26);
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement13.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) graphics2D29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D16", size2D8.equals(size2D16) ? size2D8.hashCode() == size2D16.hashCode() : true);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        borderArrangement6.clear();
        boolean boolean10 = borderArrangement6.equals((java.lang.Object) (byte) 0);
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement6.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement0.add(block5, (java.lang.Object) graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test923");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement13.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) size2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test924");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement14.add(block17, obj18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) size2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test925");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) (-1.0f));
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement13.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement13.arrangeNN(blockContainer26, graphics2D27);
        borderArrangement0.add(block12, (java.lang.Object) blockContainer26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test926");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D17", size2D12.equals(size2D17) ? size2D12.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test927");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement6.equals((java.lang.Object) (-1.0f));
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement6.equals((java.lang.Object) '4');
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test928");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeNN(blockContainer21, graphics2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D10 and size2D20", size2D10.equals(size2D20) ? size2D10.hashCode() == size2D20.hashCode() : true);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test929");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement16.add(block21, obj22);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test930");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D13", size2D8.equals(size2D13) ? size2D8.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test931");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement18.arrangeNN(blockContainer24, graphics2D25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement18.arrangeNN(blockContainer27, graphics2D28);
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) graphics2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test932");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = size2D18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D18", size2D3.equals(size2D18) ? size2D3.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test933");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) "");
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement10.getClass();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test934");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block3 = null;
        java.lang.Object obj4 = null;
        borderArrangement0.add(block3, obj4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) 100.0d);
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement8.equals(obj15);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test935");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D18", size2D15.equals(size2D18) ? size2D15.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test936");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        java.lang.Class<?> wildcardClass12 = size2D11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D11", size2D7.equals(size2D11) ? size2D7.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test937");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test938");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean23 = borderArrangement16.equals((java.lang.Object) 0.0f);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass30 = borderArrangement16.getClass();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) wildcardClass30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test939");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D11 and size2D14", size2D11.equals(size2D14) ? size2D11.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test940");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) 100L);
        boolean boolean29 = borderArrangement18.equals((java.lang.Object) 1.0f);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test941");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D18", size2D3.equals(size2D18) ? size2D3.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test942");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement8.equals(obj14);
        boolean boolean17 = borderArrangement8.equals((java.lang.Object) 100.0d);
        borderArrangement8.clear();
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement8.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement8.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) size2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test943");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) 100.0d);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement17.arrangeNN(blockContainer31, graphics2D32);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) graphics2D32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test944");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean23 = borderArrangement19.equals((java.lang.Object) (byte) 0);
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement19.arrangeNN(blockContainer25, graphics2D26);
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement19.add(block28, obj29);
        borderArrangement19.clear();
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test945");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement16.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement16.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) blockContainer25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test946");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement15.equals(obj21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement15.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement15.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) blockContainer28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test947");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) 0);
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement17.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block16, (java.lang.Object) graphics2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test948");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = size2D18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D18", size2D15.equals(size2D18) ? size2D15.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test949");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) "");
        boolean boolean9 = borderArrangement4.equals((java.lang.Object) (short) 10);
        boolean boolean11 = borderArrangement4.equals((java.lang.Object) (-1L));
        borderArrangement4.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement4.arrangeNN(blockContainer13, graphics2D14);
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) size2D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement4", borderArrangement0.equals(borderArrangement4) ? borderArrangement0.hashCode() == borderArrangement4.hashCode() : true);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test950");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test951");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement12.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) blockContainer20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test952");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D19", size2D15.equals(size2D19) ? size2D15.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test953");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement18.equals(obj24);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) 100.0d);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement18.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement18.equals(obj31);
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.util.Size2D size2D35 = borderArrangement18.arrangeNN(blockContainer33, graphics2D34);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test954");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test955");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D11", size2D3.equals(size2D11) ? size2D3.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test956");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) 0);
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (short) 1);
        borderArrangement7.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement7.getClass();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test957");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement6.equals((java.lang.Object) (short) 10);
        borderArrangement6.clear();
        borderArrangement6.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement6.getClass();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test958");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement21.equals(obj27);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement21.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement21.clear();
        borderArrangement21.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement21.equals(obj34);
        org.jfree.chart.block.Block block36 = null;
        java.lang.Object obj37 = null;
        borderArrangement21.add(block36, obj37);
        java.lang.Class<?> wildcardClass39 = borderArrangement21.getClass();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test959");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test960");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D10", size2D7.equals(size2D10) ? size2D7.hashCode() == size2D10.hashCode() : true);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test961");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) (byte) 0);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement16.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) graphics2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test962");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 10.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D4 and size2D13", size2D4.equals(size2D13) ? size2D4.hashCode() == size2D13.hashCode() : true);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test963");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean17 = borderArrangement13.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement13.arrangeNN(blockContainer18, graphics2D19);
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) size2D25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test964");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) 0);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement13.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement13.arrangeNN(blockContainer20, graphics2D21);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test965");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D18", size2D3.equals(size2D18) ? size2D3.hashCode() == size2D18.hashCode() : true);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test966");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) 1.0f);
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement12.equals(obj22);
        boolean boolean25 = borderArrangement12.equals((java.lang.Object) 0L);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement12.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement0.add(block11, (java.lang.Object) graphics2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test967");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement18.equals(obj24);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) 100.0d);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement18.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement18.equals(obj31);
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.util.Size2D size2D35 = borderArrangement18.arrangeNN(blockContainer33, graphics2D34);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test968");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement0.add(block17, obj18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        java.lang.Class<?> wildcardClass23 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D22", size2D3.equals(size2D22) ? size2D3.hashCode() == size2D22.hashCode() : true);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test969");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D5 and size2D15", size2D5.equals(size2D15) ? size2D5.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test970");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D15", size2D3.equals(size2D15) ? size2D3.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test971");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) 0);
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (short) 1);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement12.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement12.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement0.add(block11, (java.lang.Object) blockContainer23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test972");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) "");
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test973");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement12.add(block22, obj23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement12.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) graphics2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test974");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement11.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement11.arrangeNN(blockContainer22, graphics2D23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) graphics2D23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test975");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement11.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean18 = borderArrangement11.equals((java.lang.Object) 0.0f);
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement11.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement0.add(block10, (java.lang.Object) graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test976");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Class<?> wildcardClass20 = size2D19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D15 and size2D19", size2D15.equals(size2D19) ? size2D15.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test977");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) "");
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement18.arrangeNN(blockContainer25, graphics2D26);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) size2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test978");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement15.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement0.add(block14, (java.lang.Object) blockContainer24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test979");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement16.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement16.add(block24, obj25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement16.arrangeNN(blockContainer27, graphics2D28);
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test980");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean13 = borderArrangement9.equals((java.lang.Object) (byte) 0);
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement9.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement9.clear();
        boolean boolean20 = borderArrangement9.equals((java.lang.Object) true);
        borderArrangement9.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement9.equals(obj22);
        borderArrangement0.add(block8, obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test981");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D12", size2D3.equals(size2D12) ? size2D3.hashCode() == size2D12.hashCode() : true);
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test982");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean25 = borderArrangement21.equals((java.lang.Object) (byte) 0);
        borderArrangement21.clear();
        borderArrangement21.clear();
        java.lang.Object obj28 = null;
        boolean boolean29 = borderArrangement21.equals(obj28);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement21.arrangeNN(blockContainer31, graphics2D32);
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.util.Size2D size2D36 = borderArrangement21.arrangeNN(blockContainer34, graphics2D35);
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test983");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) 0);
        boolean boolean12 = borderArrangement7.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement7.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement7.add(block18, obj19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement7.arrangeNN(blockContainer21, graphics2D22);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) size2D23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test984");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement23.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean32 = borderArrangement23.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass33 = borderArrangement23.getClass();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test985");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) 100L);
        boolean boolean20 = borderArrangement9.equals((java.lang.Object) 1.0f);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement9.add(block22, obj23);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test986");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = size2D17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test987");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D11", size2D8.equals(size2D11) ? size2D8.hashCode() == size2D11.hashCode() : true);
    }

    @Test
    public void test988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test988");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) 0);
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement15.add(block21, obj22);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) block21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test989");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        java.lang.Class<?> wildcardClass15 = size2D14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D7 and size2D14", size2D7.equals(size2D14) ? size2D7.hashCode() == size2D14.hashCode() : true);
    }

    @Test
    public void test990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test990");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D8 and size2D17", size2D8.equals(size2D17) ? size2D8.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test991");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D19", size2D3.equals(size2D19) ? size2D3.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test992");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement21.equals(obj27);
        boolean boolean30 = borderArrangement21.equals((java.lang.Object) 100.0d);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement21.arrangeNN(blockContainer32, graphics2D33);
        java.lang.Class<?> wildcardClass35 = size2D34.getClass();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test993");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D17", size2D3.equals(size2D17) ? size2D3.hashCode() == size2D17.hashCode() : true);
    }

    @Test
    public void test994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test994");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) "");
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass22 = borderArrangement13.getClass();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test995");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement14.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean30 = borderArrangement14.equals((java.lang.Object) 0L);
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement14.getClass();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test996");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean17 = borderArrangement13.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement13.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement13.add(block21, obj22);
        borderArrangement0.add(block12, obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test997");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100L);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D3 and size2D19", size2D3.equals(size2D19) ? size2D3.hashCode() == size2D19.hashCode() : true);
    }

    @Test
    public void test998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test998");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) 0);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on size2D12 and size2D15", size2D12.equals(size2D15) ? size2D12.hashCode() == size2D15.hashCode() : true);
    }

    @Test
    public void test999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test999");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement16.equals(obj22);
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass26 = borderArrangement16.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }
}

