package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.xy.XYSeriesCollection;

public class XYPlotTest {

    private static final double EPS = 0.0001;

    @Test
    public void testDefaults() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getPlotType());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(1, plot.getDomainAxisCount());
        assertEquals(1, plot.getRangeAxisCount());
        assertEquals(1, plot.getDatasetCount());
        assertEquals(1, plot.getRendererCount());
        assertNotNull(plot.getAxisOffset());
        assertFalse(plot.isDomainPannable());
        assertFalse(plot.isRangePannable());
        assertEquals(0, plot.getWeight());
        assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test
    public void testOrientationAndOffset() {
        XYPlot plot = new XYPlot();

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());

        try {
            plot.setOrientation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        RectangleInsets insets = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setAxisOffset(insets);
        assertSame(insets, plot.getAxisOffset());

        try {
            plot.setAxisOffset(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAxisSettersAndGetters() {
        XYPlot plot = new XYPlot();

        NumberAxis x = new NumberAxis("X");
        plot.setDomainAxis(0, x, false);
        assertSame(x, plot.getDomainAxis(0));

        NumberAxis y = new NumberAxis("Y");
        plot.setRangeAxis(0, y, false);
        assertSame(y, plot.getRangeAxis(0));
    }

    @Test
    public void testDatasetAndRenderer() {
        XYPlot plot = new XYPlot();

        XYSeriesCollection dataset = new XYSeriesCollection();
        plot.setDataset(0, dataset);
        assertSame(dataset, plot.getDataset(0));

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(0, renderer, false);
        assertSame(renderer, plot.getRenderer(0));
        assertEquals(0, plot.getRendererIndex(renderer));
    }

    @Test
    public void testCrosshairSetters() {
        XYPlot plot = new XYPlot();

        plot.setDomainCrosshairVisible(true);
        assertTrue(plot.isDomainCrosshairVisible());

        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());

        plot.setDomainCrosshairValue(12.5);
        assertEquals(12.5, plot.getDomainCrosshairValue(), EPS);

        BasicStroke stroke = new BasicStroke(1.0f);
        plot.setDomainCrosshairStroke(stroke);
        assertSame(stroke, plot.getDomainCrosshairStroke());

        plot.setDomainCrosshairPaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainCrosshairPaint());

        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(99.5);
        assertEquals(99.5, plot.getRangeCrosshairValue(), EPS);

        plot.setRangeCrosshairStroke(stroke);
        assertSame(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeCrosshairPaint());
    }

    @Test
    public void testGridlineSetters() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(2.0f);

        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());

        plot.setDomainMinorGridlinesVisible(true);
        assertTrue(plot.isDomainMinorGridlinesVisible());

        plot.setDomainGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainGridlineStroke());

        plot.setDomainGridlinePaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getDomainGridlinePaint());

        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());

        plot.setRangeMinorGridlinesVisible(true);
        assertTrue(plot.isRangeMinorGridlinesVisible());

        plot.setRangeGridlineStroke(stroke);
        assertSame(stroke, plot.getRangeGridlineStroke());

        plot.setRangeGridlinePaint(Color.CYAN);
        assertEquals(Color.CYAN, plot.getRangeGridlinePaint());
    }

    @Test
    public void testZeroBaselineSetters() {
        XYPlot plot = new XYPlot();
        BasicStroke stroke = new BasicStroke(3.0f);

        plot.setDomainZeroBaselineVisible(true);
        assertTrue(plot.isDomainZeroBaselineVisible());

        plot.setDomainZeroBaselineStroke(stroke);
        assertSame(stroke, plot.getDomainZeroBaselineStroke());

        plot.setDomainZeroBaselinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainZeroBaselinePaint());

        plot.setRangeZeroBaselineVisible(true);
        assertTrue(plot.isRangeZeroBaselineVisible());

        plot.setRangeZeroBaselineStroke(stroke);
        assertSame(stroke, plot.getRangeZeroBaselineStroke());

        plot.setRangeZeroBaselinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeZeroBaselinePaint());
    }

    @Test
    public void testDomainMarkerOperations() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(3.0);

        plot.addDomainMarker(marker, Layer.FOREGROUND);
        Collection<?> markers = plot.getDomainMarkers(Layer.FOREGROUND);

        assertNotNull(markers);
        assertTrue(markers.contains(marker));
        assertTrue(plot.removeDomainMarker(marker, Layer.FOREGROUND));
    }

    @Test
    public void testRangeMarkerOperations() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(4.0);

        plot.addRangeMarker(marker, Layer.BACKGROUND);
        Collection<?> markers = plot.getRangeMarkers(Layer.BACKGROUND);

        assertNotNull(markers);
        assertTrue(markers.contains(marker));
        assertTrue(plot.removeRangeMarker(marker, Layer.BACKGROUND));
    }

    @Test
    public void testAnnotationOperations() {
        XYPlot plot = new XYPlot();
        XYTextAnnotation annotation = new XYTextAnnotation("text", 1.0, 2.0);

        plot.addAnnotation(annotation);
        List annotations = plot.getAnnotations();

        assertEquals(1, annotations.size());
        assertSame(annotation, annotations.get(0));

        assertTrue(plot.removeAnnotation(annotation));
        assertFalse(plot.removeAnnotation(annotation));

        try {
            plot.removeAnnotation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFixedAxisSpaces() {
        XYPlot plot = new XYPlot();

        AxisSpace domainSpace = new AxisSpace();
        plot.setFixedDomainAxisSpace(domainSpace);
        assertSame(domainSpace, plot.getFixedDomainAxisSpace());

        plot.setFixedDomainAxisSpace(null);
        assertNull(plot.getFixedDomainAxisSpace());

        AxisSpace rangeSpace = new AxisSpace();
        plot.setFixedRangeAxisSpace(rangeSpace);
        assertSame(rangeSpace, plot.getFixedRangeAxisSpace());

        plot.setFixedRangeAxisSpace(null);
        assertNull(plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testRenderOrderAndWeight() {
        XYPlot plot = new XYPlot();

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        assertSame(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());

        plot.setSeriesRenderingOrder(SeriesRenderingOrder.REVERSE);
        assertSame(SeriesRenderingOrder.REVERSE, plot.getSeriesRenderingOrder());

        try {
            plot.setDatasetRenderingOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.setSeriesRenderingOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    @Test
    public void testPannable() {
        XYPlot plot = new XYPlot();

        plot.setDomainPannable(true);
        assertTrue(plot.isDomainPannable());

        plot.setRangePannable(true);
        assertTrue(plot.isRangePannable());
    }

    @Test
    public void testQuadrantMethods() {
        XYPlot plot = new XYPlot();

        Point2D origin = new Point2D.Double(1.0, 2.0);
        plot.setQuadrantOrigin(origin);
        assertSame(origin, plot.getQuadrantOrigin());

        try {
            plot.setQuadrantOrigin(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        plot.setQuadrantPaint(0, Color.RED);
        assertEquals(Color.RED, plot.getQuadrantPaint(0));
    }
}