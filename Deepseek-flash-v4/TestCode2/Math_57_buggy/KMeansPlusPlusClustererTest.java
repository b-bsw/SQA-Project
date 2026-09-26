package org.apache.commons.math.stat.clustering;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy;
import org.junit.Test;

public class KMeansPlusPlusClustererTest {

    private static class TestPoint implements Clusterable<TestPoint> {

        private final double x;

        TestPoint(final double x) {
            this.x = x;
        }

        @Override
        public double distanceFrom(final TestPoint p) {
            return Math.abs(x - p.x);
        }

        @Override
        public TestPoint centroidOf(final Collection<TestPoint> points) {
            double sum = 0.0;
            for (final TestPoint p : points) {
                sum += p.x;
            }
            return new TestPoint(sum / points.size());
        }

        @Override
        public boolean equals(final Object obj) {
            if (!(obj instanceof TestPoint)) {
                return false;
            }
            return Double.compare(x, ((TestPoint) obj).x) == 0;
        }

        @Override
        public int hashCode() {
            final long bits = Double.doubleToLongBits(x);
            return (int) (bits ^ (bits >>> 32));
        }

        @Override
        public String toString() {
            return String.valueOf(x);
        }
    }

    @Test
    public void testClusterConverges() {
        final Collection<TestPoint> points = Arrays.asList(
                new TestPoint(0), new TestPoint(1),
                new TestPoint(10), new TestPoint(11));
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0));
        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 2, 10);

        assertEquals(2, clusters.size());
        assertEquals(4, countPoints(clusters));
        for (final Cluster<TestPoint> cluster : clusters) {
            assertNotNull(cluster.getCenter());
            assertFalse(cluster.getPoints().isEmpty());
        }
    }

    @Test
    public void testClusterThreeClusters() {
        final Collection<TestPoint> points = Arrays.asList(
                new TestPoint(0), new TestPoint(1),
                new TestPoint(2), new TestPoint(10));
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0));
        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 3, 10);

        assertEquals(3, clusters.size());
        assertEquals(4, countPoints(clusters));
        for (final Cluster<TestPoint> cluster : clusters) {
            assertNotNull(cluster.getCenter());
            assertFalse(cluster.getPoints().isEmpty());
        }
    }

    @Test
    public void testClusterZeroIterations() {
        final Collection<TestPoint> points = Arrays.asList(
                new TestPoint(1), new TestPoint(2), new TestPoint(3));
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0));
        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 2, 0);

        assertEquals(2, clusters.size());
        assertEquals(3, countPoints(clusters));
        for (final Cluster<TestPoint> cluster : clusters) {
            assertFalse(cluster.getPoints().isEmpty());
        }
    }

    @Test
    public void testClusterNegativeMaxIterationsConverges() {
        final Collection<TestPoint> points = Arrays.asList(
                new TestPoint(5), new TestPoint(5), new TestPoint(5));
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0));
        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 1, -1);

        assertEquals(1, clusters.size());
        assertEquals(3, countPoints(clusters));
        assertEquals(new TestPoint(5), clusters.get(0).getCenter());
        assertFalse(clusters.get(0).getPoints().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClusterEmptyPointsThrows() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0));
        clusterer.cluster(new ArrayList<TestPoint>(), 1, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testClusterNullPointsThrows() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0));
        clusterer.cluster(null, 1, 10);
    }

    @Test(expected = ConvergenceException.class)
    public void testEmptyClusterStrategyErrorThrows() {
        final Collection<TestPoint> points = Arrays.asList(
                new TestPoint(0), new TestPoint(0));
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0), EmptyClusterStrategy.ERROR);

        clusterer.cluster(points, 2, 1);
    }

    @Test
    public void testEmptyClusterStrategies() {
        assertEmptyStrategyWorks(EmptyClusterStrategy.LARGEST_VARIANCE);
        assertEmptyStrategyWorks(EmptyClusterStrategy.LARGEST_POINTS_NUMBER);
        assertEmptyStrategyWorks(EmptyClusterStrategy.FARTHEST_POINT);
    }

    private void assertEmptyStrategyWorks(final EmptyClusterStrategy strategy) {
        final Collection<TestPoint> points = Arrays.asList(
                new TestPoint(0), new TestPoint(0));
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(0), strategy);
        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 2, 1);

        assertEquals(2, clusters.size());
        assertEquals(2, countPoints(clusters));
    }

    private int countPoints(final List<Cluster<TestPoint>> clusters) {
        int total = 0;
        for (final Cluster<TestPoint> cluster : clusters) {
            total += cluster.getPoints().size();
        }
        return total;
    }

}