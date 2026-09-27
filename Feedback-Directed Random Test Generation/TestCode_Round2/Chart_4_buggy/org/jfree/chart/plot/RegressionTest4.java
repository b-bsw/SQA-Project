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
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot7.zoomRangeAxes((double) '#', plotRenderingInfo9, point2D10);
        int int12 = xYPlot7.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray13 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot7.setRenderers(xYItemRendererArray13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot7.setOutlineStroke(stroke15);
        double double17 = xYPlot7.getDomainCrosshairValue();
        boolean boolean18 = xYPlot7.isRangeCrosshairVisible();
        java.awt.Paint paint19 = xYPlot7.getBackgroundPaint();
        xYPlot0.setRangeZeroBaselinePaint(paint19);
        xYPlot0.clearRangeAxes();
        boolean boolean22 = xYPlot0.isDomainPannable();
        org.jfree.chart.plot.Marker marker23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray13);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray13, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot0.setDomainAxis(valueAxis10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        int int13 = xYPlot0.getIndexOf(xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot0.getRangeZeroBaselineStroke();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        double double10 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getRangeAxisIndex(valueAxis11);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        boolean boolean16 = xYPlot0.removeDomainMarker((int) 'a', marker14, layer15);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot0.getRangeMarkers((-1), layer18);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(collection19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        xYPlot0.setRangeCrosshairValue(0.0d, true);
        boolean boolean12 = xYPlot0.isDomainMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        int int18 = xYPlot13.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray19 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot13.setRenderers(xYItemRendererArray19);
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot13.setOutlineStroke(stroke21);
        double double23 = xYPlot13.getDomainCrosshairValue();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot13.setDomainMinorGridlineStroke(stroke24);
        xYPlot0.setDomainZeroBaselineStroke(stroke24);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot27.zoomRangeAxes((double) '#', plotRenderingInfo29, point2D30);
        int int32 = xYPlot27.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray33 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot27.setRenderers(xYItemRendererArray33);
        xYPlot27.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        int int38 = xYPlot37.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = null;
        xYPlot37.setRenderer((int) (short) 1, xYItemRenderer40, false);
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot37.getDomainAxisLocation();
        boolean boolean44 = xYPlot37.isRangeMinorGridlinesVisible();
        boolean boolean45 = xYPlot37.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = xYPlot37.getRenderer();
        int int47 = xYPlot37.getRendererCount();
        xYPlot37.setForegroundAlpha((float) '4');
        xYPlot37.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation52 = xYPlot37.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.plot.Marker marker54 = null;
        org.jfree.chart.util.Layer layer55 = null;
        boolean boolean56 = xYPlot37.removeDomainMarker(2, marker54, layer55);
        java.awt.Stroke stroke57 = xYPlot37.getRangeCrosshairStroke();
        xYPlot27.setRangeMinorGridlineStroke(stroke57);
        xYPlot0.setDomainZeroBaselineStroke(stroke57);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = xYPlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray19);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray19, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray33);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray33, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(xYItemRenderer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(axisLocation52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(drawingSupplier60);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = xYPlot6.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = null;
        int int9 = xYPlot6.getIndexOf(xYItemRenderer8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot6.zoomRangeAxes((double) 15, plotRenderingInfo11, point2D12);
        java.awt.Stroke stroke14 = xYPlot6.getDomainMinorGridlineStroke();
        xYPlot0.setRangeGridlineStroke(stroke14);
        xYPlot0.configureRangeAxes();
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        boolean boolean20 = xYPlot0.removeDomainMarker((-1), marker18, layer19);
        xYPlot0.clearRangeMarkers(10);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = xYPlot0.getAxisOffset();
        boolean boolean24 = xYPlot0.isDomainPannable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        xYPlot0.zoom((double) (byte) 100);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = xYPlot0.getLegendItems();
        xYPlot0.setDomainZeroBaselineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot0.getRangeAxis(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo14, point2D15, true);
        boolean boolean18 = xYPlot0.isNotify();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot0.setRangeAxis(valueAxis19);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        xYPlot23.zoomRangeAxes((double) '#', plotRenderingInfo25, point2D26);
        int int28 = xYPlot23.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray29 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot23.setRenderers(xYItemRendererArray29);
        java.awt.Stroke stroke31 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot23.setOutlineStroke(stroke31);
        double double33 = xYPlot23.getDomainCrosshairValue();
        boolean boolean34 = xYPlot23.isRangeCrosshairVisible();
        float float35 = xYPlot23.getBackgroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        xYPlot23.panRangeAxes((double) 100, plotRenderingInfo37, point2D38);
        java.awt.Paint paint40 = xYPlot23.getOutlinePaint();
        xYPlot0.setOutlinePaint(paint40);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        int int43 = xYPlot0.getRangeAxisIndex(valueAxis42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray29);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray29, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        double double10 = xYPlot0.getDomainCrosshairValue();
        xYPlot0.mapDatasetToDomainAxis((int) (short) 10, 10);
        xYPlot0.setDomainMinorGridlinesVisible(false);
        java.awt.Paint paint16 = xYPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getDomainAxisIndex(valueAxis11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.util.List list15 = null;
        xYPlot0.drawRangeGridlines(graphics2D13, rectangle2D14, list15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        int int18 = xYPlot17.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        xYPlot17.setRenderer((int) (short) 1, xYItemRenderer20, false);
        xYPlot17.setRangePannable(false);
        int int25 = xYPlot17.getBackgroundImageAlignment();
        boolean boolean26 = xYPlot17.isDomainZeroBaselineVisible();
        java.awt.Paint paint27 = xYPlot17.getRangeZeroBaselinePaint();
        xYPlot0.setDomainGridlinePaint(paint27);
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot0.getRangeAxis();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) 0, (int) (short) 0);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = xYPlot0.getRangeAxisEdge();
        java.awt.Paint paint34 = xYPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        int int36 = xYPlot35.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        xYPlot35.setRenderer((int) (short) 1, xYItemRenderer38, false);
        xYPlot35.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        xYPlot35.setRangeAxis(valueAxis43);
        java.awt.Stroke stroke45 = xYPlot35.getDomainGridlineStroke();
        xYPlot35.clearRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        java.awt.geom.Point2D point2D50 = null;
        xYPlot47.zoomRangeAxes((double) '#', plotRenderingInfo49, point2D50);
        int int52 = xYPlot47.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray53 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot47.setRenderers(xYItemRendererArray53);
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot47.setOutlineStroke(stroke55);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = xYPlot47.getAxisOffset();
        xYPlot35.setInsets(rectangleInsets57, true);
        xYPlot0.setInsets(rectangleInsets57, true);
        java.awt.Stroke stroke62 = xYPlot0.getRangeZeroBaselineStroke();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 15 + "'", int52 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray53);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray53, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(rectangleInsets57);
        org.junit.Assert.assertNotNull(stroke62);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot0.calculateRangeAxisSpace(graphics2D10, rectangle2D11, axisSpace12);
        boolean boolean14 = xYPlot0.isDomainMinorGridlinesVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = xYPlot0.getDomainAxisEdge();
        java.awt.Paint paint16 = xYPlot0.getNoDataMessagePaint();
        int int17 = xYPlot0.getDatasetCount();
        xYPlot0.setDomainCrosshairLockedOnData(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = xYPlot0.getAxisOffset();
        org.jfree.chart.plot.Marker marker11 = null;
        boolean boolean12 = xYPlot0.removeDomainMarker(marker11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot0.setDomainAxis((int) (short) 100, valueAxis14, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot0.drawQuadrants(graphics2D13, rectangle2D14);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = xYPlot0.getRendererForDataset(xYDataset16);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot0.setRenderer((int) (byte) 10, xYItemRenderer19);
        java.awt.Paint paint21 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot22.zoomRangeAxes((double) '#', plotRenderingInfo24, point2D25);
        int int27 = xYPlot22.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray28 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot22.setRenderers(xYItemRendererArray28);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot22.setOutlineStroke(stroke30);
        xYPlot22.setDomainCrosshairLockedOnData(true);
        boolean boolean34 = xYPlot22.isDomainZoomable();
        xYPlot22.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        int int38 = xYPlot37.getDomainAxisCount();
        xYPlot37.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        int int42 = xYPlot41.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = null;
        xYPlot41.setRenderer((int) (short) 1, xYItemRenderer44, false);
        xYPlot41.setRangePannable(false);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot41.setOutlinePaint(paint49);
        xYPlot37.setDomainMinorGridlinePaint(paint49);
        xYPlot22.setDomainTickBandPaint(paint49);
        xYPlot0.setDomainGridlinePaint(paint49);
        java.awt.Image image54 = xYPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(xYItemRenderer17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray28);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray28, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(image54);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        boolean boolean11 = xYPlot0.isRangeZoomable();
        java.awt.Stroke stroke12 = xYPlot0.getRangeMinorGridlineStroke();
        java.awt.geom.Point2D point2D13 = xYPlot0.getQuadrantOrigin();
        java.awt.Paint paint14 = xYPlot0.getRangeMinorGridlinePaint();
        org.jfree.chart.plot.Plot plot15 = xYPlot0.getParent();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(point2D13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo14, point2D15, true);
        java.awt.Paint paint18 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        int int20 = xYPlot19.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        xYPlot19.setRenderer((int) (short) 1, xYItemRenderer22, false);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot19.getDomainAxisLocation();
        boolean boolean26 = xYPlot19.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        org.jfree.chart.plot.CrosshairState crosshairState32 = null;
        boolean boolean33 = xYPlot27.render(graphics2D28, rectangle2D29, 10, plotRenderingInfo31, crosshairState32);
        int int34 = xYPlot27.getDomainAxisCount();
        java.lang.String str35 = xYPlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        xYPlot27.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot27.setRangeTickBandPaint(paint38);
        xYPlot19.setDomainCrosshairPaint(paint38);
        boolean boolean41 = xYPlot19.isSubplot();
        java.awt.Paint paint42 = xYPlot19.getDomainCrosshairPaint();
        org.jfree.chart.plot.Marker marker43 = null;
        boolean boolean44 = xYPlot19.removeDomainMarker(marker43);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder45 = xYPlot19.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot19.getDomainAxisLocation();
        xYPlot0.setDomainAxisLocation(axisLocation46);
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        org.jfree.chart.plot.CrosshairState crosshairState53 = null;
        boolean boolean54 = xYPlot48.render(graphics2D49, rectangle2D50, 10, plotRenderingInfo52, crosshairState53);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        java.awt.geom.Point2D point2D57 = null;
        xYPlot48.panDomainAxes((double) (byte) 1, plotRenderingInfo56, point2D57);
        xYPlot48.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer62 = null;
        java.util.Collection collection63 = xYPlot48.getRangeMarkers((int) '4', layer62);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer64 = null;
        int int65 = xYPlot48.getIndexOf(xYItemRenderer64);
        java.awt.Paint paint66 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot48.setDomainMinorGridlinePaint(paint66);
        xYPlot0.setRangeMinorGridlinePaint(paint66);
        xYPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(seriesRenderingOrder45);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(collection63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(paint66);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot0.getDomainAxis();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawQuadrants(graphics2D10, rectangle2D11);
        boolean boolean13 = xYPlot0.isDomainMinorGridlinesVisible();
        xYPlot0.setBackgroundImageAlignment(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        int int11 = xYPlot10.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        xYPlot10.setRenderer((int) (short) 1, xYItemRenderer13, false);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot10.getDomainAxisLocation();
        boolean boolean17 = xYPlot10.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot10.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        int int21 = xYPlot10.getDomainAxisIndex(valueAxis20);
        xYPlot10.mapDatasetToDomainAxis(1, 15);
        int int25 = xYPlot10.getRendererCount();
        java.awt.Paint paint26 = xYPlot10.getBackgroundPaint();
        xYPlot0.setRangeZeroBaselinePaint(paint26);
        java.awt.Paint paint28 = null;
        xYPlot0.setOutlinePaint(paint28);
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder31 = xYPlot30.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        int int33 = xYPlot30.getIndexOf(xYItemRenderer32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        xYPlot30.zoomRangeAxes((double) 15, plotRenderingInfo35, point2D36);
        boolean boolean38 = xYPlot30.isNotify();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        xYPlot41.zoomRangeAxes((double) '#', plotRenderingInfo43, point2D44);
        int int46 = xYPlot41.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray47 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot41.setRenderers(xYItemRendererArray47);
        java.awt.Stroke stroke49 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot41.setOutlineStroke(stroke49);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.axis.AxisSpace axisSpace53 = null;
        org.jfree.chart.axis.AxisSpace axisSpace54 = xYPlot41.calculateRangeAxisSpace(graphics2D51, rectangle2D52, axisSpace53);
        org.jfree.chart.axis.AxisSpace axisSpace55 = xYPlot30.calculateRangeAxisSpace(graphics2D39, rectangle2D40, axisSpace53);
        xYPlot0.setFixedRangeAxisSpace(axisSpace55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray47);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray47, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(axisSpace54);
        org.junit.Assert.assertNotNull(axisSpace55);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        int int8 = xYPlot0.getWeight();
        java.awt.Font font9 = xYPlot0.getNoDataMessageFont();
        xYPlot0.clearDomainMarkers(0);
        java.awt.Stroke stroke12 = xYPlot0.getOutlineStroke();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        boolean boolean16 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        int int20 = xYPlot19.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        xYPlot19.setRenderer((int) (short) 1, xYItemRenderer22, false);
        xYPlot19.setRangePannable(false);
        int int27 = xYPlot19.getBackgroundImageAlignment();
        boolean boolean28 = xYPlot19.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        xYPlot19.markerChanged(markerChangeEvent29);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        xYPlot19.setRenderer(xYItemRenderer31);
        xYPlot19.setBackgroundAlpha((float) 1L);
        double double35 = xYPlot19.getDomainCrosshairValue();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray36 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot19.setRenderers(xYItemRendererArray36);
        org.jfree.chart.plot.PlotOrientation plotOrientation38 = xYPlot19.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        int int42 = xYPlot41.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        xYPlot41.notifyListeners(plotChangeEvent43);
        int int45 = xYPlot41.getDatasetCount();
        boolean boolean46 = xYPlot41.isDomainMinorGridlinesVisible();
        double double47 = xYPlot41.getDomainCrosshairValue();
        java.awt.Stroke stroke48 = xYPlot41.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        xYPlot49.zoomRangeAxes((double) '#', plotRenderingInfo51, point2D52);
        int int54 = xYPlot49.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray55 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot49.setRenderers(xYItemRendererArray55);
        java.awt.Stroke stroke57 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot49.setOutlineStroke(stroke57);
        boolean boolean59 = xYPlot49.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        xYPlot49.markerChanged(markerChangeEvent60);
        boolean boolean62 = xYPlot49.isDomainGridlinesVisible();
        xYPlot49.mapDatasetToRangeAxis((int) (short) 0, (-1));
        org.jfree.chart.util.RectangleEdge rectangleEdge67 = xYPlot49.getDomainAxisEdge((int) 'a');
        org.jfree.chart.plot.XYPlot xYPlot68 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D69 = null;
        java.awt.geom.Rectangle2D rectangle2D70 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo72 = null;
        org.jfree.chart.plot.CrosshairState crosshairState73 = null;
        boolean boolean74 = xYPlot68.render(graphics2D69, rectangle2D70, 10, plotRenderingInfo72, crosshairState73);
        int int75 = xYPlot68.getDomainAxisCount();
        java.awt.Paint paint76 = xYPlot68.getRangeCrosshairPaint();
        xYPlot68.mapDatasetToDomainAxis(1, 10);
        org.jfree.chart.plot.XYPlot xYPlot80 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo82 = null;
        java.awt.geom.Point2D point2D83 = null;
        xYPlot80.zoomRangeAxes((double) '#', plotRenderingInfo82, point2D83);
        int int85 = xYPlot80.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray86 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot80.setRenderers(xYItemRendererArray86);
        java.awt.Stroke stroke88 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot80.setOutlineStroke(stroke88);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray90 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot80.setDomainAxes(valueAxisArray90);
        xYPlot68.setRangeAxes(valueAxisArray90);
        org.jfree.chart.util.RectangleEdge rectangleEdge93 = xYPlot68.getRangeAxisEdge();
        xYPlot68.setNoDataMessage("");
        java.awt.Paint paint96 = xYPlot68.getOutlinePaint();
        xYPlot49.setDomainZeroBaselinePaint(paint96);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawDomainCrosshair(graphics2D17, rectangle2D18, plotOrientation38, (double) (short) -1, valueAxis40, stroke48, paint96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(xYItemRendererArray36);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray36, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(plotOrientation38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray55);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray55, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(rectangleEdge67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 15 + "'", int85 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray86);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray86, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke88);
        org.junit.Assert.assertNotNull(valueAxisArray90);
        org.junit.Assert.assertArrayEquals(valueAxisArray90, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(rectangleEdge93);
        org.junit.Assert.assertNotNull(paint96);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo14, point2D15, true);
        boolean boolean18 = xYPlot0.isNotify();
        boolean boolean19 = xYPlot0.isRangeMinorGridlinesVisible();
        int int20 = xYPlot0.getDatasetCount();
        int int21 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        int int23 = xYPlot22.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        xYPlot22.setRenderer((int) (short) 1, xYItemRenderer25, false);
        org.jfree.chart.axis.AxisLocation axisLocation28 = xYPlot22.getDomainAxisLocation();
        boolean boolean29 = xYPlot22.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        org.jfree.chart.plot.CrosshairState crosshairState35 = null;
        boolean boolean36 = xYPlot30.render(graphics2D31, rectangle2D32, 10, plotRenderingInfo34, crosshairState35);
        int int37 = xYPlot30.getDomainAxisCount();
        java.lang.String str38 = xYPlot30.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        xYPlot30.markerChanged(markerChangeEvent39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot30.setRangeTickBandPaint(paint41);
        xYPlot22.setDomainCrosshairPaint(paint41);
        java.awt.Paint paint44 = xYPlot22.getRangeGridlinePaint();
        xYPlot22.setDomainCrosshairValue((double) '4', true);
        java.awt.Paint paint48 = xYPlot22.getOutlinePaint();
        xYPlot0.setNoDataMessagePaint(paint48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis(valueAxis8);
        java.awt.Stroke stroke10 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.clearRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot12.zoomRangeAxes((double) '#', plotRenderingInfo14, point2D15);
        int int17 = xYPlot12.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray18 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot12.setRenderers(xYItemRendererArray18);
        java.awt.Stroke stroke20 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot12.setOutlineStroke(stroke20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = xYPlot12.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets22, true);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray18);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray18, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        xYPlot0.clearDomainMarkers((int) (short) 1);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        xYPlot15.zoomRangeAxes((double) '#', plotRenderingInfo17, point2D18);
        int int20 = xYPlot15.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray21 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot15.setRenderers(xYItemRendererArray21);
        java.awt.Stroke stroke23 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot15.setOutlineStroke(stroke23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = xYPlot15.getAxisOffset();
        java.awt.geom.Point2D point2D26 = xYPlot15.getQuadrantOrigin();
        xYPlot0.setQuadrantOrigin(point2D26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray21);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray21, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(point2D26);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        xYPlot0.notifyListeners(plotChangeEvent2);
        int int4 = xYPlot0.getDatasetCount();
        xYPlot0.setDomainCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot0.zoomRangeAxes(0.0d, plotRenderingInfo8, point2D9, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot0.getRangeAxisEdge((int) (byte) -1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        xYPlot0.setRenderer((int) (short) 100, xYItemRenderer15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        int int18 = xYPlot17.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        xYPlot17.setRenderer((int) (short) 1, xYItemRenderer20, false);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot17.getDomainAxisLocation();
        boolean boolean24 = xYPlot17.isRangeMinorGridlinesVisible();
        int int25 = xYPlot17.getWeight();
        java.awt.Font font26 = xYPlot17.getNoDataMessageFont();
        xYPlot17.clearDomainMarkers(0);
        java.awt.Stroke stroke29 = xYPlot17.getOutlineStroke();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        xYPlot17.drawZeroRangeBaseline(graphics2D30, rectangle2D31);
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj34 = xYPlot33.clone();
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot33.setRangeMinorGridlinePaint(paint35);
        float float37 = xYPlot33.getBackgroundAlpha();
        xYPlot33.clearRangeMarkers();
        org.jfree.chart.plot.PlotOrientation plotOrientation39 = xYPlot33.getOrientation();
        java.awt.Paint paint40 = xYPlot33.getBackgroundPaint();
        xYPlot17.setRangeZeroBaselinePaint(paint40);
        xYPlot0.setDomainGridlinePaint(paint40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(plotOrientation39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.data.xy.XYDataset xYDataset11 = xYPlot0.getDataset();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot12.zoomRangeAxes((double) '#', plotRenderingInfo14, point2D15);
        int int17 = xYPlot12.getBackgroundImageAlignment();
        java.awt.Stroke stroke18 = xYPlot12.getRangeMinorGridlineStroke();
        xYPlot0.setOutlineStroke(stroke18);
        xYPlot0.setDomainGridlinesVisible(true);
        xYPlot0.clearRangeAxes();
        java.awt.Stroke stroke23 = xYPlot0.getDomainMinorGridlineStroke();
        java.awt.Paint paint24 = xYPlot0.getDomainTickBandPaint();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(xYDataset11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getDomainAxis((int) (byte) 100);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        boolean boolean10 = xYPlot0.isRangePannable();
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = xYPlot0.getRangeAxisIndex(valueAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawQuadrants(graphics2D10, rectangle2D11);
        java.lang.Object obj13 = xYPlot0.clone();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        int int16 = xYPlot15.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        xYPlot15.setRenderer((int) (short) 1, xYItemRenderer18, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot15.getDomainAxisLocation();
        boolean boolean22 = xYPlot15.isRangeMinorGridlinesVisible();
        boolean boolean23 = xYPlot15.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = xYPlot15.getRenderer();
        int int25 = xYPlot15.getRendererCount();
        xYPlot15.setForegroundAlpha((float) '4');
        xYPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot15.getDomainAxisLocation((int) (byte) -1);
        xYPlot0.setRangeAxisLocation(0, axisLocation30);
        boolean boolean32 = xYPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(xYItemRenderer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        xYPlot10.zoomRangeAxes((double) '#', plotRenderingInfo12, point2D13);
        int int15 = xYPlot10.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray16 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot10.setRenderers(xYItemRendererArray16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot10.setOutlineStroke(stroke18);
        boolean boolean20 = xYPlot10.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = xYPlot10.getRangeAxisIndex(valueAxis21);
        java.awt.Stroke stroke23 = xYPlot10.getRangeCrosshairStroke();
        xYPlot0.setRangeMinorGridlineStroke(stroke23);
        xYPlot0.clearRangeAxes();
        xYPlot0.clearAnnotations();
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker27, layer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray16);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray16, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot13);
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.RenderingSource renderingSource22 = null;
        xYPlot13.select(0.0d, 100.0d, rectangle2D21, renderingSource22);
        xYPlot13.setDomainPannable(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        xYPlot0.setForegroundAlpha((float) (short) -1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        int int4 = xYPlot0.getRangeAxisIndex(valueAxis3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot13.zoomDomainAxes((double) 10L, (double) 10.0f, plotRenderingInfo21, point2D22);
        xYPlot13.configureRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = xYPlot13.getDomainAxisEdge();
        xYPlot13.setRangePannable(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        xYPlot13.addChangeListener(plotChangeListener28);
        xYPlot13.setOutlineVisible(true);
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot13.addRangeMarker(100, marker33, layer34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleEdge25);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot0.getDataRange(valueAxis11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        xYPlot13.setRenderer((int) (short) 1, xYItemRenderer16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot13.getDomainAxisLocation();
        xYPlot0.setDomainAxisLocation(axisLocation19, true);
        xYPlot0.setBackgroundImageAlignment((int) '4');
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) (short) -1, marker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer2 = null;
        int int3 = xYPlot0.getIndexOf(xYItemRenderer2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getRangeMarkers((int) (byte) 0, layer5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot0.zoomRangeAxes((double) ' ', (double) (short) 1, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        int int13 = xYPlot12.getDomainAxisCount();
        xYPlot12.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        int int17 = xYPlot16.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot16.setRenderer((int) (short) 1, xYItemRenderer19, false);
        xYPlot16.setRangePannable(false);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot16.setOutlinePaint(paint24);
        xYPlot12.setDomainMinorGridlinePaint(paint24);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot12.setDomainZeroBaselinePaint(paint27);
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot12.getRangeAxisLocation((int) (short) 0);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = xYPlot12.getLegendItems();
        xYPlot0.setFixedLegendItems(legendItemCollection31);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot0.getDomainAxisLocation((int) (byte) 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(legendItemCollection31);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        xYPlot0.setForegroundAlpha((float) '4');
        xYPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        boolean boolean19 = xYPlot0.removeDomainMarker(2, marker17, layer18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.Marker marker21 = null;
        boolean boolean22 = xYPlot0.removeDomainMarker(marker21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis((int) (short) 100);
        org.jfree.chart.plot.Plot plot9 = xYPlot0.getRootPlot();
        boolean boolean10 = plot9.isSubplot();
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        xYPlot0.markerChanged(markerChangeEvent11);
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setRangeCrosshairStroke(stroke13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot17.zoomRangeAxes((double) '#', plotRenderingInfo19, point2D20);
        int int22 = xYPlot17.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray23 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot17.setRenderers(xYItemRendererArray23);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot17.setOutlineStroke(stroke25);
        double double27 = xYPlot17.getDomainCrosshairValue();
        boolean boolean28 = xYPlot17.isRangeCrosshairVisible();
        float float29 = xYPlot17.getBackgroundAlpha();
        xYPlot17.setRangeCrosshairValue((double) (short) 1, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        int int36 = xYPlot35.getDomainAxisCount();
        xYPlot35.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        int int40 = xYPlot39.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        xYPlot39.setRenderer((int) (short) 1, xYItemRenderer42, false);
        xYPlot39.setRangePannable(false);
        java.awt.Paint paint47 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot39.setOutlinePaint(paint47);
        xYPlot35.setDomainMinorGridlinePaint(paint47);
        java.awt.Paint paint50 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot35.setDomainZeroBaselinePaint(paint50);
        boolean boolean52 = xYPlot35.isRangeZoomable();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer53 = null;
        xYPlot35.setRenderer(xYItemRenderer53);
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        java.awt.geom.Point2D point2D58 = null;
        xYPlot55.zoomRangeAxes((double) '#', plotRenderingInfo57, point2D58);
        int int60 = xYPlot55.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray61 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot55.setRenderers(xYItemRendererArray61);
        java.awt.Stroke stroke63 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot55.setOutlineStroke(stroke63);
        boolean boolean65 = xYPlot55.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        int int67 = xYPlot55.getRangeAxisIndex(valueAxis66);
        java.awt.Stroke stroke68 = xYPlot55.getRangeCrosshairStroke();
        xYPlot35.setRangeCrosshairStroke(stroke68);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer70 = null;
        int int71 = xYPlot35.getIndexOf(xYItemRenderer70);
        java.awt.geom.Point2D point2D72 = xYPlot35.getQuadrantOrigin();
        xYPlot17.panDomainAxes(0.0d, plotRenderingInfo34, point2D72);
        xYPlot0.zoomRangeAxes(1.0d, plotRenderingInfo16, point2D72);
        java.awt.Stroke stroke75 = xYPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray23);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray23, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray61);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray61, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(point2D72);
        org.junit.Assert.assertNotNull(stroke75);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot0.calculateRangeAxisSpace(graphics2D10, rectangle2D11, axisSpace12);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot0.setDomainAxis((int) (short) 100, valueAxis15);
        boolean boolean17 = xYPlot0.isRangeCrosshairLockedOnData();
        float float18 = xYPlot0.getBackgroundImageAlpha();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = xYPlot0.getRenderer((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(xYItemRenderer20);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        xYPlot0.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot();
        int int5 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer7 = null;
        xYPlot4.setRenderer((int) (short) 1, xYItemRenderer7, false);
        xYPlot4.setRangePannable(false);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot4.setOutlinePaint(paint12);
        xYPlot0.setDomainMinorGridlinePaint(paint12);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setDomainZeroBaselinePaint(paint15);
        boolean boolean17 = xYPlot0.isRangeZoomable();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        xYPlot0.setRenderer(xYItemRenderer18);
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot20.zoomRangeAxes((double) '#', plotRenderingInfo22, point2D23);
        int int25 = xYPlot20.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray26 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot20.setRenderers(xYItemRendererArray26);
        java.awt.Stroke stroke28 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot20.setOutlineStroke(stroke28);
        boolean boolean30 = xYPlot20.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        int int32 = xYPlot20.getRangeAxisIndex(valueAxis31);
        java.awt.Stroke stroke33 = xYPlot20.getRangeCrosshairStroke();
        xYPlot0.setRangeCrosshairStroke(stroke33);
        boolean boolean35 = xYPlot0.isDomainMinorGridlinesVisible();
        org.jfree.chart.plot.Marker marker36 = null;
        org.jfree.chart.util.Layer layer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker36, layer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray26);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray26, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        boolean boolean10 = xYPlot0.removeDomainMarker((int) (byte) 1, marker8, layer9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot0.getDomainAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot0.getRangeAxisEdge((int) (byte) 1);
        xYPlot0.clearRangeAxes();
        xYPlot0.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot0.getDomainAxisEdge(2);
        xYPlot0.clearDomainMarkers((-1));
        xYPlot0.clearDomainMarkers((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis((int) (short) 100);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot0.getRenderer(15);
        xYPlot0.setBackgroundImageAlignment(1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        boolean boolean11 = xYPlot0.isRangeZoomable();
        java.awt.Stroke stroke12 = xYPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = xYPlot0.getRenderer(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(xYItemRenderer14);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.awt.Paint paint8 = xYPlot0.getRangeCrosshairPaint();
        xYPlot0.mapDatasetToDomainAxis(1, 10);
        boolean boolean12 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        xYPlot13.setRenderer((int) (short) 1, xYItemRenderer16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot13.getDomainAxisLocation();
        boolean boolean20 = xYPlot13.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        xYPlot13.setDomainAxis((int) (byte) 0, valueAxis22);
        java.awt.Paint paint24 = xYPlot13.getRangeGridlinePaint();
        boolean boolean25 = xYPlot13.isDomainPannable();
        boolean boolean26 = xYPlot13.isNotify();
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        int int29 = xYPlot28.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        xYPlot28.setRenderer((int) (short) 1, xYItemRenderer31, false);
        xYPlot28.setRangePannable(false);
        int int36 = xYPlot28.getBackgroundImageAlignment();
        boolean boolean37 = xYPlot28.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        xYPlot28.markerChanged(markerChangeEvent38);
        org.jfree.chart.axis.AxisSpace axisSpace40 = xYPlot28.getFixedDomainAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        java.awt.geom.Point2D point2D45 = null;
        xYPlot42.zoomRangeAxes((double) '#', plotRenderingInfo44, point2D45);
        int int47 = xYPlot42.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray48 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot42.setRenderers(xYItemRendererArray48);
        java.awt.Stroke stroke50 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot42.setOutlineStroke(stroke50);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray52 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot42.setDomainAxes(valueAxisArray52);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer55 = xYPlot42.getRenderer((int) (short) 0);
        java.awt.Stroke stroke56 = xYPlot42.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        xYPlot42.setDomainAxis((int) (short) 0, valueAxis58, false);
        xYPlot42.setDomainCrosshairValue((double) (-1.0f));
        org.jfree.chart.axis.AxisLocation axisLocation63 = xYPlot42.getDomainAxisLocation();
        xYPlot28.setRangeAxisLocation(10, axisLocation63);
        xYPlot13.setRangeAxisLocation(2, axisLocation63);
        xYPlot0.setDomainAxisLocation(axisLocation63, true);
        xYPlot0.clearDomainMarkers();
        java.awt.Paint paint69 = xYPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(axisSpace40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray48);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray48, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(valueAxisArray52);
        org.junit.Assert.assertArrayEquals(valueAxisArray52, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer55);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(axisLocation63);
        org.junit.Assert.assertNotNull(paint69);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis(valueAxis8);
        java.awt.Stroke stroke10 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setDomainCrosshairValue((double) 100L);
        xYPlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot7.zoomRangeAxes((double) '#', plotRenderingInfo9, point2D10);
        int int12 = xYPlot7.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray13 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot7.setRenderers(xYItemRendererArray13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot7.setOutlineStroke(stroke15);
        boolean boolean17 = xYPlot7.isDomainZeroBaselineVisible();
        java.awt.Paint paint18 = xYPlot7.getRangeMinorGridlinePaint();
        xYPlot0.setDomainGridlinePaint(paint18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        xYPlot0.addChangeListener(plotChangeListener20);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = xYPlot0.getLegendItems();
        boolean boolean23 = xYPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray13);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray13, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        boolean boolean10 = xYPlot0.removeDomainMarker((int) (byte) 1, marker8, layer9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot0.getDomainAxisLocation((int) (byte) 100);
        xYPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = xYPlot0.getDatasetGroup();
        xYPlot0.zoom(10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.util.Layer layer15 = null;
        xYPlot0.drawRangeMarkers(graphics2D12, rectangle2D13, 15, layer15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot17.zoomRangeAxes((double) '#', plotRenderingInfo19, point2D20);
        int int22 = xYPlot17.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray23 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot17.setRenderers(xYItemRendererArray23);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot17.setOutlineStroke(stroke25);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot17.setDomainAxes(valueAxisArray27);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot17.getRenderer((int) (short) 0);
        java.awt.Stroke stroke31 = xYPlot17.getDomainGridlineStroke();
        xYPlot0.setRangeCrosshairStroke(stroke31);
        int int33 = xYPlot0.getRendererCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray23);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray23, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertArrayEquals(valueAxisArray27, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        java.awt.Paint paint10 = xYPlot0.getRangeZeroBaselinePaint();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot11.zoomRangeAxes((double) '#', plotRenderingInfo13, point2D14);
        int int16 = xYPlot11.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray17 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot11.setRenderers(xYItemRendererArray17);
        java.awt.Stroke stroke19 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot11.setOutlineStroke(stroke19);
        boolean boolean21 = xYPlot11.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        int int23 = xYPlot11.getRangeAxisIndex(valueAxis22);
        java.awt.Stroke stroke24 = xYPlot11.getRangeCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        xYPlot25.setRangePannable(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = xYPlot25.getAxisOffset();
        xYPlot11.setInsets(rectangleInsets33);
        xYPlot0.setInsets(rectangleInsets33);
        boolean boolean36 = xYPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        xYPlot0.markerChanged(markerChangeEvent37);
        boolean boolean39 = xYPlot0.isDomainGridlinesVisible();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        java.awt.geom.Point2D point2D46 = null;
        xYPlot43.zoomRangeAxes((double) '#', plotRenderingInfo45, point2D46);
        xYPlot43.setRangeCrosshairValue(0.0d);
        xYPlot43.clearDomainAxes();
        xYPlot43.setDomainCrosshairLockedOnData(true);
        xYPlot43.clearSelection();
        org.jfree.chart.plot.XYPlot xYPlot54 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        java.awt.geom.Point2D point2D57 = null;
        xYPlot54.zoomRangeAxes((double) '#', plotRenderingInfo56, point2D57);
        int int59 = xYPlot54.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray60 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot54.setRenderers(xYItemRendererArray60);
        java.awt.Stroke stroke62 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot54.setOutlineStroke(stroke62);
        boolean boolean64 = xYPlot54.isDomainZeroBaselineVisible();
        xYPlot54.configureDomainAxes();
        java.awt.Stroke stroke66 = xYPlot54.getOutlineStroke();
        xYPlot43.setRangeCrosshairStroke(stroke66);
        java.awt.Paint paint68 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawVerticalLine(graphics2D40, rectangle2D41, (double) 1.0f, stroke66, paint68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray17);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray17, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 15 + "'", int59 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray60);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray60, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(stroke66);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot0.getRangeMarkers((int) ' ', layer10);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.CrosshairState crosshairState17 = null;
        boolean boolean18 = xYPlot12.render(graphics2D13, rectangle2D14, 10, plotRenderingInfo16, crosshairState17);
        int int19 = xYPlot12.getDomainAxisCount();
        boolean boolean20 = xYPlot12.isRangeZeroBaselineVisible();
        java.awt.Paint paint21 = xYPlot12.getBackgroundPaint();
        xYPlot0.setDomainGridlinePaint(paint21);
        xYPlot0.setWeight((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = xYPlot0.getDrawingSupplier();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.RenderingSource renderingSource6 = null;
        xYPlot0.select((double) 10, (double) (-1), rectangle2D5, renderingSource6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        int int9 = xYPlot0.getSeriesCount();
        xYPlot0.setBackgroundAlpha((float) (short) 100);
        boolean boolean12 = xYPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot13.zoomDomainAxes((double) 10L, (double) 10.0f, plotRenderingInfo21, point2D22);
        xYPlot13.configureRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        xYPlot25.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        xYPlot25.setRangeAxis(valueAxis33);
        java.awt.Stroke stroke35 = xYPlot25.getDomainGridlineStroke();
        java.awt.Font font36 = xYPlot25.getNoDataMessageFont();
        xYPlot25.setRangePannable(true);
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        int int40 = xYPlot39.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        xYPlot39.setRenderer((int) (short) 1, xYItemRenderer42, false);
        org.jfree.chart.axis.AxisLocation axisLocation45 = xYPlot39.getDomainAxisLocation();
        boolean boolean46 = xYPlot39.isRangeMinorGridlinesVisible();
        int int47 = xYPlot39.getWeight();
        java.awt.Font font48 = xYPlot39.getNoDataMessageFont();
        xYPlot39.clearDomainMarkers(0);
        java.awt.Stroke stroke51 = xYPlot39.getOutlineStroke();
        xYPlot25.setDomainGridlineStroke(stroke51);
        xYPlot13.setDomainMinorGridlineStroke(stroke51);
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        org.jfree.chart.util.Layer layer57 = null;
        xYPlot13.drawDomainMarkers(graphics2D54, rectangle2D55, 0, layer57);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(axisLocation45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        xYPlot0.configureDomainAxes();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.util.Layer layer15 = null;
        xYPlot0.drawRangeMarkers(graphics2D12, rectangle2D13, 0, layer15);
        java.awt.Paint paint17 = xYPlot0.getOutlinePaint();
        java.awt.Paint paint19 = xYPlot0.getQuadrantPaint((int) (short) 1);
        org.jfree.chart.plot.Marker marker20 = null;
        boolean boolean21 = xYPlot0.removeDomainMarker(marker20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = xYPlot0.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getDomainMarkers(15, layer5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge((int) 'a');
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        int int12 = xYPlot0.indexOf(xYDataset11);
        org.junit.Assert.assertNotNull(legendItemCollection1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setOutlinePaint(paint8);
        xYPlot0.clearAnnotations();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot0.setDataset(10, xYDataset12);
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        int int15 = xYPlot14.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        xYPlot14.setRenderer((int) (short) 1, xYItemRenderer17, false);
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot14.getDomainAxisLocation();
        boolean boolean21 = xYPlot14.isRangeMinorGridlinesVisible();
        int int22 = xYPlot14.getWeight();
        java.awt.Font font23 = xYPlot14.getNoDataMessageFont();
        xYPlot14.clearDomainMarkers(0);
        java.awt.Stroke stroke26 = xYPlot14.getOutlineStroke();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot14.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        java.awt.Paint paint30 = xYPlot14.getDomainZeroBaselinePaint();
        xYPlot0.setBackgroundPaint(paint30);
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        xYPlot33.zoomRangeAxes((double) '#', plotRenderingInfo35, point2D36);
        int int38 = xYPlot33.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray39 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot33.setRenderers(xYItemRendererArray39);
        java.awt.Stroke stroke41 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot33.setOutlineStroke(stroke41);
        boolean boolean43 = xYPlot33.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        int int45 = xYPlot33.getRangeAxisIndex(valueAxis44);
        java.awt.Stroke stroke46 = xYPlot33.getRangeCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        int int48 = xYPlot47.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        xYPlot47.setRenderer((int) (short) 1, xYItemRenderer50, false);
        xYPlot47.setRangePannable(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = xYPlot47.getAxisOffset();
        xYPlot33.setInsets(rectangleInsets55);
        org.jfree.chart.axis.AxisLocation axisLocation58 = xYPlot33.getDomainAxisLocation((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDomainAxisLocation((int) (short) -1, axisLocation58, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray39);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray39, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets55);
        org.junit.Assert.assertNotNull(axisLocation58);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        java.awt.Paint paint11 = xYPlot0.getDomainTickBandPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot0.getDomainAxisEdge((int) ' ');
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        int int17 = xYPlot16.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot16.setRenderer((int) (short) 1, xYItemRenderer19, false);
        xYPlot16.setRangePannable(false);
        int int24 = xYPlot16.getBackgroundImageAlignment();
        boolean boolean25 = xYPlot16.isDomainZeroBaselineVisible();
        double double26 = xYPlot16.getDomainCrosshairValue();
        xYPlot16.setDomainCrosshairValue((double) 10, true);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        int int33 = xYPlot32.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        xYPlot32.setRenderer((int) (short) 1, xYItemRenderer35, false);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        xYPlot32.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.util.List list41 = xYPlot32.getAnnotations();
        xYPlot16.drawDomainGridlines(graphics2D30, rectangle2D31, list41);
        xYPlot0.drawDomainGridlines(graphics2D14, rectangle2D15, list41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getDomainAxisIndex(valueAxis11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot0.getDomainAxisEdge(1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = xYPlot0.getDrawingSupplier();
        java.awt.Stroke stroke16 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot0.getRangeAxisEdge(100);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        int int20 = xYPlot19.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        xYPlot19.setRenderer((int) (short) 1, xYItemRenderer22, false);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot19.getDomainAxisLocation();
        boolean boolean26 = xYPlot19.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.RenderingSource renderingSource29 = null;
        xYPlot19.select(generalPath27, rectangle2D28, renderingSource29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot19.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Stroke stroke34 = xYPlot19.getRangeCrosshairStroke();
        java.awt.Paint paint35 = xYPlot19.getDomainCrosshairPaint();
        xYPlot0.setRangeTickBandPaint(paint35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        double double9 = xYPlot0.getDomainCrosshairValue();
        boolean boolean10 = xYPlot0.isNotify();
        java.awt.Stroke stroke11 = xYPlot0.getDomainMinorGridlineStroke();
        xYPlot0.setBackgroundAlpha((float) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot0.getDomainAxis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        java.awt.Paint paint4 = xYPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis();
        xYPlot0.clearSelection();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xYPlot0.removeRangeMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        xYPlot0.setRangeGridlinesVisible(false);
        boolean boolean4 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = null;
        xYPlot0.setRenderer(xYItemRenderer5);
        boolean boolean7 = xYPlot0.isRangePannable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis(valueAxis8);
        java.awt.Stroke stroke10 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.clearRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        int int13 = xYPlot12.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        xYPlot12.setRenderer((int) (short) 1, xYItemRenderer15, false);
        xYPlot12.setRangePannable(false);
        int int20 = xYPlot12.getBackgroundImageAlignment();
        boolean boolean21 = xYPlot12.isDomainZeroBaselineVisible();
        double double22 = xYPlot12.getDomainCrosshairValue();
        java.awt.Paint paint23 = xYPlot12.getDomainCrosshairPaint();
        xYPlot0.setRangeGridlinePaint(paint23);
        java.awt.Paint paint25 = xYPlot0.getRangeMinorGridlinePaint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.awt.Stroke stroke8 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot0.getDomainAxisEdge();
        xYPlot0.setDomainCrosshairValue((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        int int8 = xYPlot0.getWeight();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        int int10 = xYPlot9.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot9.setRenderer((int) (short) 1, xYItemRenderer12, false);
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot9.getDomainAxisLocation();
        boolean boolean16 = xYPlot9.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot9.getRangeAxisLocation((int) (byte) 100);
        xYPlot0.setDomainAxisLocation(axisLocation18);
        xYPlot0.setDomainPannable(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = xYPlot0.getRangeAxisIndex(valueAxis8);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        xYPlot0.setRangeAxis(valueAxis12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot7.zoomRangeAxes((double) '#', plotRenderingInfo9, point2D10);
        int int12 = xYPlot7.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray13 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot7.setRenderers(xYItemRendererArray13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot7.setOutlineStroke(stroke15);
        boolean boolean17 = xYPlot7.isDomainZeroBaselineVisible();
        java.awt.Paint paint18 = xYPlot7.getRangeMinorGridlinePaint();
        xYPlot0.setDomainGridlinePaint(paint18);
        java.awt.Paint paint20 = xYPlot0.getRangeMinorGridlinePaint();
        xYPlot0.setDomainCrosshairVisible(true);
        org.jfree.chart.plot.Plot plot23 = xYPlot0.getParent();
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        xYPlot24.zoomRangeAxes((double) '#', plotRenderingInfo26, point2D27);
        xYPlot24.setRangeCrosshairValue(0.0d);
        java.awt.Paint paint31 = xYPlot24.getRangeGridlinePaint();
        xYPlot0.setDomainCrosshairPaint(paint31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray13);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray13, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer2 = null;
        int int3 = xYPlot0.getIndexOf(xYItemRenderer2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getRangeMarkers((int) (byte) 0, layer5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot0.zoomRangeAxes((double) ' ', (double) (short) 1, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        int int13 = xYPlot12.getDomainAxisCount();
        xYPlot12.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        int int17 = xYPlot16.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot16.setRenderer((int) (short) 1, xYItemRenderer19, false);
        xYPlot16.setRangePannable(false);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot16.setOutlinePaint(paint24);
        xYPlot12.setDomainMinorGridlinePaint(paint24);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot12.setDomainZeroBaselinePaint(paint27);
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot12.getRangeAxisLocation((int) (short) 0);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = xYPlot12.getLegendItems();
        xYPlot0.setFixedLegendItems(legendItemCollection31);
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xYPlot0.removeRangeMarker(marker33, layer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(legendItemCollection31);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis((int) (short) 100);
        org.jfree.chart.plot.Plot plot9 = xYPlot0.getRootPlot();
        int int10 = xYPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = xYPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getRangeAxisIndex(valueAxis11);
        java.awt.Stroke stroke13 = xYPlot0.getRangeMinorGridlineStroke();
        boolean boolean14 = xYPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.Plot plot15 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = xYPlot0.getRangeMarkers(layer16);
        java.awt.Paint paint18 = xYPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot0.calculateRangeAxisSpace(graphics2D10, rectangle2D11, axisSpace12);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot0.setDomainAxis((int) (short) 100, valueAxis15);
        boolean boolean17 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        int int19 = xYPlot18.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        xYPlot18.setRenderer((int) (short) 1, xYItemRenderer21, false);
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot18.getDomainAxisLocation();
        boolean boolean25 = xYPlot18.isRangeMinorGridlinesVisible();
        boolean boolean26 = xYPlot18.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = xYPlot18.getRenderer();
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot28.zoomRangeAxes((double) '#', plotRenderingInfo30, point2D31);
        int int33 = xYPlot28.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray34 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot28.setRenderers(xYItemRendererArray34);
        java.awt.Stroke stroke36 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot28.setOutlineStroke(stroke36);
        boolean boolean38 = xYPlot28.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        int int40 = xYPlot28.getRangeAxisIndex(valueAxis39);
        java.awt.Stroke stroke41 = xYPlot28.getRangeCrosshairStroke();
        xYPlot18.setRangeMinorGridlineStroke(stroke41);
        java.awt.Paint paint43 = xYPlot18.getRangeCrosshairPaint();
        xYPlot0.setDomainMinorGridlinePaint(paint43);
        org.jfree.data.xy.XYDataset xYDataset45 = xYPlot0.getDataset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(xYItemRenderer27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray34);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray34, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNull(xYDataset45);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot0.getDomainMarkers((int) ' ', layer10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        org.jfree.chart.plot.Plot plot9 = xYPlot0.getParent();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getDomainAxisEdge();
        java.awt.Stroke stroke11 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        int int13 = xYPlot12.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        xYPlot12.notifyListeners(plotChangeEvent14);
        int int16 = xYPlot12.getDatasetCount();
        xYPlot12.setDomainCrosshairValue(0.0d);
        java.awt.Stroke stroke19 = xYPlot12.getRangeCrosshairStroke();
        xYPlot0.setDomainZeroBaselineStroke(stroke19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        int int8 = xYPlot0.getWeight();
        java.awt.Font font9 = xYPlot0.getNoDataMessageFont();
        xYPlot0.clearDomainMarkers(0);
        java.awt.Stroke stroke12 = xYPlot0.getRangeCrosshairStroke();
        int int13 = xYPlot0.getRendererCount();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = xYPlot0.getRangeMarkers(1, layer15);
        java.awt.Stroke stroke17 = xYPlot0.getRangeMinorGridlineStroke();
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis((int) (short) 100);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot0.getRenderer(15);
        java.lang.String str11 = xYPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setOutlinePaint(paint8);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot0.getRangeAxis((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        xYPlot0.notifyListeners(plotChangeEvent2);
        int int4 = xYPlot0.getDatasetCount();
        xYPlot0.setDomainCrosshairValue(0.0d);
        java.awt.Stroke stroke7 = xYPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setRangeAxis((int) (short) 1, valueAxis9, true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getDomainMinorGridlinePaint();
        xYPlot0.clearRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        xYPlot0.setRangeAxis((int) (short) 10, valueAxis4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getDomainAxisIndex(valueAxis11);
        int int13 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot0.getDomainAxisLocation((int) (byte) 100);
        xYPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        xYPlot0.addChangeListener(plotChangeListener17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot0.getDataRange(valueAxis11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        xYPlot13.setRenderer((int) (short) 1, xYItemRenderer16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot13.getDomainAxisLocation();
        xYPlot0.setDomainAxisLocation(axisLocation19, true);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        org.jfree.chart.plot.CrosshairState crosshairState26 = null;
        boolean boolean27 = xYPlot0.render(graphics2D22, rectangle2D23, (int) (byte) 10, plotRenderingInfo25, crosshairState26);
        org.jfree.chart.plot.Plot plot28 = xYPlot0.getRootPlot();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = xYPlot0.getRenderer();
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xYPlot0.removeRangeMarker(1, marker33, layer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNull(xYItemRenderer29);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot0.calculateRangeAxisSpace(graphics2D10, rectangle2D11, axisSpace12);
        boolean boolean14 = xYPlot0.isDomainMinorGridlinesVisible();
        xYPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        xYPlot0.axisChanged(axisChangeEvent4);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot6.zoomRangeAxes((double) '#', plotRenderingInfo8, point2D9);
        int int11 = xYPlot6.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray12 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot6.setRenderers(xYItemRendererArray12);
        java.awt.Stroke stroke14 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot6.setOutlineStroke(stroke14);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray16 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot6.setDomainAxes(valueAxisArray16);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = xYPlot6.getRenderer((int) (short) 0);
        java.awt.Stroke stroke20 = xYPlot6.getDomainGridlineStroke();
        org.jfree.chart.plot.Plot plot21 = xYPlot6.getRootPlot();
        boolean boolean22 = xYPlot0.equals((java.lang.Object) plot21);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        int int24 = xYPlot23.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        xYPlot23.setRenderer((int) (short) 1, xYItemRenderer26, false);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot23.getDomainAxisLocation();
        boolean boolean30 = xYPlot23.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        org.jfree.chart.plot.CrosshairState crosshairState36 = null;
        boolean boolean37 = xYPlot31.render(graphics2D32, rectangle2D33, 10, plotRenderingInfo35, crosshairState36);
        int int38 = xYPlot31.getDomainAxisCount();
        java.lang.String str39 = xYPlot31.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        xYPlot31.markerChanged(markerChangeEvent40);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot31.setRangeTickBandPaint(paint42);
        xYPlot23.setDomainCrosshairPaint(paint42);
        java.awt.Paint paint45 = xYPlot23.getRangeGridlinePaint();
        xYPlot0.setRangeZeroBaselinePaint(paint45);
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        int int48 = xYPlot0.getRangeAxisIndex(valueAxis47);
        xYPlot0.clearRangeMarkers();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint51 = xYPlot0.getQuadrantPaint(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (10) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray12);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray12, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(valueAxisArray16);
        org.junit.Assert.assertArrayEquals(valueAxisArray16, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        int int8 = xYPlot0.getWeight();
        java.awt.Font font9 = xYPlot0.getNoDataMessageFont();
        xYPlot0.clearDomainMarkers(0);
        java.awt.Stroke stroke12 = xYPlot0.getOutlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot0.setRangeAxis((int) (short) 100, valueAxis14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = xYPlot0.getLegendItems();
        java.awt.Stroke stroke17 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        int int19 = xYPlot0.getRangeAxisIndex(valueAxis18);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot0.getDomainAxisForDataset(0);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        boolean boolean26 = xYPlot0.removeDomainMarker((-1), marker23, layer24, false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        xYPlot0.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot();
        int int5 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer7 = null;
        xYPlot4.setRenderer((int) (short) 1, xYItemRenderer7, false);
        xYPlot4.setRangePannable(false);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot4.setOutlinePaint(paint12);
        xYPlot0.setDomainMinorGridlinePaint(paint12);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setDomainZeroBaselinePaint(paint15);
        xYPlot0.setRangeCrosshairVisible(true);
        xYPlot0.setDomainCrosshairValue(10.0d, true);
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        int int23 = xYPlot22.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        xYPlot22.setRenderer((int) (short) 1, xYItemRenderer25, false);
        org.jfree.chart.axis.AxisLocation axisLocation28 = xYPlot22.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot22.getRangeAxisLocation(1);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = xYPlot22.getRangeMarkers((int) ' ', layer32);
        double double34 = xYPlot22.getDomainCrosshairValue();
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        int int36 = xYPlot35.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        xYPlot35.setRenderer((int) (short) 1, xYItemRenderer38, false);
        org.jfree.chart.axis.AxisLocation axisLocation41 = xYPlot35.getDomainAxisLocation();
        boolean boolean42 = xYPlot35.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation44 = xYPlot35.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = xYPlot35.getRangeAxisEdge();
        xYPlot35.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 10);
        boolean boolean49 = xYPlot35.isDomainZoomable();
        xYPlot35.setRangePannable(false);
        java.awt.Paint paint52 = xYPlot35.getOutlinePaint();
        xYPlot22.setNoDataMessagePaint(paint52);
        xYPlot0.setDomainCrosshairPaint(paint52);
        java.awt.Stroke stroke55 = null;
        xYPlot0.setOutlineStroke(stroke55);
        org.jfree.chart.plot.Marker marker58 = null;
        org.jfree.chart.util.Layer layer59 = null;
        boolean boolean61 = xYPlot0.removeDomainMarker((int) (short) 0, marker58, layer59, false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(axisLocation44);
        org.junit.Assert.assertNotNull(rectangleEdge45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        boolean boolean10 = xYPlot0.removeDomainMarker((int) (byte) 1, marker8, layer9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot0.getDomainAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot0.getRangeAxisEdge((int) (byte) 1);
        xYPlot0.clearRangeAxes();
        xYPlot0.clearAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = xYPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo14, point2D15, true);
        boolean boolean18 = xYPlot0.isNotify();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot0.setRangeAxis(valueAxis19);
        xYPlot0.setDomainZeroBaselineVisible(true);
        int int23 = xYPlot0.getWeight();
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(100, marker25, layer26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot0.setRenderer(xYItemRenderer12);
        xYPlot0.setBackgroundAlpha((float) 1L);
        double double16 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray17 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray17);
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = xYPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot0.getDomainAxis((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(xYItemRendererArray17);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray17, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNull(valueAxis21);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        xYPlot0.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot0.setRangeTickBandPaint(paint11);
        java.awt.Image image13 = xYPlot0.getBackgroundImage();
        boolean boolean14 = xYPlot0.isDomainPannable();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        xYPlot0.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        xYPlot0.addChangeListener(plotChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        xYPlot8.zoomRangeAxes((double) '#', plotRenderingInfo10, point2D11);
        int int13 = xYPlot8.getBackgroundImageAlignment();
        java.awt.Stroke stroke14 = xYPlot8.getRangeMinorGridlineStroke();
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot8.setRangeCrosshairPaint(paint15);
        xYPlot0.setDomainGridlinePaint(paint15);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = xYPlot0.getAxisOffset();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot0.setRenderer(xYItemRenderer19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot2 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        xYPlot2.zoomRangeAxes((double) '#', plotRenderingInfo4, point2D5);
        int int7 = xYPlot2.getBackgroundImageAlignment();
        java.awt.Stroke stroke8 = xYPlot2.getRangeMinorGridlineStroke();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot2.setRangeCrosshairPaint(paint9);
        xYPlot0.setRangeZeroBaselinePaint(paint9);
        xYPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = xYPlot0.getOrientation();
        boolean boolean15 = xYPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        xYPlot0.markerChanged(markerChangeEvent11);
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setRangeCrosshairStroke(stroke13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot17.zoomRangeAxes((double) '#', plotRenderingInfo19, point2D20);
        int int22 = xYPlot17.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray23 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot17.setRenderers(xYItemRendererArray23);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot17.setOutlineStroke(stroke25);
        double double27 = xYPlot17.getDomainCrosshairValue();
        boolean boolean28 = xYPlot17.isRangeCrosshairVisible();
        float float29 = xYPlot17.getBackgroundAlpha();
        xYPlot17.setRangeCrosshairValue((double) (short) 1, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        int int36 = xYPlot35.getDomainAxisCount();
        xYPlot35.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        int int40 = xYPlot39.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        xYPlot39.setRenderer((int) (short) 1, xYItemRenderer42, false);
        xYPlot39.setRangePannable(false);
        java.awt.Paint paint47 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot39.setOutlinePaint(paint47);
        xYPlot35.setDomainMinorGridlinePaint(paint47);
        java.awt.Paint paint50 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot35.setDomainZeroBaselinePaint(paint50);
        boolean boolean52 = xYPlot35.isRangeZoomable();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer53 = null;
        xYPlot35.setRenderer(xYItemRenderer53);
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        java.awt.geom.Point2D point2D58 = null;
        xYPlot55.zoomRangeAxes((double) '#', plotRenderingInfo57, point2D58);
        int int60 = xYPlot55.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray61 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot55.setRenderers(xYItemRendererArray61);
        java.awt.Stroke stroke63 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot55.setOutlineStroke(stroke63);
        boolean boolean65 = xYPlot55.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        int int67 = xYPlot55.getRangeAxisIndex(valueAxis66);
        java.awt.Stroke stroke68 = xYPlot55.getRangeCrosshairStroke();
        xYPlot35.setRangeCrosshairStroke(stroke68);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer70 = null;
        int int71 = xYPlot35.getIndexOf(xYItemRenderer70);
        java.awt.geom.Point2D point2D72 = xYPlot35.getQuadrantOrigin();
        xYPlot17.panDomainAxes(0.0d, plotRenderingInfo34, point2D72);
        xYPlot0.zoomRangeAxes(1.0d, plotRenderingInfo16, point2D72);
        org.jfree.chart.event.PlotChangeListener plotChangeListener75 = null;
        xYPlot0.addChangeListener(plotChangeListener75);
        double double77 = xYPlot0.getRangeCrosshairValue();
        boolean boolean78 = xYPlot0.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener79 = null;
        xYPlot0.addChangeListener(plotChangeListener79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray23);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray23, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray61);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray61, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(point2D72);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        boolean boolean9 = xYPlot0.isRangeMinorGridlinesVisible();
        java.awt.Stroke stroke10 = xYPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot0.getRangeAxisLocation((int) (byte) -1);
        org.jfree.chart.plot.Marker marker13 = null;
        boolean boolean14 = xYPlot0.removeDomainMarker(marker13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        int int16 = xYPlot0.getDomainAxisIndex(valueAxis15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.lang.String str11 = xYPlot0.getNoDataMessage();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot12.zoomRangeAxes((double) '#', plotRenderingInfo14, point2D15);
        int int17 = xYPlot12.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray18 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot12.setRenderers(xYItemRendererArray18);
        java.awt.Stroke stroke20 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot12.setOutlineStroke(stroke20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = xYPlot12.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets22);
        java.awt.Paint paint24 = xYPlot0.getRangeMinorGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot25.getDomainAxisLocation();
        boolean boolean32 = xYPlot25.isRangeMinorGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = xYPlot25.getInsets();
        xYPlot0.setAxisOffset(rectangleInsets33);
        xYPlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray18);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray18, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        xYPlot14.zoomRangeAxes((double) '#', plotRenderingInfo16, point2D17);
        int int19 = xYPlot14.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray20 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot14.setRenderers(xYItemRendererArray20);
        java.awt.Stroke stroke22 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot14.setOutlineStroke(stroke22);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray24 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot14.setDomainAxes(valueAxisArray24);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = xYPlot14.getRenderer((int) (short) 0);
        java.awt.Stroke stroke28 = xYPlot14.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        xYPlot14.setDomainAxis((int) (short) 0, valueAxis30, false);
        xYPlot14.setDomainCrosshairValue((double) (-1.0f));
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot14.getDomainAxisLocation();
        xYPlot0.setRangeAxisLocation(10, axisLocation35);
        org.jfree.chart.plot.Plot plot37 = xYPlot0.getParent();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        xYPlot0.setRenderer(xYItemRenderer38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(axisSpace12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray20);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray20, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(valueAxisArray24);
        org.junit.Assert.assertArrayEquals(valueAxisArray24, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNull(plot37);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        xYPlot0.setRangeCrosshairValue(0.0d, true);
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot0.getRangeAxis();
        java.awt.Font font13 = xYPlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getRangeAxisIndex(valueAxis11);
        java.awt.Stroke stroke13 = xYPlot0.getRangeCrosshairStroke();
        java.lang.String str14 = xYPlot0.getNoDataMessage();
        xYPlot0.setRangeGridlinesVisible(false);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        xYPlot0.setDataset(xYDataset17);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot19.zoomRangeAxes((double) '#', plotRenderingInfo21, point2D22);
        int int24 = xYPlot19.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray25 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot19.setRenderers(xYItemRendererArray25);
        java.awt.Stroke stroke27 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot19.setOutlineStroke(stroke27);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot19.getRenderer(100);
        boolean boolean31 = xYPlot19.isOutlineVisible();
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        int int33 = xYPlot32.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        xYPlot32.setRenderer((int) (short) 1, xYItemRenderer35, false);
        org.jfree.chart.axis.AxisLocation axisLocation38 = xYPlot32.getDomainAxisLocation();
        boolean boolean39 = xYPlot32.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        org.jfree.chart.plot.CrosshairState crosshairState45 = null;
        boolean boolean46 = xYPlot40.render(graphics2D41, rectangle2D42, 10, plotRenderingInfo44, crosshairState45);
        int int47 = xYPlot40.getDomainAxisCount();
        java.lang.String str48 = xYPlot40.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        xYPlot40.markerChanged(markerChangeEvent49);
        java.awt.Paint paint51 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot40.setRangeTickBandPaint(paint51);
        xYPlot32.setDomainCrosshairPaint(paint51);
        xYPlot19.setDomainZeroBaselinePaint(paint51);
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj56 = xYPlot55.clone();
        java.awt.Paint paint57 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot55.setRangeMinorGridlinePaint(paint57);
        java.awt.Graphics2D graphics2D59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        org.jfree.chart.plot.XYPlot xYPlot61 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        java.awt.geom.Point2D point2D64 = null;
        xYPlot61.zoomRangeAxes((double) '#', plotRenderingInfo63, point2D64);
        int int66 = xYPlot61.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray67 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot61.setRenderers(xYItemRendererArray67);
        java.awt.Stroke stroke69 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot61.setOutlineStroke(stroke69);
        java.awt.Graphics2D graphics2D71 = null;
        java.awt.geom.Rectangle2D rectangle2D72 = null;
        org.jfree.chart.axis.AxisSpace axisSpace73 = null;
        org.jfree.chart.axis.AxisSpace axisSpace74 = xYPlot61.calculateRangeAxisSpace(graphics2D71, rectangle2D72, axisSpace73);
        org.jfree.chart.axis.AxisSpace axisSpace75 = xYPlot55.calculateDomainAxisSpace(graphics2D59, rectangle2D60, axisSpace74);
        xYPlot19.setFixedDomainAxisSpace(axisSpace74, true);
        xYPlot0.setFixedDomainAxisSpace(axisSpace74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray25);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray25, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 15 + "'", int66 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray67);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray67, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(axisSpace74);
        org.junit.Assert.assertNotNull(axisSpace75);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = xYPlot0.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getDomainMarkers(15, layer5);
        xYPlot0.setRangeCrosshairValue(1.0d);
        xYPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot11.zoomRangeAxes((double) '#', plotRenderingInfo13, point2D14);
        xYPlot11.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.util.Layer layer21 = null;
        xYPlot11.drawDomainMarkers(graphics2D18, rectangle2D19, (int) (byte) 0, layer21);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        int int24 = xYPlot23.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        xYPlot23.setRenderer((int) (short) 1, xYItemRenderer26, false);
        xYPlot23.setRangePannable(false);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot23.setOutlinePaint(paint31);
        xYPlot23.clearAnnotations();
        xYPlot23.setRangeZeroBaselineVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = xYPlot23.getInsets();
        xYPlot11.setInsets(rectangleInsets36);
        xYPlot0.setInsets(rectangleInsets36);
        boolean boolean39 = xYPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(legendItemCollection1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        xYPlot0.notifyListeners(plotChangeEvent2);
        int int4 = xYPlot0.getDatasetCount();
        xYPlot0.setDomainCrosshairValue(0.0d);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = null;
        xYPlot0.setRenderer((int) (short) 10, xYItemRenderer8, true);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        boolean boolean15 = xYPlot0.removeDomainMarker(0, marker12, layer13, false);
        xYPlot0.setDomainCrosshairVisible(true);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint19 = xYPlot0.getQuadrantPaint((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (10) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.util.List list11 = null;
        xYPlot0.drawRangeTickBands(graphics2D9, rectangle2D10, list11);
        xYPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = xYPlot0.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getDomainMarkers(15, layer5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot9.zoomRangeAxes((double) '#', plotRenderingInfo11, point2D12);
        int int14 = xYPlot9.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray15 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot9.setRenderers(xYItemRendererArray15);
        java.awt.Stroke stroke17 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot9.setOutlineStroke(stroke17);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot9.setDomainAxes(valueAxisArray19);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot9.getRenderer((int) (short) 0);
        java.awt.Stroke stroke23 = xYPlot9.getDomainGridlineStroke();
        java.awt.geom.Point2D point2D24 = xYPlot9.getQuadrantOrigin();
        xYPlot0.panDomainAxes((double) 1, plotRenderingInfo8, point2D24);
        xYPlot0.setDomainCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = xYPlot0.getRendererForDataset(xYDataset28);
        org.junit.Assert.assertNotNull(legendItemCollection1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray15);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray15, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertArrayEquals(valueAxisArray19, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(point2D24);
        org.junit.Assert.assertNull(xYItemRenderer29);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        xYPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 10);
        boolean boolean14 = xYPlot0.isDomainZoomable();
        xYPlot0.setRangeZeroBaselineVisible(true);
        java.awt.Stroke stroke17 = xYPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot0.setDomainAxis((int) '4', valueAxis19);
        xYPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = xYPlot25.getDatasetRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot27.zoomRangeAxes((double) '#', plotRenderingInfo29, point2D30);
        int int32 = xYPlot27.getBackgroundImageAlignment();
        java.awt.Stroke stroke33 = xYPlot27.getRangeMinorGridlineStroke();
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot27.setRangeCrosshairPaint(paint34);
        xYPlot25.setRangeZeroBaselinePaint(paint34);
        xYPlot25.setRangeCrosshairVisible(false);
        xYPlot25.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        java.awt.geom.Point2D point2D45 = null;
        xYPlot42.zoomRangeAxes((double) '#', plotRenderingInfo44, point2D45);
        int int47 = xYPlot42.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray48 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot42.setRenderers(xYItemRendererArray48);
        java.awt.Stroke stroke50 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot42.setOutlineStroke(stroke50);
        boolean boolean52 = xYPlot42.isDomainZeroBaselineVisible();
        xYPlot42.configureDomainAxes();
        boolean boolean54 = xYPlot42.isDomainCrosshairLockedOnData();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer55 = xYPlot42.getRenderer();
        xYPlot42.setDomainCrosshairValue((double) (short) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        org.jfree.chart.plot.XYPlot xYPlot60 = new org.jfree.chart.plot.XYPlot();
        int int61 = xYPlot60.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer63 = null;
        xYPlot60.setRenderer((int) (short) 1, xYItemRenderer63, false);
        org.jfree.chart.axis.AxisLocation axisLocation66 = xYPlot60.getDomainAxisLocation();
        boolean boolean67 = xYPlot60.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath68 = null;
        java.awt.geom.Rectangle2D rectangle2D69 = null;
        org.jfree.chart.RenderingSource renderingSource70 = null;
        xYPlot60.select(generalPath68, rectangle2D69, renderingSource70);
        java.awt.Graphics2D graphics2D72 = null;
        java.awt.geom.Rectangle2D rectangle2D73 = null;
        xYPlot60.drawBackgroundImage(graphics2D72, rectangle2D73);
        java.awt.Stroke stroke75 = xYPlot60.getRangeCrosshairStroke();
        java.awt.geom.Point2D point2D76 = xYPlot60.getQuadrantOrigin();
        xYPlot42.zoomDomainAxes((double) 1.0f, plotRenderingInfo59, point2D76);
        xYPlot25.zoomDomainAxes((double) (-1.0f), plotRenderingInfo41, point2D76, false);
        xYPlot0.zoomRangeAxes((double) 0L, (double) (-1L), plotRenderingInfo24, point2D76);
        java.awt.Stroke stroke81 = xYPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray48);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray48, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(xYItemRenderer55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(axisLocation66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertNotNull(point2D76);
        org.junit.Assert.assertNotNull(stroke81);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getDomainAxis((int) (byte) 100);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        boolean boolean10 = xYPlot0.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        boolean boolean10 = xYPlot0.removeDomainMarker((int) (byte) 1, marker8, layer9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot0.getDomainAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot0.getRangeAxisEdge((int) (byte) 1);
        xYPlot0.clearRangeAxes();
        org.jfree.chart.plot.Plot plot16 = xYPlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = xYPlot0.getDrawingSupplier();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.RenderingSource renderingSource6 = null;
        xYPlot0.select((double) 10, (double) (-1), rectangle2D5, renderingSource6);
        boolean boolean8 = xYPlot0.isDomainCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot11.zoomRangeAxes((double) '#', plotRenderingInfo13, point2D14);
        int int16 = xYPlot11.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray17 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot11.setRenderers(xYItemRendererArray17);
        java.awt.Stroke stroke19 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot11.setOutlineStroke(stroke19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        org.jfree.chart.axis.AxisSpace axisSpace24 = xYPlot11.calculateRangeAxisSpace(graphics2D21, rectangle2D22, axisSpace23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = xYPlot0.calculateRangeAxisSpace(graphics2D9, rectangle2D10, axisSpace23);
        java.awt.Paint paint26 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot0.setDomainAxis((int) (short) 1, valueAxis28);
        java.awt.Paint paint30 = xYPlot0.getRangeMinorGridlinePaint();
        boolean boolean31 = xYPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray17);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray17, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(axisSpace24);
        org.junit.Assert.assertNotNull(axisSpace25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isDomainZeroBaselineVisible();
        xYPlot0.setForegroundAlpha((float) (short) -1);
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        int int11 = xYPlot10.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        xYPlot10.setRenderer((int) (short) 1, xYItemRenderer13, false);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot10.getDomainAxisLocation();
        boolean boolean17 = xYPlot10.isRangeMinorGridlinesVisible();
        int int18 = xYPlot10.getWeight();
        java.util.List list19 = xYPlot10.getAnnotations();
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot10);
        xYPlot10.setRangeCrosshairValue(0.0d, false);
        java.awt.Stroke stroke24 = xYPlot10.getRangeGridlineStroke();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        boolean boolean10 = xYPlot0.removeDomainMarker((int) (byte) 1, marker8, layer9);
        xYPlot0.setRangeGridlinesVisible(false);
        xYPlot0.clearSelection();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        int int15 = xYPlot14.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        xYPlot14.setRenderer((int) (short) 1, xYItemRenderer17, false);
        xYPlot14.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        xYPlot14.setRangeAxis(valueAxis22);
        boolean boolean24 = xYPlot14.isRangeCrosshairLockedOnData();
        java.awt.Paint paint25 = xYPlot14.getDomainMinorGridlinePaint();
        xYPlot0.setRangeMinorGridlinePaint(paint25);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot0.setDomainAxis((int) (short) 0, valueAxis28);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getDomainAxis((int) (byte) 100);
        org.jfree.chart.plot.Plot plot8 = xYPlot0.getRootPlot();
        xYPlot0.setWeight((int) 'a');
        int int11 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = xYPlot0.getDomainMarkers(layer12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot0.setRangeAxis(valueAxis14);
        xYPlot0.clearDomainMarkers((int) (short) 100);
        xYPlot0.setDomainCrosshairVisible(false);
        org.jfree.chart.plot.Marker marker20 = null;
        boolean boolean21 = xYPlot0.removeDomainMarker(marker20);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getRangeAxisIndex(valueAxis11);
        java.awt.Stroke stroke13 = xYPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        int int15 = xYPlot14.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        xYPlot14.setRenderer((int) (short) 1, xYItemRenderer17, false);
        xYPlot14.setRangePannable(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = xYPlot14.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        xYPlot0.drawDomainMarkers(graphics2D24, rectangle2D25, (-1), layer27);
        boolean boolean29 = xYPlot0.isDomainPannable();
        org.jfree.data.xy.XYDataset xYDataset30 = xYPlot0.getDataset();
        boolean boolean31 = xYPlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(xYDataset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Paint paint11 = xYPlot0.getDomainCrosshairPaint();
        xYPlot0.configureRangeAxes();
        java.awt.Paint paint13 = xYPlot0.getDomainZeroBaselinePaint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer2 = null;
        int int3 = xYPlot0.getIndexOf(xYItemRenderer2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        xYPlot0.zoomRangeAxes((double) 15, plotRenderingInfo5, point2D6);
        java.awt.Stroke stroke8 = xYPlot0.getDomainMinorGridlineStroke();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        boolean boolean13 = xYPlot0.removeDomainMarker((int) '4', marker10, layer11, false);
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getDomainAxisIndex(valueAxis11);
        int int13 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = xYPlot0.getRangeMarkers((int) (short) -1, layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot0.setDomainAxis(valueAxis17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = xYPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace20 = xYPlot0.getFixedRangeAxisSpace();
        boolean boolean21 = xYPlot0.isNotify();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.util.List list24 = null;
        xYPlot0.drawRangeTickBands(graphics2D22, rectangle2D23, list24);
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        xYPlot0.setDataset((int) '4', xYDataset27);
        boolean boolean29 = xYPlot0.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(axisSpace19);
        org.junit.Assert.assertNull(axisSpace20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke6 = xYPlot0.getRangeMinorGridlineStroke();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis(valueAxis8);
        java.awt.Stroke stroke10 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setDomainCrosshairValue((double) 100L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        int int16 = xYPlot15.getDomainAxisCount();
        xYPlot15.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        int int20 = xYPlot19.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        xYPlot19.setRenderer((int) (short) 1, xYItemRenderer22, false);
        xYPlot19.setRangePannable(false);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot19.setOutlinePaint(paint27);
        xYPlot15.setDomainMinorGridlinePaint(paint27);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot15.setDomainZeroBaselinePaint(paint30);
        java.awt.geom.Point2D point2D32 = xYPlot15.getQuadrantOrigin();
        xYPlot0.zoomDomainAxes((double) 100L, plotRenderingInfo14, point2D32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(point2D32);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        xYPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 10);
        xYPlot0.clearRangeMarkers();
        boolean boolean15 = xYPlot0.isDomainCrosshairVisible();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        xYPlot0.notifyListeners(plotChangeEvent2);
        xYPlot0.zoom((double) (short) 100);
        float float6 = xYPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        int int8 = xYPlot7.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        xYPlot7.setRenderer((int) (short) 1, xYItemRenderer10, false);
        xYPlot7.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot7.setRangeAxis(valueAxis15);
        java.awt.Stroke stroke17 = xYPlot7.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = xYPlot0.getDomainAxisEdge(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleEdge20);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        boolean boolean11 = xYPlot0.isDomainZeroBaselineVisible();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        xYPlot0.markerChanged(markerChangeEvent11);
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setRangeCrosshairStroke(stroke13);
        java.awt.geom.Point2D point2D15 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = xYPlot0.getDataRange(valueAxis16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(point2D15);
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        boolean boolean9 = xYPlot0.isDomainZoomable();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        xYPlot10.zoomRangeAxes((double) '#', plotRenderingInfo12, point2D13);
        int int15 = xYPlot10.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray16 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot10.setRenderers(xYItemRendererArray16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot10.setOutlineStroke(stroke18);
        double double20 = xYPlot10.getDomainCrosshairValue();
        boolean boolean21 = xYPlot10.isRangeCrosshairVisible();
        java.awt.Paint paint22 = xYPlot10.getBackgroundPaint();
        xYPlot10.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot25.getDomainAxisLocation();
        boolean boolean32 = xYPlot25.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        org.jfree.chart.plot.CrosshairState crosshairState38 = null;
        boolean boolean39 = xYPlot33.render(graphics2D34, rectangle2D35, 10, plotRenderingInfo37, crosshairState38);
        int int40 = xYPlot33.getDomainAxisCount();
        java.lang.String str41 = xYPlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        xYPlot33.markerChanged(markerChangeEvent42);
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot33.setRangeTickBandPaint(paint44);
        xYPlot25.setDomainCrosshairPaint(paint44);
        xYPlot10.setDomainCrosshairPaint(paint44);
        xYPlot0.setDomainTickBandPaint(paint44);
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        xYPlot49.zoomRangeAxes((double) '#', plotRenderingInfo51, point2D52);
        int int54 = xYPlot49.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray55 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot49.setRenderers(xYItemRendererArray55);
        java.awt.Stroke stroke57 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot49.setOutlineStroke(stroke57);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray59 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot49.setDomainAxes(valueAxisArray59);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer62 = xYPlot49.getRenderer((int) (short) 0);
        org.jfree.chart.plot.XYPlot xYPlot63 = new org.jfree.chart.plot.XYPlot();
        int int64 = xYPlot63.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer66 = null;
        xYPlot63.setRenderer((int) (short) 1, xYItemRenderer66, false);
        xYPlot63.setRangePannable(false);
        java.awt.Paint paint71 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot63.setOutlinePaint(paint71);
        org.jfree.chart.plot.XYPlot xYPlot73 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo75 = null;
        java.awt.geom.Point2D point2D76 = null;
        xYPlot73.zoomRangeAxes((double) '#', plotRenderingInfo75, point2D76);
        int int78 = xYPlot73.getBackgroundImageAlignment();
        java.awt.Stroke stroke79 = xYPlot73.getRangeMinorGridlineStroke();
        xYPlot63.setDomainZeroBaselineStroke(stroke79);
        xYPlot49.setDomainGridlineStroke(stroke79);
        xYPlot0.setDomainZeroBaselineStroke(stroke79);
        boolean boolean83 = xYPlot0.canSelectByPoint();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray16);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray16, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray55);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray55, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(valueAxisArray59);
        org.junit.Assert.assertArrayEquals(valueAxisArray59, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 15 + "'", int78 == 15);
        org.junit.Assert.assertNotNull(stroke79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        boolean boolean11 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint12 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        xYPlot13.setRenderer((int) (short) 1, xYItemRenderer16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot13.getDomainAxisLocation();
        boolean boolean20 = xYPlot13.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.RenderingSource renderingSource23 = null;
        xYPlot13.select(generalPath21, rectangle2D22, renderingSource23);
        xYPlot13.clearDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        xYPlot26.zoomRangeAxes((double) '#', plotRenderingInfo28, point2D29);
        int int31 = xYPlot26.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        boolean boolean34 = xYPlot26.removeDomainMarker(marker32, layer33);
        xYPlot26.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        int int38 = xYPlot26.getDomainAxisIndex(valueAxis37);
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        java.util.List list41 = null;
        xYPlot26.drawRangeGridlines(graphics2D39, rectangle2D40, list41);
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot();
        int int44 = xYPlot43.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        xYPlot43.setRenderer((int) (short) 1, xYItemRenderer46, false);
        xYPlot43.setRangePannable(false);
        int int51 = xYPlot43.getBackgroundImageAlignment();
        boolean boolean52 = xYPlot43.isDomainZeroBaselineVisible();
        java.awt.Paint paint53 = xYPlot43.getRangeZeroBaselinePaint();
        xYPlot26.setDomainGridlinePaint(paint53);
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        java.awt.geom.Point2D point2D58 = null;
        xYPlot55.zoomRangeAxes((double) '#', plotRenderingInfo57, point2D58);
        int int60 = xYPlot55.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray61 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot55.setRenderers(xYItemRendererArray61);
        java.awt.Stroke stroke63 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot55.setOutlineStroke(stroke63);
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = xYPlot55.getAxisOffset();
        xYPlot26.setAxisOffset(rectangleInsets65);
        xYPlot13.setInsets(rectangleInsets65, true);
        xYPlot0.setInsets(rectangleInsets65, true);
        xYPlot0.clearSelection();
        xYPlot0.mapDatasetToDomainAxis((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray61);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray61, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertNotNull(rectangleInsets65);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setOutlinePaint(paint8);
        xYPlot0.clearAnnotations();
        xYPlot0.setForegroundAlpha((float) (-1));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        xYPlot0.setRenderer(0, xYItemRenderer15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        xYPlot0.notifyListeners(plotChangeEvent2);
        int int4 = xYPlot0.getDatasetCount();
        boolean boolean5 = xYPlot0.isDomainMinorGridlinesVisible();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        xYPlot0.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot0.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getDomainAxisIndex(valueAxis11);
        xYPlot0.setRangeZeroBaselineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot0.getDomainAxisLocation();
        java.awt.Stroke stroke16 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot17.zoomRangeAxes((double) '#', plotRenderingInfo19, point2D20);
        int int22 = xYPlot17.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray23 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot17.setRenderers(xYItemRendererArray23);
        xYPlot0.setRenderers(xYItemRendererArray23);
        xYPlot0.clearDomainMarkers((int) 'a');
        java.awt.Paint paint28 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean29 = xYPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray23);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray23, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getRangeAxisIndex(valueAxis11);
        java.awt.Stroke stroke13 = xYPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        int int15 = xYPlot14.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        xYPlot14.setRenderer((int) (short) 1, xYItemRenderer17, false);
        xYPlot14.setRangePannable(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = xYPlot14.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        xYPlot0.drawDomainMarkers(graphics2D24, rectangle2D25, (-1), layer27);
        boolean boolean29 = xYPlot0.isDomainPannable();
        org.jfree.data.xy.XYDataset xYDataset30 = xYPlot0.getDataset();
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        xYPlot32.zoomRangeAxes((double) '#', plotRenderingInfo34, point2D35);
        int int37 = xYPlot32.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray38 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot32.setRenderers(xYItemRendererArray38);
        java.awt.Stroke stroke40 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot32.setOutlineStroke(stroke40);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray42 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot32.setDomainAxes(valueAxisArray42);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = xYPlot32.getRenderer((int) (short) 0);
        java.awt.Stroke stroke46 = xYPlot32.getDomainGridlineStroke();
        org.jfree.chart.plot.Plot plot47 = xYPlot32.getRootPlot();
        xYPlot32.setDomainPannable(false);
        int int50 = xYPlot32.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot32.getRangeAxisLocation();
        xYPlot0.setRangeAxisLocation((int) (byte) 100, axisLocation51, true);
        java.awt.Image image54 = xYPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(xYDataset30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray38);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray38, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(valueAxisArray42);
        org.junit.Assert.assertArrayEquals(valueAxisArray42, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(plot47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 15 + "'", int50 == 15);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNull(image54);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.util.List list11 = null;
        xYPlot0.drawRangeTickBands(graphics2D9, rectangle2D10, list11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        int int18 = xYPlot13.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray19 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot13.setRenderers(xYItemRendererArray19);
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot13.setOutlineStroke(stroke21);
        double double23 = xYPlot13.getDomainCrosshairValue();
        boolean boolean24 = xYPlot13.isRangeCrosshairVisible();
        java.awt.Paint paint25 = xYPlot13.getBackgroundPaint();
        xYPlot0.setOutlinePaint(paint25);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot27.zoomRangeAxes((double) '#', plotRenderingInfo29, point2D30);
        int int32 = xYPlot27.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        boolean boolean35 = xYPlot27.removeDomainMarker(marker33, layer34);
        xYPlot27.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        int int39 = xYPlot27.getDomainAxisIndex(valueAxis38);
        int int40 = xYPlot27.getDomainAxisCount();
        org.jfree.chart.util.Layer layer42 = null;
        java.util.Collection collection43 = xYPlot27.getRangeMarkers((int) (short) -1, layer42);
        boolean boolean44 = xYPlot27.isDomainPannable();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray45 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot27.setRenderers(xYItemRendererArray45);
        xYPlot0.setRenderers(xYItemRendererArray45);
        java.awt.Paint paint48 = xYPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray19);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray19, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(xYItemRendererArray45);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray45, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = xYPlot0.getRangeTickBandPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = xYPlot0.getRenderer((int) (byte) 10);
        xYPlot0.setDomainCrosshairValue((double) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xYPlot0.removeRangeMarker(marker17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(xYItemRenderer14);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        boolean boolean9 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean10 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Paint paint11 = xYPlot0.getRangeTickBandPaint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        xYPlot0.setRangeGridlinesVisible(false);
        java.awt.Image image13 = null;
        xYPlot0.setBackgroundImage(image13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot0.panDomainAxes((double) (byte) 1, plotRenderingInfo8, point2D9);
        xYPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot0.getRangeMarkers((int) '4', layer14);
        java.awt.Paint paint16 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot17.zoomRangeAxes((double) '#', plotRenderingInfo19, point2D20);
        int int22 = xYPlot17.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray23 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot17.setRenderers(xYItemRendererArray23);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot17.setOutlineStroke(stroke25);
        boolean boolean27 = xYPlot17.isDomainZeroBaselineVisible();
        java.awt.Paint paint28 = xYPlot17.getRangeMinorGridlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        xYPlot17.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = xYPlot17.getNoDataMessagePaint();
        java.awt.Stroke stroke32 = xYPlot17.getOutlineStroke();
        xYPlot0.setRangeCrosshairStroke(stroke32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray23);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray23, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        xYPlot0.setNotify(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick(100, (int) (short) 1, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        double double10 = xYPlot0.getDomainCrosshairValue();
        xYPlot0.setOutlineVisible(true);
        java.util.List list13 = xYPlot0.getAnnotations();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        int int15 = xYPlot14.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = xYPlot14.getRangeAxisIndex(valueAxis16);
        xYPlot14.setRangeCrosshairLockedOnData(false);
        java.awt.Stroke stroke20 = xYPlot14.getRangeMinorGridlineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke20);
        double double22 = xYPlot0.getDomainCrosshairValue();
        xYPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        java.awt.Paint paint4 = xYPlot0.getRangeGridlinePaint();
        boolean boolean5 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint6 = xYPlot0.getDomainCrosshairPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot0.setDomainAxes(valueAxisArray10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRenderer((int) (short) 0);
        java.awt.Stroke stroke14 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot0.setDomainAxis((int) (short) 0, valueAxis16, false);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot19.zoomRangeAxes((double) '#', plotRenderingInfo21, point2D22);
        int int24 = xYPlot19.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray25 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot19.setRenderers(xYItemRendererArray25);
        java.awt.Stroke stroke27 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot19.setOutlineStroke(stroke27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.axis.AxisSpace axisSpace31 = null;
        org.jfree.chart.axis.AxisSpace axisSpace32 = xYPlot19.calculateRangeAxisSpace(graphics2D29, rectangle2D30, axisSpace31);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        xYPlot19.setDomainAxis((int) (short) 100, valueAxis34);
        boolean boolean36 = xYPlot19.isRangeCrosshairLockedOnData();
        xYPlot19.setDomainGridlinesVisible(false);
        org.jfree.chart.LegendItemCollection legendItemCollection39 = xYPlot19.getFixedLegendItems();
        java.awt.Stroke stroke40 = xYPlot19.getRangeGridlineStroke();
        xYPlot0.setRangeGridlineStroke(stroke40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertArrayEquals(valueAxisArray10, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray25);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray25, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(axisSpace32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(legendItemCollection39);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot13.zoomDomainAxes((double) 10L, (double) 10.0f, plotRenderingInfo21, point2D22);
        boolean boolean24 = xYPlot13.isSubplot();
        xYPlot13.setRangeMinorGridlinesVisible(false);
        org.jfree.data.xy.XYDataset xYDataset27 = xYPlot13.getDataset();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = xYPlot13.getRenderer();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        xYPlot13.addChangeListener(plotChangeListener29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(xYDataset27);
        org.junit.Assert.assertNull(xYItemRenderer28);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        boolean boolean11 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint12 = xYPlot0.getBackgroundPaint();
        xYPlot0.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        int int16 = xYPlot15.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        xYPlot15.setRenderer((int) (short) 1, xYItemRenderer18, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot15.getDomainAxisLocation();
        boolean boolean22 = xYPlot15.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        org.jfree.chart.plot.CrosshairState crosshairState28 = null;
        boolean boolean29 = xYPlot23.render(graphics2D24, rectangle2D25, 10, plotRenderingInfo27, crosshairState28);
        int int30 = xYPlot23.getDomainAxisCount();
        java.lang.String str31 = xYPlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        xYPlot23.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot23.setRangeTickBandPaint(paint34);
        xYPlot15.setDomainCrosshairPaint(paint34);
        xYPlot0.setDomainCrosshairPaint(paint34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        xYPlot0.zoomDomainAxes((double) ' ', plotRenderingInfo39, point2D40, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot2 = new org.jfree.chart.plot.XYPlot();
        int int3 = xYPlot2.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = null;
        xYPlot2.setRenderer((int) (short) 1, xYItemRenderer5, false);
        xYPlot2.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot2.setRangeAxis(valueAxis10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = xYPlot2.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        xYPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 10);
        boolean boolean14 = xYPlot0.isDomainZoomable();
        xYPlot0.setRangeZeroBaselineVisible(true);
        java.awt.Stroke stroke17 = xYPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot0.getDomainAxisLocation((int) (short) -1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = xYPlot0.getRenderer(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(xYItemRenderer21);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isDomainZeroBaselineVisible();
        java.awt.Stroke stroke8 = xYPlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        boolean boolean11 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint12 = xYPlot0.getBackgroundPaint();
        xYPlot0.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        int int16 = xYPlot15.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        xYPlot15.setRenderer((int) (short) 1, xYItemRenderer18, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot15.getDomainAxisLocation();
        boolean boolean22 = xYPlot15.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        org.jfree.chart.plot.CrosshairState crosshairState28 = null;
        boolean boolean29 = xYPlot23.render(graphics2D24, rectangle2D25, 10, plotRenderingInfo27, crosshairState28);
        int int30 = xYPlot23.getDomainAxisCount();
        java.lang.String str31 = xYPlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        xYPlot23.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot23.setRangeTickBandPaint(paint34);
        xYPlot15.setDomainCrosshairPaint(paint34);
        xYPlot0.setDomainCrosshairPaint(paint34);
        double double38 = xYPlot0.getRangeCrosshairValue();
        org.jfree.data.general.DatasetGroup datasetGroup39 = xYPlot0.getDatasetGroup();
        xYPlot0.setRangeCrosshairValue((double) (byte) -1, false);
        xYPlot0.setNotify(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup39);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot13.zoomDomainAxes((double) 10L, (double) 10.0f, plotRenderingInfo21, point2D22);
        xYPlot13.configureRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = xYPlot13.getDomainAxisEdge();
        java.awt.Stroke stroke26 = xYPlot13.getRangeGridlineStroke();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot13.addAnnotation(xYAnnotation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        xYPlot0.configureDomainAxes();
        boolean boolean12 = xYPlot0.isDomainCrosshairLockedOnData();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRenderer();
        boolean boolean14 = xYPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeMinorGridlinesVisible(false);
        boolean boolean7 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = xYPlot0.getInsets();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        xYPlot0.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.chart.plot.CrosshairState crosshairState13 = null;
        boolean boolean14 = xYPlot8.render(graphics2D9, rectangle2D10, 10, plotRenderingInfo12, crosshairState13);
        int int15 = xYPlot8.getDomainAxisCount();
        java.lang.String str16 = xYPlot8.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        xYPlot8.markerChanged(markerChangeEvent17);
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot8.setRangeTickBandPaint(paint19);
        xYPlot0.setDomainCrosshairPaint(paint19);
        java.awt.Paint paint22 = xYPlot0.getRangeGridlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        xYPlot0.datasetChanged(datasetChangeEvent23);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot0.getDomainAxis((int) (byte) 100);
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot29.zoomRangeAxes((double) '#', plotRenderingInfo31, point2D32);
        int int34 = xYPlot29.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray35 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot29.setRenderers(xYItemRendererArray35);
        java.awt.Stroke stroke37 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot29.setOutlineStroke(stroke37);
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.axis.AxisSpace axisSpace41 = null;
        org.jfree.chart.axis.AxisSpace axisSpace42 = xYPlot29.calculateRangeAxisSpace(graphics2D39, rectangle2D40, axisSpace41);
        xYPlot0.setFixedDomainAxisSpace(axisSpace42, true);
        xYPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        xYPlot0.setDomainAxis(valueAxis47);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray35);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray35, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(axisSpace42);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot0.drawQuadrants(graphics2D13, rectangle2D14);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = xYPlot0.getRendererForDataset(xYDataset16);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot0.getRangeMarkers((int) ' ', layer19);
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(1, marker22, layer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(xYItemRenderer17);
        org.junit.Assert.assertNull(collection20);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        xYPlot0.axisChanged(axisChangeEvent4);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot6.zoomRangeAxes((double) '#', plotRenderingInfo8, point2D9);
        int int11 = xYPlot6.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray12 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot6.setRenderers(xYItemRendererArray12);
        java.awt.Stroke stroke14 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot6.setOutlineStroke(stroke14);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray16 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot6.setDomainAxes(valueAxisArray16);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = xYPlot6.getRenderer((int) (short) 0);
        java.awt.Stroke stroke20 = xYPlot6.getDomainGridlineStroke();
        org.jfree.chart.plot.Plot plot21 = xYPlot6.getRootPlot();
        boolean boolean22 = xYPlot0.equals((java.lang.Object) plot21);
        plot21.setBackgroundImageAlignment((int) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray12);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray12, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(valueAxisArray16);
        org.junit.Assert.assertArrayEquals(valueAxisArray16, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        xYPlot0.markerChanged(markerChangeEvent11);
        boolean boolean13 = xYPlot0.canSelectByPoint();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        int int15 = xYPlot14.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        xYPlot14.setRenderer((int) (short) 1, xYItemRenderer17, false);
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot14.getDomainAxisLocation();
        boolean boolean21 = xYPlot14.isRangeMinorGridlinesVisible();
        boolean boolean22 = xYPlot14.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = xYPlot14.getRenderer();
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        xYPlot24.zoomRangeAxes((double) '#', plotRenderingInfo26, point2D27);
        int int29 = xYPlot24.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray30 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot24.setRenderers(xYItemRendererArray30);
        java.awt.Stroke stroke32 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot24.setOutlineStroke(stroke32);
        boolean boolean34 = xYPlot24.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        int int36 = xYPlot24.getRangeAxisIndex(valueAxis35);
        java.awt.Stroke stroke37 = xYPlot24.getRangeCrosshairStroke();
        xYPlot14.setRangeMinorGridlineStroke(stroke37);
        xYPlot0.setRangeZeroBaselineStroke(stroke37);
        boolean boolean40 = xYPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint41 = xYPlot0.getDomainZeroBaselinePaint();
        xYPlot0.setWeight((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(xYItemRenderer23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray30);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray30, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer2 = null;
        int int3 = xYPlot0.getIndexOf(xYItemRenderer2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        xYPlot0.zoomRangeAxes((double) 15, plotRenderingInfo5, point2D6);
        java.awt.Stroke stroke8 = xYPlot0.getDomainMinorGridlineStroke();
        xYPlot0.clearDomainMarkers();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        xYPlot10.zoomRangeAxes((double) '#', plotRenderingInfo12, point2D13);
        int int15 = xYPlot10.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray16 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot10.setRenderers(xYItemRendererArray16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot10.setOutlineStroke(stroke18);
        double double20 = xYPlot10.getDomainCrosshairValue();
        boolean boolean21 = xYPlot10.isRangeCrosshairVisible();
        java.awt.Paint paint22 = xYPlot10.getBackgroundPaint();
        xYPlot10.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot25.getDomainAxisLocation();
        boolean boolean32 = xYPlot25.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        org.jfree.chart.plot.CrosshairState crosshairState38 = null;
        boolean boolean39 = xYPlot33.render(graphics2D34, rectangle2D35, 10, plotRenderingInfo37, crosshairState38);
        int int40 = xYPlot33.getDomainAxisCount();
        java.lang.String str41 = xYPlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        xYPlot33.markerChanged(markerChangeEvent42);
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot33.setRangeTickBandPaint(paint44);
        xYPlot25.setDomainCrosshairPaint(paint44);
        xYPlot10.setDomainCrosshairPaint(paint44);
        double double48 = xYPlot10.getRangeCrosshairValue();
        org.jfree.data.general.DatasetGroup datasetGroup49 = xYPlot10.getDatasetGroup();
        xYPlot10.setRangeCrosshairValue((double) (byte) -1, false);
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        int int54 = xYPlot53.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer56 = null;
        xYPlot53.setRenderer((int) (short) 1, xYItemRenderer56, false);
        org.jfree.chart.axis.AxisLocation axisLocation59 = xYPlot53.getDomainAxisLocation();
        boolean boolean60 = xYPlot53.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        org.jfree.chart.RenderingSource renderingSource63 = null;
        xYPlot53.select(generalPath61, rectangle2D62, renderingSource63);
        xYPlot53.clearDomainAxes();
        java.awt.Paint paint66 = xYPlot53.getOutlinePaint();
        xYPlot10.setRangeGridlinePaint(paint66);
        xYPlot0.setBackgroundPaint(paint66);
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray16);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray16, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(axisLocation59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(paint66);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Paint paint11 = xYPlot0.getRangeZeroBaselinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot0.setRangeAxis(100, valueAxis13);
        boolean boolean15 = xYPlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis((int) (short) 100);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        java.awt.Paint paint11 = xYPlot0.getDomainMinorGridlinePaint();
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairLockedOnData(false);
        java.awt.Stroke stroke6 = xYPlot0.getRangeMinorGridlineStroke();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        xYPlot0.drawAnnotations(graphics2D7, rectangle2D8, plotRenderingInfo9);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot11.zoomRangeAxes((double) '#', plotRenderingInfo13, point2D14);
        xYPlot11.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean21 = xYPlot11.removeDomainMarker((int) (byte) 1, marker19, layer20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot11.getDomainAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = xYPlot11.getRangeAxisEdge((int) (byte) 1);
        xYPlot11.clearRangeAxes();
        java.awt.Stroke stroke27 = xYPlot11.getRangeCrosshairStroke();
        xYPlot0.setDomainCrosshairStroke(stroke27);
        boolean boolean29 = xYPlot0.isOutlineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.data.Range range31 = xYPlot0.getDataRange(valueAxis30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(range31);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        int int8 = xYPlot0.getWeight();
        java.awt.Font font9 = xYPlot0.getNoDataMessageFont();
        java.awt.Paint paint10 = xYPlot0.getRangeTickBandPaint();
        boolean boolean11 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = xYPlot0.getDomainMarkers(layer12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        xYPlot0.markerChanged(markerChangeEvent14);
        xYPlot0.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        int int19 = xYPlot0.getDomainAxisIndex(valueAxis18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = xYPlot0.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getDomainMarkers(15, layer5);
        xYPlot0.setRangeCrosshairValue(1.0d);
        xYPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot11.zoomRangeAxes((double) '#', plotRenderingInfo13, point2D14);
        xYPlot11.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.util.Layer layer21 = null;
        xYPlot11.drawDomainMarkers(graphics2D18, rectangle2D19, (int) (byte) 0, layer21);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        int int24 = xYPlot23.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        xYPlot23.setRenderer((int) (short) 1, xYItemRenderer26, false);
        xYPlot23.setRangePannable(false);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot23.setOutlinePaint(paint31);
        xYPlot23.clearAnnotations();
        xYPlot23.setRangeZeroBaselineVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = xYPlot23.getInsets();
        xYPlot11.setInsets(rectangleInsets36);
        xYPlot0.setInsets(rectangleInsets36);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDatasetRenderingOrder(datasetRenderingOrder39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets36);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot0.setDomainAxes(valueAxisArray10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRenderer((int) (short) 0);
        java.awt.Stroke stroke14 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot0.setDomainAxis((int) (short) 0, valueAxis16, false);
        xYPlot0.setDomainCrosshairValue((double) (-1.0f));
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        int int22 = xYPlot21.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        xYPlot21.setRenderer((int) (short) 1, xYItemRenderer24, false);
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot21.getDomainAxisLocation();
        boolean boolean28 = xYPlot21.isRangeMinorGridlinesVisible();
        int int29 = xYPlot21.getWeight();
        java.awt.Stroke stroke30 = xYPlot21.getRangeZeroBaselineStroke();
        xYPlot0.setDomainZeroBaselineStroke(stroke30);
        org.jfree.chart.plot.PlotOrientation plotOrientation32 = xYPlot0.getOrientation();
        org.jfree.chart.plot.PlotOrientation plotOrientation33 = xYPlot0.getOrientation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertArrayEquals(valueAxisArray10, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertNotNull(plotOrientation33);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        xYPlot0.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot0.setRangeTickBandPaint(paint11);
        java.awt.Image image13 = xYPlot0.getBackgroundImage();
        boolean boolean14 = xYPlot0.isDomainPannable();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        xYPlot0.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.AxisSpace axisSpace20 = xYPlot0.calculateAxisSpace(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        java.awt.Paint paint7 = xYPlot0.getRangeMinorGridlinePaint();
        java.awt.geom.GeneralPath generalPath8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.RenderingSource renderingSource10 = null;
        xYPlot0.select(generalPath8, rectangle2D9, renderingSource10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = xYPlot0.getDrawingSupplier();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.RenderingSource renderingSource6 = null;
        xYPlot0.select((double) 10, (double) (-1), rectangle2D5, renderingSource6);
        xYPlot0.setWeight((int) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        int int13 = xYPlot12.getDomainAxisCount();
        xYPlot12.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        int int17 = xYPlot16.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot16.setRenderer((int) (short) 1, xYItemRenderer19, false);
        xYPlot16.setRangePannable(false);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot16.setOutlinePaint(paint24);
        xYPlot12.setDomainMinorGridlinePaint(paint24);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot12.setDomainZeroBaselinePaint(paint27);
        boolean boolean29 = xYPlot12.isRangeZoomable();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = null;
        xYPlot12.setRenderer(xYItemRenderer30);
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        xYPlot32.zoomRangeAxes((double) '#', plotRenderingInfo34, point2D35);
        int int37 = xYPlot32.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray38 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot32.setRenderers(xYItemRendererArray38);
        java.awt.Stroke stroke40 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot32.setOutlineStroke(stroke40);
        boolean boolean42 = xYPlot32.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        int int44 = xYPlot32.getRangeAxisIndex(valueAxis43);
        java.awt.Stroke stroke45 = xYPlot32.getRangeCrosshairStroke();
        xYPlot12.setRangeCrosshairStroke(stroke45);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        int int48 = xYPlot12.getIndexOf(xYItemRenderer47);
        java.awt.geom.Point2D point2D49 = xYPlot12.getQuadrantOrigin();
        xYPlot0.panRangeAxes((double) '#', plotRenderingInfo11, point2D49);
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj53 = xYPlot52.clone();
        java.awt.Paint paint54 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot52.setRangeMinorGridlinePaint(paint54);
        java.awt.Graphics2D graphics2D56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        xYPlot52.drawZeroDomainBaseline(graphics2D56, rectangle2D57);
        java.awt.geom.Point2D point2D59 = xYPlot52.getQuadrantOrigin();
        java.util.List list60 = xYPlot52.getAnnotations();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.mapDatasetToDomainAxes((int) '4', list60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray38);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray38, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(point2D49);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(point2D59);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot13.zoomDomainAxes((double) 10L, (double) 10.0f, plotRenderingInfo21, point2D22);
        boolean boolean24 = xYPlot13.isSubplot();
        xYPlot13.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = xYPlot13.getDomainAxisEdge(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rectangleEdge28);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getDomainAxis((int) (byte) 100);
        xYPlot0.setForegroundAlpha((float) (-1L));
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot0.getDomainAxisForDataset(0);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.CrosshairState crosshairState17 = null;
        boolean boolean18 = xYPlot12.render(graphics2D13, rectangle2D14, 10, plotRenderingInfo16, crosshairState17);
        int int19 = xYPlot12.getDomainAxisCount();
        java.lang.String str20 = xYPlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        xYPlot12.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot12.setRangeTickBandPaint(paint23);
        xYPlot12.clearRangeMarkers();
        xYPlot12.setDomainPannable(false);
        java.awt.Stroke stroke28 = xYPlot12.getDomainZeroBaselineStroke();
        xYPlot0.setOutlineStroke(stroke28);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = xYPlot0.getDrawingSupplier();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.RenderingSource renderingSource6 = null;
        xYPlot0.select((double) 10, (double) (-1), rectangle2D5, renderingSource6);
        xYPlot0.setWeight((int) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.CrosshairState crosshairState17 = null;
        boolean boolean18 = xYPlot12.render(graphics2D13, rectangle2D14, 10, plotRenderingInfo16, crosshairState17);
        int int19 = xYPlot12.getDomainAxisCount();
        java.lang.String str20 = xYPlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        xYPlot12.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot12.setRangeTickBandPaint(paint23);
        xYPlot12.clearRangeMarkers();
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        xYPlot26.zoomRangeAxes((double) '#', plotRenderingInfo28, point2D29);
        int int31 = xYPlot26.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray32 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot26.setRenderers(xYItemRendererArray32);
        java.awt.Stroke stroke34 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot26.setOutlineStroke(stroke34);
        boolean boolean36 = xYPlot26.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        int int38 = xYPlot26.getRangeAxisIndex(valueAxis37);
        java.awt.Stroke stroke39 = xYPlot26.getRangeMinorGridlineStroke();
        boolean boolean40 = xYPlot26.isRangeCrosshairVisible();
        org.jfree.chart.plot.Plot plot41 = xYPlot26.getRootPlot();
        java.awt.geom.Point2D point2D42 = xYPlot26.getQuadrantOrigin();
        xYPlot12.setQuadrantOrigin(point2D42);
        xYPlot0.panRangeAxes((double) ' ', plotRenderingInfo11, point2D42);
        double double45 = xYPlot0.getDomainCrosshairValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray32);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray32, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertNotNull(point2D42);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getDomainAxis((int) (byte) 100);
        org.jfree.chart.plot.Plot plot8 = xYPlot0.getRootPlot();
        xYPlot0.setWeight((int) 'a');
        int int11 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        xYPlot0.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = xYPlot0.getDomainMinorGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        xYPlot15.zoomRangeAxes((double) '#', plotRenderingInfo17, point2D18);
        int int20 = xYPlot15.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray21 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot15.setRenderers(xYItemRendererArray21);
        java.awt.Stroke stroke23 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot15.setOutlineStroke(stroke23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        org.jfree.chart.axis.AxisSpace axisSpace28 = xYPlot15.calculateRangeAxisSpace(graphics2D25, rectangle2D26, axisSpace27);
        xYPlot0.setFixedDomainAxisSpace(axisSpace27, true);
        boolean boolean31 = xYPlot0.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray21);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray21, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(axisSpace28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = xYPlot0.getRangeTickBandPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = xYPlot0.getRenderer((int) (byte) 10);
        xYPlot0.setDomainCrosshairValue((double) (byte) 1);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        int int18 = xYPlot17.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        xYPlot17.setRenderer((int) (short) 1, xYItemRenderer20, false);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot17.getDomainAxisLocation();
        boolean boolean24 = xYPlot17.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.RenderingSource renderingSource27 = null;
        xYPlot17.select(generalPath25, rectangle2D26, renderingSource27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        xYPlot17.drawBackgroundImage(graphics2D29, rectangle2D30);
        java.awt.Stroke stroke32 = xYPlot17.getRangeCrosshairStroke();
        java.awt.Paint paint33 = xYPlot17.getDomainCrosshairPaint();
        java.awt.Paint paint34 = xYPlot17.getDomainMinorGridlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint34);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawOutline(graphics2D36, rectangle2D37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(xYItemRenderer14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        int int10 = xYPlot0.getSeriesCount();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj12 = xYPlot11.clone();
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot11.setRangeMinorGridlinePaint(paint13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        xYPlot11.axisChanged(axisChangeEvent15);
        boolean boolean17 = xYPlot11.isRangeGridlinesVisible();
        java.awt.Paint paint18 = xYPlot11.getDomainZeroBaselinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = xYPlot11.getLegendItems();
        xYPlot0.setFixedLegendItems(legendItemCollection19);
        boolean boolean21 = xYPlot0.canSelectByPoint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        boolean boolean11 = xYPlot0.isRangeZoomable();
        java.awt.Stroke stroke12 = xYPlot0.getRangeMinorGridlineStroke();
        java.awt.geom.Point2D point2D13 = xYPlot0.getQuadrantOrigin();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(point2D13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.RenderingSource renderingSource10 = null;
        xYPlot0.select(generalPath8, rectangle2D9, renderingSource10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot0.drawBackgroundImage(graphics2D12, rectangle2D13);
        xYPlot0.setDomainCrosshairVisible(false);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        org.jfree.chart.plot.CrosshairState crosshairState21 = null;
        boolean boolean22 = xYPlot0.render(graphics2D17, rectangle2D18, (int) (short) 100, plotRenderingInfo20, crosshairState21);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        xYPlot0.datasetChanged(datasetChangeEvent23);
        boolean boolean25 = xYPlot0.isRangeCrosshairVisible();
        double double26 = xYPlot0.getDomainCrosshairValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot0.getDataRange(valueAxis11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        xYPlot13.setRenderer((int) (short) 1, xYItemRenderer16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot13.getDomainAxisLocation();
        xYPlot0.setDomainAxisLocation(axisLocation19, true);
        xYPlot0.setBackgroundImageAlignment((int) '4');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        xYPlot0.notifyListeners(plotChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        int int27 = xYPlot0.getDomainAxisIndex(valueAxis26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        xYPlot0.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot0.setFixedRangeAxisSpace(axisSpace13, false);
        xYPlot0.clearRangeMarkers(2);
        java.awt.geom.GeneralPath generalPath18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.RenderingSource renderingSource20 = null;
        xYPlot0.select(generalPath18, rectangle2D19, renderingSource20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot0.calculateRangeAxisSpace(graphics2D10, rectangle2D11, axisSpace12);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot0.setDomainAxis((int) (short) 100, valueAxis15);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        int int18 = xYPlot17.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        xYPlot17.setRenderer((int) (short) 1, xYItemRenderer20, false);
        xYPlot17.setRangePannable(false);
        int int25 = xYPlot17.getBackgroundImageAlignment();
        boolean boolean26 = xYPlot17.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        xYPlot17.markerChanged(markerChangeEvent27);
        java.awt.Paint paint29 = xYPlot17.getRangeTickBandPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = xYPlot17.getRenderer((int) (byte) 10);
        xYPlot17.setDomainCrosshairValue((double) (byte) 1);
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        int int35 = xYPlot34.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        xYPlot34.setRenderer((int) (short) 1, xYItemRenderer37, false);
        org.jfree.chart.axis.AxisLocation axisLocation40 = xYPlot34.getDomainAxisLocation();
        boolean boolean41 = xYPlot34.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.RenderingSource renderingSource44 = null;
        xYPlot34.select(generalPath42, rectangle2D43, renderingSource44);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        xYPlot34.drawBackgroundImage(graphics2D46, rectangle2D47);
        java.awt.Stroke stroke49 = xYPlot34.getRangeCrosshairStroke();
        java.awt.Paint paint50 = xYPlot34.getDomainCrosshairPaint();
        java.awt.Paint paint51 = xYPlot34.getDomainMinorGridlinePaint();
        xYPlot17.setRangeCrosshairPaint(paint51);
        xYPlot0.setOutlinePaint(paint51);
        org.jfree.chart.util.RectangleEdge rectangleEdge55 = xYPlot0.getDomainAxisEdge(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(xYItemRenderer31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(rectangleEdge55);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        int int8 = xYPlot0.getWeight();
        xYPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace10 = xYPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        int int12 = xYPlot11.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        xYPlot11.setRenderer((int) (short) 1, xYItemRenderer14, false);
        xYPlot11.setRangePannable(false);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        org.jfree.chart.plot.CrosshairState crosshairState23 = null;
        boolean boolean24 = xYPlot11.render(graphics2D19, rectangle2D20, (int) 'a', plotRenderingInfo22, crosshairState23);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        int int28 = xYPlot25.getRangeAxisIndex(valueAxis27);
        xYPlot25.setRangeCrosshairLockedOnData(false);
        java.awt.Stroke stroke31 = xYPlot25.getRangeMinorGridlineStroke();
        xYPlot11.setDomainZeroBaselineStroke(stroke31);
        xYPlot0.setDomainGridlineStroke(stroke31);
        org.jfree.chart.plot.Marker marker34 = null;
        org.jfree.chart.util.Layer layer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker34, layer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        org.jfree.chart.plot.CrosshairState crosshairState14 = null;
        boolean boolean15 = xYPlot9.render(graphics2D10, rectangle2D11, 10, plotRenderingInfo13, crosshairState14);
        java.awt.Stroke stroke16 = xYPlot9.getRangeGridlineStroke();
        xYPlot0.setOutlineStroke(stroke16);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean22 = xYPlot0.removeDomainMarker((int) '#', marker19, layer20, false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        xYPlot0.setRenderer(xYItemRenderer23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        xYPlot0.setRangeMinorGridlinesVisible(false);
        boolean boolean7 = xYPlot0.isDomainGridlinesVisible();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.util.List list10 = null;
        xYPlot0.drawRangeGridlines(graphics2D8, rectangle2D9, list10);
        xYPlot0.setDomainCrosshairValue((double) (byte) 0);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot0.drawQuadrants(graphics2D14, rectangle2D15);
        java.util.List list17 = xYPlot0.getAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot0.getRangeAxis((int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot22.zoomRangeAxes((double) '#', plotRenderingInfo24, point2D25);
        int int27 = xYPlot22.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray28 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot22.setRenderers(xYItemRendererArray28);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot22.setOutlineStroke(stroke30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = xYPlot22.getAxisOffset();
        java.awt.geom.Point2D point2D33 = xYPlot22.getQuadrantOrigin();
        xYPlot0.zoomRangeAxes((double) (byte) 1, plotRenderingInfo21, point2D33);
        int int35 = xYPlot0.getRendererCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray28);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray28, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(point2D33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.RenderingSource renderingSource12 = null;
        xYPlot0.select((double) 1.0f, (double) (byte) -1, rectangle2D11, renderingSource12);
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        xYPlot0.drawAnnotations(graphics2D15, rectangle2D16, plotRenderingInfo17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        int int3 = xYPlot0.getRangeAxisIndex(valueAxis2);
        xYPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = xYPlot6.getDatasetRenderingOrder();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = null;
        int int9 = xYPlot6.getIndexOf(xYItemRenderer8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot6.zoomRangeAxes((double) 15, plotRenderingInfo11, point2D12);
        java.awt.Stroke stroke14 = xYPlot6.getDomainMinorGridlineStroke();
        xYPlot0.setRangeGridlineStroke(stroke14);
        java.awt.geom.GeneralPath generalPath16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.RenderingSource renderingSource18 = null;
        xYPlot0.select(generalPath16, rectangle2D17, renderingSource18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        xYPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 10);
        boolean boolean14 = xYPlot0.isDomainZoomable();
        xYPlot0.setRangeZeroBaselineVisible(true);
        java.awt.Stroke stroke17 = xYPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        xYPlot18.zoomRangeAxes((double) '#', plotRenderingInfo20, point2D21);
        int int23 = xYPlot18.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray24 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot18.setRenderers(xYItemRendererArray24);
        boolean boolean26 = xYPlot18.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder27 = xYPlot18.getSeriesRenderingOrder();
        xYPlot0.setSeriesRenderingOrder(seriesRenderingOrder27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = xYPlot0.getInsets();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray24);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray24, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(seriesRenderingOrder27);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot0.panDomainAxes((double) (byte) 1, plotRenderingInfo8, point2D9);
        xYPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot0.getRangeMarkers((int) '4', layer14);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        int int17 = xYPlot0.getIndexOf(xYItemRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot0.getDomainAxisForDataset((int) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot0.getDomainAxis((int) (byte) 1);
        boolean boolean22 = xYPlot0.isOutlineVisible();
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) 'a', marker24, layer25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        boolean boolean10 = xYPlot0.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        xYPlot0.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot0.setFixedRangeAxisSpace(axisSpace13, false);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        int int17 = xYPlot16.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        xYPlot16.notifyListeners(plotChangeEvent18);
        int int20 = xYPlot16.getDatasetCount();
        xYPlot16.clearDomainMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot16.getDomainAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        int int24 = xYPlot23.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        xYPlot23.setRenderer((int) (short) 1, xYItemRenderer26, false);
        boolean boolean29 = xYPlot23.isDomainGridlinesVisible();
        java.awt.Stroke stroke30 = xYPlot23.getRangeGridlineStroke();
        xYPlot16.setRangeZeroBaselineStroke(stroke30);
        xYPlot0.setRangeMinorGridlineStroke(stroke30);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        xYPlot0.setRenderer((int) (byte) 100, xYItemRenderer34, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        java.awt.Stroke stroke7 = xYPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.AxisSpace axisSpace8 = xYPlot0.getFixedDomainAxisSpace();
        boolean boolean9 = xYPlot0.isRangeZoomable();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        xYPlot0.drawAnnotations(graphics2D10, rectangle2D11, plotRenderingInfo12);
        java.awt.Paint paint14 = xYPlot0.getDomainTickBandPaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        xYPlot0.clearDomainAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = xYPlot0.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = xYPlot0.getRangeAxisIndex(valueAxis8);
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        int int11 = xYPlot10.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        xYPlot10.notifyListeners(plotChangeEvent12);
        int int14 = xYPlot10.getDatasetCount();
        xYPlot10.setDomainCrosshairValue(0.0d);
        java.awt.Stroke stroke17 = xYPlot10.getRangeCrosshairStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke17);
        boolean boolean19 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.Plot plot20 = xYPlot0.getParent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot0.setRenderer(xYItemRenderer12);
        java.awt.Paint paint14 = xYPlot0.getRangeTickBandPaint();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        xYPlot0.drawQuadrants(graphics2D15, rectangle2D16);
        double double18 = xYPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot0.setOutlineStroke(stroke8);
        double double10 = xYPlot0.getDomainCrosshairValue();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setDomainMinorGridlineStroke(stroke11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot0.drawQuadrants(graphics2D13, rectangle2D14);
        xYPlot0.setDomainMinorGridlinesVisible(false);
        double double18 = xYPlot0.getDomainCrosshairValue();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot0.drawQuadrants(graphics2D19, rectangle2D20);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setRenderer((int) (short) -1, xYItemRenderer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        xYPlot0.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = xYPlot0.getDomainAxisIndex(valueAxis11);
        xYPlot0.setRangeZeroBaselineVisible(true);
        boolean boolean15 = xYPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint16 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj20 = xYPlot19.clone();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot19.setRangeMinorGridlinePaint(paint21);
        float float23 = xYPlot19.getBackgroundAlpha();
        xYPlot19.clearRangeMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        int int26 = xYPlot19.getRangeAxisIndex(valueAxis25);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot27.zoomRangeAxes((double) '#', plotRenderingInfo29, point2D30);
        int int32 = xYPlot27.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray33 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot27.setRenderers(xYItemRendererArray33);
        java.awt.Stroke stroke35 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot27.setOutlineStroke(stroke35);
        boolean boolean37 = xYPlot27.isDomainZeroBaselineVisible();
        java.awt.Paint paint38 = xYPlot27.getRangeMinorGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        int int40 = xYPlot39.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        xYPlot39.setRenderer((int) (short) 1, xYItemRenderer42, false);
        org.jfree.chart.axis.AxisLocation axisLocation45 = xYPlot39.getDomainAxisLocation();
        boolean boolean46 = xYPlot39.isRangeMinorGridlinesVisible();
        boolean boolean47 = xYPlot39.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        java.util.List list50 = null;
        xYPlot39.drawRangeTickBands(graphics2D48, rectangle2D49, list50);
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        java.awt.geom.Point2D point2D55 = null;
        xYPlot52.zoomRangeAxes((double) '#', plotRenderingInfo54, point2D55);
        int int57 = xYPlot52.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray58 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot52.setRenderers(xYItemRendererArray58);
        java.awt.Stroke stroke60 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot52.setOutlineStroke(stroke60);
        double double62 = xYPlot52.getDomainCrosshairValue();
        boolean boolean63 = xYPlot52.isRangeCrosshairVisible();
        java.awt.Paint paint64 = xYPlot52.getBackgroundPaint();
        xYPlot39.setOutlinePaint(paint64);
        xYPlot27.setRangeCrosshairPaint(paint64);
        xYPlot19.setDomainCrosshairPaint(paint64);
        xYPlot0.setDomainCrosshairPaint(paint64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray33);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray33, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(axisLocation45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 15 + "'", int57 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray58);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray58, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(paint64);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot0.markerChanged(markerChangeEvent10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot0.setRenderer(xYItemRenderer12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot0.getAxisOffset();
        java.awt.Paint paint15 = xYPlot0.getDomainTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot0.getRangeAxis((int) '4');
        boolean boolean18 = xYPlot0.isRangeZoomable();
        xYPlot0.setDomainGridlinesVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup21 = xYPlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(datasetGroup21);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.XYPlot xYPlot2 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj3 = xYPlot2.clone();
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot2.setRangeMinorGridlinePaint(paint4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        xYPlot2.axisChanged(axisChangeEvent6);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        xYPlot8.zoomRangeAxes((double) '#', plotRenderingInfo10, point2D11);
        int int13 = xYPlot8.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray14 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot8.setRenderers(xYItemRendererArray14);
        java.awt.Stroke stroke16 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot8.setOutlineStroke(stroke16);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot8.setDomainAxes(valueAxisArray18);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = xYPlot8.getRenderer((int) (short) 0);
        java.awt.Stroke stroke22 = xYPlot8.getDomainGridlineStroke();
        org.jfree.chart.plot.Plot plot23 = xYPlot8.getRootPlot();
        boolean boolean24 = xYPlot2.equals((java.lang.Object) plot23);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot25.getDomainAxisLocation();
        boolean boolean32 = xYPlot25.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        org.jfree.chart.plot.CrosshairState crosshairState38 = null;
        boolean boolean39 = xYPlot33.render(graphics2D34, rectangle2D35, 10, plotRenderingInfo37, crosshairState38);
        int int40 = xYPlot33.getDomainAxisCount();
        java.lang.String str41 = xYPlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        xYPlot33.markerChanged(markerChangeEvent42);
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot33.setRangeTickBandPaint(paint44);
        xYPlot25.setDomainCrosshairPaint(paint44);
        java.awt.Paint paint47 = xYPlot25.getRangeGridlinePaint();
        xYPlot2.setRangeZeroBaselinePaint(paint47);
        xYPlot0.setDomainZeroBaselinePaint(paint47);
        java.awt.Image image50 = null;
        xYPlot0.setBackgroundImage(image50);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer52 = xYPlot0.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(legendItemCollection1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray14);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray14, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertArrayEquals(valueAxisArray18, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(xYItemRenderer52);
        org.junit.Assert.assertNull(valueAxis53);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
        double double9 = xYPlot0.getDomainCrosshairValue();
        xYPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot12.zoomRangeAxes((double) '#', plotRenderingInfo14, point2D15);
        int int17 = xYPlot12.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray18 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot12.setRenderers(xYItemRendererArray18);
        java.awt.Stroke stroke20 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot12.setOutlineStroke(stroke20);
        double double22 = xYPlot12.getDomainCrosshairValue();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot12.setDomainMinorGridlineStroke(stroke23);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot25.zoomRangeAxes((double) '#', plotRenderingInfo27, point2D28);
        xYPlot12.setParent((org.jfree.chart.plot.Plot) xYPlot25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot25.zoomDomainAxes((double) 10L, (double) 10.0f, plotRenderingInfo33, point2D34);
        xYPlot25.configureRangeAxes();
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        xYPlot37.zoomRangeAxes((double) '#', plotRenderingInfo39, point2D40);
        int int42 = xYPlot37.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker43 = null;
        org.jfree.chart.util.Layer layer44 = null;
        boolean boolean45 = xYPlot37.removeDomainMarker(marker43, layer44);
        xYPlot37.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        int int49 = xYPlot37.getDomainAxisIndex(valueAxis48);
        xYPlot37.setRangeZeroBaselineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation52 = xYPlot37.getDomainAxisLocation();
        java.awt.Stroke stroke53 = xYPlot37.getDomainZeroBaselineStroke();
        xYPlot25.setRangeCrosshairStroke(stroke53);
        xYPlot0.setRangeGridlineStroke(stroke53);
        xYPlot0.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection58 = xYPlot0.getFixedLegendItems();
        java.awt.Graphics2D graphics2D59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D59, rectangle2D60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray18);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray18, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(axisLocation52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNull(legendItemCollection58);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo14, point2D15, true);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray18 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray18);
        xYPlot0.clearAnnotations();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        org.jfree.chart.plot.CrosshairState crosshairState26 = null;
        boolean boolean27 = xYPlot21.render(graphics2D22, rectangle2D23, 10, plotRenderingInfo25, crosshairState26);
        int int28 = xYPlot21.getDomainAxisCount();
        java.lang.String str29 = xYPlot21.getNoDataMessage();
        xYPlot21.setRangeCrosshairValue(0.0d, true);
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        int int34 = xYPlot21.indexOf(xYDataset33);
        java.awt.Stroke stroke35 = xYPlot21.getOutlineStroke();
        xYPlot0.setDomainGridlineStroke(stroke35);
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        xYPlot37.zoomRangeAxes((double) '#', plotRenderingInfo39, point2D40);
        int int42 = xYPlot37.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray43 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot37.setRenderers(xYItemRendererArray43);
        java.awt.Stroke stroke45 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot37.setOutlineStroke(stroke45);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray47 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot37.setDomainAxes(valueAxisArray47);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = xYPlot37.getRenderer((int) (short) 0);
        xYPlot37.setDomainMinorGridlinesVisible(true);
        xYPlot37.setWeight(0);
        boolean boolean55 = xYPlot37.isDomainZeroBaselineVisible();
        java.awt.Font font56 = xYPlot37.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font56);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(xYItemRendererArray18);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray18, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray43);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray43, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(valueAxisArray47);
        org.junit.Assert.assertArrayEquals(valueAxisArray47, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNull(xYItemRenderer50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(font56);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        xYPlot0.setRangePannable(false);
        int int8 = xYPlot0.getBackgroundImageAlignment();
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        int int11 = xYPlot10.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        int int13 = xYPlot10.getRangeAxisIndex(valueAxis12);
        xYPlot10.setRangeCrosshairLockedOnData(false);
        java.awt.Stroke stroke16 = xYPlot10.getRangeMinorGridlineStroke();
        xYPlot0.setRangeMinorGridlineStroke(stroke16);
        xYPlot0.setRangeCrosshairValue((double) '4', true);
        boolean boolean21 = xYPlot0.isOutlineVisible();
        xYPlot0.clearSelection();
        xYPlot0.setDomainMinorGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.util.Layer layer2 = null;
        java.util.Collection collection3 = xYPlot0.getDomainMarkers((int) (short) 100, layer2);
        boolean boolean4 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xYPlot0.removeRangeMarker(15, marker6, layer7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map13 = xYPlot0.drawAxes(graphics2D9, rectangle2D10, rectangle2D11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        xYPlot10.zoomRangeAxes((double) '#', plotRenderingInfo12, point2D13);
        int int15 = xYPlot10.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray16 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot10.setRenderers(xYItemRendererArray16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot10.setOutlineStroke(stroke18);
        boolean boolean20 = xYPlot10.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = xYPlot10.getRangeAxisIndex(valueAxis21);
        java.awt.Stroke stroke23 = xYPlot10.getRangeCrosshairStroke();
        xYPlot0.setRangeMinorGridlineStroke(stroke23);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot25.zoomRangeAxes((double) '#', plotRenderingInfo27, point2D28);
        xYPlot25.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        boolean boolean35 = xYPlot25.removeDomainMarker((int) (byte) 1, marker33, layer34);
        org.jfree.chart.axis.AxisLocation axisLocation37 = xYPlot25.getDomainAxisLocation((int) (byte) 100);
        java.awt.Stroke stroke38 = xYPlot25.getRangeGridlineStroke();
        java.awt.Paint paint39 = xYPlot25.getDomainMinorGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = xYPlot25.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets40, false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray16);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray16, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray7 = new org.jfree.chart.renderer.xy.XYItemRenderer[] { xYItemRenderer6 };
        xYPlot0.setRenderers(xYItemRendererArray7);
        java.awt.Paint paint9 = xYPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(datasetRenderingOrder1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYItemRendererArray7);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray7, new org.jfree.chart.renderer.xy.XYItemRenderer[] { null });
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        org.jfree.chart.plot.CrosshairState crosshairState5 = null;
        boolean boolean6 = xYPlot0.render(graphics2D1, rectangle2D2, 10, plotRenderingInfo4, crosshairState5);
        int int7 = xYPlot0.getDomainAxisCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        xYPlot0.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint11);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot0.getRangeAxisEdge();
        xYPlot0.setDomainCrosshairValue((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        boolean boolean8 = xYPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot0.getRenderer();
        int int10 = xYPlot0.getRendererCount();
        xYPlot0.setForegroundAlpha((float) '4');
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        int int14 = xYPlot0.indexOf(xYDataset13);
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = xYPlot0.getOrientation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYItemRenderer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(plotOrientation15);
    }
}

