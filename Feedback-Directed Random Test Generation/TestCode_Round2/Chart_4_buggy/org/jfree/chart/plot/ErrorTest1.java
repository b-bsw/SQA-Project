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
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        float float4 = xYPlot0.getBackgroundAlpha();
        xYPlot0.clearRangeMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot0.getRangeAxisIndex(valueAxis6);
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        xYPlot0.setDataset((int) ' ', xYDataset9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        int int18 = xYPlot13.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray19 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot13.setRenderers(xYItemRendererArray19);
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot13.setOutlineStroke(stroke21);
        boolean boolean23 = xYPlot13.isDomainZeroBaselineVisible();
        xYPlot13.configureDomainAxes();
        boolean boolean25 = xYPlot13.isDomainCrosshairLockedOnData();
        float float26 = xYPlot13.getBackgroundAlpha();
        java.awt.Image image27 = null;
        xYPlot13.setBackgroundImage(image27);
        xYPlot13.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        int int35 = xYPlot34.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        xYPlot34.setRenderer((int) (short) 1, xYItemRenderer37, false);
        xYPlot34.setRangePannable(false);
        int int42 = xYPlot34.getBackgroundImageAlignment();
        boolean boolean43 = xYPlot34.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        xYPlot34.markerChanged(markerChangeEvent44);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        xYPlot49.zoomRangeAxes((double) '#', plotRenderingInfo51, point2D52);
        int int54 = xYPlot49.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray55 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot49.setRenderers(xYItemRendererArray55);
        java.awt.Stroke stroke57 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot49.setOutlineStroke(stroke57);
        boolean boolean59 = xYPlot49.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        int int61 = xYPlot49.getRangeAxisIndex(valueAxis60);
        java.awt.Stroke stroke62 = xYPlot49.getRangeMinorGridlineStroke();
        boolean boolean63 = xYPlot49.isRangeCrosshairVisible();
        org.jfree.chart.plot.Plot plot64 = xYPlot49.getRootPlot();
        java.awt.geom.Point2D point2D65 = xYPlot49.getQuadrantOrigin();
        xYPlot34.zoomRangeAxes((double) 15, (double) (short) 10, plotRenderingInfo48, point2D65);
        xYPlot13.zoomRangeAxes(0.0d, (double) 0, plotRenderingInfo33, point2D65);
        xYPlot0.panRangeAxes((double) 1, plotRenderingInfo12, point2D65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and xYPlot34", obj1.equals(xYPlot34) ? obj1.hashCode() == xYPlot34.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getDomainMinorGridlinePaint();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj5 = xYPlot4.clone();
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot4.setRangeMinorGridlinePaint(paint6);
        xYPlot4.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setForegroundAlpha((float) (-1L));
        java.util.List list14 = xYPlot4.getAnnotations();
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and obj5", xYPlot0.equals(obj5) ? xYPlot0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot0.setRangeMinorGridlineStroke(stroke24);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        org.jfree.chart.plot.CrosshairState crosshairState31 = null;
        boolean boolean32 = xYPlot26.render(graphics2D27, rectangle2D28, 10, plotRenderingInfo30, crosshairState31);
        int int33 = xYPlot26.getDomainAxisCount();
        java.lang.String str34 = xYPlot26.getNoDataMessage();
        xYPlot26.setRangeCrosshairValue(0.0d, true);
        boolean boolean38 = xYPlot26.isDomainMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        xYPlot39.zoomRangeAxes((double) '#', plotRenderingInfo41, point2D42);
        int int44 = xYPlot39.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray45 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot39.setRenderers(xYItemRendererArray45);
        java.awt.Stroke stroke47 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot39.setOutlineStroke(stroke47);
        double double49 = xYPlot39.getDomainCrosshairValue();
        java.awt.Stroke stroke50 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot39.setDomainMinorGridlineStroke(stroke50);
        xYPlot26.setDomainZeroBaselineStroke(stroke50);
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        org.jfree.chart.plot.CrosshairState crosshairState58 = null;
        boolean boolean59 = xYPlot53.render(graphics2D54, rectangle2D55, 10, plotRenderingInfo57, crosshairState58);
        int int60 = xYPlot53.getDomainAxisCount();
        java.lang.String str61 = xYPlot53.getNoDataMessage();
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.RenderingSource renderingSource65 = null;
        xYPlot53.select((double) 1.0f, (double) (byte) -1, rectangle2D64, renderingSource65);
        boolean boolean67 = xYPlot53.isRangeCrosshairVisible();
        java.awt.Paint paint68 = xYPlot53.getRangeMinorGridlinePaint();
        xYPlot26.setRangeZeroBaselinePaint(paint68);
        xYPlot0.setDomainGridlinePaint(paint68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot13 and xYPlot53", xYPlot13.equals(xYPlot53) ? xYPlot13.hashCode() == xYPlot53.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        boolean boolean24 = xYPlot0.isDomainCrosshairLockedOnData();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        xYPlot25.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        int int30 = xYPlot29.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        xYPlot29.setRenderer((int) (short) 1, xYItemRenderer32, false);
        xYPlot29.setRangePannable(false);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot29.setOutlinePaint(paint37);
        xYPlot25.setDomainMinorGridlinePaint(paint37);
        java.awt.Paint paint40 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot25.setDomainZeroBaselinePaint(paint40);
        boolean boolean42 = xYPlot25.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection43 = xYPlot25.getLegendItems();
        xYPlot0.setFixedLegendItems(legendItemCollection43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot13 and xYPlot29", xYPlot13.equals(xYPlot29) ? xYPlot13.hashCode() == xYPlot29.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        xYPlot0.setRangeAxis((int) (byte) 100, valueAxis18, false);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        int int22 = xYPlot0.indexOf(xYDataset21);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        int int24 = xYPlot23.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        xYPlot23.setRenderer((int) (short) 1, xYItemRenderer26, false);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot23.getDomainAxisLocation();
        boolean boolean30 = xYPlot23.isRangeMinorGridlinesVisible();
        int int31 = xYPlot23.getWeight();
        xYPlot23.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace33 = xYPlot23.getFixedRangeAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        int int35 = xYPlot34.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        xYPlot34.setRenderer((int) (short) 1, xYItemRenderer37, false);
        xYPlot34.setRangePannable(false);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        org.jfree.chart.plot.CrosshairState crosshairState46 = null;
        boolean boolean47 = xYPlot34.render(graphics2D42, rectangle2D43, (int) 'a', plotRenderingInfo45, crosshairState46);
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot();
        int int49 = xYPlot48.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        int int51 = xYPlot48.getRangeAxisIndex(valueAxis50);
        xYPlot48.setRangeCrosshairLockedOnData(false);
        java.awt.Stroke stroke54 = xYPlot48.getRangeMinorGridlineStroke();
        xYPlot34.setDomainZeroBaselineStroke(stroke54);
        xYPlot23.setDomainGridlineStroke(stroke54);
        xYPlot0.setRangeGridlineStroke(stroke54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot23", xYPlot0.equals(xYPlot23) ? xYPlot0.hashCode() == xYPlot23.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        boolean boolean9 = xYPlot0.isRangeMinorGridlinesVisible();
        java.awt.Stroke stroke10 = xYPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        org.jfree.chart.plot.CrosshairState crosshairState16 = null;
        boolean boolean17 = xYPlot11.render(graphics2D12, rectangle2D13, 10, plotRenderingInfo15, crosshairState16);
        int int18 = xYPlot11.getDomainAxisCount();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.util.List list21 = null;
        xYPlot11.drawDomainTickBands(graphics2D19, rectangle2D20, list21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot11.zoomDomainAxes(1.0d, plotRenderingInfo24, point2D25, true);
        boolean boolean28 = xYPlot11.isDomainCrosshairVisible();
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        int int30 = xYPlot29.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        xYPlot29.setRenderer((int) (short) 1, xYItemRenderer32, false);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot29.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation37 = xYPlot29.getRangeAxisLocation(1);
        org.jfree.chart.util.Layer layer39 = null;
        java.util.Collection collection40 = xYPlot29.getRangeMarkers((int) ' ', layer39);
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        org.jfree.chart.plot.CrosshairState crosshairState46 = null;
        boolean boolean47 = xYPlot41.render(graphics2D42, rectangle2D43, 10, plotRenderingInfo45, crosshairState46);
        int int48 = xYPlot41.getDomainAxisCount();
        boolean boolean49 = xYPlot41.isRangeZeroBaselineVisible();
        java.awt.Paint paint50 = xYPlot41.getBackgroundPaint();
        xYPlot29.setDomainGridlinePaint(paint50);
        xYPlot29.setNotify(true);
        java.awt.Paint paint54 = xYPlot29.getRangeCrosshairPaint();
        xYPlot11.setOutlinePaint(paint54);
        xYPlot0.setRangeCrosshairPaint(paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot41", xYPlot0.equals(xYPlot41) ? xYPlot0.hashCode() == xYPlot41.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = xYPlot13.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier15, false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D18, rectangle2D19);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        int int22 = xYPlot21.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        xYPlot21.setRenderer((int) (short) 1, xYItemRenderer24, false);
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot21.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot21.getRangeAxisLocation(1);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder30 = xYPlot21.getSeriesRenderingOrder();
        xYPlot0.setSeriesRenderingOrder(seriesRenderingOrder30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot13 and xYPlot21", xYPlot13.equals(xYPlot21) ? xYPlot13.hashCode() == xYPlot21.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        java.awt.Paint paint18 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = xYPlot19.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot19.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot19.getIndexOf(xYItemRenderer23);
        java.awt.Paint paint25 = xYPlot19.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = xYPlot19.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot19", xYPlot0.equals(xYPlot19) ? xYPlot0.hashCode() == xYPlot19.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        org.jfree.chart.axis.AxisSpace axisSpace18 = xYPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot19.zoomRangeAxes((double) '#', plotRenderingInfo21, point2D22);
        xYPlot19.setRangeCrosshairValue(0.0d);
        xYPlot19.clearDomainAxes();
        xYPlot19.setDomainCrosshairLockedOnData(true);
        xYPlot19.clearSelection();
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        xYPlot30.zoomRangeAxes((double) '#', plotRenderingInfo32, point2D33);
        int int35 = xYPlot30.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray36 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot30.setRenderers(xYItemRendererArray36);
        java.awt.Stroke stroke38 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot30.setOutlineStroke(stroke38);
        boolean boolean40 = xYPlot30.isDomainZeroBaselineVisible();
        xYPlot30.configureDomainAxes();
        java.awt.Stroke stroke42 = xYPlot30.getOutlineStroke();
        xYPlot19.setRangeCrosshairStroke(stroke42);
        xYPlot0.setDomainMinorGridlineStroke(stroke42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot30", xYPlot0.equals(xYPlot30) ? xYPlot0.hashCode() == xYPlot30.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        xYPlot15.zoomRangeAxes((double) '#', plotRenderingInfo17, point2D18);
        xYPlot15.setRangeMinorGridlinesVisible(false);
        boolean boolean22 = xYPlot15.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = xYPlot15.getInsets();
        xYPlot0.setInsets(rectangleInsets23, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot15", xYPlot0.equals(xYPlot15) ? xYPlot0.hashCode() == xYPlot15.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot6.zoomRangeAxes((double) '#', plotRenderingInfo8, point2D9);
        int int11 = xYPlot6.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray12 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot6.setRenderers(xYItemRendererArray12);
        java.awt.Stroke stroke14 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot6.setOutlineStroke(stroke14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        org.jfree.chart.axis.AxisSpace axisSpace19 = xYPlot6.calculateRangeAxisSpace(graphics2D16, rectangle2D17, axisSpace18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = xYPlot0.calculateDomainAxisSpace(graphics2D4, rectangle2D5, axisSpace19);
        xYPlot0.setDomainPannable(false);
        org.jfree.chart.axis.AxisSpace axisSpace23 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        int int25 = xYPlot24.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        xYPlot24.setRenderer((int) (short) 1, xYItemRenderer27, false);
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot24.getDomainAxisLocation();
        boolean boolean31 = xYPlot24.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        org.jfree.chart.plot.CrosshairState crosshairState37 = null;
        boolean boolean38 = xYPlot32.render(graphics2D33, rectangle2D34, 10, plotRenderingInfo36, crosshairState37);
        int int39 = xYPlot32.getDomainAxisCount();
        java.lang.String str40 = xYPlot32.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        xYPlot32.markerChanged(markerChangeEvent41);
        java.awt.Paint paint43 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot32.setRangeTickBandPaint(paint43);
        xYPlot24.setDomainCrosshairPaint(paint43);
        boolean boolean46 = xYPlot24.isSubplot();
        java.awt.Paint paint47 = xYPlot24.getDomainCrosshairPaint();
        org.jfree.chart.plot.Marker marker48 = null;
        boolean boolean49 = xYPlot24.removeDomainMarker(marker48);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder50 = xYPlot24.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot24.getDomainAxisLocation();
        java.awt.Stroke stroke52 = xYPlot24.getDomainGridlineStroke();
        xYPlot0.setOutlineStroke(stroke52);
        org.jfree.chart.plot.XYPlot xYPlot54 = new org.jfree.chart.plot.XYPlot();
        int int55 = xYPlot54.getDomainAxisCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent56 = null;
        xYPlot54.notifyListeners(plotChangeEvent56);
        int int58 = xYPlot54.getDatasetCount();
        boolean boolean59 = xYPlot54.isDomainMinorGridlinesVisible();
        double double60 = xYPlot54.getDomainCrosshairValue();
        java.awt.Stroke stroke61 = xYPlot54.getRangeMinorGridlineStroke();
        xYPlot0.setRangeCrosshairStroke(stroke61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and xYPlot54", obj1.equals(xYPlot54) ? obj1.hashCode() == xYPlot54.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        int int5 = xYPlot0.getRangeAxisIndex(valueAxis4);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        org.jfree.chart.plot.CrosshairState crosshairState11 = null;
        boolean boolean12 = xYPlot6.render(graphics2D7, rectangle2D8, 10, plotRenderingInfo10, crosshairState11);
        int int13 = xYPlot6.getDomainAxisCount();
        java.awt.Paint paint14 = xYPlot6.getRangeCrosshairPaint();
        xYPlot6.setDomainCrosshairValue((double) 100L, false);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj19 = xYPlot18.clone();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot18.setRangeMinorGridlinePaint(paint20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        xYPlot24.zoomRangeAxes((double) '#', plotRenderingInfo26, point2D27);
        int int29 = xYPlot24.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray30 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot24.setRenderers(xYItemRendererArray30);
        java.awt.Stroke stroke32 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot24.setOutlineStroke(stroke32);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        org.jfree.chart.axis.AxisSpace axisSpace37 = xYPlot24.calculateRangeAxisSpace(graphics2D34, rectangle2D35, axisSpace36);
        org.jfree.chart.axis.AxisSpace axisSpace38 = xYPlot18.calculateDomainAxisSpace(graphics2D22, rectangle2D23, axisSpace37);
        xYPlot6.setFixedDomainAxisSpace(axisSpace37, true);
        xYPlot0.setFixedDomainAxisSpace(axisSpace37, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot18", xYPlot0.equals(xYPlot18) ? xYPlot0.hashCode() == xYPlot18.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot27.zoomRangeAxes((double) '#', plotRenderingInfo29, point2D30);
        int int32 = xYPlot27.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray33 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot27.setRenderers(xYItemRendererArray33);
        java.awt.Stroke stroke35 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot27.setOutlineStroke(stroke35);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        org.jfree.chart.axis.AxisSpace axisSpace40 = xYPlot27.calculateRangeAxisSpace(graphics2D37, rectangle2D38, axisSpace39);
        org.jfree.chart.axis.AxisSpace axisSpace41 = xYPlot0.calculateDomainAxisSpace(graphics2D25, rectangle2D26, axisSpace40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot10 and xYPlot27", xYPlot10.equals(xYPlot27) ? xYPlot10.hashCode() == xYPlot27.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        int int11 = xYPlot10.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = xYPlot10.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier12, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot10", xYPlot0.equals(xYPlot10) ? xYPlot0.hashCode() == xYPlot10.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation(1);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Marker marker10 = null;
        boolean boolean11 = xYPlot0.removeDomainMarker(marker10);
        xYPlot0.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot0.getRangeAxis();
        xYPlot0.clearRangeMarkers((int) '4');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot19.zoomRangeAxes((double) '#', plotRenderingInfo21, point2D22);
        int int24 = xYPlot19.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray25 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot19.setRenderers(xYItemRendererArray25);
        java.awt.Stroke stroke27 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot19.setOutlineStroke(stroke27);
        boolean boolean29 = xYPlot19.isDomainZeroBaselineVisible();
        xYPlot19.configureDomainAxes();
        boolean boolean31 = xYPlot19.isDomainCrosshairLockedOnData();
        float float32 = xYPlot19.getBackgroundAlpha();
        java.awt.Image image33 = null;
        xYPlot19.setBackgroundImage(image33);
        xYPlot19.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        int int41 = xYPlot40.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = null;
        xYPlot40.setRenderer((int) (short) 1, xYItemRenderer43, false);
        xYPlot40.setRangePannable(false);
        int int48 = xYPlot40.getBackgroundImageAlignment();
        boolean boolean49 = xYPlot40.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        xYPlot40.markerChanged(markerChangeEvent50);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
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
        java.awt.Stroke stroke68 = xYPlot55.getRangeMinorGridlineStroke();
        boolean boolean69 = xYPlot55.isRangeCrosshairVisible();
        org.jfree.chart.plot.Plot plot70 = xYPlot55.getRootPlot();
        java.awt.geom.Point2D point2D71 = xYPlot55.getQuadrantOrigin();
        xYPlot40.zoomRangeAxes((double) 15, (double) (short) 10, plotRenderingInfo54, point2D71);
        xYPlot19.zoomRangeAxes(0.0d, (double) 0, plotRenderingInfo39, point2D71);
        xYPlot0.zoomDomainAxes((double) ' ', plotRenderingInfo18, point2D71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot40", xYPlot0.equals(xYPlot40) ? xYPlot0.hashCode() == xYPlot40.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = xYPlot0.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getDomainMarkers(15, layer5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        xYPlot0.removeChangeListener(plotChangeListener9);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot11.zoomRangeAxes((double) '#', plotRenderingInfo13, point2D14);
        xYPlot11.setRangeCrosshairValue(0.0d);
        xYPlot11.clearDomainAxes();
        xYPlot11.clearDomainMarkers();
        java.awt.Font font20 = xYPlot11.getNoDataMessageFont();
        xYPlot0.setNoDataMessageFont(font20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot11", xYPlot0.equals(xYPlot11) ? xYPlot0.hashCode() == xYPlot11.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot6.zoomRangeAxes((double) '#', plotRenderingInfo8, point2D9);
        int int11 = xYPlot6.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray12 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot6.setRenderers(xYItemRendererArray12);
        java.awt.Stroke stroke14 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot6.setOutlineStroke(stroke14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        org.jfree.chart.axis.AxisSpace axisSpace19 = xYPlot6.calculateRangeAxisSpace(graphics2D16, rectangle2D17, axisSpace18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = xYPlot0.calculateDomainAxisSpace(graphics2D4, rectangle2D5, axisSpace19);
        java.awt.Paint paint21 = xYPlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke22 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        xYPlot23.zoomRangeAxes((double) '#', plotRenderingInfo25, point2D26);
        int int28 = xYPlot23.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker29 = null;
        org.jfree.chart.util.Layer layer30 = null;
        boolean boolean31 = xYPlot23.removeDomainMarker(marker29, layer30);
        xYPlot23.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        int int35 = xYPlot23.getDomainAxisIndex(valueAxis34);
        xYPlot23.setRangeZeroBaselineVisible(true);
        boolean boolean38 = xYPlot23.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        java.util.List list41 = null;
        xYPlot23.drawRangeTickBands(graphics2D39, rectangle2D40, list41);
        xYPlot0.setParent((org.jfree.chart.plot.Plot) xYPlot23);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.util.Layer layer47 = null;
        xYPlot0.drawRangeMarkers(graphics2D44, rectangle2D45, 0, layer47);
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        xYPlot49.zoomRangeAxes((double) '#', plotRenderingInfo51, point2D52);
        int int54 = xYPlot49.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker55 = null;
        org.jfree.chart.util.Layer layer56 = null;
        boolean boolean57 = xYPlot49.removeDomainMarker(marker55, layer56);
        double double58 = xYPlot49.getDomainCrosshairValue();
        boolean boolean59 = xYPlot49.isNotify();
        java.awt.Stroke stroke60 = xYPlot49.getDomainMinorGridlineStroke();
        xYPlot0.setOutlineStroke(stroke60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and xYPlot49", obj1.equals(xYPlot49) ? obj1.hashCode() == xYPlot49.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        xYPlot0.clearSelection();
        java.awt.Paint paint14 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot16.zoomRangeAxes((double) '#', plotRenderingInfo18, point2D19);
        int int21 = xYPlot16.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray22 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot16.setRenderers(xYItemRendererArray22);
        java.awt.Stroke stroke24 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot16.setOutlineStroke(stroke24);
        boolean boolean26 = xYPlot16.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        xYPlot16.markerChanged(markerChangeEvent27);
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        int int30 = xYPlot29.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = xYPlot29.getDrawingSupplier();
        xYPlot16.setDrawingSupplier(drawingSupplier31, false);
        xYPlot0.setDrawingSupplier(drawingSupplier31, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot29", xYPlot0.equals(xYPlot29) ? xYPlot0.hashCode() == xYPlot29.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke6 = xYPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        int int10 = xYPlot9.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot9.setRenderer((int) (short) 1, xYItemRenderer12, false);
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot9.getDomainAxisLocation();
        boolean boolean16 = xYPlot9.isRangeMinorGridlinesVisible();
        int int17 = xYPlot9.getWeight();
        java.awt.Font font18 = xYPlot9.getNoDataMessageFont();
        xYPlot9.clearDomainMarkers(0);
        java.awt.Stroke stroke21 = xYPlot9.getRangeCrosshairStroke();
        int int22 = xYPlot9.getRendererCount();
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = xYPlot9.getRangeMarkers(1, layer24);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        xYPlot9.setRenderer(xYItemRenderer26);
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot28.zoomRangeAxes((double) '#', plotRenderingInfo30, point2D31);
        int int33 = xYPlot28.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker34 = null;
        org.jfree.chart.util.Layer layer35 = null;
        boolean boolean36 = xYPlot28.removeDomainMarker(marker34, layer35);
        xYPlot28.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        int int40 = xYPlot28.getDomainAxisIndex(valueAxis39);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        java.util.List list43 = null;
        xYPlot28.drawRangeGridlines(graphics2D41, rectangle2D42, list43);
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot();
        int int46 = xYPlot45.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        xYPlot45.setRenderer((int) (short) 1, xYItemRenderer48, false);
        xYPlot45.setRangePannable(false);
        int int53 = xYPlot45.getBackgroundImageAlignment();
        boolean boolean54 = xYPlot45.isDomainZeroBaselineVisible();
        java.awt.Paint paint55 = xYPlot45.getRangeZeroBaselinePaint();
        xYPlot28.setDomainGridlinePaint(paint55);
        xYPlot9.setRangeGridlinePaint(paint55);
        boolean boolean58 = xYPlot0.equals((java.lang.Object) xYPlot9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot45", xYPlot0.equals(xYPlot45) ? xYPlot0.hashCode() == xYPlot45.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        int int7 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.Plot plot8 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot0.getRangeAxisIndex(valueAxis9);
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
        xYPlot11.configureDomainAxes();
        boolean boolean23 = xYPlot11.isDomainCrosshairLockedOnData();
        float float24 = xYPlot11.getBackgroundAlpha();
        java.awt.Image image25 = null;
        xYPlot11.setBackgroundImage(image25);
        xYPlot11.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        int int33 = xYPlot32.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        xYPlot32.setRenderer((int) (short) 1, xYItemRenderer35, false);
        xYPlot32.setRangePannable(false);
        int int40 = xYPlot32.getBackgroundImageAlignment();
        boolean boolean41 = xYPlot32.isDomainZeroBaselineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        xYPlot32.markerChanged(markerChangeEvent42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        java.awt.geom.Point2D point2D50 = null;
        xYPlot47.zoomRangeAxes((double) '#', plotRenderingInfo49, point2D50);
        int int52 = xYPlot47.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray53 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot47.setRenderers(xYItemRendererArray53);
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot47.setOutlineStroke(stroke55);
        boolean boolean57 = xYPlot47.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        int int59 = xYPlot47.getRangeAxisIndex(valueAxis58);
        java.awt.Stroke stroke60 = xYPlot47.getRangeMinorGridlineStroke();
        boolean boolean61 = xYPlot47.isRangeCrosshairVisible();
        org.jfree.chart.plot.Plot plot62 = xYPlot47.getRootPlot();
        java.awt.geom.Point2D point2D63 = xYPlot47.getQuadrantOrigin();
        xYPlot32.zoomRangeAxes((double) 15, (double) (short) 10, plotRenderingInfo46, point2D63);
        xYPlot11.zoomRangeAxes(0.0d, (double) 0, plotRenderingInfo31, point2D63);
        java.awt.Paint paint66 = xYPlot11.getDomainMinorGridlinePaint();
        xYPlot0.setRangeMinorGridlinePaint(paint66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot32", xYPlot0.equals(xYPlot32) ? xYPlot0.hashCode() == xYPlot32.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot0.getDomainMarkers(layer29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        int int34 = xYPlot33.getDomainAxisCount();
        xYPlot33.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray38 = new org.jfree.chart.axis.ValueAxis[] { valueAxis37 };
        xYPlot33.setRangeAxes(valueAxisArray38);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = xYPlot33.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis41 = xYPlot33.getDomainAxis();
        java.util.List list42 = xYPlot33.getAnnotations();
        xYPlot0.drawDomainGridlines(graphics2D31, rectangle2D32, list42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot14 and xYPlot33", xYPlot14.equals(xYPlot33) ? xYPlot14.hashCode() == xYPlot33.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        org.jfree.chart.axis.ValueAxis valueAxis50 = xYPlot0.getDomainAxis(2);
        java.awt.Image image51 = xYPlot0.getBackgroundImage();
        xYPlot0.clearAnnotations();
        boolean boolean53 = xYPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.XYPlot xYPlot54 = new org.jfree.chart.plot.XYPlot();
        int int55 = xYPlot54.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = null;
        xYPlot54.setRenderer((int) (short) 1, xYItemRenderer57, false);
        org.jfree.chart.axis.AxisLocation axisLocation60 = xYPlot54.getDomainAxisLocation();
        boolean boolean61 = xYPlot54.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo66 = null;
        org.jfree.chart.plot.CrosshairState crosshairState67 = null;
        boolean boolean68 = xYPlot62.render(graphics2D63, rectangle2D64, 10, plotRenderingInfo66, crosshairState67);
        int int69 = xYPlot62.getDomainAxisCount();
        java.lang.String str70 = xYPlot62.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent71 = null;
        xYPlot62.markerChanged(markerChangeEvent71);
        java.awt.Paint paint73 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot62.setRangeTickBandPaint(paint73);
        xYPlot54.setDomainCrosshairPaint(paint73);
        java.awt.Paint paint76 = xYPlot54.getRangeGridlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent77 = null;
        xYPlot54.datasetChanged(datasetChangeEvent77);
        java.awt.Paint paint79 = xYPlot54.getRangeMinorGridlinePaint();
        xYPlot0.setRangeCrosshairPaint(paint79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot25 and xYPlot54", xYPlot25.equals(xYPlot54) ? xYPlot25.hashCode() == xYPlot54.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        xYPlot0.setRangeAxis((int) (short) 0, valueAxis23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot28.zoomRangeAxes((double) '#', plotRenderingInfo30, point2D31);
        int int33 = xYPlot28.getBackgroundImageAlignment();
        java.awt.geom.Point2D point2D34 = xYPlot28.getQuadrantOrigin();
        xYPlot0.zoomDomainAxes((double) '4', (double) 'a', plotRenderingInfo27, point2D34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot28", xYPlot0.equals(xYPlot28) ? xYPlot0.hashCode() == xYPlot28.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot0.getRangeAxisLocation((int) (short) 0);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = xYPlot0.getLegendItems();
        boolean boolean20 = xYPlot0.isDomainZoomable();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        xYPlot21.zoomRangeAxes((double) '#', plotRenderingInfo23, point2D24);
        int int26 = xYPlot21.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray27 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot21.setRenderers(xYItemRendererArray27);
        java.awt.Stroke stroke29 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot21.setOutlineStroke(stroke29);
        double double31 = xYPlot21.getDomainCrosshairValue();
        java.lang.String str32 = xYPlot21.getNoDataMessage();
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        xYPlot33.zoomRangeAxes((double) '#', plotRenderingInfo35, point2D36);
        int int38 = xYPlot33.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray39 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot33.setRenderers(xYItemRendererArray39);
        java.awt.Stroke stroke41 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot33.setOutlineStroke(stroke41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = xYPlot33.getAxisOffset();
        xYPlot21.setInsets(rectangleInsets43);
        xYPlot0.setInsets(rectangleInsets43);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder46 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        java.awt.geom.Point2D point2D50 = null;
        xYPlot47.zoomRangeAxes((double) '#', plotRenderingInfo49, point2D50);
        int int52 = xYPlot47.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray53 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot47.setRenderers(xYItemRendererArray53);
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot47.setOutlineStroke(stroke55);
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        xYPlot47.drawZeroDomainBaseline(graphics2D57, rectangle2D58);
        int int60 = xYPlot47.getWeight();
        java.awt.Graphics2D graphics2D61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        org.jfree.chart.util.Layer layer64 = null;
        xYPlot47.drawDomainMarkers(graphics2D61, rectangle2D62, 0, layer64);
        org.jfree.chart.plot.XYPlot xYPlot66 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo68 = null;
        java.awt.geom.Point2D point2D69 = null;
        xYPlot66.zoomRangeAxes((double) '#', plotRenderingInfo68, point2D69);
        int int71 = xYPlot66.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray72 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot66.setRenderers(xYItemRendererArray72);
        java.awt.Stroke stroke74 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot66.setOutlineStroke(stroke74);
        boolean boolean76 = xYPlot66.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis77 = null;
        int int78 = xYPlot66.getRangeAxisIndex(valueAxis77);
        java.awt.Paint paint79 = xYPlot66.getDomainGridlinePaint();
        xYPlot47.setDomainZeroBaselinePaint(paint79);
        xYPlot0.setBackgroundPaint(paint79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot33 and xYPlot66", xYPlot33.equals(xYPlot66) ? xYPlot33.hashCode() == xYPlot66.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        int int12 = xYPlot11.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        xYPlot11.setRenderer((int) (short) 1, xYItemRenderer14, false);
        xYPlot11.setRangePannable(false);
        int int19 = xYPlot11.getBackgroundImageAlignment();
        boolean boolean20 = xYPlot11.isDomainZeroBaselineVisible();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot11.setRangeMinorGridlineStroke(stroke21);
        boolean boolean23 = xYPlot11.isDomainMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        int int25 = xYPlot24.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        xYPlot24.setRenderer((int) (short) 1, xYItemRenderer27, false);
        xYPlot24.setRangePannable(false);
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot24.setOutlinePaint(paint32);
        xYPlot24.clearAnnotations();
        xYPlot24.setRangeZeroBaselineVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = xYPlot24.getInsets();
        xYPlot11.setAxisOffset(rectangleInsets37);
        boolean boolean39 = xYPlot0.equals((java.lang.Object) rectangleInsets37);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot();
        int int44 = xYPlot43.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        xYPlot43.setRenderer((int) (short) 1, xYItemRenderer46, false);
        org.jfree.chart.axis.AxisLocation axisLocation49 = xYPlot43.getDomainAxisLocation();
        boolean boolean50 = xYPlot43.isRangeMinorGridlinesVisible();
        int int51 = xYPlot43.getWeight();
        java.awt.Font font52 = xYPlot43.getNoDataMessageFont();
        xYPlot43.clearDomainMarkers(0);
        xYPlot43.setRangeZeroBaselineVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo58 = null;
        org.jfree.chart.plot.XYPlot xYPlot59 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection60 = xYPlot59.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation62 = xYPlot59.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer64 = null;
        java.util.Collection collection65 = xYPlot59.getDomainMarkers(15, layer64);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo67 = null;
        org.jfree.chart.plot.XYPlot xYPlot68 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo70 = null;
        java.awt.geom.Point2D point2D71 = null;
        xYPlot68.zoomRangeAxes((double) '#', plotRenderingInfo70, point2D71);
        int int73 = xYPlot68.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray74 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot68.setRenderers(xYItemRendererArray74);
        java.awt.Stroke stroke76 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot68.setOutlineStroke(stroke76);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray78 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot68.setDomainAxes(valueAxisArray78);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer81 = xYPlot68.getRenderer((int) (short) 0);
        java.awt.Stroke stroke82 = xYPlot68.getDomainGridlineStroke();
        java.awt.geom.Point2D point2D83 = xYPlot68.getQuadrantOrigin();
        xYPlot59.panDomainAxes((double) 1, plotRenderingInfo67, point2D83);
        xYPlot43.panRangeAxes((double) 100L, plotRenderingInfo58, point2D83);
        xYPlot0.zoomDomainAxes((double) 10L, (double) (byte) 100, plotRenderingInfo42, point2D83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot68", xYPlot0.equals(xYPlot68) ? xYPlot0.hashCode() == xYPlot68.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        xYPlot0.clearDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot13.zoomRangeAxes((double) '#', plotRenderingInfo15, point2D16);
        int int18 = xYPlot13.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean21 = xYPlot13.removeDomainMarker(marker19, layer20);
        xYPlot13.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        int int25 = xYPlot13.getDomainAxisIndex(valueAxis24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.util.List list28 = null;
        xYPlot13.drawRangeGridlines(graphics2D26, rectangle2D27, list28);
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        int int31 = xYPlot30.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        xYPlot30.setRenderer((int) (short) 1, xYItemRenderer33, false);
        xYPlot30.setRangePannable(false);
        int int38 = xYPlot30.getBackgroundImageAlignment();
        boolean boolean39 = xYPlot30.isDomainZeroBaselineVisible();
        java.awt.Paint paint40 = xYPlot30.getRangeZeroBaselinePaint();
        xYPlot13.setDomainGridlinePaint(paint40);
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        java.awt.geom.Point2D point2D45 = null;
        xYPlot42.zoomRangeAxes((double) '#', plotRenderingInfo44, point2D45);
        int int47 = xYPlot42.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray48 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot42.setRenderers(xYItemRendererArray48);
        java.awt.Stroke stroke50 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot42.setOutlineStroke(stroke50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = xYPlot42.getAxisOffset();
        xYPlot13.setAxisOffset(rectangleInsets52);
        xYPlot0.setInsets(rectangleInsets52, true);
        xYPlot0.setDomainMinorGridlinesVisible(false);
        xYPlot0.setDomainCrosshairVisible(false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        xYPlot0.setRenderer(0, xYItemRenderer61);
        java.awt.geom.GeneralPath generalPath63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.RenderingSource renderingSource65 = null;
        xYPlot0.select(generalPath63, rectangle2D64, renderingSource65);
        org.jfree.chart.plot.XYPlot xYPlot67 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj68 = xYPlot67.clone();
        java.awt.Paint paint69 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot67.setRangeMinorGridlinePaint(paint69);
        java.awt.Graphics2D graphics2D71 = null;
        java.awt.geom.Rectangle2D rectangle2D72 = null;
        org.jfree.chart.plot.XYPlot xYPlot73 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo75 = null;
        java.awt.geom.Point2D point2D76 = null;
        xYPlot73.zoomRangeAxes((double) '#', plotRenderingInfo75, point2D76);
        int int78 = xYPlot73.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray79 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot73.setRenderers(xYItemRendererArray79);
        java.awt.Stroke stroke81 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot73.setOutlineStroke(stroke81);
        java.awt.Graphics2D graphics2D83 = null;
        java.awt.geom.Rectangle2D rectangle2D84 = null;
        org.jfree.chart.axis.AxisSpace axisSpace85 = null;
        org.jfree.chart.axis.AxisSpace axisSpace86 = xYPlot73.calculateRangeAxisSpace(graphics2D83, rectangle2D84, axisSpace85);
        org.jfree.chart.axis.AxisSpace axisSpace87 = xYPlot67.calculateDomainAxisSpace(graphics2D71, rectangle2D72, axisSpace86);
        xYPlot0.setFixedDomainAxisSpace(axisSpace87, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot30 and obj68", xYPlot30.equals(obj68) ? xYPlot30.hashCode() == obj68.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj1 = xYPlot0.clone();
        java.awt.Paint paint2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot0.setRangeMinorGridlinePaint(paint2);
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getDomainAxis((int) (byte) 100);
        java.lang.Object obj8 = xYPlot0.clone();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot0.drawQuadrants(graphics2D9, rectangle2D10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and obj8", xYPlot0.equals(obj8) ? xYPlot0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        int int14 = xYPlot13.getDomainAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = xYPlot13.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier15, false);
        boolean boolean18 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        int int20 = xYPlot19.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        xYPlot19.setRenderer((int) (short) 1, xYItemRenderer22, false);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot19.getDomainAxisLocation();
        boolean boolean26 = xYPlot19.isRangeMinorGridlinesVisible();
        int int27 = xYPlot19.getWeight();
        java.awt.Font font28 = xYPlot19.getNoDataMessageFont();
        xYPlot19.clearDomainMarkers(0);
        java.awt.Stroke stroke31 = xYPlot19.getOutlineStroke();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        xYPlot19.drawZeroRangeBaseline(graphics2D32, rectangle2D33);
        java.awt.Paint paint35 = xYPlot19.getDomainZeroBaselinePaint();
        xYPlot0.setDomainMinorGridlinePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot13 and xYPlot19", xYPlot13.equals(xYPlot19) ? xYPlot13.hashCode() == xYPlot19.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        java.awt.Paint paint14 = xYPlot0.getDomainMinorGridlinePaint();
        boolean boolean15 = xYPlot0.isSubplot();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        int int17 = xYPlot16.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        xYPlot16.setRenderer((int) (short) 1, xYItemRenderer19, false);
        org.jfree.chart.axis.AxisLocation axisLocation22 = xYPlot16.getDomainAxisLocation();
        boolean boolean23 = xYPlot16.isRangeMinorGridlinesVisible();
        int int24 = xYPlot16.getWeight();
        java.awt.Font font25 = xYPlot16.getNoDataMessageFont();
        xYPlot16.clearDomainMarkers(0);
        java.awt.Stroke stroke28 = xYPlot16.getOutlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        xYPlot16.setRangeAxis((int) (short) 100, valueAxis30);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = xYPlot16.getLegendItems();
        xYPlot0.setFixedLegendItems(legendItemCollection32);
        xYPlot0.clearDomainAxes();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        int int38 = xYPlot37.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = null;
        xYPlot37.setRenderer((int) (short) 1, xYItemRenderer40, false);
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        xYPlot37.drawBackgroundImage(graphics2D43, rectangle2D44);
        java.util.List list46 = xYPlot37.getAnnotations();
        xYPlot0.drawRangeTickBands(graphics2D35, rectangle2D36, list46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot16 and xYPlot37", xYPlot16.equals(xYPlot37) ? xYPlot16.hashCode() == xYPlot37.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        xYPlot0.markerChanged(markerChangeEvent2);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer4 = null;
        int int5 = xYPlot0.getIndexOf(xYItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxis((int) (short) 100);
        org.jfree.chart.plot.Plot plot9 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        int int11 = xYPlot10.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        xYPlot10.setRenderer((int) (short) 1, xYItemRenderer13, false);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot10.getDomainAxisLocation();
        boolean boolean17 = xYPlot10.isRangeMinorGridlinesVisible();
        boolean boolean18 = xYPlot10.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = xYPlot10.getRenderer();
        int int20 = xYPlot10.getRendererCount();
        xYPlot10.clearDomainMarkers((int) (short) 1);
        java.awt.Stroke stroke23 = xYPlot10.getRangeZeroBaselineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot10", xYPlot0.equals(xYPlot10) ? xYPlot0.hashCode() == xYPlot10.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot29.zoomRangeAxes((double) '#', plotRenderingInfo31, point2D32);
        xYPlot29.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker37 = null;
        org.jfree.chart.util.Layer layer38 = null;
        boolean boolean39 = xYPlot29.removeDomainMarker((int) (byte) 1, marker37, layer38);
        xYPlot29.setRangeGridlinesVisible(false);
        xYPlot29.clearSelection();
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot();
        int int44 = xYPlot43.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        xYPlot43.setRenderer((int) (short) 1, xYItemRenderer46, false);
        xYPlot43.setRangePannable(false);
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        xYPlot43.setRangeAxis(valueAxis51);
        boolean boolean53 = xYPlot43.isRangeCrosshairLockedOnData();
        java.awt.Paint paint54 = xYPlot43.getDomainMinorGridlinePaint();
        xYPlot29.setRangeMinorGridlinePaint(paint54);
        xYPlot0.setRangeCrosshairPaint(paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot17 and xYPlot43", xYPlot17.equals(xYPlot43) ? xYPlot17.hashCode() == xYPlot43.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo2 = null;
        java.awt.geom.Point2D point2D3 = null;
        xYPlot0.zoomRangeAxes((double) '#', plotRenderingInfo2, point2D3);
        int int5 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge(0);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        xYPlot8.zoomRangeAxes((double) '#', plotRenderingInfo10, point2D11);
        xYPlot8.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        boolean boolean18 = xYPlot8.removeDomainMarker((int) (byte) 1, marker16, layer17);
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot8.getDomainAxisLocation((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = xYPlot8.getRangeAxisEdge((int) (byte) 1);
        xYPlot8.clearRangeAxes();
        java.awt.Stroke stroke24 = xYPlot8.getRangeCrosshairStroke();
        xYPlot0.setDomainGridlineStroke(stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot8", xYPlot0.equals(xYPlot8) ? xYPlot0.hashCode() == xYPlot8.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = xYPlot0.getRendererForDataset(xYDataset13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot0.getDomainAxisLocation(15);
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
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        int int29 = xYPlot17.getRangeAxisIndex(valueAxis28);
        java.awt.Stroke stroke30 = xYPlot17.getRangeCrosshairStroke();
        java.lang.String str31 = xYPlot17.getNoDataMessage();
        xYPlot17.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot();
        int int35 = xYPlot34.getDomainAxisCount();
        xYPlot34.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot();
        int int39 = xYPlot38.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        xYPlot38.setRenderer((int) (short) 1, xYItemRenderer41, false);
        xYPlot38.setRangePannable(false);
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot38.setOutlinePaint(paint46);
        xYPlot34.setDomainMinorGridlinePaint(paint46);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot34.setDomainZeroBaselinePaint(paint49);
        org.jfree.chart.axis.AxisLocation axisLocation52 = xYPlot34.getRangeAxisLocation((int) (short) 0);
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder54 = xYPlot53.getDatasetRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        java.awt.geom.Point2D point2D58 = null;
        xYPlot55.zoomRangeAxes((double) '#', plotRenderingInfo57, point2D58);
        int int60 = xYPlot55.getBackgroundImageAlignment();
        java.awt.Stroke stroke61 = xYPlot55.getRangeMinorGridlineStroke();
        java.awt.Paint paint62 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot55.setRangeCrosshairPaint(paint62);
        xYPlot53.setRangeZeroBaselinePaint(paint62);
        xYPlot53.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace66 = xYPlot53.getFixedDomainAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation67 = xYPlot53.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge68 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation52, plotOrientation67);
        xYPlot17.setOrientation(plotOrientation67);
        org.jfree.chart.util.RectangleEdge rectangleEdge70 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation16, plotOrientation67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot38", xYPlot0.equals(xYPlot38) ? xYPlot0.hashCode() == xYPlot38.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot();
        int int32 = xYPlot31.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        xYPlot31.setRenderer((int) (short) 1, xYItemRenderer34, false);
        org.jfree.chart.axis.AxisLocation axisLocation37 = xYPlot31.getDomainAxisLocation();
        boolean boolean38 = xYPlot31.isRangeMinorGridlinesVisible();
        boolean boolean39 = xYPlot31.isRangeGridlinesVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = xYPlot31.getRenderer();
        int int41 = xYPlot31.getRendererCount();
        xYPlot31.setForegroundAlpha((float) '4');
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        int int45 = xYPlot31.indexOf(xYDataset44);
        org.jfree.chart.axis.AxisLocation axisLocation47 = xYPlot31.getDomainAxisLocation((int) '4');
        xYPlot0.setDomainAxisLocation((int) (byte) 0, axisLocation47, true);
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        java.awt.geom.Point2D point2D53 = null;
        xYPlot50.zoomRangeAxes((double) '#', plotRenderingInfo52, point2D53);
        int int55 = xYPlot50.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray56 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot50.setRenderers(xYItemRendererArray56);
        java.awt.Stroke stroke58 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot50.setOutlineStroke(stroke58);
        boolean boolean60 = xYPlot50.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        int int62 = xYPlot50.getRangeAxisIndex(valueAxis61);
        org.jfree.chart.plot.XYPlot xYPlot63 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo67 = null;
        org.jfree.chart.plot.CrosshairState crosshairState68 = null;
        boolean boolean69 = xYPlot63.render(graphics2D64, rectangle2D65, 10, plotRenderingInfo67, crosshairState68);
        int int70 = xYPlot63.getDomainAxisCount();
        java.awt.Paint paint71 = xYPlot63.getRangeCrosshairPaint();
        xYPlot50.setDomainCrosshairPaint(paint71);
        xYPlot0.setDomainCrosshairPaint(paint71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot14 and xYPlot63", xYPlot14.equals(xYPlot63) ? xYPlot14.hashCode() == xYPlot63.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
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
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        xYPlot30.zoomRangeAxes((double) '#', plotRenderingInfo32, point2D33);
        int int35 = xYPlot30.getBackgroundImageAlignment();
        java.awt.Stroke stroke36 = xYPlot30.getRangeMinorGridlineStroke();
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot30.setRangeCrosshairPaint(paint37);
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        int int40 = xYPlot39.getDomainAxisCount();
        xYPlot39.setRangeGridlinesVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace43 = xYPlot39.getFixedRangeAxisSpace();
        float float44 = xYPlot39.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        java.lang.Object obj48 = xYPlot47.clone();
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot47.setRangeMinorGridlinePaint(paint49);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        java.awt.geom.Point2D point2D56 = null;
        xYPlot53.zoomRangeAxes((double) '#', plotRenderingInfo55, point2D56);
        int int58 = xYPlot53.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray59 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot53.setRenderers(xYItemRendererArray59);
        java.awt.Stroke stroke61 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot53.setOutlineStroke(stroke61);
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        org.jfree.chart.axis.AxisSpace axisSpace65 = null;
        org.jfree.chart.axis.AxisSpace axisSpace66 = xYPlot53.calculateRangeAxisSpace(graphics2D63, rectangle2D64, axisSpace65);
        org.jfree.chart.axis.AxisSpace axisSpace67 = xYPlot47.calculateDomainAxisSpace(graphics2D51, rectangle2D52, axisSpace66);
        org.jfree.chart.axis.AxisSpace axisSpace68 = xYPlot39.calculateRangeAxisSpace(graphics2D45, rectangle2D46, axisSpace67);
        xYPlot30.setFixedRangeAxisSpace(axisSpace67, true);
        xYPlot0.setFixedRangeAxisSpace(axisSpace67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and obj48", xYPlot0.equals(obj48) ? xYPlot0.hashCode() == obj48.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        xYPlot0.setRenderer((int) (short) 1, xYItemRenderer3, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getDomainAxisLocation();
        boolean boolean7 = xYPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot0.setDomainAxis((int) (byte) 0, valueAxis9);
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
        boolean boolean22 = xYPlot12.isRangeZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        xYPlot12.markerChanged(markerChangeEvent23);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot12.setRangeCrosshairStroke(stroke25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot29.zoomRangeAxes((double) '#', plotRenderingInfo31, point2D32);
        int int34 = xYPlot29.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray35 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot29.setRenderers(xYItemRendererArray35);
        java.awt.Stroke stroke37 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot29.setOutlineStroke(stroke37);
        double double39 = xYPlot29.getDomainCrosshairValue();
        boolean boolean40 = xYPlot29.isRangeCrosshairVisible();
        float float41 = xYPlot29.getBackgroundAlpha();
        xYPlot29.setRangeCrosshairValue((double) (short) 1, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot();
        int int48 = xYPlot47.getDomainAxisCount();
        xYPlot47.setRangeCrosshairValue((double) 0.0f);
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot();
        int int52 = xYPlot51.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = null;
        xYPlot51.setRenderer((int) (short) 1, xYItemRenderer54, false);
        xYPlot51.setRangePannable(false);
        java.awt.Paint paint59 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot51.setOutlinePaint(paint59);
        xYPlot47.setDomainMinorGridlinePaint(paint59);
        java.awt.Paint paint62 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot47.setDomainZeroBaselinePaint(paint62);
        boolean boolean64 = xYPlot47.isRangeZoomable();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer65 = null;
        xYPlot47.setRenderer(xYItemRenderer65);
        org.jfree.chart.plot.XYPlot xYPlot67 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo69 = null;
        java.awt.geom.Point2D point2D70 = null;
        xYPlot67.zoomRangeAxes((double) '#', plotRenderingInfo69, point2D70);
        int int72 = xYPlot67.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray73 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot67.setRenderers(xYItemRendererArray73);
        java.awt.Stroke stroke75 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot67.setOutlineStroke(stroke75);
        boolean boolean77 = xYPlot67.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        int int79 = xYPlot67.getRangeAxisIndex(valueAxis78);
        java.awt.Stroke stroke80 = xYPlot67.getRangeCrosshairStroke();
        xYPlot47.setRangeCrosshairStroke(stroke80);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer82 = null;
        int int83 = xYPlot47.getIndexOf(xYItemRenderer82);
        java.awt.geom.Point2D point2D84 = xYPlot47.getQuadrantOrigin();
        xYPlot29.panDomainAxes(0.0d, plotRenderingInfo46, point2D84);
        xYPlot12.zoomRangeAxes(1.0d, plotRenderingInfo28, point2D84);
        org.jfree.chart.event.PlotChangeListener plotChangeListener87 = null;
        xYPlot12.addChangeListener(plotChangeListener87);
        double double89 = xYPlot12.getRangeCrosshairValue();
        boolean boolean90 = xYPlot12.canSelectByPoint();
        java.awt.Stroke stroke91 = xYPlot12.getRangeZeroBaselineStroke();
        xYPlot0.setRangeZeroBaselineStroke(stroke91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot51", xYPlot0.equals(xYPlot51) ? xYPlot0.hashCode() == xYPlot51.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        xYPlot23.zoomRangeAxes((double) '#', plotRenderingInfo25, point2D26);
        int int28 = xYPlot23.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker29 = null;
        org.jfree.chart.util.Layer layer30 = null;
        boolean boolean31 = xYPlot23.removeDomainMarker(marker29, layer30);
        xYPlot23.setRangePannable(false);
        java.awt.Stroke stroke34 = xYPlot23.getDomainGridlineStroke();
        java.awt.Paint paint35 = xYPlot23.getDomainMinorGridlinePaint();
        xYPlot0.setRangeMinorGridlinePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot9 and xYPlot23", xYPlot9.equals(xYPlot23) ? xYPlot9.hashCode() == xYPlot23.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder1 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.XYPlot xYPlot3 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        xYPlot3.zoomRangeAxes((double) '#', plotRenderingInfo5, point2D6);
        int int8 = xYPlot3.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray9 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot3.setRenderers(xYItemRendererArray9);
        java.awt.Stroke stroke11 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot3.setOutlineStroke(stroke11);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot3.setDomainAxes(valueAxisArray13);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = xYPlot3.getRenderer((int) (short) 0);
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = xYPlot17.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot17.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        int int22 = xYPlot17.getIndexOf(xYItemRenderer21);
        java.awt.Paint paint23 = xYPlot17.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = xYPlot17.getDrawingSupplier();
        xYPlot3.setDrawingSupplier(drawingSupplier24, true);
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        int int29 = xYPlot28.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        xYPlot28.setRenderer((int) (short) 1, xYItemRenderer31, false);
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot28.getDomainAxisLocation();
        boolean boolean35 = xYPlot28.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        org.jfree.chart.plot.CrosshairState crosshairState41 = null;
        boolean boolean42 = xYPlot36.render(graphics2D37, rectangle2D38, 10, plotRenderingInfo40, crosshairState41);
        int int43 = xYPlot36.getDomainAxisCount();
        java.lang.String str44 = xYPlot36.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        xYPlot36.markerChanged(markerChangeEvent45);
        java.awt.Paint paint47 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot36.setRangeTickBandPaint(paint47);
        xYPlot28.setDomainCrosshairPaint(paint47);
        boolean boolean50 = xYPlot28.isSubplot();
        java.awt.Stroke stroke51 = xYPlot28.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot28.getDomainAxis((int) (short) 0);
        org.jfree.chart.axis.AxisLocation axisLocation55 = xYPlot28.getRangeAxisLocation(10);
        xYPlot3.setRangeAxisLocation((int) 'a', axisLocation55, true);
        xYPlot0.setRangeAxisLocation((int) (short) 100, axisLocation55, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on xYPlot0 and xYPlot17.", xYPlot0.equals(xYPlot17) == xYPlot17.equals(xYPlot0));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
        java.awt.Paint paint23 = xYPlot0.getRangeGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = xYPlot0.getAxisOffset();
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        xYPlot26.zoomRangeAxes((double) '#', plotRenderingInfo28, point2D29);
        int int31 = xYPlot26.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray32 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot26.setRenderers(xYItemRendererArray32);
        java.awt.Stroke stroke34 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot26.setOutlineStroke(stroke34);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray36 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot26.setDomainAxes(valueAxisArray36);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = xYPlot26.getRenderer((int) (short) 0);
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection41 = xYPlot40.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot40.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = null;
        int int45 = xYPlot40.getIndexOf(xYItemRenderer44);
        java.awt.Paint paint46 = xYPlot40.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = xYPlot40.getDrawingSupplier();
        xYPlot26.setDrawingSupplier(drawingSupplier47, true);
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot();
        int int52 = xYPlot51.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = null;
        xYPlot51.setRenderer((int) (short) 1, xYItemRenderer54, false);
        org.jfree.chart.axis.AxisLocation axisLocation57 = xYPlot51.getDomainAxisLocation();
        boolean boolean58 = xYPlot51.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot59 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        org.jfree.chart.plot.CrosshairState crosshairState64 = null;
        boolean boolean65 = xYPlot59.render(graphics2D60, rectangle2D61, 10, plotRenderingInfo63, crosshairState64);
        int int66 = xYPlot59.getDomainAxisCount();
        java.lang.String str67 = xYPlot59.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent68 = null;
        xYPlot59.markerChanged(markerChangeEvent68);
        java.awt.Paint paint70 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot59.setRangeTickBandPaint(paint70);
        xYPlot51.setDomainCrosshairPaint(paint70);
        boolean boolean73 = xYPlot51.isSubplot();
        java.awt.Stroke stroke74 = xYPlot51.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis76 = xYPlot51.getDomainAxis((int) (short) 0);
        org.jfree.chart.axis.AxisLocation axisLocation78 = xYPlot51.getRangeAxisLocation(10);
        xYPlot26.setRangeAxisLocation((int) 'a', axisLocation78, true);
        xYPlot0.setDomainAxisLocation((int) (short) 100, axisLocation78, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and xYPlot40", obj1.equals(xYPlot40) ? obj1.hashCode() == xYPlot40.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        java.awt.Paint paint17 = xYPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = xYPlot0.getDataRange(valueAxis18);
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        int int21 = xYPlot20.getDomainAxisCount();
        xYPlot20.setRangeGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot20.getDomainAxis();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        int int26 = xYPlot25.getDomainAxisCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        xYPlot25.setRenderer((int) (short) 1, xYItemRenderer28, false);
        xYPlot25.setRangePannable(false);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot25.setOutlinePaint(paint33);
        xYPlot25.clearAnnotations();
        boolean boolean36 = xYPlot25.isRangeZeroBaselineVisible();
        xYPlot20.setParent((org.jfree.chart.plot.Plot) xYPlot25);
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        org.jfree.chart.plot.CrosshairState crosshairState43 = null;
        boolean boolean44 = xYPlot38.render(graphics2D39, rectangle2D40, 10, plotRenderingInfo42, crosshairState43);
        int int45 = xYPlot38.getDomainAxisCount();
        java.awt.Paint paint46 = xYPlot38.getRangeCrosshairPaint();
        xYPlot38.mapDatasetToDomainAxis(1, 10);
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        java.awt.geom.Point2D point2D53 = null;
        xYPlot50.zoomRangeAxes((double) '#', plotRenderingInfo52, point2D53);
        int int55 = xYPlot50.getBackgroundImageAlignment();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray56 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot50.setRenderers(xYItemRendererArray56);
        java.awt.Stroke stroke58 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot50.setOutlineStroke(stroke58);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray60 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot50.setDomainAxes(valueAxisArray60);
        xYPlot38.setRangeAxes(valueAxisArray60);
        xYPlot20.setRangeAxes(valueAxisArray60);
        xYPlot0.setDomainAxes(valueAxisArray60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYPlot0 and xYPlot25", xYPlot0.equals(xYPlot25) ? xYPlot0.hashCode() == xYPlot25.hashCode() : true);
    }
}

