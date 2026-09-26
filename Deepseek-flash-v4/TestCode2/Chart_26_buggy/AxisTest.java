package org.jfree.chart.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.EventListener;
import java.util.List;

import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AxisTest {

    private TestAxis axis;
    private int notifications;
    private AxisChangeListener listener;

    @Before
    public void setUp() {
        axis = new TestAxis("Test");
        notifications = 0;
        listener = new AxisChangeListener() {
            @Override
            public void axisChanged(AxisChangeEvent event) {
                notifications++;
            }
        };
        axis.addChangeListener(listener);
    }

    @After
    public void tearDown() {
        axis.removeChangeListener(listener);
    }

    @Test
    public void testConstructorInitialState() {
        assertEquals("Test", axis.getLabel());
        assertTrue(axis.isVisible());
        assertTrue(axis.isAxisLineVisible());
        assertTrue(axis.isTickLabelsVisible());
        assertTrue(axis.isTickMarksVisible());
        assertNull(axis.getPlot());
        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
        assertEquals(0.0, axis.getLabelAngle(), 0.0);
        assertEquals(0.0, axis.getFixedDimension(), 0.0);
        assertEquals(0.0f, axis.getTickMarkInsideLength(), 0.0f);
        assertEquals(2.0f, axis.getTickMarkOutsideLength(), 0.0f);
        assertNotNull(axis.getLabelFont());
        assertNotNull(axis.getTickLabelFont());
        assertNotNull(axis.getAxisLineStroke());
        assertNotNull(axis.getTickMarkStroke());
    }

    @Test
    public void testSetVisibleNotifiesOnlyOnChange() {
        assertTrue(axis.isVisible());

        axis.setVisible(false);
        assertFalse(axis.isVisible());
        assertEquals(1, notifications);

        axis.setVisible(false);
        assertEquals(1, notifications);

        axis.setVisible(true);
        assertTrue(axis.isVisible());
        assertEquals(2, notifications);
    }

    @Test
    public void testSetLabelChangesAndNotifies() {
        axis.setLabel("New Label");
        assertEquals("New Label", axis.getLabel());
        assertEquals(1, notifications);

        axis.setLabel("New Label");
        assertEquals(1, notifications);

        axis.setLabel("");
        assertEquals("", axis.getLabel());
        assertEquals(2, notifications);

        axis.setLabel(null);
        assertNull(axis.getLabel());
        assertEquals(3, notifications);

        axis.setLabel(null);
        assertEquals(3, notifications);

        axis.setLabel("After null");
        assertEquals("After null", axis.getLabel());
        assertEquals(4, notifications);
    }

    @Test
    public void testSetLabelFont() {
        Font font = new Font("Serif", Font.BOLD, 16);
        axis.setLabelFont(font);
        assertSame(font, axis.getLabelFont());
        assertEquals(1, notifications);

        axis.setLabelFont(font);
        assertEquals(1, notifications);
    }

    @Test
    public void testSetLabelFontNull() {
        try {
            axis.setLabelFont(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'font' argument.", e.getMessage());
        }
    }

    @Test
    public void testSetLabelPaintAndInsets() {
        Paint paint = Color.RED;
        axis.setLabelPaint(paint);
        assertSame(paint, axis.getLabelPaint());
        assertEquals(1, notifications);

        RectangleInsets insets = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        axis.setLabelInsets(insets);
        assertSame(insets, axis.getLabelInsets());
        assertEquals(2, notifications);
    }

    @Test
    public void testLabelNullArguments() {
        try {
            axis.setLabelPaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            axis.setLabelInsets(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLabelToolTipAndURL() {
        axis.setLabelToolTip("tip");
        axis.setLabelURL("http://example.com");

        assertEquals("tip", axis.getLabelToolTip());
        assertEquals("http://example.com", axis.getLabelURL());

        axis.setLabelToolTip(null);
        axis.setLabelURL(null);

        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
    }

    @Test
    public void testSetLabelAngleAndFixedDimension() {
        axis.setLabelAngle(1.25);
        axis.setFixedDimension(72.5);

        assertEquals(1.25, axis.getLabelAngle(), 0.0);
        assertEquals(72.5, axis.getFixedDimension(), 0.0);
    }

    @Test
    public void testAxisLineSettings() {
        axis.setAxisLineVisible(false);
        assertFalse(axis.isAxisLineVisible());

        Paint paint = Color.BLUE;
        axis.setAxisLinePaint(paint);
        assertSame(paint, axis.getAxisLinePaint());

        Stroke stroke = new BasicStroke(2.0f);
        axis.setAxisLineStroke(stroke);
        assertSame(stroke, axis.getAxisLineStroke());
    }

    @Test
    public void testAxisLineNullArguments() {
        try {
            axis.setAxisLinePaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            axis.setAxisLineStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTickLabelsSettings() {
        axis.setTickLabelsVisible(false);
        assertFalse(axis.isTickLabelsVisible());

        Font font = new Font("Monospaced", Font.ITALIC, 9);
        axis.setTickLabelFont(font);
        assertSame(font, axis.getTickLabelFont());

        Paint paint = Color.GREEN;
        axis.setTickLabelPaint(paint);
        assertSame(paint, axis.getTickLabelPaint());

        RectangleInsets insets = new RectangleInsets(1.0, 1.0, 1.0, 1.0);
        axis.setTickLabelInsets(insets);
        assertSame(insets, axis.getTickLabelInsets());
    }

    @Test
    public void testTickLabelNullArguments() {
        try {
            axis.setTickLabelFont(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            axis.setTickLabelPaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            axis.setTickLabelInsets(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTickMarksSettings() {
        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());

        axis.setTickMarkInsideLength(4.0f);
        assertEquals(4.0f, axis.getTickMarkInsideLength(), 0.0f);

        axis.setTickMarkOutsideLength(5.0f);
        assertEquals(5.0f, axis.getTickMarkOutsideLength(), 0.0f);

        Stroke stroke = new BasicStroke(3.0f);
        axis.setTickMarkStroke(stroke);
        assertSame(stroke, axis.getTickMarkStroke());

        Paint paint = Color.CYAN;
        axis.setTickMarkPaint(paint);
        assertSame(paint, axis.getTickMarkPaint());
    }

    @Test
    public void testTickMarkNullArguments() {
        try {
            axis.setTickMarkStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            axis.setTickMarkPaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChangeListeners() {
        assertTrue(axis.hasListener(listener));

        axis.removeChangeListener(listener);
        assertFalse(axis.hasListener(listener));

        axis.addChangeListener(listener);
        assertTrue(axis.hasListener(listener));
    }

    @Test
    public void testEquals() {
        TestAxis a = new TestAxis("Same");
        TestAxis b = new TestAxis("Same");

        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
        assertTrue(a.equals(a));
        assertFalse(a.equals(null));
        assertFalse(a.equals(""));

        b.setLabel("Different");
        assertFalse(a.equals(b));
    }

    @Test
    public void testClone() throws Exception {
        TestAxis a = new TestAxis("Clone");
        TestAxis c = (TestAxis) a.clone();

        assertNotSame(a, c);
        assertEquals(a, c);
    }

    private static class TestAxis extends Axis {

        TestAxis(String label) {
            super(label);
        }

        @Override
        public void configure() {
        }

        @Override
        public AxisSpace reserveSpace(Graphics2D g2, Plot plot,
                Rectangle2D plotArea, RectangleEdge edge, AxisSpace space) {
            return null;
        }

        @Override
        public AxisState draw(Graphics2D g2, double cursor,
                Rectangle2D plotArea, Rectangle2D dataArea,
                RectangleEdge edge, PlotRenderingInfo plotState) {
            return null;
        }

        @Override
        public List refreshTicks(Graphics2D g2, AxisState state,
                Rectangle2D dataArea, RectangleEdge edge) {
            return null;
        }
    }
}