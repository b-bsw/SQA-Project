package org.apache.commons.math.optimization.fitting;

import static org.junit.Assert.*;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.junit.Test;

public class GaussianFitterTest {

    @Test(expected = NullArgumentException.class)
    public void testParameterGuesserRejectsNullObservations() {
        new GaussianFitter.ParameterGuesser(null);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserRejectsTooFewObservations() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0)
        };
        new GaussianFitter.ParameterGuesser(points);
    }

    @Test
    public void testGuessReturnsNormMeanAndSigma() {
        WeightedObservedPoint p0 = new WeightedObservedPoint(1.0, 4.0, 10.0);
        WeightedObservedPoint p1 = new WeightedObservedPoint(1.0, 1.0, 20.0);
        WeightedObservedPoint p2 = new WeightedObservedPoint(1.0, 0.0, 10.0);
        WeightedObservedPoint p3 = new WeightedObservedPoint(1.0, 3.0, 20.0);
        WeightedObservedPoint p4 = new WeightedObservedPoint(1.0, 2.0, 30.0);
        WeightedObservedPoint[] observations = new WeightedObservedPoint[] { p0, p1, p2, p3, p4 };

        GaussianFitter.ParameterGuesser guesser =
            new GaussianFitter.ParameterGuesser(observations);
        double[] guess = guesser.guess();

        assertEquals(30.0, guess[0], 1e-12);
        assertEquals(2.0, guess[1], 1e-12);
        assertEquals(2.8 / (2.0 * Math.sqrt(2.0 * Math.log(2.0))), guess[2], 1e-12);
        assertSame(p0, observations[0]);
        assertSame(p1, observations[1]);
        assertSame(p2, observations[2]);
        assertSame(p3, observations[3]);
        assertSame(p4, observations[4]);
    }

    @Test
    public void testGuessReturnsCloneOnEachCall() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 10.0),
            new WeightedObservedPoint(1.0, 1.0, 20.0),
            new WeightedObservedPoint(1.0, 2.0, 30.0),
            new WeightedObservedPoint(1.0, 3.0, 20.0),
            new WeightedObservedPoint(1.0, 4.0, 10.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);

        double[] first = guesser.guess();
        double[] second = guesser.guess();

        assertNotSame(first, second);
        first[0] = 0.0;
        assertEquals(30.0, second[0], 1e-12);
    }

    @Test
    public void testGuessUsesFullRangeWhenMaxAtBoundary() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 10.0),
            new WeightedObservedPoint(1.0, 1.0, 20.0),
            new WeightedObservedPoint(1.0, 2.0, 30.0)
        };

        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();

        assertEquals(30.0, guess[0], 1e-12);
        assertEquals(2.0, guess[1], 1e-12);
        assertEquals(2.0 / (2.0 * Math.sqrt(2.0 * Math.log(2.0))), guess[2], 1e-12);
    }

    @Test
    public void testInterpolationAtExactObservedY() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 10.0),
            new WeightedObservedPoint(1.0, 1.0, 16.0),
            new WeightedObservedPoint(1.0, 2.0, 30.0),
            new WeightedObservedPoint(1.0, 3.0, 20.0),
            new WeightedObservedPoint(1.0, 4.0, 10.0)
        };

        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();

        assertEquals(30.0, guess[0], 1e-12);
        assertEquals(2.0, guess[1], 1e-12);
        assertEquals(2.4 / (2.0 * Math.sqrt(2.0 * Math.log(2.0))), guess[2], 1e-12);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFitWithoutObservationsThrows() {
        new GaussianFitter(null).fit();
    }
}