package org.apache.commons.math3.geometry.euclidean.twod;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.junit.Test;

public class PolygonsSetTest {

    @Test
    public void testDefaultConstructorWholeSpace() {
        PolygonsSet p = new PolygonsSet();
        assertEquals(Double.POSITIVE_INFINITY, p.getSize(), 0.0);
        assertTrue(Double.isNaN(p.getBarycenter().getX()));
        Vector2D[][] vertices = p.getVertices();
        assertNotNull(vertices);
        assertEquals(0, vertices.length);
    }

    @Test
    public void testEmptyBoundaryWholeSpace() {
        PolygonsSet p = new PolygonsSet(new ArrayList<SubHyperplane<Euclidean2D>>());
        assertEquals(Double.POSITIVE_INFINITY, p.getSize(), 0.0);
        assertTrue(Double.isNaN(p.getBarycenter().getX()));
    }

    @Test
    public void testEmptyLeafTree() {
        PolygonsSet p = new PolygonsSet(new BSPTree<Euclidean2D>(Boolean.FALSE));
        assertEquals(0.0, p.getSize(), 0.0);
        assertEquals(0.0, p.getBarycenter().getX(), 0.0);
        assertEquals(0.0, p.getBarycenter().getY(), 0.0);
        assertEquals(0, p.getVertices().length);
    }

    @Test
    public void testFiniteBox() {
        PolygonsSet p = new PolygonsSet(1.0, 4.0, 2.0, 6.0);
        assertEquals(12.0, p.getSize(), 1.0e-10);
        assertEquals(2.5, p.getBarycenter().getX(), 1.0e-10);
        assertEquals(4.0, p.getBarycenter().getY(), 1.0e-10);

        Vector2D[][] vertices = p.getVertices();
        assertNotNull(vertices);
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
        for (Vector2D point : vertices[0]) {
            assertNotNull(point);
        }
    }

    @Test
    public void testSingleInfiniteLineBoundary() {
        Line line = new Line(new Vector2D(0.0, 0.0), new Vector2D(1.0, 0.0));
        Collection<SubHyperplane<Euclidean2D>> boundary =
            new ArrayList<SubHyperplane<Euclidean2D>>();
        boundary.add(line.wholeHyperplane());

        PolygonsSet p = new PolygonsSet(boundary);
        assertEquals(Double.POSITIVE_INFINITY, p.getSize(), 0.0);
        assertTrue(Double.isNaN(p.getBarycenter().getX()));

        Vector2D[][] vertices = p.getVertices();
        assertEquals(1, vertices.length);
        assertNull(vertices[0][0]);
        assertEquals(3, vertices[0].length);
    }

    @Test
    public void testInvertedBoxIsInfiniteExterior() {
        PolygonsSet p = new PolygonsSet(1.0, 0.0, 0.0, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, p.getSize(), 0.0);
        assertTrue(Double.isNaN(p.getBarycenter().getX()));

        Vector2D[][] vertices = p.getVertices();
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
        assertNotNull(vertices[0][0]);
    }

    @Test
    public void testRegionCheckPoint() {
        PolygonsSet p = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        assertSame(Region.Location.INSIDE, p.checkPoint(new Vector2D(0.5, 0.5)));
        assertSame(Region.Location.OUTSIDE, p.checkPoint(new Vector2D(1.5, 0.5)));
        assertSame(Region.Location.BOUNDARY, p.checkPoint(new Vector2D(0.5, 1.0)));
    }

    @Test
    public void testBuildNew() {
        PolygonsSet p = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        PolygonsSet rebuilt = p.buildNew(new BSPTree<Euclidean2D>(Boolean.TRUE));
        assertTrue(rebuilt != p);
        assertEquals(Double.POSITIVE_INFINITY, rebuilt.getSize(), 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testNullBoundaryThrowsNullPointerException() {
        new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) null);
    }
}