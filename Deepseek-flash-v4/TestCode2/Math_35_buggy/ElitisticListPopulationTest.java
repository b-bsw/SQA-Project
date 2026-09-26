package org.apache.commons.math3.genetics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Test;

public class ElitisticListPopulationTest {

    @Test
    public void testConstructorWithChromosomesAndRate() {
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomeList(1.0, 2.0, 3.0), 3, 0.5);
        assertEquals(3, population.getPopulationLimit());
        assertEquals(0.5, population.getElitismRate(), 0.0);
        assertEquals(3, population.getChromosomes().size());
    }

    @Test
    public void testConstructorWithRateOnly() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.25);
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0.25, population.getElitismRate(), 0.0);
        assertEquals(0, population.getChromosomes().size());
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructorRejectsElitismRateBelowZero() {
        new ElitisticListPopulation(10, -0.01);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructorRejectsElitismRateAboveOne() {
        new ElitisticListPopulation(chromosomeList(1.0), 1, 1.01);
    }

    @Test
    public void testSetAndGetElitismRate() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(0.0);
        assertEquals(0.0, population.getElitismRate(), 0.0);
        population.setElitismRate(1.0);
        assertEquals(1.0, population.getElitismRate(), 0.0);
        population.setElitismRate(0.333);
        assertEquals(0.333, population.getElitismRate(), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateRejectsBelowZero() {
        new ElitisticListPopulation(10, 0.5).setElitismRate(-0.01);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateRejectsAboveOne() {
        new ElitisticListPopulation(10, 0.5).setElitismRate(1.01);
    }

    @Test
    public void testNextGenerationTypicalElitism() {
        ElitisticListPopulation population = new ElitisticListPopulation(
                chromosomeList(10, 1, 9, 2, 8, 3, 7, 4, 6, 5), 10, 0.9);
        ElitisticListPopulation next = (ElitisticListPopulation) population.nextGeneration();

        assertNotNull(next);
        assertNotSame(population, next);
        assertEquals(10, next.getPopulationLimit());
        assertEquals(0.9, next.getElitismRate(), 0.0);
        assertEquals(9, next.getChromosomes().size());
        assertEquals(2.0, next.getChromosomes().get(0).getFitness(), 0.0);
        assertEquals(10.0, next.getChromosomes().get(next.getChromosomes().size() - 1).getFitness(), 0.0);
    }

    @Test
    public void testNextGenerationUsesCeilForBoundIndex() {
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomeList(1, 2, 3, 4, 5), 5, 0.5);
        ElitisticListPopulation next = (ElitisticListPopulation) population.nextGeneration();

        assertEquals(2, next.getChromosomes().size());
        assertEquals(4.0, next.getChromosomes().get(0).getFitness(), 0.0);
        assertEquals(5.0, next.getChromosomes().get(1).getFitness(), 0.0);
    }

    @Test
    public void testNextGenerationZeroElitismKeepsNothing() {
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomeList(1, 2, 3, 4, 5), 5, 0.0);
        ElitisticListPopulation next = (ElitisticListPopulation) population.nextGeneration();

        assertEquals(0, next.getChromosomes().size());
    }

    @Test
    public void testNextGenerationFullElitismKeepsAll() {
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomeList(1, 2, 3, 4, 5), 5, 1.0);
        ElitisticListPopulation next = (ElitisticListPopulation) population.nextGeneration();

        assertEquals(5, next.getChromosomes().size());
    }

    @Test
    public void testNextGenerationSingleChromosome() {
        ElitisticListPopulation full = new ElitisticListPopulation(chromosomeList(7), 1, 1.0);
        assertEquals(1, ((ElitisticListPopulation) full.nextGeneration()).getChromosomes().size());

        ElitisticListPopulation none = new ElitisticListPopulation(chromosomeList(7), 1, 0.9);
        assertEquals(0, ((ElitisticListPopulation) none.nextGeneration()).getChromosomes().size());
    }

    @Test
    public void testNextGenerationEmptyPopulation() {
        ElitisticListPopulation population = new ElitisticListPopulation(1, 0.5);
        ElitisticListPopulation next = (ElitisticListPopulation) population.nextGeneration();

        assertEquals(0, next.getChromosomes().size());
        assertEquals(0.5, next.getElitismRate(), 0.0);
    }

    @Test
    public void testNextGenerationSortsPopulationChromosomes() {
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomeList(5, 1, 3, 2, 4), 5, 1.0);
        population.nextGeneration();

        List<Chromosome> chromosomes = population.getChromosomes();
        assertEquals(1.0, chromosomes.get(0).getFitness(), 0.0);
        assertEquals(5.0, chromosomes.get(chromosomes.size() - 1).getFitness(), 0.0);
    }

    private static List<Chromosome> chromosomeList(double... fitnesses) {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>(fitnesses.length);
        for (double fitness : fitnesses) {
            chromosomes.add(new TestChromosome(fitness));
        }
        return chromosomes;
    }

    private static class TestChromosome extends Chromosome {
        private final double fitness;

        TestChromosome(double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double getFitness() {
            return fitness;
        }

        @Override
        public boolean isSame(Chromosome another) {
            return this == another;
        }

        @Override
        public ChromosomePair crossover(Chromosome another) {
            return null;
        }

        @Override
        public Chromosome mutate() {
            return this;
        }
    }
}