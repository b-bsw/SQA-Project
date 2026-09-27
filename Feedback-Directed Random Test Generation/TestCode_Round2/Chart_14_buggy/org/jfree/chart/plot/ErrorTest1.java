package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = xYPlot0.getDrawingSupplier();
        java.awt.Stroke stroke8 = xYPlot0.getDomainZeroBaselineStroke();
        java.awt.geom.Point2D point2D9 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder10 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot15.getDomainAxisEdge();
        categoryPlot15.configureDomainAxes();
        float float20 = categoryPlot15.getBackgroundAlpha();
        categoryPlot15.setNoDataMessage("");
        float float23 = categoryPlot15.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation((int) (byte) 0);
        xYPlot0.setDomainAxisLocation(axisLocation25, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier6 and drawingSupplier16", drawingSupplier6.equals(drawingSupplier16) ? drawingSupplier6.hashCode() == drawingSupplier16.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        categoryPlot30.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = categoryPlot30.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset35, categoryAxis36, valueAxis37, categoryItemRenderer38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = categoryPlot39.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup41 = categoryPlot39.getDatasetGroup();
        boolean boolean42 = categoryPlot39.isDomainZoomable();
        java.awt.Font font43 = categoryPlot39.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray44 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot39.setRenderers(categoryItemRendererArray44);
        categoryPlot30.setRenderers(categoryItemRendererArray44);
        categoryPlot30.setAnchorValue((double) (-1L), true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent50 = null;
        categoryPlot30.rendererChanged(rendererChangeEvent50);
        org.jfree.chart.LegendItemCollection legendItemCollection52 = categoryPlot30.getLegendItems();
        categoryPlot4.setFixedLegendItems(legendItemCollection52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot39", categoryPlot4.equals(categoryPlot39) ? categoryPlot4.hashCode() == categoryPlot39.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot4.getDataRange(valueAxis10);
        int int12 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        double double15 = xYPlot14.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.util.List list18 = null;
        xYPlot14.drawDomainGridlines(graphics2D16, rectangle2D17, list18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot14.zoomRangeAxes((double) 1, plotRenderingInfo21, point2D22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = categoryPlot28.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup30 = categoryPlot28.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot28.setRenderer(categoryItemRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        categoryPlot28.setDomainAxis(categoryAxis33);
        categoryPlot28.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = categoryPlot28.getDomainAxis((int) 'a');
        java.awt.Font font38 = categoryPlot28.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot28.getRendererForDataset(categoryDataset39);
        java.awt.Stroke stroke41 = categoryPlot28.getDomainGridlineStroke();
        xYPlot14.setDomainGridlineStroke(stroke41);
        categoryPlot4.setDomainGridlineStroke(stroke41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot28", categoryPlot4.equals(categoryPlot28) ? categoryPlot4.hashCode() == categoryPlot28.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint38 = xYPlot37.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        xYPlot37.zoomDomainAxes((double) 1L, (double) (byte) 0, plotRenderingInfo41, point2D42);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        xYPlot37.drawAnnotations(graphics2D44, rectangle2D45, plotRenderingInfo46);
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.axis.AxisSpace axisSpace50 = xYPlot37.calculateAxisSpace(graphics2D48, rectangle2D49);
        org.jfree.chart.axis.AxisSpace axisSpace51 = categoryPlot4.calculateRangeAxisSpace(graphics2D35, rectangle2D36, axisSpace50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot18 and xYPlot37", xYPlot18.equals(xYPlot37) ? xYPlot18.hashCode() == xYPlot37.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = categoryPlot28.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup30 = categoryPlot28.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot28.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder32 = categoryPlot28.getColumnRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot28", categoryPlot4.equals(categoryPlot28) ? categoryPlot4.hashCode() == categoryPlot28.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        java.awt.Image image9 = categoryPlot4.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot4.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        double double13 = xYPlot12.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot12.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot12.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot18 = xYPlot12.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        xYPlot19.drawZeroRangeBaseline(graphics2D20, rectangle2D21);
        org.jfree.data.xy.XYDataset xYDataset24 = xYPlot19.getDataset((int) (short) 0);
        java.awt.Paint paint25 = xYPlot19.getOutlinePaint();
        xYPlot12.setRangeCrosshairPaint(paint25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot12.setInsets(rectangleInsets27);
        categoryPlot4.setAxisOffset(rectangleInsets27);
        java.awt.Stroke stroke30 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        xYPlot31.drawZeroRangeBaseline(graphics2D32, rectangle2D33);
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot31.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation37 = xYPlot31.getRangeAxisLocation();
        categoryPlot4.setRangeAxisLocation(axisLocation37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot19 and xYPlot31", xYPlot19.equals(xYPlot31) ? xYPlot19.hashCode() == xYPlot31.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        java.lang.Object obj6 = categoryPlot4.clone();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.data.Range range8 = categoryPlot4.getDataRange(valueAxis7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and obj6", categoryPlot4.equals(obj6) ? categoryPlot4.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot18.getAxisOffset();
        java.awt.Image image23 = categoryPlot18.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot18.getDataset((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        java.awt.Paint paint31 = categoryPlot30.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        xYPlot32.drawZeroRangeBaseline(graphics2D33, rectangle2D34);
        org.jfree.data.xy.XYDataset xYDataset37 = xYPlot32.getDataset((int) (short) 0);
        boolean boolean38 = xYPlot32.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        xYPlot32.drawBackgroundImage(graphics2D39, rectangle2D40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.axis.AxisSpace axisSpace44 = null;
        org.jfree.chart.axis.AxisSpace axisSpace45 = xYPlot32.calculateDomainAxisSpace(graphics2D42, rectangle2D43, axisSpace44);
        categoryPlot30.setFixedDomainAxisSpace(axisSpace45, false);
        categoryPlot18.setFixedDomainAxisSpace(axisSpace45);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot18", categoryPlot4.equals(categoryPlot18) ? categoryPlot4.hashCode() == categoryPlot18.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        categoryPlot4.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot4.getDomainAxisForDataset((int) ' ');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor19 = categoryPlot4.getDomainGridlinePosition();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke21 = xYPlot20.getDomainZeroBaselineStroke();
        java.util.List list22 = xYPlot20.getAnnotations();
        xYPlot20.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        xYPlot20.setRangeAxis(valueAxis25);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot20.setDomainAxis((int) 'a', valueAxis28);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        xYPlot20.setDomainAxis(valueAxis30);
        xYPlot20.mapDatasetToDomainAxis((int) (byte) 10, (int) '#');
        java.awt.Paint paint36 = xYPlot20.getQuadrantPaint(1);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        categoryPlot43.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = categoryPlot43.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder48 = categoryPlot43.getDatasetRenderingOrder();
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = categoryPlot43.getDomainAxisEdge();
        java.util.List list50 = categoryPlot43.getAnnotations();
        xYPlot20.drawDomainTickBands(graphics2D37, rectangle2D38, list50);
        java.awt.Graphics2D graphics2D52 = null;
        java.awt.geom.Rectangle2D rectangle2D53 = null;
        org.jfree.chart.util.Layer layer55 = null;
        xYPlot20.drawDomainMarkers(graphics2D52, rectangle2D53, (int) (byte) 10, layer55);
        org.jfree.chart.plot.XYPlot xYPlot57 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent58 = null;
        xYPlot57.rendererChanged(rendererChangeEvent58);
        java.awt.Paint paint60 = xYPlot57.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge61 = xYPlot57.getRangeAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = null;
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer65 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot66 = new org.jfree.chart.plot.CategoryPlot(categoryDataset62, categoryAxis63, valueAxis64, categoryItemRenderer65);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier67 = categoryPlot66.getDrawingSupplier();
        java.awt.Stroke stroke68 = categoryPlot66.getRangeGridlineStroke();
        xYPlot57.setRangeGridlineStroke(stroke68);
        xYPlot20.setRangeCrosshairStroke(stroke68);
        categoryPlot4.setRangeCrosshairStroke(stroke68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot66.", categoryPlot4.equals(categoryPlot66) == categoryPlot66.equals(categoryPlot4));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        java.awt.Stroke stroke26 = xYPlot25.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder27 = xYPlot25.getDatasetRenderingOrder();
        categoryPlot4.setDatasetRenderingOrder(datasetRenderingOrder27);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot4.getDomainMarkers(layer29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke34 = xYPlot33.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder35 = xYPlot33.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup42 = categoryPlot40.getDatasetGroup();
        boolean boolean43 = categoryPlot40.isDomainZoomable();
        boolean boolean44 = categoryPlot40.isRangeZoomable();
        categoryPlot40.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        categoryPlot40.setDataset((int) ' ', categoryDataset48);
        java.awt.Stroke stroke50 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot40.setDomainGridlineStroke(stroke50);
        xYPlot33.setDomainZeroBaselineStroke(stroke50);
        java.awt.geom.Point2D point2D53 = xYPlot33.getQuadrantOrigin();
        xYPlot33.setRangeCrosshairValue((double) (byte) 1);
        xYPlot33.setDomainZeroBaselineVisible(true);
        xYPlot33.setDomainCrosshairValue((double) (-1L));
        org.jfree.chart.plot.XYPlot xYPlot60 = new org.jfree.chart.plot.XYPlot();
        double double61 = xYPlot60.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis63 = xYPlot60.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis65 = xYPlot60.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot66 = xYPlot60.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot67 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D68 = null;
        java.awt.geom.Rectangle2D rectangle2D69 = null;
        xYPlot67.drawZeroRangeBaseline(graphics2D68, rectangle2D69);
        org.jfree.data.xy.XYDataset xYDataset72 = xYPlot67.getDataset((int) (short) 0);
        java.awt.Paint paint73 = xYPlot67.getOutlinePaint();
        xYPlot60.setRangeCrosshairPaint(paint73);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo76 = null;
        java.awt.geom.Point2D point2D77 = null;
        xYPlot60.zoomDomainAxes((double) 0L, plotRenderingInfo76, point2D77);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder79 = xYPlot60.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D80 = null;
        java.awt.geom.Rectangle2D rectangle2D81 = null;
        org.jfree.chart.axis.AxisSpace axisSpace82 = xYPlot60.calculateAxisSpace(graphics2D80, rectangle2D81);
        java.awt.Graphics2D graphics2D83 = null;
        java.awt.geom.Rectangle2D rectangle2D84 = null;
        org.jfree.chart.axis.AxisSpace axisSpace85 = xYPlot60.calculateAxisSpace(graphics2D83, rectangle2D84);
        xYPlot33.setFixedDomainAxisSpace(axisSpace85, false);
        org.jfree.chart.axis.AxisSpace axisSpace88 = categoryPlot4.calculateDomainAxisSpace(graphics2D31, rectangle2D32, axisSpace85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot40", categoryPlot4.equals(categoryPlot40) ? categoryPlot4.hashCode() == categoryPlot40.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        org.jfree.chart.axis.AxisLocation axisLocation17 = xYPlot0.getDomainAxisLocation(0);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        double double19 = xYPlot18.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot18.getDomainAxis(1);
        xYPlot18.setDomainCrosshairValue((double) 100.0f, false);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot31.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup33 = categoryPlot31.getDatasetGroup();
        boolean boolean34 = categoryPlot31.isDomainZoomable();
        java.awt.Font font35 = categoryPlot31.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray36 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot31.setRenderers(categoryItemRendererArray36);
        java.util.List list38 = categoryPlot31.getAnnotations();
        xYPlot18.drawDomainGridlines(graphics2D25, rectangle2D26, list38);
        org.jfree.chart.plot.PlotOrientation plotOrientation40 = xYPlot18.getOrientation();
        xYPlot0.setOrientation(plotOrientation40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier13 and drawingSupplier32", drawingSupplier13.equals(drawingSupplier32) ? drawingSupplier13.hashCode() == drawingSupplier32.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot4.getAxisOffset();
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
        int int36 = xYPlot21.getRangeAxisCount();
        xYPlot21.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = categoryPlot42.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder44 = categoryPlot42.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation45 = categoryPlot42.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        categoryPlot42.setDomainAxis((int) ' ', categoryAxis47);
        categoryPlot42.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = categoryPlot42.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation53 = categoryPlot42.getRangeAxisLocation();
        xYPlot21.setRangeAxisLocation(axisLocation53, true);
        categoryPlot4.setDomainAxisLocation(axisLocation53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot13 and categoryPlot42", categoryPlot13.equals(categoryPlot42) ? categoryPlot13.hashCode() == categoryPlot42.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        xYPlot0.setDomainAxis(15, valueAxis37);
        org.jfree.chart.LegendItemCollection legendItemCollection39 = xYPlot0.getFixedLegendItems();
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke41 = xYPlot40.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        int int43 = xYPlot40.getRangeAxisIndex(valueAxis42);
        xYPlot40.clearAnnotations();
        org.jfree.chart.plot.Plot plot45 = xYPlot40.getRootPlot();
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        xYPlot40.drawAnnotations(graphics2D46, rectangle2D47, plotRenderingInfo48);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot7 and xYPlot40", xYPlot7.equals(xYPlot40) ? xYPlot7.hashCode() == xYPlot40.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot7.getDomainAxisLocation((int) (short) 100);
        xYPlot0.setDomainAxisLocation(axisLocation12);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = xYPlot0.getRenderer(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        xYPlot0.axisChanged(axisChangeEvent16);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke19 = xYPlot18.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        double double21 = xYPlot20.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot20.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot20.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot26 = xYPlot20.getRootPlot();
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = xYPlot20.getDomainMarkers(layer27);
        xYPlot20.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        int int35 = categoryPlot34.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = categoryPlot34.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder38 = categoryPlot34.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = categoryPlot43.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup45 = categoryPlot43.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge46 = categoryPlot43.getDomainAxisEdge();
        categoryPlot43.configureDomainAxes();
        java.awt.Paint paint48 = categoryPlot43.getDomainGridlinePaint();
        categoryPlot34.setNoDataMessagePaint(paint48);
        xYPlot20.setBackgroundPaint(paint48);
        xYPlot18.setRangeGridlinePaint(paint48);
        xYPlot0.setDomainTickBandPaint(paint48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot7 and xYPlot18", xYPlot7.equals(xYPlot18) ? xYPlot7.hashCode() == xYPlot18.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot4.getRangeMarkers(10, layer16);
        java.lang.Object obj18 = categoryPlot4.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        double double25 = xYPlot21.getDomainCrosshairValue();
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = xYPlot21.getRangeAxisEdge((int) '#');
        double double28 = xYPlot21.getDomainCrosshairValue();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        xYPlot21.drawBackgroundImage(graphics2D29, rectangle2D30);
        java.awt.geom.Point2D point2D32 = xYPlot21.getQuadrantOrigin();
        categoryPlot4.zoomDomainAxes((double) 10, plotRenderingInfo20, point2D32, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and obj18", categoryPlot4.equals(obj18) ? categoryPlot4.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        java.awt.Paint paint31 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis33, valueAxis34, categoryItemRenderer35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot36.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup38 = categoryPlot36.getDatasetGroup();
        boolean boolean39 = categoryPlot36.isDomainZoomable();
        java.awt.Font font40 = categoryPlot36.getNoDataMessageFont();
        org.jfree.chart.util.SortOrder sortOrder41 = categoryPlot36.getRowRenderingOrder();
        categoryPlot4.setRowRenderingOrder(sortOrder41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot36", categoryPlot4.equals(categoryPlot36) ? categoryPlot4.hashCode() == categoryPlot36.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        categoryPlot4.setDomainGridlinesVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot4.setRenderer(10, categoryItemRenderer24, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot4.getAxisOffset();
        double double28 = categoryPlot4.getAnchorValue();
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        double double30 = xYPlot29.getRangeCrosshairValue();
        java.awt.Image image31 = null;
        xYPlot29.setBackgroundImage(image31);
        org.jfree.chart.axis.ValueAxis valueAxis34 = xYPlot29.getDomainAxis(100);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset35, categoryAxis36, valueAxis37, categoryItemRenderer38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = categoryPlot39.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup41 = categoryPlot39.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = categoryPlot39.getDomainAxisEdge();
        categoryPlot39.configureDomainAxes();
        java.awt.Stroke stroke44 = categoryPlot39.getDomainGridlineStroke();
        xYPlot29.setRangeZeroBaselineStroke(stroke44);
        xYPlot29.setDomainCrosshairLockedOnData(true);
        java.awt.Font font48 = xYPlot29.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = xYPlot29.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot13 and categoryPlot39", categoryPlot13.equals(categoryPlot39) ? categoryPlot13.hashCode() == categoryPlot39.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setDomainGridlinesVisible(false);
        java.lang.Object obj11 = xYPlot0.clone();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        xYPlot0.setDataset((int) '4', xYDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and obj11", xYPlot0.equals(obj11) ? xYPlot0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = xYPlot0.getDrawingSupplier();
        xYPlot0.setDomainCrosshairVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        categoryPlot14.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot14.getAxisOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot14.getInsets();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke21 = xYPlot20.getDomainZeroBaselineStroke();
        java.util.List list22 = xYPlot20.getAnnotations();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D23, rectangle2D24);
        java.lang.String str26 = xYPlot20.getPlotType();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot20.setRangeAxes(valueAxisArray27);
        categoryPlot14.setRangeAxes(valueAxisArray27);
        xYPlot0.setDomainAxes(valueAxisArray27);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot35.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup37 = categoryPlot35.getDatasetGroup();
        boolean boolean38 = categoryPlot35.isDomainZoomable();
        java.awt.Font font39 = categoryPlot35.getNoDataMessageFont();
        java.awt.Paint paint40 = categoryPlot35.getOutlinePaint();
        xYPlot0.setDomainTickBandPaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier6 and drawingSupplier36", drawingSupplier6.equals(drawingSupplier36) ? drawingSupplier6.hashCode() == drawingSupplier36.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        categoryPlot4.mapDatasetToRangeAxis(0, (int) (short) 0);
        categoryPlot4.mapDatasetToRangeAxis(10, 98);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot25 = xYPlot21.getRootPlot();
        xYPlot21.clearRangeMarkers();
        boolean boolean27 = xYPlot21.isRangeCrosshairVisible();
        java.awt.Paint paint28 = xYPlot21.getRangeTickBandPaint();
        boolean boolean29 = xYPlot21.isDomainGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot30.drawZeroRangeBaseline(graphics2D31, rectangle2D32);
        boolean boolean34 = xYPlot30.isDomainCrosshairVisible();
        xYPlot30.setRangeCrosshairVisible(true);
        int int37 = xYPlot30.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = categoryPlot42.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup44 = categoryPlot42.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        categoryPlot42.setRenderer(categoryItemRenderer45);
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        categoryPlot42.setDomainAxis(categoryAxis47);
        categoryPlot42.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset50 = null;
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer53 = null;
        org.jfree.chart.plot.XYPlot xYPlot54 = new org.jfree.chart.plot.XYPlot(xYDataset50, valueAxis51, valueAxis52, xYItemRenderer53);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray55 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot54.setRangeAxes(valueAxisArray55);
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        xYPlot54.setRangeAxis(1, valueAxis58);
        java.awt.Paint paint60 = xYPlot54.getDomainGridlinePaint();
        categoryPlot42.setRangeCrosshairPaint(paint60);
        xYPlot30.setRangeZeroBaselinePaint(paint60);
        xYPlot21.setDomainTickBandPaint(paint60);
        categoryPlot4.setRangeGridlinePaint(paint60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier43", drawingSupplier5.equals(drawingSupplier43) ? drawingSupplier5.hashCode() == drawingSupplier43.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        java.lang.Object obj9 = categoryPlot4.clone();
        categoryPlot4.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and obj9", categoryPlot4.equals(obj9) ? categoryPlot4.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis(10);
        categoryPlot4.setForegroundAlpha((float) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot18.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup20 = categoryPlot18.getDatasetGroup();
        boolean boolean21 = categoryPlot18.isDomainZoomable();
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot18.getRangeMarkers(0, layer23);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent27 = null;
        xYPlot26.rendererChanged(rendererChangeEvent27);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        xYPlot26.setRangeAxis((int) '#', valueAxis30);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        xYPlot26.setRangeAxis(0, valueAxis33, true);
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot26.getDomainAxisLocation();
        categoryPlot18.setDomainAxisLocation((int) (short) 10, axisLocation36, false);
        categoryPlot4.setDomainAxisLocation(100, axisLocation36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier19", drawingSupplier5.equals(drawingSupplier19) ? drawingSupplier5.hashCode() == drawingSupplier19.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        xYPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge(10);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot8.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot14 = xYPlot8.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D16, rectangle2D17);
        org.jfree.data.xy.XYDataset xYDataset20 = xYPlot15.getDataset((int) (short) 0);
        java.awt.Paint paint21 = xYPlot15.getOutlinePaint();
        xYPlot8.setRangeCrosshairPaint(paint21);
        java.awt.Stroke stroke23 = xYPlot8.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.PlotOrientation plotOrientation24 = xYPlot8.getOrientation();
        xYPlot0.setOrientation(plotOrientation24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot15", xYPlot0.equals(xYPlot15) ? xYPlot0.hashCode() == xYPlot15.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        categoryPlot4.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot20.setDomainAxis(0, categoryAxis22, false);
        categoryPlot20.configureDomainAxes();
        java.awt.Stroke stroke26 = categoryPlot20.getDomainGridlineStroke();
        categoryPlot20.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean30 = categoryPlot20.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        boolean boolean35 = categoryPlot20.render(graphics2D31, rectangle2D32, (int) '#', plotRenderingInfo34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = categoryPlot20.getDatasetGroup();
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot20.setDomainAxes(categoryAxisArray37);
        categoryPlot4.setDomainAxes(categoryAxisArray37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot20.", categoryPlot4.equals(categoryPlot20) == categoryPlot20.equals(categoryPlot4));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
        categoryPlot4.setAnchorValue((double) 'a');
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        xYPlot22.drawZeroRangeBaseline(graphics2D23, rectangle2D24);
        boolean boolean26 = xYPlot22.isDomainCrosshairVisible();
        xYPlot22.setRangeCrosshairVisible(true);
        xYPlot22.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = categoryPlot34.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup36 = categoryPlot34.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot34.getDomainAxisEdge();
        categoryPlot34.configureDomainAxes();
        java.awt.Paint paint39 = categoryPlot34.getDomainGridlinePaint();
        java.awt.Paint paint40 = categoryPlot34.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        xYPlot41.drawZeroRangeBaseline(graphics2D42, rectangle2D43);
        org.jfree.data.xy.XYDataset xYDataset46 = xYPlot41.getDataset((int) (short) 0);
        boolean boolean47 = xYPlot41.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        xYPlot41.drawBackgroundImage(graphics2D48, rectangle2D49);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.axis.AxisSpace axisSpace53 = null;
        org.jfree.chart.axis.AxisSpace axisSpace54 = xYPlot41.calculateDomainAxisSpace(graphics2D51, rectangle2D52, axisSpace53);
        categoryPlot34.setFixedRangeAxisSpace(axisSpace54, false);
        xYPlot22.setFixedRangeAxisSpace(axisSpace54, true);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier35", drawingSupplier5.equals(drawingSupplier35) ? drawingSupplier5.hashCode() == drawingSupplier35.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot4.drawDomainGridlines(graphics2D7, rectangle2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot14.setDomainAxis((int) ' ', categoryAxis19);
        categoryPlot14.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot14.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot14.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation(axisLocation25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier15", drawingSupplier5.equals(drawingSupplier15) ? drawingSupplier5.hashCode() == drawingSupplier15.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        boolean boolean19 = categoryPlot4.render(graphics2D15, rectangle2D16, (int) '#', plotRenderingInfo18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = categoryPlot4.getDatasetGroup();
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
        categoryPlot25.clearDomainMarkers();
        categoryPlot25.mapDatasetToRangeAxis(10, (int) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis37 = categoryPlot25.getRangeAxis(100);
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        boolean boolean43 = xYPlot42.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection44 = xYPlot42.getLegendItems();
        categoryPlot25.setFixedLegendItems(legendItemCollection44);
        categoryPlot4.setFixedLegendItems(legendItemCollection44);
        categoryPlot4.setNoDataMessage("Category Plot");
        org.jfree.data.xy.XYDataset xYDataset49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer52 = null;
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot(xYDataset49, valueAxis50, valueAxis51, xYItemRenderer52);
        boolean boolean54 = xYPlot53.isRangeZoomable();
        java.lang.String str55 = xYPlot53.getNoDataMessage();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = xYPlot53.getRenderer(100);
        int int58 = xYPlot53.getWeight();
        java.awt.Paint paint59 = xYPlot53.getDomainGridlinePaint();
        categoryPlot4.setDomainGridlinePaint(paint59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot42 and xYPlot53", xYPlot42.equals(xYPlot53) ? xYPlot42.hashCode() == xYPlot53.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke10 = xYPlot9.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot9.getRangeAxisIndex(valueAxis11);
        xYPlot9.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        double double18 = xYPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot17.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = xYPlot17.getDrawingSupplier();
        java.awt.geom.Point2D point2D23 = xYPlot17.getQuadrantOrigin();
        xYPlot9.zoomRangeAxes((double) (short) 10, plotRenderingInfo16, point2D23);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = xYPlot9.getDomainMarkers(layer25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = xYPlot9.getRangeAxisLocation(100);
        xYPlot0.setRangeAxisLocation(axisLocation28);
        xYPlot0.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        double double32 = xYPlot31.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis34 = xYPlot31.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis35 = xYPlot31.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = xYPlot31.getDrawingSupplier();
        java.awt.geom.Point2D point2D37 = xYPlot31.getQuadrantOrigin();
        xYPlot0.setQuadrantOrigin(point2D37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot17 and xYPlot31", xYPlot17.equals(xYPlot31) ? xYPlot17.hashCode() == xYPlot31.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.clearAnnotations();
        java.awt.Paint paint5 = xYPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        double double7 = xYPlot6.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot6.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot10 = xYPlot6.getRootPlot();
        xYPlot6.clearRangeMarkers();
        boolean boolean12 = xYPlot6.isRangeCrosshairVisible();
        java.awt.Paint paint13 = xYPlot6.getRangeTickBandPaint();
        boolean boolean14 = xYPlot6.isDomainGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D16, rectangle2D17);
        boolean boolean19 = xYPlot15.isDomainCrosshairVisible();
        xYPlot15.setRangeCrosshairVisible(true);
        int int22 = xYPlot15.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis24, valueAxis25, categoryItemRenderer26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot27.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup29 = categoryPlot27.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot27.setRenderer(categoryItemRenderer30);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot27.setDomainAxis(categoryAxis32);
        categoryPlot27.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray40 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot39.setRangeAxes(valueAxisArray40);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        xYPlot39.setRangeAxis(1, valueAxis43);
        java.awt.Paint paint45 = xYPlot39.getDomainGridlinePaint();
        categoryPlot27.setRangeCrosshairPaint(paint45);
        xYPlot15.setRangeZeroBaselinePaint(paint45);
        xYPlot6.setDomainTickBandPaint(paint45);
        java.awt.Image image49 = xYPlot6.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = xYPlot6.getInsets();
        boolean boolean51 = xYPlot0.equals((java.lang.Object) xYPlot6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot39", xYPlot0.equals(xYPlot39) ? xYPlot0.hashCode() == xYPlot39.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        double double16 = xYPlot15.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot15.getDomainAxis(1);
        xYPlot15.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = xYPlot15.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        xYPlot15.setRangeAxis((int) (short) 10, valueAxis24);
        java.awt.Paint paint26 = xYPlot15.getDomainTickBandPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        categoryPlot31.setDomainAxis(0, categoryAxis33, false);
        categoryPlot31.setRangeCrosshairLockedOnData(true);
        double double38 = categoryPlot31.getAnchorValue();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        categoryPlot43.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = categoryPlot43.getAxisOffset();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        xYPlot50.drawZeroRangeBaseline(graphics2D51, rectangle2D52);
        org.jfree.data.xy.XYDataset xYDataset55 = xYPlot50.getDataset((int) (short) 0);
        boolean boolean56 = xYPlot50.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        xYPlot50.drawBackgroundImage(graphics2D57, rectangle2D58);
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        org.jfree.chart.axis.AxisSpace axisSpace62 = null;
        org.jfree.chart.axis.AxisSpace axisSpace63 = xYPlot50.calculateDomainAxisSpace(graphics2D60, rectangle2D61, axisSpace62);
        org.jfree.chart.axis.AxisSpace axisSpace64 = categoryPlot43.calculateDomainAxisSpace(graphics2D48, rectangle2D49, axisSpace62);
        categoryPlot31.setFixedRangeAxisSpace(axisSpace64);
        xYPlot15.setFixedRangeAxisSpace(axisSpace64, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo70 = null;
        org.jfree.chart.plot.XYPlot xYPlot71 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent72 = null;
        xYPlot71.rendererChanged(rendererChangeEvent72);
        java.awt.Paint paint74 = xYPlot71.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge75 = xYPlot71.getRangeAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset76 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis77 = null;
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer79 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot80 = new org.jfree.chart.plot.CategoryPlot(categoryDataset76, categoryAxis77, valueAxis78, categoryItemRenderer79);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier81 = categoryPlot80.getDrawingSupplier();
        java.awt.Stroke stroke82 = categoryPlot80.getRangeGridlineStroke();
        xYPlot71.setRangeGridlineStroke(stroke82);
        xYPlot71.setRangeGridlinesVisible(false);
        org.jfree.data.xy.XYDataset xYDataset86 = null;
        int int87 = xYPlot71.indexOf(xYDataset86);
        java.awt.geom.Point2D point2D88 = xYPlot71.getQuadrantOrigin();
        xYPlot15.zoomDomainAxes((-1.0d), (double) (short) 100, plotRenderingInfo70, point2D88);
        categoryPlot4.zoomDomainAxes((double) 100L, (double) '4', plotRenderingInfo14, point2D88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot80", categoryPlot4.equals(categoryPlot80) ? categoryPlot4.hashCode() == categoryPlot80.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.data.xy.XYDataset xYDataset23 = xYPlot18.getDataset((int) (short) 0);
        java.awt.Paint paint24 = xYPlot18.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent25 = null;
        xYPlot18.rendererChanged(rendererChangeEvent25);
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot18.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        xYPlot18.drawZeroDomainBaseline(graphics2D28, rectangle2D29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        categoryPlot35.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = categoryPlot35.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis41, valueAxis42, categoryItemRenderer43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = categoryPlot44.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup46 = categoryPlot44.getDatasetGroup();
        boolean boolean47 = categoryPlot44.isDomainZoomable();
        java.awt.Font font48 = categoryPlot44.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray49 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot44.setRenderers(categoryItemRendererArray49);
        categoryPlot35.setRenderers(categoryItemRendererArray49);
        categoryPlot35.setAnchorValue((double) (-1L), true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent55 = null;
        categoryPlot35.rendererChanged(rendererChangeEvent55);
        org.jfree.chart.LegendItemCollection legendItemCollection57 = categoryPlot35.getLegendItems();
        xYPlot18.setFixedLegendItems(legendItemCollection57);
        categoryPlot4.setFixedLegendItems(legendItemCollection57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot44", categoryPlot4.equals(categoryPlot44) ? categoryPlot4.hashCode() == categoryPlot44.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot0.getDomainAxisLocation((int) ' ');
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        xYPlot0.drawAnnotations(graphics2D25, rectangle2D26, plotRenderingInfo27);
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        xYPlot29.drawZeroRangeBaseline(graphics2D30, rectangle2D31);
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot29.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = xYPlot29.getDomainMarkers(1, layer36);
        java.awt.Stroke stroke38 = xYPlot29.getDomainGridlineStroke();
        xYPlot0.setDomainGridlineStroke(stroke38);
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        double double41 = xYPlot40.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis43 = xYPlot40.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis45 = xYPlot40.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot46 = xYPlot40.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = xYPlot40.getRangeAxisEdge();
        java.awt.Paint paint48 = xYPlot40.getRangeTickBandPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke52 = xYPlot51.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder53 = xYPlot51.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer57 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset54, categoryAxis55, valueAxis56, categoryItemRenderer57);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = categoryPlot58.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup60 = categoryPlot58.getDatasetGroup();
        boolean boolean61 = categoryPlot58.isDomainZoomable();
        boolean boolean62 = categoryPlot58.isRangeZoomable();
        categoryPlot58.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        categoryPlot58.setDataset((int) ' ', categoryDataset66);
        java.awt.Stroke stroke68 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot58.setDomainGridlineStroke(stroke68);
        xYPlot51.setDomainZeroBaselineStroke(stroke68);
        java.awt.geom.Point2D point2D71 = xYPlot51.getQuadrantOrigin();
        xYPlot51.setRangeCrosshairValue((double) (byte) 1);
        java.awt.Paint paint74 = xYPlot51.getRangeGridlinePaint();
        java.awt.geom.Point2D point2D75 = xYPlot51.getQuadrantOrigin();
        xYPlot40.zoomRangeAxes((double) (-1.0f), plotRenderingInfo50, point2D75, false);
        java.awt.Graphics2D graphics2D78 = null;
        java.awt.geom.Rectangle2D rectangle2D79 = null;
        org.jfree.chart.axis.AxisSpace axisSpace80 = xYPlot40.calculateAxisSpace(graphics2D78, rectangle2D79);
        xYPlot0.setFixedRangeAxisSpace(axisSpace80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot51", xYPlot0.equals(xYPlot51) ? xYPlot0.hashCode() == xYPlot51.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        double double56 = xYPlot55.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis58 = xYPlot55.getDomainAxis(1);
        double double59 = xYPlot55.getDomainCrosshairValue();
        org.jfree.chart.util.RectangleEdge rectangleEdge61 = xYPlot55.getRangeAxisEdge((int) '#');
        double double62 = xYPlot55.getDomainCrosshairValue();
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        xYPlot55.drawBackgroundImage(graphics2D63, rectangle2D64);
        java.awt.geom.Point2D point2D66 = xYPlot55.getQuadrantOrigin();
        categoryPlot4.zoomDomainAxes((double) (byte) 1, (double) (short) 0, plotRenderingInfo54, point2D66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot33 and xYPlot55", xYPlot33.equals(xYPlot55) ? xYPlot33.hashCode() == xYPlot55.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        java.awt.Paint paint20 = xYPlot0.getRangeTickBandPaint();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        boolean boolean25 = xYPlot21.isDomainCrosshairVisible();
        xYPlot21.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset28 = xYPlot21.getDataset();
        boolean boolean29 = xYPlot21.isDomainCrosshairVisible();
        xYPlot21.setDomainZeroBaselineVisible(true);
        boolean boolean32 = xYPlot21.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = categoryPlot37.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup39 = categoryPlot37.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = categoryPlot37.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        xYPlot41.drawZeroRangeBaseline(graphics2D42, rectangle2D43);
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot41.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint48 = xYPlot47.getBackgroundPaint();
        xYPlot41.setRangeZeroBaselinePaint(paint48);
        categoryPlot37.setBackgroundPaint(paint48);
        boolean boolean51 = categoryPlot37.isRangeZoomable();
        categoryPlot37.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray53 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot37.setRangeAxes(valueAxisArray53);
        xYPlot21.setDomainAxes(valueAxisArray53);
        xYPlot0.setDomainAxes(valueAxisArray53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot7 and xYPlot47", xYPlot7.equals(xYPlot47) ? xYPlot7.hashCode() == xYPlot47.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot15.getDomainAxisEdge();
        java.awt.Image image19 = categoryPlot15.getBackgroundImage();
        org.jfree.chart.axis.AxisSpace axisSpace20 = categoryPlot15.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent24 = null;
        xYPlot23.rendererChanged(rendererChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        xYPlot23.setRangeAxis((int) '#', valueAxis27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.axis.AxisSpace axisSpace31 = xYPlot23.calculateAxisSpace(graphics2D29, rectangle2D30);
        org.jfree.chart.axis.AxisSpace axisSpace32 = categoryPlot15.calculateDomainAxisSpace(graphics2D21, rectangle2D22, axisSpace31);
        xYPlot0.setFixedRangeAxisSpace(axisSpace31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot23", xYPlot0.equals(xYPlot23) ? xYPlot0.hashCode() == xYPlot23.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer61 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot62 = new org.jfree.chart.plot.CategoryPlot(categoryDataset58, categoryAxis59, valueAxis60, categoryItemRenderer61);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier63 = categoryPlot62.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder64 = categoryPlot62.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation65 = categoryPlot62.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis67 = null;
        categoryPlot62.setDomainAxis((int) ' ', categoryAxis67);
        categoryPlot62.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis72 = categoryPlot62.getDomainAxisForDataset(0);
        int int73 = categoryPlot62.getRangeAxisCount();
        java.awt.Graphics2D graphics2D74 = null;
        java.awt.geom.Rectangle2D rectangle2D75 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo76 = null;
        categoryPlot62.drawAnnotations(graphics2D74, rectangle2D75, plotRenderingInfo76);
        boolean boolean78 = categoryPlot4.equals((java.lang.Object) plotRenderingInfo76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier63", drawingSupplier5.equals(drawingSupplier63) ? drawingSupplier5.hashCode() == drawingSupplier63.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        java.awt.geom.Point2D point2D6 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot8.getDomainAxis(1);
        double double12 = xYPlot8.getDomainCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation13 = xYPlot8.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot8.getRangeAxisLocation((int) 'a');
        xYPlot0.setRangeAxisLocation(1, axisLocation15, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on xYPlot0 and xYPlot8.", xYPlot0.equals(xYPlot8) == xYPlot8.equals(xYPlot0));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        float float24 = xYPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        xYPlot25.drawZeroRangeBaseline(graphics2D26, rectangle2D27);
        boolean boolean29 = xYPlot25.isDomainCrosshairVisible();
        xYPlot25.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        double double33 = xYPlot32.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis35 = xYPlot32.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis36 = xYPlot32.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = xYPlot32.getDrawingSupplier();
        xYPlot25.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray40 = new org.jfree.chart.renderer.xy.XYItemRenderer[] { xYItemRenderer39 };
        xYPlot25.setRenderers(xYItemRendererArray40);
        xYPlot0.setRenderers(xYItemRendererArray40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot32", xYPlot0.equals(xYPlot32) ? xYPlot0.hashCode() == xYPlot32.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke10 = xYPlot9.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot9.getRangeAxisIndex(valueAxis11);
        xYPlot9.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        double double18 = xYPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot17.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = xYPlot17.getDrawingSupplier();
        java.awt.geom.Point2D point2D23 = xYPlot17.getQuadrantOrigin();
        xYPlot9.zoomRangeAxes((double) (short) 10, plotRenderingInfo16, point2D23);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = xYPlot9.getDomainMarkers(layer25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = xYPlot9.getRangeAxisLocation(100);
        xYPlot0.setRangeAxisLocation(axisLocation28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        categoryPlot34.setDomainAxis(0, categoryAxis36, false);
        categoryPlot34.configureDomainAxes();
        java.awt.Stroke stroke40 = categoryPlot34.getDomainGridlineStroke();
        categoryPlot34.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean44 = categoryPlot34.isRangeGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke46 = xYPlot45.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder47 = xYPlot45.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation48 = xYPlot45.getRangeAxisLocation();
        categoryPlot34.setDomainAxisLocation(axisLocation48, true);
        xYPlot0.setDomainAxisLocation(axisLocation48, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot17 and xYPlot45", xYPlot17.equals(xYPlot45) ? xYPlot17.hashCode() == xYPlot45.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        categoryPlot10.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryPlot10.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot10.getDatasetRenderingOrder();
        xYPlot0.setDatasetRenderingOrder(datasetRenderingOrder15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup23 = categoryPlot21.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot21.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        xYPlot25.drawZeroRangeBaseline(graphics2D26, rectangle2D27);
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot25.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint32 = xYPlot31.getBackgroundPaint();
        xYPlot25.setRangeZeroBaselinePaint(paint32);
        categoryPlot21.setBackgroundPaint(paint32);
        boolean boolean35 = categoryPlot21.isRangeZoomable();
        categoryPlot21.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray37 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot21.setRangeAxes(valueAxisArray37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        categoryPlot43.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = categoryPlot43.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder48 = categoryPlot43.getDatasetRenderingOrder();
        categoryPlot21.setDatasetRenderingOrder(datasetRenderingOrder48);
        xYPlot0.setDatasetRenderingOrder(datasetRenderingOrder48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot31", xYPlot0.equals(xYPlot31) ? xYPlot0.hashCode() == xYPlot31.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        boolean boolean9 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        categoryPlot19.setDataset((int) ' ', categoryDataset27);
        java.awt.Stroke stroke29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot19.setDomainGridlineStroke(stroke29);
        categoryPlot14.setOutlineStroke(stroke29);
        java.awt.Paint paint32 = categoryPlot14.getDomainGridlinePaint();
        xYPlot0.setDomainCrosshairPaint(paint32);
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        xYPlot34.drawZeroRangeBaseline(graphics2D35, rectangle2D36);
        boolean boolean38 = xYPlot34.isDomainCrosshairVisible();
        xYPlot34.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        double double42 = xYPlot41.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis44 = xYPlot41.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis45 = xYPlot41.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = xYPlot41.getDrawingSupplier();
        xYPlot34.setDrawingSupplier(drawingSupplier46);
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.data.Range range49 = xYPlot34.getDataRange(valueAxis48);
        java.awt.Paint paint50 = xYPlot34.getDomainGridlinePaint();
        xYPlot0.setDomainTickBandPaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier20 and drawingSupplier46", drawingSupplier20.equals(drawingSupplier46) ? drawingSupplier20.hashCode() == drawingSupplier46.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot11.drawZeroRangeBaseline(graphics2D12, rectangle2D13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot11.getDomainAxisLocation((int) (short) 100);
        categoryPlot4.setRangeAxisLocation((int) (byte) 10, axisLocation16, false);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot24.getDomainAxis(10);
        xYPlot24.configureDomainAxes();
        java.awt.Paint paint28 = xYPlot24.getDomainCrosshairPaint();
        categoryPlot23.setRangeGridlinePaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = categoryPlot34.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup36 = categoryPlot34.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        categoryPlot34.setRenderer(categoryItemRenderer37);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray40 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis39 };
        categoryPlot34.setDomainAxes(categoryAxisArray40);
        categoryPlot23.setDomainAxes(categoryAxisArray40);
        categoryPlot4.setDomainAxes(categoryAxisArray40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot34.", categoryPlot4.equals(categoryPlot34) == categoryPlot34.equals(categoryPlot4));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
        xYPlot0.clearRangeMarkers(0);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = xYPlot0.getRangeAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        categoryPlot38.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = categoryPlot38.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = categoryPlot47.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup49 = categoryPlot47.getDatasetGroup();
        boolean boolean50 = categoryPlot47.isDomainZoomable();
        java.awt.Font font51 = categoryPlot47.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray52 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot47.setRenderers(categoryItemRendererArray52);
        categoryPlot38.setRenderers(categoryItemRendererArray52);
        categoryPlot38.setDomainGridlinesVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = null;
        categoryPlot38.setRenderer(10, categoryItemRenderer58, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = categoryPlot38.getAxisOffset();
        org.jfree.chart.axis.AxisLocation axisLocation62 = categoryPlot38.getRangeAxisLocation();
        xYPlot0.setDomainAxisLocation(axisLocation62, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot47", categoryPlot14.equals(categoryPlot47) ? categoryPlot14.hashCode() == categoryPlot47.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        xYPlot0.clearAnnotations();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.util.List list12 = null;
        xYPlot8.drawDomainGridlines(graphics2D10, rectangle2D11, list12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot8.zoomRangeAxes((double) 1, plotRenderingInfo15, point2D16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis19, valueAxis20, categoryItemRenderer21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot22.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryPlot22.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot22.setRenderer(categoryItemRenderer25);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis(categoryAxis27);
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot22.getDomainAxis((int) 'a');
        java.awt.Font font32 = categoryPlot22.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = categoryPlot22.getRendererForDataset(categoryDataset33);
        java.awt.Stroke stroke35 = categoryPlot22.getDomainGridlineStroke();
        xYPlot8.setDomainGridlineStroke(stroke35);
        xYPlot8.clearRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation39 = xYPlot8.getDomainAxisLocation((int) '4');
        xYPlot0.setDomainAxisLocation(axisLocation39);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        xYPlot0.drawAnnotations(graphics2D41, rectangle2D42, plotRenderingInfo43);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        xYPlot0.setRenderer(98, xYItemRenderer46, true);
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke50 = xYPlot49.getDomainZeroBaselineStroke();
        java.util.List list51 = xYPlot49.getAnnotations();
        xYPlot49.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        xYPlot49.setRangeAxis(valueAxis54);
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        xYPlot49.setDomainAxis((int) 'a', valueAxis57);
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        xYPlot49.setDomainAxis(valueAxis59);
        org.jfree.chart.plot.XYPlot xYPlot61 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = null;
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer65 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot66 = new org.jfree.chart.plot.CategoryPlot(categoryDataset62, categoryAxis63, valueAxis64, categoryItemRenderer65);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier67 = categoryPlot66.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup68 = categoryPlot66.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge69 = categoryPlot66.getDomainAxisEdge();
        categoryPlot66.configureDomainAxes();
        java.awt.Paint paint71 = categoryPlot66.getDomainGridlinePaint();
        xYPlot61.setNoDataMessagePaint(paint71);
        xYPlot61.configureDomainAxes();
        java.awt.Graphics2D graphics2D74 = null;
        java.awt.geom.Rectangle2D rectangle2D75 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo76 = null;
        xYPlot61.drawAnnotations(graphics2D74, rectangle2D75, plotRenderingInfo76);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder78 = xYPlot61.getSeriesRenderingOrder();
        xYPlot49.setSeriesRenderingOrder(seriesRenderingOrder78);
        java.awt.Paint paint80 = xYPlot49.getDomainGridlinePaint();
        xYPlot0.setRangeGridlinePaint(paint80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot8 and xYPlot49", xYPlot8.equals(xYPlot49) ? xYPlot8.hashCode() == xYPlot49.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        java.util.List list8 = xYPlot0.getAnnotations();
        java.awt.Stroke stroke9 = xYPlot0.getDomainGridlineStroke();
        java.awt.Paint paint10 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot11.getDomainAxis(10);
        xYPlot11.configureDomainAxes();
        java.awt.Paint paint15 = xYPlot11.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = xYPlot11.getDataRange(valueAxis16);
        xYPlot11.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot11.getRangeAxisLocation(15);
        xYPlot0.setDomainAxisLocation(axisLocation21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        int int24 = xYPlot0.getDomainAxisIndex(valueAxis23);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = categoryPlot30.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup32 = categoryPlot30.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot30.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        xYPlot34.drawZeroRangeBaseline(graphics2D35, rectangle2D36);
        org.jfree.chart.axis.AxisLocation axisLocation39 = xYPlot34.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint41 = xYPlot40.getBackgroundPaint();
        xYPlot34.setRangeZeroBaselinePaint(paint41);
        categoryPlot30.setBackgroundPaint(paint41);
        boolean boolean44 = categoryPlot30.isRangeZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot30.getDomainAxisLocation();
        xYPlot0.setRangeAxisLocation((int) ' ', axisLocation45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier6 and drawingSupplier31", drawingSupplier6.equals(drawingSupplier31) ? drawingSupplier6.hashCode() == drawingSupplier31.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = xYPlot0.getAxisOffset();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        xYPlot0.setDomainAxis((int) (byte) 10, valueAxis5);
        xYPlot0.setOutlineVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot9.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot9.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke15 = xYPlot9.getDomainGridlineStroke();
        xYPlot0.setDomainZeroBaselineStroke(stroke15);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        double double20 = xYPlot19.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.util.List list23 = null;
        xYPlot19.drawDomainGridlines(graphics2D21, rectangle2D22, list23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = xYPlot19.getDrawingSupplier();
        java.awt.Paint paint26 = xYPlot19.getDomainZeroBaselinePaint();
        java.util.List list27 = xYPlot19.getAnnotations();
        java.awt.Stroke stroke28 = xYPlot19.getDomainGridlineStroke();
        java.awt.Paint paint29 = xYPlot19.getDomainZeroBaselinePaint();
        xYPlot0.setRangeCrosshairPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot9 and xYPlot19", xYPlot9.equals(xYPlot19) ? xYPlot9.hashCode() == xYPlot19.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
        categoryPlot4.clearRangeMarkers();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.util.Layer layer18 = null;
        categoryPlot4.drawDomainMarkers(graphics2D15, rectangle2D16, (int) (byte) 0, layer18);
        categoryPlot4.clearDomainMarkers(100);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot4.getDataRange(valueAxis22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = categoryPlot28.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup30 = categoryPlot28.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot28.getDomainAxisEdge();
        categoryPlot28.configureDomainAxes();
        java.awt.Paint paint33 = categoryPlot28.getDomainGridlinePaint();
        java.awt.Paint paint34 = categoryPlot28.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        xYPlot35.drawZeroRangeBaseline(graphics2D36, rectangle2D37);
        org.jfree.data.xy.XYDataset xYDataset40 = xYPlot35.getDataset((int) (short) 0);
        boolean boolean41 = xYPlot35.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        xYPlot35.drawBackgroundImage(graphics2D42, rectangle2D43);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        org.jfree.chart.axis.AxisSpace axisSpace48 = xYPlot35.calculateDomainAxisSpace(graphics2D45, rectangle2D46, axisSpace47);
        categoryPlot28.setFixedRangeAxisSpace(axisSpace48, false);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier29", drawingSupplier5.equals(drawingSupplier29) ? drawingSupplier5.hashCode() == drawingSupplier29.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        boolean boolean19 = categoryPlot4.render(graphics2D15, rectangle2D16, (int) '#', plotRenderingInfo18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = categoryPlot25.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup27 = categoryPlot25.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot25.setRenderer(categoryItemRenderer28);
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot30.drawZeroRangeBaseline(graphics2D31, rectangle2D32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot30.getDomainAxisLocation((int) (short) 100);
        categoryPlot25.setDomainAxisLocation(axisLocation35);
        categoryPlot4.setRangeAxisLocation(100, axisLocation35, true);
        int int39 = categoryPlot4.getWeight();
        java.awt.Stroke stroke40 = categoryPlot4.getRangeGridlineStroke();
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        xYPlot43.drawZeroRangeBaseline(graphics2D44, rectangle2D45);
        org.jfree.data.xy.XYDataset xYDataset48 = xYPlot43.getDataset((int) (short) 0);
        boolean boolean49 = xYPlot43.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        xYPlot43.drawBackgroundImage(graphics2D50, rectangle2D51);
        java.awt.Graphics2D graphics2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        org.jfree.chart.axis.AxisSpace axisSpace55 = null;
        org.jfree.chart.axis.AxisSpace axisSpace56 = xYPlot43.calculateDomainAxisSpace(graphics2D53, rectangle2D54, axisSpace55);
        org.jfree.chart.axis.AxisSpace axisSpace57 = categoryPlot4.calculateRangeAxisSpace(graphics2D41, rectangle2D42, axisSpace55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot30 and xYPlot43", xYPlot30.equals(xYPlot43) ? xYPlot30.hashCode() == xYPlot43.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot13.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint24 = xYPlot23.getBackgroundPaint();
        xYPlot17.setRangeZeroBaselinePaint(paint24);
        categoryPlot13.setBackgroundPaint(paint24);
        boolean boolean27 = categoryPlot13.isRangeZoomable();
        categoryPlot13.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot13.setRangeAxes(valueAxisArray29);
        xYPlot0.setDomainAxes(valueAxisArray29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot23", xYPlot0.equals(xYPlot23) ? xYPlot0.hashCode() == xYPlot23.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        boolean boolean4 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = xYPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = categoryPlot10.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot10.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot10.setRenderer(categoryItemRenderer13);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot10.setDomainAxis(categoryAxis15);
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot10.getDomainAxis((int) 'a');
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot10.getDomainMarkers(layer20);
        boolean boolean22 = categoryPlot10.isRangeCrosshairLockedOnData();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        boolean boolean28 = xYPlot27.isRangeZoomable();
        java.lang.String str29 = xYPlot27.getNoDataMessage();
        java.awt.Paint paint30 = xYPlot27.getRangeCrosshairPaint();
        categoryPlot10.setRangeGridlinePaint(paint30);
        xYPlot0.setNoDataMessagePaint(paint30);
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        xYPlot33.drawZeroRangeBaseline(graphics2D34, rectangle2D35);
        org.jfree.chart.axis.AxisLocation axisLocation38 = xYPlot33.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = xYPlot33.getDomainMarkers(1, layer40);
        org.jfree.chart.LegendItemCollection legendItemCollection42 = xYPlot33.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = categoryPlot47.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup49 = categoryPlot47.getDatasetGroup();
        boolean boolean50 = categoryPlot47.isDomainZoomable();
        java.awt.Font font51 = categoryPlot47.getNoDataMessageFont();
        xYPlot33.setNoDataMessageFont(font51);
        java.awt.Stroke stroke53 = xYPlot33.getDomainCrosshairStroke();
        xYPlot0.setOutlineStroke(stroke53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection5 and legendItemCollection42", legendItemCollection5.equals(legendItemCollection42) ? legendItemCollection5.hashCode() == legendItemCollection42.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot4.setDomainAxis(categoryAxis25);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        xYPlot27.drawZeroRangeBaseline(graphics2D28, rectangle2D29);
        org.jfree.chart.axis.AxisLocation axisLocation32 = xYPlot27.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke33 = xYPlot27.getDomainGridlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        xYPlot27.notifyListeners(plotChangeEvent34);
        org.jfree.data.xy.XYDataset xYDataset37 = xYPlot27.getDataset((int) (byte) 10);
        java.awt.Stroke stroke38 = xYPlot27.getDomainCrosshairStroke();
        categoryPlot4.setRangeCrosshairStroke(stroke38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis41, valueAxis42, categoryItemRenderer43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = categoryPlot44.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup46 = categoryPlot44.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = categoryPlot44.getDomainAxisEdge();
        categoryPlot44.setRangeCrosshairLockedOnData(true);
        java.lang.String str50 = categoryPlot44.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = categoryPlot44.getRendererForDataset(categoryDataset51);
        java.awt.Graphics2D graphics2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke56 = xYPlot55.getDomainZeroBaselineStroke();
        java.util.List list57 = xYPlot55.getAnnotations();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        xYPlot55.drawZeroRangeBaseline(graphics2D58, rectangle2D59);
        int int61 = xYPlot55.getBackgroundImageAlignment();
        boolean boolean62 = xYPlot55.isDomainCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.axis.AxisSpace axisSpace65 = null;
        org.jfree.chart.axis.AxisSpace axisSpace66 = xYPlot55.calculateRangeAxisSpace(graphics2D63, rectangle2D64, axisSpace65);
        org.jfree.chart.axis.AxisSpace axisSpace67 = categoryPlot44.calculateDomainAxisSpace(graphics2D53, rectangle2D54, axisSpace66);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace66, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier45", drawingSupplier5.equals(drawingSupplier45) ? drawingSupplier5.hashCode() == drawingSupplier45.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = xYPlot0.getDrawingSupplier();
        java.awt.Stroke stroke8 = xYPlot0.getDomainZeroBaselineStroke();
        java.awt.geom.Point2D point2D9 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder10 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke12 = xYPlot11.getDomainZeroBaselineStroke();
        java.util.List list13 = xYPlot11.getAnnotations();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot11.drawZeroRangeBaseline(graphics2D14, rectangle2D15);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot11.setRangeAxes(valueAxisArray17);
        xYPlot0.setRangeAxes(valueAxisArray17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot11", xYPlot0.equals(xYPlot11) ? xYPlot0.hashCode() == xYPlot11.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        java.awt.Paint paint8 = xYPlot0.getRangeTickBandPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
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
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke27 = xYPlot26.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder28 = xYPlot26.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot26.getRangeAxisLocation();
        categoryPlot15.setDomainAxisLocation(axisLocation29, true);
        boolean boolean32 = categoryPlot15.isRangeCrosshairVisible();
        java.util.List list33 = categoryPlot15.getAnnotations();
        xYPlot0.drawDomainTickBands(graphics2D9, rectangle2D10, list33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot26", xYPlot0.equals(xYPlot26) ? xYPlot0.hashCode() == xYPlot26.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setDomainGridlinesVisible(false);
        java.lang.Object obj11 = xYPlot0.clone();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = xYPlot0.getDomainMarkers(layer12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and obj11", xYPlot0.equals(obj11) ? xYPlot0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        java.awt.Paint paint27 = categoryPlot4.getRangeCrosshairPaint();
        categoryPlot4.setRangeCrosshairValue((double) 'a');
        categoryPlot4.setRangeCrosshairValue((double) 98, false);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = categoryPlot37.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup39 = categoryPlot37.getDatasetGroup();
        boolean boolean40 = categoryPlot37.isDomainZoomable();
        java.awt.Font font41 = categoryPlot37.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray42 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot37.setRenderers(categoryItemRendererArray42);
        categoryPlot4.setRenderers(categoryItemRendererArray42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier38", drawingSupplier5.equals(drawingSupplier38) ? drawingSupplier5.hashCode() == drawingSupplier38.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        categoryPlot4.setBackgroundAlpha((float) (byte) 100);
        double double13 = categoryPlot4.getAnchorValue();
        int int14 = categoryPlot4.getDatasetCount();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot19.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup21 = categoryPlot19.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot19.getDomainAxisEdge();
        categoryPlot19.configureDomainAxes();
        java.awt.Stroke stroke24 = categoryPlot19.getDomainGridlineStroke();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot19.setRangeCrosshairStroke(stroke25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        categoryPlot31.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot31.setRenderer((int) 'a', categoryItemRenderer35, false);
        int int38 = categoryPlot31.getWeight();
        java.awt.Paint paint39 = categoryPlot31.getDomainGridlinePaint();
        categoryPlot19.setRangeGridlinePaint(paint39);
        categoryPlot4.setRangeCrosshairPaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier20", drawingSupplier5.equals(drawingSupplier20) ? drawingSupplier5.hashCode() == drawingSupplier20.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot4.getRangeAxisEdge((int) (short) 10);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis24, valueAxis25, categoryItemRenderer26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot27.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder29 = categoryPlot27.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = categoryPlot27.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot27.setDomainAxis((int) ' ', categoryAxis32);
        categoryPlot27.setBackgroundAlpha((float) (byte) 1);
        categoryPlot27.setAnchorValue((double) (-1.0f));
        java.awt.Paint paint38 = categoryPlot27.getNoDataMessagePaint();
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent40 = null;
        xYPlot39.rendererChanged(rendererChangeEvent40);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        xYPlot39.setRangeAxis((int) '#', valueAxis43);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        org.jfree.chart.axis.AxisSpace axisSpace47 = xYPlot39.calculateAxisSpace(graphics2D45, rectangle2D46);
        categoryPlot27.setFixedRangeAxisSpace(axisSpace47, false);
        org.jfree.chart.axis.AxisSpace axisSpace50 = categoryPlot4.calculateRangeAxisSpace(graphics2D21, rectangle2D22, axisSpace47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier28", drawingSupplier5.equals(drawingSupplier28) ? drawingSupplier5.hashCode() == drawingSupplier28.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        categoryPlot4.setWeight((int) (byte) 100);
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot4.getDomainAxisLocation((int) (short) 0);
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        double double34 = xYPlot33.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis36 = xYPlot33.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis38 = xYPlot33.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot39 = xYPlot33.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        xYPlot40.drawZeroRangeBaseline(graphics2D41, rectangle2D42);
        org.jfree.data.xy.XYDataset xYDataset45 = xYPlot40.getDataset((int) (short) 0);
        java.awt.Paint paint46 = xYPlot40.getOutlinePaint();
        xYPlot33.setRangeCrosshairPaint(paint46);
        java.awt.Stroke stroke48 = xYPlot33.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.PlotOrientation plotOrientation49 = xYPlot33.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge50 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation32, plotOrientation49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot5 and xYPlot40", xYPlot5.equals(xYPlot40) ? xYPlot5.hashCode() == xYPlot40.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        int int16 = categoryPlot15.getRangeAxisCount();
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
        categoryPlot15.setFixedDomainAxisSpace(axisSpace29, false);
        categoryPlot15.clearDomainMarkers((int) (short) 0);
        boolean boolean35 = xYPlot0.equals((java.lang.Object) categoryPlot15);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup42 = categoryPlot40.getDatasetGroup();
        boolean boolean43 = categoryPlot40.isDomainZoomable();
        org.jfree.chart.util.Layer layer45 = null;
        java.util.Collection collection46 = categoryPlot40.getRangeMarkers(0, layer45);
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent49 = null;
        xYPlot48.rendererChanged(rendererChangeEvent49);
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        xYPlot48.setRangeAxis((int) '#', valueAxis52);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        xYPlot48.setRangeAxis(0, valueAxis55, true);
        org.jfree.chart.axis.AxisLocation axisLocation58 = xYPlot48.getDomainAxisLocation();
        categoryPlot40.setDomainAxisLocation((int) (short) 10, axisLocation58, false);
        xYPlot0.setDomainAxisLocation(axisLocation58, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot15 and categoryPlot40.", categoryPlot15.equals(categoryPlot40) == categoryPlot40.equals(categoryPlot15));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot0.getDomainAxisLocation((int) ' ');
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = xYPlot0.getDomainMarkers(layer25);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot33.setDomainAxis(0, categoryAxis35, false);
        categoryPlot33.configureDomainAxes();
        java.awt.Stroke stroke39 = categoryPlot33.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis42 = xYPlot40.getDomainAxis(10);
        xYPlot40.configureDomainAxes();
        java.awt.Paint paint44 = xYPlot40.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.data.Range range46 = xYPlot40.getDataRange(valueAxis45);
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        xYPlot47.drawZeroRangeBaseline(graphics2D48, rectangle2D49);
        org.jfree.chart.axis.AxisLocation axisLocation52 = xYPlot47.getDomainAxisLocation((int) (short) 100);
        xYPlot40.setDomainAxisLocation(axisLocation52);
        categoryPlot33.setRangeAxisLocation(axisLocation52, true);
        org.jfree.chart.axis.AxisLocation axisLocation57 = categoryPlot33.getDomainAxisLocation((int) (byte) -1);
        java.util.List list58 = categoryPlot33.getAnnotations();
        xYPlot0.drawRangeGridlines(graphics2D27, rectangle2D28, list58);
        boolean boolean60 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.chart.plot.XYPlot xYPlot61 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        xYPlot61.drawZeroRangeBaseline(graphics2D62, rectangle2D63);
        org.jfree.chart.axis.AxisLocation axisLocation66 = xYPlot61.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer68 = null;
        java.util.Collection collection69 = xYPlot61.getDomainMarkers(1, layer68);
        org.jfree.chart.LegendItemCollection legendItemCollection70 = xYPlot61.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset71 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis72 = null;
        org.jfree.chart.axis.ValueAxis valueAxis73 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer74 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset71, categoryAxis72, valueAxis73, categoryItemRenderer74);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier76 = categoryPlot75.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup77 = categoryPlot75.getDatasetGroup();
        boolean boolean78 = categoryPlot75.isDomainZoomable();
        java.awt.Font font79 = categoryPlot75.getNoDataMessageFont();
        xYPlot61.setNoDataMessageFont(font79);
        xYPlot61.setNoDataMessage("hi!");
        org.jfree.chart.plot.XYPlot xYPlot83 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D84 = null;
        java.awt.geom.Rectangle2D rectangle2D85 = null;
        xYPlot83.drawZeroRangeBaseline(graphics2D84, rectangle2D85);
        org.jfree.data.xy.XYDataset xYDataset88 = xYPlot83.getDataset((int) (short) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray89 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot83.setRenderers(xYItemRendererArray89);
        xYPlot61.setRenderers(xYItemRendererArray89);
        xYPlot0.setRenderers(xYItemRendererArray89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier8 and drawingSupplier76", drawingSupplier8.equals(drawingSupplier76) ? drawingSupplier8.hashCode() == drawingSupplier76.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
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
        int int23 = categoryPlot4.getDatasetCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        categoryPlot31.setDomainAxis(0, categoryAxis33, false);
        categoryPlot31.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = categoryPlot31.getDomainAxis();
        categoryPlot31.clearDomainMarkers();
        java.util.List list39 = categoryPlot31.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis41, valueAxis42, categoryItemRenderer43);
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        categoryPlot44.setDomainAxis(0, categoryAxis46, false);
        categoryPlot44.configureDomainAxes();
        boolean boolean50 = categoryPlot44.isRangeZoomable();
        categoryPlot44.setRangeCrosshairValue((double) 10);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset53, categoryAxis54, valueAxis55, categoryItemRenderer56);
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = null;
        categoryPlot57.setDomainAxis(0, categoryAxis59, false);
        categoryPlot57.configureDomainAxes();
        java.awt.Stroke stroke63 = categoryPlot57.getDomainGridlineStroke();
        categoryPlot57.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean67 = categoryPlot57.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation69 = categoryPlot57.getDomainAxisLocation(10);
        categoryPlot44.setDomainAxisLocation(axisLocation69);
        categoryPlot31.setDomainAxisLocation(axisLocation69, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo74 = null;
        org.jfree.chart.plot.XYPlot xYPlot75 = new org.jfree.chart.plot.XYPlot();
        double double76 = xYPlot75.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis78 = xYPlot75.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis79 = xYPlot75.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier80 = xYPlot75.getDrawingSupplier();
        java.awt.geom.Point2D point2D81 = xYPlot75.getQuadrantOrigin();
        categoryPlot31.zoomRangeAxes((double) 1.0f, plotRenderingInfo74, point2D81);
        categoryPlot4.zoomDomainAxes((double) (short) 10, (double) (short) -1, plotRenderingInfo26, point2D81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot57", categoryPlot4.equals(categoryPlot57) ? categoryPlot4.hashCode() == categoryPlot57.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
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
        xYPlot0.configureDomainAxes();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        xYPlot0.drawAnnotations(graphics2D13, rectangle2D14, plotRenderingInfo15);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder17 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot18.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot18.getRangeAxisLocation();
        xYPlot0.setDomainAxisLocation(axisLocation24);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        double double27 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot26.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot26.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot32 = xYPlot26.getRootPlot();
        java.awt.Paint paint33 = xYPlot26.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = xYPlot26.getSeriesRenderingOrder();
        java.awt.geom.Point2D point2D35 = xYPlot26.getQuadrantOrigin();
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = categoryPlot41.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup43 = categoryPlot41.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = categoryPlot41.getDomainAxisEdge();
        categoryPlot41.configureDomainAxes();
        java.awt.Paint paint46 = categoryPlot41.getDomainGridlinePaint();
        xYPlot36.setNoDataMessagePaint(paint46);
        xYPlot26.setRangeCrosshairPaint(paint46);
        xYPlot0.setRangeZeroBaselinePaint(paint46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot5 and categoryPlot41", categoryPlot5.equals(categoryPlot41) ? categoryPlot5.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        java.util.List list8 = xYPlot0.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        boolean boolean14 = xYPlot13.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = xYPlot13.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = categoryPlot20.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot20.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation23 = categoryPlot20.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot20.setDomainAxis((int) ' ', categoryAxis25);
        categoryPlot20.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot20.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot20.getRangeAxisLocation();
        xYPlot13.setDomainAxisLocation(axisLocation31);
        xYPlot0.setDomainAxisLocation(axisLocation31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot13", xYPlot0.equals(xYPlot13) ? xYPlot0.hashCode() == xYPlot13.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot23.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup25 = categoryPlot23.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot23.setRenderer(categoryItemRenderer26);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray29 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis28 };
        categoryPlot23.setDomainAxes(categoryAxisArray29);
        java.awt.Paint paint31 = categoryPlot23.getDomainGridlinePaint();
        xYPlot0.setRangeZeroBaselinePaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        categoryPlot37.setDomainAxis(0, categoryAxis39, false);
        categoryPlot37.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = categoryPlot37.getDomainAxis();
        categoryPlot37.mapDatasetToDomainAxis((int) '4', 100);
        boolean boolean47 = categoryPlot37.isDomainGridlinesVisible();
        org.jfree.chart.util.Layer layer49 = null;
        java.util.Collection collection50 = categoryPlot37.getRangeMarkers(10, layer49);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        xYPlot53.drawZeroRangeBaseline(graphics2D54, rectangle2D55);
        org.jfree.data.xy.XYDataset xYDataset58 = xYPlot53.getDataset((int) (short) 0);
        boolean boolean59 = xYPlot53.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        xYPlot53.drawBackgroundImage(graphics2D60, rectangle2D61);
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.axis.AxisSpace axisSpace65 = null;
        org.jfree.chart.axis.AxisSpace axisSpace66 = xYPlot53.calculateDomainAxisSpace(graphics2D63, rectangle2D64, axisSpace65);
        org.jfree.chart.axis.AxisSpace axisSpace67 = categoryPlot37.calculateDomainAxisSpace(graphics2D51, rectangle2D52, axisSpace66);
        xYPlot0.setFixedDomainAxisSpace(axisSpace66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot23 and categoryPlot37.", categoryPlot23.equals(categoryPlot37) == categoryPlot37.equals(categoryPlot23));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        double double12 = xYPlot11.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot11.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot11.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot17 = xYPlot11.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.data.xy.XYDataset xYDataset23 = xYPlot18.getDataset((int) (short) 0);
        java.awt.Paint paint24 = xYPlot18.getOutlinePaint();
        xYPlot11.setRangeCrosshairPaint(paint24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot11.zoomDomainAxes((double) 0L, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder30 = xYPlot11.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.axis.AxisSpace axisSpace33 = xYPlot11.calculateAxisSpace(graphics2D31, rectangle2D32);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.axis.AxisSpace axisSpace36 = xYPlot11.calculateAxisSpace(graphics2D34, rectangle2D35);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot5 and xYPlot18", xYPlot5.equals(xYPlot18) ? xYPlot5.hashCode() == xYPlot18.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D3, rectangle2D4);
        java.awt.geom.Point2D point2D6 = xYPlot0.getQuadrantOrigin();
        boolean boolean7 = xYPlot0.isDomainCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        xYPlot10.drawZeroRangeBaseline(graphics2D11, rectangle2D12);
        org.jfree.data.xy.XYDataset xYDataset15 = xYPlot10.getDataset((int) (short) 0);
        boolean boolean16 = xYPlot10.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot10.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = xYPlot10.getDataRange(valueAxis20);
        java.util.List list22 = xYPlot10.getAnnotations();
        xYPlot0.drawRangeTickBands(graphics2D8, rectangle2D9, list22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot10", xYPlot0.equals(xYPlot10) ? xYPlot0.hashCode() == xYPlot10.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        xYPlot0.setFixedRangeAxisSpace(axisSpace9, false);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        double double15 = xYPlot14.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot14.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot14.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot20 = xYPlot14.getRootPlot();
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = xYPlot14.getDomainMarkers(layer21);
        xYPlot14.clearDomainAxes();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        xYPlot14.setDataset(xYDataset24);
        boolean boolean26 = xYPlot14.isRangeGridlinesVisible();
        xYPlot14.setRangeCrosshairValue((double) 10, true);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke33 = xYPlot32.getDomainZeroBaselineStroke();
        java.util.List list34 = xYPlot32.getAnnotations();
        xYPlot32.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        xYPlot32.setRangeAxis(valueAxis37);
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        xYPlot32.setDomainAxis((int) 'a', valueAxis40);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        xYPlot32.setDomainAxis(valueAxis42);
        xYPlot32.mapDatasetToDomainAxis((int) (byte) 10, (int) '#');
        java.awt.Paint paint48 = xYPlot32.getQuadrantPaint(1);
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = null;
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer54 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = new org.jfree.chart.plot.CategoryPlot(categoryDataset51, categoryAxis52, valueAxis53, categoryItemRenderer54);
        categoryPlot55.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = categoryPlot55.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder60 = categoryPlot55.getDatasetRenderingOrder();
        org.jfree.chart.util.RectangleEdge rectangleEdge61 = categoryPlot55.getDomainAxisEdge();
        java.util.List list62 = categoryPlot55.getAnnotations();
        xYPlot32.drawDomainTickBands(graphics2D49, rectangle2D50, list62);
        xYPlot14.drawDomainTickBands(graphics2D30, rectangle2D31, list62);
        xYPlot0.drawRangeGridlines(graphics2D12, rectangle2D13, list62);
        org.jfree.chart.plot.XYPlot xYPlot67 = new org.jfree.chart.plot.XYPlot();
        double double68 = xYPlot67.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis70 = xYPlot67.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot71 = xYPlot67.getRootPlot();
        xYPlot67.clearRangeMarkers();
        boolean boolean73 = xYPlot67.isRangeCrosshairVisible();
        java.awt.Paint paint74 = xYPlot67.getRangeTickBandPaint();
        xYPlot67.clearDomainMarkers((int) (short) 10);
        org.jfree.chart.axis.AxisLocation axisLocation78 = xYPlot67.getRangeAxisLocation(0);
        xYPlot0.setRangeAxisLocation(11, axisLocation78);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on xYPlot0 and xYPlot67.", xYPlot0.equals(xYPlot67) == xYPlot67.equals(xYPlot0));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
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
        xYPlot0.mapDatasetToRangeAxis((int) (short) 10, (int) (byte) 1);
        java.lang.String str19 = xYPlot0.getNoDataMessage();
        xYPlot0.setRangeGridlinesVisible(true);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = categoryPlot28.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup30 = categoryPlot28.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot28.getDomainAxisEdge();
        java.awt.Image image32 = categoryPlot28.getBackgroundImage();
        org.jfree.chart.axis.AxisSpace axisSpace33 = categoryPlot28.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent37 = null;
        xYPlot36.rendererChanged(rendererChangeEvent37);
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        xYPlot36.setRangeAxis((int) '#', valueAxis40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.axis.AxisSpace axisSpace44 = xYPlot36.calculateAxisSpace(graphics2D42, rectangle2D43);
        org.jfree.chart.axis.AxisSpace axisSpace45 = categoryPlot28.calculateDomainAxisSpace(graphics2D34, rectangle2D35, axisSpace44);
        org.jfree.chart.axis.AxisSpace axisSpace46 = xYPlot0.calculateRangeAxisSpace(graphics2D22, rectangle2D23, axisSpace45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot7 and xYPlot36", xYPlot7.equals(xYPlot36) ? xYPlot7.hashCode() == xYPlot36.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot4.getFixedDomainAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        categoryPlot16.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot16.getAxisOffset();
        int int21 = categoryPlot16.getWeight();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot26.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder28 = categoryPlot26.getRowRenderingOrder();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke32 = xYPlot31.getDomainZeroBaselineStroke();
        java.util.List list33 = xYPlot31.getAnnotations();
        categoryPlot26.drawRangeGridlines(graphics2D29, rectangle2D30, list33);
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot26.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation36 = categoryPlot26.getDomainAxisLocation();
        categoryPlot16.setDomainAxisLocation(axisLocation36, false);
        categoryPlot4.setDomainAxisLocation((int) ' ', axisLocation36, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot16.", categoryPlot4.equals(categoryPlot16) == categoryPlot16.equals(categoryPlot4));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke10 = xYPlot9.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot9.getRangeAxisIndex(valueAxis11);
        xYPlot9.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        double double18 = xYPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot17.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = xYPlot17.getDrawingSupplier();
        java.awt.geom.Point2D point2D23 = xYPlot17.getQuadrantOrigin();
        xYPlot9.zoomRangeAxes((double) (short) 10, plotRenderingInfo16, point2D23);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = xYPlot9.getDomainMarkers(layer25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = xYPlot9.getRangeAxisLocation(100);
        xYPlot0.setRangeAxisLocation(axisLocation28);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        xYPlot0.setRenderer(1, xYItemRenderer31, false);
        boolean boolean34 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis44 = xYPlot42.getDomainAxis(10);
        xYPlot42.configureDomainAxes();
        java.awt.Paint paint46 = xYPlot42.getDomainCrosshairPaint();
        categoryPlot41.setRangeGridlinePaint(paint46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis49, valueAxis50, categoryItemRenderer51);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier53 = categoryPlot52.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup54 = categoryPlot52.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer55 = null;
        categoryPlot52.setRenderer(categoryItemRenderer55);
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray58 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis57 };
        categoryPlot52.setDomainAxes(categoryAxisArray58);
        categoryPlot41.setDomainAxes(categoryAxisArray58);
        java.awt.Graphics2D graphics2D61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        org.jfree.chart.util.Layer layer64 = null;
        categoryPlot41.drawDomainMarkers(graphics2D61, rectangle2D62, (int) (byte) -1, layer64);
        categoryPlot41.setRangeCrosshairVisible(false);
        int int68 = categoryPlot41.getRangeAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis69 = null;
        java.util.List list70 = categoryPlot41.getCategoriesForAxis(categoryAxis69);
        xYPlot0.drawDomainTickBands(graphics2D35, rectangle2D36, list70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot17 and xYPlot42", xYPlot17.equals(xYPlot42) ? xYPlot17.hashCode() == xYPlot42.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot4.getRangeMarkers(layer15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot4.getRangeAxisEdge(100);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot4.setRangeAxis(valueAxis19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot25.setDomainAxis(0, categoryAxis27, false);
        categoryPlot25.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        categoryPlot25.axisChanged(axisChangeEvent32);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor34 = categoryPlot25.getDomainGridlinePosition();
        categoryPlot4.setDomainGridlinePosition(categoryAnchor34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot25.", categoryPlot4.equals(categoryPlot25) == categoryPlot25.equals(categoryPlot4));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
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
        java.util.List list12 = xYPlot0.getAnnotations();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot13.drawZeroRangeBaseline(graphics2D14, rectangle2D15);
        org.jfree.data.xy.XYDataset xYDataset18 = xYPlot13.getDataset((int) (short) 0);
        float float19 = xYPlot13.getBackgroundImageAlpha();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray21 = new org.jfree.chart.renderer.xy.XYItemRenderer[] { xYItemRenderer20 };
        xYPlot13.setRenderers(xYItemRendererArray21);
        xYPlot0.setRenderers(xYItemRendererArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot13", xYPlot0.equals(xYPlot13) ? xYPlot0.hashCode() == xYPlot13.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        xYPlot0.clearAnnotations();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        double double9 = xYPlot8.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.util.List list12 = null;
        xYPlot8.drawDomainGridlines(graphics2D10, rectangle2D11, list12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot8.zoomRangeAxes((double) 1, plotRenderingInfo15, point2D16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis19, valueAxis20, categoryItemRenderer21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot22.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryPlot22.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot22.setRenderer(categoryItemRenderer25);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis(categoryAxis27);
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot22.getDomainAxis((int) 'a');
        java.awt.Font font32 = categoryPlot22.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = categoryPlot22.getRendererForDataset(categoryDataset33);
        java.awt.Stroke stroke35 = categoryPlot22.getDomainGridlineStroke();
        xYPlot8.setDomainGridlineStroke(stroke35);
        xYPlot8.clearRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation39 = xYPlot8.getDomainAxisLocation((int) '4');
        xYPlot0.setDomainAxisLocation(axisLocation39);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        xYPlot0.drawAnnotations(graphics2D41, rectangle2D42, plotRenderingInfo43);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        xYPlot0.setRenderer(98, xYItemRenderer46, true);
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        int int50 = xYPlot0.getDomainAxisIndex(valueAxis49);
        org.jfree.data.xy.XYDataset xYDataset51 = null;
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = null;
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot(xYDataset51, valueAxis52, valueAxis53, xYItemRenderer54);
        xYPlot55.clearDomainMarkers();
        java.awt.Stroke stroke57 = xYPlot55.getDomainCrosshairStroke();
        xYPlot0.setDomainZeroBaselineStroke(stroke57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot8 and xYPlot55", xYPlot8.equals(xYPlot55) ? xYPlot8.hashCode() == xYPlot55.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        categoryPlot4.drawAnnotations(graphics2D16, rectangle2D17, plotRenderingInfo18);
        categoryPlot4.setWeight((int) (byte) 100);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot4.removeChangeListener(plotChangeListener22);
        categoryPlot4.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = xYPlot26.getOrientation();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        java.util.List list33 = null;
        xYPlot26.drawDomainTickBands(graphics2D31, rectangle2D32, list33);
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot26.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        xYPlot26.setRangeAxis((int) 'a', valueAxis38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis41, valueAxis42, categoryItemRenderer43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = categoryPlot44.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup46 = categoryPlot44.getDatasetGroup();
        boolean boolean47 = categoryPlot44.isDomainZoomable();
        boolean boolean48 = categoryPlot44.isRangeZoomable();
        categoryPlot44.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        categoryPlot44.setDataset((int) ' ', categoryDataset52);
        org.jfree.chart.axis.ValueAxis valueAxis55 = categoryPlot44.getRangeAxisForDataset(10);
        org.jfree.chart.plot.PlotOrientation plotOrientation56 = categoryPlot44.getOrientation();
        xYPlot26.setOrientation(plotOrientation56);
        categoryPlot4.setOrientation(plotOrientation56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier45", drawingSupplier5.equals(drawingSupplier45) ? drawingSupplier5.hashCode() == drawingSupplier45.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        xYPlot0.zoomRangeAxes((double) 1, plotRenderingInfo7, point2D8);
        xYPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        double double20 = xYPlot19.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot19.getDomainAxis(1);
        xYPlot19.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = xYPlot19.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot19.setRangeAxis((int) (short) 10, valueAxis28);
        java.awt.Paint paint30 = xYPlot19.getDomainTickBandPaint();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        categoryPlot35.setDomainAxis(0, categoryAxis37, false);
        categoryPlot35.setRangeCrosshairLockedOnData(true);
        double double42 = categoryPlot35.getAnchorValue();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        categoryPlot47.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = categoryPlot47.getAxisOffset();
        java.awt.Graphics2D graphics2D52 = null;
        java.awt.geom.Rectangle2D rectangle2D53 = null;
        org.jfree.chart.plot.XYPlot xYPlot54 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        xYPlot54.drawZeroRangeBaseline(graphics2D55, rectangle2D56);
        org.jfree.data.xy.XYDataset xYDataset59 = xYPlot54.getDataset((int) (short) 0);
        boolean boolean60 = xYPlot54.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        xYPlot54.drawBackgroundImage(graphics2D61, rectangle2D62);
        java.awt.Graphics2D graphics2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        org.jfree.chart.axis.AxisSpace axisSpace66 = null;
        org.jfree.chart.axis.AxisSpace axisSpace67 = xYPlot54.calculateDomainAxisSpace(graphics2D64, rectangle2D65, axisSpace66);
        org.jfree.chart.axis.AxisSpace axisSpace68 = categoryPlot47.calculateDomainAxisSpace(graphics2D52, rectangle2D53, axisSpace66);
        categoryPlot35.setFixedRangeAxisSpace(axisSpace68);
        xYPlot19.setFixedRangeAxisSpace(axisSpace68, false);
        categoryPlot18.setFixedDomainAxisSpace(axisSpace68, false);
        org.jfree.chart.axis.AxisSpace axisSpace74 = xYPlot0.calculateRangeAxisSpace(graphics2D12, rectangle2D13, axisSpace68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot54", xYPlot0.equals(xYPlot54) ? xYPlot0.hashCode() == xYPlot54.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
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
        xYPlot0.drawZeroRangeBaseline(graphics2D12, rectangle2D13);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke16 = xYPlot15.getDomainZeroBaselineStroke();
        java.util.List list17 = xYPlot15.getAnnotations();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        java.lang.String str21 = xYPlot15.getPlotType();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray22 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot15.setRangeAxes(valueAxisArray22);
        java.awt.Stroke stroke24 = xYPlot15.getRangeGridlineStroke();
        xYPlot0.setDomainGridlineStroke(stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot15", xYPlot0.equals(xYPlot15) ? xYPlot0.hashCode() == xYPlot15.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        boolean boolean3 = xYPlot0.isRangeZeroBaselineVisible();
        java.awt.Paint paint4 = xYPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        double double6 = xYPlot5.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot5.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot5.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot11 = xYPlot5.getRootPlot();
        java.awt.Paint paint12 = xYPlot5.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder13 = xYPlot5.getSeriesRenderingOrder();
        boolean boolean14 = xYPlot5.isDomainCrosshairVisible();
        java.awt.Paint paint15 = xYPlot5.getDomainZeroBaselinePaint();
        xYPlot0.setRangeZeroBaselinePaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot5", xYPlot0.equals(xYPlot5) ? xYPlot0.hashCode() == xYPlot5.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
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
        int int27 = categoryPlot16.getRangeAxisCount();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        categoryPlot16.drawAnnotations(graphics2D28, rectangle2D29, plotRenderingInfo30);
        categoryPlot16.setWeight((int) (byte) 100);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        categoryPlot16.removeChangeListener(plotChangeListener34);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        categoryPlot42.setDomainAxis(0, categoryAxis44, false);
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        org.jfree.chart.axis.AxisSpace axisSpace49 = categoryPlot42.calculateAxisSpace(graphics2D47, rectangle2D48);
        org.jfree.chart.axis.AxisSpace axisSpace50 = categoryPlot16.calculateRangeAxisSpace(graphics2D36, rectangle2D37, axisSpace49);
        categoryPlot4.setFixedRangeAxisSpace(axisSpace50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier17", drawingSupplier5.equals(drawingSupplier17) ? drawingSupplier5.hashCode() == drawingSupplier17.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
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
        java.awt.Paint paint23 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot0.setDomainGridlinePaint(paint23);
        boolean boolean25 = xYPlot0.isRangeGridlinesVisible();
        xYPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        categoryPlot34.setDomainAxis(0, categoryAxis36, false);
        categoryPlot34.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        categoryPlot47.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        categoryPlot47.setRenderer((int) 'a', categoryItemRenderer51, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        org.jfree.chart.plot.XYPlot xYPlot56 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke57 = xYPlot56.getDomainZeroBaselineStroke();
        java.util.List list58 = xYPlot56.getAnnotations();
        java.awt.geom.Point2D point2D59 = xYPlot56.getQuadrantOrigin();
        categoryPlot47.zoomDomainAxes((double) (short) 100, plotRenderingInfo55, point2D59, false);
        categoryPlot34.zoomDomainAxes(0.0d, plotRenderingInfo42, point2D59);
        xYPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo29, point2D59, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot56", xYPlot0.equals(xYPlot56) ? xYPlot0.hashCode() == xYPlot56.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
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
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot4.getRowRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        int int19 = categoryPlot18.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot18.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = categoryPlot18.getDatasetRenderingOrder();
        categoryPlot18.setRangeCrosshairValue((double) (short) 10, false);
        categoryPlot18.configureDomainAxes();
        categoryPlot18.clearRangeMarkers((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        categoryPlot34.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = categoryPlot34.getAxisOffset();
        java.awt.Image image39 = categoryPlot34.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset41 = categoryPlot34.getDataset((int) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot();
        double double43 = xYPlot42.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis45 = xYPlot42.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis47 = xYPlot42.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot48 = xYPlot42.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        xYPlot49.drawZeroRangeBaseline(graphics2D50, rectangle2D51);
        org.jfree.data.xy.XYDataset xYDataset54 = xYPlot49.getDataset((int) (short) 0);
        java.awt.Paint paint55 = xYPlot49.getOutlinePaint();
        xYPlot42.setRangeCrosshairPaint(paint55);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot42.setInsets(rectangleInsets57);
        categoryPlot34.setAxisOffset(rectangleInsets57);
        java.awt.Stroke stroke60 = categoryPlot34.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisLocation axisLocation62 = categoryPlot34.getRangeAxisLocation(1);
        categoryPlot18.setRangeAxisLocation(36, axisLocation62);
        categoryPlot4.setRangeAxisLocation(axisLocation62, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot9 and xYPlot49", xYPlot9.equals(xYPlot49) ? xYPlot9.hashCode() == xYPlot49.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup23 = categoryPlot21.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot21.getDomainAxisEdge();
        categoryPlot21.configureDomainAxes();
        java.awt.Paint paint26 = categoryPlot21.getDomainGridlinePaint();
        xYPlot16.setNoDataMessagePaint(paint26);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent28 = null;
        xYPlot16.rendererChanged(rendererChangeEvent28);
        boolean boolean30 = xYPlot16.isDomainCrosshairVisible();
        java.awt.Stroke stroke31 = xYPlot16.getDomainZeroBaselineStroke();
        java.awt.Paint paint32 = xYPlot16.getNoDataMessagePaint();
        categoryPlot4.setRangeCrosshairPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier22", drawingSupplier5.equals(drawingSupplier22) ? drawingSupplier5.hashCode() == drawingSupplier22.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        categoryPlot26.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = categoryPlot26.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder31 = categoryPlot26.getDatasetRenderingOrder();
        categoryPlot4.setDatasetRenderingOrder(datasetRenderingOrder31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = categoryPlot37.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder39 = categoryPlot37.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation40 = categoryPlot37.getOrientation();
        categoryPlot37.clearDomainMarkers();
        java.awt.Font font42 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot37.setNoDataMessageFont(font42);
        categoryPlot4.setNoDataMessageFont(font42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot37", categoryPlot4.equals(categoryPlot37) ? categoryPlot4.hashCode() == categoryPlot37.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke12 = xYPlot11.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        int int14 = xYPlot11.getRangeAxisIndex(valueAxis13);
        xYPlot11.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        double double20 = xYPlot19.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot19.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot19.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = xYPlot19.getDrawingSupplier();
        java.awt.geom.Point2D point2D25 = xYPlot19.getQuadrantOrigin();
        xYPlot11.zoomRangeAxes((double) (short) 10, plotRenderingInfo18, point2D25);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot11.setDomainAxis((int) 'a', valueAxis28);
        boolean boolean30 = xYPlot11.isDomainCrosshairVisible();
        java.awt.Paint paint31 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot11.setBackgroundPaint(paint31);
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray38 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot37.setRangeAxes(valueAxisArray38);
        org.jfree.chart.axis.AxisLocation axisLocation40 = xYPlot37.getDomainAxisLocation();
        xYPlot37.setRangeCrosshairValue((double) 10.0f);
        java.awt.Stroke stroke43 = xYPlot37.getDomainGridlineStroke();
        xYPlot11.setDomainCrosshairStroke(stroke43);
        xYPlot0.setRangeGridlineStroke(stroke43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot19", xYPlot0.equals(xYPlot19) ? xYPlot0.hashCode() == xYPlot19.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        xYPlot0.zoomDomainAxes((double) 1L, (double) (byte) 0, plotRenderingInfo4, point2D5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot0.zoomRangeAxes((double) 10, 0.0d, plotRenderingInfo9, point2D10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint13 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = xYPlot0.getDomainAxisEdge((int) (byte) -1);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot16.drawZeroRangeBaseline(graphics2D17, rectangle2D18);
        org.jfree.data.xy.XYDataset xYDataset21 = xYPlot16.getDataset((int) (short) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray22 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot16.setRenderers(xYItemRendererArray22);
        xYPlot0.setRenderers(xYItemRendererArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot16", xYPlot0.equals(xYPlot16) ? xYPlot0.hashCode() == xYPlot16.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
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
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.data.Range range34 = categoryPlot4.getDataRange(valueAxis33);
        java.util.List list35 = categoryPlot4.getCategories();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = categoryPlot42.getDrawingSupplier();
        categoryPlot42.setBackgroundImageAlpha(0.0f);
        categoryPlot42.clearRangeMarkers();
        java.util.List list47 = categoryPlot42.getCategories();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.util.Layer layer51 = null;
        categoryPlot42.drawDomainMarkers(graphics2D48, rectangle2D49, (int) ' ', layer51);
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        double double54 = xYPlot53.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis56 = xYPlot53.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis58 = xYPlot53.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot59 = xYPlot53.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot60 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        xYPlot60.drawZeroRangeBaseline(graphics2D61, rectangle2D62);
        org.jfree.data.xy.XYDataset xYDataset65 = xYPlot60.getDataset((int) (short) 0);
        java.awt.Paint paint66 = xYPlot60.getOutlinePaint();
        xYPlot53.setRangeCrosshairPaint(paint66);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo69 = null;
        java.awt.geom.Point2D point2D70 = null;
        xYPlot53.zoomDomainAxes((double) 0L, plotRenderingInfo69, point2D70);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder72 = xYPlot53.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D73 = null;
        java.awt.geom.Rectangle2D rectangle2D74 = null;
        org.jfree.chart.axis.AxisSpace axisSpace75 = xYPlot53.calculateAxisSpace(graphics2D73, rectangle2D74);
        categoryPlot42.setFixedRangeAxisSpace(axisSpace75);
        org.jfree.chart.axis.AxisSpace axisSpace77 = categoryPlot4.calculateRangeAxisSpace(graphics2D36, rectangle2D37, axisSpace75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot26 and xYPlot60", xYPlot26.equals(xYPlot60) ? xYPlot26.hashCode() == xYPlot60.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot13.getDatasetGroup();
        boolean boolean16 = categoryPlot13.isDomainZoomable();
        boolean boolean17 = categoryPlot13.isRangeZoomable();
        categoryPlot13.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        categoryPlot13.setDataset((int) ' ', categoryDataset21);
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot13.setDomainGridlineStroke(stroke23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis26, valueAxis27, categoryItemRenderer28);
        categoryPlot29.setRangeCrosshairValue((double) 1L, true);
        boolean boolean33 = categoryPlot13.equals((java.lang.Object) 1L);
        boolean boolean34 = categoryPlot13.isRangeCrosshairVisible();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.axis.AxisSpace axisSpace37 = categoryPlot13.calculateAxisSpace(graphics2D35, rectangle2D36);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier14", drawingSupplier5.equals(drawingSupplier14) ? drawingSupplier5.hashCode() == drawingSupplier14.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
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
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot4.getDomainAxisLocation();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.axis.AxisSpace axisSpace22 = categoryPlot4.calculateAxisSpace(graphics2D20, rectangle2D21);
        categoryPlot4.setWeight(100);
        categoryPlot4.mapDatasetToDomainAxis((int) (short) 10, (int) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        categoryPlot34.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        categoryPlot34.setDomainAxis(categoryAxis38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis41, valueAxis42, categoryItemRenderer43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = categoryPlot44.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder46 = categoryPlot44.getRowRenderingOrder();
        categoryPlot34.setColumnRenderingOrder(sortOrder46);
        boolean boolean48 = categoryPlot34.isRangeGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = categoryPlot34.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke53 = xYPlot52.getDomainZeroBaselineStroke();
        java.util.List list54 = xYPlot52.getAnnotations();
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        xYPlot52.drawZeroRangeBaseline(graphics2D55, rectangle2D56);
        java.awt.geom.Point2D point2D58 = xYPlot52.getQuadrantOrigin();
        categoryPlot34.zoomDomainAxes((double) (-1), plotRenderingInfo51, point2D58);
        categoryPlot4.zoomRangeAxes((double) 1L, plotRenderingInfo29, point2D58, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier45", drawingSupplier5.equals(drawingSupplier45) ? drawingSupplier5.hashCode() == drawingSupplier45.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (short) 10, categoryItemRenderer9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        boolean boolean18 = categoryPlot15.isDomainZoomable();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray20 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot15.setRenderers(categoryItemRendererArray20);
        categoryPlot4.setRenderers(categoryItemRendererArray20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot15", categoryPlot4.equals(categoryPlot15) ? categoryPlot4.hashCode() == categoryPlot15.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        xYPlot0.setWeight((int) ' ');
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot11.drawZeroRangeBaseline(graphics2D12, rectangle2D13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot11.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation17 = xYPlot11.getRangeAxisLocation();
        xYPlot0.setRangeAxisLocation(10, axisLocation17, true);
        xYPlot0.clearDomainMarkers();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke22 = xYPlot21.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        double double24 = xYPlot23.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot23.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot23.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot29 = xYPlot23.getRootPlot();
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = xYPlot23.getDomainMarkers(layer30);
        xYPlot23.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        int int38 = categoryPlot37.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot37.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder41 = categoryPlot37.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = categoryPlot46.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup48 = categoryPlot46.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = categoryPlot46.getDomainAxisEdge();
        categoryPlot46.configureDomainAxes();
        java.awt.Paint paint51 = categoryPlot46.getDomainGridlinePaint();
        categoryPlot37.setNoDataMessagePaint(paint51);
        xYPlot23.setBackgroundPaint(paint51);
        xYPlot21.setRangeGridlinePaint(paint51);
        xYPlot0.setDomainZeroBaselinePaint(paint51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot11 and xYPlot21", xYPlot11.equals(xYPlot21) ? xYPlot11.hashCode() == xYPlot21.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot4.getDomainAxisEdge(0);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke14 = xYPlot13.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = xYPlot13.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot13.getRangeAxisLocation();
        java.awt.Paint paint17 = xYPlot13.getDomainTickBandPaint();
        org.jfree.data.general.DatasetGroup datasetGroup18 = xYPlot13.getDatasetGroup();
        int int19 = xYPlot13.getWeight();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = xYPlot13.getAxisOffset();
        categoryPlot4.setAxisOffset(rectangleInsets20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        categoryPlot26.setDomainAxis(0, categoryAxis28, false);
        categoryPlot26.configureDomainAxes();
        java.awt.Stroke stroke32 = categoryPlot26.getDomainGridlineStroke();
        categoryPlot4.setRangeGridlineStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot26", categoryPlot4.equals(categoryPlot26) ? categoryPlot4.hashCode() == categoryPlot26.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
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
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke20 = xYPlot19.getDomainZeroBaselineStroke();
        java.util.List list21 = xYPlot19.getAnnotations();
        java.awt.geom.Point2D point2D22 = xYPlot19.getQuadrantOrigin();
        java.awt.Stroke stroke23 = xYPlot19.getDomainGridlineStroke();
        categoryPlot4.setOutlineStroke(stroke23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis26, valueAxis27, categoryItemRenderer28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot29.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup31 = categoryPlot29.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = categoryPlot29.getDomainAxisEdge();
        categoryPlot29.configureDomainAxes();
        java.awt.Paint paint34 = categoryPlot29.getDomainGridlinePaint();
        java.awt.Paint paint35 = categoryPlot29.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        xYPlot36.drawZeroRangeBaseline(graphics2D37, rectangle2D38);
        org.jfree.data.xy.XYDataset xYDataset41 = xYPlot36.getDataset((int) (short) 0);
        boolean boolean42 = xYPlot36.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        xYPlot36.drawBackgroundImage(graphics2D43, rectangle2D44);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        org.jfree.chart.axis.AxisSpace axisSpace48 = null;
        org.jfree.chart.axis.AxisSpace axisSpace49 = xYPlot36.calculateDomainAxisSpace(graphics2D46, rectangle2D47, axisSpace48);
        categoryPlot29.setFixedRangeAxisSpace(axisSpace49, false);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier30", drawingSupplier5.equals(drawingSupplier30) ? drawingSupplier5.hashCode() == drawingSupplier30.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke5 = xYPlot0.getDomainCrosshairStroke();
        java.lang.String str6 = xYPlot0.getNoDataMessage();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke8 = xYPlot7.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder9 = xYPlot7.getDatasetRenderingOrder();
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
        xYPlot7.setDomainZeroBaselineStroke(stroke24);
        boolean boolean27 = xYPlot7.isRangeZeroBaselineVisible();
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot7.getRangeMarkers(100, layer29);
        boolean boolean31 = xYPlot0.equals((java.lang.Object) xYPlot7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot7", xYPlot0.equals(xYPlot7) ? xYPlot0.hashCode() == xYPlot7.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        xYPlot0.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = categoryPlot12.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot12.getDomainAxisEdge();
        categoryPlot12.configureDomainAxes();
        java.awt.Paint paint17 = categoryPlot12.getDomainGridlinePaint();
        java.awt.Paint paint18 = categoryPlot12.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        xYPlot19.drawZeroRangeBaseline(graphics2D20, rectangle2D21);
        org.jfree.data.xy.XYDataset xYDataset24 = xYPlot19.getDataset((int) (short) 0);
        boolean boolean25 = xYPlot19.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        xYPlot19.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.axis.AxisSpace axisSpace31 = null;
        org.jfree.chart.axis.AxisSpace axisSpace32 = xYPlot19.calculateDomainAxisSpace(graphics2D29, rectangle2D30, axisSpace31);
        categoryPlot12.setFixedRangeAxisSpace(axisSpace32, false);
        xYPlot0.setFixedRangeAxisSpace(axisSpace32, true);
        xYPlot0.configureRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        xYPlot38.drawZeroRangeBaseline(graphics2D39, rectangle2D40);
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot38.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer45 = null;
        java.util.Collection collection46 = xYPlot38.getDomainMarkers(1, layer45);
        org.jfree.chart.LegendItemCollection legendItemCollection47 = xYPlot38.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis49, valueAxis50, categoryItemRenderer51);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier53 = categoryPlot52.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup54 = categoryPlot52.getDatasetGroup();
        boolean boolean55 = categoryPlot52.isDomainZoomable();
        java.awt.Font font56 = categoryPlot52.getNoDataMessageFont();
        xYPlot38.setNoDataMessageFont(font56);
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo60 = null;
        xYPlot38.drawAnnotations(graphics2D58, rectangle2D59, plotRenderingInfo60);
        java.awt.Graphics2D graphics2D62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        org.jfree.chart.axis.AxisSpace axisSpace64 = null;
        org.jfree.chart.axis.AxisSpace axisSpace65 = xYPlot38.calculateDomainAxisSpace(graphics2D62, rectangle2D63, axisSpace64);
        xYPlot0.setFixedRangeAxisSpace(axisSpace65, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier13 and drawingSupplier53", drawingSupplier13.equals(drawingSupplier53) ? drawingSupplier13.hashCode() == drawingSupplier53.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint9 = xYPlot8.getBackgroundPaint();
        xYPlot0.setRangeCrosshairPaint(paint9);
        java.awt.Stroke stroke11 = xYPlot0.getDomainZeroBaselineStroke();
        float float12 = xYPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        double double14 = xYPlot13.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.util.List list17 = null;
        xYPlot13.drawDomainGridlines(graphics2D15, rectangle2D16, list17);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot13.getIndexOf(xYItemRenderer19);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot26.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup28 = categoryPlot26.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot26.getDomainAxisEdge();
        categoryPlot26.configureDomainAxes();
        java.awt.Paint paint31 = categoryPlot26.getDomainGridlinePaint();
        xYPlot21.setNoDataMessagePaint(paint31);
        xYPlot13.setDomainTickBandPaint(paint31);
        xYPlot0.setDomainGridlinePaint(paint31);
        boolean boolean35 = xYPlot0.isDomainCrosshairLockedOnData();
        int int36 = xYPlot0.getDatasetCount();
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        double double38 = xYPlot37.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot37.getDomainAxis(1);
        xYPlot37.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.plot.XYPlot xYPlot44 = new org.jfree.chart.plot.XYPlot();
        double double45 = xYPlot44.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis47 = xYPlot44.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot48 = xYPlot44.getRootPlot();
        xYPlot44.clearRangeMarkers();
        boolean boolean50 = xYPlot44.isRangeCrosshairVisible();
        java.awt.Paint paint51 = xYPlot44.getRangeTickBandPaint();
        boolean boolean52 = xYPlot44.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset53, categoryAxis54, valueAxis55, categoryItemRenderer56);
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer61 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot62 = new org.jfree.chart.plot.CategoryPlot(categoryDataset58, categoryAxis59, valueAxis60, categoryItemRenderer61);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier63 = categoryPlot62.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup64 = categoryPlot62.getDatasetGroup();
        boolean boolean65 = categoryPlot62.isDomainZoomable();
        boolean boolean66 = categoryPlot62.isRangeZoomable();
        categoryPlot62.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        categoryPlot62.setDataset((int) ' ', categoryDataset70);
        java.awt.Stroke stroke72 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot62.setDomainGridlineStroke(stroke72);
        categoryPlot57.setOutlineStroke(stroke72);
        xYPlot44.setOutlineStroke(stroke72);
        xYPlot37.setRangeGridlineStroke(stroke72);
        xYPlot0.setRangeZeroBaselineStroke(stroke72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot8 and xYPlot44", xYPlot8.equals(xYPlot44) ? xYPlot8.hashCode() == xYPlot44.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        categoryPlot4.clearAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot4.getFixedDomainAxisSpace();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        categoryPlot16.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke23 = xYPlot22.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder24 = xYPlot22.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis26, valueAxis27, categoryItemRenderer28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot29.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup31 = categoryPlot29.getDatasetGroup();
        boolean boolean32 = categoryPlot29.isDomainZoomable();
        boolean boolean33 = categoryPlot29.isRangeZoomable();
        categoryPlot29.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        categoryPlot29.setDataset((int) ' ', categoryDataset37);
        java.awt.Stroke stroke39 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot29.setDomainGridlineStroke(stroke39);
        xYPlot22.setDomainZeroBaselineStroke(stroke39);
        java.awt.geom.Point2D point2D42 = xYPlot22.getQuadrantOrigin();
        categoryPlot16.zoomDomainAxes((double) (byte) 1, plotRenderingInfo21, point2D42, false);
        categoryPlot4.zoomRangeAxes((double) (short) -1, plotRenderingInfo11, point2D42, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier30", drawingSupplier5.equals(drawingSupplier30) ? drawingSupplier5.hashCode() == drawingSupplier30.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
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
        float float33 = xYPlot0.getForegroundAlpha();
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        double double35 = xYPlot34.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis37 = xYPlot34.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot38 = xYPlot34.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = xYPlot34.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier22 and drawingSupplier39", drawingSupplier22.equals(drawingSupplier39) ? drawingSupplier22.hashCode() == drawingSupplier39.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot4.getRangeAxis((int) (short) 10);
        categoryPlot4.configureDomainAxes();
        java.util.List list13 = categoryPlot4.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        java.awt.Paint paint19 = categoryPlot18.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.data.xy.XYDataset xYDataset25 = xYPlot20.getDataset((int) (short) 0);
        boolean boolean26 = xYPlot20.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot20.drawBackgroundImage(graphics2D27, rectangle2D28);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.axis.AxisSpace axisSpace32 = null;
        org.jfree.chart.axis.AxisSpace axisSpace33 = xYPlot20.calculateDomainAxisSpace(graphics2D30, rectangle2D31, axisSpace32);
        categoryPlot18.setFixedDomainAxisSpace(axisSpace33, false);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot18", categoryPlot4.equals(categoryPlot18) ? categoryPlot4.hashCode() == categoryPlot18.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        boolean boolean4 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = xYPlot0.getDomainAxis(0);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot11.setDomainAxis(0, categoryAxis13, false);
        categoryPlot11.configureDomainAxes();
        java.awt.Stroke stroke17 = categoryPlot11.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot11.getDomainAxisEdge(0);
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke21 = xYPlot20.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = xYPlot20.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot20.getRangeAxisLocation();
        java.awt.Paint paint24 = xYPlot20.getDomainTickBandPaint();
        org.jfree.data.general.DatasetGroup datasetGroup25 = xYPlot20.getDatasetGroup();
        int int26 = xYPlot20.getWeight();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = xYPlot20.getAxisOffset();
        categoryPlot11.setAxisOffset(rectangleInsets27);
        xYPlot0.setAxisOffset(rectangleInsets27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot20", xYPlot0.equals(xYPlot20) ? xYPlot0.hashCode() == xYPlot20.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot4.getRangeAxisForDataset(10);
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot4.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup23 = categoryPlot21.getDatasetGroup();
        boolean boolean24 = categoryPlot21.isDomainZoomable();
        boolean boolean25 = categoryPlot21.isRangeZoomable();
        categoryPlot21.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        categoryPlot21.setDataset((int) ' ', categoryDataset29);
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot21.setDomainGridlineStroke(stroke31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        categoryPlot37.setRangeCrosshairValue((double) 1L, true);
        boolean boolean41 = categoryPlot21.equals((java.lang.Object) 1L);
        boolean boolean42 = categoryPlot21.isRangeCrosshairVisible();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        org.jfree.chart.axis.AxisSpace axisSpace45 = categoryPlot21.calculateAxisSpace(graphics2D43, rectangle2D44);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace45, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier22", drawingSupplier5.equals(drawingSupplier22) ? drawingSupplier5.hashCode() == drawingSupplier22.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
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
        java.util.List list19 = categoryPlot4.getCategories();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        xYPlot21.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        double double29 = xYPlot28.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot28.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot32 = xYPlot28.getRootPlot();
        xYPlot28.clearRangeMarkers();
        boolean boolean34 = xYPlot28.isRangeCrosshairVisible();
        java.awt.Paint paint35 = xYPlot28.getRangeTickBandPaint();
        boolean boolean36 = xYPlot28.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = categoryPlot46.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup48 = categoryPlot46.getDatasetGroup();
        boolean boolean49 = categoryPlot46.isDomainZoomable();
        boolean boolean50 = categoryPlot46.isRangeZoomable();
        categoryPlot46.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        categoryPlot46.setDataset((int) ' ', categoryDataset54);
        java.awt.Stroke stroke56 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot46.setDomainGridlineStroke(stroke56);
        categoryPlot41.setOutlineStroke(stroke56);
        xYPlot28.setOutlineStroke(stroke56);
        xYPlot21.setRangeGridlineStroke(stroke56);
        java.util.List list61 = xYPlot21.getAnnotations();
        org.jfree.chart.axis.AxisLocation axisLocation62 = xYPlot21.getDomainAxisLocation();
        categoryPlot4.setRangeAxisLocation(1, axisLocation62);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot41.", categoryPlot4.equals(categoryPlot41) == categoryPlot41.equals(categoryPlot4));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        java.awt.Stroke stroke4 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = xYPlot0.getAxisOffset();
        xYPlot0.setRangeCrosshairValue((double) 0.0f, true);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot13.setDomainAxis(0, categoryAxis15, false);
        categoryPlot13.configureDomainAxes();
        java.awt.Stroke stroke19 = categoryPlot13.getDomainGridlineStroke();
        categoryPlot13.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean23 = categoryPlot13.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        boolean boolean28 = categoryPlot13.render(graphics2D24, rectangle2D25, (int) '#', plotRenderingInfo27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = categoryPlot13.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = categoryPlot34.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup36 = categoryPlot34.getDatasetGroup();
        boolean boolean37 = categoryPlot34.isDomainZoomable();
        boolean boolean38 = categoryPlot34.isRangeZoomable();
        categoryPlot34.setRangeGridlinesVisible(true);
        categoryPlot34.clearDomainMarkers();
        categoryPlot34.mapDatasetToRangeAxis(10, (int) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis46 = categoryPlot34.getRangeAxis(100);
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        boolean boolean52 = xYPlot51.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection53 = xYPlot51.getLegendItems();
        categoryPlot34.setFixedLegendItems(legendItemCollection53);
        categoryPlot13.setFixedLegendItems(legendItemCollection53);
        xYPlot0.setFixedLegendItems(legendItemCollection53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot51", xYPlot0.equals(xYPlot51) ? xYPlot0.hashCode() == xYPlot51.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        boolean boolean1 = xYPlot0.isRangeGridlinesVisible();
        boolean boolean2 = xYPlot0.isDomainZeroBaselineVisible();
        boolean boolean3 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot(categoryDataset4, categoryAxis5, valueAxis6, categoryItemRenderer7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot8.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup10 = categoryPlot8.getDatasetGroup();
        boolean boolean11 = categoryPlot8.isRangeCrosshairVisible();
        java.awt.Paint paint12 = categoryPlot8.getRangeGridlinePaint();
        xYPlot0.setRangeTickBandPaint(paint12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot0.getAxisOffset();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        double double16 = xYPlot15.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.util.List list19 = null;
        xYPlot15.drawDomainGridlines(graphics2D17, rectangle2D18, list19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = xYPlot15.getDrawingSupplier();
        java.awt.Paint paint22 = xYPlot15.getDomainZeroBaselinePaint();
        java.util.List list23 = xYPlot15.getAnnotations();
        java.awt.Stroke stroke24 = xYPlot15.getDomainGridlineStroke();
        java.awt.Paint paint25 = xYPlot15.getDomainZeroBaselinePaint();
        xYPlot0.setOutlinePaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier21", drawingSupplier9.equals(drawingSupplier21) ? drawingSupplier9.hashCode() == drawingSupplier21.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.data.xy.XYDataset xYDataset2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = null;
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot(xYDataset2, valueAxis3, valueAxis4, xYItemRenderer5);
        boolean boolean7 = xYPlot6.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot6.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot13.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot13.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot13.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) ' ', categoryAxis18);
        categoryPlot13.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot13.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot13.getRangeAxisLocation();
        xYPlot6.setDomainAxisLocation(axisLocation24);
        categoryPlot0.setDomainAxisLocation(axisLocation24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis29, valueAxis30, categoryItemRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        categoryPlot32.setDomainAxis(0, categoryAxis34, false);
        categoryPlot32.configureDomainAxes();
        java.awt.Stroke stroke38 = categoryPlot32.getDomainGridlineStroke();
        categoryPlot32.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean42 = categoryPlot32.isRangeGridlinesVisible();
        categoryPlot32.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = categoryPlot32.getDomainAxisForDataset((int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis48, valueAxis49, categoryItemRenderer50);
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = null;
        categoryPlot51.setDomainAxis(0, categoryAxis53, false);
        categoryPlot51.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis58 = categoryPlot51.getRangeAxis((int) (short) 10);
        categoryPlot51.configureDomainAxes();
        java.util.List list60 = categoryPlot51.getCategories();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = categoryPlot51.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = categoryPlot51.getAxisOffset();
        categoryPlot32.setInsets(rectangleInsets62, true);
        org.jfree.chart.plot.XYPlot xYPlot65 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis67 = xYPlot65.getDomainAxis(10);
        xYPlot65.configureDomainAxes();
        java.awt.Paint paint69 = xYPlot65.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis70 = null;
        org.jfree.data.Range range71 = xYPlot65.getDataRange(valueAxis70);
        xYPlot65.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation75 = xYPlot65.getRangeAxisLocation(15);
        categoryPlot32.setRangeAxisLocation(axisLocation75);
        categoryPlot0.setDomainAxisLocation((int) 'a', axisLocation75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot13 and categoryPlot51", categoryPlot13.equals(categoryPlot51) ? categoryPlot13.hashCode() == categoryPlot51.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        xYPlot0.setWeight((int) (short) -1);
        java.lang.Object obj4 = xYPlot0.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = xYPlot0.getRangeAxisEdge((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and obj4", xYPlot0.equals(obj4) ? xYPlot0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.clearDomainMarkers((int) (short) 10);
        int int10 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke15 = xYPlot14.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = xYPlot14.getRangeAxisIndex(valueAxis16);
        xYPlot14.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        double double23 = xYPlot22.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot22.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot22.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = xYPlot22.getDrawingSupplier();
        java.awt.geom.Point2D point2D28 = xYPlot22.getQuadrantOrigin();
        xYPlot14.zoomRangeAxes((double) (short) 10, plotRenderingInfo21, point2D28);
        xYPlot0.zoomRangeAxes((double) 1.0f, (double) (byte) 0, plotRenderingInfo13, point2D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot22", xYPlot0.equals(xYPlot22) ? xYPlot0.hashCode() == xYPlot22.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
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
        int int14 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D16, rectangle2D17);
        boolean boolean19 = xYPlot15.isDomainCrosshairVisible();
        xYPlot15.setRangeCrosshairVisible(true);
        xYPlot15.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis24, valueAxis25, categoryItemRenderer26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot27.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup29 = categoryPlot27.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot27.getDomainAxisEdge();
        categoryPlot27.configureDomainAxes();
        java.awt.Paint paint32 = categoryPlot27.getDomainGridlinePaint();
        java.awt.Paint paint33 = categoryPlot27.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        xYPlot34.drawZeroRangeBaseline(graphics2D35, rectangle2D36);
        org.jfree.data.xy.XYDataset xYDataset39 = xYPlot34.getDataset((int) (short) 0);
        boolean boolean40 = xYPlot34.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        xYPlot34.drawBackgroundImage(graphics2D41, rectangle2D42);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.axis.AxisSpace axisSpace46 = null;
        org.jfree.chart.axis.AxisSpace axisSpace47 = xYPlot34.calculateDomainAxisSpace(graphics2D44, rectangle2D45, axisSpace46);
        categoryPlot27.setFixedRangeAxisSpace(axisSpace47, false);
        xYPlot15.setFixedRangeAxisSpace(axisSpace47, true);
        categoryPlot4.setFixedRangeAxisSpace(axisSpace47, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot27", categoryPlot4.equals(categoryPlot27) ? categoryPlot4.hashCode() == categoryPlot27.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getRangeAxisLocation();
        boolean boolean4 = xYPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        xYPlot5.drawZeroRangeBaseline(graphics2D6, rectangle2D7);
        org.jfree.data.xy.XYDataset xYDataset10 = xYPlot5.getDataset((int) (short) 0);
        java.awt.Paint paint11 = xYPlot5.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        xYPlot5.rendererChanged(rendererChangeEvent12);
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot5.getRangeAxisLocation();
        java.awt.Paint paint15 = xYPlot5.getRangeZeroBaselinePaint();
        xYPlot0.setRangeTickBandPaint(paint15);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        double double19 = xYPlot18.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        java.util.List list22 = null;
        xYPlot18.drawDomainGridlines(graphics2D20, rectangle2D21, list22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = xYPlot18.getDrawingSupplier();
        java.awt.Paint paint25 = xYPlot18.getDomainZeroBaselinePaint();
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        int int27 = xYPlot18.indexOf(xYDataset26);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        int int29 = xYPlot18.getDomainAxisIndex(valueAxis28);
        boolean boolean30 = xYPlot18.isRangeGridlinesVisible();
        float float31 = xYPlot18.getBackgroundImageAlpha();
        java.lang.String str32 = xYPlot18.getPlotType();
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot18.getRangeAxisLocation((int) (short) 1);
        xYPlot0.setDomainAxisLocation((int) ' ', axisLocation34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot5 and xYPlot18", xYPlot5.equals(xYPlot18) ? xYPlot5.hashCode() == xYPlot18.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
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
        java.lang.String str14 = xYPlot0.getPlotType();
        xYPlot0.configureDomainAxes();
        xYPlot0.setDomainCrosshairValue((double) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot24.getDomainAxis(10);
        xYPlot24.configureDomainAxes();
        java.awt.Paint paint28 = xYPlot24.getDomainCrosshairPaint();
        categoryPlot23.setRangeGridlinePaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = categoryPlot34.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup36 = categoryPlot34.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        categoryPlot34.setRenderer(categoryItemRenderer37);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray40 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis39 };
        categoryPlot34.setDomainAxes(categoryAxisArray40);
        categoryPlot23.setDomainAxes(categoryAxisArray40);
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        org.jfree.chart.util.Layer layer46 = null;
        categoryPlot23.drawDomainMarkers(graphics2D43, rectangle2D44, (int) (byte) -1, layer46);
        categoryPlot23.setWeight((int) (byte) 100);
        org.jfree.chart.axis.AxisLocation axisLocation51 = categoryPlot23.getDomainAxisLocation((int) (short) 0);
        xYPlot0.setDomainAxisLocation((int) 'a', axisLocation51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier6 and drawingSupplier35", drawingSupplier6.equals(drawingSupplier35) ? drawingSupplier6.hashCode() == drawingSupplier35.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot9.getDrawingSupplier();
        java.awt.Stroke stroke11 = categoryPlot9.getRangeGridlineStroke();
        xYPlot0.setRangeGridlineStroke(stroke11);
        xYPlot0.mapDatasetToDomainAxis((int) '4', (int) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot20.setDomainAxis(0, categoryAxis22, false);
        categoryPlot20.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis27 = categoryPlot20.getRangeAxis((int) (short) 10);
        categoryPlot20.configureDomainAxes();
        java.util.List list29 = categoryPlot20.getCategories();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot20.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = categoryPlot20.getAxisOffset();
        xYPlot0.setAxisOffset(rectangleInsets31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot9 and categoryPlot20", categoryPlot9.equals(categoryPlot20) ? categoryPlot9.hashCode() == categoryPlot20.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        xYPlot0.setOutlineVisible(true);
        xYPlot0.setDomainCrosshairValue((double) ' ', true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        int int14 = categoryPlot13.getDomainAxisCount();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        boolean boolean20 = xYPlot19.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = xYPlot19.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot26.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder28 = categoryPlot26.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot26.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot26.setDomainAxis((int) ' ', categoryAxis31);
        categoryPlot26.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = categoryPlot26.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot26.getRangeAxisLocation();
        xYPlot19.setDomainAxisLocation(axisLocation37);
        categoryPlot13.setDomainAxisLocation(axisLocation37);
        xYPlot0.setRangeAxisLocation(0, axisLocation37);
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke42 = xYPlot41.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        int int44 = xYPlot41.getRangeAxisIndex(valueAxis43);
        xYPlot41.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        double double50 = xYPlot49.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot49.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot49.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = xYPlot49.getDrawingSupplier();
        java.awt.geom.Point2D point2D55 = xYPlot49.getQuadrantOrigin();
        xYPlot41.zoomRangeAxes((double) (short) 10, plotRenderingInfo48, point2D55);
        org.jfree.chart.axis.AxisLocation axisLocation58 = xYPlot41.getDomainAxisLocation(0);
        xYPlot0.setRangeAxisLocation(axisLocation58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier27 and drawingSupplier54", drawingSupplier27.equals(drawingSupplier54) ? drawingSupplier27.hashCode() == drawingSupplier54.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        java.util.List list8 = xYPlot0.getAnnotations();
        java.awt.Stroke stroke9 = xYPlot0.getDomainGridlineStroke();
        java.awt.Paint paint10 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot11.getDomainAxis(10);
        xYPlot11.configureDomainAxes();
        java.awt.Paint paint15 = xYPlot11.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = xYPlot11.getDataRange(valueAxis16);
        xYPlot11.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot11.getRangeAxisLocation(15);
        xYPlot0.setDomainAxisLocation(axisLocation21);
        xYPlot0.mapDatasetToRangeAxis((int) (short) 1, (int) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = categoryPlot30.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup32 = categoryPlot30.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        categoryPlot30.setRenderer(categoryItemRenderer33);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot30.setDomainAxis(categoryAxis35);
        categoryPlot30.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        categoryPlot30.setDataset((int) (byte) 0, categoryDataset39);
        categoryPlot30.clearDomainAxes();
        java.awt.Paint paint42 = categoryPlot30.getBackgroundPaint();
        xYPlot0.setRangeGridlinePaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier6 and drawingSupplier31", drawingSupplier6.equals(drawingSupplier31) ? drawingSupplier6.hashCode() == drawingSupplier31.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        categoryPlot30.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke37 = xYPlot36.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder38 = xYPlot36.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = categoryPlot43.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup45 = categoryPlot43.getDatasetGroup();
        boolean boolean46 = categoryPlot43.isDomainZoomable();
        boolean boolean47 = categoryPlot43.isRangeZoomable();
        categoryPlot43.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        categoryPlot43.setDataset((int) ' ', categoryDataset51);
        java.awt.Stroke stroke53 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot43.setDomainGridlineStroke(stroke53);
        xYPlot36.setDomainZeroBaselineStroke(stroke53);
        java.awt.geom.Point2D point2D56 = xYPlot36.getQuadrantOrigin();
        categoryPlot30.zoomDomainAxes((double) (byte) 1, plotRenderingInfo35, point2D56, false);
        categoryPlot4.zoomRangeAxes((double) 0.0f, plotRenderingInfo25, point2D56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot9 and categoryPlot43", categoryPlot9.equals(categoryPlot43) ? categoryPlot9.hashCode() == categoryPlot43.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
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
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot30.drawZeroRangeBaseline(graphics2D31, rectangle2D32);
        boolean boolean34 = xYPlot30.isDomainCrosshairVisible();
        xYPlot30.setRangeCrosshairVisible(true);
        int int37 = xYPlot30.getRangeAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        xYPlot38.drawZeroRangeBaseline(graphics2D39, rectangle2D40);
        org.jfree.data.xy.XYDataset xYDataset43 = xYPlot38.getDataset((int) (short) 0);
        java.awt.Paint paint44 = xYPlot38.getOutlinePaint();
        int int45 = xYPlot38.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection46 = xYPlot38.getLegendItems();
        xYPlot30.setFixedLegendItems(legendItemCollection46);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = null;
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot(categoryDataset49, categoryAxis50, valueAxis51, categoryItemRenderer52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = categoryPlot53.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder55 = categoryPlot53.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation56 = categoryPlot53.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = null;
        categoryPlot53.setDomainAxis((int) ' ', categoryAxis58);
        categoryPlot53.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = categoryPlot53.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation64 = categoryPlot53.getRangeAxisLocation();
        xYPlot30.setDomainAxisLocation((int) (short) 1, axisLocation64);
        boolean boolean66 = xYPlot0.equals((java.lang.Object) xYPlot30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot38", xYPlot0.equals(xYPlot38) ? xYPlot0.hashCode() == xYPlot38.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setRangeAxes(valueAxisArray5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot8.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = xYPlot8.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        xYPlot8.axisChanged(axisChangeEvent13);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        double double16 = xYPlot15.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot15.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot15.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot21 = xYPlot15.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = xYPlot15.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot15.getRangeAxis();
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke25 = xYPlot24.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        int int27 = xYPlot24.getRangeAxisIndex(valueAxis26);
        xYPlot24.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        double double33 = xYPlot32.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis35 = xYPlot32.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis36 = xYPlot32.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = xYPlot32.getDrawingSupplier();
        java.awt.geom.Point2D point2D38 = xYPlot32.getQuadrantOrigin();
        xYPlot24.zoomRangeAxes((double) (short) 10, plotRenderingInfo31, point2D38);
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = xYPlot24.getDomainMarkers(layer40);
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot24.getRangeAxisLocation(100);
        xYPlot15.setRangeAxisLocation(axisLocation43);
        xYPlot8.setDomainAxisLocation(axisLocation43);
        xYPlot4.setDomainAxisLocation(axisLocation43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot4 and xYPlot8", xYPlot4.equals(xYPlot8) ? xYPlot4.hashCode() == xYPlot8.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        categoryPlot4.setRangeCrosshairValue((double) (-1), true);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot15.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder19 = categoryPlot15.getColumnRenderingOrder();
        categoryPlot4.setRowRenderingOrder(sortOrder19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        categoryPlot25.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot25.getAxisOffset();
        int int30 = categoryPlot25.getWeight();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot35.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder37 = categoryPlot35.getRowRenderingOrder();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke41 = xYPlot40.getDomainZeroBaselineStroke();
        java.util.List list42 = xYPlot40.getAnnotations();
        categoryPlot35.drawRangeGridlines(graphics2D38, rectangle2D39, list42);
        org.jfree.chart.util.SortOrder sortOrder44 = categoryPlot35.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot35.getDomainAxisLocation();
        categoryPlot25.setDomainAxisLocation(axisLocation45, false);
        categoryPlot4.setRangeAxisLocation(axisLocation45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot15 and categoryPlot35", categoryPlot15.equals(categoryPlot35) ? categoryPlot15.hashCode() == categoryPlot35.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot4.getRangeAxisForDataset(10);
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot4.getOrientation();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.plot.PlotOrientation plotOrientation21 = xYPlot17.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        xYPlot17.axisChanged(axisChangeEvent22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        int int29 = categoryPlot28.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot28.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder32 = categoryPlot28.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = categoryPlot37.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup39 = categoryPlot37.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = categoryPlot37.getDomainAxisEdge();
        categoryPlot37.configureDomainAxes();
        java.awt.Paint paint42 = categoryPlot37.getDomainGridlinePaint();
        categoryPlot28.setNoDataMessagePaint(paint42);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot28.getAxisOffset();
        xYPlot17.setAxisOffset(rectangleInsets44);
        categoryPlot4.setAxisOffset(rectangleInsets44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot4 and categoryPlot37", categoryPlot4.equals(categoryPlot37) ? categoryPlot4.hashCode() == categoryPlot37.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot4.getDomainAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot4.getFixedLegendItems();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot4.getDomainMarkers(layer8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot4.getDomainAxis();
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
        org.jfree.chart.util.SortOrder sortOrder26 = categoryPlot15.getRowRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        int int28 = categoryPlot15.getIndexOf(categoryItemRenderer27);
        categoryPlot15.setRangeCrosshairLockedOnData(false);
        int int31 = categoryPlot15.getWeight();
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        double double33 = xYPlot32.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        java.util.List list36 = null;
        xYPlot32.drawDomainGridlines(graphics2D34, rectangle2D35, list36);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.axis.AxisSpace axisSpace40 = xYPlot32.calculateAxisSpace(graphics2D38, rectangle2D39);
        xYPlot32.setRangeGridlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = xYPlot32.getAxisOffset();
        categoryPlot15.setInsets(rectangleInsets43);
        categoryPlot4.setInsets(rectangleInsets43, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = null;
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot(categoryDataset49, categoryAxis50, valueAxis51, categoryItemRenderer52);
        categoryPlot53.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        categoryPlot53.setDomainAxis(categoryAxis57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer62 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot63 = new org.jfree.chart.plot.CategoryPlot(categoryDataset59, categoryAxis60, valueAxis61, categoryItemRenderer62);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier64 = categoryPlot63.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder65 = categoryPlot63.getRowRenderingOrder();
        categoryPlot53.setColumnRenderingOrder(sortOrder65);
        boolean boolean67 = categoryPlot53.isRangeGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis68 = categoryPlot53.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo70 = null;
        org.jfree.chart.plot.XYPlot xYPlot71 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke72 = xYPlot71.getDomainZeroBaselineStroke();
        java.util.List list73 = xYPlot71.getAnnotations();
        java.awt.Graphics2D graphics2D74 = null;
        java.awt.geom.Rectangle2D rectangle2D75 = null;
        xYPlot71.drawZeroRangeBaseline(graphics2D74, rectangle2D75);
        java.awt.geom.Point2D point2D77 = xYPlot71.getQuadrantOrigin();
        categoryPlot53.zoomDomainAxes((double) (-1), plotRenderingInfo70, point2D77);
        categoryPlot4.zoomDomainAxes((double) 1.0f, plotRenderingInfo48, point2D77, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier64", drawingSupplier5.equals(drawingSupplier64) ? drawingSupplier5.hashCode() == drawingSupplier64.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot4.getDataRange(valueAxis10);
        int int12 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.setRangeCrosshairValue(1.0d, false);
        categoryPlot4.mapDatasetToDomainAxis(0, (int) (byte) 10);
        int int19 = categoryPlot4.getDatasetCount();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot20.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        double double28 = xYPlot27.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot27.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot31 = xYPlot27.getRootPlot();
        xYPlot27.clearRangeMarkers();
        boolean boolean33 = xYPlot27.isRangeCrosshairVisible();
        xYPlot27.mapDatasetToRangeAxis((int) (byte) 10, (int) '#');
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = categoryPlot41.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup43 = categoryPlot41.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = null;
        categoryPlot41.setRenderer(categoryItemRenderer44);
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray47 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis46 };
        categoryPlot41.setDomainAxes(categoryAxisArray47);
        boolean boolean49 = categoryPlot41.isRangeCrosshairVisible();
        java.awt.Paint paint50 = categoryPlot41.getDomainGridlinePaint();
        xYPlot27.setRangeZeroBaselinePaint(paint50);
        xYPlot20.setQuadrantPaint(0, paint50);
        java.awt.Paint paint53 = xYPlot20.getDomainZeroBaselinePaint();
        categoryPlot4.setOutlinePaint(paint53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier42", drawingSupplier5.equals(drawingSupplier42) ? drawingSupplier5.hashCode() == drawingSupplier42.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot8.getDomainAxis(10);
        xYPlot8.configureDomainAxes();
        java.awt.Paint paint12 = xYPlot8.getDomainCrosshairPaint();
        java.awt.Stroke stroke13 = xYPlot8.getDomainCrosshairStroke();
        java.lang.String str14 = xYPlot8.getNoDataMessage();
        boolean boolean15 = xYPlot8.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot8.setDomainAxis((int) (byte) 100, valueAxis17);
        java.awt.geom.Point2D point2D19 = xYPlot8.getQuadrantOrigin();
        xYPlot0.setQuadrantOrigin(point2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot8", xYPlot0.equals(xYPlot8) ? xYPlot0.hashCode() == xYPlot8.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot4.drawDomainGridlines(graphics2D7, rectangle2D8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot15.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        xYPlot19.drawZeroRangeBaseline(graphics2D20, rectangle2D21);
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot19.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint26 = xYPlot25.getBackgroundPaint();
        xYPlot19.setRangeZeroBaselinePaint(paint26);
        categoryPlot15.setBackgroundPaint(paint26);
        boolean boolean29 = categoryPlot15.isRangeZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot15.getDomainAxisLocation();
        categoryPlot4.setDomainAxisLocation((int) '4', axisLocation30, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot4 and categoryPlot15.", categoryPlot4.equals(categoryPlot15) == categoryPlot15.equals(categoryPlot4));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
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
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot17.setRangeAxes(valueAxisArray18);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        xYPlot17.setRangeAxis(1, valueAxis21);
        java.awt.Paint paint23 = xYPlot17.getDomainGridlinePaint();
        java.awt.Paint paint24 = xYPlot17.getRangeZeroBaselinePaint();
        xYPlot17.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) -1);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        xYPlot0.setDomainAxisLocation((int) '#', axisLocation29);
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        double double32 = xYPlot31.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis34 = xYPlot31.getDomainAxis(1);
        xYPlot31.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection38 = xYPlot31.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        xYPlot31.setRangeAxis((int) (short) 10, valueAxis40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = categoryPlot46.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder48 = categoryPlot46.getRowRenderingOrder();
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke52 = xYPlot51.getDomainZeroBaselineStroke();
        java.util.List list53 = xYPlot51.getAnnotations();
        categoryPlot46.drawRangeGridlines(graphics2D49, rectangle2D50, list53);
        org.jfree.chart.util.SortOrder sortOrder55 = categoryPlot46.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot46.getDomainAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot57 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        xYPlot57.drawZeroRangeBaseline(graphics2D58, rectangle2D59);
        org.jfree.data.xy.XYDataset xYDataset62 = xYPlot57.getDataset((int) (short) 0);
        java.awt.Paint paint63 = xYPlot57.getOutlinePaint();
        xYPlot57.setDomainZeroBaselineVisible(true);
        xYPlot57.setDomainCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotOrientation plotOrientation68 = xYPlot57.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge69 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation56, plotOrientation68);
        xYPlot31.setOrientation(plotOrientation68);
        org.jfree.chart.util.RectangleEdge rectangleEdge71 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation29, plotOrientation68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on xYPlot0 and xYPlot51.", xYPlot0.equals(xYPlot51) == xYPlot51.equals(xYPlot0));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(layer7);
        xYPlot0.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        java.awt.Stroke stroke16 = categoryPlot14.getRangeGridlineStroke();
        xYPlot0.setDomainGridlineStroke(stroke16);
        xYPlot0.mapDatasetToDomainAxis((int) (short) 10, (int) (short) 0);
        float float21 = xYPlot0.getBackgroundImageAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = xYPlot0.getLegendItems();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis26, valueAxis27, categoryItemRenderer28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot29.setDomainAxis(0, categoryAxis31, false);
        categoryPlot29.configureDomainAxes();
        java.awt.Stroke stroke35 = categoryPlot29.getDomainGridlineStroke();
        categoryPlot29.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean39 = categoryPlot29.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot29.getDomainAxisLocation(10);
        java.util.List list42 = categoryPlot29.getAnnotations();
        xYPlot0.drawRangeTickBands(graphics2D23, rectangle2D24, list42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot14 and categoryPlot29.", categoryPlot14.equals(categoryPlot29) == categoryPlot29.equals(categoryPlot14));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
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
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D16, rectangle2D17);
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = xYPlot15.getOrientation();
        org.jfree.chart.axis.AxisSpace axisSpace20 = xYPlot15.getFixedDomainAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot25.setDomainAxis(0, categoryAxis27, false);
        categoryPlot25.configureDomainAxes();
        java.awt.Stroke stroke31 = categoryPlot25.getDomainGridlineStroke();
        categoryPlot25.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean35 = categoryPlot25.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot25.getDomainAxisLocation(10);
        xYPlot15.setDomainAxisLocation(axisLocation37);
        xYPlot0.setDomainAxisLocation(axisLocation37, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot15", xYPlot0.equals(xYPlot15) ? xYPlot0.hashCode() == xYPlot15.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        categoryPlot23.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot23.setDomainAxis(categoryAxis27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = categoryPlot33.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot33.getRowRenderingOrder();
        categoryPlot23.setColumnRenderingOrder(sortOrder35);
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot23.getDomainAxisEdge(0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot23.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot5 and categoryPlot33", categoryPlot5.equals(categoryPlot33) ? categoryPlot5.hashCode() == categoryPlot33.hashCode() : true);
    }
}

