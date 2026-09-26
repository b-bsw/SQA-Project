package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;

import org.jfree.chart.Layer;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.category.DefaultCategoryDataset;

public class CategoryPlotTest {

    private static final double EPS = 0.0000001;

    @Test
    public void testOrientation() {
        CategoryPlot plot = new CategoryPlot();

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());

        plot.setOrientation(PlotOrientation.VERTICAL);
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testAxes() {
        CategoryPlot plot = new CategoryPlot();

        CategoryAxis domainAxis = new CategoryAxis("Domain");
        plot.setDomainAxis(domainAxis);
        assertSame(domainAxis, plot.getDomainAxis());

        ValueAxis rangeAxis = new NumberAxis("Range");
        plot.setRangeAxis(rangeAxis);
        assertSame(rangeAxis, plot.getRangeAxis());

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_LEFT);
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getDomainAxisLocation());

        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test
    public void testDatasetAndRenderer() {
        CategoryPlot plot = new CategoryPlot();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        plot.setDataset(0, dataset);
        assertSame(dataset, plot.getDataset(0));

        DefaultCategoryItemRenderer renderer = new DefaultCategoryItemRenderer();
        plot.setRenderer(0, renderer);
        assertSame(renderer, plot.getRenderer(0));
    }

    @Test
    public void testGridLines() {
        CategoryPlot plot = new CategoryPlot();

        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());

        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertSame(CategoryAnchor.START, plot.getDomainGridlinePosition());

        Stroke domainStroke = new BasicStroke(1.2f);
        plot.setDomainGridlineStroke(domainStroke);
        assertSame(domainStroke, plot.getDomainGridlineStroke());

        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());

        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());

        Stroke rangeStroke = new BasicStroke(1.5f);
        plot.setRangeGridlineStroke(rangeStroke);
        assertSame(rangeStroke, plot.getRangeGridlineStroke());

        plot.setRangeGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());
    }

    @Test
    public void testCrosshair() {
        CategoryPlot plot = new CategoryPlot();

        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairValue(42.5);
        assertEquals(42.5, plot.getRangeCrosshairValue(), EPS);

        plot.setRangeCrosshairLockedOnData(true);
        assertTrue(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairPaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getRangeCrosshairPaint());

        Stroke stroke = new BasicStroke(2.0f);
        plot.setRangeCrosshairStroke(stroke);
        assertSame(stroke, plot.getRangeCrosshairStroke());
    }

    @Test
    public void testRenderOrder() {
        CategoryPlot plot = new CategoryPlot();

        plot.setRenderingOrder(PlotRenderingOrder.REVERSE);
        assertEquals(PlotRenderingOrder.REVERSE, plot.getRenderingOrder());

        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());

        plot.setRowRenderingOrder(SortOrder.ASCENDING);
        assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
    }

    @Test
    public void testAnnotations() {
        CategoryPlot plot = new CategoryPlot();
        assertNotNull(plot.getAnnotations());
        assertTrue(plot.getAnnotations().isEmpty());

        CategoryAnnotation annotation = new CategoryTextAnnotation("Label", "Category", 10.0);
        plot.addAnnotation(annotation);
        assertTrue(plot.getAnnotations().contains(annotation));

        assertTrue(plot.removeAnnotation(annotation));
        assertFalse(plot.removeAnnotation(annotation));
    }

    @Test
    public void testMarkers() {
        CategoryPlot plot = new CategoryPlot();

        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));

        CategoryMarker categoryMarker = new CategoryMarker("Category");
        plot.addDomainMarker(categoryMarker, Layer.FOREGROUND);
        assertNotNull(plot.getDomainMarkers(Layer.FOREGROUND));
        assertEquals(1, plot.getDomainMarkers(Layer.FOREGROUND).size());

        assertTrue(plot.removeDomainMarker(categoryMarker, Layer.FOREGROUND));
        assertEquals(0, plot.getDomainMarkers(Layer.FOREGROUND).size());

        assertNull(plot.getRangeMarkers(Layer.BACKGROUND));

        RangeMarker rangeMarker = new RangeMarker(1.0, 2.0);
        plot.addRangeMarker(rangeMarker, Layer.BACKGROUND);
        assertNotNull(plot.getRangeMarkers(Layer.BACKGROUND));
        assertEquals(1, plot.getRangeMarkers(Layer.BACKGROUND).size());

        assertTrue(plot.removeRangeMarker(rangeMarker, Layer.BACKGROUND));
    }

    @Test
    public void testDrawSharedDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.isDrawSharedDomainAxis());
    }

    @Test
    public void testWeightAndAnchorValue() {
        CategoryPlot plot = new CategoryPlot();

        plot.setWeight(5);
        assertEquals(5, plot.getWeight());

        plot.setAnchorValue(12.34);
        assertEquals(12.34, plot.getAnchorValue(), EPS);
    }

    @Test
    public void testChangeNotificationOnCrosshair() {
        CategoryPlot plot = new CategoryPlot();

        final int[] events = {0};
        PlotChangeListener listener = new PlotChangeListener() {
            @Override
            public void plotChanged(PlotChangeEvent event) {
                events[0]++;
            }
        };

        plot.setRangeCrosshairVisible(true);
        plot.addChangeListener(listener);

        plot.setRangeCrosshairValue(1.0, false);
        assertEquals(0, events[0]);

        plot.setRangeCrosshairValue(2.0, true);
        assertEquals(1, events[0]);
    }

    @Test
    public void testNullArguments() {
        CategoryPlot plot = new CategoryPlot();

        try {
            plot.setOrientation(null);
            fail("Expected IllegalArgumentException for null orientation");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.setDomainGridlinePosition(null);
            fail("Expected IllegalArgumentException for null domain gridline position");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.setDomainGridlineStroke(null);
            fail("Expected IllegalArgumentException for null domain gridline stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.setDomainGridlinePaint(null);
            fail("Expected IllegalArgumentException for null domain gridline paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.setRangeCrosshairStroke(null);
            fail("Expected IllegalArgumentException for null range crosshair stroke");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.setRangeCrosshairPaint(null);
            fail("Expected IllegalArgumentException for null range crosshair paint");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            plot.addAnnotation(null);
            fail("Expected IllegalArgumentException for null annotation");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}