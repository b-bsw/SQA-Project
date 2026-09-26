package org.jfree.chart.plot;

import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;

import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Before;
import org.junit.Test;

public class XYPlotTest {

    private XYPlot plot;

    @Before
    public void setUp() {
        plot = new XYPlot();
    }

    @Test
    public void testConstructorRegistersDataAxesAndRenderer() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        NumberAxis domain = new NumberAxis("Domain");
        NumberAxis range = new NumberAxis("Range");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        XYPlot p = new XYPlot(dataset, domain, range, renderer);

        assertSame(dataset, p.getDataset(0));
        assertSame(domain, p.getDomainAxis(0));
        assertSame(range, p.getRangeAxis(0));
        assertSame(renderer, p.getRenderer(0));
    }

    @Test
    public void testSetDatasetByIndex() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        plot.setDataset(0, dataset);
        assertSame(dataset, plot.getDataset(0));
    }

    @Test
    public void testSetDomainAndRangeAxis() {
        NumberAxis domain = new NumberAxis("Domain");
        plot.setDomainAxis(0, domain);
        assertSame(domain, plot.getDomainAxis(0));

        NumberAxis range = new NumberAxis("Range");
        plot.setRangeAxis(0, range);
        assertSame(range, plot.getRangeAxis(0));
    }

    @Test
    public void testAxisLocations() {
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);

        assertSame(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        assertSame(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test
    public void testSetRendererByIndex() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(0, renderer);
        assertSame(renderer, plot.getRenderer(0));
    }

    @Test
    public void testGridlinesAndBaselines() {
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());

        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());

        Stroke stroke = new BasicStroke(0.5f);
        plot.setDomainGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainGridlineStroke());
        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());

        Stroke rangeStroke = new BasicStroke(1.0f);
        plot.setRangeGridlineStroke(rangeStroke);
        assertSame(rangeStroke, plot.getRangeGridlineStroke());
        plot.setRangeGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());

        plot.setDomainZeroBaselineVisible(true);
        assertTrue(plot.isDomainZeroBaselineVisible());
        Stroke zeroStroke = new BasicStroke(2.0f);
        plot.setDomainZeroBaselineStroke(zeroStroke);
        assertSame(zeroStroke, plot.getDomainZeroBaselineStroke());
        plot.setDomainZeroBaselinePaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getDomainZeroBaselinePaint());

        plot.setRangeZeroBaselineVisible(true);
        assertTrue(plot.isRangeZeroBaselineVisible());
        Stroke rangeZeroStroke = new BasicStroke(3.0f);
        plot.setRangeZeroBaselineStroke(rangeZeroStroke);
        assertSame(rangeZeroStroke, plot.getRangeZeroBaselineStroke());
        plot.setRangeZeroBaselinePaint(Color.YELLOW);
        assertEquals(Color.YELLOW, plot.getRangeZeroBaselinePaint());
    }

    @Test
    public void testDomainCrosshairSettings() {
        plot.setDomainCrosshairVisible(true);
        assertTrue(plot.isDomainCrosshairVisible());

        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());

        plot.setDomainCrosshairValue(12.5);
        assertEquals(12.5, plot.getDomainCrosshairValue(), 0.0);

        plot.setDomainCrosshairValue(13.5, false);
        assertEquals(13.5, plot.getDomainCrosshairValue(), 0.0);

        Stroke stroke = new BasicStroke(1.5f);
        plot.setDomainCrosshairStroke(stroke);
        assertSame(stroke, plot.getDomainCrosshairStroke());

        plot.setDomainCrosshairPaint(Color.MAGENTA);
        assertEquals(Color.MAGENTA, plot.getDomainCrosshairPaint());
    }

    @Test
    public void testRangeCrosshairSettings() {
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(20.5);
        assertEquals(20.5, plot.getRangeCrosshairValue(), 0.0);

        plot.setRangeCrosshairValue(22.5, false);
        assertEquals(22.5, plot.getRangeCrosshairValue(), 0.0);

        Stroke stroke = new BasicStroke(2.5f);
        plot.setRangeCrosshairStroke(stroke);
        assertSame(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.ORANGE);
        assertEquals(Color.ORANGE, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStrokeNullThrows() {
        plot.setDomainCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNullThrows() {
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testRenderingOrders() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());

        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals(SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullDatasetRenderingOrderThrows() {
        plot.setDatasetRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullSeriesRenderingOrderThrows() {
        plot.setSeriesRenderingOrder(null);
    }

    @Test
    public void testAnnotations() {
        assertEquals(0, plot.getAnnotations().size());

        XYTextAnnotation annotation = new XYTextAnnotation("x", 1.0, 2.0);
        plot.addAnnotation(annotation);
        assertEquals(1, plot.getAnnotations().size());

        assertTrue(plot.removeAnnotation(annotation));
        assertEquals(0, plot.getAnnotations().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAnnotationThrows() {
        plot.addAnnotation((XYAnnotation) null);
    }

    @Test
    public void testQuadrantPaint() {
        plot.setQuadrantPaint(0, Color.RED);
        assertSame(Color.RED, plot.getQuadrantPaint(0));

        plot.setQuadrantPaint(3, Color.BLUE);
        assertSame(Color.BLUE, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuadrantPaintInvalidIndexThrows() {
        plot.setQuadrantPaint(4, Color.RED);
    }

    @Test
    public void testRemoveNullMarkerThrows() {
        try {
            plot.removeDomainMarker(null, Layer.FOREGROUND);
            fail("Expected IllegalArgumentException for null domain marker");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.removeRangeMarker(null, Layer.FOREGROUND);
            fail("Expected IllegalArgumentException for null range marker");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testZoomDomainAndRangeAxes() {
        NumberAxis domain = new NumberAxis("Domain");
        domain.setRange(0.0, 100.0);
        NumberAxis range = new NumberAxis("Range");
        range.setRange(0.0, 100.0);

        plot.setDomainAxis(0, domain);
        plot.setRangeAxis(0, range);

        plot.zoomDomainAxes(0.5, null, null);
        plot.zoomRangeAxes(0.5, null, null);

        assertEquals(50.0, domain.getRange().getLength(), 1e-8);
        assertEquals(50.0, range.getRange().getLength(), 1e-8);
    }
}