package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.SplitSubHyperplane;

public class SubLineTest_6a29aee3 {

    private static final double EPS = 1e-10;

    @Before
    public void setUp() {
    }

    @Test
    public void testGetSegmentsSingle() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        List<Segment> segs = sub.getSegments();
        assertEquals(1, segs.size());
        Segment seg = segs.get(0);
        assertEquals(0.0, seg.getStart().getX(), EPS);
        assertEquals(0.0, seg.getStart().getY(), EPS);
        assertEquals(1.0, seg.getEnd().getX(), EPS);
        assertEquals(0.0, seg.getEnd().getY(), EPS);
    }

    @Test
    public void testGetSegmentsEmpty() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        IntervalsSet empty = new IntervalsSet(new BSPTree<Euclidean1D>(Boolean.FALSE));
        SubLine sub = new SubLine(line, empty);
        List<Segment> segs = sub.getSegments();
        assertTrue(segs.isEmpty());
    }

    @Test
    public void testConstructorFromSegment() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Segment seg = new Segment(new Vector2D(0, 0), new Vector2D(1, 0), line);
        SubLine sub = new SubLine(seg);
        List<Segment> segs = sub.getSegments();
        assertEquals(1, segs.size());
        Segment seg2 = segs.get(0);
        assertEquals(seg.getStart().getX(), seg2.getStart().getX(), EPS);
        assertEquals(seg.getStart().getY(), seg2.getStart().getY(), EPS);
        assertEquals(seg.getEnd().getX(), seg2.getEnd().getX(), EPS);
        assertEquals(seg.getEnd().getY(), seg2.getEnd().getY(), EPS);
    }

    @Test
    public void testIntersectionParallel() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine sub2 = new SubLine(new Vector2D(0, 1), new Vector2D(1, 1));
        assertNull(sub1.intersection(sub2, true));
        assertNull(sub1.intersection(sub2, false));
    }

    @Test
    public void testIntersectionCrossingInside() {
        SubLine sub1 = new SubLine(new Vector2D(-1, -1), new Vector2D(1, 1));
        SubLine sub2 = new SubLine(new Vector2D(-1, 1), new Vector2D(1, -1));
        Vector2D inter = sub1.intersection(sub2, true);
        assertNotNull(inter);
        assertEquals(0.0, inter.getX(), EPS);
        assertEquals(0.0, inter.getY(), EPS);
        Vector2D inter2 = sub1.intersection(sub2, false);
        assertNotNull(inter2);
        assertEquals(0.0, inter2.getX(), EPS);
        assertEquals(0.0, inter2.getY(), EPS);
    }

    @Test
    public void testIntersectionCrossingOutside() {
        SubLine sub1 = new SubLine(new Vector2D(-1, -1), new Vector2D(0, 0));
        SubLine sub2 = new SubLine(new Vector2D(-1, 1), new Vector2D(1, -1));
        Vector2D inter = sub1.intersection(sub2, true);
        assertNotNull(inter);
        assertEquals(0.0, inter.getX(), EPS);
        assertEquals(0.0, inter.getY(), EPS);
        assertNull(sub1.intersection(sub2, false));
    }

    @Test
    public void testSideParallel() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        Line above = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        assertEquals(Side.PLUS, sub.side(above));
        Line below = new Line(new Vector2D(0, -1), new Vector2D(1, -1));
        assertEquals(Side.MINUS, sub.side(below));
        Line same = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        assertEquals(Side.HYPER, sub.side(same));
    }

    @Test
    public void testSideCrossing() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        Line vertical = new Line(new Vector2D(1, -1), new Vector2D(1, 1));
        assertEquals(Side.HYPER, sub.side(vertical));
    }

    @Test
    public void testSplitParallel() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        Line parallelAbove = new Line(new Vector2D(0, 5), new Vector2D(1, 5));
        SplitSubHyperplane<Euclidean2D> split = sub.split(parallelAbove);
        assertNotNull(split.getPlus());
        assertNull(split.getMinus());
    }

    @Test
    public void testSplitCrossing() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        Line vertical = new Line(new Vector2D(1, -1), new Vector2D(1, 1));
        SplitSubHyperplane<Euclidean2D> split = sub.split(vertical);
        assertNotNull(split.getPlus());
        assertNotNull(split.getMinus());
        assertTrue(split.getPlus() instanceof SubLine);
        assertTrue(split.getMinus() instanceof SubLine);
    }
}