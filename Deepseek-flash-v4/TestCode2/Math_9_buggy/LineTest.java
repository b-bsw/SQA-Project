package org.apache.commons.math3.geometry.euclidean.threed;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LineTest {

    private Line lineX;
    private Line lineY;
    private Line parallelLineX;
    private Line skewLine;

    @Before
    public void setUp() {
        lineX = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        lineY = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        parallelLineX = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        skewLine = new Line(new Vector3D(0, 1, 0), new Vector3D(0, 1, 1));
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(1.0, lineX.getDirection().getX(), 1e-10);
        assertEquals(0.0, lineX.getDirection().getY(), 1e-10);
        assertEquals(0.0, lineX.getDirection().getZ(), 1e-10);
        assertEquals(0.0, lineX.getOrigin().getX(), 1e-10);
        assertEquals(0.0, lineX.getOrigin().getY(), 1e-10);
        assertEquals(0.0, lineX.getOrigin().getZ(), 1e-10);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorEqualPointsThrows() {
        new Line(new Vector3D(1, 2, 3), new Vector3D(1, 2, 3));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testResetEqualPointsThrows() {
        lineX.reset(new Vector3D(0, 0, 0), new Vector3D(0, 0, 0));
    }

    @Test
    public void testCopyConstructor() {
        Line copy = new Line(lineX);
        assertEquals(lineX.getDirection().getX(), copy.getDirection().getX(), 0.0);
        assertEquals(lineX.getOrigin().getX(), copy.getOrigin().getX(), 0.0);
    }

    @Test
    public void testRevert() {
        Line reverted = lineX.revert();
        assertEquals(-1.0, reverted.getDirection().getX(), 1e-10);
        assertEquals(0.0, reverted.getDirection().getY(), 1e-10);
        assertEquals(0.0, reverted.getOrigin().getX(), 1e-10);
    }

    @Test
    public void testAbscissaAndPointAt() {
        assertEquals(3.0, lineX.getAbscissa(new Vector3D(3, 0, 0)), 1e-10);
        Vector3D p = lineX.pointAt(5.0);
        assertEquals(5.0, p.getX(), 1e-10);
        assertEquals(0.0, p.getY(), 1e-10);
        assertEquals(0.0, p.getZ(), 1e-10);
        assertEquals(5.0, lineX.getAbscissa(lineX.pointAt(5.0)), 1e-10);
    }

    @Test
    public void testToSubSpaceAndToSpace() {
        Vector1D v = lineX.toSubSpace(new Vector3D(2, 0, 0));
        assertEquals(2.0, v.getX(), 1e-10);
        Vector3D p = lineX.toSpace(new Vector1D(-1.0));
        assertEquals(-1.0, p.getX(), 1e-10);
        assertEquals(0.0, p.getY(), 1e-10);
        assertEquals(0.0, p.getZ(), 1e-10);
    }

    @Test
    public void testContains() {
        assertTrue(lineX.contains(new Vector3D(2, 0, 0)));
        assertFalse(lineX.contains(new Vector3D(2, 1, 0)));
    }

    @Test
    public void testDistancePoint() {
        assertEquals(0.0, lineX.distance(new Vector3D(2, 0, 0)), 1e-10);
        assertEquals(1.0, lineX.distance(new Vector3D(2, 1, 0)), 1e-10);
        assertEquals(2.0, lineX.distance(new Vector3D(2, 0, 2)), 1e-10);
    }

    @Test
    public void testDistanceLines() {
        assertEquals(0.0, lineX.distance(lineY), 1e-10);
        assertEquals(1.0, lineX.distance(parallelLineX), 1e-10);
        assertEquals(1.0, lineX.distance(skewLine), 1e-10);
    }

    @Test
    public void testClosestPoint() {
        Vector3D inter = lineX.closestPoint(lineY);
        assertEquals(0.0, inter.getX(), 1e-10);
        assertEquals(0.0, inter.getY(), 1e-10);
        Vector3D para = lineX.closestPoint(parallelLineX);
        assertEquals(0.0, para.getX(), 1e-10);
        assertEquals(0.0, para.getY(), 1e-10);
    }

    @Test
    public void testIntersection() {
        Vector3D inter = lineX.intersection(lineY);
        assertNotNull(inter);
        assertEquals(0.0, inter.getX(), 1e-10);
        assertEquals(0.0, inter.getY(), 1e-10);
        assertNull(lineX.intersection(parallelLineX));
        assertNull(lineX.intersection(skewLine));
    }

    @Test
    public void testIsSimilarTo() {
        assertTrue(lineX.isSimilarTo(new Line(new Vector3D(1, 0, 0), new Vector3D(2, 0, 0))));
        assertTrue(lineX.isSimilarTo(new Line(new Vector3D(0, 0, 0), new Vector3D(-1, 0, 0))));
        assertFalse(lineX.isSimilarTo(lineY));
        assertFalse(lineX.isSimilarTo(parallelLineX));
    }

    @Test
    public void testWholeLine() {
        assertNotNull(lineX.wholeLine());
    }

    @Test
    public void testResetChangesLine() {
        lineX.reset(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertEquals(0.0, lineX.getDirection().getX(), 1e-10);
        assertEquals(1.0, lineX.getDirection().getY(), 1e-10);
    }

    @Test(expected = NullPointerException.class)
    public void testContainsNull() {
        lineX.contains(null);
    }
}