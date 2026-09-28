package org.apache.commons.math3.genetics;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        elitisticListPopulation13.setElitismRate((double) (byte) 1);
        int int18 = elitisticListPopulation13.getPopulationSize();
        elitisticListPopulation13.setPopulationLimit((int) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population24 = elitisticListPopulation23.nextGeneration();
        java.lang.String str25 = elitisticListPopulation23.toString();
        elitisticListPopulation23.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation30.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        elitisticListPopulation30.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation13.setPopulationLimit(2);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        int int19 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str20 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 1L);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        int int20 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double double24 = elitisticListPopulation23.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) (-1));
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation2.addChromosome(chromosome17);
        int int19 = elitisticListPopulation2.getPopulationLimit();
        int int20 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) -1);
        int int18 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation17.iterator();
        elitisticListPopulation17.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation24.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation24.addChromosome(chromosome26);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList28);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList30, (int) (byte) 1, (double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertNotNull(chromosomeList30);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(52);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population10 = elitisticListPopulation9.nextGeneration();
        double double11 = elitisticListPopulation9.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation9.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation9.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation9.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) '4');
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation20.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        java.lang.String str27 = elitisticListPopulation24.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation30.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        elitisticListPopulation30.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        int int38 = elitisticListPopulation24.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation24.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList39, (int) (short) 100, 10.0d);
        elitisticListPopulation20.setChromosomes(chromosomeList39);
        elitisticListPopulation17.setChromosomes(chromosomeList39);
        elitisticListPopulation2.setChromosomes(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(chromosomeList39);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        java.lang.String str9 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        int int20 = elitisticListPopulation6.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation6.iterator();
        int int22 = elitisticListPopulation6.getPopulationSize();
        elitisticListPopulation6.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation27.setPopulationLimit((int) (short) 1);
        double double30 = elitisticListPopulation27.getElitismRate();
        int int31 = elitisticListPopulation27.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        double double37 = elitisticListPopulation34.getElitismRate();
        elitisticListPopulation34.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray40 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, chromosomeArray40);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Population population49 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray40);
        org.junit.Assert.assertArrayEquals(chromosomeArray40, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(population49);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation2.getChromosomes();
        java.lang.String str21 = elitisticListPopulation2.toString();
        int int22 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation2.addChromosome(chromosome23);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation2.getChromosomes();
        double double18 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, 0.0d);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList24);
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(chromosomeList24);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (-1L));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, 100, (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, (int) (short) 1, 35.0d);
        double double10 = elitisticListPopulation9.getElitismRate();
        int int11 = elitisticListPopulation9.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        double double17 = elitisticListPopulation14.getElitismRate();
        elitisticListPopulation14.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        int int24 = elitisticListPopulation14.getPopulationSize();
        elitisticListPopulation14.setPopulationLimit(0);
        int int27 = elitisticListPopulation14.getPopulationLimit();
        elitisticListPopulation14.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList30);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation9.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeList32);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation29.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray32 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33, chromosomeArray32);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33);
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator37 = elitisticListPopulation20.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList38, 52, 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray32);
        org.junit.Assert.assertArrayEquals(chromosomeArray32, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator37);
        org.junit.Assert.assertNotNull(chromosomeList38);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 10, 1.0d);
        double double26 = elitisticListPopulation25.getElitismRate();
        double double27 = elitisticListPopulation25.getElitismRate();
        int int28 = elitisticListPopulation25.getPopulationSize();
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(1);
        int int20 = elitisticListPopulation2.getPopulationSize();
        double double21 = elitisticListPopulation2.getElitismRate();
        double double22 = elitisticListPopulation2.getElitismRate();
        double double23 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 100.0f);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeList3);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        java.lang.String str31 = elitisticListPopulation28.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        int int42 = elitisticListPopulation28.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor43 = elitisticListPopulation28.iterator();
        int int44 = elitisticListPopulation28.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation49 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList45, 4, 1.0d);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertArrayEquals(chromosomeArray37, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chromosomeList45);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation2.addChromosome(chromosome17);
        int int19 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation2.addChromosome(chromosome21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(population20);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, (int) '4', (double) (short) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        double double16 = elitisticListPopulation14.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation14.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, 10, (double) 32);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation20.spliterator();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation20.nextGeneration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(population22);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        int int19 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation2.iterator();
        double double22 = elitisticListPopulation2.getElitismRate();
        java.lang.String str23 = elitisticListPopulation2.toString();
        double double24 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation27.setPopulationLimit((int) (short) 1);
        double double30 = elitisticListPopulation27.getElitismRate();
        int int31 = elitisticListPopulation27.getPopulationSize();
        double double32 = elitisticListPopulation27.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation35.setPopulationLimit((int) (short) 1);
        double double38 = elitisticListPopulation35.getElitismRate();
        elitisticListPopulation35.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray41 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, chromosomeArray41);
        elitisticListPopulation35.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42);
        elitisticListPopulation35.setPopulationLimit(1);
        elitisticListPopulation35.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation35.addChromosome(chromosome49);
        int int51 = elitisticListPopulation35.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList52);
        elitisticListPopulation2.setChromosomes(chromosomeList52);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList55);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray41);
        org.junit.Assert.assertArrayEquals(chromosomeArray41, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(chromosomeList52);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chromosomeItor19);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        int int19 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chromosomeList20);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 52);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, 0.0d);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int int5 = elitisticListPopulation2.getPopulationLimit();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = population8.spliterator();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        double double7 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, 52, (double) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, (int) (short) 0, (double) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, (int) (byte) 100, (double) '#');
        elitisticListPopulation22.setPopulationLimit((int) '4');
        int int25 = elitisticListPopulation22.getPopulationLimit();
        elitisticListPopulation22.setPopulationLimit((int) ' ');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, (int) (byte) 100, (double) '4');
        double double34 = elitisticListPopulation33.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList35);
        elitisticListPopulation2.setChromosomes(chromosomeList35);
        int int38 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation19.setPopulationLimit((int) (short) 1);
        double double22 = elitisticListPopulation19.getElitismRate();
        elitisticListPopulation19.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray25 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, chromosomeArray25);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, (int) '4', (double) (short) 100);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        int int33 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation36.setPopulationLimit((int) (short) 1);
        double double39 = elitisticListPopulation36.getElitismRate();
        elitisticListPopulation36.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        elitisticListPopulation36.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation36.setPopulationLimit(1);
        elitisticListPopulation36.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population50 = elitisticListPopulation36.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation53.setPopulationLimit((int) (short) 1);
        double double56 = elitisticListPopulation53.getElitismRate();
        elitisticListPopulation53.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray59 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList60, chromosomeArray59);
        elitisticListPopulation53.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList60);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList60, (int) '4', (double) (short) 100);
        elitisticListPopulation36.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList60);
        int int67 = elitisticListPopulation36.getPopulationSize();
        int int68 = elitisticListPopulation36.getPopulationSize();
        double double69 = elitisticListPopulation36.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor70 = elitisticListPopulation36.iterator();
        int int71 = elitisticListPopulation36.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation74 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) (-1L));
        elitisticListPopulation74.setElitismRate((double) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList77 = elitisticListPopulation74.getChromosomes();
        elitisticListPopulation36.setChromosomes(chromosomeList77);
        elitisticListPopulation2.setChromosomes(chromosomeList77);
        org.apache.commons.math3.genetics.Population population80 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray25);
        org.junit.Assert.assertArrayEquals(chromosomeArray25, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray59);
        org.junit.Assert.assertArrayEquals(chromosomeArray59, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(chromosomeList77);
        org.junit.Assert.assertNotNull(population80);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, (int) (byte) 100, (double) '#');
        int int23 = elitisticListPopulation22.getPopulationLimit();
        elitisticListPopulation22.setPopulationLimit((-1));
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator26 = elitisticListPopulation22.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation2.getChromosomes();
        double double30 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator26);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeList29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 10, 1.0d);
        double double26 = elitisticListPopulation25.getElitismRate();
        java.lang.String str27 = elitisticListPopulation25.toString();
        int int28 = elitisticListPopulation25.getPopulationLimit();
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population10 = elitisticListPopulation9.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 1);
        double double19 = elitisticListPopulation16.getElitismRate();
        int int20 = elitisticListPopulation16.getPopulationSize();
        elitisticListPopulation16.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList23);
        elitisticListPopulation9.setChromosomes(chromosomeList23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        elitisticListPopulation28.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation9.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population47 = elitisticListPopulation46.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation53.setPopulationLimit((int) (short) 1);
        double double56 = elitisticListPopulation53.getElitismRate();
        int int57 = elitisticListPopulation53.getPopulationSize();
        elitisticListPopulation53.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation50.setChromosomes(chromosomeList60);
        elitisticListPopulation46.setChromosomes(chromosomeList60);
        elitisticListPopulation43.setChromosomes(chromosomeList60);
        elitisticListPopulation43.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList66);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList68 = elitisticListPopulation9.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor69 = elitisticListPopulation9.iterator();
        int int70 = elitisticListPopulation9.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList71 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertArrayEquals(chromosomeArray34, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeList66);
        org.junit.Assert.assertNotNull(chromosomeList68);
        org.junit.Assert.assertNotNull(chromosomeItor69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(chromosomeList71);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation11.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation11.addChromosome(chromosome16);
        double double18 = elitisticListPopulation11.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation11.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation11.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeList20);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 0, (double) 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList9, (int) '4', (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation12.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) (byte) 1, (double) 1.0f);
        double double17 = elitisticListPopulation16.getElitismRate();
        int int18 = elitisticListPopulation16.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation16.getChromosomes();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation16.nextGeneration();
        java.lang.String str21 = elitisticListPopulation16.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) 'a', (double) 100L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        elitisticListPopulation12.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation12.iterator();
        elitisticListPopulation12.setPopulationLimit((int) (short) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList25);
        org.apache.commons.math3.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation9.addChromosome(chromosome27);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator29 = elitisticListPopulation9.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation9.addChromosome(chromosome30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (-1L));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator29);
        org.junit.Assert.assertNotNull(chromosomeList35);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList17);
        int int19 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome20 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 1L);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((-1));
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation11.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator17 = elitisticListPopulation11.spliterator();
        int int18 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation21.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation21.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        double double29 = elitisticListPopulation26.getElitismRate();
        int int30 = elitisticListPopulation26.getPopulationSize();
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation26.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList33, (int) '4', (double) (byte) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor37 = elitisticListPopulation36.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList38);
        elitisticListPopulation11.setChromosomes(chromosomeList38);
        elitisticListPopulation11.setPopulationLimit((int) ' ');
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeItor37);
        org.junit.Assert.assertNotNull(chromosomeList38);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (int) (byte) 100, (double) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        double double8 = elitisticListPopulation5.getElitismRate();
        java.lang.String str9 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        elitisticListPopulation5.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation5.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        double double13 = elitisticListPopulation10.getElitismRate();
        elitisticListPopulation10.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(1);
        elitisticListPopulation10.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation10.addChromosome(chromosome24);
        int int26 = elitisticListPopulation10.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        java.lang.String str35 = elitisticListPopulation32.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation38.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray41 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, chromosomeArray41);
        elitisticListPopulation38.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42);
        int int46 = elitisticListPopulation32.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation32.addChromosome(chromosome47);
        int int49 = elitisticListPopulation32.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population50 = elitisticListPopulation32.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray51 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, chromosomeArray51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, (int) (byte) 100, (double) '4');
        double double57 = elitisticListPopulation56.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation32.setChromosomes(chromosomeList58);
        elitisticListPopulation2.setChromosomes(chromosomeList58);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation63 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation63.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray66 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList67 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, chromosomeArray66);
        elitisticListPopulation63.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation72 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, (int) (byte) 100, (double) '#');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList73 = elitisticListPopulation72.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList73, 100, (double) 1);
        elitisticListPopulation2.setChromosomes(chromosomeList73);
        java.lang.Class<?> wildcardClass78 = chromosomeList73.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeList29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray41);
        org.junit.Assert.assertArrayEquals(chromosomeArray41, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertNotNull(chromosomeArray51);
        org.junit.Assert.assertArrayEquals(chromosomeArray51, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 52.0d + "'", double57 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList58);
        org.junit.Assert.assertNotNull(chromosomeArray66);
        org.junit.Assert.assertArrayEquals(chromosomeArray66, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(chromosomeList73);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        elitisticListPopulation11.setPopulationLimit((int) '4');
        int int14 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((int) ' ');
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation11.nextGeneration();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation11.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        elitisticListPopulation7.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        elitisticListPopulation7.setPopulationLimit(1);
        elitisticListPopulation7.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, (int) (byte) 100, (double) '4');
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, 10, (double) (-1L));
        int int32 = elitisticListPopulation31.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        double double34 = elitisticListPopulation31.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 32.0d);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation29.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray32 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33, chromosomeArray32);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33);
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator37 = elitisticListPopulation20.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation42.setPopulationLimit((int) (short) 1);
        double double45 = elitisticListPopulation42.getElitismRate();
        int int46 = elitisticListPopulation42.getPopulationSize();
        elitisticListPopulation42.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation42.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList49, (int) '4', (double) (byte) 100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator53 = chromosomeList49.spliterator();
        elitisticListPopulation2.setChromosomes(chromosomeList49);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation2.getChromosomes();
        int int56 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray32);
        org.junit.Assert.assertArrayEquals(chromosomeArray32, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator37);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chromosomeList49);
        org.junit.Assert.assertNotNull(chromosomeSpliterator53);
        org.junit.Assert.assertNotNull(chromosomeList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) '4');
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        java.lang.String str9 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        int int20 = elitisticListPopulation6.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation6.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, (int) (short) 100, 10.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, (int) (short) 1, 0.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, 97, 10.0d);
        double double32 = elitisticListPopulation31.getElitismRate();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation31.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation31.getChromosomes();
        java.lang.Class<?> wildcardClass35 = chromosomeList34.getClass();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(3, (double) (byte) 100);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        java.lang.String str21 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) 'a', (double) 35);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        double double14 = elitisticListPopulation2.getElitismRate();
        int int15 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.lang.String str17 = elitisticListPopulation2.toString();
        double double18 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation21.setPopulationLimit((int) (short) 1);
        double double24 = elitisticListPopulation21.getElitismRate();
        int int25 = elitisticListPopulation21.getPopulationSize();
        elitisticListPopulation21.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation30.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        elitisticListPopulation30.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, (int) (short) 10, (double) (byte) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator41 = chromosomeList34.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        double double43 = elitisticListPopulation2.getElitismRate();
        double double44 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(1);
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        elitisticListPopulation13.setElitismRate((double) (byte) 1);
        int int18 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation13.addChromosome(chromosome19);
        elitisticListPopulation13.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        int int32 = elitisticListPopulation28.getPopulationSize();
        elitisticListPopulation28.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation25.setChromosomes(chromosomeList35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList35, 10, (double) (short) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator40 = chromosomeList35.spliterator();
        elitisticListPopulation13.setChromosomes(chromosomeList35);
        double double42 = elitisticListPopulation13.getElitismRate();
        elitisticListPopulation13.setPopulationLimit((int) (byte) -1);
        double double45 = elitisticListPopulation13.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeSpliterator40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation11.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation15.setPopulationLimit((int) (short) 1);
        double double18 = elitisticListPopulation15.getElitismRate();
        int int19 = elitisticListPopulation15.getPopulationSize();
        elitisticListPopulation15.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation15.getChromosomes();
        double double23 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        double double29 = elitisticListPopulation26.getElitismRate();
        int int30 = elitisticListPopulation26.getPopulationSize();
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation35.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        elitisticListPopulation35.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        double double43 = elitisticListPopulation26.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator44 = elitisticListPopulation26.spliterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray45 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, chromosomeArray45);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46);
        org.apache.commons.math3.genetics.Population population51 = elitisticListPopulation11.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeSpliterator44);
        org.junit.Assert.assertNotNull(chromosomeArray45);
        org.junit.Assert.assertArrayEquals(chromosomeArray45, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(population51);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList9, (int) '4', (double) (byte) 100);
        int int13 = elitisticListPopulation12.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation12.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation12.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation12.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        double double13 = elitisticListPopulation2.getElitismRate();
        double double14 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList15, (int) (byte) 100, (double) 100.0f);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = null;
        elitisticListPopulation18.setChromosomes(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList15);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        int int9 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, 10, (double) (short) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator17 = chromosomeList12.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) (byte) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator17);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population14 = elitisticListPopulation13.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList27);
        elitisticListPopulation13.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        double double35 = elitisticListPopulation32.getElitismRate();
        elitisticListPopulation32.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        double double44 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation2.addChromosome(chromosome46);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList48, (int) '4', (double) 10.0f);
        elitisticListPopulation51.setPopulationLimit(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        int int20 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        int int23 = elitisticListPopulation2.getPopulationSize();
        int int24 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        elitisticListPopulation2.setPopulationLimit(10);
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        java.lang.String str14 = elitisticListPopulation11.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation17.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation2.iterator();
        java.lang.String str27 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor28 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor28);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation19.setPopulationLimit((int) (short) 1);
        double double22 = elitisticListPopulation19.getElitismRate();
        elitisticListPopulation19.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray25 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, chromosomeArray25);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, (int) '4', (double) (short) 100);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        int int33 = elitisticListPopulation2.getPopulationSize();
        int int34 = elitisticListPopulation2.getPopulationSize();
        double double35 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator38 = elitisticListPopulation2.spliterator();
        java.lang.String str39 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray25);
        org.junit.Assert.assertArrayEquals(chromosomeArray25, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[null]" + "'", str39, "[null]");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, 100.0d);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, (int) ' ', (double) '4');
        double double25 = elitisticListPopulation24.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        int int32 = elitisticListPopulation28.getPopulationSize();
        elitisticListPopulation28.setElitismRate((double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation37.setPopulationLimit((int) (short) 1);
        java.lang.String str40 = elitisticListPopulation37.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation43.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray46 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, chromosomeArray46);
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation37.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation24.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList53, 2, 10.0d);
        java.lang.String str57 = elitisticListPopulation56.toString();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray46);
        org.junit.Assert.assertArrayEquals(chromosomeArray46, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 1L);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        double double18 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 10);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        double double9 = elitisticListPopulation6.getElitismRate();
        elitisticListPopulation6.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation6.setPopulationLimit(1);
        elitisticListPopulation6.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation6.addChromosome(chromosome20);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator22 = elitisticListPopulation6.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation6.iterator();
        int int24 = elitisticListPopulation6.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation6.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, 1, (double) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator22);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
        org.junit.Assert.assertNotNull(chromosomeList26);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        java.lang.String str12 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        int int15 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation18.setPopulationLimit((int) (short) 1);
        double double21 = elitisticListPopulation18.getElitismRate();
        int int22 = elitisticListPopulation18.getPopulationSize();
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation18.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation18.addChromosome(chromosome24);
        int int26 = elitisticListPopulation18.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population30 = elitisticListPopulation29.nextGeneration();
        double double31 = elitisticListPopulation29.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation18.setChromosomes(chromosomeList32);
        elitisticListPopulation2.setChromosomes(chromosomeList32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(population30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList32);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        int int20 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        int int23 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, (int) ' ', (double) '4');
        double double25 = elitisticListPopulation24.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        int int32 = elitisticListPopulation28.getPopulationSize();
        elitisticListPopulation28.setElitismRate((double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation37.setPopulationLimit((int) (short) 1);
        java.lang.String str40 = elitisticListPopulation37.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation43.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray46 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, chromosomeArray46);
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation37.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation24.setElitismRate((double) (short) 0);
        int int55 = elitisticListPopulation24.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation24.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray46);
        org.junit.Assert.assertArrayEquals(chromosomeArray46, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(1);
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation2.nextGeneration();
        java.lang.String str23 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[null]" + "'", str23, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(2);
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor4);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        int int25 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, 0.0d);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        elitisticListPopulation11.setPopulationLimit((int) '4');
        java.lang.String str14 = elitisticListPopulation11.toString();
        int int15 = elitisticListPopulation11.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation11.spliterator();
        int int17 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation11.addChromosome(chromosome18);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        int int18 = elitisticListPopulation2.getPopulationSize();
        int int19 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation2.addChromosome(chromosome22);
        int int24 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        int int28 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor29 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(chromosomeItor29);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation7.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList15, (int) (short) 1, (double) 10L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation18.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation18.getChromosomes();
        java.lang.String str21 = elitisticListPopulation18.toString();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation18.nextGeneration();
        java.lang.String str23 = elitisticListPopulation18.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList24);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertArrayEquals(chromosomeArray10, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeList26);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation2.nextGeneration();
        java.lang.String str22 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, 10.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, (int) '4', (double) (-1.0f));
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        java.lang.String str16 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation21.setPopulationLimit((int) (short) 1);
        double double24 = elitisticListPopulation21.getElitismRate();
        elitisticListPopulation21.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population40 = elitisticListPopulation39.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation46.setPopulationLimit((int) (short) 1);
        double double49 = elitisticListPopulation46.getElitismRate();
        int int50 = elitisticListPopulation46.getPopulationSize();
        elitisticListPopulation46.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation43.setChromosomes(chromosomeList53);
        elitisticListPopulation39.setChromosomes(chromosomeList53);
        elitisticListPopulation36.setChromosomes(chromosomeList53);
        elitisticListPopulation36.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList59);
        org.apache.commons.math3.genetics.Population population61 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation64.setPopulationLimit((int) (short) 1);
        double double67 = elitisticListPopulation64.getElitismRate();
        int int68 = elitisticListPopulation64.getPopulationSize();
        elitisticListPopulation64.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation73 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation73.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray76 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList77 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList77, chromosomeArray76);
        elitisticListPopulation73.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList77);
        elitisticListPopulation64.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList77);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator81 = elitisticListPopulation64.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList82 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList82);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation86 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList82, (int) (byte) 1, (double) (byte) -1);
        double double87 = elitisticListPopulation86.getElitismRate();
        elitisticListPopulation86.setPopulationLimit(0);
        elitisticListPopulation86.setPopulationLimit(2);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeList59);
        org.junit.Assert.assertNotNull(population61);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray76);
        org.junit.Assert.assertArrayEquals(chromosomeArray76, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator81);
        org.junit.Assert.assertNotNull(chromosomeList82);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setPopulationLimit(1);
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation15.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        double double27 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation24.setPopulationLimit(1);
        elitisticListPopulation24.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, (int) (byte) 100, (double) '4');
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation2.setElitismRate(0.0d);
        int int49 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((-1));
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation11.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation11.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator17 = elitisticListPopulation11.spliterator();
        java.lang.String str18 = elitisticListPopulation11.toString();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation11.addChromosome(chromosome13);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation11.spliterator();
        double double16 = elitisticListPopulation11.getElitismRate();
        java.lang.String str17 = elitisticListPopulation11.toString();
        int int18 = elitisticListPopulation11.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[null]" + "'", str17, "[null]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(1);
        java.lang.String str20 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        java.lang.String str22 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(chromosomeItor24);
        org.junit.Assert.assertNotNull(population25);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        int int18 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation25.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        double double35 = elitisticListPopulation32.getElitismRate();
        int int36 = elitisticListPopulation32.getPopulationSize();
        elitisticListPopulation32.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList39);
        elitisticListPopulation25.setChromosomes(chromosomeList39);
        elitisticListPopulation22.setChromosomes(chromosomeList39);
        elitisticListPopulation22.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation22.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = chromosomeList45.spliterator();
        elitisticListPopulation2.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation2.addChromosome(chromosome48);
        org.apache.commons.math3.genetics.Population population50 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList51);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
        org.junit.Assert.assertNotNull(population50);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) '4', (double) (byte) -1);
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        double double17 = elitisticListPopulation14.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation14.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation14.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        int int14 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int20 = elitisticListPopulation19.getPopulationSize();
        int int21 = elitisticListPopulation19.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        double double27 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation24.setPopulationLimit(1);
        elitisticListPopulation24.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, (int) (byte) 100, (double) '4');
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation48.setPopulationLimit((int) (short) 1);
        java.lang.String str51 = elitisticListPopulation48.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation54.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray57 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58, chromosomeArray57);
        elitisticListPopulation54.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        org.apache.commons.math3.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation48.addChromosome(chromosome62);
        elitisticListPopulation48.setPopulationLimit((int) '4');
        double double66 = elitisticListPopulation48.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation69 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation69.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray72 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList73 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList73, chromosomeArray72);
        elitisticListPopulation69.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList73);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator76 = elitisticListPopulation69.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList77 = elitisticListPopulation69.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation80 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList77, (int) (short) 1, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor81 = elitisticListPopulation80.iterator();
        org.apache.commons.math3.genetics.Population population82 = elitisticListPopulation80.nextGeneration();
        elitisticListPopulation80.setPopulationLimit((int) (byte) 0);
        java.lang.String str85 = elitisticListPopulation80.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList86 = elitisticListPopulation80.getChromosomes();
        elitisticListPopulation48.setChromosomes(chromosomeList86);
        elitisticListPopulation19.setChromosomes(chromosomeList86);
        elitisticListPopulation2.setChromosomes(chromosomeList86);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray57);
        org.junit.Assert.assertArrayEquals(chromosomeArray57, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray72);
        org.junit.Assert.assertArrayEquals(chromosomeArray72, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator76);
        org.junit.Assert.assertNotNull(chromosomeList77);
        org.junit.Assert.assertNotNull(chromosomeItor81);
        org.junit.Assert.assertNotNull(population82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "[]" + "'", str85, "[]");
        org.junit.Assert.assertNotNull(chromosomeList86);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        java.lang.String str11 = elitisticListPopulation8.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        int int22 = elitisticListPopulation8.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation8.iterator();
        int int24 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation30.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        elitisticListPopulation30.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, (int) '4', (double) (-1.0f));
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor42 = elitisticListPopulation2.iterator();
        int int43 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chromosomeList41);
        org.junit.Assert.assertNotNull(chromosomeItor42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        double double13 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray19 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, chromosomeArray19);
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        int int37 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator42 = elitisticListPopulation41.spliterator();
        int int43 = elitisticListPopulation41.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator44 = elitisticListPopulation41.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int48 = elitisticListPopulation47.getPopulationSize();
        int int49 = elitisticListPopulation47.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation52.setPopulationLimit((int) (short) 1);
        double double55 = elitisticListPopulation52.getElitismRate();
        elitisticListPopulation52.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray58 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList59, chromosomeArray58);
        elitisticListPopulation52.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList59);
        elitisticListPopulation52.setPopulationLimit(1);
        elitisticListPopulation52.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray66 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList67 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, chromosomeArray66);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation71 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, (int) (byte) 100, (double) '4');
        elitisticListPopulation52.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67);
        elitisticListPopulation47.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, 10, (double) (-1L));
        java.lang.String str77 = elitisticListPopulation76.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList78 = elitisticListPopulation76.getChromosomes();
        elitisticListPopulation41.setChromosomes(chromosomeList78);
        elitisticListPopulation2.setChromosomes(chromosomeList78);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray19);
        org.junit.Assert.assertArrayEquals(chromosomeArray19, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertArrayEquals(chromosomeArray31, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertNotNull(chromosomeSpliterator42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray58);
        org.junit.Assert.assertArrayEquals(chromosomeArray58, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(chromosomeArray66);
        org.junit.Assert.assertArrayEquals(chromosomeArray66, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[]" + "'", str77, "[]");
        org.junit.Assert.assertNotNull(chromosomeList78);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        double double18 = elitisticListPopulation2.getElitismRate();
        int int19 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int int21 = elitisticListPopulation2.getPopulationSize();
        int int22 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, 52, (-1.0d));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) (byte) 1, 35.0d);
        java.lang.String str24 = elitisticListPopulation23.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int28 = elitisticListPopulation27.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation27.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        double double37 = elitisticListPopulation34.getElitismRate();
        int int38 = elitisticListPopulation34.getPopulationSize();
        elitisticListPopulation34.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList41);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList41, 52, (-1.0d));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList41, (int) (byte) 1, 35.0d);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator49 = chromosomeList41.spliterator();
        elitisticListPopulation23.setChromosomes(chromosomeList41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chromosomeList29);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(chromosomeList41);
        org.junit.Assert.assertNotNull(chromosomeSpliterator49);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation13.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation13.getChromosomes();
        int int16 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation13.nextGeneration();
        int int18 = elitisticListPopulation13.getPopulationSize();
        elitisticListPopulation13.setPopulationLimit(2);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        java.lang.String str19 = elitisticListPopulation2.toString();
        double double20 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass22 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[null]" + "'", str19, "[null]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        int int7 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.lang.String str9 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        elitisticListPopulation12.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation12.setPopulationLimit(1);
        elitisticListPopulation12.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) ' ', (double) 'a');
        int int31 = elitisticListPopulation30.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population32 = elitisticListPopulation30.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation30.getChromosomes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertNotNull(chromosomeList33);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        int int9 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        int int14 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation17.setPopulationLimit((int) (short) 1);
        double double20 = elitisticListPopulation17.getElitismRate();
        int int21 = elitisticListPopulation17.getPopulationSize();
        double double22 = elitisticListPopulation17.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation25.setPopulationLimit((int) (short) 1);
        double double28 = elitisticListPopulation25.getElitismRate();
        int int29 = elitisticListPopulation25.getPopulationSize();
        elitisticListPopulation25.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor45 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor46 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation2.addChromosome(chromosome47);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertArrayEquals(chromosomeArray37, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertNotNull(chromosomeItor45);
        org.junit.Assert.assertNotNull(chromosomeItor46);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeItor7);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, 100.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation5.setPopulationLimit(1);
        elitisticListPopulation5.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome24 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(chromosomeList22);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) '#');
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationSize();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) ' ');
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        elitisticListPopulation11.setPopulationLimit((int) '4');
        java.lang.String str14 = elitisticListPopulation11.toString();
        int int15 = elitisticListPopulation11.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation11.spliterator();
        int int17 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, (int) (byte) 100, (double) '#');
        java.lang.String str30 = elitisticListPopulation29.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation33.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator40 = elitisticListPopulation33.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation33.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList41, (int) (short) 1, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor45 = elitisticListPopulation44.iterator();
        java.lang.String str46 = elitisticListPopulation44.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList47);
        elitisticListPopulation11.setChromosomes(chromosomeList47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome50 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator40);
        org.junit.Assert.assertNotNull(chromosomeList41);
        org.junit.Assert.assertNotNull(chromosomeItor45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertNotNull(chromosomeList47);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass20 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 52, (double) 100.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 52, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation8.iterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) -1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) (byte) 10);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, 0.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        elitisticListPopulation12.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation12.setPopulationLimit(1);
        elitisticListPopulation12.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation12.nextGeneration();
        double double27 = elitisticListPopulation12.getElitismRate();
        double double28 = elitisticListPopulation12.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int32 = elitisticListPopulation31.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation31.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation38.setPopulationLimit((int) (short) 1);
        double double41 = elitisticListPopulation38.getElitismRate();
        int int42 = elitisticListPopulation38.getPopulationSize();
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation31.setChromosomes(chromosomeList45);
        elitisticListPopulation12.setChromosomes(chromosomeList45);
        elitisticListPopulation12.setElitismRate((double) (byte) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor50 = elitisticListPopulation12.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList51);
        int int53 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeItor50);
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, (double) 10);
        java.lang.String str3 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        double double18 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int22 = elitisticListPopulation21.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation21.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        int int32 = elitisticListPopulation28.getPopulationSize();
        elitisticListPopulation28.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList35);
        elitisticListPopulation2.setChromosomes(chromosomeList35);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        int int40 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation13.setPopulationLimit((int) (byte) 10);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation13.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation13.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, (int) ' ', (double) '4');
        double double25 = elitisticListPopulation24.getElitismRate();
        java.lang.String str26 = elitisticListPopulation24.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation24.iterator();
        double double28 = elitisticListPopulation24.getElitismRate();
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation24.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
        org.junit.Assert.assertNotNull(population29);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, 4, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        int int9 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        int int14 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation17.setPopulationLimit((int) (short) 1);
        double double20 = elitisticListPopulation17.getElitismRate();
        int int21 = elitisticListPopulation17.getPopulationSize();
        double double22 = elitisticListPopulation17.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation25.setPopulationLimit((int) (short) 1);
        double double28 = elitisticListPopulation25.getElitismRate();
        int int29 = elitisticListPopulation25.getPopulationSize();
        elitisticListPopulation25.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation2.getChromosomes();
        java.lang.String str45 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertArrayEquals(chromosomeArray37, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        elitisticListPopulation2.setPopulationLimit((-1));
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        double double13 = elitisticListPopulation10.getElitismRate();
        elitisticListPopulation10.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(1);
        elitisticListPopulation10.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation10.addChromosome(chromosome24);
        int int26 = elitisticListPopulation10.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList29, (int) (short) 100, 97.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList29, (int) (short) 100, (double) (short) 10);
        java.lang.Class<?> wildcardClass36 = elitisticListPopulation35.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeList29);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(1);
        double double8 = elitisticListPopulation2.getElitismRate();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.lang.String str16 = elitisticListPopulation2.toString();
        java.lang.String str17 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation21.setPopulationLimit((int) (short) 1);
        java.lang.String str24 = elitisticListPopulation21.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation27.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        java.lang.String str35 = elitisticListPopulation21.toString();
        java.lang.String str36 = elitisticListPopulation21.toString();
        int int37 = elitisticListPopulation21.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor38 = elitisticListPopulation21.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation21.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation42.setPopulationLimit((int) (short) 1);
        double double45 = elitisticListPopulation42.getElitismRate();
        int int46 = elitisticListPopulation42.getPopulationSize();
        org.apache.commons.math3.genetics.Population population47 = elitisticListPopulation42.nextGeneration();
        int int48 = elitisticListPopulation42.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation42.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList49, (int) '4', (double) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList49, 52, (double) (-1.0f));
        elitisticListPopulation21.setChromosomes(chromosomeList49);
        elitisticListPopulation2.setChromosomes(chromosomeList49);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList49, (int) (short) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor38);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(chromosomeList49);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(10);
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        int int11 = elitisticListPopulation7.getPopulationSize();
        elitisticListPopulation7.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray19 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, chromosomeArray19);
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, 97, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, (int) '4', (double) (byte) 0);
        java.lang.String str31 = elitisticListPopulation30.toString();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray19);
        org.junit.Assert.assertArrayEquals(chromosomeArray19, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        double double19 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) (byte) 10);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        double double9 = elitisticListPopulation6.getElitismRate();
        int int10 = elitisticListPopulation6.getPopulationSize();
        elitisticListPopulation6.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation6.getChromosomes();
        double double14 = elitisticListPopulation6.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation17.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        double double27 = elitisticListPopulation24.getElitismRate();
        int int28 = elitisticListPopulation24.getPopulationSize();
        elitisticListPopulation24.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList31);
        elitisticListPopulation17.setChromosomes(chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation36.setPopulationLimit((int) (short) 1);
        double double39 = elitisticListPopulation36.getElitismRate();
        elitisticListPopulation36.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        elitisticListPopulation36.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        double double48 = elitisticListPopulation6.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList49);
        int int51 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        double double13 = elitisticListPopulation10.getElitismRate();
        elitisticListPopulation10.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(1);
        elitisticListPopulation10.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation10.addChromosome(chromosome24);
        int int26 = elitisticListPopulation10.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation2.addChromosome(chromosome31);
        org.apache.commons.math3.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation2.addChromosome(chromosome33);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator36 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(chromosomeSpliterator36);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator24 = population23.spliterator();
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(chromosomeSpliterator24);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, 100.0d);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((-1));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        int int16 = elitisticListPopulation13.getPopulationLimit();
        int int17 = elitisticListPopulation13.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation13.nextGeneration();
        java.lang.Class<?> wildcardClass19 = elitisticListPopulation13.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[null]" + "'", str6, "[null]");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        double double19 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        double double22 = elitisticListPopulation2.getElitismRate();
        java.lang.String str23 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        double double29 = elitisticListPopulation26.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation26.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList30, (int) 'a', (double) 100L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation36.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList38, (int) (byte) 100, (double) (short) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation44.setPopulationLimit((int) (short) 1);
        double double47 = elitisticListPopulation44.getElitismRate();
        int int48 = elitisticListPopulation44.getPopulationSize();
        elitisticListPopulation44.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation44.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList51, (int) '4', (double) (byte) 100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator55 = chromosomeList51.spliterator();
        elitisticListPopulation41.setChromosomes(chromosomeList51);
        elitisticListPopulation33.setChromosomes(chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList51, 97, 0.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population65 = elitisticListPopulation64.nextGeneration();
        double double66 = elitisticListPopulation64.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor67 = elitisticListPopulation64.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList68 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList68);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[null]" + "'", str23, "[null]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertNotNull(chromosomeSpliterator55);
        org.junit.Assert.assertNotNull(population65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor67);
        org.junit.Assert.assertNotNull(chromosomeList68);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) (byte) 10, (double) (short) 10);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = chromosomeList8.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) (short) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation2.spliterator();
        int int20 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        java.lang.String str9 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        int int20 = elitisticListPopulation6.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation6.iterator();
        int int22 = elitisticListPopulation6.getPopulationSize();
        elitisticListPopulation6.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation27.setPopulationLimit((int) (short) 1);
        double double30 = elitisticListPopulation27.getElitismRate();
        int int31 = elitisticListPopulation27.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        double double37 = elitisticListPopulation34.getElitismRate();
        elitisticListPopulation34.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray40 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, chromosomeArray40);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        double double47 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation2.addChromosome(chromosome48);
        org.apache.commons.math3.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation2.addChromosome(chromosome50);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray40);
        org.junit.Assert.assertArrayEquals(chromosomeArray40, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.lang.String str18 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[null]" + "'", str18, "[null]");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        double double13 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = chromosomeList14.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation19.setPopulationLimit((int) (short) 1);
        double double22 = elitisticListPopulation19.getElitismRate();
        elitisticListPopulation19.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray25 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, chromosomeArray25);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, (int) '4', (double) (short) 100);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        int int33 = elitisticListPopulation2.getPopulationSize();
        int int34 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population36 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation39.setPopulationLimit((int) (short) 1);
        java.lang.String str42 = elitisticListPopulation39.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation45.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray48 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49, chromosomeArray48);
        elitisticListPopulation45.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49);
        elitisticListPopulation39.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49);
        org.apache.commons.math3.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation39.addChromosome(chromosome53);
        java.lang.String str55 = elitisticListPopulation39.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList56 = elitisticListPopulation39.getChromosomes();
        int int57 = elitisticListPopulation39.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = elitisticListPopulation39.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList58, (int) (byte) 1, (double) 32);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList58, 32, (double) 100.0f);
        elitisticListPopulation2.setChromosomes(chromosomeList58);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation69 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population70 = elitisticListPopulation69.nextGeneration();
        double double71 = elitisticListPopulation69.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList72 = elitisticListPopulation69.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList73 = elitisticListPopulation69.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList73, (int) 'a', (double) 100.0f);
        elitisticListPopulation2.setChromosomes(chromosomeList73);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray25);
        org.junit.Assert.assertArrayEquals(chromosomeArray25, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray48);
        org.junit.Assert.assertArrayEquals(chromosomeArray48, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[null]" + "'", str55, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(chromosomeList58);
        org.junit.Assert.assertNotNull(chromosomeList66);
        org.junit.Assert.assertNotNull(population70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList72);
        org.junit.Assert.assertNotNull(chromosomeList73);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList11, 35, 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit(10);
        int int21 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 10.0f);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        int int14 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome15 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setPopulationLimit(35);
        java.lang.String str16 = elitisticListPopulation2.toString();
        java.lang.String str17 = elitisticListPopulation2.toString();
        double double18 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (int) (byte) 100, (double) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (int) '4', (-1.0d));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (int) (short) 1, (double) 100);
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        double double6 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit(52);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 52);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(1);
        org.apache.commons.math3.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation5.addChromosome(chromosome23);
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation5.nextGeneration();
        java.lang.String str26 = elitisticListPopulation5.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[null]" + "'", str26, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList27);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, (double) (byte) -1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList9, (int) 'a', 1.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation12.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) ' ', (double) (short) 1);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        int int11 = elitisticListPopulation7.getPopulationSize();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation7.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation15.setPopulationLimit((int) (short) 1);
        double double18 = elitisticListPopulation15.getElitismRate();
        elitisticListPopulation15.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation15.setPopulationLimit(1);
        elitisticListPopulation15.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation15.addChromosome(chromosome29);
        int int31 = elitisticListPopulation15.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        java.lang.String str37 = elitisticListPopulation34.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation40.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray43 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, chromosomeArray43);
        elitisticListPopulation40.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation34.addChromosome(chromosome48);
        java.lang.String str50 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation15.setChromosomes(chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList51, 35, (double) 10L);
        elitisticListPopulation7.setChromosomes(chromosomeList51);
        elitisticListPopulation2.setChromosomes(chromosomeList51);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray43);
        org.junit.Assert.assertArrayEquals(chromosomeArray43, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[null]" + "'", str50, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList51);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, (int) ' ', (double) '4');
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation24.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation24.iterator();
        int int27 = elitisticListPopulation24.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation24.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) '4');
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        int int22 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor23);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        java.lang.String str9 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        java.lang.String str20 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation6.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation25.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator32 = elitisticListPopulation25.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList33, (int) (short) 1, (double) 10L);
        elitisticListPopulation6.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList33, (int) 'a', (double) (short) 100);
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        int int42 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator32);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation2.addChromosome(chromosome17);
        int int19 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation23.setPopulationLimit((int) (short) 1);
        double double26 = elitisticListPopulation23.getElitismRate();
        elitisticListPopulation23.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        elitisticListPopulation23.setPopulationLimit(1);
        elitisticListPopulation23.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation23.addChromosome(chromosome37);
        int int39 = elitisticListPopulation23.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation23.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList40, (int) (byte) 100, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor44 = elitisticListPopulation43.iterator();
        java.lang.String str45 = elitisticListPopulation43.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation48.setPopulationLimit((int) (short) 1);
        double double51 = elitisticListPopulation48.getElitismRate();
        elitisticListPopulation48.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray54 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55, chromosomeArray54);
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55);
        elitisticListPopulation48.setPopulationLimit(1);
        elitisticListPopulation48.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population62 = elitisticListPopulation48.nextGeneration();
        double double63 = elitisticListPopulation48.getElitismRate();
        double double64 = elitisticListPopulation48.getElitismRate();
        int int65 = elitisticListPopulation48.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator66 = elitisticListPopulation48.spliterator();
        int int67 = elitisticListPopulation48.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList68 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation43.setChromosomes(chromosomeList68);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation72 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList68, 1, (double) 10L);
        elitisticListPopulation2.setChromosomes(chromosomeList68);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertArrayEquals(chromosomeArray29, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertNotNull(chromosomeItor44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[null]" + "'", str45, "[null]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray54);
        org.junit.Assert.assertArrayEquals(chromosomeArray54, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(population62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(chromosomeList68);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        elitisticListPopulation7.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        elitisticListPopulation7.setPopulationLimit(1);
        elitisticListPopulation7.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, (int) (byte) 100, (double) '4');
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, 10, (double) (-1L));
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = elitisticListPopulation31.spliterator();
        elitisticListPopulation31.setPopulationLimit((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 10, 1.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 3, 0.0d);
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation28.addChromosome(chromosome29);
        elitisticListPopulation28.setPopulationLimit(35);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        java.lang.String str10 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((-1));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation15.setPopulationLimit((int) (short) 1);
        double double18 = elitisticListPopulation15.getElitismRate();
        int int19 = elitisticListPopulation15.getPopulationSize();
        double double20 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation23.setPopulationLimit((int) (short) 1);
        double double26 = elitisticListPopulation23.getElitismRate();
        elitisticListPopulation23.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        elitisticListPopulation23.setPopulationLimit(1);
        elitisticListPopulation23.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation23.addChromosome(chromosome37);
        int int39 = elitisticListPopulation23.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation15.setChromosomes(chromosomeList40);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation15.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation45.setPopulationLimit((int) (short) 1);
        java.lang.String str48 = elitisticListPopulation45.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation51.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray54 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55, chromosomeArray54);
        elitisticListPopulation51.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55);
        elitisticListPopulation45.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55);
        int int59 = elitisticListPopulation45.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation45.addChromosome(chromosome60);
        int int62 = elitisticListPopulation45.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population63 = elitisticListPopulation45.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray64 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList65 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65, chromosomeArray64);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation69 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65, (int) (byte) 100, (double) '4');
        double double70 = elitisticListPopulation69.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList71 = elitisticListPopulation69.getChromosomes();
        elitisticListPopulation45.setChromosomes(chromosomeList71);
        elitisticListPopulation15.setChromosomes(chromosomeList71);
        elitisticListPopulation2.setChromosomes(chromosomeList71);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation77 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population78 = elitisticListPopulation77.nextGeneration();
        double double79 = elitisticListPopulation77.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList80 = elitisticListPopulation77.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList81 = elitisticListPopulation77.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList82 = elitisticListPopulation77.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation85 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList82, (int) (byte) 10, 0.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList82);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation89 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList82, (int) (short) 10, (double) 0L);
        elitisticListPopulation89.setPopulationLimit(3);
        elitisticListPopulation89.setElitismRate((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertArrayEquals(chromosomeArray29, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray54);
        org.junit.Assert.assertArrayEquals(chromosomeArray54, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertNotNull(chromosomeArray64);
        org.junit.Assert.assertArrayEquals(chromosomeArray64, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 52.0d + "'", double70 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList71);
        org.junit.Assert.assertNotNull(population78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList80);
        org.junit.Assert.assertNotNull(chromosomeList81);
        org.junit.Assert.assertNotNull(chromosomeList82);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        double double11 = elitisticListPopulation8.getElitismRate();
        elitisticListPopulation8.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        elitisticListPopulation8.setPopulationLimit(1);
        elitisticListPopulation8.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation8.setPopulationLimit((int) (byte) 10);
        java.lang.String str25 = elitisticListPopulation8.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, 2, (double) 1L);
        int int31 = elitisticListPopulation30.getPopulationSize();
        elitisticListPopulation30.setPopulationLimit(2);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation39.setPopulationLimit((int) (short) 1);
        double double42 = elitisticListPopulation39.getElitismRate();
        int int43 = elitisticListPopulation39.getPopulationSize();
        elitisticListPopulation39.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation39.getChromosomes();
        elitisticListPopulation36.setChromosomes(chromosomeList46);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList46, 10, (double) (short) 0);
        elitisticListPopulation30.setChromosomes(chromosomeList46);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList46, (int) 'a', (double) 10L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation54.getChromosomes();
        java.lang.String str56 = elitisticListPopulation54.toString();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chromosomeList46);
        org.junit.Assert.assertNotNull(chromosomeList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) (byte) 1, (double) (-1));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) (byte) 10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome23 = elitisticListPopulation22.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (-1L));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, 100, (double) (-1.0f));
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation6.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation10.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation10.addChromosome(chromosome12);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList14);
        java.lang.Class<?> wildcardClass16 = elitisticListPopulation6.getClass();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) (byte) 10);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        elitisticListPopulation2.setPopulationLimit(97);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int10 = elitisticListPopulation9.getPopulationSize();
        int int11 = elitisticListPopulation9.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        double double17 = elitisticListPopulation14.getElitismRate();
        elitisticListPopulation14.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        elitisticListPopulation14.setPopulationLimit(1);
        elitisticListPopulation14.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, (int) (byte) 100, (double) '4');
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 10, (double) (-1L));
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation38.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList40, (int) (short) 10, 0.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList40);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation47.setPopulationLimit((int) (short) 1);
        double double50 = elitisticListPopulation47.getElitismRate();
        int int51 = elitisticListPopulation47.getPopulationSize();
        org.apache.commons.math3.genetics.Population population52 = elitisticListPopulation47.nextGeneration();
        int int53 = elitisticListPopulation47.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList54 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList54);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(population52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(chromosomeList54);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        elitisticListPopulation12.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation12.setPopulationLimit(1);
        elitisticListPopulation12.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) ' ', (double) 'a');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, 2, (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        int int9 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, 1, 10.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation17.getChromosomes();
        double double20 = elitisticListPopulation17.getElitismRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation22.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation29.setPopulationLimit((int) (short) 1);
        double double32 = elitisticListPopulation29.getElitismRate();
        int int33 = elitisticListPopulation29.getPopulationSize();
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList36);
        elitisticListPopulation22.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        int int40 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation44.setPopulationLimit((int) (short) 1);
        double double47 = elitisticListPopulation44.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int51 = elitisticListPopulation50.getPopulationSize();
        int int52 = elitisticListPopulation50.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation55.setPopulationLimit((int) (short) 1);
        double double58 = elitisticListPopulation55.getElitismRate();
        elitisticListPopulation55.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray61 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62, chromosomeArray61);
        elitisticListPopulation55.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62);
        elitisticListPopulation55.setPopulationLimit(1);
        elitisticListPopulation55.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray69 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList70 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList70, chromosomeArray69);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation74 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList70, (int) (byte) 100, (double) '4');
        elitisticListPopulation55.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList70);
        elitisticListPopulation50.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList70);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator77 = chromosomeList70.spliterator();
        elitisticListPopulation44.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList70);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList70);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList82 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(chromosomeList41);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray61);
        org.junit.Assert.assertArrayEquals(chromosomeArray61, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(chromosomeArray69);
        org.junit.Assert.assertArrayEquals(chromosomeArray69, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator77);
        org.junit.Assert.assertNotNull(chromosomeList82);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) 10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation5.setPopulationLimit(1);
        double double17 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation5.nextGeneration();
        int int19 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList20, 97, (double) ' ');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chromosomeList20);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation13.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation13.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (byte) 100, (double) '#');
        int int34 = elitisticListPopulation33.getPopulationLimit();
        elitisticListPopulation33.setPopulationLimit((-1));
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator37 = elitisticListPopulation33.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList38);
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        int int41 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator37);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', 35.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        java.lang.String str8 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation5.addChromosome(chromosome19);
        java.lang.String str21 = elitisticListPopulation5.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation5.getChromosomes();
        int int23 = elitisticListPopulation5.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList24, (int) (byte) 1, (double) 32);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation30.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList31, 10, (double) (byte) 0);
        elitisticListPopulation27.setChromosomes(chromosomeList31);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[null]" + "'", str21, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertNotNull(chromosomeList36);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        elitisticListPopulation13.setElitismRate((double) (byte) 1);
        int int18 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation13.addChromosome(chromosome19);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation13.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome22 = elitisticListPopulation13.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        int int14 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) 'a', (double) 100L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation12.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, (int) (byte) 100, (double) (short) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation20.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList27, (int) '4', (double) (byte) 100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = chromosomeList27.spliterator();
        elitisticListPopulation17.setChromosomes(chromosomeList27);
        elitisticListPopulation9.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList27, 97, 0.0d);
        int int37 = elitisticListPopulation36.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation36.setElitismRate((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList17);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        int int20 = elitisticListPopulation2.getPopulationSize();
        int int21 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        int int8 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        double double19 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        double double21 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        java.lang.String str23 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setPopulationLimit(35);
        java.lang.String str16 = elitisticListPopulation2.toString();
        java.lang.String str17 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        int int19 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = chromosomeList16.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 52);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationSize();
        elitisticListPopulation11.setPopulationLimit(1);
        double double15 = elitisticListPopulation11.getElitismRate();
        elitisticListPopulation11.setElitismRate((double) 1L);
        int int18 = elitisticListPopulation11.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 10, 1.0d);
        double double26 = elitisticListPopulation25.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation29.setPopulationLimit((int) (short) 1);
        double double32 = elitisticListPopulation29.getElitismRate();
        elitisticListPopulation29.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation29.setPopulationLimit(1);
        elitisticListPopulation29.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation29.addChromosome(chromosome43);
        elitisticListPopulation29.setElitismRate((double) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation25.setChromosomes(chromosomeList47);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation25.getChromosomes();
        int int50 = elitisticListPopulation25.getPopulationSize();
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chromosomeList47);
        org.junit.Assert.assertNotNull(chromosomeList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation9.setPopulationLimit(1);
        elitisticListPopulation9.setElitismRate((double) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator23 = elitisticListPopulation9.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = elitisticListPopulation26.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation26.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList34, (int) (short) 1, (double) 10L);
        int int38 = elitisticListPopulation37.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator39 = elitisticListPopulation37.spliterator();
        elitisticListPopulation37.setElitismRate((double) (byte) 1);
        int int42 = elitisticListPopulation37.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation37.addChromosome(chromosome43);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor45 = elitisticListPopulation37.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation37.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList46);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator23);
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertArrayEquals(chromosomeArray29, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor45);
        org.junit.Assert.assertNotNull(chromosomeList46);
        org.junit.Assert.assertNotNull(chromosomeList48);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) '4', (double) (-1.0f));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation11.setPopulationLimit((int) (short) 0);
        int int15 = elitisticListPopulation11.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList4, (int) (byte) 100, (double) (short) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        double double13 = elitisticListPopulation10.getElitismRate();
        int int14 = elitisticListPopulation10.getPopulationSize();
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation10.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, (int) '4', (double) (byte) 100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = chromosomeList17.spliterator();
        elitisticListPopulation7.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, 1, (double) 97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, (int) (byte) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        int int11 = elitisticListPopulation7.getPopulationSize();
        elitisticListPopulation7.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation16.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray19 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, chromosomeArray19);
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation2.nextGeneration();
        java.lang.String str26 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population27 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray19);
        org.junit.Assert.assertArrayEquals(chromosomeArray19, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(population27);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        elitisticListPopulation2.setPopulationLimit(10);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str17 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        int int25 = elitisticListPopulation20.getPopulationSize();
        java.lang.String str26 = elitisticListPopulation20.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[null, null]" + "'", str17, "[null, null]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeList27);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        int int16 = elitisticListPopulation12.getPopulationSize();
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList19);
        elitisticListPopulation5.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 10, 1.0d);
        double double26 = elitisticListPopulation25.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation25.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList27, (int) (short) 100, (double) '4');
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList27);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, (int) (byte) 100, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        int int23 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        int int20 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor25 = elitisticListPopulation2.iterator();
        int int26 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(3, (double) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        double double4 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        double double18 = elitisticListPopulation2.getElitismRate();
        int int19 = elitisticListPopulation2.getPopulationSize();
        int int20 = elitisticListPopulation2.getPopulationLimit();
        double double21 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        elitisticListPopulation11.setPopulationLimit((int) '4');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation11.setPopulationLimit((int) (short) 100);
        int int17 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation11.addChromosome(chromosome18);
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation11.addChromosome(chromosome20);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation11.iterator();
        double double23 = elitisticListPopulation11.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(population20);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int int10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 52);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        int int19 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int23 = elitisticListPopulation22.getPopulationSize();
        int int24 = elitisticListPopulation22.getPopulationLimit();
        int int25 = elitisticListPopulation22.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int29 = elitisticListPopulation28.getPopulationSize();
        int int30 = elitisticListPopulation28.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation33.setPopulationLimit((int) (short) 1);
        double double36 = elitisticListPopulation33.getElitismRate();
        elitisticListPopulation33.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray39 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, chromosomeArray39);
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40);
        elitisticListPopulation33.setPopulationLimit(1);
        elitisticListPopulation33.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray47 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, chromosomeArray47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, (int) (byte) 100, (double) '4');
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator55 = chromosomeList48.spliterator();
        elitisticListPopulation22.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation59.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray62 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, chromosomeArray62);
        elitisticListPopulation59.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, (int) (byte) 100, (double) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation71 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, (int) '4', (double) (byte) -1);
        org.apache.commons.math3.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation71.addChromosome(chromosome72);
        double double74 = elitisticListPopulation71.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator75 = elitisticListPopulation71.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList76 = elitisticListPopulation71.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList76);
        elitisticListPopulation2.setChromosomes(chromosomeList76);
        double double79 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray39);
        org.junit.Assert.assertArrayEquals(chromosomeArray39, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chromosomeArray47);
        org.junit.Assert.assertArrayEquals(chromosomeArray47, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator55);
        org.junit.Assert.assertNotNull(chromosomeArray62);
        org.junit.Assert.assertArrayEquals(chromosomeArray62, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeSpliterator75);
        org.junit.Assert.assertNotNull(chromosomeList76);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        double double8 = elitisticListPopulation5.getElitismRate();
        int int9 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        int int14 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation17.setPopulationLimit((int) (short) 1);
        double double20 = elitisticListPopulation17.getElitismRate();
        int int21 = elitisticListPopulation17.getPopulationSize();
        double double22 = elitisticListPopulation17.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation25.setPopulationLimit((int) (short) 1);
        double double28 = elitisticListPopulation25.getElitismRate();
        int int29 = elitisticListPopulation25.getPopulationSize();
        elitisticListPopulation25.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation34.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator44 = chromosomeList38.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, 32, 0.0d);
        java.lang.String str48 = elitisticListPopulation47.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation47.addChromosome(chromosome49);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertArrayEquals(chromosomeArray37, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (int) (byte) 100, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        double double8 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str15 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor16 = elitisticListPopulation2.iterator();
        int int17 = elitisticListPopulation2.getPopulationSize();
        int int18 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome19 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 0, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((-1));
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation11.spliterator();
        java.lang.String str16 = elitisticListPopulation11.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, 0.0d);
        double double20 = elitisticListPopulation19.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation19.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation24.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation24.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList32, (int) (short) 1, (double) 10L);
        int int36 = elitisticListPopulation35.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation39.setPopulationLimit((int) (short) 1);
        double double42 = elitisticListPopulation39.getElitismRate();
        elitisticListPopulation39.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray45 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, chromosomeArray45);
        elitisticListPopulation39.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46);
        elitisticListPopulation39.setPopulationLimit(1);
        elitisticListPopulation39.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation39.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator54 = chromosomeList53.spliterator();
        elitisticListPopulation35.setChromosomes(chromosomeList53);
        elitisticListPopulation19.setChromosomes(chromosomeList53);
        elitisticListPopulation11.setChromosomes(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray45);
        org.junit.Assert.assertArrayEquals(chromosomeArray45, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeSpliterator54);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        int int19 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation22.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        java.lang.String str29 = elitisticListPopulation26.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        int int40 = elitisticListPopulation26.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation26.iterator();
        int int42 = elitisticListPopulation26.getPopulationSize();
        elitisticListPopulation26.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation47.setPopulationLimit((int) (short) 1);
        double double50 = elitisticListPopulation47.getElitismRate();
        int int51 = elitisticListPopulation47.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation54.setPopulationLimit((int) (short) 1);
        double double57 = elitisticListPopulation54.getElitismRate();
        elitisticListPopulation54.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray60 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList61 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61, chromosomeArray60);
        elitisticListPopulation54.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        elitisticListPopulation47.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        elitisticListPopulation22.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator67 = chromosomeList61.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61, (int) ' ', 10.0d);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray60);
        org.junit.Assert.assertArrayEquals(chromosomeArray60, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator67);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 52);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        java.lang.String str11 = elitisticListPopulation8.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        int int22 = elitisticListPopulation8.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation8.iterator();
        int int24 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (-1.0d));
        elitisticListPopulation29.setPopulationLimit((int) 'a');
        int int32 = elitisticListPopulation29.getPopulationSize();
        elitisticListPopulation29.setElitismRate((double) 0.0f);
        int int35 = elitisticListPopulation29.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation38.setPopulationLimit((int) (short) 1);
        double double41 = elitisticListPopulation38.getElitismRate();
        int int42 = elitisticListPopulation38.getPopulationSize();
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation47.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray50 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, chromosomeArray50);
        elitisticListPopulation47.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        elitisticListPopulation38.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        double double55 = elitisticListPopulation38.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator56 = elitisticListPopulation38.spliterator();
        int int57 = elitisticListPopulation38.getPopulationLimit();
        int int58 = elitisticListPopulation38.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList59);
        elitisticListPopulation2.setChromosomes(chromosomeList59);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray50);
        org.junit.Assert.assertArrayEquals(chromosomeArray50, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeSpliterator56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(chromosomeList59);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        java.lang.String str11 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.lang.String str16 = elitisticListPopulation2.toString();
        java.lang.String str17 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList18, (int) (byte) 100, (double) (-1));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation21.getChromosomes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(chromosomeList22);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setElitismRate(0.0d);
        double double22 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation2.addChromosome(chromosome23);
        double double25 = elitisticListPopulation2.getElitismRate();
        double double26 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation12.setPopulationLimit((int) (short) 1);
        double double15 = elitisticListPopulation12.getElitismRate();
        elitisticListPopulation12.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation12.setPopulationLimit(1);
        elitisticListPopulation12.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) ' ', (double) 'a');
        int int31 = elitisticListPopulation30.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population32 = elitisticListPopulation30.nextGeneration();
        elitisticListPopulation30.setPopulationLimit(10);
        java.lang.String str35 = elitisticListPopulation30.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population39 = elitisticListPopulation38.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor40 = elitisticListPopulation38.iterator();
        elitisticListPopulation38.setElitismRate((double) (byte) 0);
        int int43 = elitisticListPopulation38.getPopulationSize();
        int int44 = elitisticListPopulation38.getPopulationSize();
        double double45 = elitisticListPopulation38.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation48.setPopulationLimit((int) (short) 1);
        java.lang.String str51 = elitisticListPopulation48.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation54.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray57 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58, chromosomeArray57);
        elitisticListPopulation54.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        org.apache.commons.math3.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation48.addChromosome(chromosome62);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList64 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList64);
        elitisticListPopulation30.setChromosomes(chromosomeList64);
        elitisticListPopulation30.setPopulationLimit((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(chromosomeItor40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray57);
        org.junit.Assert.assertArrayEquals(chromosomeArray57, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(chromosomeList64);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        double double13 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        int int15 = elitisticListPopulation2.getPopulationLimit();
        int int16 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        double double13 = elitisticListPopulation10.getElitismRate();
        elitisticListPopulation10.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(1);
        elitisticListPopulation10.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation10.addChromosome(chromosome24);
        int int26 = elitisticListPopulation10.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        double double31 = elitisticListPopulation2.getElitismRate();
        java.lang.String str32 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[null]" + "'", str32, "[null]");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation22.setPopulationLimit((int) (short) 1);
        java.lang.String str25 = elitisticListPopulation22.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation22.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        java.lang.String str36 = elitisticListPopulation22.toString();
        java.lang.String str37 = elitisticListPopulation22.toString();
        int int38 = elitisticListPopulation22.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor39 = elitisticListPopulation22.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation42.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray45 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, chromosomeArray45);
        elitisticListPopulation42.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, (int) (byte) 100, (double) '#');
        elitisticListPopulation51.setPopulationLimit((int) '4');
        int int54 = elitisticListPopulation51.getPopulationLimit();
        double double55 = elitisticListPopulation51.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList56 = elitisticListPopulation51.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population60 = elitisticListPopulation59.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList61 = elitisticListPopulation59.getChromosomes();
        elitisticListPopulation51.setChromosomes(chromosomeList61);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator63 = chromosomeList61.spliterator();
        elitisticListPopulation22.setChromosomes(chromosomeList61);
        elitisticListPopulation2.setChromosomes(chromosomeList61);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertArrayEquals(chromosomeArray31, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor39);
        org.junit.Assert.assertNotNull(chromosomeArray45);
        org.junit.Assert.assertArrayEquals(chromosomeArray45, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 35.0d + "'", double55 == 35.0d);
        org.junit.Assert.assertNotNull(chromosomeList56);
        org.junit.Assert.assertNotNull(population60);
        org.junit.Assert.assertNotNull(chromosomeList61);
        org.junit.Assert.assertNotNull(chromosomeSpliterator63);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation11.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, 35, (double) (short) 1);
        double double21 = elitisticListPopulation20.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome22 = elitisticListPopulation20.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        double double9 = elitisticListPopulation6.getElitismRate();
        int int10 = elitisticListPopulation6.getPopulationSize();
        elitisticListPopulation6.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation6.getChromosomes();
        double double14 = elitisticListPopulation6.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation17.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        double double27 = elitisticListPopulation24.getElitismRate();
        int int28 = elitisticListPopulation24.getPopulationSize();
        elitisticListPopulation24.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList31);
        elitisticListPopulation17.setChromosomes(chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation36.setPopulationLimit((int) (short) 1);
        double double39 = elitisticListPopulation36.getElitismRate();
        elitisticListPopulation36.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        elitisticListPopulation36.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        double double48 = elitisticListPopulation6.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList49);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator53 = elitisticListPopulation2.spliterator();
        int int54 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation2.addChromosome(chromosome55);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList49);
        org.junit.Assert.assertNotNull(chromosomeSpliterator53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, (double) 0);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation11.nextGeneration();
        double double13 = elitisticListPopulation11.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation17.setPopulationLimit((int) (short) 1);
        java.lang.String str20 = elitisticListPopulation17.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation23.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray26 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27, chromosomeArray26);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27);
        int int31 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor32 = elitisticListPopulation17.iterator();
        int int33 = elitisticListPopulation17.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList34, (int) '4', (double) 32);
        elitisticListPopulation2.setChromosomes(chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList34, 3, (double) 0L);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray26);
        org.junit.Assert.assertArrayEquals(chromosomeArray26, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chromosomeList34);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation19.setPopulationLimit((int) (short) 1);
        double double22 = elitisticListPopulation19.getElitismRate();
        elitisticListPopulation19.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray25 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, chromosomeArray25);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        elitisticListPopulation19.setPopulationLimit(1);
        elitisticListPopulation19.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList33);
        elitisticListPopulation9.setPopulationLimit((int) (byte) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList37);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList37, (int) '#', (double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation41.getChromosomes();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray25);
        org.junit.Assert.assertArrayEquals(chromosomeArray25, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(chromosomeList42);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        double double3 = elitisticListPopulation2.getElitismRate();
        int int4 = elitisticListPopulation2.getPopulationSize();
        double double5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 100L);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        elitisticListPopulation2.setPopulationLimit(2);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        org.junit.Assert.assertNotNull(chromosomeList7);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        java.lang.Class<?> wildcardClass12 = chromosomeList6.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', 52.0d);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        int int11 = elitisticListPopulation7.getPopulationSize();
        double double12 = elitisticListPopulation7.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation15.setPopulationLimit((int) (short) 1);
        double double18 = elitisticListPopulation15.getElitismRate();
        elitisticListPopulation15.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation15.setPopulationLimit(1);
        elitisticListPopulation15.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation15.addChromosome(chromosome29);
        int int31 = elitisticListPopulation15.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation7.setChromosomes(chromosomeList32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation37.setPopulationLimit((int) (short) 1);
        java.lang.String str40 = elitisticListPopulation37.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation43.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray46 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, chromosomeArray46);
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        elitisticListPopulation37.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        int int51 = elitisticListPopulation37.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome52 = null;
        elitisticListPopulation37.addChromosome(chromosome52);
        int int54 = elitisticListPopulation37.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population55 = elitisticListPopulation37.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, (int) (byte) 100, (double) '4');
        double double62 = elitisticListPopulation61.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = elitisticListPopulation61.getChromosomes();
        elitisticListPopulation37.setChromosomes(chromosomeList63);
        elitisticListPopulation7.setChromosomes(chromosomeList63);
        elitisticListPopulation2.setChromosomes(chromosomeList63);
        org.apache.commons.math3.genetics.Population population67 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray46);
        org.junit.Assert.assertArrayEquals(chromosomeArray46, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(population55);
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertArrayEquals(chromosomeArray56, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 52.0d + "'", double62 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList63);
        org.junit.Assert.assertNotNull(population67);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str15 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) (byte) 100, (double) 52);
        int int20 = elitisticListPopulation19.getPopulationLimit();
        elitisticListPopulation19.setElitismRate(0.0d);
        int int23 = elitisticListPopulation19.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.lang.String str16 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass20 = chromosomeList19.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        int int18 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int24 = elitisticListPopulation23.getPopulationSize();
        int int25 = elitisticListPopulation23.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        elitisticListPopulation28.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation28.setPopulationLimit(1);
        elitisticListPopulation28.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, (int) (byte) 100, (double) '4');
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator50 = chromosomeList43.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertArrayEquals(chromosomeArray34, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator50);
        org.junit.Assert.assertNotNull(chromosomeList52);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        double double13 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 10.0f);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        double double14 = elitisticListPopulation2.getElitismRate();
        int int15 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator17 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator17);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (-1L));
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        java.lang.String str11 = elitisticListPopulation8.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation14.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        int int22 = elitisticListPopulation8.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation8.iterator();
        int int24 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation2.iterator();
        java.lang.String str28 = elitisticListPopulation2.toString();
        int int29 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        double double17 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeItor20);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        double double10 = elitisticListPopulation7.getElitismRate();
        int int11 = elitisticListPopulation7.getPopulationSize();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation7.nextGeneration();
        int int13 = elitisticListPopulation7.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, (int) '#', (double) 2);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation18.iterator();
        elitisticListPopulation18.setPopulationLimit(2);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        java.lang.String str27 = elitisticListPopulation24.toString();
        elitisticListPopulation24.setPopulationLimit(1);
        java.lang.String str30 = elitisticListPopulation24.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation33.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator40 = elitisticListPopulation33.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation33.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList41, (int) (short) 1, (double) 10L);
        int int45 = elitisticListPopulation44.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = elitisticListPopulation44.spliterator();
        elitisticListPopulation44.setElitismRate((double) (byte) 1);
        int int49 = elitisticListPopulation44.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation44.addChromosome(chromosome50);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor52 = elitisticListPopulation44.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation24.setChromosomes(chromosomeList53);
        elitisticListPopulation18.setChromosomes(chromosomeList53);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor56 = elitisticListPopulation18.iterator();
        elitisticListPopulation18.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator40);
        org.junit.Assert.assertNotNull(chromosomeList41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor52);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeItor56);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation2.spliterator();
        int int13 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation11.setPopulationLimit((int) (short) 1);
        double double14 = elitisticListPopulation11.getElitismRate();
        elitisticListPopulation11.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation11.setPopulationLimit(1);
        elitisticListPopulation11.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray25 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, chromosomeArray25);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, (int) (byte) 100, (double) '4');
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = elitisticListPopulation2.spliterator();
        int int34 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chromosomeArray25);
        org.junit.Assert.assertArrayEquals(chromosomeArray25, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        elitisticListPopulation13.setElitismRate((double) (byte) 1);
        int int18 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation13.addChromosome(chromosome19);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation13.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation13.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation13.addChromosome(chromosome23);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation13.getChromosomes();
        java.lang.Class<?> wildcardClass26 = elitisticListPopulation13.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor3);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        double double17 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation20.nextGeneration();
        int int26 = elitisticListPopulation20.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation20.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList27, (int) '4', (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation35.setPopulationLimit((int) (short) 1);
        java.lang.String str38 = elitisticListPopulation35.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation41.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray44 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45, chromosomeArray44);
        elitisticListPopulation41.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45);
        elitisticListPopulation35.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45);
        org.apache.commons.math3.genetics.Population population49 = elitisticListPopulation35.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor50 = elitisticListPopulation35.iterator();
        elitisticListPopulation35.setPopulationLimit(1);
        org.apache.commons.math3.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation35.addChromosome(chromosome53);
        java.lang.String str55 = elitisticListPopulation35.toString();
        java.lang.String str56 = elitisticListPopulation35.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation59.setPopulationLimit((int) (short) 1);
        double double62 = elitisticListPopulation59.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int66 = elitisticListPopulation65.getPopulationSize();
        int int67 = elitisticListPopulation65.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation70.setPopulationLimit((int) (short) 1);
        double double73 = elitisticListPopulation70.getElitismRate();
        elitisticListPopulation70.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray76 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList77 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList77, chromosomeArray76);
        elitisticListPopulation70.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList77);
        elitisticListPopulation70.setPopulationLimit(1);
        elitisticListPopulation70.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray84 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList85 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85, chromosomeArray84);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation89 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85, (int) (byte) 100, (double) '4');
        elitisticListPopulation70.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85);
        elitisticListPopulation65.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator92 = chromosomeList85.spliterator();
        elitisticListPopulation59.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85);
        elitisticListPopulation35.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList85);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray44);
        org.junit.Assert.assertArrayEquals(chromosomeArray44, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(population49);
        org.junit.Assert.assertNotNull(chromosomeItor50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[null]" + "'", str55, "[null]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[null]" + "'", str56, "[null]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray76);
        org.junit.Assert.assertArrayEquals(chromosomeArray76, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(chromosomeArray84);
        org.junit.Assert.assertArrayEquals(chromosomeArray84, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator92);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) (byte) 1, 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((-1));
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation11.spliterator();
        java.lang.String str16 = elitisticListPopulation11.toString();
        int int17 = elitisticListPopulation11.getPopulationLimit();
        java.lang.String str18 = elitisticListPopulation11.toString();
        elitisticListPopulation11.setElitismRate((double) (byte) 0);
        int int21 = elitisticListPopulation11.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation11.addChromosome(chromosome22);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        int int18 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation25.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        double double35 = elitisticListPopulation32.getElitismRate();
        int int36 = elitisticListPopulation32.getPopulationSize();
        elitisticListPopulation32.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList39);
        elitisticListPopulation25.setChromosomes(chromosomeList39);
        elitisticListPopulation22.setChromosomes(chromosomeList39);
        elitisticListPopulation22.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation22.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = chromosomeList45.spliterator();
        elitisticListPopulation2.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation2.addChromosome(chromosome48);
        org.apache.commons.math3.genetics.Population population50 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation56.setPopulationLimit((int) (short) 1);
        double double59 = elitisticListPopulation56.getElitismRate();
        int int60 = elitisticListPopulation56.getPopulationSize();
        elitisticListPopulation56.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation53.setChromosomes(chromosomeList63);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList65 = elitisticListPopulation53.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList65, 1, 10.0d);
        java.lang.String str69 = elitisticListPopulation68.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList70 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList70);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chromosomeList63);
        org.junit.Assert.assertNotNull(chromosomeList65);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[]" + "'", str69, "[]");
        org.junit.Assert.assertNotNull(chromosomeList70);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation11.addChromosome(chromosome15);
        org.apache.commons.math3.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation11.addChromosome(chromosome17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome19 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation2.spliterator();
        int int20 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation23.setPopulationLimit((int) (short) 1);
        double double26 = elitisticListPopulation23.getElitismRate();
        int int27 = elitisticListPopulation23.getPopulationSize();
        org.apache.commons.math3.genetics.Population population28 = elitisticListPopulation23.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation23.addChromosome(chromosome29);
        int int31 = elitisticListPopulation23.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList32);
        org.apache.commons.math3.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation2.addChromosome(chromosome34);
        org.apache.commons.math3.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation2.addChromosome(chromosome36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(population28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(chromosomeList32);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.lang.String str9 = elitisticListPopulation2.toString();
        double double10 = elitisticListPopulation2.getElitismRate();
        double double11 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        int int18 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int24 = elitisticListPopulation23.getPopulationSize();
        int int25 = elitisticListPopulation23.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation28.setPopulationLimit((int) (short) 1);
        double double31 = elitisticListPopulation28.getElitismRate();
        elitisticListPopulation28.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation28.setPopulationLimit(1);
        elitisticListPopulation28.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, (int) (byte) 100, (double) '4');
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator50 = chromosomeList43.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, (int) (byte) 10, (double) 32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation54.getChromosomes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertArrayEquals(chromosomeArray34, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator50);
        org.junit.Assert.assertNotNull(chromosomeList55);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        double double13 = elitisticListPopulation10.getElitismRate();
        elitisticListPopulation10.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(1);
        elitisticListPopulation10.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation10.addChromosome(chromosome24);
        int int26 = elitisticListPopulation10.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator30 = chromosomeList29.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList29, 3, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeList29);
        org.junit.Assert.assertNotNull(chromosomeSpliterator30);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, 1, (double) 52);
        java.lang.String str10 = elitisticListPopulation9.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation9.iterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor11);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) 32);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setPopulationLimit(1);
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation15.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation24.setPopulationLimit((int) (short) 1);
        double double27 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation24.setPopulationLimit(1);
        elitisticListPopulation24.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, (int) (byte) 100, (double) '4');
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator47 = chromosomeList39.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator47);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass8 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        int int12 = elitisticListPopulation11.getPopulationLimit();
        elitisticListPopulation11.setPopulationLimit((int) (short) 10);
        int int15 = elitisticListPopulation11.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation11.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation11.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        java.lang.String str23 = elitisticListPopulation20.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        org.apache.commons.math3.genetics.Population population34 = elitisticListPopulation20.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation20.getChromosomes();
        java.lang.String str36 = elitisticListPopulation20.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList37);
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertArrayEquals(chromosomeArray29, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(population34);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNotNull(chromosomeList37);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        int int15 = elitisticListPopulation2.getPopulationSize();
        int int16 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation6.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = elitisticListPopulation6.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        int int16 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation2.getChromosomes();
        java.lang.String str21 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor24);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) '4', (double) (-1.0f));
        int int12 = elitisticListPopulation11.getPopulationLimit();
        int int13 = elitisticListPopulation11.getPopulationSize();
        elitisticListPopulation11.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation11.addChromosome(chromosome16);
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation11.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, 1, (double) 52);
        elitisticListPopulation9.setPopulationLimit(52);
        int int12 = elitisticListPopulation9.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation9.getChromosomes();
        int int14 = elitisticListPopulation9.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation9.nextGeneration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int9 = elitisticListPopulation8.getPopulationSize();
        int int10 = elitisticListPopulation8.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        double double16 = elitisticListPopulation13.getElitismRate();
        elitisticListPopulation13.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray19 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, chromosomeArray19);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation13.setPopulationLimit(1);
        elitisticListPopulation13.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (byte) 100, (double) '4');
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator35 = chromosomeList28.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population37 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(35);
        org.apache.commons.math3.genetics.Chromosome chromosome40 = null;
        elitisticListPopulation2.addChromosome(chromosome40);
        org.apache.commons.math3.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation2.addChromosome(chromosome42);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor44 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray19);
        org.junit.Assert.assertArrayEquals(chromosomeArray19, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator35);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertNotNull(chromosomeItor44);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        double double14 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        int int19 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (short) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        double double4 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation7.setPopulationLimit((int) (short) 1);
        java.lang.String str10 = elitisticListPopulation7.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        java.lang.String str21 = elitisticListPopulation7.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation7.addChromosome(chromosome22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation26.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = elitisticListPopulation26.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation26.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList34, (int) (short) 1, (double) 10L);
        elitisticListPopulation7.setChromosomes(chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList34, (int) 'a', (double) (short) 100);
        elitisticListPopulation2.setChromosomes(chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList34, 52, (-1.0d));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation48.setPopulationLimit((int) (short) 1);
        java.lang.String str51 = elitisticListPopulation48.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation54.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray57 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58, chromosomeArray57);
        elitisticListPopulation54.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        int int62 = elitisticListPopulation48.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor63 = elitisticListPopulation48.iterator();
        int int64 = elitisticListPopulation48.getPopulationSize();
        elitisticListPopulation48.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation69 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation69.setPopulationLimit((int) (short) 1);
        double double72 = elitisticListPopulation69.getElitismRate();
        int int73 = elitisticListPopulation69.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation76.setPopulationLimit((int) (short) 1);
        double double79 = elitisticListPopulation76.getElitismRate();
        elitisticListPopulation76.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray82 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList83 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList83, chromosomeArray82);
        elitisticListPopulation76.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList83);
        elitisticListPopulation69.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList83);
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList83);
        elitisticListPopulation45.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList83);
        int int89 = elitisticListPopulation45.getPopulationLimit();
        int int90 = elitisticListPopulation45.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertArrayEquals(chromosomeArray29, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray57);
        org.junit.Assert.assertArrayEquals(chromosomeArray57, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray82);
        org.junit.Assert.assertArrayEquals(chromosomeArray82, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 52 + "'", int89 == 52);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 52 + "'", int90 == 52);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, 1, (double) 52);
        java.lang.String str10 = elitisticListPopulation9.toString();
        int int11 = elitisticListPopulation9.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, (double) 1L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        int int18 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation25.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        double double35 = elitisticListPopulation32.getElitismRate();
        int int36 = elitisticListPopulation32.getPopulationSize();
        elitisticListPopulation32.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList39);
        elitisticListPopulation25.setChromosomes(chromosomeList39);
        elitisticListPopulation22.setChromosomes(chromosomeList39);
        elitisticListPopulation22.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation22.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = chromosomeList45.spliterator();
        elitisticListPopulation2.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation2.addChromosome(chromosome48);
        org.apache.commons.math3.genetics.Population population50 = elitisticListPopulation2.nextGeneration();
        java.lang.Class<?> wildcardClass51 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
        org.junit.Assert.assertNotNull(population50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int12 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator23 = elitisticListPopulation2.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNull(chromosomeList22);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation8.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(1);
        int int20 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(100);
        int int23 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population24 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, (int) (byte) 100, (double) '#');
        elitisticListPopulation11.setPopulationLimit((int) '4');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation11.setPopulationLimit((int) (short) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation11.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList17);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (-1.0d));
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        double double16 = elitisticListPopulation13.getElitismRate();
        int int17 = elitisticListPopulation13.getPopulationSize();
        elitisticListPopulation13.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation13.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation23.setPopulationLimit((int) (short) 1);
        double double26 = elitisticListPopulation23.getElitismRate();
        elitisticListPopulation23.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        elitisticListPopulation23.setPopulationLimit(1);
        elitisticListPopulation23.setElitismRate((double) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList37);
        elitisticListPopulation2.setChromosomes(chromosomeList37);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor40 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertArrayEquals(chromosomeArray29, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(chromosomeItor40);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(3, 1.0d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', 52.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', 0.0d);
        int int9 = elitisticListPopulation8.getPopulationSize();
        int int10 = elitisticListPopulation8.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        double double16 = elitisticListPopulation13.getElitismRate();
        elitisticListPopulation13.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray19 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, chromosomeArray19);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation13.setPopulationLimit(1);
        elitisticListPopulation13.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (byte) 100, (double) '4');
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator35 = chromosomeList28.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population37 = elitisticListPopulation2.nextGeneration();
        java.lang.Class<?> wildcardClass38 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray19);
        org.junit.Assert.assertArrayEquals(chromosomeArray19, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator35);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 1, (double) 10L);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        elitisticListPopulation13.setElitismRate((double) (byte) 1);
        int int18 = elitisticListPopulation13.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation13.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation13.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation13.addChromosome(chromosome21);
        java.lang.String str23 = elitisticListPopulation13.toString();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[null]" + "'", str23, "[null]");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        int int13 = elitisticListPopulation9.getPopulationSize();
        elitisticListPopulation9.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation21.setPopulationLimit((int) (short) 1);
        double double24 = elitisticListPopulation21.getElitismRate();
        elitisticListPopulation21.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population40 = elitisticListPopulation39.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation46.setPopulationLimit((int) (short) 1);
        double double49 = elitisticListPopulation46.getElitismRate();
        int int50 = elitisticListPopulation46.getPopulationSize();
        elitisticListPopulation46.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation43.setChromosomes(chromosomeList53);
        elitisticListPopulation39.setChromosomes(chromosomeList53);
        elitisticListPopulation36.setChromosomes(chromosomeList53);
        elitisticListPopulation36.setPopulationLimit(1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList59);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList61 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator62 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeList59);
        org.junit.Assert.assertNotNull(chromosomeList61);
        org.junit.Assert.assertNotNull(chromosomeSpliterator62);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation9.setPopulationLimit((int) (short) 1);
        double double12 = elitisticListPopulation9.getElitismRate();
        elitisticListPopulation9.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation2.addChromosome(chromosome20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome22 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.Population population14 = elitisticListPopulation13.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation20.setPopulationLimit((int) (short) 1);
        double double23 = elitisticListPopulation20.getElitismRate();
        int int24 = elitisticListPopulation20.getPopulationSize();
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList27);
        elitisticListPopulation13.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation32.setPopulationLimit((int) (short) 1);
        double double35 = elitisticListPopulation32.getElitismRate();
        elitisticListPopulation32.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        int int44 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(1);
        elitisticListPopulation2.setElitismRate((double) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        int int18 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, (int) (byte) 100, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation22.iterator();
        java.lang.String str24 = elitisticListPopulation22.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation22.spliterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
    }
}

