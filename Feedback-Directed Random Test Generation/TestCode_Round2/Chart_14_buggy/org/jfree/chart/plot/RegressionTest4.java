package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        int int9 = xYPlot0.indexOf(xYDataset8);
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot0.getRangeAxisLocation((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset6 = xYPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis((int) (byte) 1, valueAxis8, false);
        int int11 = xYPlot0.getDatasetCount();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot16.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup18 = categoryPlot16.getDatasetGroup();
        boolean boolean19 = categoryPlot16.isDomainZoomable();
        boolean boolean20 = categoryPlot16.isRangeZoomable();
        categoryPlot16.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        categoryPlot16.setDataset((int) ' ', categoryDataset24);
        org.jfree.chart.axis.ValueAxis valueAxis27 = categoryPlot16.getRangeAxisForDataset(10);
        org.jfree.chart.plot.PlotOrientation plotOrientation28 = categoryPlot16.getOrientation();
        xYPlot0.setOrientation(plotOrientation28);
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = xYPlot0.removeDomainMarker(marker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(xYDataset6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNotNull(plotOrientation28);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        boolean boolean16 = categoryPlot13.isDomainZoomable();
        java.awt.Font font17 = categoryPlot13.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray18 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot13.setRenderers(categoryItemRendererArray18);
        java.util.List list20 = categoryPlot13.getAnnotations();
        xYPlot0.drawDomainGridlines(graphics2D7, rectangle2D8, list20);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = xYPlot0.getOrientation();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.Stroke stroke26 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot27.getDomainAxis(10);
        java.awt.Paint paint30 = xYPlot27.getDomainTickBandPaint();
        boolean boolean31 = xYPlot27.isRangeZoomable();
        xYPlot27.setDomainCrosshairValue((double) (short) -1);
        double double34 = xYPlot27.getRangeCrosshairValue();
        java.awt.Paint paint35 = xYPlot27.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawHorizontalLine(graphics2D23, rectangle2D24, (double) 10L, stroke26, paint35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot16.setRangeAxes(valueAxisArray17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot16.setRangeAxis(1, valueAxis20);
        java.awt.Paint paint22 = xYPlot16.getDomainGridlinePaint();
        categoryPlot4.setRangeCrosshairPaint(paint22);
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot4.getColumnRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        java.util.List list26 = categoryPlot4.getCategoriesForAxis(categoryAxis25);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot4.getFixedLegendItems();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertArrayEquals(valueAxisArray17, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(legendItemCollection27);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = xYPlot0.getAxisOffset();
        java.awt.Image image4 = xYPlot0.getBackgroundImage();
        xYPlot0.setDomainCrosshairValue((double) (short) 10);
        int int7 = xYPlot0.getDomainAxisCount();
        xYPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        xYPlot0.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        xYPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis8);
        java.awt.Paint paint10 = xYPlot0.getRangeZeroBaselinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot15.setDomainAxis(0, categoryAxis17, false);
        categoryPlot15.configureDomainAxes();
        java.awt.Stroke stroke21 = categoryPlot15.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot15.getDomainAxisEdge(0);
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke25 = xYPlot24.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = xYPlot24.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot24.getRangeAxisLocation();
        java.awt.Paint paint28 = xYPlot24.getDomainTickBandPaint();
        org.jfree.data.general.DatasetGroup datasetGroup29 = xYPlot24.getDatasetGroup();
        int int30 = xYPlot24.getWeight();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = xYPlot24.getAxisOffset();
        categoryPlot15.setAxisOffset(rectangleInsets31);
        xYPlot0.setInsets(rectangleInsets31, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(datasetGroup29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        int int10 = categoryPlot4.getDatasetCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot4.getRangeAxisLocation((int) '4');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot4.getIndexOf(categoryItemRenderer13);
        java.util.List list15 = categoryPlot4.getCategories();
        java.awt.Font font16 = categoryPlot4.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        xYPlot0.zoomDomainAxes((double) 0L, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder19 = xYPlot0.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.axis.AxisSpace axisSpace22 = xYPlot0.calculateAxisSpace(graphics2D20, rectangle2D21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.axis.AxisSpace axisSpace25 = xYPlot0.calculateAxisSpace(graphics2D23, rectangle2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = xYPlot0.getDataset((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(seriesRenderingOrder19);
        org.junit.Assert.assertNotNull(axisSpace22);
        org.junit.Assert.assertNotNull(axisSpace25);
        org.junit.Assert.assertNull(xYDataset27);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot9.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup11 = categoryPlot9.getDatasetGroup();
        boolean boolean12 = categoryPlot9.isDomainZoomable();
        boolean boolean13 = categoryPlot9.isRangeZoomable();
        categoryPlot9.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        categoryPlot9.setDataset((int) ' ', categoryDataset17);
        java.awt.Stroke stroke19 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot9.setDomainGridlineStroke(stroke19);
        categoryPlot4.setOutlineStroke(stroke19);
        java.awt.Paint paint22 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisSpace axisSpace23 = categoryPlot4.getFixedDomainAxisSpace();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot4.getDomainAxisEdge((int) (short) 10);
        categoryPlot4.configureDomainAxes();
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(axisSpace23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        boolean boolean8 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = xYPlot0.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        categoryPlot14.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot14.getAxisOffset();
        int int19 = categoryPlot14.getWeight();
        java.awt.Stroke stroke20 = categoryPlot14.getDomainGridlineStroke();
        xYPlot0.setRangeGridlineStroke(stroke20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        xYPlot24.drawZeroRangeBaseline(graphics2D25, rectangle2D26);
        org.jfree.data.xy.XYDataset xYDataset29 = xYPlot24.getDataset((int) (short) 0);
        java.awt.Paint paint30 = xYPlot24.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent31 = null;
        xYPlot24.rendererChanged(rendererChangeEvent31);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot24.getRangeAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        xYPlot34.drawZeroRangeBaseline(graphics2D35, rectangle2D36);
        org.jfree.data.xy.XYDataset xYDataset39 = xYPlot34.getDataset((int) (short) 0);
        java.awt.Paint paint40 = xYPlot34.getOutlinePaint();
        xYPlot34.setDomainZeroBaselineVisible(true);
        xYPlot34.setDomainCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotOrientation plotOrientation45 = xYPlot34.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge46 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation33, plotOrientation45);
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = null;
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot(categoryDataset49, categoryAxis50, valueAxis51, categoryItemRenderer52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = categoryPlot53.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup55 = categoryPlot53.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = null;
        categoryPlot53.setRenderer(categoryItemRenderer56);
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = null;
        categoryPlot53.setDomainAxis(categoryAxis58);
        categoryPlot53.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = categoryPlot53.getDomainAxis((int) 'a');
        java.awt.Font font63 = categoryPlot53.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset64 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer65 = categoryPlot53.getRendererForDataset(categoryDataset64);
        java.awt.Stroke stroke66 = categoryPlot53.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset67 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis68 = null;
        org.jfree.chart.axis.ValueAxis valueAxis69 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer70 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot71 = new org.jfree.chart.plot.CategoryPlot(categoryDataset67, categoryAxis68, valueAxis69, categoryItemRenderer70);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier72 = categoryPlot71.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder73 = categoryPlot71.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation74 = categoryPlot71.getOrientation();
        boolean boolean75 = categoryPlot71.getDrawSharedDomainAxis();
        java.awt.Paint paint76 = categoryPlot71.getRangeCrosshairPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawDomainCrosshair(graphics2D22, rectangle2D23, plotOrientation45, (double) (short) 0, valueAxis48, stroke66, paint76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(xYDataset29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(xYDataset39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(plotOrientation45);
        org.junit.Assert.assertNotNull(rectangleEdge46);
        org.junit.Assert.assertNotNull(drawingSupplier54);
        org.junit.Assert.assertNull(datasetGroup55);
        org.junit.Assert.assertNull(categoryAxis62);
        org.junit.Assert.assertNotNull(font63);
        org.junit.Assert.assertNull(categoryItemRenderer65);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(drawingSupplier72);
        org.junit.Assert.assertNotNull(sortOrder73);
        org.junit.Assert.assertNotNull(plotOrientation74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(paint76);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        java.awt.Font font14 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot4.getRendererForDataset(categoryDataset15);
        java.awt.Stroke stroke17 = categoryPlot4.getDomainGridlineStroke();
        int int18 = categoryPlot4.getDatasetCount();
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot4.getDomainMarkers(15, layer20);
        org.jfree.chart.plot.Plot plot22 = categoryPlot4.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke26 = xYPlot25.getDomainZeroBaselineStroke();
        java.util.List list27 = xYPlot25.getAnnotations();
        java.awt.geom.Point2D point2D28 = xYPlot25.getQuadrantOrigin();
        categoryPlot4.zoomRangeAxes((double) 15, plotRenderingInfo24, point2D28, true);
        double double31 = categoryPlot4.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        categoryPlot4.setDomainAxis((int) '#', categoryAxis33);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(point2D28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        boolean boolean4 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace5 = xYPlot0.getFixedRangeAxisSpace();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray12 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot11.setRangeAxes(valueAxisArray12);
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot11.getDomainAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDomainAxisLocation((-1), axisLocation14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(valueAxisArray12);
        org.junit.Assert.assertArrayEquals(valueAxisArray12, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis9);
        categoryPlot4.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot4.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot4.getDomainAxisLocation(36);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getDomainAxis((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setRangeGridlinesVisible(true);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        double double14 = xYPlot13.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot13.getDomainAxis(1);
        xYPlot13.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        double double21 = xYPlot20.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot20.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot24 = xYPlot20.getRootPlot();
        xYPlot20.clearRangeMarkers();
        boolean boolean26 = xYPlot20.isRangeCrosshairVisible();
        java.awt.Paint paint27 = xYPlot20.getRangeTickBandPaint();
        boolean boolean28 = xYPlot20.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot38.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup40 = categoryPlot38.getDatasetGroup();
        boolean boolean41 = categoryPlot38.isDomainZoomable();
        boolean boolean42 = categoryPlot38.isRangeZoomable();
        categoryPlot38.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        categoryPlot38.setDataset((int) ' ', categoryDataset46);
        java.awt.Stroke stroke48 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot38.setDomainGridlineStroke(stroke48);
        categoryPlot33.setOutlineStroke(stroke48);
        xYPlot20.setOutlineStroke(stroke48);
        xYPlot13.setRangeGridlineStroke(stroke48);
        java.util.List list53 = xYPlot13.getAnnotations();
        xYPlot0.drawRangeGridlines(graphics2D11, rectangle2D12, list53);
        xYPlot0.mapDatasetToDomainAxis((int) (byte) 1, (int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer62 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot63 = new org.jfree.chart.plot.CategoryPlot(categoryDataset59, categoryAxis60, valueAxis61, categoryItemRenderer62);
        categoryPlot63.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = categoryPlot63.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = categoryPlot63.getInsets();
        categoryPlot63.clearRangeMarkers((int) '#');
        org.jfree.chart.axis.AxisLocation axisLocation72 = categoryPlot63.getDomainAxisLocation((int) (byte) 1);
        xYPlot0.setDomainAxisLocation((int) (short) 0, axisLocation72, true);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(drawingSupplier39);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(rectangleInsets67);
        org.junit.Assert.assertNotNull(rectangleInsets68);
        org.junit.Assert.assertNotNull(axisLocation72);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        java.awt.Paint paint9 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot10.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot10.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot16 = xYPlot10.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.data.xy.XYDataset xYDataset22 = xYPlot17.getDataset((int) (short) 0);
        java.awt.Paint paint23 = xYPlot17.getOutlinePaint();
        xYPlot10.setRangeCrosshairPaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot10.setInsets(rectangleInsets25);
        categoryPlot4.setInsets(rectangleInsets25, true);
        boolean boolean29 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setAnchorValue((double) (byte) 0, false);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(xYDataset22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        xYPlot0.zoomRangeAxes((double) 1, plotRenderingInfo7, point2D8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = xYPlot0.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot15.setDomainAxis(0, categoryAxis17, false);
        categoryPlot15.configureDomainAxes();
        java.awt.Stroke stroke21 = categoryPlot15.getDomainGridlineStroke();
        categoryPlot15.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean25 = categoryPlot15.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        boolean boolean30 = categoryPlot15.render(graphics2D26, rectangle2D27, (int) '#', plotRenderingInfo29);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis33, valueAxis34, categoryItemRenderer35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot36.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup38 = categoryPlot36.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        categoryPlot36.setRenderer(categoryItemRenderer39);
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        xYPlot41.drawZeroRangeBaseline(graphics2D42, rectangle2D43);
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot41.getDomainAxisLocation((int) (short) 100);
        categoryPlot36.setDomainAxisLocation(axisLocation46);
        categoryPlot15.setRangeAxisLocation(100, axisLocation46, true);
        xYPlot0.setDomainAxisLocation(axisLocation46);
        org.jfree.chart.util.RectangleEdge rectangleEdge51 = xYPlot0.getDomainAxisEdge();
        xYPlot0.clearRangeMarkers((int) (byte) -1);
        java.awt.Paint paint54 = xYPlot0.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        xYPlot0.drawBackgroundImage(graphics2D55, rectangle2D56);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertNull(datasetGroup38);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertNotNull(rectangleEdge51);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot(xYDataset6, valueAxis7, valueAxis8, xYItemRenderer9);
        boolean boolean11 = xYPlot10.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = xYPlot10.getLegendItems();
        xYPlot0.setFixedLegendItems(legendItemCollection12);
        java.awt.Paint paint14 = xYPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot4.setDataset((int) ' ', categoryDataset12);
        java.awt.Stroke stroke14 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setDomainGridlineStroke(stroke14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        categoryPlot20.setRangeCrosshairValue((double) 1L, true);
        boolean boolean24 = categoryPlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        double double26 = xYPlot25.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.util.List list29 = null;
        xYPlot25.drawDomainGridlines(graphics2D27, rectangle2D28, list29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        xYPlot25.zoomRangeAxes((double) 1, plotRenderingInfo32, point2D33);
        xYPlot25.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        categoryPlot41.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        categoryPlot41.setRenderer((int) 'a', categoryItemRenderer45, false);
        int int48 = categoryPlot41.getWeight();
        boolean boolean49 = categoryPlot41.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        categoryPlot41.setRenderer((int) (short) 0, categoryItemRenderer51);
        org.jfree.chart.axis.AxisLocation axisLocation53 = categoryPlot41.getRangeAxisLocation();
        xYPlot25.setDomainAxisLocation((int) (byte) 0, axisLocation53, false);
        categoryPlot4.setRangeAxisLocation(axisLocation53);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer57 = categoryPlot4.getRenderer();
        double double58 = categoryPlot4.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        categoryPlot4.setRangeAxis(valueAxis59);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray61 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot4.setRangeAxes(valueAxisArray61);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(axisLocation53);
        org.junit.Assert.assertNull(categoryItemRenderer57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(valueAxisArray61);
        org.junit.Assert.assertArrayEquals(valueAxisArray61, new org.jfree.chart.axis.ValueAxis[] {});
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        xYPlot0.setWeight((int) ' ');
        java.awt.Stroke stroke10 = xYPlot0.getRangeZeroBaselineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = xYPlot0.getFixedLegendItems();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        double double13 = xYPlot12.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot12.getDomainAxis(1);
        java.awt.Stroke stroke16 = xYPlot12.getDomainCrosshairStroke();
        boolean boolean17 = xYPlot12.isDomainGridlinesVisible();
        boolean boolean18 = xYPlot12.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        double double20 = xYPlot19.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot19.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot19.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot25 = xYPlot19.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.data.xy.XYDataset xYDataset31 = xYPlot26.getDataset((int) (short) 0);
        java.awt.Paint paint32 = xYPlot26.getOutlinePaint();
        xYPlot19.setRangeCrosshairPaint(paint32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot19.setInsets(rectangleInsets34);
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = xYPlot19.getRangeMarkers(layer36);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.util.Layer layer41 = null;
        xYPlot19.drawRangeMarkers(graphics2D38, rectangle2D39, 15, layer41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        categoryPlot47.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = categoryPlot47.getAxisOffset();
        xYPlot19.setAxisOffset(rectangleInsets51);
        xYPlot12.setInsets(rectangleInsets51, false);
        xYPlot0.setAxisOffset(rectangleInsets51);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(xYDataset31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(collection37);
        org.junit.Assert.assertNotNull(rectangleInsets51);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        xYPlot0.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        xYPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot0.setDomainAxis(valueAxis10);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot17.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup19 = categoryPlot17.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot17.getDomainAxisEdge();
        categoryPlot17.configureDomainAxes();
        java.awt.Paint paint22 = categoryPlot17.getDomainGridlinePaint();
        xYPlot12.setNoDataMessagePaint(paint22);
        xYPlot12.configureDomainAxes();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        xYPlot12.drawAnnotations(graphics2D25, rectangle2D26, plotRenderingInfo27);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder29 = xYPlot12.getSeriesRenderingOrder();
        xYPlot0.setSeriesRenderingOrder(seriesRenderingOrder29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        categoryPlot35.setDomainAxis(0, categoryAxis37, false);
        categoryPlot35.configureDomainAxes();
        java.awt.Stroke stroke41 = categoryPlot35.getDomainGridlineStroke();
        categoryPlot35.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean45 = categoryPlot35.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot35.getDomainAxisLocation(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = categoryPlot35.getRangeAxisEdge(15);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis51 = null;
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer53 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot(categoryDataset50, categoryAxis51, valueAxis52, categoryItemRenderer53);
        categoryPlot54.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = categoryPlot54.getAxisOffset();
        java.awt.Paint paint59 = categoryPlot54.getBackgroundPaint();
        categoryPlot35.setNoDataMessagePaint(paint59);
        xYPlot0.setRangeTickBandPaint(paint59);
        java.lang.Class<?> wildcardClass62 = paint59.getClass();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(seriesRenderingOrder29);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(axisLocation47);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNotNull(rectangleInsets58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot4.getDatasetRenderingOrder();
        boolean boolean11 = categoryPlot4.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot16.setDomainAxis(0, categoryAxis18, false);
        categoryPlot16.configureDomainAxes();
        java.awt.Stroke stroke22 = categoryPlot16.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot23.getDomainAxis(10);
        xYPlot23.configureDomainAxes();
        java.awt.Paint paint27 = xYPlot23.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = xYPlot23.getDataRange(valueAxis28);
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot30.drawZeroRangeBaseline(graphics2D31, rectangle2D32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot30.getDomainAxisLocation((int) (short) 100);
        xYPlot23.setDomainAxisLocation(axisLocation35);
        categoryPlot16.setRangeAxisLocation(axisLocation35, true);
        categoryPlot16.setAnchorValue(0.0d);
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot16.getDomainAxisLocation((int) (short) 10);
        categoryPlot4.setDomainAxisLocation(axisLocation42, false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(axisLocation42);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        categoryPlot4.clearDomainMarkers();
        java.util.List list12 = categoryPlot4.getCategories();
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.clearRangeMarkers();
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) (short) 10, layer13);
        categoryPlot4.setWeight((int) '4');
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot21.setDomainAxis(0, categoryAxis23, false);
        categoryPlot21.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis28 = categoryPlot21.getRangeAxis((int) (short) 10);
        categoryPlot21.configureDomainAxes();
        java.util.List list30 = categoryPlot21.getCategories();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = categoryPlot21.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = categoryPlot21.getAxisOffset();
        categoryPlot4.setAxisOffset(rectangleInsets32);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(list30);
        org.junit.Assert.assertNotNull(drawingSupplier31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        categoryPlot4.setDomainGridlinesVisible(false);
        categoryPlot4.setRangeCrosshairValue((double) 100L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        categoryPlot4.addChangeListener(plotChangeListener14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        categoryPlot4.drawAnnotations(graphics2D16, rectangle2D17, plotRenderingInfo18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        categoryPlot4.setDataset(categoryDataset20);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        int int7 = xYPlot0.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot12.setRenderer(categoryItemRenderer15);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis(categoryAxis17);
        categoryPlot12.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray25 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot24.setRangeAxes(valueAxisArray25);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot24.setRangeAxis(1, valueAxis28);
        java.awt.Paint paint30 = xYPlot24.getDomainGridlinePaint();
        categoryPlot12.setRangeCrosshairPaint(paint30);
        xYPlot0.setRangeZeroBaselinePaint(paint30);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        xYPlot0.setRenderer((int) (short) 10, xYItemRenderer34, true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        xYPlot0.removeChangeListener(plotChangeListener37);
        int int39 = xYPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(valueAxisArray25);
        org.junit.Assert.assertArrayEquals(valueAxisArray25, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot(categoryDataset4, categoryAxis5, valueAxis6, categoryItemRenderer7);
        categoryPlot8.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot8.setRenderer((int) 'a', categoryItemRenderer12, false);
        int int15 = categoryPlot8.getWeight();
        java.awt.Paint paint16 = categoryPlot8.getDomainGridlinePaint();
        xYPlot0.setBackgroundPaint(paint16);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent19 = null;
        xYPlot18.rendererChanged(rendererChangeEvent19);
        java.awt.Paint paint21 = xYPlot18.getDomainGridlinePaint();
        xYPlot0.setDomainGridlinePaint(paint21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        int int24 = xYPlot0.getDomainAxisIndex(valueAxis23);
        xYPlot0.setRangeCrosshairValue((double) (byte) 10, false);
        boolean boolean28 = xYPlot0.isDomainCrosshairLockedOnData();
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        categoryPlot4.setRangeAxisLocation(10, axisLocation10);
        boolean boolean12 = categoryPlot4.isDomainZoomable();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot4.getDataset((int) (byte) 100);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot4.setRangeCrosshairValue((double) 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        boolean boolean8 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = xYPlot0.getAxisOffset();
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = xYPlot0.getDomainMarkers((int) (short) 100, layer13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.axis.AxisSpace axisSpace17 = xYPlot0.calculateAxisSpace(graphics2D15, rectangle2D16);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot22.setRangeAxes(valueAxisArray23);
        xYPlot22.clearDomainMarkers();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis29, valueAxis30, categoryItemRenderer31);
        categoryPlot32.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = categoryPlot32.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = categoryPlot41.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup43 = categoryPlot41.getDatasetGroup();
        boolean boolean44 = categoryPlot41.isDomainZoomable();
        java.awt.Font font45 = categoryPlot41.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray46 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot41.setRenderers(categoryItemRendererArray46);
        categoryPlot32.setRenderers(categoryItemRendererArray46);
        categoryPlot32.clearRangeMarkers((-1));
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.axis.AxisSpace axisSpace53 = categoryPlot32.calculateAxisSpace(graphics2D51, rectangle2D52);
        org.jfree.chart.axis.AxisSpace axisSpace54 = xYPlot22.calculateDomainAxisSpace(graphics2D26, rectangle2D27, axisSpace53);
        xYPlot0.setFixedRangeAxisSpace(axisSpace53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNotNull(axisSpace17);
        org.junit.Assert.assertNotNull(valueAxisArray23);
        org.junit.Assert.assertArrayEquals(valueAxisArray23, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(drawingSupplier42);
        org.junit.Assert.assertNull(datasetGroup43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertNotNull(categoryItemRendererArray46);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray46, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(axisSpace53);
        org.junit.Assert.assertNotNull(axisSpace54);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot11 = xYPlot7.getRootPlot();
        xYPlot7.clearRangeMarkers();
        boolean boolean13 = xYPlot7.isRangeCrosshairVisible();
        java.awt.Paint paint14 = xYPlot7.getRangeTickBandPaint();
        boolean boolean15 = xYPlot7.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = categoryPlot25.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup27 = categoryPlot25.getDatasetGroup();
        boolean boolean28 = categoryPlot25.isDomainZoomable();
        boolean boolean29 = categoryPlot25.isRangeZoomable();
        categoryPlot25.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        categoryPlot25.setDataset((int) ' ', categoryDataset33);
        java.awt.Stroke stroke35 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot25.setDomainGridlineStroke(stroke35);
        categoryPlot20.setOutlineStroke(stroke35);
        xYPlot7.setOutlineStroke(stroke35);
        xYPlot0.setRangeGridlineStroke(stroke35);
        java.util.List list40 = xYPlot0.getAnnotations();
        org.jfree.chart.plot.Plot plot41 = xYPlot0.getParent();
        boolean boolean42 = xYPlot0.isDomainCrosshairLockedOnData();
        java.awt.Stroke stroke43 = xYPlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNull(plot41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getRangeAxisLocation();
        boolean boolean4 = xYPlot0.isRangeCrosshairVisible();
        xYPlot0.setDomainCrosshairVisible(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        java.awt.Font font14 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot4.getRendererForDataset(categoryDataset15);
        categoryPlot4.setNoDataMessage("Category Plot");
        org.jfree.chart.plot.Plot plot19 = categoryPlot4.getRootPlot();
        boolean boolean20 = categoryPlot4.isRangeCrosshairLockedOnData();
        int int21 = categoryPlot4.getDatasetCount();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        java.awt.Font font14 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot4.getRendererForDataset(categoryDataset15);
        categoryPlot4.setNoDataMessage("Category Plot");
        categoryPlot4.clearRangeMarkers((int) '4');
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot4.getRangeMarkers(layer21);
        java.util.List list23 = categoryPlot4.getCategories();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNull(list23);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot4.getRangeMarkers(0, layer9);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        xYPlot12.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot12.setRangeAxis((int) '#', valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot12.setRangeAxis(0, valueAxis19, true);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot12.getDomainAxisLocation();
        categoryPlot4.setDomainAxisLocation((int) (short) 10, axisLocation22, false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot4.setRangeAxis(valueAxis25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot4.getRenderer((int) (short) 0);
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        double double30 = xYPlot29.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis32 = xYPlot29.getDomainAxis(1);
        java.awt.Stroke stroke33 = xYPlot29.getDomainCrosshairStroke();
        boolean boolean34 = xYPlot29.isDomainGridlinesVisible();
        boolean boolean35 = xYPlot29.isRangeGridlinesVisible();
        xYPlot29.setRangeGridlinesVisible(false);
        java.awt.Paint paint38 = xYPlot29.getBackgroundPaint();
        categoryPlot4.setRangeCrosshairPaint(paint38);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        int int41 = categoryPlot4.getIndexOf(categoryItemRenderer40);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        categoryPlot0.notifyListeners(plotChangeEvent2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis((int) '#');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (int) (short) 100, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isRangeCrosshairVisible();
        java.awt.Paint paint8 = categoryPlot4.getRangeGridlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot4.getFixedLegendItems();
        boolean boolean10 = categoryPlot4.isRangeZoomable();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(legendItemCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = xYPlot0.getAxisOffset();
        java.awt.Image image4 = xYPlot0.getBackgroundImage();
        xYPlot0.setDomainCrosshairValue((double) (short) 10);
        int int7 = xYPlot0.getDomainAxisCount();
        java.awt.Paint paint9 = xYPlot0.getQuadrantPaint(0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot5.getDomainAxis(10);
        xYPlot5.configureDomainAxes();
        java.awt.Paint paint9 = xYPlot5.getDomainCrosshairPaint();
        categoryPlot4.setRangeGridlinePaint(paint9);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent11);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        int int3 = xYPlot0.getWeight();
        int int4 = xYPlot0.getSeriesCount();
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        double double6 = xYPlot5.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.util.List list9 = null;
        xYPlot5.drawDomainGridlines(graphics2D7, rectangle2D8, list9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = xYPlot5.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = xYPlot5.getDrawingSupplier();
        java.awt.Stroke stroke13 = xYPlot5.getDomainZeroBaselineStroke();
        java.awt.Stroke stroke14 = xYPlot5.getRangeZeroBaselineStroke();
        xYPlot0.setDomainGridlineStroke(stroke14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(layer7);
        xYPlot0.clearDomainAxes();
        xYPlot0.setDomainCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.setRangeCrosshairValue((double) 1L, true);
        categoryPlot18.setRangeCrosshairValue((double) (-1), true);
        categoryPlot18.clearRangeMarkers((int) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        xYPlot29.drawZeroRangeBaseline(graphics2D30, rectangle2D31);
        boolean boolean33 = xYPlot29.isDomainCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot38.getDrawingSupplier();
        xYPlot29.setDrawingSupplier(drawingSupplier39);
        java.awt.geom.Point2D point2D41 = xYPlot29.getQuadrantOrigin();
        categoryPlot18.zoomRangeAxes(10.0d, plotRenderingInfo28, point2D41, true);
        xYPlot0.zoomDomainAxes((double) 10, plotRenderingInfo13, point2D41, true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(drawingSupplier39);
        org.junit.Assert.assertNotNull(point2D41);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        java.awt.Image image9 = categoryPlot4.getBackgroundImage();
        java.awt.Paint paint10 = categoryPlot4.getDomainGridlinePaint();
        java.awt.Stroke stroke11 = categoryPlot4.getRangeGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot4.setRangeAxis(10, valueAxis13, false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        java.awt.Paint paint10 = xYPlot0.getRangeZeroBaselinePaint();
        xYPlot0.setRangeZeroBaselineVisible(true);
        xYPlot0.clearDomainAxes();
        int int14 = xYPlot0.getWeight();
        java.awt.Paint paint15 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.setForegroundAlpha((float) (-1L));
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer7 = xYPlot0.getRenderer();
        int int8 = xYPlot0.getDomainAxisCount();
        java.awt.Paint paint9 = xYPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(xYItemRenderer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        java.awt.Paint paint16 = xYPlot0.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot0.drawBackgroundImage(graphics2D17, rectangle2D18);
        int int20 = xYPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        xYPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot0.getRangeAxisLocation(98);
        int int19 = xYPlot0.getWeight();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer2 = null;
        int int3 = xYPlot0.getIndexOf(xYItemRenderer2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getRangeAxisLocation((int) (short) 10);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot9.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier10);
        java.awt.geom.Point2D point2D12 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot0.getDomainMarkers((int) 'a', layer14);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xYPlot0.removeDomainMarker(0, marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(point2D12);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis(100);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        xYPlot0.drawAnnotations(graphics2D6, rectangle2D7, plotRenderingInfo8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = xYPlot0.getRangeAxisLocation();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        xYPlot0.rendererChanged(rendererChangeEvent11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis(100);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        xYPlot0.drawAnnotations(graphics2D6, rectangle2D7, plotRenderingInfo8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = xYPlot0.getRangeAxisLocation();
        xYPlot0.setDomainCrosshairLockedOnData(false);
        java.awt.Paint paint13 = xYPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        xYPlot0.drawAnnotations(graphics2D20, rectangle2D21, plotRenderingInfo22);
        boolean boolean24 = xYPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean14 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke16 = xYPlot15.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = xYPlot15.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot15.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation(axisLocation18, true);
        boolean boolean21 = categoryPlot4.isRangeCrosshairVisible();
        java.util.List list22 = categoryPlot4.getAnnotations();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot4.getDrawingSupplier();
        java.awt.Paint paint24 = categoryPlot4.getRangeGridlinePaint();
        boolean boolean25 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent26);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        categoryPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot4.getFixedLegendItems();
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(legendItemCollection11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.clearDomainMarkers((int) '4');
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot4.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot18.getAxisOffset();
        java.awt.Image image23 = categoryPlot18.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot18.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        double double27 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot26.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot26.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot32 = xYPlot26.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        xYPlot33.drawZeroRangeBaseline(graphics2D34, rectangle2D35);
        org.jfree.data.xy.XYDataset xYDataset38 = xYPlot33.getDataset((int) (short) 0);
        java.awt.Paint paint39 = xYPlot33.getOutlinePaint();
        xYPlot26.setRangeCrosshairPaint(paint39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot26.setInsets(rectangleInsets41);
        categoryPlot18.setAxisOffset(rectangleInsets41);
        java.awt.Stroke stroke44 = categoryPlot18.getRangeCrosshairStroke();
        categoryPlot4.setOutlineStroke(stroke44);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        categoryPlot4.drawBackgroundImage(graphics2D46, rectangle2D47);
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        categoryPlot4.drawBackgroundImage(graphics2D49, rectangle2D50);
        boolean boolean52 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        categoryPlot4.setDataset(categoryDataset53);
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = null;
        categoryPlot4.setDomainAxis(11, categoryAxis56);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(xYDataset38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        java.awt.Stroke stroke20 = xYPlot0.getDomainCrosshairStroke();
        java.awt.Paint paint21 = xYPlot0.getDomainCrosshairPaint();
        xYPlot0.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        xYPlot0.drawRangeMarkers(graphics2D24, rectangle2D25, 15, layer27);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint30 = xYPlot0.getRangeZeroBaselinePaint();
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot(categoryDataset3, categoryAxis4, valueAxis5, categoryItemRenderer6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = categoryPlot7.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup9 = categoryPlot7.getDatasetGroup();
        boolean boolean10 = categoryPlot7.isDomainZoomable();
        boolean boolean11 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot7.setDataset((int) ' ', categoryDataset15);
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot7.setDomainGridlineStroke(stroke17);
        xYPlot0.setDomainZeroBaselineStroke(stroke17);
        java.awt.geom.Point2D point2D20 = xYPlot0.getQuadrantOrigin();
        xYPlot0.setRangeCrosshairValue((double) (byte) 1);
        java.awt.Paint paint23 = xYPlot0.getRangeGridlinePaint();
        java.awt.geom.Point2D point2D24 = xYPlot0.getQuadrantOrigin();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.util.Layer layer28 = null;
        xYPlot0.drawRangeMarkers(graphics2D25, rectangle2D26, (int) '#', layer28);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(point2D20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(point2D24);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot12.setRenderer(categoryItemRenderer15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        categoryPlot12.setDomainAxisLocation(axisLocation22);
        categoryPlot4.setRangeAxisLocation((int) (byte) 100, axisLocation22, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot4.setRenderer(categoryItemRenderer26, false);
        boolean boolean29 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.plot.Marker marker31 = null;
        org.jfree.chart.util.Layer layer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = categoryPlot4.removeDomainMarker((int) '#', marker31, layer32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke11 = xYPlot10.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot10.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot17.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup19 = categoryPlot17.getDatasetGroup();
        boolean boolean20 = categoryPlot17.isDomainZoomable();
        boolean boolean21 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot17.setDataset((int) ' ', categoryDataset25);
        java.awt.Stroke stroke27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot17.setDomainGridlineStroke(stroke27);
        xYPlot10.setDomainZeroBaselineStroke(stroke27);
        java.awt.geom.Point2D point2D30 = xYPlot10.getQuadrantOrigin();
        categoryPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo9, point2D30, false);
        boolean boolean33 = categoryPlot4.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(point2D30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke5 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset6 = xYPlot0.getDataset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = xYPlot0.getDatasetRenderingOrder();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.axis.AxisSpace axisSpace10 = xYPlot0.calculateAxisSpace(graphics2D8, rectangle2D9);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(xYDataset6);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertNotNull(axisSpace10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot9.setDomainAxis(0, categoryAxis11, false);
        categoryPlot9.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot9.getRangeAxis((int) (short) 10);
        categoryPlot9.configureDomainAxes();
        java.util.List list18 = categoryPlot9.getCategories();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot9.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot9.getAxisOffset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        categoryPlot9.datasetChanged(datasetChangeEvent21);
        java.awt.Stroke stroke23 = categoryPlot9.getRangeGridlineStroke();
        xYPlot0.setRangeCrosshairStroke(stroke23);
        boolean boolean25 = xYPlot0.isRangeZoomable();
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = xYPlot0.removeRangeMarker((int) (short) -1, marker27, layer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot4.setDataset((int) ' ', categoryDataset12);
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.plot.CategoryMarker categoryMarker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot(categoryDataset3, categoryAxis4, valueAxis5, categoryItemRenderer6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = categoryPlot7.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup9 = categoryPlot7.getDatasetGroup();
        boolean boolean10 = categoryPlot7.isDomainZoomable();
        boolean boolean11 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot7.setDataset((int) ' ', categoryDataset15);
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot7.setDomainGridlineStroke(stroke17);
        xYPlot0.setDomainZeroBaselineStroke(stroke17);
        java.awt.geom.Point2D point2D20 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = xYPlot0.getDomainAxisEdge(10);
        double double23 = xYPlot0.getDomainCrosshairValue();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.axis.AxisSpace axisSpace26 = xYPlot0.calculateAxisSpace(graphics2D24, rectangle2D25);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(point2D20);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(axisSpace26);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean14 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke16 = xYPlot15.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = xYPlot15.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot15.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation(axisLocation18, true);
        boolean boolean21 = categoryPlot4.isRangeCrosshairVisible();
        java.util.List list22 = categoryPlot4.getAnnotations();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.data.Range range25 = categoryPlot4.getDataRange(valueAxis24);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNull(range25);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        java.awt.Stroke stroke7 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot4.getRangeMarkers((-1), layer9);
        int int11 = categoryPlot4.getRangeAxisCount();
        java.lang.String str12 = categoryPlot4.getNoDataMessage();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        boolean boolean16 = categoryPlot13.isDomainZoomable();
        java.awt.Font font17 = categoryPlot13.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray18 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot13.setRenderers(categoryItemRendererArray18);
        java.util.List list20 = categoryPlot13.getAnnotations();
        xYPlot0.drawDomainGridlines(graphics2D7, rectangle2D8, list20);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        xYPlot0.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot0.getRangeAxis((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        xYPlot0.setDomainAxis(valueAxis26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(valueAxis25);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        java.awt.Stroke stroke4 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = xYPlot0.getAxisOffset();
        xYPlot0.setRangeCrosshairValue((double) 0.0f, true);
        org.jfree.chart.plot.Marker marker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        java.awt.Paint paint11 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (byte) 1, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        java.awt.Paint paint9 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot10.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot10.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot16 = xYPlot10.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.data.xy.XYDataset xYDataset22 = xYPlot17.getDataset((int) (short) 0);
        java.awt.Paint paint23 = xYPlot17.getOutlinePaint();
        xYPlot10.setRangeCrosshairPaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot10.setInsets(rectangleInsets25);
        categoryPlot4.setInsets(rectangleInsets25, true);
        boolean boolean29 = categoryPlot4.isRangeZoomable();
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(xYDataset22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        java.awt.geom.Point2D point2D9 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot15.getDomainAxisEdge();
        categoryPlot15.configureDomainAxes();
        java.awt.Paint paint20 = categoryPlot15.getDomainGridlinePaint();
        xYPlot10.setNoDataMessagePaint(paint20);
        xYPlot0.setRangeCrosshairPaint(paint20);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.axis.AxisSpace axisSpace25 = xYPlot0.calculateAxisSpace(graphics2D23, rectangle2D24);
        java.awt.Stroke stroke26 = xYPlot0.getRangeZeroBaselineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(seriesRenderingOrder8);
        org.junit.Assert.assertNotNull(point2D9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(axisSpace25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRenderer(100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot4.drawZeroDomainBaseline(graphics2D9, rectangle2D10);
        java.util.List list12 = xYPlot4.getAnnotations();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke14 = xYPlot13.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        int int16 = xYPlot13.getRangeAxisIndex(valueAxis15);
        xYPlot13.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot21.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = xYPlot21.getDrawingSupplier();
        java.awt.geom.Point2D point2D27 = xYPlot21.getQuadrantOrigin();
        xYPlot13.zoomRangeAxes((double) (short) 10, plotRenderingInfo20, point2D27);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        xYPlot13.setDomainAxis((int) 'a', valueAxis30);
        boolean boolean32 = xYPlot13.isDomainCrosshairVisible();
        java.awt.Paint paint33 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot13.setBackgroundPaint(paint33);
        xYPlot4.setDomainTickBandPaint(paint33);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYItemRenderer8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(point2D27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke9 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot4.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = categoryPlot4.removeRangeMarker((int) (short) -1, marker14, layer15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getDomainAxis((int) '#');
        org.junit.Assert.assertNull(valueAxis4);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(layer7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        categoryPlot13.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot13.getAxisOffset();
        java.awt.Image image18 = categoryPlot13.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot13.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot21.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot27 = xYPlot21.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        xYPlot28.drawZeroRangeBaseline(graphics2D29, rectangle2D30);
        org.jfree.data.xy.XYDataset xYDataset33 = xYPlot28.getDataset((int) (short) 0);
        java.awt.Paint paint34 = xYPlot28.getOutlinePaint();
        xYPlot21.setRangeCrosshairPaint(paint34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot21.setInsets(rectangleInsets36);
        categoryPlot13.setAxisOffset(rectangleInsets36);
        java.awt.Stroke stroke39 = categoryPlot13.getRangeCrosshairStroke();
        xYPlot0.setOutlineStroke(stroke39);
        java.awt.Stroke stroke41 = xYPlot0.getRangeZeroBaselineStroke();
        java.awt.Paint paint42 = xYPlot0.getDomainZeroBaselinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNull(xYDataset33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot10.setDomainAxis(0, categoryAxis12, false);
        categoryPlot10.configureDomainAxes();
        java.awt.Stroke stroke16 = categoryPlot10.getDomainGridlineStroke();
        categoryPlot10.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean20 = categoryPlot10.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot10.getDomainAxisLocation(10);
        xYPlot0.setDomainAxisLocation(axisLocation22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = xYPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(axisSpace24);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.Layer layer3 = null;
        java.util.Collection collection4 = categoryPlot0.getRangeMarkers((int) ' ', layer3);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis((int) (byte) 1);
        boolean boolean7 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot4.getRangeAxisEdge((int) (byte) 100);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot4.getDomainMarkers(layer14);
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.configureDomainAxes();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setRangeAxes(valueAxisArray5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot4.setRangeAxis(1, valueAxis8);
        java.awt.Paint paint10 = xYPlot4.getDomainGridlinePaint();
        java.awt.Paint paint11 = xYPlot4.getRangeZeroBaselinePaint();
        xYPlot4.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) -1);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot15.getDomainAxis(10);
        xYPlot15.configureDomainAxes();
        java.awt.Paint paint19 = xYPlot15.getDomainCrosshairPaint();
        java.awt.Stroke stroke20 = xYPlot15.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot21.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke27 = xYPlot21.getDomainGridlineStroke();
        xYPlot15.setRangeZeroBaselineStroke(stroke27);
        org.jfree.chart.axis.AxisSpace axisSpace29 = xYPlot15.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace30 = xYPlot15.getFixedRangeAxisSpace();
        java.awt.Paint paint31 = xYPlot15.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot15.getRangeAxisLocation((int) (short) 1);
        xYPlot4.setRangeAxisLocation(axisLocation33);
        xYPlot4.clearDomainMarkers((int) '4');
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(axisSpace29);
        org.junit.Assert.assertNull(axisSpace30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(axisLocation33);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot4.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot4.getFixedLegendItems();
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot4.getOrientation();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(plotOrientation16);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        xYPlot0.zoomDomainAxes((double) 0L, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder19 = xYPlot0.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.axis.AxisSpace axisSpace22 = xYPlot0.calculateAxisSpace(graphics2D20, rectangle2D21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D23, rectangle2D24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map30 = xYPlot0.drawAxes(graphics2D26, rectangle2D27, rectangle2D28, plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(seriesRenderingOrder19);
        org.junit.Assert.assertNotNull(axisSpace22);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent10 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent10);
        java.awt.Image image12 = null;
        categoryPlot4.setBackgroundImage(image12);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot4.removeDomainMarker(marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot4.getRangeMarkers(0, layer9);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke12 = xYPlot11.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = xYPlot11.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot11.getRangeAxisLocation();
        categoryPlot4.setRangeAxisLocation(axisLocation14, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = categoryPlot4.getRangeAxisIndex(valueAxis18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke5 = xYPlot0.getDomainCrosshairStroke();
        boolean boolean6 = xYPlot0.isDomainCrosshairLockedOnData();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot0.axisChanged(axisChangeEvent7);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        boolean boolean8 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot4.setDataset(100, categoryDataset10);
        int int12 = categoryPlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) (short) 10, layer13);
        categoryPlot4.setWeight((int) '4');
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray22 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot21.setRangeAxes(valueAxisArray22);
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot21.getDomainAxisLocation();
        xYPlot21.setRangeCrosshairValue((double) 10.0f);
        java.awt.Stroke stroke27 = xYPlot21.getDomainGridlineStroke();
        categoryPlot4.setOutlineStroke(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(valueAxisArray22);
        org.junit.Assert.assertArrayEquals(valueAxisArray22, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.ResourceBundle resourceBundle0 = org.jfree.chart.plot.CategoryPlot.localizationResources;
        org.jfree.chart.plot.CategoryPlot.localizationResources = resourceBundle0;
        org.jfree.chart.plot.XYPlot.localizationResources = resourceBundle0;
        org.jfree.chart.plot.XYPlot.localizationResources = resourceBundle0;
        org.junit.Assert.assertNotNull(resourceBundle0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setDomainCrosshairValue(0.0d);
        xYPlot0.clearDomainMarkers((int) (byte) 1);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        double double17 = xYPlot16.getRangeCrosshairValue();
        java.awt.Image image18 = null;
        xYPlot16.setBackgroundImage(image18);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot16.getDomainAxis(100);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        xYPlot16.drawAnnotations(graphics2D22, rectangle2D23, plotRenderingInfo24);
        xYPlot16.setWeight((int) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] { valueAxis28 };
        xYPlot16.setDomainAxes(valueAxisArray29);
        xYPlot0.setRangeAxes(valueAxisArray29);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertArrayEquals(valueAxisArray29, new org.jfree.chart.axis.ValueAxis[] { null });
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        categoryPlot4.setRangeAxisLocation(10, axisLocation10);
        categoryPlot4.setRangeCrosshairValue((double) 100L, false);
        categoryPlot4.clearDomainAxes();
        boolean boolean16 = categoryPlot4.getDrawSharedDomainAxis();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.util.Layer layer20 = null;
        categoryPlot4.drawRangeMarkers(graphics2D17, rectangle2D18, (int) (byte) 1, layer20);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.clearAnnotations();
        org.jfree.chart.plot.Plot plot5 = xYPlot0.getRootPlot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        xYPlot0.drawAnnotations(graphics2D6, rectangle2D7, plotRenderingInfo8);
        boolean boolean10 = xYPlot0.isDomainCrosshairVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        categoryPlot17.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot17.setRenderer((int) 'a', categoryItemRenderer21, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke27 = xYPlot26.getDomainZeroBaselineStroke();
        java.util.List list28 = xYPlot26.getAnnotations();
        java.awt.geom.Point2D point2D29 = xYPlot26.getQuadrantOrigin();
        categoryPlot17.zoomDomainAxes((double) (short) 100, plotRenderingInfo25, point2D29, false);
        categoryPlot4.zoomDomainAxes(0.0d, plotRenderingInfo12, point2D29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot4.getRangeAxisEdge();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawOutline(graphics2D34, rectangle2D35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis9);
        categoryPlot4.setBackgroundAlpha((float) (byte) 1);
        categoryPlot4.setAnchorValue((double) (-1.0f));
        java.awt.Paint paint15 = categoryPlot4.getNoDataMessagePaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke10 = xYPlot9.getDomainZeroBaselineStroke();
        java.util.List list11 = xYPlot9.getAnnotations();
        categoryPlot4.drawRangeGridlines(graphics2D7, rectangle2D8, list11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot4.zoomDomainAxes((double) (-1), 1.0d, plotRenderingInfo15, point2D16);
        boolean boolean18 = categoryPlot4.isOutlineVisible();
        java.awt.Paint paint19 = categoryPlot4.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.data.category.CategoryDataset categoryDataset9 = categoryPlot4.getDataset((int) '4');
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot10.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot10.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot16 = xYPlot10.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.data.xy.XYDataset xYDataset22 = xYPlot17.getDataset((int) (short) 0);
        java.awt.Paint paint23 = xYPlot17.getOutlinePaint();
        xYPlot10.setRangeCrosshairPaint(paint23);
        java.awt.Stroke stroke25 = xYPlot10.getDomainZeroBaselineStroke();
        categoryPlot4.setRangeGridlineStroke(stroke25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(xYDataset22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot8.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = xYPlot8.getDrawingSupplier();
        java.awt.geom.Point2D point2D14 = xYPlot8.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo7, point2D14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis17);
        xYPlot0.clearRangeMarkers();
        java.awt.Paint paint20 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.clearAnnotations();
        xYPlot0.clearDomainMarkers(1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        int int9 = xYPlot0.indexOf(xYDataset8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        int int11 = xYPlot0.getDomainAxisIndex(valueAxis10);
        boolean boolean12 = xYPlot0.isRangeGridlinesVisible();
        float float13 = xYPlot0.getBackgroundImageAlpha();
        java.awt.Paint paint14 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = xYPlot0.getDomainMarkers(layer16);
        double double18 = xYPlot0.getDomainCrosshairValue();
        java.util.List list19 = xYPlot0.getAnnotations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        boolean boolean6 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = xYPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRenderer(1);
        xYPlot0.mapDatasetToDomainAxis((int) (short) -1, (int) '#');
        boolean boolean17 = xYPlot0.isDomainZoomable();
        xYPlot0.configureDomainAxes();
        xYPlot0.setDomainCrosshairValue((double) 98);
        java.awt.Stroke stroke21 = xYPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        xYPlot0.zoomRangeAxes((double) 1, plotRenderingInfo7, point2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot14.setRenderer(categoryItemRenderer17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot14.setDomainAxis(categoryAxis19);
        categoryPlot14.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot14.getDomainAxis((int) 'a');
        java.awt.Font font24 = categoryPlot14.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot14.getRendererForDataset(categoryDataset25);
        java.awt.Stroke stroke27 = categoryPlot14.getDomainGridlineStroke();
        xYPlot0.setDomainGridlineStroke(stroke27);
        int int29 = xYPlot0.getSeriesCount();
        xYPlot0.clearDomainAxes();
        java.awt.Paint paint31 = xYPlot0.getRangeGridlinePaint();
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = xYPlot0.getDomainMarkers((int) (byte) 1, layer33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(collection34);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        boolean boolean16 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.setRangeCrosshairValue((double) 1L, true);
        java.awt.Paint paint20 = xYPlot0.getRangeZeroBaselinePaint();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.clearDomainMarkers((int) '4');
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot4.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot18.getAxisOffset();
        java.awt.Image image23 = categoryPlot18.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot18.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        double double27 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot26.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot26.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot32 = xYPlot26.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        xYPlot33.drawZeroRangeBaseline(graphics2D34, rectangle2D35);
        org.jfree.data.xy.XYDataset xYDataset38 = xYPlot33.getDataset((int) (short) 0);
        java.awt.Paint paint39 = xYPlot33.getOutlinePaint();
        xYPlot26.setRangeCrosshairPaint(paint39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot26.setInsets(rectangleInsets41);
        categoryPlot18.setAxisOffset(rectangleInsets41);
        java.awt.Stroke stroke44 = categoryPlot18.getRangeCrosshairStroke();
        categoryPlot4.setOutlineStroke(stroke44);
        categoryPlot4.setRangeCrosshairValue((double) 0L);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(xYDataset38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        xYPlot0.setRangeAxis((int) '#', valueAxis4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot0.setRangeAxis(0, valueAxis7, true);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        xYPlot0.setDomainAxis(100, valueAxis11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot0.setDomainAxis(valueAxis13);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        categoryPlot4.mapDatasetToDomainAxis((int) '4', 100);
        boolean boolean14 = categoryPlot4.isDomainGridlinesVisible();
        categoryPlot4.setDrawSharedDomainAxis(false);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.util.Layer layer20 = null;
        categoryPlot4.drawDomainMarkers(graphics2D17, rectangle2D18, (int) (short) 0, layer20);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        java.awt.Paint paint9 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot4.getDomainAxisEdge((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot4.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot4.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = categoryPlot4.getRangeAxisIndex(valueAxis14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        java.awt.Stroke stroke7 = xYPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) 10, (int) '#');
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        java.awt.Paint paint13 = xYPlot0.getDomainCrosshairPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        categoryPlot4.setDataset((int) (byte) 0, categoryDataset13);
        int int15 = categoryPlot4.getRangeAxisCount();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot4.getRangeAxisEdge((int) (byte) 100);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot4.getDomainMarkers(layer14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot4.setRangeAxis((int) ' ', valueAxis17, true);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        boolean boolean16 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.data.xy.XYDataset xYDataset22 = xYPlot17.getDataset((int) (short) 0);
        boolean boolean23 = xYPlot17.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        xYPlot17.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        org.jfree.chart.axis.AxisSpace axisSpace30 = xYPlot17.calculateDomainAxisSpace(graphics2D27, rectangle2D28, axisSpace29);
        xYPlot0.setFixedDomainAxisSpace(axisSpace30, true);
        java.awt.Paint paint33 = xYPlot0.getDomainTickBandPaint();
        int int34 = xYPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(xYDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(axisSpace30);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        boolean boolean4 = xYPlot0.isRangeZoomable();
        xYPlot0.setDomainCrosshairValue((double) (short) -1);
        java.awt.Font font7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        xYPlot0.setNoDataMessageFont(font7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.mapDatasetToRangeAxis(10, (int) (short) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot4.setRenderer((int) (byte) 10, categoryItemRenderer16, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot4.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis21 = categoryPlot4.getRangeAxis(0);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNull(valueAxis21);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        boolean boolean10 = categoryPlot4.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        categoryPlot4.setDomainGridlinesVisible(false);
        categoryPlot4.setRangeCrosshairValue((double) 100L);
        float float14 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.plot.Marker marker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot4.removeRangeMarker(marker15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot4.setDataset((int) ' ', categoryDataset12);
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot4.setDomainAxis(categoryAxis17);
        java.awt.Font font19 = categoryPlot4.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        double double15 = xYPlot14.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot14.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot14.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot20 = xYPlot14.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.data.xy.XYDataset xYDataset26 = xYPlot21.getDataset((int) (short) 0);
        java.awt.Paint paint27 = xYPlot21.getOutlinePaint();
        xYPlot14.setRangeCrosshairPaint(paint27);
        java.awt.Stroke stroke29 = xYPlot14.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = xYPlot14.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        xYPlot33.drawZeroRangeBaseline(graphics2D34, rectangle2D35);
        org.jfree.chart.axis.AxisLocation axisLocation38 = xYPlot33.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = xYPlot33.getDomainMarkers(1, layer40);
        java.awt.Stroke stroke42 = xYPlot33.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        categoryPlot47.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        categoryPlot47.setRenderer((int) 'a', categoryItemRenderer51, false);
        int int54 = categoryPlot47.getWeight();
        java.awt.Paint paint55 = categoryPlot47.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawRangeCrosshair(graphics2D12, rectangle2D13, plotOrientation30, (double) (-1), valueAxis32, stroke42, paint55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNull(xYDataset26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(plotOrientation30);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertNull(collection41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot4.getRangeAxis((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot4.getRangeAxis((int) (short) 1);
        boolean boolean14 = categoryPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot4.getRangeAxis((int) ' ');
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        double double18 = xYPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot17.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = xYPlot17.getDrawingSupplier();
        categoryPlot4.setDrawingSupplier(drawingSupplier22);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot4.getDomainAxis();
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNull(categoryAxis24);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        float float9 = categoryPlot4.getBackgroundAlpha();
        int int10 = categoryPlot4.getDatasetCount();
        float float11 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        java.util.List list13 = categoryPlot4.getCategoriesForAxis(categoryAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot4.setRangeCrosshairValue((double) (short) 10, false);
        categoryPlot4.configureDomainAxes();
        categoryPlot4.clearRangeMarkers((int) (byte) 1);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot4.getDomainAxisLocation(36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) (short) 10, layer13);
        categoryPlot4.setWeight((int) '4');
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke23 = xYPlot17.getDomainGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset25 = xYPlot17.getDataset((int) (byte) 0);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot26.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = xYPlot26.getDomainMarkers(1, layer33);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = xYPlot26.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup42 = categoryPlot40.getDatasetGroup();
        boolean boolean43 = categoryPlot40.isDomainZoomable();
        java.awt.Font font44 = categoryPlot40.getNoDataMessageFont();
        xYPlot26.setNoDataMessageFont(font44);
        java.awt.Stroke stroke46 = xYPlot26.getDomainCrosshairStroke();
        java.awt.Paint paint47 = xYPlot26.getDomainCrosshairPaint();
        xYPlot17.setRangeGridlinePaint(paint47);
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.chart.axis.AxisSpace axisSpace51 = xYPlot17.calculateAxisSpace(graphics2D49, rectangle2D50);
        boolean boolean52 = categoryPlot4.equals((java.lang.Object) xYPlot17);
        xYPlot17.setDomainCrosshairVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(xYDataset25);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(axisSpace51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot11.drawZeroRangeBaseline(graphics2D12, rectangle2D13);
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot11.getDataset((int) (short) 0);
        java.util.List list17 = xYPlot11.getAnnotations();
        xYPlot0.drawDomainGridlines(graphics2D9, rectangle2D10, list17);
        xYPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(xYDataset16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke6 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        xYPlot0.notifyListeners(plotChangeEvent7);
        org.jfree.data.xy.XYDataset xYDataset10 = xYPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) ' ', marker12, layer13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(xYDataset10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Plot plot10 = xYPlot0.getParent();
        org.jfree.chart.plot.Plot plot11 = xYPlot0.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        xYPlot0.datasetChanged(datasetChangeEvent12);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D3, rectangle2D4);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers(layer6);
        int int8 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot0.getDomainAxisIndex(valueAxis9);
        java.awt.Paint paint12 = xYPlot0.getQuadrantPaint((int) (byte) 1);
        java.awt.Paint paint13 = xYPlot0.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.data.xy.XYDataset xYDataset22 = xYPlot17.getDataset((int) (short) 0);
        java.awt.Paint paint23 = xYPlot17.getOutlinePaint();
        xYPlot0.setNoDataMessagePaint(paint23);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(xYDataset22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers((int) (short) -1, layer6);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot0.getDomainAxis((int) 'a');
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        xYPlot0.rendererChanged(rendererChangeEvent11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot4.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        xYPlot0.zoomDomainAxes((double) 0L, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder19 = xYPlot0.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.axis.AxisSpace axisSpace22 = xYPlot0.calculateAxisSpace(graphics2D20, rectangle2D21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.axis.AxisSpace axisSpace25 = xYPlot0.calculateAxisSpace(graphics2D23, rectangle2D24);
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((-1), marker27, layer28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(seriesRenderingOrder19);
        org.junit.Assert.assertNotNull(axisSpace22);
        org.junit.Assert.assertNotNull(axisSpace25);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) (short) 10, layer13);
        categoryPlot4.setWeight((int) '4');
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot4.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot24.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder26 = categoryPlot24.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot24.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        categoryPlot24.setDomainAxis((int) ' ', categoryAxis29);
        categoryPlot24.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot24.getDomainAxisForDataset(0);
        java.awt.Paint paint35 = categoryPlot24.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        categoryPlot42.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = categoryPlot42.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder47 = categoryPlot42.getDatasetRenderingOrder();
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = categoryPlot42.getDomainAxisEdge();
        java.util.List list49 = categoryPlot42.getAnnotations();
        categoryPlot24.drawRangeGridlines(graphics2D36, rectangle2D37, list49);
        categoryPlot4.drawRangeGridlines(graphics2D18, rectangle2D19, list49);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(sortOrder26);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNull(categoryAxis34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(datasetRenderingOrder47);
        org.junit.Assert.assertNotNull(rectangleEdge48);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        categoryPlot4.clearAnnotations();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot4.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(sortOrder9);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        xYPlot0.zoom((double) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        xYPlot0.setDomainAxis((int) ' ', valueAxis12);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder14 = xYPlot0.getSeriesRenderingOrder();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder14);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = xYPlot0.getAxisOffset();
        java.awt.Image image4 = xYPlot0.getBackgroundImage();
        xYPlot0.setDomainCrosshairValue((double) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        boolean boolean15 = categoryPlot12.isDomainZoomable();
        boolean boolean16 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        categoryPlot12.setDataset((int) ' ', categoryDataset20);
        java.awt.Stroke stroke22 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot12.setDomainGridlineStroke(stroke22);
        categoryPlot12.configureRangeAxes();
        boolean boolean25 = categoryPlot12.isDomainZoomable();
        categoryPlot12.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot12.getDomainAxisLocation();
        xYPlot0.setRangeAxisLocation((int) (short) 1, axisLocation28, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot4.getDataset((int) 'a');
        categoryPlot4.configureDomainAxes();
        categoryPlot4.clearDomainAxes();
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        int int10 = categoryPlot4.getDatasetCount();
        categoryPlot4.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        java.awt.Stroke stroke20 = xYPlot0.getDomainCrosshairStroke();
        java.awt.Paint paint21 = xYPlot0.getDomainCrosshairPaint();
        java.awt.geom.Point2D point2D22 = xYPlot0.getQuadrantOrigin();
        boolean boolean23 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = xYPlot0.getRangeAxisEdge();
        xYPlot0.setDomainCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(point2D22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleEdge24);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = xYPlot0.getDomainAxisEdge(10);
        boolean boolean17 = xYPlot0.isRangeZoomable();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = xYPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot4.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        java.awt.Paint paint17 = categoryPlot16.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.data.xy.XYDataset xYDataset23 = xYPlot18.getDataset((int) (short) 0);
        boolean boolean24 = xYPlot18.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        xYPlot18.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        org.jfree.chart.axis.AxisSpace axisSpace31 = xYPlot18.calculateDomainAxisSpace(graphics2D28, rectangle2D29, axisSpace30);
        categoryPlot16.setFixedDomainAxisSpace(axisSpace31, false);
        categoryPlot4.setFixedRangeAxisSpace(axisSpace31);
        boolean boolean35 = categoryPlot4.isOutlineVisible();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.axis.AxisSpace axisSpace38 = categoryPlot4.calculateAxisSpace(graphics2D36, rectangle2D37);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(xYDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisSpace31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(axisSpace38);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, (int) 'a', layer10);
        xYPlot0.setRangeCrosshairValue((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        xYPlot0.setDomainAxis((int) (short) 100, valueAxis12, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        float float6 = xYPlot0.getBackgroundImageAlpha();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer7 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray8 = new org.jfree.chart.renderer.xy.XYItemRenderer[] { xYItemRenderer7 };
        xYPlot0.setRenderers(xYItemRendererArray8);
        xYPlot0.setDomainZeroBaselineVisible(false);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(xYItemRendererArray8);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray8, new org.jfree.chart.renderer.xy.XYItemRenderer[] { null });
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D5, rectangle2D6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        double double12 = xYPlot11.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot11.getDomainAxis(1);
        double double15 = xYPlot11.getDomainCrosshairValue();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = xYPlot11.getRangeAxisEdge((int) '#');
        double double18 = xYPlot11.getDomainCrosshairValue();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot11.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot26.setRangeAxes(valueAxisArray27);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot26.getDomainAxisLocation();
        xYPlot26.setRangeCrosshairValue((double) 10.0f);
        java.awt.Stroke stroke32 = xYPlot26.getDomainGridlineStroke();
        xYPlot11.setRangeCrosshairStroke(stroke32);
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        xYPlot34.drawZeroRangeBaseline(graphics2D35, rectangle2D36);
        org.jfree.chart.axis.AxisLocation axisLocation39 = xYPlot34.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer41 = null;
        java.util.Collection collection42 = xYPlot34.getDomainMarkers(1, layer41);
        org.jfree.chart.LegendItemCollection legendItemCollection43 = xYPlot34.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer47 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis45, valueAxis46, categoryItemRenderer47);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = categoryPlot48.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup50 = categoryPlot48.getDatasetGroup();
        boolean boolean51 = categoryPlot48.isDomainZoomable();
        java.awt.Font font52 = categoryPlot48.getNoDataMessageFont();
        xYPlot34.setNoDataMessageFont(font52);
        java.awt.Stroke stroke54 = xYPlot34.getDomainCrosshairStroke();
        java.awt.Paint paint55 = xYPlot34.getDomainCrosshairPaint();
        xYPlot34.setRangeZeroBaselineVisible(false);
        double double58 = xYPlot34.getRangeCrosshairValue();
        java.awt.Paint paint59 = xYPlot34.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawHorizontalLine(graphics2D8, rectangle2D9, 0.0d, stroke32, paint59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertArrayEquals(valueAxisArray27, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(axisLocation39);
        org.junit.Assert.assertNull(collection42);
        org.junit.Assert.assertNotNull(legendItemCollection43);
        org.junit.Assert.assertNotNull(drawingSupplier49);
        org.junit.Assert.assertNull(datasetGroup50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot7.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot13 = xYPlot7.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot7.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot7.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke17 = xYPlot16.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        int int19 = xYPlot16.getRangeAxisIndex(valueAxis18);
        xYPlot16.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        double double25 = xYPlot24.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis27 = xYPlot24.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = xYPlot24.getDrawingSupplier();
        java.awt.geom.Point2D point2D30 = xYPlot24.getQuadrantOrigin();
        xYPlot16.zoomRangeAxes((double) (short) 10, plotRenderingInfo23, point2D30);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = xYPlot16.getDomainMarkers(layer32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot16.getRangeAxisLocation(100);
        xYPlot7.setRangeAxisLocation(axisLocation35);
        xYPlot0.setDomainAxisLocation(axisLocation35);
        org.jfree.chart.util.Layer layer38 = null;
        java.util.Collection collection39 = xYPlot0.getRangeMarkers(layer38);
        xYPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(point2D30);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNull(collection39);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot9.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot0.setRangeAxis((int) (byte) 10, valueAxis13);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent16 = null;
        xYPlot15.rendererChanged(rendererChangeEvent16);
        boolean boolean18 = xYPlot15.isRangeZeroBaselineVisible();
        xYPlot15.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        boolean boolean25 = xYPlot21.isDomainCrosshairVisible();
        xYPlot21.setRangeCrosshairVisible(true);
        int int28 = xYPlot21.getRangeAxisCount();
        xYPlot21.configureDomainAxes();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = null;
        int int31 = xYPlot21.getIndexOf(xYItemRenderer30);
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        xYPlot21.setDomainAxis(valueAxis32);
        java.awt.Stroke stroke34 = xYPlot21.getDomainCrosshairStroke();
        xYPlot15.setRangeGridlineStroke(stroke34);
        xYPlot0.setDomainZeroBaselineStroke(stroke34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setRangeAxes(valueAxisArray5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot4.setRangeAxis(1, valueAxis8);
        java.awt.Paint paint10 = xYPlot4.getDomainGridlinePaint();
        java.awt.Paint paint11 = xYPlot4.getRangeZeroBaselinePaint();
        xYPlot4.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) -1);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot15.getDomainAxis(10);
        xYPlot15.configureDomainAxes();
        java.awt.Paint paint19 = xYPlot15.getDomainCrosshairPaint();
        java.awt.Stroke stroke20 = xYPlot15.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot21.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke27 = xYPlot21.getDomainGridlineStroke();
        xYPlot15.setRangeZeroBaselineStroke(stroke27);
        org.jfree.chart.axis.AxisSpace axisSpace29 = xYPlot15.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace30 = xYPlot15.getFixedRangeAxisSpace();
        java.awt.Paint paint31 = xYPlot15.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot15.getRangeAxisLocation((int) (short) 1);
        xYPlot4.setRangeAxisLocation(axisLocation33);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        int int36 = xYPlot4.getRangeAxisIndex(valueAxis35);
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(axisSpace29);
        org.junit.Assert.assertNull(axisSpace30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        categoryPlot17.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot17.setRenderer((int) 'a', categoryItemRenderer21, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke27 = xYPlot26.getDomainZeroBaselineStroke();
        java.util.List list28 = xYPlot26.getAnnotations();
        java.awt.geom.Point2D point2D29 = xYPlot26.getQuadrantOrigin();
        categoryPlot17.zoomDomainAxes((double) (short) 100, plotRenderingInfo25, point2D29, false);
        categoryPlot4.zoomDomainAxes(0.0d, plotRenderingInfo12, point2D29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot4.getRangeAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot4.getColumnRenderingOrder();
        categoryPlot4.setWeight(98);
        org.jfree.chart.plot.Marker marker37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = categoryPlot4.removeDomainMarker(marker37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(sortOrder34);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        java.awt.Stroke stroke20 = xYPlot0.getDomainCrosshairStroke();
        java.awt.Paint paint21 = xYPlot0.getDomainCrosshairPaint();
        xYPlot0.clearRangeMarkers((int) (short) 100);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        xYPlot0.drawRangeMarkers(graphics2D24, rectangle2D25, (int) 'a', layer27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis34 = xYPlot32.getDomainAxis(10);
        java.awt.Paint paint35 = xYPlot32.getDomainTickBandPaint();
        boolean boolean36 = xYPlot32.isRangeZoomable();
        xYPlot32.setDomainCrosshairValue((double) (short) -1);
        double double39 = xYPlot32.getRangeCrosshairValue();
        java.awt.geom.Point2D point2D40 = xYPlot32.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) 98, (double) 10L, plotRenderingInfo31, point2D40);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(valueAxis34);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(point2D40);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis(100);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        xYPlot0.drawAnnotations(graphics2D6, rectangle2D7, plotRenderingInfo8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        xYPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        boolean boolean8 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot9.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        org.jfree.data.xy.XYDataset xYDataset14 = xYPlot9.getDataset((int) (short) 0);
        java.awt.Paint paint15 = xYPlot9.getOutlinePaint();
        categoryPlot4.setNoDataMessagePaint(paint15);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot4.getRangeAxis(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYDataset14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(valueAxis18);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Plot plot10 = xYPlot0.getParent();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        categoryPlot17.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke24 = xYPlot23.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder25 = xYPlot23.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = categoryPlot30.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup32 = categoryPlot30.getDatasetGroup();
        boolean boolean33 = categoryPlot30.isDomainZoomable();
        boolean boolean34 = categoryPlot30.isRangeZoomable();
        categoryPlot30.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        categoryPlot30.setDataset((int) ' ', categoryDataset38);
        java.awt.Stroke stroke40 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot30.setDomainGridlineStroke(stroke40);
        xYPlot23.setDomainZeroBaselineStroke(stroke40);
        java.awt.geom.Point2D point2D43 = xYPlot23.getQuadrantOrigin();
        categoryPlot17.zoomDomainAxes((double) (byte) 1, plotRenderingInfo22, point2D43, false);
        org.jfree.chart.plot.PlotState plotState46 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.draw(graphics2D11, rectangle2D12, point2D43, plotState46, plotRenderingInfo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(datasetRenderingOrder25);
        org.junit.Assert.assertNotNull(drawingSupplier31);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(point2D43);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        java.awt.Stroke stroke7 = categoryPlot4.getRangeCrosshairStroke();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        boolean boolean18 = categoryPlot14.isRangeZoomable();
        categoryPlot14.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot14.setDataset((int) ' ', categoryDataset22);
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot14.setDomainGridlineStroke(stroke24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        categoryPlot30.setRangeCrosshairValue((double) 1L, true);
        boolean boolean34 = categoryPlot14.equals((java.lang.Object) 1L);
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        double double36 = xYPlot35.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        java.util.List list39 = null;
        xYPlot35.drawDomainGridlines(graphics2D37, rectangle2D38, list39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        java.awt.geom.Point2D point2D43 = null;
        xYPlot35.zoomRangeAxes((double) 1, plotRenderingInfo42, point2D43);
        xYPlot35.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis48, valueAxis49, categoryItemRenderer50);
        categoryPlot51.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer55 = null;
        categoryPlot51.setRenderer((int) 'a', categoryItemRenderer55, false);
        int int58 = categoryPlot51.getWeight();
        boolean boolean59 = categoryPlot51.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer61 = null;
        categoryPlot51.setRenderer((int) (short) 0, categoryItemRenderer61);
        org.jfree.chart.axis.AxisLocation axisLocation63 = categoryPlot51.getRangeAxisLocation();
        xYPlot35.setDomainAxisLocation((int) (byte) 0, axisLocation63, false);
        categoryPlot14.setRangeAxisLocation(axisLocation63);
        xYPlot0.setRangeAxisLocation((int) 'a', axisLocation63);
        java.awt.Paint paint68 = xYPlot0.getDomainTickBandPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(axisLocation63);
        org.junit.Assert.assertNull(paint68);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot8.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = xYPlot8.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke14 = xYPlot8.getDomainGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot8.getDataset((int) (byte) 0);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = xYPlot17.getDomainMarkers(1, layer24);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = xYPlot17.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot31.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup33 = categoryPlot31.getDatasetGroup();
        boolean boolean34 = categoryPlot31.isDomainZoomable();
        java.awt.Font font35 = categoryPlot31.getNoDataMessageFont();
        xYPlot17.setNoDataMessageFont(font35);
        java.awt.Stroke stroke37 = xYPlot17.getDomainCrosshairStroke();
        java.awt.Paint paint38 = xYPlot17.getDomainCrosshairPaint();
        xYPlot8.setRangeGridlinePaint(paint38);
        xYPlot0.setDomainGridlinePaint(paint38);
        org.jfree.chart.plot.Marker marker42 = null;
        org.jfree.chart.util.Layer layer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xYPlot0.removeRangeMarker((int) (short) 1, marker42, layer43, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(xYDataset16);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(legendItemCollection26);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder16);
        boolean boolean18 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot4.getDomainAxis();
        categoryPlot4.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        java.awt.Paint paint8 = xYPlot0.getRangeTickBandPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke13 = xYPlot12.getDomainZeroBaselineStroke();
        java.util.List list14 = xYPlot12.getAnnotations();
        xYPlot12.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot12.setRangeAxis(valueAxis17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot12.setDomainAxis((int) 'a', valueAxis20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        xYPlot12.setDomainAxis(valueAxis22);
        xYPlot12.mapDatasetToDomainAxis((int) (byte) 10, (int) '#');
        java.awt.Stroke stroke27 = xYPlot12.getRangeZeroBaselineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke27);
        boolean boolean29 = xYPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers((int) (short) -1, layer6);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = xYPlot0.getDataRange(valueAxis9);
        xYPlot0.setRangeGridlinesVisible(true);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.util.Layer layer16 = null;
        xYPlot0.drawDomainMarkers(graphics2D13, rectangle2D14, (int) (short) -1, layer16);
        org.jfree.chart.plot.Plot plot18 = xYPlot0.getParent();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot26.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup28 = categoryPlot26.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot26.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot30.drawZeroRangeBaseline(graphics2D31, rectangle2D32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot30.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint37 = xYPlot36.getBackgroundPaint();
        xYPlot30.setRangeZeroBaselinePaint(paint37);
        categoryPlot26.setBackgroundPaint(paint37);
        boolean boolean40 = categoryPlot26.isRangeZoomable();
        java.awt.Stroke stroke41 = categoryPlot26.getRangeCrosshairStroke();
        java.awt.Paint paint42 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawHorizontalLine(graphics2D19, rectangle2D20, 100.0d, stroke41, paint42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setDomainZeroBaselineVisible(true);
        boolean boolean11 = xYPlot0.isRangeGridlinesVisible();
        xYPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        boolean boolean4 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = xYPlot0.getDomainAxis(0);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = xYPlot0.removeRangeMarker((int) '#', marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(valueAxis6);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        int int3 = xYPlot0.getWeight();
        int int4 = xYPlot0.getSeriesCount();
        java.awt.Image image5 = xYPlot0.getBackgroundImage();
        xYPlot0.setRangeGridlinesVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYPlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot8.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = xYPlot8.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint15 = xYPlot14.getBackgroundPaint();
        xYPlot8.setRangeZeroBaselinePaint(paint15);
        categoryPlot4.setBackgroundPaint(paint15);
        boolean boolean18 = categoryPlot4.isRangeZoomable();
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray20 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot4.setRangeAxes(valueAxisArray20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        categoryPlot4.drawAnnotations(graphics2D22, rectangle2D23, plotRenderingInfo24);
        categoryPlot4.clearAnnotations();
        categoryPlot4.setBackgroundAlpha((float) 100L);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(valueAxisArray20);
        org.junit.Assert.assertArrayEquals(valueAxisArray20, new org.jfree.chart.axis.ValueAxis[] {});
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation7 = xYPlot0.getRangeAxisLocation((int) 'a');
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        xYPlot0.setDomainCrosshairValue((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(seriesRenderingOrder8);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation7 = xYPlot0.getRangeAxisLocation((int) 'a');
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation10 = xYPlot0.getRangeAxisLocation((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(seriesRenderingOrder8);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.axis.AxisSpace axisSpace11 = xYPlot0.calculateAxisSpace(graphics2D9, rectangle2D10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        double double15 = xYPlot14.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot14.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot14.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot20 = xYPlot14.getRootPlot();
        java.awt.Paint paint21 = xYPlot14.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder22 = xYPlot14.getSeriesRenderingOrder();
        java.awt.geom.Point2D point2D23 = xYPlot14.getQuadrantOrigin();
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.draw(graphics2D12, rectangle2D13, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisSpace11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(seriesRenderingOrder22);
        org.junit.Assert.assertNotNull(point2D23);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        boolean boolean5 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot6.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke12 = xYPlot6.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke12);
        java.awt.Stroke stroke14 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot0.getDomainAxis();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        int int11 = categoryPlot4.getWeight();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot4.setRenderer((int) (short) 100, categoryItemRenderer13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.data.Range range16 = categoryPlot4.getDataRange(valueAxis15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot4.getRendererForDataset(categoryDataset17);
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        categoryPlot4.notifyListeners(plotChangeEvent20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNull(categoryItemRenderer18);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset6 = xYPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis((int) (byte) 1, valueAxis8, false);
        int int11 = xYPlot0.getDatasetCount();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.axis.AxisSpace axisSpace14 = xYPlot0.calculateAxisSpace(graphics2D12, rectangle2D13);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(xYDataset6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(axisSpace14);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        int int11 = categoryPlot4.getWeight();
        java.awt.Paint paint12 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.Plot plot15 = categoryPlot4.getParent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        double double10 = xYPlot9.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot9.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot9.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot15 = xYPlot9.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot16.drawZeroRangeBaseline(graphics2D17, rectangle2D18);
        org.jfree.data.xy.XYDataset xYDataset21 = xYPlot16.getDataset((int) (short) 0);
        java.awt.Paint paint22 = xYPlot16.getOutlinePaint();
        xYPlot9.setRangeCrosshairPaint(paint22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot9.setInsets(rectangleInsets24);
        categoryPlot4.setInsets(rectangleInsets24, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot4.getAxisOffset();
        int int29 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot4.getDomainMarkers(36, layer31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = categoryPlot4.getRendererForDataset(categoryDataset33);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(xYDataset21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNull(categoryItemRenderer34);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot4.setDataset((int) ' ', categoryDataset12);
        categoryPlot4.setRangeGridlinesVisible(true);
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearAnnotations();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot4.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(categoryAnchor18);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot8.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = xYPlot8.getDrawingSupplier();
        java.awt.geom.Point2D point2D14 = xYPlot8.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo7, point2D14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis17);
        boolean boolean19 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Paint paint20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot0.setBackgroundPaint(paint20);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot26.setRangeAxes(valueAxisArray27);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot26.getDomainAxisLocation();
        xYPlot26.setRangeCrosshairValue((double) 10.0f);
        java.awt.Stroke stroke32 = xYPlot26.getDomainGridlineStroke();
        xYPlot0.setDomainCrosshairStroke(stroke32);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = xYPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertArrayEquals(valueAxisArray27, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(rectangleEdge34);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot12.setRenderer(categoryItemRenderer15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        categoryPlot12.setDomainAxisLocation(axisLocation22);
        categoryPlot4.setRangeAxisLocation((int) (byte) 100, axisLocation22, true);
        org.jfree.chart.plot.Marker marker26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder16);
        java.awt.Paint paint18 = categoryPlot4.getNoDataMessagePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot4.setRenderer((int) ' ', categoryItemRenderer20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        int int23 = categoryPlot4.getIndexOf(categoryItemRenderer22);
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = categoryPlot4.removeRangeMarker((int) (short) 10, marker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        categoryPlot4.setRangeCrosshairValue((double) (-1), true);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        double double12 = xYPlot11.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot11.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot11.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot17 = xYPlot11.getRootPlot();
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot11.getDomainMarkers(layer18);
        xYPlot11.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = categoryPlot25.getDrawingSupplier();
        java.awt.Stroke stroke27 = categoryPlot25.getRangeGridlineStroke();
        xYPlot11.setDomainGridlineStroke(stroke27);
        categoryPlot4.setRangeCrosshairStroke(stroke27);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot4.setRangeCrosshairPaint(paint30);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = categoryPlot4.getDomainAxis();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        categoryPlot4.drawAnnotations(graphics2D33, rectangle2D34, plotRenderingInfo35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categoryAxis32);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = xYPlot0.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setRangeAxis((int) (short) 10, valueAxis9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot0.setDataset((int) (byte) 10, xYDataset12);
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot0.getDomainAxisLocation(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        int int15 = xYPlot0.getRangeAxisCount();
        xYPlot0.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot21.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation24 = categoryPlot21.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot21.setDomainAxis((int) ' ', categoryAxis26);
        categoryPlot21.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot21.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot21.getRangeAxisLocation();
        xYPlot0.setRangeAxisLocation(axisLocation32, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = xYPlot0.getRangeAxisEdge();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.axis.AxisSpace axisSpace38 = xYPlot0.calculateAxisSpace(graphics2D36, rectangle2D37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertNotNull(plotOrientation24);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNotNull(axisSpace38);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        xYPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = xYPlot0.getRangeMarkers(10, layer11);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot7.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot13 = xYPlot7.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot7.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot7.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke17 = xYPlot16.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        int int19 = xYPlot16.getRangeAxisIndex(valueAxis18);
        xYPlot16.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        double double25 = xYPlot24.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis27 = xYPlot24.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = xYPlot24.getDrawingSupplier();
        java.awt.geom.Point2D point2D30 = xYPlot24.getQuadrantOrigin();
        xYPlot16.zoomRangeAxes((double) (short) 10, plotRenderingInfo23, point2D30);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = xYPlot16.getDomainMarkers(layer32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot16.getRangeAxisLocation(100);
        xYPlot7.setRangeAxisLocation(axisLocation35);
        xYPlot0.setDomainAxisLocation(axisLocation35);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot0.getDomainAxis((int) (short) 0);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(point2D30);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNull(valueAxis39);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot4.setDataset((int) 'a', categoryDataset7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot4.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        float float6 = xYPlot0.getBackgroundImageAlpha();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = xYPlot0.getDomainMarkers(15, layer8);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = xYPlot0.getRenderer((int) 'a');
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder12 = xYPlot0.getSeriesRenderingOrder();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(xYItemRenderer11);
        org.junit.Assert.assertNotNull(seriesRenderingOrder12);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        xYPlot0.setOutlineVisible(true);
        xYPlot0.setDomainCrosshairValue((double) ' ', true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot16.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup18 = categoryPlot16.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot16.setRenderer(categoryItemRenderer19);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis(categoryAxis21);
        categoryPlot16.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = categoryPlot16.getDomainAxis((int) 'a');
        java.awt.Font font26 = categoryPlot16.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot16.getRendererForDataset(categoryDataset27);
        java.awt.Stroke stroke29 = categoryPlot16.getDomainGridlineStroke();
        xYPlot0.setRangeGridlineStroke(stroke29);
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        double double32 = xYPlot31.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis34 = xYPlot31.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot35 = xYPlot31.getRootPlot();
        xYPlot31.clearRangeMarkers();
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        xYPlot37.drawZeroRangeBaseline(graphics2D38, rectangle2D39);
        org.jfree.chart.axis.AxisLocation axisLocation42 = xYPlot37.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer44 = null;
        java.util.Collection collection45 = xYPlot37.getDomainMarkers(1, layer44);
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis48 = xYPlot46.getDomainAxis(10);
        xYPlot46.configureDomainAxes();
        java.awt.Paint paint50 = xYPlot46.getDomainCrosshairPaint();
        xYPlot37.setRangeZeroBaselinePaint(paint50);
        xYPlot31.setOutlinePaint(paint50);
        xYPlot0.setRangeGridlinePaint(paint50);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNull(categoryAxis25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(valueAxis34);
        org.junit.Assert.assertNotNull(plot35);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertNull(collection45);
        org.junit.Assert.assertNull(valueAxis48);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.clearDomainMarkers((int) (short) 10);
        xYPlot0.clearDomainAxes();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = xYPlot0.getFixedLegendItems();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.util.Layer layer15 = null;
        xYPlot0.drawRangeMarkers(graphics2D12, rectangle2D13, 15, layer15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(legendItemCollection11);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setAnchorValue((double) (-1L));
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot4.getOrientation();
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNotNull(plotOrientation14);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        int int11 = categoryPlot4.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        xYPlot14.drawZeroRangeBaseline(graphics2D15, rectangle2D16);
        boolean boolean18 = xYPlot14.isDomainCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot23.getDrawingSupplier();
        xYPlot14.setDrawingSupplier(drawingSupplier24);
        java.awt.geom.Point2D point2D26 = xYPlot14.getQuadrantOrigin();
        categoryPlot4.zoomDomainAxes((double) 100.0f, plotRenderingInfo13, point2D26, true);
        boolean boolean29 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(point2D26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        int int9 = categoryPlot4.getWeight();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map15 = categoryPlot4.drawAxes(graphics2D11, rectangle2D12, rectangle2D13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot8.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = xYPlot8.getDrawingSupplier();
        java.awt.geom.Point2D point2D14 = xYPlot8.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo7, point2D14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis17);
        boolean boolean19 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.data.xy.XYDataset xYDataset20 = xYPlot0.getDataset();
        xYPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(xYDataset20);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Plot plot10 = xYPlot0.getParent();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder16);
        java.awt.Paint paint18 = categoryPlot4.getNoDataMessagePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot4.setRenderer((int) ' ', categoryItemRenderer20);
        java.awt.Paint paint22 = categoryPlot4.getNoDataMessagePaint();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor23 = categoryPlot4.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(categoryAnchor23);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        categoryPlot4.setDomainGridlinesVisible(false);
        categoryPlot4.setRangeCrosshairValue((double) 100L);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot4.setDomainAxis(categoryAxis14);
        categoryPlot4.setDomainGridlinesVisible(false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        boolean boolean10 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeCrosshairValue((double) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot4.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot18.setDomainAxis(0, categoryAxis20, false);
        categoryPlot18.configureDomainAxes();
        boolean boolean24 = categoryPlot18.isRangeZoomable();
        categoryPlot18.setRangeCrosshairValue((double) 10);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        categoryPlot31.setDomainAxis(0, categoryAxis33, false);
        categoryPlot31.configureDomainAxes();
        java.awt.Stroke stroke37 = categoryPlot31.getDomainGridlineStroke();
        categoryPlot31.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean41 = categoryPlot31.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot31.getDomainAxisLocation(10);
        categoryPlot18.setDomainAxisLocation(axisLocation43);
        categoryPlot4.setRangeAxisLocation(axisLocation43);
        int int46 = categoryPlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke7 = xYPlot0.getDomainZeroBaselineStroke();
        xYPlot0.setDomainCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        categoryPlot4.setRangeCrosshairLockedOnData(false);
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        categoryPlot4.notifyListeners(plotChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot18.getAxisOffset();
        java.awt.Image image23 = categoryPlot18.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot18.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        double double27 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot26.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot26.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot32 = xYPlot26.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        xYPlot33.drawZeroRangeBaseline(graphics2D34, rectangle2D35);
        org.jfree.data.xy.XYDataset xYDataset38 = xYPlot33.getDataset((int) (short) 0);
        java.awt.Paint paint39 = xYPlot33.getOutlinePaint();
        xYPlot26.setRangeCrosshairPaint(paint39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot26.setInsets(rectangleInsets41);
        categoryPlot18.setAxisOffset(rectangleInsets41);
        java.awt.Stroke stroke44 = categoryPlot18.getRangeCrosshairStroke();
        categoryPlot4.setRangeCrosshairStroke(stroke44);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(xYDataset38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        java.awt.Font font14 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot4.getRendererForDataset(categoryDataset15);
        java.awt.Stroke stroke17 = categoryPlot4.getDomainGridlineStroke();
        int int18 = categoryPlot4.getDatasetCount();
        org.jfree.chart.util.SortOrder sortOrder19 = categoryPlot4.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(sortOrder19);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        boolean boolean6 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = xYPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRenderer(1);
        xYPlot0.setRangeCrosshairLockedOnData(false);
        xYPlot0.setRangeCrosshairValue((double) 'a');
        xYPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        categoryPlot26.setDomainAxis(0, categoryAxis28, false);
        categoryPlot26.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = categoryPlot26.getDomainAxis();
        categoryPlot26.mapDatasetToDomainAxis((int) '4', 100);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        categoryPlot26.drawAnnotations(graphics2D36, rectangle2D37, plotRenderingInfo38);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        categoryPlot47.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke54 = xYPlot53.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder55 = xYPlot53.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot60 = new org.jfree.chart.plot.CategoryPlot(categoryDataset56, categoryAxis57, valueAxis58, categoryItemRenderer59);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = categoryPlot60.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup62 = categoryPlot60.getDatasetGroup();
        boolean boolean63 = categoryPlot60.isDomainZoomable();
        boolean boolean64 = categoryPlot60.isRangeZoomable();
        categoryPlot60.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        categoryPlot60.setDataset((int) ' ', categoryDataset68);
        java.awt.Stroke stroke70 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot60.setDomainGridlineStroke(stroke70);
        xYPlot53.setDomainZeroBaselineStroke(stroke70);
        java.awt.geom.Point2D point2D73 = xYPlot53.getQuadrantOrigin();
        categoryPlot47.zoomDomainAxes((double) (byte) 1, plotRenderingInfo52, point2D73, false);
        categoryPlot26.zoomDomainAxes((double) (short) 0, (double) (byte) 1, plotRenderingInfo42, point2D73);
        xYPlot0.zoomRangeAxes((double) (byte) 100, plotRenderingInfo21, point2D73, false);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertNull(categoryAxis32);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(datasetRenderingOrder55);
        org.junit.Assert.assertNotNull(drawingSupplier61);
        org.junit.Assert.assertNull(datasetGroup62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(stroke70);
        org.junit.Assert.assertNotNull(point2D73);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        java.awt.Paint paint10 = xYPlot0.getRangeZeroBaselinePaint();
        org.jfree.chart.plot.Plot plot11 = xYPlot0.getParent();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        xYPlot0.setDataset(xYDataset14);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot13.getDomainAxisEdge();
        categoryPlot13.configureDomainAxes();
        java.awt.Paint paint18 = categoryPlot13.getDomainGridlinePaint();
        categoryPlot4.setNoDataMessagePaint(paint18);
        categoryPlot4.setBackgroundImageAlignment((int) (byte) -1);
        int int22 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot4.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot4.getDataset(36);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        categoryPlot31.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot31.setRenderer((int) 'a', categoryItemRenderer35, false);
        int int38 = categoryPlot31.getWeight();
        boolean boolean39 = categoryPlot31.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        categoryPlot31.setRenderer((int) (short) 0, categoryItemRenderer41);
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot31.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation((int) ' ', axisLocation43, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(axisLocation43);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot4.getDomainMarkers(layer14);
        boolean boolean16 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        boolean boolean22 = xYPlot21.isRangeZoomable();
        java.lang.String str23 = xYPlot21.getNoDataMessage();
        java.awt.Paint paint24 = xYPlot21.getRangeCrosshairPaint();
        categoryPlot4.setRangeGridlinePaint(paint24);
        categoryPlot4.setOutlineVisible(true);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.plot.Marker marker29 = null;
        org.jfree.chart.util.Layer layer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = categoryPlot4.removeRangeMarker(marker29, layer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        int int3 = xYPlot0.getWeight();
        int int4 = xYPlot0.getSeriesCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = xYPlot0.getDomainAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers(layer6);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        java.awt.Image image10 = null;
        xYPlot8.setBackgroundImage(image10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot8.getDomainAxis(100);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot18.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup20 = categoryPlot18.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot18.getDomainAxisEdge();
        categoryPlot18.configureDomainAxes();
        java.awt.Stroke stroke23 = categoryPlot18.getDomainGridlineStroke();
        xYPlot8.setRangeZeroBaselineStroke(stroke23);
        xYPlot0.setRangeGridlineStroke(stroke23);
        xYPlot0.setDomainZeroBaselineVisible(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        boolean boolean8 = categoryPlot4.isRangeGridlinesVisible();
        boolean boolean9 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot4.getRangeAxis((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        xYPlot0.zoom((double) (byte) 0);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = xYPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean14 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot4.getDomainAxisLocation(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot4.getRangeAxisEdge(15);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = categoryPlot4.removeDomainMarker(marker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot0.getLegendItems();
        java.lang.String str9 = xYPlot0.getNoDataMessage();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = xYPlot0.getRendererForDataset(xYDataset10);
        java.awt.Paint paint12 = xYPlot0.getRangeGridlinePaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot19.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup21 = categoryPlot19.getDatasetGroup();
        boolean boolean22 = categoryPlot19.isDomainZoomable();
        boolean boolean23 = categoryPlot19.isRangeZoomable();
        categoryPlot19.setRangeGridlinesVisible(true);
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.mapDatasetToRangeAxis(10, (int) (short) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot19.setRenderer((int) (byte) 10, categoryItemRenderer31, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation34 = categoryPlot19.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        double double38 = xYPlot37.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot37.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis42 = xYPlot37.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot43 = xYPlot37.getRootPlot();
        org.jfree.chart.util.Layer layer44 = null;
        java.util.Collection collection45 = xYPlot37.getDomainMarkers(layer44);
        xYPlot37.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis48, valueAxis49, categoryItemRenderer50);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = categoryPlot51.getDrawingSupplier();
        java.awt.Stroke stroke53 = categoryPlot51.getRangeGridlineStroke();
        xYPlot37.setDomainGridlineStroke(stroke53);
        xYPlot37.mapDatasetToDomainAxis((int) (short) 10, (int) (short) 0);
        java.awt.Stroke stroke58 = xYPlot37.getDomainZeroBaselineStroke();
        java.awt.Paint paint59 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawRangeCrosshair(graphics2D13, rectangle2D14, plotOrientation34, (double) (short) 1, valueAxis36, stroke58, paint59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(xYItemRenderer11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(plotOrientation34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNull(valueAxis42);
        org.junit.Assert.assertNotNull(plot43);
        org.junit.Assert.assertNull(collection45);
        org.junit.Assert.assertNotNull(drawingSupplier52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder16);
        boolean boolean18 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot4.getDomainAxis();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.util.Layer layer23 = null;
        categoryPlot4.drawDomainMarkers(graphics2D20, rectangle2D21, 98, layer23);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot5.getDomainAxis(10);
        xYPlot5.configureDomainAxes();
        java.awt.Paint paint9 = xYPlot5.getDomainCrosshairPaint();
        categoryPlot4.setRangeGridlinePaint(paint9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot15.setRenderer(categoryItemRenderer18);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis20 };
        categoryPlot15.setDomainAxes(categoryAxisArray21);
        categoryPlot4.setDomainAxes(categoryAxisArray21);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        categoryPlot4.drawDomainMarkers(graphics2D24, rectangle2D25, (int) (byte) -1, layer27);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = categoryPlot4.getRenderer((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxis((-1), categoryAxis32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(categoryItemRenderer30);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        categoryPlot4.clearDomainMarkers((int) '4');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        int int10 = categoryPlot4.getIndexOf(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D3, rectangle2D4);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers(layer6);
        java.awt.Image image8 = null;
        xYPlot0.setBackgroundImage(image8);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot0.getRangeMarkers(layer10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot0.getRangeAxisForDataset((int) (byte) 0);
        xYPlot0.setDomainZeroBaselineVisible(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        boolean boolean16 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.data.xy.XYDataset xYDataset22 = xYPlot17.getDataset((int) (short) 0);
        boolean boolean23 = xYPlot17.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        xYPlot17.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        org.jfree.chart.axis.AxisSpace axisSpace30 = xYPlot17.calculateDomainAxisSpace(graphics2D27, rectangle2D28, axisSpace29);
        xYPlot0.setFixedDomainAxisSpace(axisSpace30, true);
        java.awt.Paint paint33 = xYPlot0.getDomainTickBandPaint();
        int int34 = xYPlot0.getWeight();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(xYDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(axisSpace30);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder16);
        java.awt.Paint paint18 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        int int20 = categoryPlot4.getIndexOf(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot4.getInsets();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) (short) 10, layer13);
        categoryPlot4.setWeight((int) '4');
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke23 = xYPlot17.getDomainGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset25 = xYPlot17.getDataset((int) (byte) 0);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot26.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = xYPlot26.getDomainMarkers(1, layer33);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = xYPlot26.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup42 = categoryPlot40.getDatasetGroup();
        boolean boolean43 = categoryPlot40.isDomainZoomable();
        java.awt.Font font44 = categoryPlot40.getNoDataMessageFont();
        xYPlot26.setNoDataMessageFont(font44);
        java.awt.Stroke stroke46 = xYPlot26.getDomainCrosshairStroke();
        java.awt.Paint paint47 = xYPlot26.getDomainCrosshairPaint();
        xYPlot17.setRangeGridlinePaint(paint47);
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.chart.axis.AxisSpace axisSpace51 = xYPlot17.calculateAxisSpace(graphics2D49, rectangle2D50);
        boolean boolean52 = categoryPlot4.equals((java.lang.Object) xYPlot17);
        org.jfree.chart.plot.Marker marker54 = null;
        org.jfree.chart.util.Layer layer55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = xYPlot17.removeRangeMarker((int) (byte) 0, marker54, layer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(xYDataset25);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(axisSpace51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        boolean boolean7 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.clearDomainMarkers(0);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = xYPlot0.getRangeMarkers((int) '#', layer11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot17.setDomainAxis(0, categoryAxis19, false);
        categoryPlot17.configureDomainAxes();
        java.awt.Stroke stroke23 = categoryPlot17.getDomainGridlineStroke();
        categoryPlot17.mapDatasetToDomainAxis(100, (int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets27);
        xYPlot0.setAxisOffset(rectangleInsets27);
        int int30 = xYPlot0.getWeight();
        xYPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        categoryPlot4.mapDatasetToDomainAxis((int) '4', 100);
        boolean boolean14 = categoryPlot4.isDomainGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke16 = xYPlot15.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        double double18 = xYPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot17.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot17.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot23 = xYPlot17.getRootPlot();
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = xYPlot17.getDomainMarkers(layer24);
        xYPlot17.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        int int32 = categoryPlot31.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = categoryPlot31.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder35 = categoryPlot31.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup42 = categoryPlot40.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = categoryPlot40.getDomainAxisEdge();
        categoryPlot40.configureDomainAxes();
        java.awt.Paint paint45 = categoryPlot40.getDomainGridlinePaint();
        categoryPlot31.setNoDataMessagePaint(paint45);
        xYPlot17.setBackgroundPaint(paint45);
        xYPlot15.setRangeGridlinePaint(paint45);
        categoryPlot4.setRangeCrosshairPaint(paint45);
        boolean boolean50 = categoryPlot4.isRangeZoomable();
        categoryPlot4.clearAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = null;
        java.util.List list53 = categoryPlot4.getCategoriesForAxis(categoryAxis52);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer34);
        org.junit.Assert.assertNotNull(datasetRenderingOrder35);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(rectangleEdge43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot0.axisChanged(axisChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        int int12 = categoryPlot11.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot11.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot11.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = categoryPlot20.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup22 = categoryPlot20.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot20.getDomainAxisEdge();
        categoryPlot20.configureDomainAxes();
        java.awt.Paint paint25 = categoryPlot20.getDomainGridlinePaint();
        categoryPlot11.setNoDataMessagePaint(paint25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot11.getAxisOffset();
        xYPlot0.setAxisOffset(rectangleInsets27);
        boolean boolean29 = xYPlot0.isDomainCrosshairLockedOnData();
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = xYPlot0.getRendererForDataset(xYDataset30);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        xYPlot0.addChangeListener(plotChangeListener32);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(xYItemRenderer31);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        xYPlot0.setDomainCrosshairValue((double) 0L);
        xYPlot0.clearDomainMarkers((int) (byte) 10);
        xYPlot0.setDomainGridlinesVisible(false);
        java.awt.Paint paint9 = xYPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge();
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        double double20 = xYPlot19.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot19.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot19.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot25 = xYPlot19.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.data.xy.XYDataset xYDataset31 = xYPlot26.getDataset((int) (short) 0);
        java.awt.Paint paint32 = xYPlot26.getOutlinePaint();
        xYPlot19.setRangeCrosshairPaint(paint32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot19.setInsets(rectangleInsets34);
        categoryPlot14.setInsets(rectangleInsets34, false);
        org.jfree.chart.plot.Plot plot38 = categoryPlot14.getParent();
        java.awt.Stroke stroke39 = categoryPlot14.getRangeCrosshairStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke39);
        boolean boolean41 = xYPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(xYDataset31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(plot38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer2 = null;
        int int3 = xYPlot0.getIndexOf(xYItemRenderer2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D4, rectangle2D5);
        xYPlot0.setRangeZeroBaselineVisible(true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.clearDomainMarkers((int) (short) 10);
        int int10 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.axis.AxisSpace axisSpace11 = xYPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(axisSpace11);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot8.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = xYPlot8.getDrawingSupplier();
        java.awt.geom.Point2D point2D14 = xYPlot8.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo7, point2D14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis17);
        xYPlot0.clearDomainMarkers((int) (byte) 10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        int int9 = xYPlot0.getDatasetCount();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        xYPlot0.setDomainAxis(0, valueAxis11, false);
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xYPlot0.removeRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        categoryPlot4.setRangeAxisLocation(10, axisLocation10);
        categoryPlot4.setRangeCrosshairValue((double) 100L, false);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D16, rectangle2D17);
        boolean boolean19 = categoryPlot4.equals((java.lang.Object) xYPlot15);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = categoryPlot4.getDomainAxisIndex(categoryAxis20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        double double10 = xYPlot9.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot9.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot9.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot15 = xYPlot9.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot16.drawZeroRangeBaseline(graphics2D17, rectangle2D18);
        org.jfree.data.xy.XYDataset xYDataset21 = xYPlot16.getDataset((int) (short) 0);
        java.awt.Paint paint22 = xYPlot16.getOutlinePaint();
        xYPlot9.setRangeCrosshairPaint(paint22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot9.setInsets(rectangleInsets24);
        categoryPlot4.setInsets(rectangleInsets24, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot4.getAxisOffset();
        int int29 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.configureDomainAxes();
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        java.util.List list33 = categoryPlot4.getCategoriesForAxis(categoryAxis32);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(xYDataset21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot12.setRenderer(categoryItemRenderer15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        categoryPlot12.setDomainAxisLocation(axisLocation22);
        categoryPlot4.setRangeAxisLocation((int) (byte) 100, axisLocation22, true);
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge27 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation22, plotOrientation26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        categoryPlot4.mapDatasetToDomainAxis((int) '4', 100);
        java.awt.Paint paint14 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot4.setDomainGridlinePaint(paint14);
        categoryPlot4.setRangeCrosshairValue((double) 15);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        boolean boolean1 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.Marker marker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xYPlot0.removeRangeMarker(marker2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot4.getFixedLegendItems();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot4.drawDomainGridlines(graphics2D11, rectangle2D12);
        int int14 = categoryPlot4.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor15 = categoryPlot4.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot20.setDomainAxis(0, categoryAxis22, false);
        categoryPlot20.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot20.getDomainAxis();
        categoryPlot20.mapDatasetToDomainAxis((int) '4', 100);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        categoryPlot20.drawAnnotations(graphics2D30, rectangle2D31, plotRenderingInfo32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot20.getRangeAxisLocation((int) (short) -1);
        categoryPlot4.setDomainAxisLocation(axisLocation35, false);
        categoryPlot4.setNoDataMessage("XY Plot");
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(legendItemCollection10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(categoryAnchor15);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setAnchorValue((double) (-1L));
        org.jfree.chart.axis.AxisLocation axisLocation15 = null;
        categoryPlot4.setRangeAxisLocation((int) (byte) 100, axisLocation15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot4.getDataRange(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis9);
        categoryPlot4.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot4.getDomainAxisForDataset(0);
        int int15 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.setAnchorValue((double) 1, true);
        org.jfree.chart.util.SortOrder sortOrder19 = categoryPlot4.getRowRenderingOrder();
        int int20 = categoryPlot4.getWeight();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(sortOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot4.getRangeAxis();
        categoryPlot4.clearRangeAxes();
        int int12 = categoryPlot4.getDatasetCount();
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        int int6 = categoryPlot4.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot4.getRangeAxisForDataset((int) '#');
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot9.getDomainAxis(10);
        xYPlot9.configureDomainAxes();
        java.awt.Paint paint13 = xYPlot9.getDomainCrosshairPaint();
        xYPlot0.setRangeZeroBaselinePaint(paint13);
        boolean boolean15 = xYPlot0.isDomainZoomable();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xYPlot0.removeDomainMarker((int) ' ', marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder9 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot4.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        categoryPlot16.setRangeCrosshairValue((double) 1L, true);
        boolean boolean20 = categoryPlot16.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.data.xy.XYDataset xYDataset26 = xYPlot21.getDataset((int) (short) 0);
        java.awt.Paint paint27 = xYPlot21.getOutlinePaint();
        categoryPlot16.setNoDataMessagePaint(paint27);
        categoryPlot4.setRangeCrosshairPaint(paint27);
        categoryPlot4.setAnchorValue(10.0d, false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(datasetRenderingOrder9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(xYDataset26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean14 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot4.getDomainAxisLocation(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot4.getRangeAxisEdge(15);
        java.awt.Stroke stroke19 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.Marker marker20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = categoryPlot4.removeRangeMarker(marker20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        java.awt.Stroke stroke20 = xYPlot0.getDomainCrosshairStroke();
        java.awt.Paint paint21 = xYPlot0.getDomainCrosshairPaint();
        xYPlot0.clearRangeMarkers((int) (short) 100);
        xYPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot0.getRangeAxis(100);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(valueAxis26);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot4.getFixedLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        boolean boolean9 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot4.getRangeMarkers(0, layer9);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke12 = xYPlot11.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = xYPlot11.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot11.getRangeAxisLocation();
        categoryPlot4.setRangeAxisLocation(axisLocation14, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot4.getDomainAxisLocation();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot4.getAxisOffset();
        boolean boolean19 = categoryPlot4.isRangeZoomable();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        xYPlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        xYPlot22.drawZeroRangeBaseline(graphics2D23, rectangle2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = xYPlot22.getDataset((int) (short) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray28 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot22.setRenderers(xYItemRendererArray28);
        xYPlot0.setRenderers(xYItemRendererArray28);
        xYPlot0.setWeight((int) (short) 100);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(xYDataset27);
        org.junit.Assert.assertNotNull(xYItemRendererArray28);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray28, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        boolean boolean17 = categoryPlot14.isDomainZoomable();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font18);
        java.awt.Stroke stroke20 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = xYPlot0.getDomainAxisEdge(0);
        org.jfree.chart.plot.Marker marker23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleEdge22);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot4.getDomainMarkers(layer14);
        int int16 = categoryPlot4.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot4.getRangeAxisForDataset(15);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(valueAxis18);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = xYPlot0.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setRangeAxis((int) (short) 10, valueAxis9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot15.getRowRenderingOrder();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke21 = xYPlot20.getDomainZeroBaselineStroke();
        java.util.List list22 = xYPlot20.getAnnotations();
        categoryPlot15.drawRangeGridlines(graphics2D18, rectangle2D19, list22);
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot15.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.data.xy.XYDataset xYDataset31 = xYPlot26.getDataset((int) (short) 0);
        java.awt.Paint paint32 = xYPlot26.getOutlinePaint();
        xYPlot26.setDomainZeroBaselineVisible(true);
        xYPlot26.setDomainCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotOrientation plotOrientation37 = xYPlot26.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation25, plotOrientation37);
        xYPlot0.setOrientation(plotOrientation37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNull(xYDataset31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(plotOrientation37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, (int) 'a', layer10);
        double double12 = xYPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        int int11 = categoryPlot4.getWeight();
        java.awt.Paint paint12 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.clearAnnotations();
        categoryPlot4.setForegroundAlpha((float) (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        boolean boolean2 = xYPlot0.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(valueAxis3);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        xYPlot0.setDomainAxis((int) (short) 100, valueAxis4);
        org.junit.Assert.assertNull(valueAxis2);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot4.setRenderers(categoryItemRendererArray9);
        java.util.List list11 = categoryPlot4.getAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxisForDataset((int) (short) 10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent14 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent14);
        boolean boolean16 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot4.getDomainMarkers(layer17);
        boolean boolean19 = categoryPlot4.isRangeCrosshairVisible();
        boolean boolean20 = categoryPlot4.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray9, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke5 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot6.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke12 = xYPlot6.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace15 = xYPlot0.getFixedRangeAxisSpace();
        java.awt.Paint paint16 = xYPlot0.getDomainGridlinePaint();
        boolean boolean17 = xYPlot0.isOutlineVisible();
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(axisSpace14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRenderer(100);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setDomainAxis(valueAxis9);
        int int11 = xYPlot4.getDomainAxisCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYItemRenderer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        boolean boolean8 = categoryPlot4.isRangeZoomable();
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot4.setDataset((int) ' ', categoryDataset12);
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = categoryPlot4.removeDomainMarker(98, marker17, layer18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis((int) (short) 0, valueAxis8);
        java.awt.Stroke stroke10 = xYPlot0.getRangeGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = xYPlot0.getRendererForDataset(xYDataset11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(xYItemRenderer12);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        int int9 = xYPlot0.getDatasetCount();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        xYPlot0.rendererChanged(rendererChangeEvent13);
        xYPlot0.setWeight((int) (short) -1);
        boolean boolean17 = xYPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        categoryPlot4.setDomainGridlinesVisible(false);
        categoryPlot4.setRangeCrosshairValue((double) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot4.setDataset(categoryDataset14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot4.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = categoryPlot4.removeDomainMarker(marker18, layer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot8.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = xYPlot8.getDrawingSupplier();
        java.awt.geom.Point2D point2D14 = xYPlot8.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo7, point2D14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis17);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot0.getRangeAxisLocation();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        int int21 = xYPlot0.getIndexOf(xYItemRenderer20);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.clearDomainMarkers((int) '4');
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot4.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot18.getAxisOffset();
        java.awt.Image image23 = categoryPlot18.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot18.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        double double27 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot26.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot26.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot32 = xYPlot26.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        xYPlot33.drawZeroRangeBaseline(graphics2D34, rectangle2D35);
        org.jfree.data.xy.XYDataset xYDataset38 = xYPlot33.getDataset((int) (short) 0);
        java.awt.Paint paint39 = xYPlot33.getOutlinePaint();
        xYPlot26.setRangeCrosshairPaint(paint39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot26.setInsets(rectangleInsets41);
        categoryPlot18.setAxisOffset(rectangleInsets41);
        java.awt.Stroke stroke44 = categoryPlot18.getRangeCrosshairStroke();
        categoryPlot4.setOutlineStroke(stroke44);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        categoryPlot4.drawBackgroundImage(graphics2D46, rectangle2D47);
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        categoryPlot4.drawBackgroundImage(graphics2D49, rectangle2D50);
        org.jfree.chart.plot.Marker marker53 = null;
        org.jfree.chart.util.Layer layer54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = categoryPlot4.removeRangeMarker(11, marker53, layer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(xYDataset38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot7.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot13 = xYPlot7.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot7.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot7.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke17 = xYPlot16.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        int int19 = xYPlot16.getRangeAxisIndex(valueAxis18);
        xYPlot16.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        double double25 = xYPlot24.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis27 = xYPlot24.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = xYPlot24.getDrawingSupplier();
        java.awt.geom.Point2D point2D30 = xYPlot24.getQuadrantOrigin();
        xYPlot16.zoomRangeAxes((double) (short) 10, plotRenderingInfo23, point2D30);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = xYPlot16.getDomainMarkers(layer32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot16.getRangeAxisLocation(100);
        xYPlot7.setRangeAxisLocation(axisLocation35);
        xYPlot0.setDomainAxisLocation(axisLocation35);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        xYPlot0.setDomainAxis(valueAxis38);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(point2D30);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        java.util.List list9 = categoryPlot4.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot4.getDataset((int) (byte) -1);
        java.util.List list12 = categoryPlot4.getCategories();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        boolean boolean10 = xYPlot0.isDomainGridlinesVisible();
        boolean boolean11 = xYPlot0.isSubplot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        xYPlot0.drawAnnotations(graphics2D14, rectangle2D15, plotRenderingInfo16);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        categoryPlot4.setRangeAxisLocation(10, axisLocation10);
        float float12 = categoryPlot4.getBackgroundAlpha();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot13.drawZeroRangeBaseline(graphics2D14, rectangle2D15);
        org.jfree.data.xy.XYDataset xYDataset18 = xYPlot13.getDataset((int) (short) 0);
        java.awt.Paint paint19 = xYPlot13.getOutlinePaint();
        int int20 = xYPlot13.getSeriesCount();
        xYPlot13.setWeight((int) ' ');
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        xYPlot24.drawZeroRangeBaseline(graphics2D25, rectangle2D26);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot24.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot24.getRangeAxisLocation();
        xYPlot13.setRangeAxisLocation(10, axisLocation30, true);
        org.jfree.data.xy.XYDataset xYDataset34 = null;
        xYPlot13.setDataset(1, xYDataset34);
        java.awt.Paint paint36 = xYPlot13.getDomainCrosshairPaint();
        categoryPlot4.setDomainGridlinePaint(paint36);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(xYDataset18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke5 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot6.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke12 = xYPlot6.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace15 = xYPlot0.getFixedRangeAxisSpace();
        java.awt.Paint paint16 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot0.getRangeAxisLocation((int) (short) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot0.setRenderer(xYItemRenderer19);
        java.awt.Image image21 = xYPlot0.getBackgroundImage();
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(axisSpace14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot5.getDomainAxis(10);
        xYPlot5.configureDomainAxes();
        java.awt.Paint paint9 = xYPlot5.getDomainCrosshairPaint();
        categoryPlot4.setRangeGridlinePaint(paint9);
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot4.getFixedRangeAxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot4.getRangeAxis((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot4.getRangeAxisEdge((-1));
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setDomainAxis(valueAxis8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot4.calculateAxisSpace(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisSpace11);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers((int) (short) -1, layer6);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = xYPlot0.getDataRange(valueAxis9);
        xYPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xYPlot0.removeAnnotation(xYAnnotation13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot4.getRangeMarkers(0, layer9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot4.getRowRenderingOrder();
        float float12 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.plot.Marker marker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot4.removeRangeMarker(marker15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRenderer(100);
        int int9 = xYPlot4.getWeight();
        java.awt.Paint paint10 = xYPlot4.getDomainTickBandPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYItemRenderer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        xYPlot0.clearRangeMarkers();
        org.jfree.data.xy.XYDataset xYDataset2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = null;
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot(xYDataset2, valueAxis3, valueAxis4, xYItemRenderer5);
        xYPlot6.clearDomainMarkers();
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        xYPlot6.setDataset(xYDataset8);
        java.awt.Paint paint10 = xYPlot6.getRangeCrosshairPaint();
        xYPlot0.setDomainGridlinePaint(paint10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.data.Range range13 = xYPlot0.getDataRange(valueAxis12);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        java.awt.Paint paint7 = xYPlot4.getRangeCrosshairPaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        xYPlot4.drawAnnotations(graphics2D8, rectangle2D9, plotRenderingInfo10);
        xYPlot4.zoom((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis((int) (short) 0, valueAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot13.getDomainAxisEdge();
        categoryPlot13.configureDomainAxes();
        java.awt.Paint paint18 = categoryPlot13.getDomainGridlinePaint();
        xYPlot8.setNoDataMessagePaint(paint18);
        xYPlot0.setDomainTickBandPaint(paint18);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot25 = xYPlot21.getRootPlot();
        xYPlot21.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        categoryPlot31.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = categoryPlot31.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = categoryPlot31.getDatasetRenderingOrder();
        xYPlot21.setDatasetRenderingOrder(datasetRenderingOrder36);
        xYPlot0.setDatasetRenderingOrder(datasetRenderingOrder36);
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = xYPlot0.getRangeMarkers(15, layer40);
        org.jfree.chart.plot.Marker marker43 = null;
        org.jfree.chart.util.Layer layer44 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (short) 0, marker43, layer44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertNull(collection41);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray10 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis9 };
        categoryPlot4.setDomainAxes(categoryAxisArray10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot4.setRangeAxis(10, valueAxis13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot4.calculateAxisSpace(graphics2D15, rectangle2D16);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = categoryPlot4.removeRangeMarker((int) (short) 0, marker19, layer20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(axisSpace17);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean14 = categoryPlot4.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke16 = xYPlot15.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = xYPlot15.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot15.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation(axisLocation18, true);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot4.getRangeAxisLocation(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot4.setDomainAxis((int) '4', categoryAxis24, true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot11 = xYPlot7.getRootPlot();
        xYPlot7.clearRangeMarkers();
        boolean boolean13 = xYPlot7.isRangeCrosshairVisible();
        xYPlot7.mapDatasetToRangeAxis((int) (byte) 10, (int) '#');
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup23 = categoryPlot21.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot21.setRenderer(categoryItemRenderer24);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray27 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis26 };
        categoryPlot21.setDomainAxes(categoryAxisArray27);
        boolean boolean29 = categoryPlot21.isRangeCrosshairVisible();
        java.awt.Paint paint30 = categoryPlot21.getDomainGridlinePaint();
        xYPlot7.setRangeZeroBaselinePaint(paint30);
        xYPlot0.setQuadrantPaint(0, paint30);
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot0.getRangeAxisLocation((int) (short) 1);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(categoryAxisArray27);
        org.junit.Assert.assertArrayEquals(categoryAxisArray27, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis(100);
        java.awt.Paint paint6 = xYPlot0.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, (int) 'a', layer10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        int int9 = xYPlot0.getDatasetCount();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        xYPlot0.rendererChanged(rendererChangeEvent13);
        xYPlot0.setOutlineVisible(false);
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (short) 1, marker18, layer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        categoryPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot4.setRenderer((int) '4', categoryItemRenderer13);
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot4.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        boolean boolean6 = xYPlot0.isRangeZoomable();
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        boolean boolean8 = xYPlot0.isRangeZoomable();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        xYPlot0.drawAnnotations(graphics2D9, rectangle2D10, plotRenderingInfo11);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = xYPlot0.getDomainMarkers(layer13);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        int int16 = xYPlot0.indexOf(xYDataset15);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot5.getDomainAxis(10);
        xYPlot5.configureDomainAxes();
        java.awt.Paint paint9 = xYPlot5.getDomainCrosshairPaint();
        categoryPlot4.setRangeGridlinePaint(paint9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot4.getRenderer();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot4.getDomainAxisLocation();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot4.drawDomainGridlines(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = xYPlot0.getAxisOffset();
        java.awt.Image image4 = xYPlot0.getBackgroundImage();
        xYPlot0.setDomainCrosshairValue((double) (short) 10);
        int int7 = xYPlot0.getDomainAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        int int13 = categoryPlot12.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot12.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder16 = categoryPlot12.getDatasetRenderingOrder();
        categoryPlot12.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot12.setRenderer((int) '4', categoryItemRenderer21, true);
        boolean boolean24 = xYPlot0.equals((java.lang.Object) categoryPlot12);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot12.setDataset((int) (byte) 1, categoryDataset26);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(datasetRenderingOrder16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        xYPlot0.setRangeGridlinesVisible(true);
        int int18 = xYPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        int int7 = xYPlot0.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot12.setRenderer(categoryItemRenderer15);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis(categoryAxis17);
        categoryPlot12.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray25 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot24.setRangeAxes(valueAxisArray25);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot24.setRangeAxis(1, valueAxis28);
        java.awt.Paint paint30 = xYPlot24.getDomainGridlinePaint();
        categoryPlot12.setRangeCrosshairPaint(paint30);
        xYPlot0.setRangeZeroBaselinePaint(paint30);
        org.jfree.chart.plot.Marker marker33 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(valueAxisArray25);
        org.junit.Assert.assertArrayEquals(valueAxisArray25, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis(categoryAxis9);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxis((int) 'a');
        java.awt.Font font14 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot4.getRendererForDataset(categoryDataset15);
        java.awt.Stroke stroke17 = categoryPlot4.getDomainGridlineStroke();
        java.lang.String str18 = categoryPlot4.getPlotType();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Category Plot" + "'", str18, "Category Plot");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        java.awt.Image image9 = categoryPlot4.getBackgroundImage();
        java.awt.Paint paint10 = categoryPlot4.getDomainGridlinePaint();
        java.awt.Image image11 = categoryPlot4.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot4.setDomainAxis(98, categoryAxis13);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = categoryPlot4.removeDomainMarker((int) '4', marker16, layer17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = xYPlot0.getDrawingSupplier();
        xYPlot0.zoom((double) 1L);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.axis.AxisSpace axisSpace15 = xYPlot0.calculateAxisSpace(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(axisSpace15);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder16);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot4.getDomainAxisEdge(0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot4.setRenderer(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(rectangleEdge19);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        categoryPlot4.addChangeListener(plotChangeListener8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot4.getRenderer((int) (byte) 100);
        java.util.List list12 = categoryPlot4.getAnnotations();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        boolean boolean7 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.setRangeCrosshairValue((double) 10.0f);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        xYPlot0.zoomRangeAxes((double) 1, plotRenderingInfo7, point2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot14.setRenderer(categoryItemRenderer17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot14.setDomainAxis(categoryAxis19);
        categoryPlot14.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot14.getDomainAxis((int) 'a');
        java.awt.Font font24 = categoryPlot14.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot14.getRendererForDataset(categoryDataset25);
        java.awt.Stroke stroke27 = categoryPlot14.getDomainGridlineStroke();
        xYPlot0.setDomainGridlineStroke(stroke27);
        xYPlot0.clearRangeAxes();
        xYPlot0.setRangeZeroBaselineVisible(true);
        java.lang.String str32 = xYPlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "XY Plot" + "'", str32, "XY Plot");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setRangeAxes(valueAxisArray5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot4.setRangeAxis(1, valueAxis8);
        java.awt.Paint paint10 = xYPlot4.getDomainGridlinePaint();
        java.awt.Paint paint11 = xYPlot4.getRangeZeroBaselinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot16.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot16.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot16.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) ' ', categoryAxis21);
        categoryPlot16.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot16.getDomainAxisForDataset(0);
        java.awt.Paint paint27 = categoryPlot16.getDomainGridlinePaint();
        xYPlot4.setRangeGridlinePaint(paint27);
        java.awt.Stroke stroke29 = xYPlot4.getOutlineStroke();
        xYPlot4.setDomainCrosshairVisible(false);
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        int int11 = categoryPlot4.getWeight();
        boolean boolean12 = categoryPlot4.isRangeCrosshairVisible();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setOutlineStroke(stroke13);
        boolean boolean15 = categoryPlot4.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        xYPlot10.drawZeroRangeBaseline(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = xYPlot10.getOrientation();
        categoryPlot4.setOrientation(plotOrientation14);
        org.junit.Assert.assertNotNull(plotOrientation14);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot8.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = xYPlot8.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint15 = xYPlot14.getBackgroundPaint();
        xYPlot8.setRangeZeroBaselinePaint(paint15);
        categoryPlot4.setBackgroundPaint(paint15);
        boolean boolean18 = categoryPlot4.isDomainZoomable();
        java.awt.Paint paint19 = categoryPlot4.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        xYPlot0.zoomDomainAxes((double) 1L, (double) (byte) 0, plotRenderingInfo4, point2D5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot0.zoomRangeAxes((double) 10, 0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot0.setRenderer(xYItemRenderer12);
        boolean boolean14 = xYPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisSpace axisSpace15 = xYPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot4.drawDomainGridlines(graphics2D10, rectangle2D11);
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot4.getDomainMarkers(layer14);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot5.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot5.getDomainAxisEdge();
        categoryPlot5.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot5.getDomainGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot0.rendererChanged(rendererChangeEvent12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        xYPlot0.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = xYPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(drawingSupplier16);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot7.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot13 = xYPlot7.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot7.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot7.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke17 = xYPlot16.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        int int19 = xYPlot16.getRangeAxisIndex(valueAxis18);
        xYPlot16.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        double double25 = xYPlot24.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis27 = xYPlot24.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = xYPlot24.getDrawingSupplier();
        java.awt.geom.Point2D point2D30 = xYPlot24.getQuadrantOrigin();
        xYPlot16.zoomRangeAxes((double) (short) 10, plotRenderingInfo23, point2D30);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = xYPlot16.getDomainMarkers(layer32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot16.getRangeAxisLocation(100);
        xYPlot7.setRangeAxisLocation(axisLocation35);
        xYPlot0.setDomainAxisLocation(axisLocation35);
        org.jfree.chart.util.Layer layer38 = null;
        java.util.Collection collection39 = xYPlot0.getRangeMarkers(layer38);
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        xYPlot0.drawBackgroundImage(graphics2D40, rectangle2D41);
        java.awt.geom.Point2D point2D43 = xYPlot0.getQuadrantOrigin();
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(point2D30);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNull(collection39);
        org.junit.Assert.assertNotNull(point2D43);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, 15, layer10);
        boolean boolean12 = xYPlot0.isRangeCrosshairVisible();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = xYPlot0.getRendererForDataset(xYDataset13);
        java.awt.Paint paint15 = xYPlot0.getDomainTickBandPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(xYItemRenderer14);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        int int10 = categoryPlot9.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot9.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot9.getDatasetRenderingOrder();
        categoryPlot9.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot9.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets17);
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xYPlot0.removeRangeMarker(11, marker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        java.awt.Paint paint10 = xYPlot0.getRangeZeroBaselinePaint();
        xYPlot0.setRangeZeroBaselineVisible(true);
        java.awt.Image image13 = xYPlot0.getBackgroundImage();
        java.awt.geom.Point2D point2D14 = xYPlot0.getQuadrantOrigin();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        xYPlot0.setDomainCrosshairValue(1.0d);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setRangeAxes(valueAxisArray5);
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = xYPlot0.getFixedLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        xYPlot10.drawZeroRangeBaseline(graphics2D11, rectangle2D12);
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot10.getDomainAxisLocation((int) (short) 100);
        xYPlot0.setRangeAxisLocation(0, axisLocation15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot7.getDataset((int) (short) 0);
        java.awt.Paint paint13 = xYPlot7.getOutlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot0.setInsets(rectangleInsets15);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = xYPlot0.getRangeMarkers(layer17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.util.Layer layer22 = null;
        xYPlot0.drawRangeMarkers(graphics2D19, rectangle2D20, 15, layer22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        categoryPlot28.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = categoryPlot28.getAxisOffset();
        xYPlot0.setAxisOffset(rectangleInsets32);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        xYPlot0.setRenderer((int) (byte) 1, xYItemRenderer35, true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        boolean boolean6 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = xYPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRenderer(1);
        xYPlot0.mapDatasetToDomainAxis((int) (short) -1, (int) '#');
        boolean boolean17 = xYPlot0.isDomainZoomable();
        xYPlot0.configureDomainAxes();
        boolean boolean19 = xYPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        boolean boolean16 = categoryPlot13.isDomainZoomable();
        java.awt.Font font17 = categoryPlot13.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray18 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot13.setRenderers(categoryItemRendererArray18);
        categoryPlot4.setRenderers(categoryItemRendererArray18);
        categoryPlot4.clearRangeMarkers((-1));
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.axis.AxisSpace axisSpace25 = categoryPlot4.calculateAxisSpace(graphics2D23, rectangle2D24);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot4.getFixedLegendItems();
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(axisSpace25);
        org.junit.Assert.assertNull(legendItemCollection26);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        int int9 = xYPlot0.indexOf(xYDataset8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        int int11 = xYPlot0.getDomainAxisIndex(valueAxis10);
        boolean boolean12 = xYPlot0.isRangeGridlinesVisible();
        float float13 = xYPlot0.getBackgroundImageAlpha();
        java.awt.Paint paint14 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke15 = xYPlot0.getDomainZeroBaselineStroke();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.util.Layer layer19 = null;
        xYPlot0.drawDomainMarkers(graphics2D16, rectangle2D17, 0, layer19);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        xYPlot0.setDomainAxis((int) (short) 1, valueAxis22);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis(100);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = categoryPlot10.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot10.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot10.getDomainAxisEdge();
        categoryPlot10.configureDomainAxes();
        java.awt.Stroke stroke15 = categoryPlot10.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke15);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        java.awt.Font font19 = xYPlot0.getNoDataMessageFont();
        java.awt.Paint paint20 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.setRangeCrosshairValue((double) 100.0f, true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(paint20);
    }
}

