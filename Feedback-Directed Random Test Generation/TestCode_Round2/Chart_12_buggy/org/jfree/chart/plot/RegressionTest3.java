package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom((double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot9.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo12);
        multiplePiePlot9.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot9.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets16, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot0.handleClick(0, 0, plotRenderingInfo21);
        java.awt.Stroke stroke23 = multiplePiePlot0.getOutlineStroke();
        java.lang.Class<?> wildcardClass24 = stroke23.getClass();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot10.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot10.getDatasetGroup();
        java.lang.String str15 = multiplePiePlot10.getPlotType();
        java.awt.Stroke stroke16 = null;
        multiplePiePlot10.setOutlineStroke(stroke16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        float float20 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent21);
        multiplePiePlot19.zoom((double) 0.0f);
        multiplePiePlot19.setLimit((double) (-1));
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setBackgroundPaint(paint27);
        multiplePiePlot10.setNoDataMessagePaint(paint27);
        multiplePiePlot1.setAggregatedItemsPaint(paint27);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setNoDataMessage("hi!");
        boolean boolean35 = multiplePiePlot32.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        multiplePiePlot37.setNoDataMessage("hi!");
        multiplePiePlot37.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener42 = null;
        multiplePiePlot37.addChangeListener(plotChangeListener42);
        multiplePiePlot37.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        multiplePiePlot37.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        multiplePiePlot37.setDataset(categoryDataset50);
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        multiplePiePlot37.setDataset(categoryDataset52);
        java.awt.Stroke stroke54 = multiplePiePlot37.getOutlineStroke();
        multiplePiePlot32.setOutlineStroke(stroke54);
        multiplePiePlot1.setOutlineStroke(stroke54);
        float float57 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57 == 1.0f);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        double double13 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getRootPlot();
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        int int10 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.awt.Font font12 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font12);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint15 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent22);
        multiplePiePlot20.zoom((double) 0.0f);
        multiplePiePlot20.setLimit((double) (-1));
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setBackgroundPaint(paint28);
        multiplePiePlot1.setNoDataMessagePaint(paint28);
        java.awt.Image image31 = multiplePiePlot1.getBackgroundImage();
        java.awt.Stroke stroke32 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(image31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Stroke stroke23 = null;
        multiplePiePlot22.setOutlineStroke(stroke23);
        java.lang.Comparable comparable25 = multiplePiePlot22.getAggregatedItemsKey();
        java.awt.Font font26 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font26);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier33);
        java.awt.Stroke stroke35 = null;
        multiplePiePlot30.setOutlineStroke(stroke35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image41 = multiplePiePlot38.getBackgroundImage();
        java.awt.Paint paint42 = multiplePiePlot38.getNoDataMessagePaint();
        multiplePiePlot30.setAggregatedItemsPaint(paint42);
        multiplePiePlot1.setNoDataMessagePaint(paint42);
        float float45 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup46 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNull(image41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup46);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(tableOrder8);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Stroke stroke7 = null;
        multiplePiePlot6.setOutlineStroke(stroke7);
        java.lang.Comparable comparable9 = multiplePiePlot6.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot6.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets10, true);
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener22);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setBackgroundPaint(paint24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setNoDataMessage("hi!");
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot27.setBackgroundPaint(paint34);
        multiplePiePlot17.setOutlinePaint(paint34);
        multiplePiePlot1.setBackgroundPaint(paint34);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(rectangleInsets38);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot10.setBackgroundPaint(paint17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setBackgroundPaint(paint27);
        multiplePiePlot10.setOutlinePaint(paint27);
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot10.getDataExtractOrder();
        java.awt.Image image31 = null;
        multiplePiePlot10.setBackgroundImage(image31);
        int int33 = multiplePiePlot10.getBackgroundImageAlignment();
        boolean boolean34 = multiplePiePlot1.equals((java.lang.Object) int33);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(tableOrder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot13.getParent();
        java.awt.Paint paint20 = multiplePiePlot13.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener27);
        multiplePiePlot22.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        multiplePiePlot22.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        multiplePiePlot22.setDataset(categoryDataset35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        multiplePiePlot22.setDataset(categoryDataset37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot22.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        float float42 = multiplePiePlot41.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        multiplePiePlot41.zoom((double) 0.0f);
        multiplePiePlot41.setLimit((double) (-1));
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot41.setBackgroundPaint(paint49);
        multiplePiePlot22.setNoDataMessagePaint(paint49);
        java.awt.Image image52 = multiplePiePlot22.getBackgroundImage();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Stroke stroke54 = multiplePiePlot22.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        multiplePiePlot1.setDataset(categoryDataset56);
        org.jfree.chart.plot.Plot plot58 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(datasetGroup39);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(image52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNull(plot58);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot10.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot10.setDataset(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot10.setDataset(categoryDataset25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot10.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent31);
        multiplePiePlot29.zoom((double) 0.0f);
        multiplePiePlot29.setLimit((double) (-1));
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot29.setBackgroundPaint(paint37);
        multiplePiePlot10.setNoDataMessagePaint(paint37);
        java.awt.Image image40 = multiplePiePlot10.getBackgroundImage();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Stroke stroke42 = multiplePiePlot10.getOutlineStroke();
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot10.getParent();
        org.jfree.chart.util.TableOrder tableOrder44 = multiplePiePlot10.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(image40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNull(plot43);
        org.junit.Assert.assertNotNull(tableOrder44);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        java.awt.Stroke stroke15 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.lang.Comparable comparable22 = multiplePiePlot19.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot19.getDataset();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot19.getDataExtractOrder();
        multiplePiePlot11.setDataExtractOrder(tableOrder24);
        multiplePiePlot1.setDataExtractOrder(tableOrder24);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot31.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = multiplePiePlot31.getDatasetGroup();
        java.lang.String str36 = multiplePiePlot31.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = multiplePiePlot31.getDrawingSupplier();
        java.awt.Paint paint38 = multiplePiePlot31.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint38);
        org.jfree.chart.plot.Plot plot40 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) ' ');
        int int43 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D44, rectangle2D45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(tableOrder24);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertNull(categoryDataset32);
        org.junit.Assert.assertNull(datasetGroup35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Multiple Pie Plot" + "'", str36, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(plot40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        double double6 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot8.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo11);
        multiplePiePlot8.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener23);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot18.setBackgroundPaint(paint25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        multiplePiePlot28.setNoDataMessage("hi!");
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener33);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot28.setBackgroundPaint(paint35);
        multiplePiePlot18.setOutlinePaint(paint35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot39.setOutlineStroke(stroke40);
        java.lang.Comparable comparable42 = multiplePiePlot39.getAggregatedItemsKey();
        java.awt.Font font43 = multiplePiePlot39.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font43);
        multiplePiePlot1.setNoDataMessageFont(font43);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + "Other" + "'", comparable42, "Other");
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.Object obj9 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font6 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot8.setBackgroundPaint(paint15);
        java.lang.Object obj17 = multiplePiePlot8.clone();
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) (-1));
        java.awt.Paint paint20 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint20);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier14);
        float float16 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot11.getLegendItems();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot11.getRootPlot();
        java.lang.String str19 = multiplePiePlot11.getNoDataMessage();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setOutlinePaint(paint20);
        multiplePiePlot1.setNoDataMessagePaint(paint20);
        java.awt.Paint paint23 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        float float10 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot12.setOutlineStroke(stroke13);
        java.awt.Font font15 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable18 = multiplePiePlot12.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        multiplePiePlot20.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot20.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        multiplePiePlot20.setDataset(categoryDataset33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        multiplePiePlot20.setDataset(categoryDataset35);
        java.awt.Stroke stroke37 = multiplePiePlot20.getOutlineStroke();
        multiplePiePlot12.setOutlineStroke(stroke37);
        multiplePiePlot1.setOutlineStroke(stroke37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(drawingSupplier40);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot1.drawOutline(graphics2D5, rectangle2D6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot9.getDataset();
        int int11 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Image image12 = multiplePiePlot9.getBackgroundImage();
        double double13 = multiplePiePlot9.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot9.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot16.setOutlineStroke(stroke20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot16.getDataset();
        java.awt.Font font23 = multiplePiePlot16.getNoDataMessageFont();
        java.awt.Paint paint24 = multiplePiePlot16.getNoDataMessagePaint();
        boolean boolean25 = multiplePiePlot9.equals((java.lang.Object) multiplePiePlot16);
        java.lang.String str26 = multiplePiePlot16.getPlotType();
        boolean boolean27 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot16);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent28);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Multiple Pie Plot" + "'", str26, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setAggregatedItemsPaint(paint27);
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder29);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent31);
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        int int39 = multiplePiePlot38.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        float float42 = multiplePiePlot41.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        multiplePiePlot41.markerChanged(markerChangeEvent43);
        java.awt.Stroke stroke45 = null;
        multiplePiePlot41.setOutlineStroke(stroke45);
        float float47 = multiplePiePlot41.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot41.getPieChart();
        multiplePiePlot38.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.awt.Stroke stroke52 = multiplePiePlot38.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke52);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(tableOrder29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.5f + "'", float47 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart48);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot7.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setBackgroundPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot25.setOutlineStroke(stroke30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot33.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot33.notifyListeners(plotChangeEvent35);
        org.jfree.data.general.DatasetGroup datasetGroup37 = multiplePiePlot33.getDatasetGroup();
        java.awt.Stroke stroke38 = null;
        multiplePiePlot33.setOutlineStroke(stroke38);
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot33.getPieChart();
        multiplePiePlot25.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart40);
        multiplePiePlot15.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart40);
        multiplePiePlot7.setPieChart(jFreeChart40);
        float float44 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = multiplePiePlot7.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets45);
        int int47 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNull(datasetGroup37);
        org.junit.Assert.assertNotNull(jFreeChart40);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        int int13 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot15.getDatasetGroup();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot9.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot9.getInsets();
        org.jfree.chart.util.TableOrder tableOrder26 = multiplePiePlot9.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot9.getInsets();
        boolean boolean28 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot9);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(tableOrder26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot0.getDrawingSupplier();
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot8.setOutlineStroke(stroke13);
        float float15 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot8.getDataset();
        multiplePiePlot8.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot20.getParent();
        java.awt.Paint paint27 = multiplePiePlot20.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener34);
        multiplePiePlot29.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        multiplePiePlot29.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        multiplePiePlot29.setDataset(categoryDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        multiplePiePlot29.setDataset(categoryDataset44);
        org.jfree.data.general.DatasetGroup datasetGroup46 = multiplePiePlot29.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        float float49 = multiplePiePlot48.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent50 = null;
        multiplePiePlot48.notifyListeners(plotChangeEvent50);
        multiplePiePlot48.zoom((double) 0.0f);
        multiplePiePlot48.setLimit((double) (-1));
        java.awt.Paint paint56 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot48.setBackgroundPaint(paint56);
        multiplePiePlot29.setNoDataMessagePaint(paint56);
        java.awt.Image image59 = multiplePiePlot29.getBackgroundImage();
        multiplePiePlot20.setParent((org.jfree.chart.plot.Plot) multiplePiePlot29);
        java.awt.Stroke stroke61 = multiplePiePlot29.getOutlineStroke();
        multiplePiePlot8.setOutlineStroke(stroke61);
        multiplePiePlot0.setOutlineStroke(stroke61);
        int int64 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNull(plot26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(datasetGroup46);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(image59);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 15 + "'", int64 == 15);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) '4');
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint17 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.awt.Font font12 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font12);
        multiplePiePlot1.setBackgroundAlpha((float) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier14);
        float float16 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot11.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot21.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot21.getDatasetGroup();
        boolean boolean26 = multiplePiePlot11.equals((java.lang.Object) multiplePiePlot21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        float float29 = multiplePiePlot28.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        java.awt.Stroke stroke32 = null;
        multiplePiePlot28.setOutlineStroke(stroke32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot28.getDataset();
        java.awt.Font font35 = multiplePiePlot28.getNoDataMessageFont();
        multiplePiePlot11.setNoDataMessageFont(font35);
        multiplePiePlot11.setNoDataMessage("Multiple Pie Plot");
        boolean boolean39 = multiplePiePlot1.equals((java.lang.Object) "Multiple Pie Plot");
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent42);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom(0.0d);
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint10 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str11 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom(1.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot8.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot8.getDataset();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint15 = multiplePiePlot8.getNoDataMessagePaint();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot7 = plot6.getRootPlot();
        org.jfree.chart.plot.Plot plot8 = plot6.getRootPlot();
        boolean boolean9 = plot8.isSubplot();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        multiplePiePlot1.setBackgroundImageAlignment(0);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        float float10 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot1.setDataset(categoryDataset10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawOutline(graphics2D14, rectangle2D15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        multiplePiePlot18.axisChanged(axisChangeEvent21);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot18.axisChanged(axisChangeEvent23);
        java.lang.String str25 = multiplePiePlot18.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier30);
        java.awt.Stroke stroke32 = null;
        multiplePiePlot27.setOutlineStroke(stroke32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = multiplePiePlot27.getDatasetGroup();
        int int35 = multiplePiePlot27.getBackgroundImageAlignment();
        java.awt.Stroke stroke36 = multiplePiePlot27.getOutlineStroke();
        float float37 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        multiplePiePlot39.setNoDataMessage("hi!");
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        multiplePiePlot39.addChangeListener(plotChangeListener44);
        multiplePiePlot39.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent48 = null;
        multiplePiePlot39.notifyListeners(plotChangeEvent48);
        java.lang.String str50 = multiplePiePlot39.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = multiplePiePlot52.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = null;
        multiplePiePlot52.notifyListeners(plotChangeEvent54);
        org.jfree.data.general.DatasetGroup datasetGroup56 = multiplePiePlot52.getDatasetGroup();
        java.lang.String str57 = multiplePiePlot52.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier58 = multiplePiePlot52.getDrawingSupplier();
        multiplePiePlot39.setDrawingSupplier(drawingSupplier58);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = multiplePiePlot39.getDrawingSupplier();
        multiplePiePlot27.setDrawingSupplier(drawingSupplier60);
        multiplePiePlot18.setDrawingSupplier(drawingSupplier60);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier60);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
        org.junit.Assert.assertNull(datasetGroup34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(stroke36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(categoryDataset53);
        org.junit.Assert.assertNull(datasetGroup56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Multiple Pie Plot" + "'", str57, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier58);
        org.junit.Assert.assertNotNull(drawingSupplier60);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.zoom((double) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent12);
        multiplePiePlot10.zoom((double) 0.0f);
        multiplePiePlot10.setLimit((double) (-1));
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot10.setBackgroundPaint(paint18);
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot10.removeChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = multiplePiePlot10.getAggregatedItemsPaint();
        java.awt.Paint paint24 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint24);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent26);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        float float15 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Font font16 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot14.setOutlineStroke(stroke18);
        float float20 = multiplePiePlot14.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setBackgroundPaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        multiplePiePlot24.setOutlinePaint(paint41);
        org.jfree.chart.util.TableOrder tableOrder44 = multiplePiePlot24.getDataExtractOrder();
        java.awt.Image image45 = null;
        multiplePiePlot24.setBackgroundImage(image45);
        int int47 = multiplePiePlot24.getBackgroundImageAlignment();
        java.awt.Font font48 = multiplePiePlot24.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        multiplePiePlot50.markerChanged(markerChangeEvent52);
        java.awt.Paint paint54 = multiplePiePlot50.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = multiplePiePlot50.getInsets();
        multiplePiePlot24.setInsets(rectangleInsets55);
        multiplePiePlot1.setInsets(rectangleInsets55, true);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        multiplePiePlot60.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier63 = null;
        multiplePiePlot60.setDrawingSupplier(drawingSupplier63);
        java.awt.Image image65 = multiplePiePlot60.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        multiplePiePlot60.setDataset(categoryDataset66);
        java.awt.Stroke stroke68 = multiplePiePlot60.getOutlineStroke();
        java.awt.Paint paint69 = multiplePiePlot60.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint69);
        java.awt.Graphics2D graphics2D71 = null;
        java.awt.geom.Rectangle2D rectangle2D72 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D71, rectangle2D72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(tableOrder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(rectangleInsets55);
        org.junit.Assert.assertNull(image65);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(paint69);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom((double) 1.0f);
        java.awt.Image image16 = null;
        multiplePiePlot1.setBackgroundImage(image16);
        java.lang.String str18 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot15.getDataset();
        int int17 = multiplePiePlot15.getBackgroundImageAlignment();
        java.awt.Image image18 = multiplePiePlot15.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot15.getDataset();
        boolean boolean20 = multiplePiePlot1.equals((java.lang.Object) categoryDataset19);
        multiplePiePlot1.setForegroundAlpha((float) 10L);
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) 10);
        org.junit.Assert.assertNull(datasetGroup18);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setNoDataMessage("hi!");
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener19);
        multiplePiePlot12.setLimit((double) '4');
        multiplePiePlot12.setLimit((double) 10L);
        double double25 = multiplePiePlot12.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image30 = multiplePiePlot27.getBackgroundImage();
        java.awt.Paint paint31 = multiplePiePlot27.getNoDataMessagePaint();
        java.awt.Image image32 = multiplePiePlot27.getBackgroundImage();
        java.awt.Image image33 = null;
        multiplePiePlot27.setBackgroundImage(image33);
        org.jfree.chart.util.TableOrder tableOrder35 = multiplePiePlot27.getDataExtractOrder();
        boolean boolean36 = multiplePiePlot12.equals((java.lang.Object) tableOrder35);
        multiplePiePlot1.setDataExtractOrder(tableOrder35);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(tableOrder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setNoDataMessage("hi!");
        multiplePiePlot5.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener10);
        multiplePiePlot5.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent14);
        java.lang.String str16 = multiplePiePlot5.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot18.setOutlineStroke(stroke19);
        java.lang.Comparable comparable21 = multiplePiePlot18.getAggregatedItemsKey();
        int int22 = multiplePiePlot18.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str29 = multiplePiePlot24.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot24.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot24.getDatasetGroup();
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot18.getInsets();
        multiplePiePlot5.setInsets(rectangleInsets33, false);
        multiplePiePlot5.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot5.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets38);
        float float40 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Other" + "'", comparable21, "Other");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setLimit((double) 1.0f);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot14.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot14.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        float float24 = multiplePiePlot23.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot28.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener33);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot28.setAggregatedItemsPaint(paint35);
        multiplePiePlot23.setOutlinePaint(paint35);
        multiplePiePlot14.setAggregatedItemsPaint(paint35);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        multiplePiePlot40.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot40.setDrawingSupplier(drawingSupplier43);
        java.awt.Image image45 = multiplePiePlot40.getBackgroundImage();
        boolean boolean46 = multiplePiePlot14.equals((java.lang.Object) multiplePiePlot40);
        java.lang.String str47 = multiplePiePlot40.getNoDataMessage();
        float float48 = multiplePiePlot40.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot40);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(image45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot14.setOutlineStroke(stroke18);
        float float20 = multiplePiePlot14.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart21);
        java.awt.Paint paint23 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(tableOrder12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 100);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        int int10 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot12.setOutlineStroke(stroke16);
        float float18 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.setPieChart(jFreeChart19);
        java.awt.Paint paint22 = multiplePiePlot1.getBackgroundPaint();
        double double23 = multiplePiePlot1.getLimit();
        double double24 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str31 = multiplePiePlot26.getNoDataMessage();
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot26.setAggregatedItemsPaint(paint32);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint36 = multiplePiePlot26.getNoDataMessagePaint();
        float float37 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot26.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets38, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets38);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        int int5 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str12 = multiplePiePlot7.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setNoDataMessage("hi!");
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str26 = multiplePiePlot21.getNoDataMessage();
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setAggregatedItemsPaint(paint27);
        boolean boolean29 = multiplePiePlot21.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot21.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot32.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot32.getDatasetGroup();
        java.lang.String str37 = multiplePiePlot32.getPlotType();
        java.awt.Stroke stroke38 = null;
        multiplePiePlot32.setOutlineStroke(stroke38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        float float42 = multiplePiePlot41.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        multiplePiePlot41.zoom((double) 0.0f);
        multiplePiePlot41.setLimit((double) (-1));
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot41.setBackgroundPaint(paint49);
        multiplePiePlot32.setNoDataMessagePaint(paint49);
        multiplePiePlot21.setNoDataMessagePaint(paint49);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        multiplePiePlot54.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier57 = null;
        multiplePiePlot54.setDrawingSupplier(drawingSupplier57);
        java.awt.Stroke stroke59 = null;
        multiplePiePlot54.setOutlineStroke(stroke59);
        org.jfree.data.general.DatasetGroup datasetGroup61 = multiplePiePlot54.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot63 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset62);
        multiplePiePlot63.setNoDataMessage("hi!");
        multiplePiePlot63.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener68 = null;
        multiplePiePlot63.addChangeListener(plotChangeListener68);
        multiplePiePlot63.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent72 = null;
        multiplePiePlot63.notifyListeners(plotChangeEvent72);
        java.awt.Paint paint74 = multiplePiePlot63.getOutlinePaint();
        java.lang.Object obj75 = multiplePiePlot63.clone();
        java.awt.Paint paint76 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot63.setAggregatedItemsPaint(paint76);
        multiplePiePlot54.setNoDataMessagePaint(paint76);
        boolean boolean79 = multiplePiePlot21.equals((java.lang.Object) multiplePiePlot54);
        org.jfree.chart.util.TableOrder tableOrder80 = multiplePiePlot54.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder80);
        float float82 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection83 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Multiple Pie Plot" + "'", str37, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(datasetGroup61);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(tableOrder80);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 1.0f + "'", float82 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection83);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = multiplePiePlot9.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint10);
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 1);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        float float6 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot5.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = multiplePiePlot20.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str36 = multiplePiePlot31.getNoDataMessage();
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot31.setAggregatedItemsPaint(paint37);
        boolean boolean39 = multiplePiePlot31.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot31.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = multiplePiePlot42.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot42.notifyListeners(plotChangeEvent44);
        org.jfree.data.general.DatasetGroup datasetGroup46 = multiplePiePlot42.getDatasetGroup();
        java.lang.String str47 = multiplePiePlot42.getPlotType();
        java.awt.Stroke stroke48 = null;
        multiplePiePlot42.setOutlineStroke(stroke48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        float float52 = multiplePiePlot51.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent53 = null;
        multiplePiePlot51.notifyListeners(plotChangeEvent53);
        multiplePiePlot51.zoom((double) 0.0f);
        multiplePiePlot51.setLimit((double) (-1));
        java.awt.Paint paint59 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot51.setBackgroundPaint(paint59);
        multiplePiePlot42.setNoDataMessagePaint(paint59);
        multiplePiePlot31.setNoDataMessagePaint(paint59);
        multiplePiePlot20.setOutlinePaint(paint59);
        multiplePiePlot13.setOutlinePaint(paint59);
        multiplePiePlot1.setBackgroundPaint(paint59);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNull(categoryDataset43);
        org.junit.Assert.assertNull(datasetGroup46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Multiple Pie Plot" + "'", str47, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        int int13 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot15.getDatasetGroup();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot9.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        double double27 = multiplePiePlot1.getLimit();
        float float28 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        float float15 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot14.setOutlineStroke(stroke18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot14.getDataset();
        multiplePiePlot14.setBackgroundImageAlignment(15);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot14.getLegendItems();
        java.awt.Font font24 = multiplePiePlot14.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(tableOrder12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        java.awt.Stroke stroke15 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.lang.Comparable comparable22 = multiplePiePlot19.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot19.getDataset();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot19.getDataExtractOrder();
        multiplePiePlot11.setDataExtractOrder(tableOrder24);
        multiplePiePlot1.setDataExtractOrder(tableOrder24);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        multiplePiePlot1.handleClick(15, (int) (short) 10, plotRenderingInfo34);
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(tableOrder24);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertNull(plot36);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        boolean boolean11 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        int int16 = multiplePiePlot15.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Stroke stroke22 = null;
        multiplePiePlot18.setOutlineStroke(stroke22);
        float float24 = multiplePiePlot18.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        multiplePiePlot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.awt.Stroke stroke29 = multiplePiePlot15.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlignment((int) '#');
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(jFreeChart13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 0L + "'", comparable17, 0L);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot10.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot10.setDataset(categoryDataset23);
        java.awt.Paint paint25 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot10.setBackgroundAlpha((float) 'a');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent28);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        multiplePiePlot10.datasetChanged(datasetChangeEvent30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot10.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(tableOrder34);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setNoDataMessage("hi!");
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener11);
        multiplePiePlot6.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot6.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot6.setDataset(categoryDataset19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot6.setDataset(categoryDataset21);
        java.awt.Stroke stroke23 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke23);
        double double25 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener15);
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        boolean boolean21 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot23.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot23.getDrawingSupplier();
        java.awt.Paint paint28 = multiplePiePlot23.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint28);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier12);
        float float14 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot9.getLegendItems();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot9.getRootPlot();
        java.lang.String str17 = multiplePiePlot9.getNoDataMessage();
        java.awt.Paint paint18 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot9.zoom((double) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        java.lang.String str27 = multiplePiePlot22.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot9.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier28);
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Multiple Pie Plot" + "'", str27, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNotNull(tableOrder31);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent6);
        multiplePiePlot0.setOutlineVisible(true);
        java.awt.Image image10 = null;
        multiplePiePlot0.setBackgroundImage(image10);
        java.awt.Image image12 = multiplePiePlot0.getBackgroundImage();
        multiplePiePlot0.setForegroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot16.setOutlineStroke(stroke20);
        float float22 = multiplePiePlot16.getBackgroundImageAlpha();
        boolean boolean23 = multiplePiePlot16.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Paint paint25 = multiplePiePlot16.getBackgroundPaint();
        multiplePiePlot0.setOutlinePaint(paint25);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint9);
        multiplePiePlot1.setForegroundAlpha((float) (short) 100);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        boolean boolean19 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot11.setOutlineStroke(stroke16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot19.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot19.getDatasetGroup();
        java.awt.Stroke stroke24 = null;
        multiplePiePlot19.setOutlineStroke(stroke24);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot19.getPieChart();
        multiplePiePlot11.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        float float31 = multiplePiePlot30.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot30.setOutlineStroke(stroke34);
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        boolean boolean38 = multiplePiePlot30.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent39);
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot30.getRootPlot();
        plot41.setBackgroundImageAlpha((float) 0);
        multiplePiePlot1.setParent(plot41);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        plot41.drawBackgroundImage(graphics2D45, rectangle2D46);
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot41.drawBackground(graphics2D48, rectangle2D49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(plot41);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        multiplePiePlot1.setNoDataMessage("");
        java.lang.String str13 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot8.setOutlineStroke(stroke12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot8.getDataset();
        java.awt.Font font15 = multiplePiePlot8.getNoDataMessageFont();
        java.awt.Paint paint16 = multiplePiePlot8.getNoDataMessagePaint();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        java.lang.String str18 = multiplePiePlot8.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image22 = multiplePiePlot19.getBackgroundImage();
        int int23 = multiplePiePlot19.getBackgroundImageAlignment();
        float float24 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot19.getDatasetGroup();
        java.awt.Paint paint26 = multiplePiePlot19.getAggregatedItemsPaint();
        multiplePiePlot8.setBackgroundPaint(paint26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener15);
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        boolean boolean21 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot23.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot23.getDrawingSupplier();
        java.awt.Paint paint28 = multiplePiePlot23.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint28);
        java.awt.Font font30 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection31 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(legendItemCollection31);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setNoDataMessage("hi!");
        multiplePiePlot5.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener10);
        multiplePiePlot5.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot5.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot5.setDataset(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot5.setDataset(categoryDataset20);
        java.awt.Stroke stroke22 = multiplePiePlot5.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot5.datasetChanged(datasetChangeEvent23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier29);
        float float31 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection32 = multiplePiePlot26.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = multiplePiePlot36.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        multiplePiePlot36.notifyListeners(plotChangeEvent38);
        org.jfree.data.general.DatasetGroup datasetGroup40 = multiplePiePlot36.getDatasetGroup();
        boolean boolean41 = multiplePiePlot26.equals((java.lang.Object) multiplePiePlot36);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        float float44 = multiplePiePlot43.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        multiplePiePlot43.markerChanged(markerChangeEvent45);
        java.awt.Stroke stroke47 = null;
        multiplePiePlot43.setOutlineStroke(stroke47);
        float float49 = multiplePiePlot43.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot43.getPieChart();
        multiplePiePlot36.setPieChart(jFreeChart50);
        multiplePiePlot5.setPieChart(jFreeChart50);
        multiplePiePlot1.setPieChart(jFreeChart50);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        multiplePiePlot1.setDataset(categoryDataset54);
        boolean boolean56 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection32);
        org.junit.Assert.assertNull(categoryDataset37);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image22 = null;
        multiplePiePlot1.setBackgroundImage(image22);
        int int24 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Font font25 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot27.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo30);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot27.setAggregatedItemsPaint(paint34);
        org.jfree.chart.util.TableOrder tableOrder36 = multiplePiePlot27.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        int int40 = multiplePiePlot39.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        float float43 = multiplePiePlot42.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent44);
        java.awt.Stroke stroke46 = null;
        multiplePiePlot42.setOutlineStroke(stroke46);
        float float48 = multiplePiePlot42.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart49 = multiplePiePlot42.getPieChart();
        multiplePiePlot39.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.awt.Stroke stroke53 = multiplePiePlot39.getOutlineStroke();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot39);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(tableOrder36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.5f + "'", float48 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart49);
        org.junit.Assert.assertNotNull(stroke53);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        multiplePiePlot1.zoom((double) (-1L));
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        int int2 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        float float5 = multiplePiePlot4.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot4.setOutlineStroke(stroke8);
        float float10 = multiplePiePlot4.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot4.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent16);
        multiplePiePlot14.zoom((double) 0.0f);
        multiplePiePlot14.setLimit((double) (-1));
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setBackgroundPaint(paint22);
        java.awt.Paint paint24 = multiplePiePlot14.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint24);
        java.awt.Stroke stroke26 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot8.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot8.getDataset();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Stroke stroke15 = multiplePiePlot8.getOutlineStroke();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(jFreeChart16);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        double double7 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        java.awt.Font font10 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setAggregatedItemsPaint(paint27);
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder29);
        boolean boolean31 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setNoDataMessage("hi!");
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str38 = multiplePiePlot33.getNoDataMessage();
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot33.setAggregatedItemsPaint(paint39);
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable43 = multiplePiePlot33.getAggregatedItemsKey();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot33);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(tableOrder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 1.0d + "'", comparable43, 1.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot1.setOutlineStroke(stroke7);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot12.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot12.getDatasetGroup();
        java.lang.String str17 = multiplePiePlot12.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot12.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        boolean boolean20 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((-1), (-1), plotRenderingInfo15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = plot6.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier12);
        float float14 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot9.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot19.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot19.getDatasetGroup();
        boolean boolean24 = multiplePiePlot9.equals((java.lang.Object) multiplePiePlot19);
        java.awt.Paint paint25 = multiplePiePlot9.getBackgroundPaint();
        plot6.setNoDataMessagePaint(paint25);
        java.awt.Paint paint27 = null;
        plot6.setBackgroundPaint(paint27);
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        plot6.setNoDataMessagePaint(paint29);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) '#', 0, plotRenderingInfo12);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick(0, (int) ' ', plotRenderingInfo9);
        double double11 = multiplePiePlot1.getLimit();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke14 = null;
        multiplePiePlot9.setOutlineStroke(stroke14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot9.getDatasetGroup();
        java.awt.Image image17 = null;
        multiplePiePlot9.setBackgroundImage(image17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier19);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        boolean boolean22 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessage("hi!");
        float float14 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setBackgroundPaint(paint26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener34);
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot29.setBackgroundPaint(paint36);
        multiplePiePlot19.setOutlinePaint(paint36);
        multiplePiePlot1.setOutlinePaint(paint36);
        java.lang.String str40 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Multiple Pie Plot" + "'", str40, "Multiple Pie Plot");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        int int13 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot15.getDatasetGroup();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot9.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        double double27 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot29.getRootPlot();
        boolean boolean37 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot29);
        multiplePiePlot29.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        multiplePiePlot41.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = null;
        multiplePiePlot41.setDrawingSupplier(drawingSupplier44);
        float float46 = multiplePiePlot41.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection47 = multiplePiePlot41.getLegendItems();
        org.jfree.chart.plot.Plot plot48 = multiplePiePlot41.getRootPlot();
        float float49 = multiplePiePlot41.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot41.getPieChart();
        multiplePiePlot41.setForegroundAlpha(0.0f);
        java.awt.Paint paint53 = multiplePiePlot41.getOutlinePaint();
        multiplePiePlot29.setNoDataMessagePaint(paint53);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(plot36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection47);
        org.junit.Assert.assertNotNull(plot48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart50);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot6.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo9);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener11);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setAggregatedItemsPaint(paint13);
        multiplePiePlot1.setOutlinePaint(paint13);
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        boolean boolean17 = multiplePiePlot1.isSubplot();
        float float18 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot14.setOutlineStroke(stroke18);
        float float20 = multiplePiePlot14.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setBackgroundPaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        multiplePiePlot24.setOutlinePaint(paint41);
        org.jfree.chart.util.TableOrder tableOrder44 = multiplePiePlot24.getDataExtractOrder();
        java.awt.Image image45 = null;
        multiplePiePlot24.setBackgroundImage(image45);
        int int47 = multiplePiePlot24.getBackgroundImageAlignment();
        java.awt.Font font48 = multiplePiePlot24.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        multiplePiePlot50.markerChanged(markerChangeEvent52);
        java.awt.Paint paint54 = multiplePiePlot50.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = multiplePiePlot50.getInsets();
        multiplePiePlot24.setInsets(rectangleInsets55);
        multiplePiePlot1.setInsets(rectangleInsets55, true);
        multiplePiePlot1.zoom((double) (byte) -1);
        java.awt.Paint paint61 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(tableOrder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(rectangleInsets55);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        plot8.datasetChanged(datasetChangeEvent9);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        plot8.datasetChanged(datasetChangeEvent11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint9);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        multiplePiePlot15.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot15.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot15.setDataset(categoryDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot15.setDataset(categoryDataset30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = multiplePiePlot15.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        multiplePiePlot34.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setAggregatedItemsPaint(paint41);
        org.jfree.chart.util.TableOrder tableOrder43 = multiplePiePlot34.getDataExtractOrder();
        multiplePiePlot15.setDataExtractOrder(tableOrder43);
        boolean boolean45 = multiplePiePlot15.isSubplot();
        java.awt.Font font46 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font46);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot1.getPieChart();
        org.jfree.chart.LegendItemCollection legendItemCollection49 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(tableOrder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNotNull(jFreeChart48);
        org.junit.Assert.assertNotNull(legendItemCollection49);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot11.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot11.getDatasetGroup();
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Stroke stroke22 = null;
        multiplePiePlot18.setOutlineStroke(stroke22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        java.awt.Font font25 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font25);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.awt.Stroke stroke29 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot1.getParent();
        java.awt.Font font31 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setLimit((double) 15);
        float float10 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        boolean boolean14 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setNoDataMessage("hi!");
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str21 = multiplePiePlot16.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot16.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot16.setDataset(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot26.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image34 = multiplePiePlot31.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.awt.Stroke stroke37 = null;
        multiplePiePlot36.setOutlineStroke(stroke37);
        java.lang.Comparable comparable39 = multiplePiePlot36.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot36.getInsets();
        multiplePiePlot31.setInsets(rectangleInsets40, true);
        multiplePiePlot26.setInsets(rectangleInsets40);
        multiplePiePlot16.setInsets(rectangleInsets40, true);
        multiplePiePlot1.setInsets(rectangleInsets40);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNull(image34);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + "Other" + "'", comparable39, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot12.getDataset();
        int int14 = multiplePiePlot12.getBackgroundImageAlignment();
        java.awt.Image image15 = multiplePiePlot12.getBackgroundImage();
        double double16 = multiplePiePlot12.getLimit();
        double double17 = multiplePiePlot12.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        multiplePiePlot19.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot19.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        multiplePiePlot19.setDataset(categoryDataset32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        multiplePiePlot19.setDataset(categoryDataset34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot19.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot19.getPieChart();
        multiplePiePlot12.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot1.zoom((double) 'a');
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent42 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent42);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertNotNull(jFreeChart37);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        int int24 = multiplePiePlot23.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot26.setOutlineStroke(stroke30);
        float float32 = multiplePiePlot26.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot26.getPieChart();
        multiplePiePlot23.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        multiplePiePlot15.setPieChart(jFreeChart33);
        multiplePiePlot15.setOutlineVisible(true);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setBackgroundImageAlpha(0.0f);
        java.awt.Stroke stroke42 = multiplePiePlot15.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke42);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.5f + "'", float32 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart33);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setBackgroundPaint(paint22);
        boolean boolean24 = multiplePiePlot15.isOutlineVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent25);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot1.setDataset(categoryDataset10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNotNull(tableOrder7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        boolean boolean11 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot7.axisChanged(axisChangeEvent10);
        multiplePiePlot7.zoom((double) (-1L));
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot7.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent19);
        multiplePiePlot17.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot17.getDrawingSupplier();
        multiplePiePlot7.setDrawingSupplier(drawingSupplier23);
        multiplePiePlot0.setDrawingSupplier(drawingSupplier23);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier23);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlpha((float) 1L);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot9.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot9.getDatasetGroup();
        java.awt.Stroke stroke14 = null;
        multiplePiePlot9.setOutlineStroke(stroke14);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 0, plotRenderingInfo20);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(jFreeChart16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot1.getDataExtractOrder();
        float float22 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        multiplePiePlot24.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        multiplePiePlot24.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        multiplePiePlot24.setDataset(categoryDataset37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        multiplePiePlot24.setDataset(categoryDataset39);
        java.awt.Stroke stroke41 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke41);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent43);
        java.lang.Object obj45 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setNoDataMessage("hi!");
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener11);
        multiplePiePlot6.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot6.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot6.setDataset(categoryDataset19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot6.setDataset(categoryDataset21);
        java.awt.Stroke stroke23 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Stroke stroke27 = null;
        multiplePiePlot26.setOutlineStroke(stroke27);
        java.lang.Comparable comparable29 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot26.getInsets();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot26.getRootPlot();
        java.awt.Image image32 = multiplePiePlot26.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        java.awt.Paint paint43 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot36.setBackgroundPaint(paint43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        multiplePiePlot46.addChangeListener(plotChangeListener51);
        java.awt.Paint paint53 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot46.setBackgroundPaint(paint53);
        multiplePiePlot36.setOutlinePaint(paint53);
        org.jfree.chart.util.TableOrder tableOrder56 = multiplePiePlot36.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = multiplePiePlot36.getInsets();
        multiplePiePlot26.setInsets(rectangleInsets57);
        multiplePiePlot1.setInsets(rectangleInsets57);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Other" + "'", comparable29, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(tableOrder56);
        org.junit.Assert.assertNotNull(rectangleInsets57);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Image image1 = null;
        multiplePiePlot0.setBackgroundImage(image1);
        java.awt.Stroke stroke3 = multiplePiePlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier8);
        float float10 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot5.getLegendItems();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot5.getRootPlot();
        float float13 = multiplePiePlot5.getBackgroundImageAlpha();
        java.awt.Image image14 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot5.setLimit((double) 10.0f);
        java.awt.Paint paint19 = multiplePiePlot5.getOutlinePaint();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot5.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder20);
        java.lang.Comparable comparable22 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        boolean boolean28 = multiplePiePlot24.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot24.setOutlineStroke(stroke29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot24.getDatasetGroup();
        java.awt.Image image32 = null;
        multiplePiePlot24.setBackgroundImage(image32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setNoDataMessage("hi!");
        multiplePiePlot35.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener40);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot35.setBackgroundPaint(paint42);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = multiplePiePlot35.getInsets();
        multiplePiePlot24.setInsets(rectangleInsets46, false);
        multiplePiePlot0.setInsets(rectangleInsets46);
        java.awt.Paint paint50 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(tableOrder20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot4.setOutlineStroke(stroke5);
        java.lang.Comparable comparable7 = multiplePiePlot4.getAggregatedItemsKey();
        int int8 = multiplePiePlot4.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str15 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot10.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot10.getDatasetGroup();
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        boolean boolean19 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot4);
        multiplePiePlot0.zoom((double) 0.5f);
        float float22 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener20);
        java.lang.Comparable comparable22 = multiplePiePlot13.getAggregatedItemsKey();
        multiplePiePlot13.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier25);
        boolean boolean27 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot29 = null;
        multiplePiePlot1.setParent(plot29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets6, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsKey(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot4.setOutlineStroke(stroke5);
        java.lang.Comparable comparable7 = multiplePiePlot4.getAggregatedItemsKey();
        int int8 = multiplePiePlot4.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str15 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot10.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot10.getDatasetGroup();
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        boolean boolean19 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot4);
        java.awt.Paint paint20 = multiplePiePlot4.getBackgroundPaint();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot4.setOutlineStroke(stroke5);
        java.lang.Comparable comparable7 = multiplePiePlot4.getAggregatedItemsKey();
        int int8 = multiplePiePlot4.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str15 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot10.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot10.getDatasetGroup();
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        boolean boolean19 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot4);
        multiplePiePlot0.zoom((double) 0.5f);
        java.awt.Paint paint22 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot13.getParent();
        java.awt.Paint paint20 = multiplePiePlot13.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener27);
        multiplePiePlot22.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        multiplePiePlot22.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        multiplePiePlot22.setDataset(categoryDataset35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        multiplePiePlot22.setDataset(categoryDataset37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot22.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        float float42 = multiplePiePlot41.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        multiplePiePlot41.zoom((double) 0.0f);
        multiplePiePlot41.setLimit((double) (-1));
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot41.setBackgroundPaint(paint49);
        multiplePiePlot22.setNoDataMessagePaint(paint49);
        java.awt.Image image52 = multiplePiePlot22.getBackgroundImage();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Stroke stroke54 = multiplePiePlot22.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        multiplePiePlot1.setDataset(categoryDataset56);
        org.jfree.data.general.DatasetGroup datasetGroup58 = multiplePiePlot1.getDatasetGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass59 = datasetGroup58.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(datasetGroup39);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(image52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNull(datasetGroup58);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        int int3 = multiplePiePlot0.getBackgroundImageAlignment();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setNoDataMessage("");
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot11.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot11.getDatasetGroup();
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Stroke stroke22 = null;
        multiplePiePlot18.setOutlineStroke(stroke22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        java.awt.Font font25 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font25);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.awt.Stroke stroke29 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D30, rectangle2D31);
        multiplePiePlot1.setLimit(0.0d);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        float float11 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        int int24 = multiplePiePlot23.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot26.setOutlineStroke(stroke30);
        float float32 = multiplePiePlot26.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot26.getPieChart();
        multiplePiePlot23.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        multiplePiePlot15.setPieChart(jFreeChart33);
        boolean boolean36 = multiplePiePlot1.equals((java.lang.Object) jFreeChart33);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.5f + "'", float32 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 0L + "'", comparable9, 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) '4');
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot16.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.zoom((double) 'a');
        java.awt.Image image8 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot6.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo9);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener11);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setAggregatedItemsPaint(paint13);
        multiplePiePlot1.setOutlinePaint(paint13);
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        boolean boolean17 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, 10, plotRenderingInfo14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot16.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo19);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        multiplePiePlot16.datasetChanged(datasetChangeEvent21);
        multiplePiePlot16.setBackgroundAlpha((float) 1L);
        multiplePiePlot16.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot16.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        boolean boolean35 = multiplePiePlot31.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection36 = multiplePiePlot31.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener43);
        java.awt.Paint paint45 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot38.setBackgroundPaint(paint45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        multiplePiePlot48.setNoDataMessage("hi!");
        multiplePiePlot48.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener53 = null;
        multiplePiePlot48.addChangeListener(plotChangeListener53);
        java.awt.Paint paint55 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot48.setBackgroundPaint(paint55);
        multiplePiePlot38.setOutlinePaint(paint55);
        org.jfree.chart.util.TableOrder tableOrder58 = multiplePiePlot38.getDataExtractOrder();
        java.awt.Image image59 = null;
        multiplePiePlot38.setBackgroundImage(image59);
        int int61 = multiplePiePlot38.getBackgroundImageAlignment();
        java.awt.Font font62 = multiplePiePlot38.getNoDataMessageFont();
        multiplePiePlot31.setNoDataMessageFont(font62);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent64 = null;
        multiplePiePlot31.datasetChanged(datasetChangeEvent64);
        org.jfree.chart.JFreeChart jFreeChart66 = multiplePiePlot31.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = multiplePiePlot31.getInsets();
        plot29.setInsets(rectangleInsets67);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(legendItemCollection36);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(tableOrder58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 15 + "'", int61 == 15);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(jFreeChart66);
        org.junit.Assert.assertNotNull(rectangleInsets67);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        java.lang.Object obj13 = multiplePiePlot1.clone();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent6);
        multiplePiePlot0.setOutlineVisible(true);
        java.awt.Image image10 = null;
        multiplePiePlot0.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        float float14 = multiplePiePlot13.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        multiplePiePlot13.zoom((double) 0.0f);
        multiplePiePlot13.setBackgroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        float float23 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        multiplePiePlot22.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot22.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot22.getRootPlot();
        multiplePiePlot13.setParent(plot31);
        multiplePiePlot0.setParent(plot31);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNotNull(plot31);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image9 = multiplePiePlot6.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot11.setOutlineStroke(stroke12);
        java.lang.Comparable comparable14 = multiplePiePlot11.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot11.getInsets();
        multiplePiePlot6.setInsets(rectangleInsets15, true);
        multiplePiePlot1.setInsets(rectangleInsets15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent23);
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(tableOrder25);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint9);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setNoDataMessage("hi!");
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str21 = multiplePiePlot16.getNoDataMessage();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot16.setAggregatedItemsPaint(paint22);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot16.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot16.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(jFreeChart27);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        int int10 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot12.setOutlineStroke(stroke16);
        float float18 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.setPieChart(jFreeChart19);
        float float22 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint23 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Stroke stroke27 = null;
        multiplePiePlot26.setOutlineStroke(stroke27);
        java.awt.Font font29 = multiplePiePlot26.getNoDataMessageFont();
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable32 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        multiplePiePlot34.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        multiplePiePlot34.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        multiplePiePlot34.setDataset(categoryDataset47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        multiplePiePlot34.setDataset(categoryDataset49);
        java.awt.Stroke stroke51 = multiplePiePlot34.getOutlineStroke();
        multiplePiePlot26.setOutlineStroke(stroke51);
        org.jfree.chart.util.TableOrder tableOrder53 = multiplePiePlot26.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 1 + "'", comparable32, 1);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(tableOrder53);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setAggregatedItemsPaint(paint27);
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder29);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent31);
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D37, rectangle2D38);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(tableOrder29);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Image image1 = null;
        multiplePiePlot0.setBackgroundImage(image1);
        java.awt.Stroke stroke3 = multiplePiePlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier8);
        float float10 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot5.getLegendItems();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot5.getRootPlot();
        float float13 = multiplePiePlot5.getBackgroundImageAlpha();
        java.awt.Image image14 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot5.setLimit((double) 10.0f);
        java.awt.Paint paint19 = multiplePiePlot5.getOutlinePaint();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot5.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder20);
        java.lang.Comparable comparable22 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        boolean boolean28 = multiplePiePlot24.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot24.setOutlineStroke(stroke29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot24.getDatasetGroup();
        java.awt.Image image32 = null;
        multiplePiePlot24.setBackgroundImage(image32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setNoDataMessage("hi!");
        multiplePiePlot35.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener40);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot35.setBackgroundPaint(paint42);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = multiplePiePlot35.getInsets();
        multiplePiePlot24.setInsets(rectangleInsets46, false);
        multiplePiePlot0.setInsets(rectangleInsets46);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(tableOrder20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets46);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot8.setOutlineStroke(stroke12);
        java.awt.Paint paint14 = multiplePiePlot8.getNoDataMessagePaint();
        java.lang.Comparable comparable15 = multiplePiePlot8.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot17.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot17.getDrawingSupplier();
        multiplePiePlot8.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot1.zoom((double) '#');
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(drawingSupplier21);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image22 = null;
        multiplePiePlot1.setBackgroundImage(image22);
        int int24 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D27, rectangle2D28);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        java.awt.Stroke stroke18 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent19);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier15);
        float float17 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot12.getLegendItems();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent20);
        float float22 = multiplePiePlot12.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.data.general.DatasetGroup datasetGroup24 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup24);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setLimit((double) 10);
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Stroke stroke9 = null;
        multiplePiePlot8.setOutlineStroke(stroke9);
        java.lang.Comparable comparable11 = multiplePiePlot8.getAggregatedItemsKey();
        int int12 = multiplePiePlot8.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot14.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot14.getDatasetGroup();
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets23, false);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundImageAlignment((-1));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent11);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        boolean boolean15 = multiplePiePlot1.isSubplot();
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier13);
        float float15 = multiplePiePlot10.getForegroundAlpha();
        multiplePiePlot10.zoom(0.0d);
        java.awt.Paint paint18 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        multiplePiePlot1.setLimit((double) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font6 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot8.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setBackgroundPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setNoDataMessage("hi!");
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener30);
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot25.setBackgroundPaint(paint32);
        multiplePiePlot15.setOutlinePaint(paint32);
        org.jfree.chart.util.TableOrder tableOrder35 = multiplePiePlot15.getDataExtractOrder();
        java.awt.Image image36 = null;
        multiplePiePlot15.setBackgroundImage(image36);
        int int38 = multiplePiePlot15.getBackgroundImageAlignment();
        java.awt.Font font39 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot8.setNoDataMessageFont(font39);
        multiplePiePlot1.setNoDataMessageFont(font39);
        org.jfree.chart.util.TableOrder tableOrder42 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(tableOrder35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(tableOrder42);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot1.setDataset(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot23.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo26);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        multiplePiePlot23.datasetChanged(datasetChangeEvent28);
        float float30 = multiplePiePlot23.getBackgroundImageAlpha();
        float float31 = multiplePiePlot23.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setNoDataMessage("hi!");
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        multiplePiePlot39.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = null;
        multiplePiePlot39.setDrawingSupplier(drawingSupplier42);
        float float44 = multiplePiePlot39.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection45 = multiplePiePlot39.getLegendItems();
        org.jfree.chart.plot.Plot plot46 = multiplePiePlot39.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        java.awt.Stroke stroke49 = null;
        multiplePiePlot48.setOutlineStroke(stroke49);
        java.lang.Comparable comparable51 = multiplePiePlot48.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = multiplePiePlot48.getInsets();
        plot46.setInsets(rectangleInsets52, false);
        multiplePiePlot33.setInsets(rectangleInsets52, false);
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = multiplePiePlot33.getInsets();
        multiplePiePlot23.setInsets(rectangleInsets59);
        multiplePiePlot1.setInsets(rectangleInsets59, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, (int) 'a', plotRenderingInfo65);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent67 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent67);
        org.jfree.data.category.CategoryDataset categoryDataset69 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot70 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset69);
        multiplePiePlot70.setNoDataMessage("hi!");
        multiplePiePlot70.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener75 = null;
        multiplePiePlot70.addChangeListener(plotChangeListener75);
        multiplePiePlot70.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo81 = null;
        multiplePiePlot70.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo81);
        org.jfree.data.category.CategoryDataset categoryDataset83 = null;
        multiplePiePlot70.setDataset(categoryDataset83);
        java.awt.Paint paint85 = multiplePiePlot70.getOutlinePaint();
        multiplePiePlot70.setBackgroundAlpha((float) 'a');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent88 = null;
        multiplePiePlot70.notifyListeners(plotChangeEvent88);
        org.jfree.chart.JFreeChart jFreeChart90 = multiplePiePlot70.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart90);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection45);
        org.junit.Assert.assertNotNull(plot46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + "Other" + "'", comparable51, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(paint85);
        org.junit.Assert.assertNotNull(jFreeChart90);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Stroke stroke15 = null;
        multiplePiePlot14.setOutlineStroke(stroke15);
        java.awt.Font font17 = multiplePiePlot14.getNoDataMessageFont();
        java.lang.String str18 = multiplePiePlot14.getPlotType();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        java.awt.Paint paint20 = multiplePiePlot14.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str27 = multiplePiePlot22.getNoDataMessage();
        java.lang.String str28 = multiplePiePlot22.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot22.getPieChart();
        multiplePiePlot14.setPieChart(jFreeChart29);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot14.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setNoDataMessage("hi!");
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot33.addChangeListener(plotChangeListener38);
        multiplePiePlot33.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        multiplePiePlot33.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        multiplePiePlot33.setDataset(categoryDataset46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        multiplePiePlot33.setDataset(categoryDataset48);
        org.jfree.data.general.DatasetGroup datasetGroup50 = multiplePiePlot33.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        multiplePiePlot52.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo55);
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        multiplePiePlot52.addChangeListener(plotChangeListener57);
        java.awt.Paint paint59 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot52.setAggregatedItemsPaint(paint59);
        org.jfree.chart.util.TableOrder tableOrder61 = multiplePiePlot52.getDataExtractOrder();
        multiplePiePlot33.setDataExtractOrder(tableOrder61);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent63 = null;
        multiplePiePlot33.datasetChanged(datasetChangeEvent63);
        java.awt.Font font65 = multiplePiePlot33.getNoDataMessageFont();
        multiplePiePlot14.setNoDataMessageFont(font65);
        multiplePiePlot1.setNoDataMessageFont(font65);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart29);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertNull(datasetGroup50);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(tableOrder61);
        org.junit.Assert.assertNotNull(font65);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) (short) 1, plotRenderingInfo11);
        double double13 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent17);
        java.lang.Class<?> wildcardClass19 = multiplePiePlot15.getClass();
        boolean boolean20 = multiplePiePlot8.equals((java.lang.Object) wildcardClass19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        float float23 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Stroke stroke26 = null;
        multiplePiePlot22.setOutlineStroke(stroke26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot22.getDataset();
        java.awt.Font font29 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot8.setNoDataMessageFont(font29);
        multiplePiePlot1.setNoDataMessageFont(font29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertNotNull(font29);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setLimit(1.0d);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier15);
        float float17 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot12.getLegendItems();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent20);
        float float22 = multiplePiePlot12.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot25.setOutlineVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        multiplePiePlot25.axisChanged(axisChangeEvent32);
        boolean boolean34 = multiplePiePlot25.isOutlineVisible();
        boolean boolean35 = multiplePiePlot25.isOutlineVisible();
        java.lang.String str36 = multiplePiePlot25.getPlotType();
        java.awt.Image image37 = null;
        multiplePiePlot25.setBackgroundImage(image37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        multiplePiePlot40.setNoDataMessage("hi!");
        multiplePiePlot40.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener45 = null;
        multiplePiePlot40.addChangeListener(plotChangeListener45);
        java.awt.Paint paint47 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot40.setBackgroundPaint(paint47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        multiplePiePlot50.setNoDataMessage("hi!");
        multiplePiePlot50.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        multiplePiePlot50.addChangeListener(plotChangeListener55);
        java.awt.Paint paint57 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot50.setBackgroundPaint(paint57);
        multiplePiePlot40.setOutlinePaint(paint57);
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo64 = null;
        multiplePiePlot61.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo64);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent66 = null;
        multiplePiePlot61.datasetChanged(datasetChangeEvent66);
        multiplePiePlot61.setBackgroundAlpha((float) 1L);
        multiplePiePlot61.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets72 = multiplePiePlot61.getInsets();
        multiplePiePlot40.setInsets(rectangleInsets72);
        multiplePiePlot25.setInsets(rectangleInsets72, true);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Multiple Pie Plot" + "'", str36, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(rectangleInsets72);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        java.lang.Object obj9 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Stroke stroke15 = null;
        multiplePiePlot11.setOutlineStroke(stroke15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot11.getDataset();
        java.awt.Font font18 = multiplePiePlot11.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot11.getParent();
        float float20 = multiplePiePlot11.getBackgroundAlpha();
        multiplePiePlot11.setBackgroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot24.getDataset();
        int int26 = multiplePiePlot24.getBackgroundImageAlignment();
        java.awt.Image image27 = multiplePiePlot24.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot24.getDataset();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot24.getParent();
        multiplePiePlot24.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setNoDataMessage("hi!");
        boolean boolean37 = multiplePiePlot33.equals((java.lang.Object) 10L);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent38 = null;
        multiplePiePlot33.datasetChanged(datasetChangeEvent38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        java.awt.Stroke stroke42 = null;
        multiplePiePlot41.setOutlineStroke(stroke42);
        java.lang.Comparable comparable44 = multiplePiePlot41.getAggregatedItemsKey();
        int int45 = multiplePiePlot41.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        multiplePiePlot47.setNoDataMessage("hi!");
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str52 = multiplePiePlot47.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset53 = multiplePiePlot47.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup54 = multiplePiePlot47.getDatasetGroup();
        multiplePiePlot41.setParent((org.jfree.chart.plot.Plot) multiplePiePlot47);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = multiplePiePlot41.getInsets();
        multiplePiePlot33.setInsets(rectangleInsets56, false);
        double double59 = multiplePiePlot33.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        multiplePiePlot61.setNoDataMessage("hi!");
        multiplePiePlot61.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot61.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.chart.plot.Plot plot68 = multiplePiePlot61.getRootPlot();
        boolean boolean69 = multiplePiePlot33.equals((java.lang.Object) multiplePiePlot61);
        java.awt.Paint paint70 = multiplePiePlot61.getAggregatedItemsPaint();
        multiplePiePlot24.setBackgroundPaint(paint70);
        org.jfree.data.category.CategoryDataset categoryDataset72 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot73 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset72);
        multiplePiePlot73.setNoDataMessage("hi!");
        multiplePiePlot73.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener78 = null;
        multiplePiePlot73.addChangeListener(plotChangeListener78);
        multiplePiePlot73.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo84 = null;
        multiplePiePlot73.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo84);
        org.jfree.data.category.CategoryDataset categoryDataset86 = null;
        multiplePiePlot73.setDataset(categoryDataset86);
        java.awt.Paint paint88 = multiplePiePlot73.getOutlinePaint();
        multiplePiePlot73.setBackgroundAlpha((float) 'a');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent91 = null;
        multiplePiePlot73.notifyListeners(plotChangeEvent91);
        org.jfree.chart.JFreeChart jFreeChart93 = multiplePiePlot73.getPieChart();
        multiplePiePlot24.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart93);
        multiplePiePlot11.setPieChart(jFreeChart93);
        multiplePiePlot1.setPieChart(jFreeChart93);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNull(image27);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + "Other" + "'", comparable44, "Other");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(categoryDataset53);
        org.junit.Assert.assertNull(datasetGroup54);
        org.junit.Assert.assertNotNull(rectangleInsets56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(plot68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(paint88);
        org.junit.Assert.assertNotNull(jFreeChart93);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom((double) 1.0f);
        java.awt.Image image16 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Paint paint10 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot17.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo20);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener22);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setAggregatedItemsPaint(paint24);
        multiplePiePlot12.setOutlinePaint(paint24);
        java.awt.Paint paint27 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint27);
        java.lang.String str29 = multiplePiePlot1.getNoDataMessage();
        float float30 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot0.getDrawingSupplier();
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot8.setDataset(categoryDataset10);
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) '#');
        java.awt.Paint paint14 = multiplePiePlot8.getNoDataMessagePaint();
        java.lang.String str15 = multiplePiePlot8.getPlotType();
        boolean boolean16 = multiplePiePlot8.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str23 = multiplePiePlot18.getNoDataMessage();
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot18.setAggregatedItemsPaint(paint24);
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        multiplePiePlot18.setForegroundAlpha((float) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        boolean boolean35 = multiplePiePlot31.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection36 = multiplePiePlot31.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener43);
        java.awt.Paint paint45 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot38.setBackgroundPaint(paint45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        multiplePiePlot48.setNoDataMessage("hi!");
        multiplePiePlot48.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener53 = null;
        multiplePiePlot48.addChangeListener(plotChangeListener53);
        java.awt.Paint paint55 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot48.setBackgroundPaint(paint55);
        multiplePiePlot38.setOutlinePaint(paint55);
        org.jfree.chart.util.TableOrder tableOrder58 = multiplePiePlot38.getDataExtractOrder();
        java.awt.Image image59 = null;
        multiplePiePlot38.setBackgroundImage(image59);
        int int61 = multiplePiePlot38.getBackgroundImageAlignment();
        java.awt.Font font62 = multiplePiePlot38.getNoDataMessageFont();
        multiplePiePlot31.setNoDataMessageFont(font62);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent64 = null;
        multiplePiePlot31.datasetChanged(datasetChangeEvent64);
        org.jfree.chart.JFreeChart jFreeChart66 = multiplePiePlot31.getPieChart();
        multiplePiePlot18.setPieChart(jFreeChart66);
        multiplePiePlot8.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        multiplePiePlot0.setPieChart(jFreeChart66);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(legendItemCollection36);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(tableOrder58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 15 + "'", int61 == 15);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(jFreeChart66);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Stroke stroke14 = null;
        multiplePiePlot13.setOutlineStroke(stroke14);
        java.lang.Comparable comparable16 = multiplePiePlot13.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot13.getInsets();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Stroke stroke21 = null;
        multiplePiePlot20.setOutlineStroke(stroke21);
        java.lang.Comparable comparable23 = multiplePiePlot20.getAggregatedItemsKey();
        java.lang.Object obj24 = multiplePiePlot20.clone();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        plot27.notifyListeners(plotChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener36);
        multiplePiePlot31.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        multiplePiePlot31.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo42);
        java.awt.Paint paint44 = multiplePiePlot31.getAggregatedItemsPaint();
        plot27.setNoDataMessagePaint(paint44);
        multiplePiePlot13.setOutlinePaint(paint44);
        java.awt.Stroke stroke47 = multiplePiePlot13.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = multiplePiePlot13.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets48);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "Other" + "'", comparable23, "Other");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNull(stroke47);
        org.junit.Assert.assertNotNull(rectangleInsets48);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent6);
        multiplePiePlot0.setOutlineVisible(true);
        java.awt.Image image10 = null;
        multiplePiePlot0.setBackgroundImage(image10);
        java.awt.Image image12 = multiplePiePlot0.getBackgroundImage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot0.setDataset(categoryDataset15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image12);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        float float11 = multiplePiePlot1.getForegroundAlpha();
        int int12 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setAggregatedItemsPaint(paint20);
        boolean boolean22 = multiplePiePlot14.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets23, false);
        double double26 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot11.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot11.getDatasetGroup();
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot18.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot18.getDatasetGroup();
        java.awt.Stroke stroke23 = null;
        multiplePiePlot18.setOutlineStroke(stroke23);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener35);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener37);
        java.lang.Comparable comparable39 = multiplePiePlot30.getAggregatedItemsKey();
        multiplePiePlot30.zoom((double) (-1L));
        java.awt.Font font42 = multiplePiePlot30.getNoDataMessageFont();
        multiplePiePlot11.setNoDataMessageFont(font42);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + 0L + "'", comparable39, 0L);
        org.junit.Assert.assertNotNull(font42);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier8);
        float float10 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot5.getLegendItems();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Stroke stroke15 = null;
        multiplePiePlot14.setOutlineStroke(stroke15);
        java.lang.Comparable comparable17 = multiplePiePlot14.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot14.getInsets();
        plot12.setInsets(rectangleInsets18, false);
        multiplePiePlot0.setInsets(rectangleInsets18, false);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot24.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder31);
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = plot33.getInsets();
        plot33.setBackgroundImageAlignment((int) (short) 10);
        java.lang.String str37 = plot33.getNoDataMessage();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(tableOrder31);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        double double12 = multiplePiePlot1.getLimit();
        java.awt.Paint paint13 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier18);
        float float20 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot7.setDataset(categoryDataset9);
        java.awt.Paint paint11 = multiplePiePlot7.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot7.axisChanged(axisChangeEvent12);
        multiplePiePlot7.setBackgroundImageAlpha(0.0f);
        boolean boolean16 = multiplePiePlot7.isSubplot();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        multiplePiePlot19.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent28);
        java.lang.String str30 = multiplePiePlot19.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        float float33 = multiplePiePlot32.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent34);
        java.awt.Stroke stroke36 = null;
        multiplePiePlot32.setOutlineStroke(stroke36);
        float float38 = multiplePiePlot32.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot32.getPieChart();
        multiplePiePlot19.setPieChart(jFreeChart39);
        multiplePiePlot7.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.5f + "'", float38 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart39);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint11 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.zoom((double) '#');
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Font font22 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font22);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(plot27);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo11);
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        multiplePiePlot1.setLimit(0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener13);
        multiplePiePlot8.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot8.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo19);
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier27);
        float float29 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection30 = multiplePiePlot24.getLegendItems();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot24.getRootPlot();
        float float32 = multiplePiePlot24.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot24.getPieChart();
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        float float35 = multiplePiePlot8.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot8.getDatasetGroup();
        org.jfree.chart.util.TableOrder tableOrder37 = multiplePiePlot8.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder37);
        int int39 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.5f + "'", float32 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.5f + "'", float35 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertNotNull(tableOrder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawOutline(graphics2D11, rectangle2D12);
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Paint paint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsPaint(paint16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        float float5 = multiplePiePlot0.getForegroundAlpha();
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener13);
        multiplePiePlot8.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot8.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot8.setDataset(categoryDataset21);
        java.awt.Paint paint23 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot8.getParent();
        multiplePiePlot8.zoom((double) (short) 1);
        boolean boolean27 = multiplePiePlot0.equals((java.lang.Object) (short) 1);
        multiplePiePlot0.setForegroundAlpha((float) '4');
        java.lang.Comparable comparable30 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent31);
        org.jfree.chart.LegendItemCollection legendItemCollection33 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 100L + "'", comparable30, 100L);
        org.junit.Assert.assertNotNull(legendItemCollection33);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Stroke stroke23 = null;
        multiplePiePlot22.setOutlineStroke(stroke23);
        java.lang.Comparable comparable25 = multiplePiePlot22.getAggregatedItemsKey();
        java.awt.Font font26 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str34 = multiplePiePlot29.getNoDataMessage();
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot29.setAggregatedItemsPaint(paint35);
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint39 = multiplePiePlot29.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot29.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart40);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(jFreeChart40);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.zoom((double) (-1L));
        java.awt.Font font13 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot1.handleClick((int) (byte) 1, (int) (byte) 100, plotRenderingInfo18);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        java.awt.Stroke stroke15 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.lang.Comparable comparable22 = multiplePiePlot19.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot19.getDataset();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot19.getDataExtractOrder();
        multiplePiePlot11.setDataExtractOrder(tableOrder24);
        multiplePiePlot1.setDataExtractOrder(tableOrder24);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.Plot plot28 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot27.setParent(plot28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(tableOrder24);
        org.junit.Assert.assertNull(plot27);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        double double14 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot10.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot10.setDataset(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot10.setDataset(categoryDataset25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot10.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent31);
        multiplePiePlot29.zoom((double) 0.0f);
        multiplePiePlot29.setLimit((double) (-1));
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot29.setBackgroundPaint(paint37);
        multiplePiePlot10.setNoDataMessagePaint(paint37);
        java.awt.Image image40 = multiplePiePlot10.getBackgroundImage();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        float float42 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder43 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup44 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(image40);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder43);
        org.junit.Assert.assertNull(datasetGroup44);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        java.awt.Stroke stroke15 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.lang.Comparable comparable22 = multiplePiePlot19.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot19.getDataset();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot19.getDataExtractOrder();
        multiplePiePlot11.setDataExtractOrder(tableOrder24);
        multiplePiePlot1.setDataExtractOrder(tableOrder24);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha(100.0f);
        org.jfree.chart.util.TableOrder tableOrder32 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        float float35 = multiplePiePlot34.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        multiplePiePlot34.notifyListeners(plotChangeEvent36);
        java.awt.Paint paint38 = multiplePiePlot34.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset39 = multiplePiePlot34.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        multiplePiePlot41.setNoDataMessage("hi!");
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener46 = null;
        multiplePiePlot41.addChangeListener(plotChangeListener46);
        java.awt.Paint paint48 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot41.setBackgroundPaint(paint48);
        java.awt.Paint paint50 = multiplePiePlot41.getOutlinePaint();
        multiplePiePlot34.setBackgroundPaint(paint50);
        multiplePiePlot1.setAggregatedItemsPaint(paint50);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(tableOrder24);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertNotNull(tableOrder32);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(categoryDataset39);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        int int10 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot12.setOutlineStroke(stroke16);
        float float18 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.setPieChart(jFreeChart19);
        multiplePiePlot1.setOutlineVisible(true);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean26 = multiplePiePlot1.isOutlineVisible();
        java.awt.Image image27 = null;
        multiplePiePlot1.setBackgroundImage(image27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot11.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot11.getDatasetGroup();
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Stroke stroke22 = null;
        multiplePiePlot18.setOutlineStroke(stroke22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        java.awt.Font font25 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font25);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.awt.Stroke stroke29 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D30, rectangle2D31);
        int int33 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setForegroundAlpha((float) 10);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit((-1.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.Plot plot15 = plot14.getRootPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(tableOrder9);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint21);
        multiplePiePlot1.setNoDataMessagePaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setNoDataMessage("hi!");
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener30);
        multiplePiePlot25.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        multiplePiePlot25.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        multiplePiePlot25.setDataset(categoryDataset38);
        java.awt.Paint paint40 = multiplePiePlot25.getOutlinePaint();
        java.awt.Paint paint41 = multiplePiePlot25.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image47 = multiplePiePlot44.getBackgroundImage();
        java.awt.Paint paint48 = multiplePiePlot44.getNoDataMessagePaint();
        java.awt.Image image49 = null;
        multiplePiePlot44.setBackgroundImage(image49);
        java.awt.Paint paint51 = multiplePiePlot44.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        float float54 = multiplePiePlot53.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        multiplePiePlot53.markerChanged(markerChangeEvent55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        multiplePiePlot58.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo61);
        org.jfree.chart.event.PlotChangeListener plotChangeListener63 = null;
        multiplePiePlot58.addChangeListener(plotChangeListener63);
        java.awt.Paint paint65 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot58.setAggregatedItemsPaint(paint65);
        multiplePiePlot53.setOutlinePaint(paint65);
        multiplePiePlot44.setAggregatedItemsPaint(paint65);
        multiplePiePlot1.setNoDataMessagePaint(paint65);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(image47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(paint65);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setBackgroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier32);
        float float34 = multiplePiePlot29.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection35 = multiplePiePlot29.getLegendItems();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot29.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.awt.Stroke stroke39 = null;
        multiplePiePlot38.setOutlineStroke(stroke39);
        java.lang.Comparable comparable41 = multiplePiePlot38.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = multiplePiePlot38.getInsets();
        plot36.setInsets(rectangleInsets42, false);
        multiplePiePlot23.setInsets(rectangleInsets42, false);
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = multiplePiePlot23.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets49, false);
        org.jfree.chart.plot.Plot plot52 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent53 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent53);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNotNull(plot36);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + "Other" + "'", comparable41, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(plot52);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot16.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo19);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        multiplePiePlot16.datasetChanged(datasetChangeEvent21);
        multiplePiePlot16.setBackgroundAlpha((float) 1L);
        multiplePiePlot16.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot16.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener36);
        multiplePiePlot31.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        multiplePiePlot31.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        multiplePiePlot31.setDataset(categoryDataset44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        multiplePiePlot31.setDataset(categoryDataset46);
        org.jfree.data.general.DatasetGroup datasetGroup48 = multiplePiePlot31.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        multiplePiePlot50.notifyListeners(plotChangeEvent52);
        multiplePiePlot50.zoom((double) 0.0f);
        multiplePiePlot50.setLimit((double) (-1));
        java.awt.Paint paint58 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot50.setBackgroundPaint(paint58);
        multiplePiePlot31.setNoDataMessagePaint(paint58);
        java.awt.Image image61 = multiplePiePlot31.getBackgroundImage();
        multiplePiePlot31.setLimit((double) 10L);
        boolean boolean64 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot31);
        org.jfree.chart.util.TableOrder tableOrder65 = multiplePiePlot31.getDataExtractOrder();
        java.awt.Graphics2D graphics2D66 = null;
        java.awt.geom.Rectangle2D rectangle2D67 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot31.drawBackground(graphics2D66, rectangle2D67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(jFreeChart29);
        org.junit.Assert.assertNull(datasetGroup48);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNull(image61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tableOrder65);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick((int) (byte) 1, (int) (short) 1, plotRenderingInfo16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str24 = multiplePiePlot19.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot19.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot19.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        float float29 = multiplePiePlot28.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        multiplePiePlot33.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo36);
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot33.addChangeListener(plotChangeListener38);
        java.awt.Paint paint40 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot33.setAggregatedItemsPaint(paint40);
        multiplePiePlot28.setOutlinePaint(paint40);
        multiplePiePlot19.setAggregatedItemsPaint(paint40);
        multiplePiePlot1.setOutlinePaint(paint40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(tableOrder9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) '#', (int) ' ', plotRenderingInfo12);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        float float13 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 100.0f + "'", comparable11, 100.0f);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = multiplePiePlot11.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot11.handleClick((int) '4', (int) (byte) 10, plotRenderingInfo15);
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) plotRenderingInfo15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        multiplePiePlot19.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot19.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo30);
        java.awt.Paint paint32 = multiplePiePlot19.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        float float36 = multiplePiePlot35.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot35.markerChanged(markerChangeEvent37);
        java.awt.Stroke stroke39 = null;
        multiplePiePlot35.setOutlineStroke(stroke39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = multiplePiePlot35.getDataset();
        multiplePiePlot35.setBackgroundImageAlignment(15);
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot35.setAggregatedItemsPaint(paint44);
        multiplePiePlot1.setAggregatedItemsPaint(paint44);
        org.jfree.data.category.CategoryDataset categoryDataset47 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNull(categoryDataset47);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent10);
        java.lang.Class<?> wildcardClass12 = multiplePiePlot8.getClass();
        boolean boolean13 = multiplePiePlot1.equals((java.lang.Object) wildcardClass12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image9 = multiplePiePlot6.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot11.setOutlineStroke(stroke12);
        java.lang.Comparable comparable14 = multiplePiePlot11.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot11.getInsets();
        multiplePiePlot6.setInsets(rectangleInsets15, true);
        multiplePiePlot1.setInsets(rectangleInsets15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(tableOrder21);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot1.getInsets();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundImageAlignment(10);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        int int19 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        java.lang.Object obj9 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        int int10 = multiplePiePlot1.getBackgroundImageAlignment();
        double double11 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot13.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot13.getDatasetGroup();
        java.lang.String str18 = multiplePiePlot13.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot13.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint20);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        float float6 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot5.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom(0.0d);
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Stroke stroke15 = null;
        multiplePiePlot11.setOutlineStroke(stroke15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot11.getDataset();
        java.awt.Paint paint18 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setNoDataMessage("hi!");
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str26 = multiplePiePlot21.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot21.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot21.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot21.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot8.setBackgroundPaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener23);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot18.setBackgroundPaint(paint25);
        multiplePiePlot8.setOutlinePaint(paint25);
        org.jfree.chart.util.TableOrder tableOrder28 = multiplePiePlot8.getDataExtractOrder();
        java.awt.Image image29 = null;
        multiplePiePlot8.setBackgroundImage(image29);
        int int31 = multiplePiePlot8.getBackgroundImageAlignment();
        boolean boolean32 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = multiplePiePlot8.getDrawingSupplier();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(drawingSupplier33);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent22);
        multiplePiePlot20.zoom((double) 0.0f);
        multiplePiePlot20.setLimit((double) (-1));
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setBackgroundPaint(paint28);
        multiplePiePlot1.setNoDataMessagePaint(paint28);
        java.awt.Image image31 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot1.getDataset();
        java.awt.Paint paint33 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(image31);
        org.junit.Assert.assertNull(categoryDataset32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        float float5 = multiplePiePlot0.getForegroundAlpha();
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener13);
        multiplePiePlot8.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot8.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot8.setDataset(categoryDataset21);
        java.awt.Paint paint23 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot8.getParent();
        multiplePiePlot8.zoom((double) (short) 1);
        boolean boolean27 = multiplePiePlot0.equals((java.lang.Object) (short) 1);
        multiplePiePlot0.setForegroundAlpha((float) '4');
        java.lang.Comparable comparable30 = multiplePiePlot0.getAggregatedItemsKey();
        float float31 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot33.setOutlineStroke(stroke34);
        java.lang.Comparable comparable36 = multiplePiePlot33.getAggregatedItemsKey();
        int int37 = multiplePiePlot33.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        multiplePiePlot39.setNoDataMessage("hi!");
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str44 = multiplePiePlot39.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset45 = multiplePiePlot39.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup46 = multiplePiePlot39.getDatasetGroup();
        multiplePiePlot33.setParent((org.jfree.chart.plot.Plot) multiplePiePlot39);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        multiplePiePlot49.setNoDataMessage("hi!");
        multiplePiePlot49.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener54 = null;
        multiplePiePlot49.addChangeListener(plotChangeListener54);
        java.awt.Paint paint56 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot49.setBackgroundPaint(paint56);
        java.awt.Paint paint58 = multiplePiePlot49.getOutlinePaint();
        multiplePiePlot39.setAggregatedItemsPaint(paint58);
        org.jfree.data.category.CategoryDataset categoryDataset60 = multiplePiePlot39.getDataset();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot39);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 100L + "'", comparable30, 100L);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 52.0f + "'", float31 == 52.0f);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Other" + "'", comparable36, "Other");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(categoryDataset45);
        org.junit.Assert.assertNull(datasetGroup46);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNull(categoryDataset60);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tableOrder10);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint21);
        multiplePiePlot1.setNoDataMessagePaint(paint21);
        java.awt.Paint paint24 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image25 = null;
        multiplePiePlot1.setBackgroundImage(image25);
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot8.axisChanged(axisChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint11);
        double double13 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        java.lang.String str25 = multiplePiePlot17.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent26 = null;
        multiplePiePlot17.datasetChanged(datasetChangeEvent26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot17.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str35 = multiplePiePlot30.getNoDataMessage();
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot30.setAggregatedItemsPaint(paint36);
        boolean boolean38 = multiplePiePlot30.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot30.getInsets();
        org.jfree.chart.util.TableOrder tableOrder40 = multiplePiePlot30.getDataExtractOrder();
        multiplePiePlot17.setDataExtractOrder(tableOrder40);
        multiplePiePlot1.setDataExtractOrder(tableOrder40);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(tableOrder40);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.lang.Object obj9 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setLimit((double) 15);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot1.setOutlineStroke(stroke7);
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.lang.Comparable comparable10 = multiplePiePlot7.getAggregatedItemsKey();
        java.awt.Font font11 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font11);
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint21);
        multiplePiePlot1.setNoDataMessagePaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Stroke stroke26 = null;
        multiplePiePlot25.setOutlineStroke(stroke26);
        java.awt.Font font28 = multiplePiePlot25.getNoDataMessageFont();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable31 = multiplePiePlot25.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setNoDataMessage("hi!");
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot33.addChangeListener(plotChangeListener38);
        multiplePiePlot33.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        multiplePiePlot33.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        multiplePiePlot33.setDataset(categoryDataset46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        multiplePiePlot33.setDataset(categoryDataset48);
        java.awt.Stroke stroke50 = multiplePiePlot33.getOutlineStroke();
        multiplePiePlot25.setOutlineStroke(stroke50);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        java.lang.String str53 = multiplePiePlot25.getNoDataMessage();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 1 + "'", comparable31, 1);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint9);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setLimit((double) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot15.setOutlineStroke(stroke19);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint23 = multiplePiePlot15.getBackgroundPaint();
        java.awt.Image image24 = multiplePiePlot15.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier29);
        float float31 = multiplePiePlot26.getForegroundAlpha();
        multiplePiePlot26.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        float float36 = multiplePiePlot35.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot35.markerChanged(markerChangeEvent37);
        java.awt.Paint paint39 = multiplePiePlot35.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot35.getInsets();
        multiplePiePlot26.setInsets(rectangleInsets40, false);
        multiplePiePlot15.setInsets(rectangleInsets40, true);
        multiplePiePlot1.setInsets(rectangleInsets40);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent46);
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = multiplePiePlot1.getInsets();
        float float49 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent9);
        org.junit.Assert.assertNull(image4);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        multiplePiePlot1.setOutlinePaint(paint18);
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot1.getDataExtractOrder();
        float float22 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        multiplePiePlot24.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        multiplePiePlot24.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        multiplePiePlot24.setDataset(categoryDataset37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        multiplePiePlot24.setDataset(categoryDataset39);
        java.awt.Stroke stroke41 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke41);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.general.DatasetGroup datasetGroup46 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(datasetGroup45);
        org.junit.Assert.assertNull(datasetGroup46);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Stroke stroke9 = null;
        multiplePiePlot8.setOutlineStroke(stroke9);
        java.lang.Comparable comparable11 = multiplePiePlot8.getAggregatedItemsKey();
        java.lang.Object obj12 = multiplePiePlot8.clone();
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        plot15.notifyListeners(plotChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        multiplePiePlot19.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot19.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo30);
        java.awt.Paint paint32 = multiplePiePlot19.getAggregatedItemsPaint();
        plot15.setNoDataMessagePaint(paint32);
        multiplePiePlot1.setOutlinePaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent39 = null;
        multiplePiePlot36.axisChanged(axisChangeEvent39);
        multiplePiePlot36.zoom((double) (-1L));
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent43 = null;
        multiplePiePlot36.axisChanged(axisChangeEvent43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        float float47 = multiplePiePlot46.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent48 = null;
        multiplePiePlot46.notifyListeners(plotChangeEvent48);
        multiplePiePlot46.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = multiplePiePlot46.getDrawingSupplier();
        multiplePiePlot36.setDrawingSupplier(drawingSupplier52);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier52);
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D55, rectangle2D56);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier52);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot8.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot8.getDataset();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Stroke stroke15 = multiplePiePlot8.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot8.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot8.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot18.datasetChanged(datasetChangeEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        multiplePiePlot11.zoom((double) 0.0f);
        multiplePiePlot11.setLimit((double) (-1));
        multiplePiePlot11.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier25);
        float float27 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot22.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot32.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot32.getDatasetGroup();
        boolean boolean37 = multiplePiePlot22.equals((java.lang.Object) multiplePiePlot32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        float float40 = multiplePiePlot39.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent41);
        java.awt.Stroke stroke43 = null;
        multiplePiePlot39.setOutlineStroke(stroke43);
        float float45 = multiplePiePlot39.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot39.getPieChart();
        multiplePiePlot32.setPieChart(jFreeChart46);
        multiplePiePlot11.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        multiplePiePlot1.setPieChart(jFreeChart46);
        java.lang.String str50 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        multiplePiePlot1.setDataset(categoryDataset51);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.zoom(0.0d);
        java.awt.Image image12 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint13 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setAggregatedItemsPaint(paint27);
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder29);
        boolean boolean31 = multiplePiePlot1.isSubplot();
        java.lang.Comparable comparable32 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent33);
        double double35 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(tableOrder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 0L + "'", comparable32, 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        java.lang.Object obj10 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint21);
        boolean boolean23 = multiplePiePlot15.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot15.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Paint paint30 = multiplePiePlot26.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot26.getDataset();
        java.awt.Paint paint32 = multiplePiePlot26.getOutlinePaint();
        multiplePiePlot15.setNoDataMessagePaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setNoDataMessage("hi!");
        boolean boolean39 = multiplePiePlot35.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        multiplePiePlot35.drawBackgroundImage(graphics2D40, rectangle2D41);
        java.awt.Font font43 = multiplePiePlot35.getNoDataMessageFont();
        multiplePiePlot15.setNoDataMessageFont(font43);
        multiplePiePlot1.setNoDataMessageFont(font43);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        multiplePiePlot1.handleClick(15, (int) '4', plotRenderingInfo48);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categoryDataset31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        double double5 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setBackgroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNull(categoryDataset22);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        java.lang.String str11 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "Other");
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        boolean boolean15 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot1.setDataset(categoryDataset20);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "Multiple Pie Plot");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot24.setForegroundAlpha((float) (short) -1);
        int int27 = multiplePiePlot24.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot24.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.awt.Stroke stroke31 = null;
        multiplePiePlot30.setOutlineStroke(stroke31);
        java.lang.Comparable comparable33 = multiplePiePlot30.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot30.getDataset();
        org.jfree.chart.util.TableOrder tableOrder35 = multiplePiePlot30.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder36 = multiplePiePlot30.getDataExtractOrder();
        multiplePiePlot24.setDataExtractOrder(tableOrder36);
        multiplePiePlot1.setDataExtractOrder(tableOrder36);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent39);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D41, rectangle2D42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + "Other" + "'", comparable33, "Other");
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(tableOrder35);
        org.junit.Assert.assertNotNull(tableOrder36);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot10.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot10.setDataset(categoryDataset23);
        java.awt.Paint paint25 = multiplePiePlot10.getOutlinePaint();
        java.awt.Paint paint26 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot28.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        multiplePiePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = multiplePiePlot28.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.awt.Stroke stroke35 = null;
        multiplePiePlot34.setOutlineStroke(stroke35);
        java.lang.Comparable comparable37 = multiplePiePlot34.getAggregatedItemsKey();
        java.awt.Font font38 = multiplePiePlot34.getNoDataMessageFont();
        multiplePiePlot28.setNoDataMessageFont(font38);
        multiplePiePlot28.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        multiplePiePlot43.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo46);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent48 = null;
        multiplePiePlot43.datasetChanged(datasetChangeEvent48);
        multiplePiePlot43.setBackgroundAlpha((float) 1L);
        multiplePiePlot43.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = multiplePiePlot43.getInsets();
        multiplePiePlot28.setInsets(rectangleInsets54);
        multiplePiePlot10.setInsets(rectangleInsets54, true);
        multiplePiePlot1.setInsets(rectangleInsets54);
        int int59 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image60 = null;
        multiplePiePlot1.setBackgroundImage(image60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + "Other" + "'", comparable37, "Other");
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(rectangleInsets54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        int int10 = multiplePiePlot9.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot12.setOutlineStroke(stroke16);
        float float18 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.setPieChart(jFreeChart19);
        multiplePiePlot1.setOutlineVisible(true);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setForegroundAlpha((float) 1L);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo11);
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot18.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot18.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setBackgroundPaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        multiplePiePlot24.setOutlinePaint(paint41);
        org.jfree.chart.util.TableOrder tableOrder44 = multiplePiePlot24.getDataExtractOrder();
        multiplePiePlot18.setDataExtractOrder(tableOrder44);
        multiplePiePlot1.setDataExtractOrder(tableOrder44);
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D47, rectangle2D48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(tableOrder44);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener22);
        multiplePiePlot15.setOutlineVisible(false);
        java.awt.Paint paint26 = multiplePiePlot15.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        multiplePiePlot28.setNoDataMessage("hi!");
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str33 = multiplePiePlot28.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot28.getDataset();
        java.awt.Image image35 = null;
        multiplePiePlot28.setBackgroundImage(image35);
        org.jfree.chart.LegendItemCollection legendItemCollection37 = multiplePiePlot28.getLegendItems();
        java.awt.Stroke stroke38 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot15.setOutlineStroke(stroke38);
        boolean boolean40 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(legendItemCollection37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(str9);
    }
}

