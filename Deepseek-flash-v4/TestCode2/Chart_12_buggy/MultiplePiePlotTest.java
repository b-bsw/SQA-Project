package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.util.TableOrder;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.geom.Rectangle2D;

public class MultiplePiePlotTest {

    private MultiplePiePlot plot;

    @Before
    public void setUp() {
        plot = new MultiplePiePlot();
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row2", "Col1");
        return dataset;
    }

    @Test
    public void testConstructorDefault() {
        assertNull(plot.getDataset());
        assertNotNull(plot.getPieChart());
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        assertEquals(0.0, plot.getLimit(), 0.0);
        assertEquals("Other", plot.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    @Test
    public void testConstructorWithDataset() {
        CategoryDataset dataset = createDataset();
        plot = new MultiplePiePlot(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetDatasetNonNull() {
        CategoryDataset dataset = createDataset();
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNull() {
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNotPiePlot() {
        JFreeChart chart = new JFreeChart(new XYPlot());
        plot.setPieChart(chart);
    }

    @Test
    public void testSetPieChartValid() {
        JFreeChart chart = new JFreeChart(new PiePlot());
        plot.setPieChart(chart);
        assertSame(chart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrderNull() {
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testSetDataExtractOrderByRow() {
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test
    public void testSetLimit() {
        plot.setLimit(10.0);
        assertEquals(10.0, plot.getLimit(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKeyNull() {
        plot.setAggregatedItemsKey(null);
    }

    @Test
    public void testSetAggregatedItemsKeyValid() {
        plot.setAggregatedItemsKey("Custom");
        assertEquals("Custom", plot.getAggregatedItemsKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaintNull() {
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testSetAggregatedItemsPaintValid() {
        Color c = Color.RED;
        plot.setAggregatedItemsPaint(c);
        assertEquals(c, plot.getAggregatedItemsPaint());
    }

    @Test
    public void testGetLegendItemsNullDataset() {
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsByColumn() {
        CategoryDataset dataset = createDataset();
        plot.setDataset(dataset);
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsByRow() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        plot.setDataset(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsWithAggregationLimit() {
        plot.setDataset(createDataset());
        plot.setLimit(0.1);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(3, items.getItemCount());
        LegendItem last = items.get(items.getItemCount() - 1);
        assertEquals("Other", last.getLabel());
    }

    @Test
    public void testGetLegendItemsPaintNotNull() {
        plot.setDataset(createDataset());
        LegendItemCollection items = plot.getLegendItems();
        for (int i = 0; i < items.getItemCount(); i++) {
            assertNotNull(items.get(i).getPaint());
        }
    }

    @Test
    public void testEquals() {
        assertTrue(plot.equals(plot));
        assertFalse(plot.equals(null));
        assertFalse(plot.equals(new Object()));

        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentLimit() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        p1.setLimit(1.0);
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentDataExtractOrder() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        p1.setDataExtractOrder(TableOrder.BY_ROW);
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentAggregatedItemsKey() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        p1.setAggregatedItemsKey("Different");
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentAggregatedItemsPaint() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        p1.setAggregatedItemsPaint(Color.RED);
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentPieChart() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        p1.setPieChart(new JFreeChart("Different", new PiePlot()));
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testDrawEmptyDataset() {
        Graphics2D g2 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDrawWithData() {
        plot.setDataset(createDataset());
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        Graphics2D g2 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 100);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDrawWithLimit() {
        plot.setDataset(createDataset());
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        plot.setLimit(0.2);
        Graphics2D g2 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }
}