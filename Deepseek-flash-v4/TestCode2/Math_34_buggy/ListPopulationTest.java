package org.apache.commons.math3.genetics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Test;

public class ListPopulationTest {

    private static class StubChromosome extends Chromosome {
        private final double value;

        StubChromosome(double value) {
            this.value = value;
        }

        public double fitness() {
            return value;
        }

        public boolean isSame(Chromosome chromosome) {
            return this == chromosome;
        }

        public double value() {
            return value;
        }
    }

    private static class TestPopulation extends ListPopulation {
        TestPopulation(int populationLimit) {
            super(populationLimit);
        }

        TestPopulation(List<Chromosome> chromosomes, int populationLimit) {
            super(chromosomes, populationLimit);
        }
    }

    private static List<Chromosome> chromosomes(double... values) {
        List<Chromosome> list = new ArrayList<Chromosome>();
        for (double value : values) {
            list.add(new StubChromosome(value));
        }
        return list;
    }

    @Test
    public void testConstructorWithLimit() {
        TestPopulation p = new TestPopulation(5);
        assertEquals(0, p.getPopulationSize());
        assertEquals(5, p.getPopulationLimit());
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithZeroLimitThrows() {
        new TestPopulation(0);
    }

    @Test
    public void testConstructorWithChromosomesAndLimit() {
        TestPopulation p = new TestPopulation(chromosomes(1.0, 2.0), 2);
        assertEquals(2, p.getPopulationSize());
        assertEquals(2, p.getPopulationLimit());
        assertEquals(2.0, ((StubChromosome) p.getFittestChromosome()).value(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorWithNullChromosomesThrows() {
        new TestPopulation((List<Chromosome>) null, 1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorWithTooManyChromosomesThrows() {
        new TestPopulation(chromosomes(1.0, 2.0), 1);
    }

    @Test
    public void testSetChromosomesReplacesExisting() {
        TestPopulation p = new TestPopulation(3);
        p.addChromosome(new StubChromosome(0.5));
        p.setChromosomes(chromosomes(1.5, 2.5));
        assertEquals(2, p.getPopulationSize());
        assertEquals(2.5, ((StubChromosome) p.getFittestChromosome()).value(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testSetChromosomesNullThrows() {
        new TestPopulation(2).setChromosomes(null);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSetChromosomesTooManyThrows() {
        new TestPopulation(2).setChromosomes(chromosomes(1.0, 2.0, 3.0));
    }

    @Test
    public void testAddChromosomes() {
        TestPopulation p = new TestPopulation(4);
        p.addChromosome(new StubChromosome(1.0));
        p.addChromosomes(chromosomes(2.0, 3.0));
        assertEquals(3, p.getPopulationSize());
    }

    @Test
    public void testAddChromosomesEmptyDoesNothing() {
        TestPopulation p = new TestPopulation(2);
        p.addChromosome(new StubChromosome(1.0));
        p.addChromosomes(Collections.<Chromosome>emptyList());
        assertEquals(1, p.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomesExceedsLimitThrows() {
        new TestPopulation(2).addChromosomes(chromosomes(1.0, 2.0, 3.0));
    }

    @Test
    public void testAddChromosome() {
        TestPopulation p = new TestPopulation(2);
        p.addChromosome(new StubChromosome(1.0));
        assertEquals(1, p.getPopulationSize());
        assertEquals(1.0, ((StubChromosome) p.getChromosomes().get(0)).value(), 0.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomeAtLimitThrows() {
        TestPopulation p = new TestPopulation(1);
        p.addChromosome(new StubChromosome(1.0));
        p.addChromosome(new StubChromosome(2.0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetChromosomesIsUnmodifiable() {
        TestPopulation p = new TestPopulation(1);
        p.addChromosome(new StubChromosome(1.0));
        p.getChromosomes().add(new StubChromosome(2.0));
    }

    @Test
    public void testGetFittestChromosomeSingle() {
        TestPopulation p = new TestPopulation(1);
        Chromosome chromosome = new StubChromosome(1.0);
        p.addChromosome(chromosome);
        assertSame(chromosome, p.getFittestChromosome());
    }

    @Test
    public void testGetFittestChromosomeMax() {
        TestPopulation p = new TestPopulation(chromosomes(1.0, 4.0, 2.0), 3);
        assertEquals(4.0, ((StubChromosome) p.getFittestChromosome()).value(), 0.0);
    }

    @Test
    public void testSetPopulationLimit() {
        TestPopulation p = new TestPopulation(2);
        p.setPopulationLimit(4);
        assertEquals(4, p.getPopulationLimit());
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimitZeroThrows() {
        new TestPopulation(1).setPopulationLimit(0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSetPopulationLimitTooSmallThrows() {
        TestPopulation p = new TestPopulation(3);
        p.addChromosomes(chromosomes(1.0, 2.0));
        p.setPopulationLimit(1);
    }

    @Test
    public void testSetPopulationLimitEqualToSizeAllowed() {
        TestPopulation p = new TestPopulation(3);
        p.addChromosomes(chromosomes(1.0, 2.0));
        p.setPopulationLimit(2);
        assertEquals(2, p.getPopulationLimit());
    }

    @Test
    public void testToStringUsesChromosomesToString() {
        TestPopulation p = new TestPopulation(chromosomes(1.0), 1);
        assertEquals(p.getChromosomes().toString(), p.toString());
    }

    @Test
    public void testIteratorReturnsInOrder() {
        TestPopulation p = new TestPopulation(chromosomes(1.0, 2.0), 2);
        Iterator<Chromosome> it = p.iterator();
        assertEquals(1.0, ((StubChromosome) it.next()).value(), 0.0);
        assertEquals(2.0, ((StubChromosome) it.next()).value(), 0.0);
        assertTrue(!it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveUnsupported() {
        TestPopulation p = new TestPopulation(2);
        p.addChromosome(new StubChromosome(1.0));
        Iterator<Chromosome> it = p.iterator();
        it.next();
        it.remove();
    }
}