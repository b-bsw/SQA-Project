package org.apache.commons.math3.geometry.euclidean.threed;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;

public class SubLineTest {

    @Test
    public void testConstructorLineIntervalsSet() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet intervals = new IntervalsSet(0.0, 1.0);
        SubLine sub = new SubLine(line, intervals);
        assertNotNull(sub);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorVector3DSamePoints() {
        new SubLine(new Vector3D(1, 2, 3), new Vector3D(1, 2, 3));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorSegmentSameEndpoints() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Segment seg = new Segment(new Vector3D(1, 0, 0), new Vector3D(1, 0, 0), line);
        new SubLine(seg);
    }

    @Test
    public void testGetSegmentsSingleInterval() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet intervals = new IntervalsSet(0.0, 1.0);
        SubLine sub = new SubLine(line, intervals);
        List<Segment> segments = sub.getSegments();
        assertEquals(1, segments.size());
        Segment seg = segments.get(0);
        // Start at (0,0,0), end at (1,0,0) along line
        assertEquals(0.0, seg.getStart().getX(), 1e-12);
        assertEquals(0.0, seg.getStart().getY(), 1e-12);
        assertEquals(0.0, seg.getStart().getZ(), 1e-12);
        assertEquals(1.0, seg.getEnd().getX(), 1e-12);
        assertEquals(0.0, seg.getEnd().getY(), 1e-12);
        assertEquals(0.0, seg.getEnd().getZ(), 1e-12);
    }

    @Test
    public void testGetSegmentsEmpty() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        // Empty IntervalsSet: no intervals
        IntervalsSet emptyIntervals = new IntervalsSet(1.0, 0.0); // lower > upper gives empty
        SubLine sub = new SubLine(line, emptyIntervals);
        List<Segment> segments = sub.getSegments();
        assertTrue(segments.isEmpty());
    }

    @Test
    public void testIntersectionInsideBoth() {
        // Two perpendicular lines crossing at (1,1,0) inside both segments
        Line line1 = new Line(new Vector3D(0, 1, 0), new Vector3D(2, 1, 0)); // horizontal y=1
        Line line2 = new Line(new Vector3D(1, 0, 0), new Vector3D(1, 2, 0)); // vertical x=1
        IntervalsSet interval1 = new IntervalsSet(0.0, 2.0); // covers x 0 to 2
        IntervalsSet interval2 = new IntervalsSet(0.0, 2.0); // covers y 0 to 2
        SubLine sub1 = new SubLine(line1, interval1);
        SubLine sub2 = new SubLine(line2, interval2);
        Vector3D intersection = sub1.intersection(sub2, true);
        assertNotNull(intersection);
        assertEquals(1.0, intersection.getX(), 1e-12);
        assertEquals(1.0, intersection.getY(), 1e-12);
        assertEquals(0.0, intersection.getZ(), 1e-12);
    }

    @Test
    public void testIntersectionOutside() {
        // Two parallel lines do not intersect
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0)); // parallel, offset
        IntervalsSet interval = new IntervalsSet(0.0, 1.0);
        SubLine sub1 = new SubLine(line1, interval);
        SubLine sub2 = new SubLine(line2, interval);
        assertNull(sub1.intersection(sub2, true));
    }

    @Test
    public void testIntersectionIncludeEndPointsTrue() {
        // Lines intersect at endpoint of both segments (closed)
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0)); // horizontal
        Line line2 = new Line(new Vector3D(2, 0, 0), new Vector3D(2, 2, 0)); // vertical from (2,0)
        IntervalsSet intervals1 = new IntervalsSet(0.0, 2.0);
        IntervalsSet intervals2 = new IntervalsSet(0.0, 2.0);
        SubLine sub1 = new SubLine(line1, intervals1);
        SubLine sub2 = new SubLine(line2, intervals2);
        Vector3D pt = sub1.intersection(sub2, true);
        assertNotNull(pt);
        assertEquals(2.0, pt.getX(), 1e-12);
        assertEquals(0.0, pt.getY(), 1e-12);
        assertEquals(0.0, pt.getZ(), 1e-12);
    }

    @Test
    public void testIntersectionIncludeEndPointsFalse() {
        // Same as above but exclude endpoints -> intersection at endpoint should be null
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        Line line2 = new Line(new Vector3D(2, 0, 0), new Vector3D(2, 2, 0));
        IntervalsSet intervals1 = new IntervalsSet(0.0, 2.0);
        IntervalsSet intervals2 = new IntervalsSet(0.0, 2.0);
        SubLine sub1 = new SubLine(line1, intervals1);
        SubLine sub2 = new SubLine(line2, intervals2);
        assertNull(sub1.intersection(sub2, false));
    }

    @Test
    public void testIntersectionPointOutsideSegment() {
        // Lines intersect geometrically but point lies outside one segment
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(0, -1, 0)); // vertical through x=0
        // line1 segment covers x from 0 to 1, line2 segment covers y from 0 to -1 (so only negative y)
        IntervalsSet interval1 = new IntervalsSet(0.0, 1.0);
        IntervalsSet interval2 = new IntervalsSet(-1.0, 0.0); // y negative to 0
        SubLine sub1 = new SubLine(line1, interval1);
        SubLine sub2 = new SubLine(line2, interval2);
        // Intersection point (0,0) lies on line1 inside, but on line2 at boundary y=0 inclusive with includeEndPoints true -> should be found
        Vector3D pt = sub1.intersection(sub2, true);
        assertNotNull(pt);
        assertEquals(0.0, pt.getX(), 1e-12);
        assertEquals(0.0, pt.getY(), 1e-12);
        assertEquals(0.0, pt.getZ(), 1e-12);
        // With includeEndPoints false, (0,0) is endpoint of line2 interval (y=0 is sup) so should be null
        assertNull(sub1.intersection(sub2, false));
    }
}