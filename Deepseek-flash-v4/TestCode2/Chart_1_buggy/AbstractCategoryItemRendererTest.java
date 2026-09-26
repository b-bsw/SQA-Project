package org.jfree.chart.renderer.category;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.RenderingSource;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryDatasetSelectionState;
import org.jfree.data.category.SelectableCategoryDataset;
public class AbstractCategoryItemRendererTest {
    private AbstractCategoryItemRenderer renderer;
    @Before
    public void setUp() {
        renderer = new AbstractCategoryItemRenderer() {
            @Override
            public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, boolean selected, int pass) {
            }
        };
    }
    @Test
    public void testSetPlotNullThrowsException() {
        try {
            renderer.setPlot(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testSetPlotNormal() {
        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);
        assertSame(plot, renderer.getPlot());
    }
    @Test
    public void testGetItemLabelGeneratorNoSeriesGenerator() {
        CategoryItemLabelGenerator gen = renderer.getItemLabelGenerator(0, 0, false);
        assertNull(gen);
    }
    @Test
    public void testGetItemLabelGeneratorWithSeriesGenerator() {
        CategoryItemLabelGenerator gen1 = new CategoryItemLabelGenerator() {
            @Override
            public String generateLabel(CategoryDataset dataset, int row, int column) {
                return "test";
            }
        };
        renderer.setSeriesItemLabelGenerator(0, gen1, false);
        CategoryItemLabelGenerator result = renderer.getItemLabelGenerator(0, 0, false);
        assertSame(gen1, result);
    }
    @Test
    public void testGetItemLabelGeneratorNullSeriesGeneratorUsesBase() {
        CategoryItemLabelGenerator baseGen = new CategoryItemLabelGenerator() {
            @Override
            public String generateLabel(CategoryDataset dataset, int row, int column) {
                return "base";
            }
        };
        renderer.setBaseItemLabelGenerator(baseGen, false);
        CategoryItemLabelGenerator result = renderer.getItemLabelGenerator(0, 0, false);
        assertSame(baseGen, result);
    }
    @Test
    public void testSetSeriesItemLabelGeneratorNotify() {
        renderer.setSeriesItemLabelGenerator(0, null, true);
        assertNull(renderer.getSeriesItemLabelGenerator(0));
    }
    @Test
    public void testSetBaseItemLabelGeneratorNotify() {
        CategoryItemLabelGenerator gen = new CategoryItemLabelGenerator() {
            @Override
            public String generateLabel(CategoryDataset dataset, int row, int column) {
                return "base";
            }
        };
        renderer.setBaseItemLabelGenerator(gen, true);
        assertSame(gen, renderer.getBaseItemLabelGenerator());
    }
    @Test
    public void testGetToolTipGeneratorNoSeriesGenerator() {
        CategoryToolTipGenerator result = renderer.getToolTipGenerator(0, 0, false);
        assertNull(result);
    }
    @Test
    public void testGetToolTipGeneratorWithSeriesGenerator() {
        CategoryToolTipGenerator tg = new CategoryToolTipGenerator() {
            @Override
            public String generateToolTip(CategoryDataset dataset, int row, int column) {
                return "tip";
            }
        };
        renderer.setSeriesToolTipGenerator(0, tg, false);
        CategoryToolTipGenerator result = renderer.getToolTipGenerator(0, 0, false);
        assertSame(tg, result);
    }
    @Test
    public void testGetToolTipGeneratorNullSeriesUsesBase() {
        CategoryToolTipGenerator base = new CategoryToolTipGenerator() {
            @Override
            public String generateToolTip(CategoryDataset dataset, int row, int column) {
                return "baseTip";
            }
        };
        renderer.setBaseToolTipGenerator(base, false);
        CategoryToolTipGenerator result = renderer.getToolTipGenerator(0, 0, false);
        assertSame(base, result);
    }
    @Test
    public void testSetSeriesToolTipGeneratorNotify() {
        renderer.setSeriesToolTipGenerator(0, null, true);
        assertNull(renderer.getSeriesToolTipGenerator(0));
    }
    @Test
    public void testSetBaseToolTipGeneratorNotify() {
        CategoryToolTipGenerator base = new CategoryToolTipGenerator() {
            @Override
            public String generateToolTip(CategoryDataset dataset, int row, int column) {
                return "tip";
            }
        };
        renderer.setBaseToolTipGenerator(base, true);
        assertSame(base, renderer.getBaseToolTipGenerator());
    }
    @Test
    public void testGetURLGeneratorNoSeriesGenerator() {
        CategoryURLGenerator result = renderer.getURLGenerator(0, 0, false);
        assertNull(result);
    }
    @Test
    public void testGetURLGeneratorWithSeriesGenerator() {
        CategoryURLGenerator gen = new CategoryURLGenerator() {
            @Override
            public String generateURL(CategoryDataset dataset, int row, int column) {
                return "url";
            }
        };
        renderer.setSeriesURLGenerator(0, gen, false);
        CategoryURLGenerator result = renderer.getURLGenerator(0, 0, false);
        assertSame(gen, result);
    }
    @Test
    public void testGetURLGeneratorNullSeriesUsesBase() {
        CategoryURLGenerator base = new CategoryURLGenerator() {
            @Override
            public String generateURL(CategoryDataset dataset, int row, int column) {
                return "baseUrl";
            }
        };
        renderer.setBaseURLGenerator(base, false);
        CategoryURLGenerator result = renderer.getURLGenerator(0, 0, false);
        assertSame(base, result);
    }
    @Test
    public void testSetSeriesURLGeneratorNotify() {
        renderer.setSeriesURLGenerator(0, null, true);
        assertNull(renderer.getSeriesURLGenerator(0));
    }
    @Test
    public void testSetBaseURLGeneratorNotify() {
        CategoryURLGenerator base = new CategoryURLGenerator() {
            @Override
            public String generateURL(CategoryDataset dataset, int row, int column) {
                return "url";
            }
        };
        renderer.setBaseURLGenerator(base, true);
        assertSame(base, renderer.getBaseURLGenerator());
    }
    @Test
    public void testAddAnnotationNullThrowsException() {
        try {
            renderer.addAnnotation(null, Layer.FOREGROUND);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testAddAnnotationForegroundLayer() {
        CategoryAnnotation annotation = new CategoryAnnotation() {
            @Override
            public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info) {
            }
        };
        renderer.addAnnotation(annotation, Layer.FOREGROUND);
        assertTrue(renderer.removeAnnotation(annotation));
    }
    @Test
    public void testAddAnnotationBackgroundLayer() {
        CategoryAnnotation annotation = new CategoryAnnotation() {
            @Override
            public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info) {
            }
        };
        renderer.addAnnotation(annotation, Layer.BACKGROUND);
        assertTrue(renderer.removeAnnotation(annotation));
    }
    @Test
    public void testRemoveAnnotationRemovedFromForegroundAndBackground() {
        CategoryAnnotation annotation = new CategoryAnnotation() {
            @Override
            public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info) {
            }
        };
        assertFalse(renderer.removeAnnotation(annotation));
        renderer.addAnnotation(annotation, Layer.FOREGROUND);
        assertTrue(renderer.removeAnnotation(annotation));
        assertFalse(renderer.removeAnnotation(annotation));
    }
    @Test
    public void testRemoveAnnotationsClearsBothLayers() {
        CategoryAnnotation a1 = new CategoryAnnotation() {
            @Override
            public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info) {
            }
        };
        CategoryAnnotation a2 = new CategoryAnnotation() {
            @Override
            public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info) {
            }
        };
        renderer.addAnnotation(a1, Layer.FOREGROUND);
        renderer.addAnnotation(a2, Layer.BACKGROUND);
        renderer.removeAnnotations();
        assertFalse(renderer.removeAnnotation(a1));
        assertFalse(renderer.removeAnnotation(a2));
    }
    @Test
    public void testSetLegendItemLabelGeneratorNullThrowsException() {
        try {
            renderer.setLegendItemLabelGenerator(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testSetLegendItemLabelGeneratorNormal() {
        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemLabelGenerator(gen);
        assertSame(gen, renderer.getLegendItemLabelGenerator());
    }
    @Test
    public void testSetLegendItemToolTipGeneratorNormal() {
        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemToolTipGenerator(gen);
        assertSame(gen, renderer.getLegendItemToolTipGenerator());
    }
    @Test
    public void testSetLegendItemURLGeneratorNormal() {
        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemURLGenerator(gen);
        assertSame(gen, renderer.getLegendItemURLGenerator());
    }
    @Test
    public void testGetLegendItemNullPlotReturnsNull() {
        LegendItem item = renderer.getLegendItem(0, 0);
        assertNull(item);
    }
    @Test
    public void testInitialiseWithNullDataset() {
        Graphics2D g2 = null;
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, null, null);
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
        assertNotNull(state);
    }
    @Test
    public void testInitialiseWithDataset() {
        Graphics2D g2 = null;
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C1");
        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, null);
        assertEquals(2, renderer.getRowCount());
        assertEquals(1, renderer.getColumnCount());
        assertNotNull(state);
    }
    @Test
    public void testFindRangeBoundsNullDataset() {
        assertNull(renderer.findRangeBounds(null));
    }
    @Test
    public void testFindRangeBoundsWithVisibleSeriesOnly() {
        CategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(10.0, "R2", "C1");
        renderer.setSeriesVisible(0, false);
        Range r = renderer.findRangeBounds(dataset, false);
        assertNotNull(r);
    }
    @Test
    public void testGetItemMiddle() {
        CategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        CategoryAxis axis = new CategoryAxis("X");
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        double middle = renderer.getItemMiddle("R1", "C1", dataset, axis, area, RectangleEdge.BOTTOM);
        assertTrue(middle > 0);
    }
    @Test
    public void testDrawDomainLineNullPaintThrowsException() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Stroke stroke = new java.awt.BasicStroke(1.0f);
        try {
            renderer.drawDomainLine(g2, plot, dataArea, 50.0, null, stroke);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testDrawDomainLineNullStrokeThrowsException() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Paint paint = java.awt.Color.BLACK;
        try {
            renderer.drawDomainLine(g2, plot, dataArea, 50.0, paint, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testDrawRangeLineValueNotInRangeReturns() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        renderer.drawRangeLine(g2, plot, axis, dataArea, 20.0, java.awt.Color.BLACK, new java.awt.BasicStroke(1.0f));
    }
    @Test
    public void testDrawRangeLineValueInRange() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        renderer.drawRangeLine(g2, plot, axis, dataArea, 5.0, java.awt.Color.BLACK, new java.awt.BasicStroke(1.0f));
    }
    @Test
    public void testDrawDomainMarkerColumnIndexNegativeReturns() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis axis = new CategoryAxis("X");
        CategoryMarker marker = new CategoryMarker("C1");
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        renderer.drawDomainMarker(g2, plot, axis, marker, dataArea);
    }
    @Test
    public void testDrawRangeMarkerValueMarkerValueNotInRangeReturns() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        ValueMarker marker = new ValueMarker(20.0);
        renderer.drawRangeMarker(g2, plot, axis, marker, dataArea);
    }
    @Test
    public void testDrawRangeMarkerValueMarkerValueInRange() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        ValueMarker marker = new ValueMarker(5.0);
        renderer.drawRangeMarker(g2, plot, axis, marker, dataArea);
    }
    @Test
    public void testDrawRangeMarkerIntervalMarkerNoIntersectionReturns() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        IntervalMarker marker = new IntervalMarker(15.0, 20.0);
        renderer.drawRangeMarker(g2, plot, axis, marker, dataArea);
    }
    @Test
    public void testDrawRangeMarkerIntervalMarkerIntersects() {
        Graphics2D g2 = null;
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        IntervalMarker marker = new IntervalMarker(2.0, 8.0);
        renderer.drawRangeMarker(g2, plot, axis, marker, dataArea);
    }
    @Test
    public void testUpdateCrosshairStateNullOrientationThrowsException() {
        try {
            renderer.updateCrosshairValues(new CategoryCrosshairState(), "R1", "C1", 1.0, 0, 50.0, 50.0, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testUpdateCrosshairStateNullCrosshairState() {
        renderer.updateCrosshairValues(null, "R1", "C1", 1.0, 0, 50.0, 50.0, PlotOrientation.VERTICAL);
    }
    @Test
    public void testGetLegendItemsNullPlot() {
        LegendItemCollection items = renderer.getLegendItems();
        assertTrue(items.getItemCount() == 0);
    }
    @Test
    public void testGetLegendItemsDatasetNull() {
        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);
        LegendItemCollection items = renderer.getLegendItems();
        assertTrue(items.getItemCount() == 0);
    }
    @Test
    public void testAddEntityNullHotspotThrowsException() {
        EntityCollection entities = new org.jfree.chart.entity.StandardEntityCollection();
        CategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        try {
            renderer.addEntity(entities, null, dataset, 0, 0, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testHitTestWithNullBounds() {
        Graphics2D g2 = null;
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis();
        CategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(null, "R1", "C1");
        boolean hit = renderer.hitTest(50, 50, g2, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, false, null);
        assertFalse(hit);
    }
    @Test
    public void testEqualsSelf() {
        assertTrue(renderer.equals(renderer));
    }
    @Test
    public void testEqualsNull() {
        assertFalse(renderer.equals(null));
    }
    @Test
    public void testEqualsDifferentClass() {
        assertFalse(renderer.equals("string"));
    }
}