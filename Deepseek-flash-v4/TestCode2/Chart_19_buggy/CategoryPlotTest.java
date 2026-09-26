package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Proxy;
import java.util.*;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.util.*;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.*;

public class CategoryPlotTest {

    private CategoryPlot plot;

    @Before
    public void setUp() {
        plot = new CategoryPlot();
    }

    private static class SimpleDataset implements CategoryDataset {
        private List rowKeys = new ArrayList();
        private List colKeys = new ArrayList();
        private Number[][] data;
        private List listeners = new ArrayList();

        SimpleDataset(String[] rowKeys, String[] colKeys, Number[][] data) {
            for (String rk : rowKeys) this.rowKeys.add(rk);
            for (String ck : colKeys) this.colKeys.add(ck);
            this.data = data;
        }

        public int getRowIndex(Comparable key) { return rowKeys.indexOf(key); }
        public int getColumnIndex(Comparable key) { return colKeys.indexOf(key); }
        public Comparable getRowKey(int row) { return (Comparable) rowKeys.get(row); }
        public Comparable getColumnKey(int column) { return (Comparable) colKeys.get(column); }
        public List getRowKeys() { return Collections.unmodifiableList(rowKeys); }
        public List getColumnKeys() { return Collections.unmodifiableList(colKeys); }
        public Number getValue(Comparable rowKey, Comparable columnKey) {
            int r = getRowIndex(rowKey);
            int c = getColumnIndex(columnKey);
            return getValue(r, c);
        }
        public int getRowCount() { return rowKeys.size(); }
        public int getColumnCount() { return colKeys.size(); }
        public Number getValue(int row, int column) { return data[row][column]; }
        public void addChangeListener(DatasetChangeListener listener) { listeners.add(listener); }
        public void removeChangeListener(DatasetChangeListener listener) { listeners.remove(listener); }
        public DatasetGroup getGroup() { return null; }
        public void setGroup(DatasetGroup group) { }
    }

    private CategoryItemRenderer createRenderer() {
        return (CategoryItemRenderer) Proxy.newProxyInstance(
            CategoryItemRenderer.class.getClassLoader(),
            new Class[]{CategoryItemRenderer.class},
            (proxy, method, args) -> {
                String name = method.getName();
                if (name.equals("equals")) return true;
                if (name.equals("hashCode")) return 42;
                if (name.equals("toString")) return "RendererStub";
                if (name.equals("getLegendItem")) {
                    int series = (Integer) args[1];
                    return new LegendItem("S" + series, Color.RED);
                }
                if (name.equals("initialise")) {
                    return new CategoryItemRendererState(null);
                }
                if (name.equals("getPassCount")) {
                    return 1;
                }
                if (name.equals("findRangeBounds")) {
                    CategoryDataset ds = (CategoryDataset) args[0];
                    if (ds == null) return null;
                    double min = Double.POSITIVE_INFINITY;
                    double max = Double.NEGATIVE_INFINITY;
                    for (int r = 0; r < ds.getRowCount(); r++) {
                        for (int c = 0; c < ds.getColumnCount(); c++) {
                            Number v = ds.getValue(r, c);
                            if (v != null) {
                                double d = v.doubleValue();
                                if (d < min) min = d;
                                if (d > max) max = d;
                            }
                        }
                    }
                    if (min > max) return null;
                    return new Range(min, max);
                }
                Class<?> returnType = method.getReturnType();
                if (returnType == boolean.class) return false;
                if (returnType == int.class) return 0;
                if (returnType == double.class) return 0.0;
                return null;
            });
    }

    private CategoryPlot createFullPlot() {
        SimpleDataset dataset = new SimpleDataset(
            new String[]{"R1", "R2"},
            new String[]{"C1", "C2"},
            new Number[][]{{1.0, 2.0}, {3.0, 4.0}}
        );
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        ValueAxis rangeAxis = new NumberAxis("Range");
        CategoryItemRenderer renderer = createRenderer();
        return new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
        assertNotNull(plot.getAxisOffset());
        assertTrue(plot.isRangeGridlinesVisible());
        assertFalse(plot.isDomainGridlinesVisible());
        assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0);
        assertFalse(plot.isRangeCrosshairVisible());
        assertEquals(0, plot.getWeight());
        assertNull(plot.getFixedDomainAxisSpace());
        assertNull(plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testConstructorWithAll() {
        SimpleDataset dataset = new SimpleDataset(new String[]{"R"}, new String[]{"C"}, new Number[][]{{5.0}});
        CategoryAxis domainAxis = new CategoryAxis("D");
        ValueAxis rangeAxis = new NumberAxis("R");
        CategoryItemRenderer renderer = createRenderer();
        CategoryPlot p = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        assertSame(dataset, p.getDataset());
        assertSame(domainAxis, p.getDomainAxis());
        assertSame(rangeAxis, p.getRangeAxis());
        assertSame(renderer, p.getRenderer());
        assertEquals(1, p.getDomainAxisCount());
        assertEquals(1, p.getRangeAxisCount());
    }

    @Test
    public void testSetOrientation() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        try {
            plot.setOrientation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSetAxisOffset() {
        RectangleInsets insets = new RectangleInsets(1,2,3,4);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
        try {
            plot.setAxisOffset(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSetAndGetDomainAxis() {
        CategoryAxis axis = new CategoryAxis("A");
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxis());
        assertEquals(0, plot.getDomainAxisIndex(axis));
        plot.setDomainAxis(1, new CategoryAxis("B"));
        assertEquals(2, plot.getDomainAxisCount());
        assertSame(axis, plot.getDomainAxis(0));
    }

    @Test
    public void testSetAndGetRangeAxis() {
        ValueAxis axis = new NumberAxis("A");
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxis());
        assertEquals(0, plot.getRangeAxisIndex(axis));
        plot.setRangeAxis(1, new NumberAxis("B"));
        assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void testSetDataset() {
        SimpleDataset dataset = new SimpleDataset(new String[]{"R"}, new String[]{"C"}, new Number[][]{{1.0}});
        plot.setDataset(0, dataset);
        assertSame(dataset, plot.getDataset(0));
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testSetRenderer() {
        CategoryItemRenderer renderer = createRenderer();
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRenderer());
        assertEquals(0, plot.getIndexOf(renderer));
        plot.setRenderer(1, createRenderer());
        assertNotNull(plot.getRenderer(1));
    }

    @Test
    public void testSetRendererNull() {
        plot.setRenderer(null);
        assertNull(plot.getRenderer());
    }

    @Test
    public void testRenderingOrder() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
        try {
            plot.setDatasetRenderingOrder(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
        try {
            plot.setColumnRenderingOrder(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
        try {
            plot.setRowRenderingOrder(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGridlineVisibility() {
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testGridlineStrokePaint() {
        Stroke s = new BasicStroke(1.0f);
        plot.setDomainGridlineStroke(s);
        assertSame(s, plot.getDomainGridlineStroke());
        try {
            plot.setDomainGridlineStroke(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        Paint p = Color.BLUE;
        plot.setDomainGridlinePaint(p);
        assertSame(p, plot.getDomainGridlinePaint());
        try {
            plot.setDomainGridlinePaint(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        plot.setRangeGridlineStroke(s);
        assertSame(s, plot.getRangeGridlineStroke());
        try {
            plot.setRangeGridlineStroke(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        plot.setRangeGridlinePaint(p);
        assertSame(p, plot.getRangeGridlinePaint());
        try {
            plot.setRangeGridlinePaint(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testRangeCrosshair() {
        assertFalse(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairValue(3.14);
        assertEquals(3.14, plot.getRangeCrosshairValue(), 0.0001);
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
        Stroke s = new BasicStroke(2.0f);
        plot.setRangeCrosshairStroke(s);
        assertSame(s, plot.getRangeCrosshairStroke());
        try {
            plot.setRangeCrosshairStroke(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        Paint p = Color.GREEN;
        plot.setRangeCrosshairPaint(p);
        assertSame(p, plot.getRangeCrosshairPaint());
        try {
            plot.setRangeCrosshairPaint(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAnnotations() {
        assertEquals(0, plot.getAnnotations().size());
        CategoryAnnotation annotation = (CategoryAnnotation) Proxy.newProxyInstance(
            CategoryAnnotation.class.getClassLoader(),
            new Class[]{CategoryAnnotation.class},
            (proxy, method, args) -> null);
        plot.addAnnotation(annotation);
        assertEquals(1, plot.getAnnotations().size());
        assertTrue(plot.removeAnnotation(annotation));
        assertEquals(0, plot.getAnnotations().size());
        assertFalse(plot.removeAnnotation(annotation));
        try {
            plot.addAnnotation(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            plot.removeAnnotation(null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMarkers() {
        Marker m = new ValueMarker(1.0);
        plot.addRangeMarker(m, Layer.FOREGROUND);
        assertEquals(1, plot.getRangeMarkers(Layer.FOREGROUND).size());
        plot.addRangeMarker(m, Layer.BACKGROUND);
        assertEquals(1, plot.getRangeMarkers(Layer.BACKGROUND).size());
        plot.clearRangeMarkers();
        assertEquals(0, plot.getRangeMarkers(Layer.FOREGROUND).size());
        assertEquals(0, plot.getRangeMarkers(Layer.BACKGROUND).size());

        CategoryMarker cm = new CategoryMarker("cat");
        plot.addDomainMarker(cm, Layer.FOREGROUND);
        assertEquals(1, plot.getDomainMarkers(Layer.FOREGROUND).size());
        plot.clearDomainMarkers();
        assertEquals(0, plot.getDomainMarkers(Layer.FOREGROUND).size());
    }

    @Test
    public void testGetLegendItems() {
        CategoryPlot p = createFullPlot();
        LegendItemCollection items = p.getLegendItems();
        assertNotNull(items);
        assertEquals(2, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsDefaultFixedLegendItems() {
        plot.setFixedLegendItems(new LegendItemCollection());
        assertEquals(0, plot.getLegendItems().getItemCount());
    }

    @Test
    public void testGetCategories() {
        SimpleDataset dataset = new SimpleDataset(new String[]{"R1","R2"}, new String[]{"C1","C2"}, new Number[][]{{1,2},{3,4}});
        plot.setDataset(dataset);
        List categories = plot.getCategories();
        assertNotNull(categories);
        assertEquals(2, categories.size());
        assertTrue(categories.contains("C1"));
        assertTrue(categories.contains("C2"));
    }

    @Test
    public void testGetCategoriesForAxis() {
        SimpleDataset dataset = new SimpleDataset(new String[]{"R1"}, new String[]{"A","B"}, new Number[][]{{1,2}});
        CategoryAxis axis = new CategoryAxis("X");
        CategoryPlot p = new CategoryPlot(dataset, axis, new NumberAxis(), createRenderer());
        List categories = p.getCategoriesForAxis(axis);
        assertNotNull(categories);
        assertEquals(2, categories.size());
        assertTrue(categories.contains("A"));
        assertTrue(categories.contains("B"));
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        CategoryPlot p1 = createFullPlot();
        CategoryPlot p2 = createFullPlot();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
        CategoryPlot cl = (CategoryPlot) p2.clone();
        assertTrue(cl.equals(p2));
        assertNotSame(p2, cl);
    }

    @Test
    public void testZoom() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0.0, 10.0);
        CategoryPlot p = new CategoryPlot(null, new CategoryAxis(), rangeAxis, null);
        p.setAnchorValue(5.0);
        p.zoom(0.5);
        Range r = rangeAxis.getRange();
        assertEquals(2.5, r.getLowerBound(), 0.0001);
        assertEquals(7.5, r.getUpperBound(), 0.0001);
        p.zoom(-1.0);
        assertTrue(rangeAxis.isAutoRange());
    }

    @Test
    public void testDatasetChanged() {
        CategoryPlot p = createFullPlot();
        DatasetChangeEvent event = new DatasetChangeEvent(p, p.getDataset());
        p.datasetChanged(event);
        // no exception
    }

    @Test
    public void testRender() {
        CategoryPlot p = createFullPlot();
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 80, 80);
        boolean found = p.render(g2, dataArea, 0, null);
        assertTrue(found);
        g2.dispose();

        CategoryPlot p2 = new CategoryPlot();
        Graphics2D g2b = img.createGraphics();
        found = p2.render(g2b, dataArea, 0, null);
        assertFalse(found);
        g2b.dispose();
    }

    @Test
    public void testDrawSharedDomainAxis() {
        assertFalse(plot.getDrawSharedDomainAxis());
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testIsZoomable() {
        assertFalse(plot.isDomainZoomable());
        assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void testAnchorValue() {
        assertEquals(0.0, plot.getAnchorValue(), 0.0);
        plot.setAnchorValue(7.0);
        assertEquals(7.0, plot.getAnchorValue(), 0.0);
    }

    @Test
    public void testRangeCrosshairValueNotifiesOnlyWhenVisible() {
        plot.setRangeCrosshairVisible(false);
        plot.setRangeCrosshairValue(10.0);
        assertEquals(10.0, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(20.0);
        assertEquals(20.0, plot.getRangeCrosshairValue(), 0.0);
    }

    @Test
    public void testMapDatasetToAxes() {
        CategoryPlot p = createFullPlot();
        assertSame(p.getDomainAxis(), p.getDomainAxisForDataset(0));
        assertSame(p.getRangeAxis(), p.getRangeAxisForDataset(0));
        CategoryAxis da2 = new CategoryAxis("D2");
        ValueAxis ra2 = new NumberAxis("R2");
        p.setDomainAxis(1, da2);
        p.setRangeAxis(1, ra2);
        p.mapDatasetToDomainAxis(0, 1);
        p.mapDatasetToRangeAxis(0, 1);
        assertSame(da2, p.getDomainAxisForDataset(0));
        assertSame(ra2, p.getRangeAxisForDataset(0));
    }

    @Test
    public void testGetDataRange() {
        CategoryPlot p = createFullPlot();
        ValueAxis rangeAxis = p.getRangeAxis();
        Range r = p.getDataRange(rangeAxis);
        assertNotNull(r);
        assertEquals(1.0, r.getLowerBound(), 0.0001);
        assertEquals(4.0, r.getUpperBound(), 0.0001);
    }
}