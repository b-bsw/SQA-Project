package org.jfree.chart.util;

import static org.junit.Assert.*;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import org.junit.Test;

public class ShapeUtilitiesTest {

    @Test
    public void testClone() {
        assertNull(ShapeUtilities.clone(null));

        Line2D line = new Line2D.Double(1, 2, 3, 4);
        Shape cloned = ShapeUtilities.clone(line);
        assertNotNull(cloned);
        assertNotSame(line, cloned);

        Line2D clonedLine = (Line2D) cloned;
        assertEquals(line.getP1(), clonedLine.getP1());
        assertEquals(line.getP2(), clonedLine.getP2());
    }

    @Test
    public void testEqualShape() {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));

        Shape line1 = new Line2D.Double(0, 0, 1, 1);
        Shape line2 = new Line2D.Double(0, 0, 1, 1);
        assertTrue(ShapeUtilities.equal(line1, line2));
        assertFalse(ShapeUtilities.equal((Shape) null, line1));

        Rectangle2D rect = new Rectangle2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal((Shape) rect, (Shape) rect));
    }

    @Test
    public void testEqualLine2D() {
        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));

        Line2D line1 = new Line2D.Double(1, 2, 3, 4);
        Line2D line2 = new Line2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal(line1, line2));
        assertFalse(ShapeUtilities.equal(line1, null));
        assertFalse(ShapeUtilities.equal(null, line1));

        assertFalse(ShapeUtilities.equal(new Line2D.Double(0, 2, 3, 4), line2));
        assertFalse(ShapeUtilities.equal(new Line2D.Double(1, 2, 0, 4), line2));
    }

    @Test
    public void testEqualShapeDispatch() {
        assertTrue(ShapeUtilities.equal(
                (Shape) new Line2D.Double(0, 0, 1, 1),
                (Shape) new Line2D.Double(0, 0, 1, 1)));

        assertTrue(ShapeUtilities.equal(
                (Shape) new Ellipse2D.Double(1, 2, 3, 4),
                (Shape) new Ellipse2D.Double(1, 2, 3, 4)));

        Arc2D arc = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.PIE);
        assertTrue(ShapeUtilities.equal(
                (Shape) arc,
                (Shape) new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.PIE)));
    }

    @Test
    public void testEqualEllipse2D() {
        assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));

        Ellipse2D e = new Ellipse2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal(e, new Ellipse2D.Double(1, 2, 3, 4)));
        assertFalse(ShapeUtilities.equal(e, null));
        assertFalse(ShapeUtilities.equal(null, e));
        assertFalse(ShapeUtilities.equal(new Ellipse2D.Double(1, 2, 3, 5), e));
    }

    @Test
    public void testEqualArc2D() {
        Arc2D arc = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.PIE);

        assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
        assertTrue(ShapeUtilities.equal(arc,
                new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.PIE)));

        assertFalse(ShapeUtilities.equal(arc, null));
        assertFalse(ShapeUtilities.equal(null, arc));

        assertFalse(ShapeUtilities.equal(
                new Arc2D.Double(0, 0, 11, 10, 0, 90, Arc2D.PIE), arc));
        assertFalse(ShapeUtilities.equal(
                new Arc2D.Double(0, 0, 10, 10, 10, 90, Arc2D.PIE), arc));
        assertFalse(ShapeUtilities.equal(
                new Arc2D.Double(0, 0, 10, 10, 0, 180, Arc2D.PIE), arc));
        assertFalse(ShapeUtilities.equal(
                new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.CHORD), arc));
    }

    @Test
    public void testEqualPolygon() {
        Polygon p = new Polygon(new int[]{0, 1, 1}, new int[]{0, 0, 1}, 3);

        assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
        assertTrue(ShapeUtilities.equal(p,
                new Polygon(new int[]{0, 1, 1}, new int[]{0, 0, 1}, 3)));

        assertFalse(ShapeUtilities.equal(p, null));
        assertFalse(ShapeUtilities.equal(null, p));

        assertFalse(ShapeUtilities.equal(
                new Polygon(new int[]{0, 2, 1}, new int[]{0, 0, 1}, 3), p));
        assertFalse(ShapeUtilities.equal(
                new Polygon(new int[]{0, 1, 1}, new int[]{0, 0, 2}, 3), p));
        assertFalse(ShapeUtilities.equal(
                new Polygon(new int[]{0, 1}, new int[]{0, 0}, 2), p));
    }

    @Test
    public void testEqualGeneralPath() {
        GeneralPath p1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p1.moveTo(0f, 0f);
        p1.lineTo(10f, 0f);
        p1.lineTo(10f, 10f);
        p1.closePath();

        GeneralPath p2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p2.moveTo(0f, 0f);
        p2.lineTo(0f, 10f);
        p2.lineTo(10f, 10f);
        p2.closePath();

        // A regression test: the real bug was comparing p2 with p1.
        assertTrue(ShapeUtilities.equal(p1, p1));
        assertFalse(ShapeUtilities.equal(p1, p2));

        GeneralPath evenOdd = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        evenOdd.moveTo(0f, 0f);
        evenOdd.lineTo(10f, 0f);
        evenOdd.lineTo(10f, 10f);
        evenOdd.closePath();

        assertFalse(ShapeUtilities.equal(p1, evenOdd));
    }

    @Test
    public void testCreateTranslatedShape() {
        Shape base = new Rectangle2D.Double(0, 0, 10, 10);

        Shape translated = ShapeUtilities.createTranslatedShape(base, 5, 10);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(5, bounds.getX(), 0.0001);
        assertEquals(10, bounds.getY(), 0.0001);

        Shape translatedWithAnchor = ShapeUtilities.createTranslatedShape(
                base, 10, 20, new Point2D.Double(1, 2));
        bounds = translatedWithAnchor.getBounds2D();
        assertEquals(9, bounds.getX(), 0.0001);
        assertEquals(18, bounds.getY(), 0.0001);

        try {
            ShapeUtilities.createTranslatedShape(null, 0, 0);
            fail("Expected IllegalArgumentException for null shape.");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            ShapeUtilities.createTranslatedShape(base, 0, 0, null);
            fail("Expected IllegalArgumentException for null anchor.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRotateShape() {
        assertNull(ShapeUtilities.rotateShape(null, 0, 0, 0));

        Shape base = new Rectangle2D.Double(0, 0, 10, 10);
        Shape rotated = ShapeUtilities.rotateShape(base, Math.PI / 2, 0, 0);
        assertNotNull(rotated);

        Rectangle2D bounds = rotated.getBounds2D();
        assertEquals(-10, bounds.getX(), 0.0001);
        assertEquals(0, bounds.getY(), 0.0001);
        assertEquals(10, bounds.getWidth(), 0.0001);
        assertEquals(10, bounds.getHeight(), 0.0001);
    }

    @Test
    public void testDrawRotatedShape() {
        BufferedImage image = new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        try {
            ShapeUtilities.drawRotatedShape(
                    g2, new Rectangle2D.Double(0, 0, 10, 10), Math.PI / 4, 10f, 10f);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testCreateLineRegion() {
        Shape horizontal = ShapeUtilities.createLineRegion(
                new Line2D.Float(0f, 0f, 10f, 0f), 2f);
        assertNotNull(horizontal);
        assertEquals(2.0, horizontal.getBounds2D().getHeight(), 0.0001);

        Shape vertical = ShapeUtilities.createLineRegion(
                new Line2D.Float(0f, 0f, 0f, 10f), 2f);
        assertNotNull(vertical);

        try {
            ShapeUtilities.createLineRegion(null, 2f);
            fail("Expected IllegalArgumentException for null line.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetPointInRectangle() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);

        Point2D p = ShapeUtilities.getPointInRectangle(5, 5, area);
        assertEquals(5, p.getX(), 0.0001);
        assertEquals(5, p.getY(), 0.0001);

        p = ShapeUtilities.getPointInRectangle(20, -5, area);
        assertEquals(10, p.getX(), 0.0001);
        assertEquals(0, p.getY(), 0.0001);

        p = ShapeUtilities.getPointInRectangle(-1, 20, area);
        assertEquals(0, p.getX(), 0.0001);
        assertEquals(10, p.getY(), 0.0001);

        try {
            ShapeUtilities.getPointInRectangle(1, 2, null);
            fail("Expected NullPointerException for null rectangle.");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testContains() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);

        assertTrue(ShapeUtilities.contains(
                rect1, new Rectangle2D.Double(1, 1, 5, 5)));
        assertTrue(ShapeUtilities.contains(
                rect1, new Rectangle2D.Double(0, 0, 10, 10)));
        assertTrue(ShapeUtilities.contains(
                rect1, new Rectangle2D.Double(2, 3, 0, 0)));

        assertFalse(ShapeUtilities.contains(
                rect1, new Rectangle2D.Double(0, 0, 10, 11)));
        assertFalse(ShapeUtilities.contains(
                rect1, new Rectangle2D.Double(-0.1, 0, 5, 5)));
    }

    @Test
    public void testIntersects() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);

        assertTrue(ShapeUtilities.intersects(
                rect1, new Rectangle2D.Double(2, 2, 5, 5)));
        assertTrue(ShapeUtilities.intersects(
                rect1, new Rectangle2D.Double(10, 0, 1, 1)));
        assertTrue(ShapeUtilities.intersects(
                rect1, new Rectangle2D.Double(1, 1, 20, 20)));

        assertFalse(ShapeUtilities.intersects(
                rect1, new Rectangle2D.Double(11, 0, 1, 1)));
    }

    @Test
    public void testShapeFactories() {
        assertTrue(ShapeUtilities.createDiagonalCross(10f, 2f)
                .getBounds2D().getWidth() > 0);
        assertTrue(ShapeUtilities.createRegularCross(10f, 2f)
                .getBounds2D().getWidth() > 0);
        assertTrue(ShapeUtilities.createDiamond(5f)
                .getBounds2D().getWidth() > 0);
        assertTrue(ShapeUtilities.createUpTriangle(5f)
                .getBounds2D().getWidth() > 0);
        assertTrue(ShapeUtilities.createDownTriangle(5f)
                .getBounds2D().getWidth() > 0);
    }
}