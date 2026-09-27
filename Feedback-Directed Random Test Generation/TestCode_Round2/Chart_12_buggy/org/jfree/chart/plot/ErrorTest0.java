package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str14 = multiplePiePlot9.getNoDataMessage();
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setAggregatedItemsPaint(paint15);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot7.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot7.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj5", multiplePiePlot1.equals(obj5) ? multiplePiePlot1.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot7.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot7.datasetChanged(datasetChangeEvent12);
        boolean boolean14 = multiplePiePlot1.equals((java.lang.Object) datasetChangeEvent12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj5", multiplePiePlot1.equals(obj5) ? multiplePiePlot1.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot7.setOutlineStroke(stroke11);
        float float13 = multiplePiePlot7.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj5", multiplePiePlot1.equals(obj5) ? multiplePiePlot1.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str20 = multiplePiePlot15.getNoDataMessage();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint21);
        multiplePiePlot1.setAggregatedItemsPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection9", legendItemCollection7.equals(legendItemCollection9) ? legendItemCollection7.hashCode() == legendItemCollection9.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = multiplePiePlot13.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot13", multiplePiePlot9.equals(multiplePiePlot13) ? multiplePiePlot9.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image10 = multiplePiePlot7.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot12.setOutlineStroke(stroke13);
        java.lang.Comparable comparable15 = multiplePiePlot12.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot12.getInsets();
        multiplePiePlot7.setInsets(rectangleInsets16, true);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot7.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot17.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot17.getDatasetGroup();
        boolean boolean22 = multiplePiePlot7.equals((java.lang.Object) multiplePiePlot17);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot24.setOutlineStroke(stroke28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot24.getDataset();
        java.awt.Font font31 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot7.setNoDataMessageFont(font31);
        multiplePiePlot1.setNoDataMessageFont(font31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Image image1 = null;
        multiplePiePlot0.setBackgroundImage(image1);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        multiplePiePlot4.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot4.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        int int13 = multiplePiePlot12.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot15.setOutlineStroke(stroke19);
        float float21 = multiplePiePlot15.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot15.getPieChart();
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        multiplePiePlot4.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        multiplePiePlot0.setPieChart(jFreeChart22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot12", multiplePiePlot0.equals(multiplePiePlot12) ? multiplePiePlot0.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot12.setOutlineStroke(stroke13);
        java.lang.Comparable comparable15 = multiplePiePlot12.getAggregatedItemsKey();
        int int16 = multiplePiePlot12.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str23 = multiplePiePlot18.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        multiplePiePlot9.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot9.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot9.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot9.setDataset(categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        int int30 = multiplePiePlot29.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        float float33 = multiplePiePlot32.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent34);
        java.awt.Stroke stroke36 = null;
        multiplePiePlot32.setOutlineStroke(stroke36);
        float float38 = multiplePiePlot32.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot32.getPieChart();
        multiplePiePlot29.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot32", multiplePiePlot1.equals(multiplePiePlot32) ? multiplePiePlot1.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) 15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection9", legendItemCollection7.equals(legendItemCollection9) ? legendItemCollection7.hashCode() == legendItemCollection9.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot10.setOutlineStroke(stroke11);
        java.lang.Comparable comparable13 = multiplePiePlot10.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot10.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets15, false);
        multiplePiePlot1.setInsets(rectangleInsets15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot27.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot27.getDatasetGroup();
        boolean boolean32 = multiplePiePlot17.equals((java.lang.Object) multiplePiePlot27);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        float float35 = multiplePiePlot34.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot34.setOutlineStroke(stroke38);
        float float40 = multiplePiePlot34.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot34.getPieChart();
        multiplePiePlot27.setPieChart(jFreeChart41);
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot34", multiplePiePlot1.equals(multiplePiePlot34) ? multiplePiePlot1.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot15.setOutlineStroke(stroke16);
        java.awt.Font font18 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot9.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        java.lang.String str27 = multiplePiePlot22.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot22", multiplePiePlot9.equals(multiplePiePlot22) ? multiplePiePlot9.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier8);
        float float10 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot5.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot15.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot15.getDatasetGroup();
        boolean boolean20 = multiplePiePlot5.equals((java.lang.Object) multiplePiePlot15);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        java.awt.Stroke stroke27 = null;
        multiplePiePlot22.setOutlineStroke(stroke27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot22.getPieChart();
        multiplePiePlot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot9.axisChanged(axisChangeEvent12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot9.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        int int18 = multiplePiePlot17.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Stroke stroke24 = null;
        multiplePiePlot20.setOutlineStroke(stroke24);
        float float26 = multiplePiePlot20.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot20.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        multiplePiePlot9.setPieChart(jFreeChart27);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot10.setOutlineStroke(stroke11);
        java.awt.Font font13 = multiplePiePlot10.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot10.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setNoDataMessage("hi!");
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot16.setBackgroundPaint(paint23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot26.setBackgroundPaint(paint33);
        multiplePiePlot16.setOutlinePaint(paint33);
        org.jfree.chart.util.TableOrder tableOrder36 = multiplePiePlot16.getDataExtractOrder();
        multiplePiePlot10.setDataExtractOrder(tableOrder36);
        multiplePiePlot1.setDataExtractOrder(tableOrder36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj5", multiplePiePlot1.equals(obj5) ? multiplePiePlot1.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        int int19 = multiplePiePlot18.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot21.setOutlineStroke(stroke25);
        float float27 = multiplePiePlot21.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        java.lang.Object obj14 = multiplePiePlot1.clone();
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setAggregatedItemsPaint(paint20);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint24 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot7.setDataset(categoryDataset9);
        boolean boolean12 = multiplePiePlot7.equals((java.lang.Object) '#');
        java.awt.Paint paint13 = multiplePiePlot7.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        multiplePiePlot1.setInsets(rectangleInsets25, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot9.getDataset();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot17.setOutlineStroke(stroke18);
        java.awt.Font font20 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot17", multiplePiePlot9.equals(multiplePiePlot17) ? multiplePiePlot9.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        int int9 = multiplePiePlot8.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Stroke stroke15 = null;
        multiplePiePlot11.setOutlineStroke(stroke15);
        float float17 = multiplePiePlot11.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot11.getPieChart();
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setBackgroundPaint(paint26);
        multiplePiePlot9.setOutlinePaint(paint26);
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot9.getDataExtractOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        multiplePiePlot9.handleClick(0, (-1), plotRenderingInfo32);
        boolean boolean34 = multiplePiePlot1.equals((java.lang.Object) 0);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        java.awt.Paint paint43 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot36.setBackgroundPaint(paint43);
        java.awt.Paint paint45 = multiplePiePlot36.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot36", multiplePiePlot19.equals(multiplePiePlot36) ? multiplePiePlot19.hashCode() == multiplePiePlot36.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier8);
        float float10 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot5.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot15.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot15.getDatasetGroup();
        boolean boolean20 = multiplePiePlot5.equals((java.lang.Object) multiplePiePlot15);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        java.awt.Stroke stroke27 = null;
        multiplePiePlot22.setOutlineStroke(stroke27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot22.getPieChart();
        multiplePiePlot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setNoDataMessage("hi!");
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str11 = multiplePiePlot6.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot6.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot6.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setAggregatedItemsPaint(paint27);
        multiplePiePlot15.setOutlinePaint(paint27);
        multiplePiePlot6.setAggregatedItemsPaint(paint27);
        multiplePiePlot1.setOutlinePaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection9", legendItemCollection7.equals(legendItemCollection9) ? legendItemCollection7.hashCode() == legendItemCollection9.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        float float24 = multiplePiePlot23.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent25);
        multiplePiePlot23.zoom((double) 0.0f);
        multiplePiePlot23.setLimit((double) (-1));
        multiplePiePlot23.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        multiplePiePlot34.setDrawingSupplier(drawingSupplier37);
        float float39 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection40 = multiplePiePlot34.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = multiplePiePlot44.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent46);
        org.jfree.data.general.DatasetGroup datasetGroup48 = multiplePiePlot44.getDatasetGroup();
        boolean boolean49 = multiplePiePlot34.equals((java.lang.Object) multiplePiePlot44);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        float float52 = multiplePiePlot51.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        multiplePiePlot51.markerChanged(markerChangeEvent53);
        java.awt.Stroke stroke55 = null;
        multiplePiePlot51.setOutlineStroke(stroke55);
        float float57 = multiplePiePlot51.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart58 = multiplePiePlot51.getPieChart();
        multiplePiePlot44.setPieChart(jFreeChart58);
        multiplePiePlot23.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        multiplePiePlot13.setPieChart(jFreeChart58);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        int int22 = multiplePiePlot21.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot24.setOutlineStroke(stroke28);
        float float30 = multiplePiePlot24.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot24.getPieChart();
        multiplePiePlot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = null;
        multiplePiePlot35.setDrawingSupplier(drawingSupplier38);
        float float40 = multiplePiePlot35.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection41 = multiplePiePlot35.getLegendItems();
        org.jfree.chart.plot.Plot plot42 = multiplePiePlot35.getRootPlot();
        float float43 = multiplePiePlot35.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot35.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart31 and jFreeChart44", jFreeChart31.equals(jFreeChart44) ? jFreeChart31.hashCode() == jFreeChart44.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        float float24 = multiplePiePlot23.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent25);
        multiplePiePlot23.zoom((double) 0.0f);
        multiplePiePlot23.setLimit((double) (-1));
        multiplePiePlot23.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        multiplePiePlot34.setDrawingSupplier(drawingSupplier37);
        float float39 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection40 = multiplePiePlot34.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = multiplePiePlot44.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent46);
        org.jfree.data.general.DatasetGroup datasetGroup48 = multiplePiePlot44.getDatasetGroup();
        boolean boolean49 = multiplePiePlot34.equals((java.lang.Object) multiplePiePlot44);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        float float52 = multiplePiePlot51.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        multiplePiePlot51.markerChanged(markerChangeEvent53);
        java.awt.Stroke stroke55 = null;
        multiplePiePlot51.setOutlineStroke(stroke55);
        float float57 = multiplePiePlot51.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart58 = multiplePiePlot51.getPieChart();
        multiplePiePlot44.setPieChart(jFreeChart58);
        multiplePiePlot23.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        multiplePiePlot13.setPieChart(jFreeChart58);
        multiplePiePlot1.setPieChart(jFreeChart58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot44", multiplePiePlot1.equals(multiplePiePlot44) ? multiplePiePlot1.hashCode() == multiplePiePlot44.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        java.lang.Object obj14 = multiplePiePlot1.clone();
        java.awt.Image image15 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        java.lang.Class<?> wildcardClass16 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection15", legendItemCollection7.equals(legendItemCollection15) ? legendItemCollection7.hashCode() == legendItemCollection15.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        java.lang.Object obj23 = multiplePiePlot1.clone();
        java.awt.Paint paint24 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj23", multiplePiePlot1.equals(obj23) ? multiplePiePlot1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot8.getRootPlot();
        java.lang.String str16 = multiplePiePlot8.getNoDataMessage();
        java.awt.Paint paint17 = multiplePiePlot8.getAggregatedItemsPaint();
        multiplePiePlot8.zoom((double) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot21.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot21.getDatasetGroup();
        java.lang.String str26 = multiplePiePlot21.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot21.getDrawingSupplier();
        multiplePiePlot8.setDrawingSupplier(drawingSupplier27);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot23.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot23", multiplePiePlot10.equals(multiplePiePlot23) ? multiplePiePlot10.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.Object obj6 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Stroke stroke9 = null;
        multiplePiePlot8.setOutlineStroke(stroke9);
        java.lang.Comparable comparable11 = multiplePiePlot8.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets12, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj6", multiplePiePlot1.equals(obj6) ? multiplePiePlot1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        double double26 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        multiplePiePlot28.setNoDataMessage("hi!");
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener33);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener43);
        multiplePiePlot38.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        multiplePiePlot38.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        multiplePiePlot38.setDataset(categoryDataset51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        multiplePiePlot38.setDataset(categoryDataset53);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier55 = null;
        multiplePiePlot38.setDrawingSupplier(drawingSupplier55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        int int59 = multiplePiePlot58.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        float float62 = multiplePiePlot61.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent63 = null;
        multiplePiePlot61.markerChanged(markerChangeEvent63);
        java.awt.Stroke stroke65 = null;
        multiplePiePlot61.setOutlineStroke(stroke65);
        float float67 = multiplePiePlot61.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart68 = multiplePiePlot61.getPieChart();
        multiplePiePlot58.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart68);
        multiplePiePlot38.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart68);
        multiplePiePlot28.setPieChart(jFreeChart68);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot61", multiplePiePlot8.equals(multiplePiePlot61) ? multiplePiePlot8.hashCode() == multiplePiePlot61.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (short) -1, plotRenderingInfo13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot16.getDataset();
        int int18 = multiplePiePlot16.getBackgroundImageAlignment();
        java.awt.Image image19 = multiplePiePlot16.getBackgroundImage();
        double double20 = multiplePiePlot16.getLimit();
        double double21 = multiplePiePlot16.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setBackgroundPaint(paint30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot33.setOutlineStroke(stroke38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = multiplePiePlot41.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = multiplePiePlot41.getDatasetGroup();
        java.awt.Stroke stroke46 = null;
        multiplePiePlot41.setOutlineStroke(stroke46);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot41.getPieChart();
        multiplePiePlot33.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot23.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot41", obj5.equals(multiplePiePlot41) ? obj5.hashCode() == multiplePiePlot41.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        boolean boolean21 = multiplePiePlot17.equals((java.lang.Object) 10L);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot17.datasetChanged(datasetChangeEvent22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Stroke stroke26 = null;
        multiplePiePlot25.setOutlineStroke(stroke26);
        java.lang.Comparable comparable28 = multiplePiePlot25.getAggregatedItemsKey();
        int int29 = multiplePiePlot25.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str36 = multiplePiePlot31.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset37 = multiplePiePlot31.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup38 = multiplePiePlot31.getDatasetGroup();
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot31);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot25.getInsets();
        multiplePiePlot17.setInsets(rectangleInsets40, false);
        multiplePiePlot7.setInsets(rectangleInsets40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot25", multiplePiePlot1.equals(multiplePiePlot25) ? multiplePiePlot1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot13.axisChanged(axisChangeEvent18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        int int22 = multiplePiePlot21.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot24.setOutlineStroke(stroke28);
        float float30 = multiplePiePlot24.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot24.getPieChart();
        multiplePiePlot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        float float37 = multiplePiePlot36.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot36.setOutlineStroke(stroke40);
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        boolean boolean44 = multiplePiePlot36.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        float float49 = multiplePiePlot48.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent50 = null;
        multiplePiePlot48.notifyListeners(plotChangeEvent50);
        java.awt.Paint paint52 = multiplePiePlot48.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        java.awt.Stroke stroke55 = null;
        multiplePiePlot54.setOutlineStroke(stroke55);
        java.awt.Font font57 = multiplePiePlot54.getNoDataMessageFont();
        multiplePiePlot48.setNoDataMessageFont(font57);
        multiplePiePlot36.setNoDataMessageFont(font57);
        multiplePiePlot1.setNoDataMessageFont(font57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot21 and multiplePiePlot48", multiplePiePlot21.equals(multiplePiePlot48) ? multiplePiePlot21.hashCode() == multiplePiePlot48.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        boolean boolean19 = multiplePiePlot15.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot15.getParent();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot15.setOutlineStroke(stroke21);
        multiplePiePlot1.setOutlineStroke(stroke21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setNoDataMessage("hi!");
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str30 = multiplePiePlot25.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot25.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot33.setOutlineStroke(stroke34);
        java.awt.Font font36 = multiplePiePlot33.getNoDataMessageFont();
        multiplePiePlot25.setNoDataMessageFont(font36);
        multiplePiePlot1.setNoDataMessageFont(font36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot25", multiplePiePlot1.equals(multiplePiePlot25) ? multiplePiePlot1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot9.getDataset();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.lang.Object obj19 = multiplePiePlot1.clone();
        double double20 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj19", multiplePiePlot1.equals(obj19) ? multiplePiePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot9.getDataset();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.lang.Object obj19 = multiplePiePlot1.clone();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj19", multiplePiePlot1.equals(obj19) ? multiplePiePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke7 = null;
        multiplePiePlot1.setOutlineStroke(stroke7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent12);
        multiplePiePlot10.zoom((double) 0.0f);
        multiplePiePlot10.setLimit((double) (-1));
        multiplePiePlot10.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier24);
        float float26 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection27 = multiplePiePlot21.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot31.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = multiplePiePlot31.getDatasetGroup();
        boolean boolean36 = multiplePiePlot21.equals((java.lang.Object) multiplePiePlot31);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        float float39 = multiplePiePlot38.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        multiplePiePlot38.markerChanged(markerChangeEvent40);
        java.awt.Stroke stroke42 = null;
        multiplePiePlot38.setOutlineStroke(stroke42);
        float float44 = multiplePiePlot38.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart45 = multiplePiePlot38.getPieChart();
        multiplePiePlot31.setPieChart(jFreeChart45);
        multiplePiePlot10.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart45);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot38", multiplePiePlot1.equals(multiplePiePlot38) ? multiplePiePlot1.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent22);
        multiplePiePlot20.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot20.getDrawingSupplier();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot20", multiplePiePlot11.equals(multiplePiePlot20) ? multiplePiePlot11.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, 15, plotRenderingInfo13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot11.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setAggregatedItemsPaint(paint18);
        multiplePiePlot1.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener27);
        multiplePiePlot22.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent31);
        java.lang.String str33 = multiplePiePlot22.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot35.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot35.getDatasetGroup();
        java.lang.String str40 = multiplePiePlot35.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot35.getDrawingSupplier();
        multiplePiePlot22.setDrawingSupplier(drawingSupplier41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot35", multiplePiePlot11.equals(multiplePiePlot35) ? multiplePiePlot11.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.Object obj12 = multiplePiePlot1.clone();
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        multiplePiePlot26.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        multiplePiePlot26.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo37);
        java.awt.Paint paint39 = multiplePiePlot26.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot26", multiplePiePlot6.equals(multiplePiePlot26) ? multiplePiePlot6.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot24.setOutlineStroke(stroke25);
        java.awt.Font font27 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font27);
        multiplePiePlot10.setNoDataMessageFont(font27);
        multiplePiePlot1.setNoDataMessageFont(font27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot10.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot10.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Stroke stroke17 = null;
        multiplePiePlot16.setOutlineStroke(stroke17);
        java.lang.Comparable comparable19 = multiplePiePlot16.getAggregatedItemsKey();
        java.awt.Font font20 = multiplePiePlot16.getNoDataMessageFont();
        multiplePiePlot10.setNoDataMessageFont(font20);
        java.awt.Stroke stroke22 = multiplePiePlot10.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str29 = multiplePiePlot24.getNoDataMessage();
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setAggregatedItemsPaint(paint30);
        multiplePiePlot10.setNoDataMessagePaint(paint30);
        multiplePiePlot1.setNoDataMessagePaint(paint30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = null;
        multiplePiePlot35.setDrawingSupplier(drawingSupplier38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot35.setOutlineStroke(stroke40);
        org.jfree.data.general.DatasetGroup datasetGroup42 = multiplePiePlot35.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot35.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        float float47 = multiplePiePlot46.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent48 = null;
        multiplePiePlot46.notifyListeners(plotChangeEvent48);
        multiplePiePlot46.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = multiplePiePlot46.getDrawingSupplier();
        multiplePiePlot46.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        java.awt.Stroke stroke57 = null;
        multiplePiePlot56.setOutlineStroke(stroke57);
        java.lang.Comparable comparable59 = multiplePiePlot56.getAggregatedItemsKey();
        int int60 = multiplePiePlot56.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        multiplePiePlot62.setNoDataMessage("hi!");
        multiplePiePlot62.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str67 = multiplePiePlot62.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset68 = multiplePiePlot62.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup69 = multiplePiePlot62.getDatasetGroup();
        multiplePiePlot56.setParent((org.jfree.chart.plot.Plot) multiplePiePlot62);
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = multiplePiePlot56.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets72 = multiplePiePlot56.getInsets();
        org.jfree.chart.util.TableOrder tableOrder73 = multiplePiePlot56.getDataExtractOrder();
        multiplePiePlot46.setDataExtractOrder(tableOrder73);
        multiplePiePlot1.setDataExtractOrder(tableOrder73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot56", multiplePiePlot16.equals(multiplePiePlot56) ? multiplePiePlot16.hashCode() == multiplePiePlot56.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot36.setDrawingSupplier(drawingSupplier39);
        float float41 = multiplePiePlot36.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        float float44 = multiplePiePlot43.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent45);
        java.lang.Class<?> wildcardClass47 = multiplePiePlot43.getClass();
        boolean boolean48 = multiplePiePlot36.equals((java.lang.Object) wildcardClass47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        multiplePiePlot50.markerChanged(markerChangeEvent52);
        java.awt.Stroke stroke54 = null;
        multiplePiePlot50.setOutlineStroke(stroke54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = multiplePiePlot50.getDataset();
        java.awt.Font font57 = multiplePiePlot50.getNoDataMessageFont();
        multiplePiePlot36.setNoDataMessageFont(font57);
        java.awt.Paint paint59 = multiplePiePlot36.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and multiplePiePlot50", obj12.equals(multiplePiePlot50) ? obj12.hashCode() == multiplePiePlot50.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot9.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.awt.Font font17 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier12);
        float float14 = multiplePiePlot9.getForegroundAlpha();
        multiplePiePlot9.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot18.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot18.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot24.setOutlineStroke(stroke25);
        java.lang.Comparable comparable27 = multiplePiePlot24.getAggregatedItemsKey();
        java.awt.Font font28 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font28);
        java.awt.Stroke stroke30 = multiplePiePlot18.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setNoDataMessage("hi!");
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str37 = multiplePiePlot32.getNoDataMessage();
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot32.setAggregatedItemsPaint(paint38);
        multiplePiePlot18.setNoDataMessagePaint(paint38);
        multiplePiePlot9.setNoDataMessagePaint(paint38);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = null;
        multiplePiePlot43.setDrawingSupplier(drawingSupplier46);
        java.awt.Stroke stroke48 = null;
        multiplePiePlot43.setOutlineStroke(stroke48);
        org.jfree.data.general.DatasetGroup datasetGroup50 = multiplePiePlot43.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart51 = multiplePiePlot43.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setNoDataMessage("hi!");
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener19);
        java.lang.Comparable comparable21 = multiplePiePlot12.getAggregatedItemsKey();
        multiplePiePlot12.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot12.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        boolean boolean30 = multiplePiePlot26.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot26.getParent();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot26.setOutlineStroke(stroke32);
        multiplePiePlot12.setOutlineStroke(stroke32);
        multiplePiePlot1.setOutlineStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getForegroundAlpha();
        multiplePiePlot13.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener27);
        multiplePiePlot22.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot22.getOutlinePaint();
        java.lang.Object obj34 = multiplePiePlot22.clone();
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot22.setAggregatedItemsPaint(paint35);
        multiplePiePlot13.setNoDataMessagePaint(paint35);
        multiplePiePlot1.setAggregatedItemsPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot12.setOutlineStroke(stroke13);
        java.lang.Comparable comparable15 = multiplePiePlot12.getAggregatedItemsKey();
        int int16 = multiplePiePlot12.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str23 = multiplePiePlot18.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets27, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier25);
        float float27 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot22.getLegendItems();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot22.getRootPlot();
        java.lang.String str30 = multiplePiePlot22.getNoDataMessage();
        java.awt.Paint paint31 = multiplePiePlot22.getAggregatedItemsPaint();
        multiplePiePlot22.zoom((double) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot35.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot35.getDatasetGroup();
        java.lang.String str40 = multiplePiePlot35.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot35.getDrawingSupplier();
        multiplePiePlot22.setDrawingSupplier(drawingSupplier41);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot22", multiplePiePlot6.equals(multiplePiePlot22) ? multiplePiePlot6.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier15);
        float float17 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot12.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        boolean boolean27 = multiplePiePlot12.equals((java.lang.Object) multiplePiePlot22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot29.setOutlineStroke(stroke33);
        float float35 = multiplePiePlot29.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot29.getPieChart();
        multiplePiePlot22.setPieChart(jFreeChart36);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart36);
        multiplePiePlot1.setLimit((double) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setNoDataMessage("hi!");
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str47 = multiplePiePlot42.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset48 = multiplePiePlot42.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        java.awt.Stroke stroke51 = null;
        multiplePiePlot50.setOutlineStroke(stroke51);
        java.awt.Font font53 = multiplePiePlot50.getNoDataMessageFont();
        multiplePiePlot42.setNoDataMessageFont(font53);
        multiplePiePlot1.setNoDataMessageFont(font53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot29 and multiplePiePlot50", multiplePiePlot29.equals(multiplePiePlot50) ? multiplePiePlot29.hashCode() == multiplePiePlot50.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        multiplePiePlot11.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot11.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot11.setDataset(categoryDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot11.setDataset(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        int int32 = multiplePiePlot31.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        float float35 = multiplePiePlot34.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot34.setOutlineStroke(stroke38);
        float float40 = multiplePiePlot34.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot34.getPieChart();
        multiplePiePlot31.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        multiplePiePlot1.setPieChart(jFreeChart41);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        float float47 = multiplePiePlot46.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent48);
        java.awt.Stroke stroke50 = null;
        multiplePiePlot46.setOutlineStroke(stroke50);
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        boolean boolean54 = multiplePiePlot46.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        float float59 = multiplePiePlot58.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent60 = null;
        multiplePiePlot58.notifyListeners(plotChangeEvent60);
        java.awt.Paint paint62 = multiplePiePlot58.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset63);
        java.awt.Stroke stroke65 = null;
        multiplePiePlot64.setOutlineStroke(stroke65);
        java.awt.Font font67 = multiplePiePlot64.getNoDataMessageFont();
        multiplePiePlot58.setNoDataMessageFont(font67);
        multiplePiePlot46.setNoDataMessageFont(font67);
        java.awt.Paint paint70 = multiplePiePlot46.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot31 and multiplePiePlot58", multiplePiePlot31.equals(multiplePiePlot58) ? multiplePiePlot31.hashCode() == multiplePiePlot58.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        multiplePiePlot11.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot11.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo22);
        java.awt.Paint paint24 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot26.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot26.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot32.setOutlineStroke(stroke33);
        java.lang.Comparable comparable35 = multiplePiePlot32.getAggregatedItemsKey();
        java.awt.Font font36 = multiplePiePlot32.getNoDataMessageFont();
        multiplePiePlot26.setNoDataMessageFont(font36);
        multiplePiePlot11.setNoDataMessageFont(font36);
        multiplePiePlot1.setNoDataMessageFont(font36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        java.awt.Image image23 = null;
        multiplePiePlot1.setBackgroundImage(image23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot26.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot26.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot32.setOutlineStroke(stroke33);
        java.lang.Comparable comparable35 = multiplePiePlot32.getAggregatedItemsKey();
        java.awt.Font font36 = multiplePiePlot32.getNoDataMessageFont();
        multiplePiePlot26.setNoDataMessageFont(font36);
        multiplePiePlot26.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        multiplePiePlot41.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo44);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent46 = null;
        multiplePiePlot41.datasetChanged(datasetChangeEvent46);
        multiplePiePlot41.setBackgroundAlpha((float) 1L);
        multiplePiePlot41.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = multiplePiePlot41.getInsets();
        multiplePiePlot26.setInsets(rectangleInsets52);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot32", multiplePiePlot11.equals(multiplePiePlot32) ? multiplePiePlot11.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener35);
        multiplePiePlot30.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot30.notifyListeners(plotChangeEvent39);
        java.lang.String str41 = multiplePiePlot30.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        float float44 = multiplePiePlot43.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        multiplePiePlot43.markerChanged(markerChangeEvent45);
        java.awt.Stroke stroke47 = null;
        multiplePiePlot43.setOutlineStroke(stroke47);
        float float49 = multiplePiePlot43.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot43.getPieChart();
        multiplePiePlot30.setPieChart(jFreeChart50);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot43", multiplePiePlot19.equals(multiplePiePlot43) ? multiplePiePlot19.hashCode() == multiplePiePlot43.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        java.lang.Class<?> wildcardClass10 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection9", legendItemCollection7.equals(legendItemCollection9) ? legendItemCollection7.hashCode() == legendItemCollection9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        java.awt.Stroke stroke18 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, (int) (byte) 100, plotRenderingInfo23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Stroke stroke27 = null;
        multiplePiePlot26.setOutlineStroke(stroke27);
        java.lang.Comparable comparable29 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot26.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot26.setInsets(rectangleInsets31, false);
        multiplePiePlot1.setInsets(rectangleInsets31, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        multiplePiePlot11.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot11.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot11.setDataset(categoryDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot11.setDataset(categoryDataset26);
        java.awt.Stroke stroke28 = multiplePiePlot11.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        multiplePiePlot11.datasetChanged(datasetChangeEvent29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier35);
        float float37 = multiplePiePlot32.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection38 = multiplePiePlot32.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = multiplePiePlot42.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot42.notifyListeners(plotChangeEvent44);
        org.jfree.data.general.DatasetGroup datasetGroup46 = multiplePiePlot42.getDatasetGroup();
        boolean boolean47 = multiplePiePlot32.equals((java.lang.Object) multiplePiePlot42);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        float float50 = multiplePiePlot49.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent51 = null;
        multiplePiePlot49.markerChanged(markerChangeEvent51);
        java.awt.Stroke stroke53 = null;
        multiplePiePlot49.setOutlineStroke(stroke53);
        float float55 = multiplePiePlot49.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart56 = multiplePiePlot49.getPieChart();
        multiplePiePlot42.setPieChart(jFreeChart56);
        multiplePiePlot11.setPieChart(jFreeChart56);
        multiplePiePlot7.setPieChart(jFreeChart56);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot42", multiplePiePlot1.equals(multiplePiePlot42) ? multiplePiePlot1.hashCode() == multiplePiePlot42.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.Object obj12 = multiplePiePlot1.clone();
        multiplePiePlot1.zoom((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot15.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint22);
        multiplePiePlot10.setOutlinePaint(paint22);
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier30);
        java.awt.Image image32 = multiplePiePlot27.getBackgroundImage();
        boolean boolean33 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot27);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setNoDataMessage("hi!");
        multiplePiePlot35.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener40);
        multiplePiePlot35.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent44);
        java.lang.String str46 = multiplePiePlot35.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        java.awt.Stroke stroke49 = null;
        multiplePiePlot48.setOutlineStroke(stroke49);
        java.lang.Comparable comparable51 = multiplePiePlot48.getAggregatedItemsKey();
        int int52 = multiplePiePlot48.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        multiplePiePlot54.setNoDataMessage("hi!");
        multiplePiePlot54.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str59 = multiplePiePlot54.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset60 = multiplePiePlot54.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup61 = multiplePiePlot54.getDatasetGroup();
        multiplePiePlot48.setParent((org.jfree.chart.plot.Plot) multiplePiePlot54);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = multiplePiePlot48.getInsets();
        multiplePiePlot35.setInsets(rectangleInsets63, false);
        multiplePiePlot1.setInsets(rectangleInsets63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot54", multiplePiePlot1.equals(multiplePiePlot54) ? multiplePiePlot1.hashCode() == multiplePiePlot54.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        java.awt.Stroke stroke56 = null;
        multiplePiePlot55.setOutlineStroke(stroke56);
        java.awt.Font font58 = multiplePiePlot55.getNoDataMessageFont();
        multiplePiePlot55.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable61 = multiplePiePlot55.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot63 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset62);
        multiplePiePlot63.setNoDataMessage("hi!");
        multiplePiePlot63.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener68 = null;
        multiplePiePlot63.addChangeListener(plotChangeListener68);
        multiplePiePlot63.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo74 = null;
        multiplePiePlot63.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo74);
        org.jfree.data.category.CategoryDataset categoryDataset76 = null;
        multiplePiePlot63.setDataset(categoryDataset76);
        org.jfree.data.category.CategoryDataset categoryDataset78 = null;
        multiplePiePlot63.setDataset(categoryDataset78);
        java.awt.Stroke stroke80 = multiplePiePlot63.getOutlineStroke();
        multiplePiePlot55.setOutlineStroke(stroke80);
        org.jfree.chart.util.TableOrder tableOrder82 = multiplePiePlot55.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot63", multiplePiePlot5.equals(multiplePiePlot63) ? multiplePiePlot5.hashCode() == multiplePiePlot63.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        java.lang.Object obj31 = multiplePiePlot1.clone();
        java.awt.Paint paint32 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj31", multiplePiePlot1.equals(obj31) ? multiplePiePlot1.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot12.setOutlineStroke(stroke13);
        java.lang.Comparable comparable15 = multiplePiePlot12.getAggregatedItemsKey();
        java.lang.Object obj16 = multiplePiePlot12.clone();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setBackgroundPaint(paint27);
        multiplePiePlot12.setOutlinePaint(paint27);
        java.awt.Paint paint30 = multiplePiePlot12.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Stroke stroke13 = null;
        multiplePiePlot12.setOutlineStroke(stroke13);
        java.lang.Comparable comparable15 = multiplePiePlot12.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot12.getInsets();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot12.getRootPlot();
        java.awt.Font font18 = plot17.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot20.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot30.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = multiplePiePlot30.getDatasetGroup();
        boolean boolean35 = multiplePiePlot20.equals((java.lang.Object) multiplePiePlot30);
        java.awt.Paint paint36 = multiplePiePlot20.getBackgroundPaint();
        plot17.setNoDataMessagePaint(paint36);
        multiplePiePlot1.setBackgroundPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot30", multiplePiePlot1.equals(multiplePiePlot30) ? multiplePiePlot1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        java.awt.Stroke stroke27 = null;
        multiplePiePlot22.setOutlineStroke(stroke27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot22.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot22", multiplePiePlot11.equals(multiplePiePlot22) ? multiplePiePlot11.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        float float24 = multiplePiePlot18.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        multiplePiePlot11.setPieChart(jFreeChart25);
        float float27 = multiplePiePlot11.getBackgroundImageAlpha();
        java.lang.Object obj28 = multiplePiePlot11.clone();
        boolean boolean29 = multiplePiePlot11.isSubplot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj28", multiplePiePlot11.equals(obj28) ? multiplePiePlot11.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets15, false);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str24 = multiplePiePlot19.getNoDataMessage();
        java.lang.String str25 = multiplePiePlot19.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        float float28 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent29);
        java.awt.Stroke stroke31 = multiplePiePlot27.getOutlineStroke();
        multiplePiePlot19.setOutlineStroke(stroke31);
        multiplePiePlot1.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot27", multiplePiePlot10.equals(multiplePiePlot27) ? multiplePiePlot10.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        float float25 = multiplePiePlot17.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        float float28 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot1.getPieChart();
        java.lang.Comparable comparable30 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart26 and jFreeChart29", jFreeChart26.equals(jFreeChart29) ? jFreeChart26.hashCode() == jFreeChart29.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        java.lang.Object obj24 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str31 = multiplePiePlot26.getNoDataMessage();
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot26.setAggregatedItemsPaint(paint32);
        boolean boolean34 = multiplePiePlot26.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        boolean boolean40 = multiplePiePlot36.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot36.getParent();
        java.awt.Stroke stroke42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot36.setOutlineStroke(stroke42);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent44 = null;
        multiplePiePlot36.datasetChanged(datasetChangeEvent44);
        boolean boolean46 = multiplePiePlot26.equals((java.lang.Object) multiplePiePlot36);
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot36.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj24", multiplePiePlot1.equals(obj24) ? multiplePiePlot1.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setNoDataMessage("hi!");
        boolean boolean10 = multiplePiePlot6.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot6.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot6", multiplePiePlot1.equals(multiplePiePlot6) ? multiplePiePlot1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float14 = multiplePiePlot9.getBackgroundImageAlpha();
        java.awt.Font font15 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setNoDataMessage("hi!");
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str24 = multiplePiePlot19.getNoDataMessage();
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setAggregatedItemsPaint(paint25);
        multiplePiePlot1.setNoDataMessagePaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot19", multiplePiePlot9.equals(multiplePiePlot19) ? multiplePiePlot9.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot19.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot19.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Stroke stroke26 = null;
        multiplePiePlot25.setOutlineStroke(stroke26);
        java.lang.Comparable comparable28 = multiplePiePlot25.getAggregatedItemsKey();
        java.awt.Font font29 = multiplePiePlot25.getNoDataMessageFont();
        multiplePiePlot19.setNoDataMessageFont(font29);
        java.awt.Stroke stroke31 = multiplePiePlot19.getOutlineStroke();
        multiplePiePlot8.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier19);
        float float21 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot16.getLegendItems();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot16.getRootPlot();
        java.lang.String str24 = multiplePiePlot16.getNoDataMessage();
        java.awt.Paint paint25 = multiplePiePlot16.getAggregatedItemsPaint();
        java.awt.Paint paint26 = multiplePiePlot16.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection22", legendItemCollection7.equals(legendItemCollection22) ? legendItemCollection7.hashCode() == legendItemCollection22.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        java.awt.Paint paint44 = multiplePiePlot29.getOutlinePaint();
        java.awt.Paint paint45 = multiplePiePlot29.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = multiplePiePlot47.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        multiplePiePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.data.general.DatasetGroup datasetGroup51 = multiplePiePlot47.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        java.awt.Stroke stroke54 = null;
        multiplePiePlot53.setOutlineStroke(stroke54);
        java.lang.Comparable comparable56 = multiplePiePlot53.getAggregatedItemsKey();
        java.awt.Font font57 = multiplePiePlot53.getNoDataMessageFont();
        multiplePiePlot47.setNoDataMessageFont(font57);
        multiplePiePlot47.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = null;
        multiplePiePlot62.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo65);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent67 = null;
        multiplePiePlot62.datasetChanged(datasetChangeEvent67);
        multiplePiePlot62.setBackgroundAlpha((float) 1L);
        multiplePiePlot62.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = multiplePiePlot62.getInsets();
        multiplePiePlot47.setInsets(rectangleInsets73);
        multiplePiePlot29.setInsets(rectangleInsets73, true);
        multiplePiePlot1.setInsets(rectangleInsets73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot53", multiplePiePlot19.equals(multiplePiePlot53) ? multiplePiePlot19.hashCode() == multiplePiePlot53.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        float float6 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent7);
        java.awt.Stroke stroke9 = null;
        multiplePiePlot5.setOutlineStroke(stroke9);
        multiplePiePlot5.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint13 = multiplePiePlot5.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot5.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot16.setDataset(categoryDataset18);
        boolean boolean21 = multiplePiePlot16.equals((java.lang.Object) '#');
        java.lang.String str22 = multiplePiePlot16.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier27);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot24.setOutlineStroke(stroke29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot32.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot32.getDatasetGroup();
        java.awt.Stroke stroke37 = null;
        multiplePiePlot32.setOutlineStroke(stroke37);
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot32.getPieChart();
        multiplePiePlot24.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        multiplePiePlot5.setPieChart(jFreeChart39);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        multiplePiePlot9.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot9.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot9.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot9.setDataset(categoryDataset24);
        java.awt.Stroke stroke26 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot29.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = multiplePiePlot29.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.awt.Stroke stroke36 = null;
        multiplePiePlot35.setOutlineStroke(stroke36);
        java.lang.Comparable comparable38 = multiplePiePlot35.getAggregatedItemsKey();
        java.awt.Font font39 = multiplePiePlot35.getNoDataMessageFont();
        multiplePiePlot29.setNoDataMessageFont(font39);
        java.awt.Stroke stroke41 = multiplePiePlot29.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setNoDataMessage("hi!");
        multiplePiePlot43.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot43.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Font font50 = multiplePiePlot43.getNoDataMessageFont();
        multiplePiePlot29.setNoDataMessageFont(font50);
        multiplePiePlot1.setNoDataMessageFont(font50);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        multiplePiePlot54.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo57);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent59 = null;
        multiplePiePlot54.datasetChanged(datasetChangeEvent59);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        multiplePiePlot62.setNoDataMessage("hi!");
        multiplePiePlot62.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float67 = multiplePiePlot62.getBackgroundImageAlpha();
        java.awt.Font font68 = multiplePiePlot62.getNoDataMessageFont();
        multiplePiePlot54.setNoDataMessageFont(font68);
        multiplePiePlot1.setNoDataMessageFont(font68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot29 and multiplePiePlot54", multiplePiePlot29.equals(multiplePiePlot54) ? multiplePiePlot29.hashCode() == multiplePiePlot54.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier12);
        java.awt.Stroke stroke14 = null;
        multiplePiePlot9.setOutlineStroke(stroke14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot17.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot17.getDatasetGroup();
        java.awt.Stroke stroke22 = null;
        multiplePiePlot17.setOutlineStroke(stroke22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot17.getPieChart();
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        java.lang.Comparable comparable27 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot29.setDataset(categoryDataset31);
        java.awt.Paint paint33 = multiplePiePlot29.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        multiplePiePlot29.axisChanged(axisChangeEvent34);
        java.awt.Font font36 = multiplePiePlot29.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot29", multiplePiePlot1.equals(multiplePiePlot29) ? multiplePiePlot1.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        multiplePiePlot5.setNoDataMessage("hi!");
        multiplePiePlot5.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str10 = multiplePiePlot5.getNoDataMessage();
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot5.setAggregatedItemsPaint(paint11);
        multiplePiePlot5.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot5.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot5.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot5.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot19.getDataset();
        int int21 = multiplePiePlot19.getBackgroundImageAlignment();
        java.awt.Image image22 = multiplePiePlot19.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot19.getDataset();
        boolean boolean24 = multiplePiePlot5.equals((java.lang.Object) categoryDataset23);
        boolean boolean25 = multiplePiePlot1.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot19", multiplePiePlot1.equals(multiplePiePlot19) ? multiplePiePlot1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot11.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setAggregatedItemsPaint(paint18);
        multiplePiePlot1.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot22.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo25);
        multiplePiePlot22.zoom((double) (byte) -1);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot22.getParent();
        java.lang.Comparable comparable30 = multiplePiePlot22.getAggregatedItemsKey();
        multiplePiePlot22.zoom(0.0d);
        java.awt.Image image33 = multiplePiePlot22.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setNoDataMessage("hi!");
        multiplePiePlot35.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener40);
        multiplePiePlot35.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        multiplePiePlot35.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        multiplePiePlot35.setDataset(categoryDataset48);
        java.awt.Paint paint50 = multiplePiePlot35.getOutlinePaint();
        org.jfree.chart.plot.Plot plot51 = multiplePiePlot35.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        multiplePiePlot53.setNoDataMessage("hi!");
        multiplePiePlot53.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener58 = null;
        multiplePiePlot53.addChangeListener(plotChangeListener58);
        java.awt.Paint paint60 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot53.setBackgroundPaint(paint60);
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot63 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset62);
        multiplePiePlot63.setNoDataMessage("hi!");
        multiplePiePlot63.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener68 = null;
        multiplePiePlot63.addChangeListener(plotChangeListener68);
        java.awt.Paint paint70 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot63.setBackgroundPaint(paint70);
        multiplePiePlot53.setOutlinePaint(paint70);
        multiplePiePlot35.setOutlinePaint(paint70);
        multiplePiePlot22.setBackgroundPaint(paint70);
        org.jfree.data.category.CategoryDataset categoryDataset75 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot76 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset75);
        multiplePiePlot76.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier79 = null;
        multiplePiePlot76.setDrawingSupplier(drawingSupplier79);
        float float81 = multiplePiePlot76.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot82 = multiplePiePlot76.getParent();
        java.awt.Paint paint83 = multiplePiePlot76.getOutlinePaint();
        double double84 = multiplePiePlot76.getLimit();
        java.awt.Paint paint85 = multiplePiePlot76.getBackgroundPaint();
        multiplePiePlot22.setBackgroundPaint(paint85);
        multiplePiePlot1.setNoDataMessagePaint(paint85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot22", multiplePiePlot11.equals(multiplePiePlot22) ? multiplePiePlot11.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier12);
        java.awt.Stroke stroke14 = null;
        multiplePiePlot9.setOutlineStroke(stroke14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot17.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot17.getDatasetGroup();
        java.awt.Stroke stroke22 = null;
        multiplePiePlot17.setOutlineStroke(stroke22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot17.getPieChart();
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        multiplePiePlot28.setNoDataMessage("hi!");
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener33);
        multiplePiePlot28.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        multiplePiePlot28.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo39);
        multiplePiePlot28.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = null;
        multiplePiePlot44.setDrawingSupplier(drawingSupplier47);
        float float49 = multiplePiePlot44.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection50 = multiplePiePlot44.getLegendItems();
        org.jfree.chart.plot.Plot plot51 = multiplePiePlot44.getRootPlot();
        float float52 = multiplePiePlot44.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart53 = multiplePiePlot44.getPieChart();
        multiplePiePlot28.setParent((org.jfree.chart.plot.Plot) multiplePiePlot44);
        float float55 = multiplePiePlot28.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart56 = multiplePiePlot28.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart24 and jFreeChart53", jFreeChart24.equals(jFreeChart53) ? jFreeChart24.hashCode() == jFreeChart53.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot5.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot5.datasetChanged(datasetChangeEvent10);
        float float12 = multiplePiePlot5.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot5.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier13);
        java.awt.Image image15 = null;
        multiplePiePlot0.setBackgroundImage(image15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        multiplePiePlot18.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot18.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot18", multiplePiePlot5.equals(multiplePiePlot18) ? multiplePiePlot5.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.zoom(0.0d);
        java.awt.Image image12 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener19);
        multiplePiePlot14.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot14.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot14.setDataset(categoryDataset27);
        java.awt.Paint paint29 = multiplePiePlot14.getOutlinePaint();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot14.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setNoDataMessage("hi!");
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener37);
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot32.setBackgroundPaint(paint39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setNoDataMessage("hi!");
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot42.addChangeListener(plotChangeListener47);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot42.setBackgroundPaint(paint49);
        multiplePiePlot32.setOutlinePaint(paint49);
        multiplePiePlot14.setOutlinePaint(paint49);
        multiplePiePlot1.setBackgroundPaint(paint49);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        multiplePiePlot55.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier58 = null;
        multiplePiePlot55.setDrawingSupplier(drawingSupplier58);
        float float60 = multiplePiePlot55.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot61 = multiplePiePlot55.getParent();
        java.awt.Paint paint62 = multiplePiePlot55.getOutlinePaint();
        double double63 = multiplePiePlot55.getLimit();
        java.awt.Paint paint64 = multiplePiePlot55.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint64);
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot67 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset66);
        multiplePiePlot67.setNoDataMessage("hi!");
        multiplePiePlot67.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener72 = null;
        multiplePiePlot67.addChangeListener(plotChangeListener72);
        org.jfree.chart.event.PlotChangeListener plotChangeListener74 = null;
        multiplePiePlot67.addChangeListener(plotChangeListener74);
        java.lang.Comparable comparable76 = multiplePiePlot67.getAggregatedItemsKey();
        multiplePiePlot67.zoom((double) (-1L));
        java.awt.Font font79 = multiplePiePlot67.getNoDataMessageFont();
        java.awt.Paint paint80 = multiplePiePlot67.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot42 and multiplePiePlot67", multiplePiePlot42.equals(multiplePiePlot67) ? multiplePiePlot42.hashCode() == multiplePiePlot67.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        float float38 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot37.markerChanged(markerChangeEvent39);
        java.awt.Stroke stroke41 = null;
        multiplePiePlot37.setOutlineStroke(stroke41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = multiplePiePlot37.getDataset();
        java.awt.Font font44 = multiplePiePlot37.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot37", multiplePiePlot19.equals(multiplePiePlot37) ? multiplePiePlot19.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier24);
        float float26 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection27 = multiplePiePlot21.getLegendItems();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot21.getRootPlot();
        float float29 = multiplePiePlot21.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot21.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart19 and jFreeChart30", jFreeChart19.equals(jFreeChart30) ? jFreeChart19.hashCode() == jFreeChart30.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot11.setOutlineStroke(stroke12);
        java.lang.Comparable comparable14 = multiplePiePlot11.getAggregatedItemsKey();
        int int15 = multiplePiePlot11.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str22 = multiplePiePlot17.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot17.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup24 = multiplePiePlot17.getDatasetGroup();
        multiplePiePlot11.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot11.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot11.getInsets();
        org.jfree.chart.util.TableOrder tableOrder28 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder28);
        float float30 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image35 = multiplePiePlot32.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot37.setOutlineStroke(stroke38);
        java.lang.Comparable comparable40 = multiplePiePlot37.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = multiplePiePlot37.getInsets();
        multiplePiePlot32.setInsets(rectangleInsets41, true);
        multiplePiePlot1.setInsets(rectangleInsets41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot37", multiplePiePlot11.equals(multiplePiePlot37) ? multiplePiePlot11.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        multiplePiePlot41.setNoDataMessage("hi!");
        boolean boolean45 = multiplePiePlot41.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection46 = multiplePiePlot41.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        multiplePiePlot48.setNoDataMessage("hi!");
        multiplePiePlot48.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener53 = null;
        multiplePiePlot48.addChangeListener(plotChangeListener53);
        java.awt.Paint paint55 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot48.setBackgroundPaint(paint55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        multiplePiePlot58.setNoDataMessage("hi!");
        multiplePiePlot58.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener63 = null;
        multiplePiePlot58.addChangeListener(plotChangeListener63);
        java.awt.Paint paint65 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot58.setBackgroundPaint(paint65);
        multiplePiePlot48.setOutlinePaint(paint65);
        org.jfree.chart.util.TableOrder tableOrder68 = multiplePiePlot48.getDataExtractOrder();
        java.awt.Image image69 = null;
        multiplePiePlot48.setBackgroundImage(image69);
        int int71 = multiplePiePlot48.getBackgroundImageAlignment();
        java.awt.Font font72 = multiplePiePlot48.getNoDataMessageFont();
        multiplePiePlot41.setNoDataMessageFont(font72);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent74 = null;
        multiplePiePlot41.datasetChanged(datasetChangeEvent74);
        org.jfree.chart.JFreeChart jFreeChart76 = multiplePiePlot41.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot48", multiplePiePlot19.equals(multiplePiePlot48) ? multiplePiePlot19.hashCode() == multiplePiePlot48.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot13.setBackgroundPaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setBackgroundPaint(paint30);
        multiplePiePlot13.setOutlinePaint(paint30);
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot13.getDataExtractOrder();
        java.awt.Image image34 = null;
        multiplePiePlot13.setBackgroundImage(image34);
        int int36 = multiplePiePlot13.getBackgroundImageAlignment();
        java.awt.Font font37 = multiplePiePlot13.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        multiplePiePlot39.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo42);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        multiplePiePlot39.addChangeListener(plotChangeListener44);
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot39.setAggregatedItemsPaint(paint46);
        org.jfree.chart.util.TableOrder tableOrder48 = multiplePiePlot39.getDataExtractOrder();
        multiplePiePlot13.setDataExtractOrder(tableOrder48);
        boolean boolean50 = multiplePiePlot1.equals((java.lang.Object) tableOrder48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot23", multiplePiePlot1.equals(multiplePiePlot23) ? multiplePiePlot1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot10.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot10.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot10.datasetChanged(datasetChangeEvent16);
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
        java.awt.Stroke stroke33 = null;
        multiplePiePlot32.setOutlineStroke(stroke33);
        java.lang.Comparable comparable35 = multiplePiePlot32.getAggregatedItemsKey();
        int int36 = multiplePiePlot32.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str43 = multiplePiePlot38.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset44 = multiplePiePlot38.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup45 = multiplePiePlot38.getDatasetGroup();
        multiplePiePlot32.setParent((org.jfree.chart.plot.Plot) multiplePiePlot38);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = multiplePiePlot32.getInsets();
        multiplePiePlot19.setInsets(rectangleInsets47, false);
        multiplePiePlot19.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = multiplePiePlot19.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets52, true);
        multiplePiePlot1.setInsets(rectangleInsets52, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot38", multiplePiePlot1.equals(multiplePiePlot38) ? multiplePiePlot1.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setNoDataMessage("hi!");
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        multiplePiePlot44.addChangeListener(plotChangeListener49);
        multiplePiePlot44.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        multiplePiePlot44.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        multiplePiePlot44.setDataset(categoryDataset57);
        java.awt.Paint paint59 = multiplePiePlot44.getOutlinePaint();
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        multiplePiePlot44.setLimit((double) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset64 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot65 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset64);
        multiplePiePlot65.setNoDataMessage("hi!");
        multiplePiePlot65.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot71 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset70);
        multiplePiePlot71.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier74 = null;
        multiplePiePlot71.setDrawingSupplier(drawingSupplier74);
        float float76 = multiplePiePlot71.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection77 = multiplePiePlot71.getLegendItems();
        org.jfree.chart.plot.Plot plot78 = multiplePiePlot71.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset79 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot80 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset79);
        java.awt.Stroke stroke81 = null;
        multiplePiePlot80.setOutlineStroke(stroke81);
        java.lang.Comparable comparable83 = multiplePiePlot80.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets84 = multiplePiePlot80.getInsets();
        plot78.setInsets(rectangleInsets84, false);
        multiplePiePlot65.setInsets(rectangleInsets84, false);
        multiplePiePlot44.setInsets(rectangleInsets84, true);
        multiplePiePlot1.setInsets(rectangleInsets84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot65", multiplePiePlot11.equals(multiplePiePlot65) ? multiplePiePlot11.hashCode() == multiplePiePlot65.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        java.awt.Paint paint12 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        int int15 = multiplePiePlot14.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Stroke stroke21 = null;
        multiplePiePlot17.setOutlineStroke(stroke21);
        float float23 = multiplePiePlot17.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot17.getPieChart();
        multiplePiePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.awt.Stroke stroke28 = multiplePiePlot14.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot17", multiplePiePlot7.equals(multiplePiePlot17) ? multiplePiePlot7.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        boolean boolean22 = multiplePiePlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier27);
        float float29 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        float float32 = multiplePiePlot31.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        java.lang.Class<?> wildcardClass35 = multiplePiePlot31.getClass();
        boolean boolean36 = multiplePiePlot24.equals((java.lang.Object) wildcardClass35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        float float39 = multiplePiePlot38.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        multiplePiePlot38.markerChanged(markerChangeEvent40);
        java.awt.Stroke stroke42 = null;
        multiplePiePlot38.setOutlineStroke(stroke42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = multiplePiePlot38.getDataset();
        java.awt.Font font45 = multiplePiePlot38.getNoDataMessageFont();
        multiplePiePlot24.setNoDataMessageFont(font45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = multiplePiePlot24.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        multiplePiePlot49.setNoDataMessage("hi!");
        multiplePiePlot49.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener54 = null;
        multiplePiePlot49.addChangeListener(plotChangeListener54);
        org.jfree.chart.event.PlotChangeListener plotChangeListener56 = null;
        multiplePiePlot49.addChangeListener(plotChangeListener56);
        java.lang.Comparable comparable58 = multiplePiePlot49.getAggregatedItemsKey();
        multiplePiePlot49.zoom((double) (-1L));
        java.awt.Font font61 = multiplePiePlot49.getNoDataMessageFont();
        multiplePiePlot24.setNoDataMessageFont(font61);
        multiplePiePlot0.setNoDataMessageFont(font61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot38", multiplePiePlot4.equals(multiplePiePlot38) ? multiplePiePlot4.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image15 = multiplePiePlot12.getBackgroundImage();
        float float16 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint17 = multiplePiePlot12.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent18);
        boolean boolean20 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot12);
        java.lang.Comparable comparable21 = multiplePiePlot12.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str28 = multiplePiePlot23.getNoDataMessage();
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setAggregatedItemsPaint(paint29);
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Image image33 = null;
        multiplePiePlot23.setBackgroundImage(image33);
        boolean boolean35 = multiplePiePlot12.equals((java.lang.Object) multiplePiePlot23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot23", multiplePiePlot1.equals(multiplePiePlot23) ? multiplePiePlot1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint24 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        multiplePiePlot26.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent35);
        java.lang.String str37 = multiplePiePlot26.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot39.setOutlineStroke(stroke40);
        java.lang.Comparable comparable42 = multiplePiePlot39.getAggregatedItemsKey();
        int int43 = multiplePiePlot39.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        multiplePiePlot45.setNoDataMessage("hi!");
        multiplePiePlot45.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str50 = multiplePiePlot45.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset51 = multiplePiePlot45.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup52 = multiplePiePlot45.getDatasetGroup();
        multiplePiePlot39.setParent((org.jfree.chart.plot.Plot) multiplePiePlot45);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = multiplePiePlot39.getInsets();
        multiplePiePlot26.setInsets(rectangleInsets54, false);
        multiplePiePlot26.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = multiplePiePlot26.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets59, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        float float25 = multiplePiePlot17.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        float float28 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup29 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        multiplePiePlot31.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo34);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent36 = null;
        multiplePiePlot31.datasetChanged(datasetChangeEvent36);
        multiplePiePlot31.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection40 = multiplePiePlot31.getLegendItems();
        java.awt.Paint paint41 = multiplePiePlot31.getNoDataMessagePaint();
        double double42 = multiplePiePlot31.getLimit();
        java.awt.Paint paint43 = multiplePiePlot31.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection23 and legendItemCollection40", legendItemCollection23.equals(legendItemCollection40) ? legendItemCollection23.hashCode() == legendItemCollection40.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        multiplePiePlot11.setBackgroundAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot32.setOutlineStroke(stroke33);
        java.lang.Comparable comparable35 = multiplePiePlot32.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = multiplePiePlot32.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot32.setInsets(rectangleInsets37, false);
        multiplePiePlot11.setInsets(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot32", multiplePiePlot18.equals(multiplePiePlot32) ? multiplePiePlot18.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot6.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot13.setBackgroundPaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setBackgroundPaint(paint30);
        multiplePiePlot13.setOutlinePaint(paint30);
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot13.getDataExtractOrder();
        float float34 = multiplePiePlot13.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        multiplePiePlot36.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        multiplePiePlot36.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        multiplePiePlot36.setDataset(categoryDataset49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        multiplePiePlot36.setDataset(categoryDataset51);
        java.awt.Stroke stroke53 = multiplePiePlot36.getOutlineStroke();
        multiplePiePlot13.setOutlineStroke(stroke53);
        multiplePiePlot6.setOutlineStroke(stroke53);
        multiplePiePlot1.setOutlineStroke(stroke53);
        multiplePiePlot1.setOutlineVisible(true);
        float float59 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection60 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        multiplePiePlot62.setNoDataMessage("hi!");
        multiplePiePlot62.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str67 = multiplePiePlot62.getNoDataMessage();
        java.awt.Paint paint68 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot62.setAggregatedItemsPaint(paint68);
        multiplePiePlot62.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset72 = multiplePiePlot62.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset73 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot74 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset73);
        multiplePiePlot74.setNoDataMessage("hi!");
        multiplePiePlot74.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener79 = null;
        multiplePiePlot74.addChangeListener(plotChangeListener79);
        org.jfree.chart.event.PlotChangeListener plotChangeListener81 = null;
        multiplePiePlot74.addChangeListener(plotChangeListener81);
        java.lang.Comparable comparable83 = multiplePiePlot74.getAggregatedItemsKey();
        multiplePiePlot74.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier86 = multiplePiePlot74.getDrawingSupplier();
        multiplePiePlot62.setDrawingSupplier(drawingSupplier86);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection4 and legendItemCollection60", legendItemCollection4.equals(legendItemCollection60) ? legendItemCollection4.hashCode() == legendItemCollection60.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        multiplePiePlot9.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot9.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot9.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot9.setDataset(categoryDataset24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot9.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        float float29 = multiplePiePlot28.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        multiplePiePlot28.notifyListeners(plotChangeEvent30);
        multiplePiePlot28.zoom((double) 0.0f);
        multiplePiePlot28.setLimit((double) (-1));
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot28.setBackgroundPaint(paint36);
        multiplePiePlot9.setNoDataMessagePaint(paint36);
        java.lang.Object obj39 = multiplePiePlot9.clone();
        boolean boolean40 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and obj39", multiplePiePlot9.equals(obj39) ? multiplePiePlot9.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        float float24 = multiplePiePlot18.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        multiplePiePlot11.setPieChart(jFreeChart25);
        float float27 = multiplePiePlot11.getBackgroundImageAlpha();
        java.lang.Object obj28 = multiplePiePlot11.clone();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj28", multiplePiePlot11.equals(obj28) ? multiplePiePlot11.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        java.awt.Paint paint12 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot14.axisChanged(axisChangeEvent17);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        multiplePiePlot14.axisChanged(axisChangeEvent19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        int int23 = multiplePiePlot22.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        float float26 = multiplePiePlot25.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot25.markerChanged(markerChangeEvent27);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot25.setOutlineStroke(stroke29);
        float float31 = multiplePiePlot25.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot25.getPieChart();
        multiplePiePlot22.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart32);
        multiplePiePlot14.setPieChart(jFreeChart32);
        java.awt.Font font35 = multiplePiePlot14.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        float float25 = multiplePiePlot17.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot17.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier33);
        float float35 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection36 = multiplePiePlot30.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = multiplePiePlot40.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent42 = null;
        multiplePiePlot40.notifyListeners(plotChangeEvent42);
        org.jfree.data.general.DatasetGroup datasetGroup44 = multiplePiePlot40.getDatasetGroup();
        boolean boolean45 = multiplePiePlot30.equals((java.lang.Object) multiplePiePlot40);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        float float48 = multiplePiePlot47.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        multiplePiePlot47.markerChanged(markerChangeEvent49);
        java.awt.Stroke stroke51 = null;
        multiplePiePlot47.setOutlineStroke(stroke51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = multiplePiePlot47.getDataset();
        java.awt.Font font54 = multiplePiePlot47.getNoDataMessageFont();
        multiplePiePlot30.setNoDataMessageFont(font54);
        multiplePiePlot30.setNoDataMessage("Multiple Pie Plot");
        java.awt.Stroke stroke58 = multiplePiePlot30.getOutlineStroke();
        org.jfree.chart.plot.Plot plot59 = multiplePiePlot30.getParent();
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection23 and legendItemCollection36", legendItemCollection23.equals(legendItemCollection36) ? legendItemCollection23.hashCode() == legendItemCollection36.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot9.getDataset();
        int int11 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Image image12 = multiplePiePlot9.getBackgroundImage();
        double double13 = multiplePiePlot9.getLimit();
        double double14 = multiplePiePlot9.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setNoDataMessage("hi!");
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot16.setBackgroundPaint(paint23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier29);
        java.awt.Stroke stroke31 = null;
        multiplePiePlot26.setOutlineStroke(stroke31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot34.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        multiplePiePlot34.notifyListeners(plotChangeEvent36);
        org.jfree.data.general.DatasetGroup datasetGroup38 = multiplePiePlot34.getDatasetGroup();
        java.awt.Stroke stroke39 = null;
        multiplePiePlot34.setOutlineStroke(stroke39);
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot34.getPieChart();
        multiplePiePlot26.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        multiplePiePlot16.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot15.setOutlineStroke(stroke19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        java.awt.Font font22 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener33);
        java.lang.Comparable comparable35 = multiplePiePlot26.getAggregatedItemsKey();
        multiplePiePlot26.zoom((double) (-1L));
        java.awt.Font font38 = multiplePiePlot26.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = multiplePiePlot41.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = multiplePiePlot41.getDatasetGroup();
        java.awt.Stroke stroke46 = null;
        multiplePiePlot41.setOutlineStroke(stroke46);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot41.getPieChart();
        boolean boolean49 = multiplePiePlot1.equals((java.lang.Object) jFreeChart48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot41", multiplePiePlot15.equals(multiplePiePlot41) ? multiplePiePlot15.hashCode() == multiplePiePlot41.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot7.getLegendItems();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Stroke stroke17 = null;
        multiplePiePlot16.setOutlineStroke(stroke17);
        java.lang.Comparable comparable19 = multiplePiePlot16.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot16.getInsets();
        plot14.setInsets(rectangleInsets20, false);
        multiplePiePlot1.setInsets(rectangleInsets20, false);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot1.getInsets();
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
        java.awt.Paint paint44 = multiplePiePlot29.getOutlinePaint();
        boolean boolean45 = multiplePiePlot1.equals((java.lang.Object) paint44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        multiplePiePlot47.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo50);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent52 = null;
        multiplePiePlot47.datasetChanged(datasetChangeEvent52);
        float float54 = multiplePiePlot47.getBackgroundImageAlpha();
        float float55 = multiplePiePlot47.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setNoDataMessage("hi!");
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot63 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset62);
        multiplePiePlot63.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier66 = null;
        multiplePiePlot63.setDrawingSupplier(drawingSupplier66);
        float float68 = multiplePiePlot63.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection69 = multiplePiePlot63.getLegendItems();
        org.jfree.chart.plot.Plot plot70 = multiplePiePlot63.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset71 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot72 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset71);
        java.awt.Stroke stroke73 = null;
        multiplePiePlot72.setOutlineStroke(stroke73);
        java.lang.Comparable comparable75 = multiplePiePlot72.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets76 = multiplePiePlot72.getInsets();
        plot70.setInsets(rectangleInsets76, false);
        multiplePiePlot57.setInsets(rectangleInsets76, false);
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets83 = multiplePiePlot57.getInsets();
        multiplePiePlot47.setInsets(rectangleInsets83);
        multiplePiePlot47.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset87 = null;
        multiplePiePlot47.setDataset(categoryDataset87);
        org.jfree.chart.util.RectangleInsets rectangleInsets89 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot47.setInsets(rectangleInsets89, true);
        multiplePiePlot1.setInsets(rectangleInsets89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot57", multiplePiePlot1.equals(multiplePiePlot57) ? multiplePiePlot1.hashCode() == multiplePiePlot57.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier32);
        float float34 = multiplePiePlot29.getForegroundAlpha();
        multiplePiePlot29.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = multiplePiePlot38.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        multiplePiePlot38.notifyListeners(plotChangeEvent40);
        org.jfree.data.general.DatasetGroup datasetGroup42 = multiplePiePlot38.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.awt.Stroke stroke45 = null;
        multiplePiePlot44.setOutlineStroke(stroke45);
        java.lang.Comparable comparable47 = multiplePiePlot44.getAggregatedItemsKey();
        java.awt.Font font48 = multiplePiePlot44.getNoDataMessageFont();
        multiplePiePlot38.setNoDataMessageFont(font48);
        java.awt.Stroke stroke50 = multiplePiePlot38.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        multiplePiePlot52.setNoDataMessage("hi!");
        multiplePiePlot52.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str57 = multiplePiePlot52.getNoDataMessage();
        java.awt.Paint paint58 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot52.setAggregatedItemsPaint(paint58);
        multiplePiePlot38.setNoDataMessagePaint(paint58);
        multiplePiePlot29.setNoDataMessagePaint(paint58);
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot63 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset62);
        multiplePiePlot63.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier66 = null;
        multiplePiePlot63.setDrawingSupplier(drawingSupplier66);
        java.awt.Stroke stroke68 = null;
        multiplePiePlot63.setOutlineStroke(stroke68);
        org.jfree.data.general.DatasetGroup datasetGroup70 = multiplePiePlot63.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart71 = multiplePiePlot63.getPieChart();
        multiplePiePlot29.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart71);
        multiplePiePlot16.setPieChart(jFreeChart71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot44", multiplePiePlot16.equals(multiplePiePlot44) ? multiplePiePlot16.hashCode() == multiplePiePlot44.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        multiplePiePlot11.setBackgroundAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot32.getDataset();
        int int34 = multiplePiePlot32.getBackgroundImageAlignment();
        java.awt.Image image35 = multiplePiePlot32.getBackgroundImage();
        java.awt.Paint paint36 = multiplePiePlot32.getBackgroundPaint();
        java.awt.Font font37 = multiplePiePlot32.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        multiplePiePlot39.setNoDataMessage("hi!");
        boolean boolean43 = multiplePiePlot39.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection44 = multiplePiePlot39.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        multiplePiePlot46.addChangeListener(plotChangeListener51);
        java.awt.Paint paint53 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot46.setBackgroundPaint(paint53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        multiplePiePlot56.setNoDataMessage("hi!");
        multiplePiePlot56.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener61 = null;
        multiplePiePlot56.addChangeListener(plotChangeListener61);
        java.awt.Paint paint63 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot56.setBackgroundPaint(paint63);
        multiplePiePlot46.setOutlinePaint(paint63);
        org.jfree.chart.util.TableOrder tableOrder66 = multiplePiePlot46.getDataExtractOrder();
        java.awt.Image image67 = null;
        multiplePiePlot46.setBackgroundImage(image67);
        int int69 = multiplePiePlot46.getBackgroundImageAlignment();
        java.awt.Font font70 = multiplePiePlot46.getNoDataMessageFont();
        multiplePiePlot39.setNoDataMessageFont(font70);
        multiplePiePlot32.setNoDataMessageFont(font70);
        multiplePiePlot11.setNoDataMessageFont(font70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection44", legendItemCollection7.equals(legendItemCollection44) ? legendItemCollection7.hashCode() == legendItemCollection44.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.lang.Object obj8 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot10.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj8", multiplePiePlot1.equals(obj8) ? multiplePiePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot27.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot27.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot33.setOutlineStroke(stroke34);
        java.lang.Comparable comparable36 = multiplePiePlot33.getAggregatedItemsKey();
        java.awt.Font font37 = multiplePiePlot33.getNoDataMessageFont();
        multiplePiePlot27.setNoDataMessageFont(font37);
        multiplePiePlot27.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        multiplePiePlot42.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo45);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent47 = null;
        multiplePiePlot42.datasetChanged(datasetChangeEvent47);
        multiplePiePlot42.setBackgroundAlpha((float) 1L);
        multiplePiePlot42.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = multiplePiePlot42.getInsets();
        multiplePiePlot27.setInsets(rectangleInsets53);
        org.jfree.chart.JFreeChart jFreeChart55 = multiplePiePlot27.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot33", multiplePiePlot8.equals(multiplePiePlot33) ? multiplePiePlot8.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.Object obj9 = multiplePiePlot1.clone();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj9", multiplePiePlot1.equals(obj9) ? multiplePiePlot1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot9.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo12);
        multiplePiePlot9.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot9.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets16, true);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        boolean boolean23 = multiplePiePlot20.isOutlineVisible();
        multiplePiePlot20.setLimit((double) 0.5f);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        float float28 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot27.setDataset(categoryDataset29);
        boolean boolean32 = multiplePiePlot27.equals((java.lang.Object) '#');
        double double33 = multiplePiePlot27.getLimit();
        java.awt.Paint paint34 = multiplePiePlot27.getNoDataMessagePaint();
        multiplePiePlot20.setAggregatedItemsPaint(paint34);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float43 = multiplePiePlot38.getBackgroundImageAlpha();
        java.awt.Font font44 = multiplePiePlot38.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        multiplePiePlot46.addChangeListener(plotChangeListener51);
        multiplePiePlot46.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        multiplePiePlot46.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        multiplePiePlot46.setDataset(categoryDataset59);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        multiplePiePlot46.setDataset(categoryDataset61);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier63 = null;
        multiplePiePlot46.setDrawingSupplier(drawingSupplier63);
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        multiplePiePlot66.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier69 = null;
        multiplePiePlot66.setDrawingSupplier(drawingSupplier69);
        float float71 = multiplePiePlot66.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection72 = multiplePiePlot66.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent73 = null;
        multiplePiePlot66.markerChanged(markerChangeEvent73);
        org.jfree.data.category.CategoryDataset categoryDataset75 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot76 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset75);
        org.jfree.data.category.CategoryDataset categoryDataset77 = multiplePiePlot76.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent78 = null;
        multiplePiePlot76.notifyListeners(plotChangeEvent78);
        org.jfree.data.general.DatasetGroup datasetGroup80 = multiplePiePlot76.getDatasetGroup();
        boolean boolean81 = multiplePiePlot66.equals((java.lang.Object) multiplePiePlot76);
        org.jfree.data.category.CategoryDataset categoryDataset82 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot83 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset82);
        float float84 = multiplePiePlot83.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent85 = null;
        multiplePiePlot83.markerChanged(markerChangeEvent85);
        java.awt.Stroke stroke87 = null;
        multiplePiePlot83.setOutlineStroke(stroke87);
        float float89 = multiplePiePlot83.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart90 = multiplePiePlot83.getPieChart();
        multiplePiePlot76.setPieChart(jFreeChart90);
        float float92 = multiplePiePlot76.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart93 = multiplePiePlot76.getPieChart();
        multiplePiePlot46.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart93);
        multiplePiePlot38.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart93);
        multiplePiePlot1.setPieChart(jFreeChart93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot27 and multiplePiePlot76", multiplePiePlot27.equals(multiplePiePlot76) ? multiplePiePlot27.hashCode() == multiplePiePlot76.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str15 = multiplePiePlot10.getNoDataMessage();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot10.setAggregatedItemsPaint(paint16);
        multiplePiePlot1.setOutlinePaint(paint16);
        java.lang.String str19 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setNoDataMessage("hi!");
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener26);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        float float32 = multiplePiePlot31.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        multiplePiePlot31.zoom((double) 0.0f);
        multiplePiePlot31.setLimit((double) (-1));
        multiplePiePlot31.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = null;
        multiplePiePlot42.setDrawingSupplier(drawingSupplier45);
        float float47 = multiplePiePlot42.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection48 = multiplePiePlot42.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = multiplePiePlot52.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = null;
        multiplePiePlot52.notifyListeners(plotChangeEvent54);
        org.jfree.data.general.DatasetGroup datasetGroup56 = multiplePiePlot52.getDatasetGroup();
        boolean boolean57 = multiplePiePlot42.equals((java.lang.Object) multiplePiePlot52);
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot59 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset58);
        float float60 = multiplePiePlot59.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent61 = null;
        multiplePiePlot59.markerChanged(markerChangeEvent61);
        java.awt.Stroke stroke63 = null;
        multiplePiePlot59.setOutlineStroke(stroke63);
        float float65 = multiplePiePlot59.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart66 = multiplePiePlot59.getPieChart();
        multiplePiePlot52.setPieChart(jFreeChart66);
        multiplePiePlot31.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        multiplePiePlot21.setPieChart(jFreeChart66);
        org.jfree.chart.JFreeChart jFreeChart70 = multiplePiePlot21.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot21", multiplePiePlot10.equals(multiplePiePlot21) ? multiplePiePlot10.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setBackgroundPaint(paint16);
        multiplePiePlot1.setOutlinePaint(paint16);
        java.awt.Paint paint19 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot21.setOutlineStroke(stroke25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot21.getDataset();
        java.awt.Font font28 = multiplePiePlot21.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot21", obj5.equals(multiplePiePlot21) ? obj5.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        multiplePiePlot7.setOutlineStroke(stroke8);
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot13.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot13.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.lang.Comparable comparable22 = multiplePiePlot19.getAggregatedItemsKey();
        java.awt.Font font23 = multiplePiePlot19.getNoDataMessageFont();
        multiplePiePlot13.setNoDataMessageFont(font23);
        multiplePiePlot13.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot28.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo31);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        multiplePiePlot28.datasetChanged(datasetChangeEvent33);
        multiplePiePlot28.setBackgroundAlpha((float) 1L);
        multiplePiePlot28.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot28.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets39);
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        boolean boolean14 = multiplePiePlot1.isSubplot();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot1.handleClick((int) '4', (-1), plotRenderingInfo18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Stroke stroke22 = null;
        multiplePiePlot21.setOutlineStroke(stroke22);
        java.awt.Font font24 = multiplePiePlot21.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot21.getParent();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot21", multiplePiePlot7.equals(multiplePiePlot21) ? multiplePiePlot7.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        float float9 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Stroke stroke27 = null;
        multiplePiePlot26.setOutlineStroke(stroke27);
        java.lang.Comparable comparable29 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot26.getInsets();
        plot24.setInsets(rectangleInsets30, false);
        multiplePiePlot11.setInsets(rectangleInsets30, false);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = multiplePiePlot11.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets37);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        multiplePiePlot1.setDataset(categoryDataset41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets43, true);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        java.awt.Stroke stroke48 = null;
        multiplePiePlot47.setOutlineStroke(stroke48);
        java.lang.Comparable comparable50 = multiplePiePlot47.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = multiplePiePlot47.getInsets();
        org.jfree.chart.plot.Plot plot52 = multiplePiePlot47.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        java.awt.Stroke stroke55 = null;
        multiplePiePlot54.setOutlineStroke(stroke55);
        java.lang.Comparable comparable57 = multiplePiePlot54.getAggregatedItemsKey();
        java.lang.Object obj58 = multiplePiePlot54.clone();
        multiplePiePlot54.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot61 = multiplePiePlot54.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent62 = null;
        plot61.notifyListeners(plotChangeEvent62);
        org.jfree.data.category.CategoryDataset categoryDataset64 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot65 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset64);
        multiplePiePlot65.setNoDataMessage("hi!");
        multiplePiePlot65.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener70 = null;
        multiplePiePlot65.addChangeListener(plotChangeListener70);
        multiplePiePlot65.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo76 = null;
        multiplePiePlot65.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo76);
        java.awt.Paint paint78 = multiplePiePlot65.getAggregatedItemsPaint();
        plot61.setNoDataMessagePaint(paint78);
        multiplePiePlot47.setOutlinePaint(paint78);
        java.awt.Stroke stroke81 = multiplePiePlot47.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets82 = multiplePiePlot47.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot26 and obj58", multiplePiePlot26.equals(obj58) ? multiplePiePlot26.hashCode() == obj58.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        java.awt.Paint paint10 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setNoDataMessage("hi!");
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier21);
        float float23 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = multiplePiePlot18.getLegendItems();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot18.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot27.setOutlineStroke(stroke28);
        java.lang.Comparable comparable30 = multiplePiePlot27.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot27.getInsets();
        plot25.setInsets(rectangleInsets31, false);
        multiplePiePlot12.setInsets(rectangleInsets31, false);
        multiplePiePlot1.setInsets(rectangleInsets31, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot27", multiplePiePlot1.equals(multiplePiePlot27) ? multiplePiePlot1.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        multiplePiePlot62.setNoDataMessage("hi!");
        multiplePiePlot62.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener67 = null;
        multiplePiePlot62.addChangeListener(plotChangeListener67);
        java.awt.Paint paint69 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot62.setBackgroundPaint(paint69);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot34 and multiplePiePlot62", multiplePiePlot34.equals(multiplePiePlot62) ? multiplePiePlot34.hashCode() == multiplePiePlot62.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        plot8.notifyListeners(plotChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setNoDataMessage("hi!");
        boolean boolean16 = multiplePiePlot12.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke17 = null;
        multiplePiePlot12.setOutlineStroke(stroke17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot12.getDatasetGroup();
        java.awt.Image image20 = null;
        multiplePiePlot12.setBackgroundImage(image20);
        float float22 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier27);
        float float29 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection30 = multiplePiePlot24.getLegendItems();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot24.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot33.setOutlineStroke(stroke34);
        java.lang.Comparable comparable36 = multiplePiePlot33.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = multiplePiePlot33.getInsets();
        plot31.setInsets(rectangleInsets37, false);
        multiplePiePlot12.setInsets(rectangleInsets37);
        plot8.setInsets(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot33", obj5.equals(multiplePiePlot33) ? obj5.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent21);
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
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        java.awt.Stroke stroke46 = null;
        multiplePiePlot45.setOutlineStroke(stroke46);
        java.lang.Comparable comparable48 = multiplePiePlot45.getAggregatedItemsKey();
        java.awt.Font font49 = multiplePiePlot45.getNoDataMessageFont();
        multiplePiePlot24.setNoDataMessageFont(font49);
        multiplePiePlot1.setNoDataMessageFont(font49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot34", multiplePiePlot7.equals(multiplePiePlot34) ? multiplePiePlot7.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        multiplePiePlot39.setNoDataMessage("hi!");
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        multiplePiePlot39.addChangeListener(plotChangeListener44);
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot39.setBackgroundPaint(paint46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        multiplePiePlot49.setNoDataMessage("hi!");
        multiplePiePlot49.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener54 = null;
        multiplePiePlot49.addChangeListener(plotChangeListener54);
        java.awt.Paint paint56 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot49.setBackgroundPaint(paint56);
        multiplePiePlot39.setOutlinePaint(paint56);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        multiplePiePlot60.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo63);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent65 = null;
        multiplePiePlot60.datasetChanged(datasetChangeEvent65);
        multiplePiePlot60.setBackgroundAlpha((float) 1L);
        multiplePiePlot60.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = multiplePiePlot60.getInsets();
        multiplePiePlot39.setInsets(rectangleInsets71);
        multiplePiePlot1.setInsets(rectangleInsets71, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot39", multiplePiePlot1.equals(multiplePiePlot39) ? multiplePiePlot1.hashCode() == multiplePiePlot39.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image12 = multiplePiePlot9.getBackgroundImage();
        int int13 = multiplePiePlot9.getBackgroundImageAlignment();
        float float14 = multiplePiePlot9.getForegroundAlpha();
        float float15 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener22);
        multiplePiePlot17.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot17.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot17.setDataset(categoryDataset30);
        java.awt.Paint paint32 = multiplePiePlot17.getOutlinePaint();
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot17.getParent();
        multiplePiePlot17.zoom((double) (short) 1);
        boolean boolean36 = multiplePiePlot9.equals((java.lang.Object) (short) 1);
        multiplePiePlot9.setForegroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        multiplePiePlot40.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot40.setDrawingSupplier(drawingSupplier43);
        float float45 = multiplePiePlot40.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        java.awt.Stroke stroke48 = null;
        multiplePiePlot47.setOutlineStroke(stroke48);
        java.lang.Comparable comparable50 = multiplePiePlot47.getAggregatedItemsKey();
        int int51 = multiplePiePlot47.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        multiplePiePlot53.setNoDataMessage("hi!");
        multiplePiePlot53.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str58 = multiplePiePlot53.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset59 = multiplePiePlot53.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup60 = multiplePiePlot53.getDatasetGroup();
        multiplePiePlot47.setParent((org.jfree.chart.plot.Plot) multiplePiePlot53);
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = multiplePiePlot47.getInsets();
        multiplePiePlot40.setInsets(rectangleInsets62, false);
        multiplePiePlot9.setInsets(rectangleInsets62);
        multiplePiePlot1.setInsets(rectangleInsets62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot53", multiplePiePlot1.equals(multiplePiePlot53) ? multiplePiePlot1.hashCode() == multiplePiePlot53.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        float float28 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = multiplePiePlot27.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot27.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets32);
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.awt.Stroke stroke37 = null;
        multiplePiePlot36.setOutlineStroke(stroke37);
        java.lang.Comparable comparable39 = multiplePiePlot36.getAggregatedItemsKey();
        java.lang.Comparable comparable40 = multiplePiePlot36.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setNoDataMessage("hi!");
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot42.addChangeListener(plotChangeListener47);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot42.setBackgroundPaint(paint49);
        boolean boolean51 = multiplePiePlot42.isOutlineVisible();
        java.awt.Font font52 = multiplePiePlot42.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder53 = multiplePiePlot42.getDataExtractOrder();
        multiplePiePlot36.setDataExtractOrder(tableOrder53);
        java.awt.Paint paint55 = multiplePiePlot36.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot42", multiplePiePlot11.equals(multiplePiePlot42) ? multiplePiePlot11.hashCode() == multiplePiePlot42.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str25 = multiplePiePlot20.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot20.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot20.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        multiplePiePlot34.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setAggregatedItemsPaint(paint41);
        multiplePiePlot29.setOutlinePaint(paint41);
        multiplePiePlot20.setAggregatedItemsPaint(paint41);
        multiplePiePlot1.setAggregatedItemsPaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot34", multiplePiePlot11.equals(multiplePiePlot34) ? multiplePiePlot11.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot6.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot13.setBackgroundPaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setBackgroundPaint(paint30);
        multiplePiePlot13.setOutlinePaint(paint30);
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot13.getDataExtractOrder();
        float float34 = multiplePiePlot13.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        multiplePiePlot36.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        multiplePiePlot36.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        multiplePiePlot36.setDataset(categoryDataset49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        multiplePiePlot36.setDataset(categoryDataset51);
        java.awt.Stroke stroke53 = multiplePiePlot36.getOutlineStroke();
        multiplePiePlot13.setOutlineStroke(stroke53);
        multiplePiePlot6.setOutlineStroke(stroke53);
        multiplePiePlot1.setOutlineStroke(stroke53);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        multiplePiePlot61.setNoDataMessage("hi!");
        multiplePiePlot61.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str66 = multiplePiePlot61.getNoDataMessage();
        java.lang.String str67 = multiplePiePlot61.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart68 = multiplePiePlot61.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot23 and multiplePiePlot61", multiplePiePlot23.equals(multiplePiePlot61) ? multiplePiePlot23.hashCode() == multiplePiePlot61.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        java.lang.String str37 = multiplePiePlot17.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot27", multiplePiePlot7.equals(multiplePiePlot27) ? multiplePiePlot7.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot8.setDataset(categoryDataset23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        int int29 = multiplePiePlot28.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        float float32 = multiplePiePlot31.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot31.markerChanged(markerChangeEvent33);
        java.awt.Stroke stroke35 = null;
        multiplePiePlot31.setOutlineStroke(stroke35);
        float float37 = multiplePiePlot31.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot31.getPieChart();
        multiplePiePlot28.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot28", multiplePiePlot1.equals(multiplePiePlot28) ? multiplePiePlot1.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint10 = null;
        multiplePiePlot1.setBackgroundPaint(paint10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Stroke stroke14 = null;
        multiplePiePlot13.setOutlineStroke(stroke14);
        java.lang.Comparable comparable16 = multiplePiePlot13.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot13.getInsets();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        java.awt.Image image19 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent21);
        java.awt.Paint paint23 = multiplePiePlot20.getNoDataMessagePaint();
        multiplePiePlot13.setBackgroundPaint(paint23);
        double double25 = multiplePiePlot13.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setNoDataMessage("hi!");
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener32);
        multiplePiePlot27.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent36);
        java.lang.String str38 = multiplePiePlot27.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        float float41 = multiplePiePlot40.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        multiplePiePlot40.markerChanged(markerChangeEvent42);
        java.awt.Stroke stroke44 = null;
        multiplePiePlot40.setOutlineStroke(stroke44);
        float float46 = multiplePiePlot40.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot40.getPieChart();
        multiplePiePlot27.setPieChart(jFreeChart47);
        multiplePiePlot13.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart47);
        multiplePiePlot1.setPieChart(jFreeChart47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart9 and jFreeChart47", jFreeChart9.equals(jFreeChart47) ? jFreeChart9.hashCode() == jFreeChart47.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setBackgroundImageAlpha(0.5f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image17 = multiplePiePlot14.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier22);
        float float24 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot19.getLegendItems();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot19.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot28.setOutlineStroke(stroke29);
        java.lang.Comparable comparable31 = multiplePiePlot28.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot28.getInsets();
        plot26.setInsets(rectangleInsets32, false);
        multiplePiePlot14.setInsets(rectangleInsets32, false);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener43);
        org.jfree.chart.util.TableOrder tableOrder45 = multiplePiePlot38.getDataExtractOrder();
        multiplePiePlot14.setDataExtractOrder(tableOrder45);
        org.jfree.chart.plot.Plot plot47 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = plot47.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets48, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot38", multiplePiePlot1.equals(multiplePiePlot38) ? multiplePiePlot1.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.Object obj6 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot18.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo21);
        multiplePiePlot18.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot18.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets25, true);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener34);
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener36);
        java.lang.Comparable comparable38 = multiplePiePlot29.getAggregatedItemsKey();
        multiplePiePlot29.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot29.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setNoDataMessage("hi!");
        boolean boolean47 = multiplePiePlot43.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot48 = multiplePiePlot43.getParent();
        java.awt.Stroke stroke49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot43.setOutlineStroke(stroke49);
        multiplePiePlot29.setOutlineStroke(stroke49);
        multiplePiePlot10.setOutlineStroke(stroke49);
        multiplePiePlot1.setOutlineStroke(stroke49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot29", obj6.equals(multiplePiePlot29) ? obj6.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        float float14 = multiplePiePlot13.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getBackgroundPaint();
        multiplePiePlot9.setOutlinePaint(paint17);
        multiplePiePlot1.setBackgroundPaint(paint17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        multiplePiePlot21.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot21.handleClick(10, (int) '4', plotRenderingInfo28);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot21.setOutlineStroke(stroke30);
        multiplePiePlot1.setOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot21", multiplePiePlot13.equals(multiplePiePlot21) ? multiplePiePlot13.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener34);
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener36);
        multiplePiePlot29.setOutlineVisible(false);
        java.awt.Paint paint40 = multiplePiePlot29.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setNoDataMessage("hi!");
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str47 = multiplePiePlot42.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset48 = multiplePiePlot42.getDataset();
        java.awt.Image image49 = null;
        multiplePiePlot42.setBackgroundImage(image49);
        org.jfree.chart.LegendItemCollection legendItemCollection51 = multiplePiePlot42.getLegendItems();
        java.awt.Stroke stroke52 = multiplePiePlot42.getOutlineStroke();
        multiplePiePlot29.setOutlineStroke(stroke52);
        multiplePiePlot1.setOutlineStroke(stroke52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot42", multiplePiePlot11.equals(multiplePiePlot42) ? multiplePiePlot11.hashCode() == multiplePiePlot42.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot10.getOutlinePaint();
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
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        multiplePiePlot1.setPieChart(jFreeChart33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot23", multiplePiePlot1.equals(multiplePiePlot23) ? multiplePiePlot1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        java.lang.Object obj24 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj24", multiplePiePlot1.equals(obj24) ? multiplePiePlot1.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        java.lang.Object obj23 = multiplePiePlot1.clone();
        java.awt.Paint paint24 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj23", multiplePiePlot1.equals(obj23) ? multiplePiePlot1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot18.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot18.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot24.setOutlineStroke(stroke25);
        java.lang.Comparable comparable27 = multiplePiePlot24.getAggregatedItemsKey();
        java.awt.Font font28 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font28);
        multiplePiePlot18.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        multiplePiePlot33.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo36);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent38 = null;
        multiplePiePlot33.datasetChanged(datasetChangeEvent38);
        multiplePiePlot33.setBackgroundAlpha((float) 1L);
        multiplePiePlot33.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = multiplePiePlot33.getInsets();
        multiplePiePlot18.setInsets(rectangleInsets44);
        multiplePiePlot1.setInsets(rectangleInsets44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent26);
        java.lang.Class<?> wildcardClass28 = multiplePiePlot24.getClass();
        boolean boolean29 = multiplePiePlot17.equals((java.lang.Object) wildcardClass28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        float float32 = multiplePiePlot31.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot31.markerChanged(markerChangeEvent33);
        java.awt.Stroke stroke35 = null;
        multiplePiePlot31.setOutlineStroke(stroke35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = multiplePiePlot31.getDataset();
        java.awt.Font font38 = multiplePiePlot31.getNoDataMessageFont();
        multiplePiePlot17.setNoDataMessageFont(font38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = multiplePiePlot17.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setNoDataMessage("hi!");
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot42.addChangeListener(plotChangeListener47);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        multiplePiePlot42.addChangeListener(plotChangeListener49);
        java.lang.Comparable comparable51 = multiplePiePlot42.getAggregatedItemsKey();
        multiplePiePlot42.zoom((double) (-1L));
        java.awt.Font font54 = multiplePiePlot42.getNoDataMessageFont();
        multiplePiePlot17.setNoDataMessageFont(font54);
        org.jfree.chart.JFreeChart jFreeChart56 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart12 and jFreeChart56", jFreeChart12.equals(jFreeChart56) ? jFreeChart12.hashCode() == jFreeChart56.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        java.awt.Font font22 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot25.getDataset();
        int int27 = multiplePiePlot25.getBackgroundImageAlignment();
        java.awt.Image image28 = multiplePiePlot25.getBackgroundImage();
        float float29 = multiplePiePlot25.getBackgroundImageAlpha();
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
        multiplePiePlot25.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        multiplePiePlot1.setPieChart(jFreeChart66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot25", multiplePiePlot9.equals(multiplePiePlot25) ? multiplePiePlot9.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot13.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot13.getDatasetGroup();
        java.awt.Image image18 = null;
        multiplePiePlot13.setBackgroundImage(image18);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        multiplePiePlot23.axisChanged(axisChangeEvent26);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        multiplePiePlot23.axisChanged(axisChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        int int32 = multiplePiePlot31.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        float float35 = multiplePiePlot34.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot34.setOutlineStroke(stroke38);
        float float40 = multiplePiePlot34.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot34.getPieChart();
        multiplePiePlot31.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        multiplePiePlot23.setPieChart(jFreeChart41);
        multiplePiePlot23.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        multiplePiePlot47.setNoDataMessage("hi!");
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener52 = null;
        multiplePiePlot47.addChangeListener(plotChangeListener52);
        org.jfree.chart.util.TableOrder tableOrder54 = multiplePiePlot47.getDataExtractOrder();
        multiplePiePlot23.setDataExtractOrder(tableOrder54);
        multiplePiePlot1.setDataExtractOrder(tableOrder54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot31", multiplePiePlot13.equals(multiplePiePlot31) ? multiplePiePlot13.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        java.lang.Object obj14 = multiplePiePlot1.clone();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent17);
        multiplePiePlot15.zoom((double) 0.0f);
        multiplePiePlot15.setLimit((double) (-1));
        multiplePiePlot15.setBackgroundAlpha(0.0f);
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
        multiplePiePlot15.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot1.setPieChart(jFreeChart50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection32", legendItemCollection7.equals(legendItemCollection32) ? legendItemCollection7.hashCode() == legendItemCollection32.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot13.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot13.getDatasetGroup();
        java.awt.Image image18 = null;
        multiplePiePlot13.setBackgroundImage(image18);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        multiplePiePlot22.setDataset(categoryDataset41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        multiplePiePlot44.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo47);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent49 = null;
        multiplePiePlot44.datasetChanged(datasetChangeEvent49);
        float float51 = multiplePiePlot44.getBackgroundImageAlpha();
        float float52 = multiplePiePlot44.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        multiplePiePlot54.setNoDataMessage("hi!");
        multiplePiePlot54.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        multiplePiePlot60.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier63 = null;
        multiplePiePlot60.setDrawingSupplier(drawingSupplier63);
        float float65 = multiplePiePlot60.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection66 = multiplePiePlot60.getLegendItems();
        org.jfree.chart.plot.Plot plot67 = multiplePiePlot60.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot69 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset68);
        java.awt.Stroke stroke70 = null;
        multiplePiePlot69.setOutlineStroke(stroke70);
        java.lang.Comparable comparable72 = multiplePiePlot69.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = multiplePiePlot69.getInsets();
        plot67.setInsets(rectangleInsets73, false);
        multiplePiePlot54.setInsets(rectangleInsets73, false);
        multiplePiePlot54.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets80 = multiplePiePlot54.getInsets();
        multiplePiePlot44.setInsets(rectangleInsets80);
        multiplePiePlot22.setInsets(rectangleInsets80, true);
        multiplePiePlot13.setInsets(rectangleInsets80, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot44", multiplePiePlot13.equals(multiplePiePlot44) ? multiplePiePlot13.hashCode() == multiplePiePlot44.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent11);
        multiplePiePlot9.zoom((double) 0.0f);
        multiplePiePlot9.setLimit((double) (-1));
        multiplePiePlot9.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot20.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot30.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = multiplePiePlot30.getDatasetGroup();
        boolean boolean35 = multiplePiePlot20.equals((java.lang.Object) multiplePiePlot30);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        float float38 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot37.markerChanged(markerChangeEvent39);
        java.awt.Stroke stroke41 = null;
        multiplePiePlot37.setOutlineStroke(stroke41);
        float float43 = multiplePiePlot37.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot37.getPieChart();
        multiplePiePlot30.setPieChart(jFreeChart44);
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        multiplePiePlot9.setLimit((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart49 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart44 and jFreeChart49", jFreeChart44.equals(jFreeChart49) ? jFreeChart44.hashCode() == jFreeChart49.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str14 = multiplePiePlot9.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot9.getDataset();
        java.awt.Image image16 = null;
        multiplePiePlot9.setBackgroundImage(image16);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot9.getLegendItems();
        java.awt.Stroke stroke19 = multiplePiePlot9.getOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection4 and legendItemCollection18", legendItemCollection4.equals(legendItemCollection18) ? legendItemCollection4.hashCode() == legendItemCollection18.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot18.setDataset(categoryDataset20);
        boolean boolean23 = multiplePiePlot18.equals((java.lang.Object) '#');
        java.awt.Paint paint24 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot18", multiplePiePlot11.equals(multiplePiePlot18) ? multiplePiePlot11.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Image image29 = null;
        multiplePiePlot28.setBackgroundImage(image29);
        java.awt.Stroke stroke31 = multiplePiePlot28.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier36);
        float float38 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection39 = multiplePiePlot33.getLegendItems();
        org.jfree.chart.plot.Plot plot40 = multiplePiePlot33.getRootPlot();
        float float41 = multiplePiePlot33.getBackgroundImageAlpha();
        java.awt.Image image42 = multiplePiePlot33.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier43);
        multiplePiePlot33.setLimit((double) 10.0f);
        java.awt.Paint paint47 = multiplePiePlot33.getOutlinePaint();
        org.jfree.chart.util.TableOrder tableOrder48 = multiplePiePlot33.getDataExtractOrder();
        multiplePiePlot28.setDataExtractOrder(tableOrder48);
        multiplePiePlot1.setDataExtractOrder(tableOrder48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection39", legendItemCollection7.equals(legendItemCollection39) ? legendItemCollection7.hashCode() == legendItemCollection39.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        int int2 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier9);
        float float11 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot6.axisChanged(axisChangeEvent12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot6.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo16);
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
        java.awt.Paint paint34 = multiplePiePlot19.getOutlinePaint();
        java.awt.Paint paint35 = multiplePiePlot19.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = multiplePiePlot37.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot37.notifyListeners(plotChangeEvent39);
        org.jfree.data.general.DatasetGroup datasetGroup41 = multiplePiePlot37.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.awt.Stroke stroke44 = null;
        multiplePiePlot43.setOutlineStroke(stroke44);
        java.lang.Comparable comparable46 = multiplePiePlot43.getAggregatedItemsKey();
        java.awt.Font font47 = multiplePiePlot43.getNoDataMessageFont();
        multiplePiePlot37.setNoDataMessageFont(font47);
        multiplePiePlot37.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        multiplePiePlot52.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo55);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent57 = null;
        multiplePiePlot52.datasetChanged(datasetChangeEvent57);
        multiplePiePlot52.setBackgroundAlpha((float) 1L);
        multiplePiePlot52.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = multiplePiePlot52.getInsets();
        multiplePiePlot37.setInsets(rectangleInsets63);
        multiplePiePlot19.setInsets(rectangleInsets63, true);
        multiplePiePlot6.setInsets(rectangleInsets63, false);
        multiplePiePlot1.setInsets(rectangleInsets63, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot37", multiplePiePlot1.equals(multiplePiePlot37) ? multiplePiePlot1.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot9.setDataset(categoryDataset11);
        boolean boolean14 = multiplePiePlot9.equals((java.lang.Object) '#');
        java.awt.Paint paint15 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot9.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets17, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        float float35 = multiplePiePlot34.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot34.setOutlineStroke(stroke38);
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable42 = multiplePiePlot34.getAggregatedItemsKey();
        multiplePiePlot34.setNoDataMessage("");
        java.awt.Paint paint45 = multiplePiePlot34.getOutlinePaint();
        multiplePiePlot8.setOutlinePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot18", multiplePiePlot8.equals(multiplePiePlot18) ? multiplePiePlot8.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        float float24 = multiplePiePlot18.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        multiplePiePlot11.setPieChart(jFreeChart25);
        float float27 = multiplePiePlot11.getBackgroundImageAlpha();
        java.lang.Object obj28 = multiplePiePlot11.clone();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot11.setDataset(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj28", multiplePiePlot11.equals(obj28) ? multiplePiePlot11.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        float float30 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection31 = multiplePiePlot25.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot25.markerChanged(markerChangeEvent32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot35.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot35.getDatasetGroup();
        boolean boolean40 = multiplePiePlot25.equals((java.lang.Object) multiplePiePlot35);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        float float43 = multiplePiePlot42.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent44);
        java.awt.Stroke stroke46 = null;
        multiplePiePlot42.setOutlineStroke(stroke46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = multiplePiePlot42.getDataset();
        java.awt.Font font49 = multiplePiePlot42.getNoDataMessageFont();
        multiplePiePlot25.setNoDataMessageFont(font49);
        multiplePiePlot25.setNoDataMessage("Multiple Pie Plot");
        java.awt.Stroke stroke53 = multiplePiePlot25.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection18 and legendItemCollection31", legendItemCollection18.equals(legendItemCollection31) ? legendItemCollection18.hashCode() == legendItemCollection31.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Object obj12 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float14 = multiplePiePlot9.getBackgroundImageAlpha();
        java.awt.Font font15 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Stroke stroke22 = null;
        multiplePiePlot18.setOutlineStroke(stroke22);
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable26 = multiplePiePlot18.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot28.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener33);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot28.setAggregatedItemsPaint(paint35);
        multiplePiePlot18.setBackgroundPaint(paint35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        multiplePiePlot18.setDataset(categoryDataset38);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot28", multiplePiePlot1.equals(multiplePiePlot28) ? multiplePiePlot1.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        java.awt.Stroke stroke15 = null;
        multiplePiePlot14.setOutlineStroke(stroke15);
        java.lang.Comparable comparable17 = multiplePiePlot14.getAggregatedItemsKey();
        int int18 = multiplePiePlot14.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str25 = multiplePiePlot20.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot20.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot20.getDatasetGroup();
        multiplePiePlot14.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets29, false);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot1.getInsets();
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
        java.awt.Image image57 = null;
        multiplePiePlot36.setBackgroundImage(image57);
        int int59 = multiplePiePlot36.getBackgroundImageAlignment();
        java.awt.Font font60 = multiplePiePlot36.getNoDataMessageFont();
        java.awt.Paint paint61 = multiplePiePlot36.getNoDataMessagePaint();
        boolean boolean62 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot20 and multiplePiePlot46", multiplePiePlot20.equals(multiplePiePlot46) ? multiplePiePlot20.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        java.lang.Object obj23 = multiplePiePlot1.clone();
        java.awt.Stroke stroke24 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj23", multiplePiePlot1.equals(obj23) ? multiplePiePlot1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.zoom((double) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot14.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot14.getDatasetGroup();
        java.lang.String str19 = multiplePiePlot14.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier20);
        java.lang.String str22 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot24.setOutlineStroke(stroke25);
        java.awt.Font font27 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable30 = multiplePiePlot24.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setNoDataMessage("hi!");
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener37);
        multiplePiePlot32.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        multiplePiePlot32.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        multiplePiePlot32.setDataset(categoryDataset45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        multiplePiePlot32.setDataset(categoryDataset47);
        java.awt.Stroke stroke49 = multiplePiePlot32.getOutlineStroke();
        multiplePiePlot24.setOutlineStroke(stroke49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = multiplePiePlot52.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = null;
        multiplePiePlot52.notifyListeners(plotChangeEvent54);
        org.jfree.data.general.DatasetGroup datasetGroup56 = multiplePiePlot52.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        java.awt.Stroke stroke59 = null;
        multiplePiePlot58.setOutlineStroke(stroke59);
        java.lang.Comparable comparable61 = multiplePiePlot58.getAggregatedItemsKey();
        java.awt.Font font62 = multiplePiePlot58.getNoDataMessageFont();
        multiplePiePlot52.setNoDataMessageFont(font62);
        java.awt.Stroke stroke64 = multiplePiePlot52.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        multiplePiePlot66.setNoDataMessage("hi!");
        multiplePiePlot66.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot66.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Font font73 = multiplePiePlot66.getNoDataMessageFont();
        multiplePiePlot52.setNoDataMessageFont(font73);
        multiplePiePlot24.setNoDataMessageFont(font73);
        multiplePiePlot1.setNoDataMessageFont(font73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and multiplePiePlot52", multiplePiePlot14.equals(multiplePiePlot52) ? multiplePiePlot14.hashCode() == multiplePiePlot52.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot18.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot18.getDatasetGroup();
        boolean boolean23 = multiplePiePlot8.equals((java.lang.Object) multiplePiePlot18);
        java.awt.Paint paint24 = multiplePiePlot8.getBackgroundPaint();
        multiplePiePlot8.setOutlineVisible(false);
        boolean boolean27 = multiplePiePlot8.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        multiplePiePlot29.axisChanged(axisChangeEvent32);
        java.awt.Paint paint34 = multiplePiePlot29.getAggregatedItemsPaint();
        java.awt.Paint paint35 = multiplePiePlot29.getBackgroundPaint();
        multiplePiePlot8.setNoDataMessagePaint(paint35);
        boolean boolean37 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot29", multiplePiePlot1.equals(multiplePiePlot29) ? multiplePiePlot1.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier22);
        float float24 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot19.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setNoDataMessage("hi!");
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot27.setBackgroundPaint(paint34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        multiplePiePlot37.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = null;
        multiplePiePlot37.setDrawingSupplier(drawingSupplier40);
        java.awt.Stroke stroke42 = null;
        multiplePiePlot37.setOutlineStroke(stroke42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = multiplePiePlot45.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = null;
        multiplePiePlot45.notifyListeners(plotChangeEvent47);
        org.jfree.data.general.DatasetGroup datasetGroup49 = multiplePiePlot45.getDatasetGroup();
        java.awt.Stroke stroke50 = null;
        multiplePiePlot45.setOutlineStroke(stroke50);
        org.jfree.chart.JFreeChart jFreeChart52 = multiplePiePlot45.getPieChart();
        multiplePiePlot37.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        multiplePiePlot27.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        multiplePiePlot19.setPieChart(jFreeChart52);
        multiplePiePlot1.setPieChart(jFreeChart52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot45", multiplePiePlot9.equals(multiplePiePlot45) ? multiplePiePlot9.hashCode() == multiplePiePlot45.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot20.getLegendItems();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot20.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot29.setOutlineStroke(stroke30);
        java.lang.Comparable comparable32 = multiplePiePlot29.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot29.getInsets();
        plot27.setInsets(rectangleInsets33, false);
        multiplePiePlot14.setInsets(rectangleInsets33, false);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        multiplePiePlot41.setNoDataMessage("hi!");
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        multiplePiePlot49.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo52);
        multiplePiePlot49.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = multiplePiePlot49.getInsets();
        multiplePiePlot41.setInsets(rectangleInsets56, true);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        multiplePiePlot60.setNoDataMessage("hi!");
        multiplePiePlot60.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener65 = null;
        multiplePiePlot60.addChangeListener(plotChangeListener65);
        org.jfree.chart.event.PlotChangeListener plotChangeListener67 = null;
        multiplePiePlot60.addChangeListener(plotChangeListener67);
        java.lang.Comparable comparable69 = multiplePiePlot60.getAggregatedItemsKey();
        multiplePiePlot60.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier72 = multiplePiePlot60.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset73 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot74 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset73);
        multiplePiePlot74.setNoDataMessage("hi!");
        boolean boolean78 = multiplePiePlot74.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot79 = multiplePiePlot74.getParent();
        java.awt.Stroke stroke80 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot74.setOutlineStroke(stroke80);
        multiplePiePlot60.setOutlineStroke(stroke80);
        multiplePiePlot41.setOutlineStroke(stroke80);
        multiplePiePlot14.setOutlineStroke(stroke80);
        multiplePiePlot1.setOutlineStroke(stroke80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot60", multiplePiePlot1.equals(multiplePiePlot60) ? multiplePiePlot1.hashCode() == multiplePiePlot60.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        float float34 = multiplePiePlot33.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot33.notifyListeners(plotChangeEvent35);
        multiplePiePlot33.zoom((double) 0.0f);
        multiplePiePlot33.setLimit((double) (-1));
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot33.setBackgroundPaint(paint41);
        java.awt.Paint paint43 = multiplePiePlot33.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        multiplePiePlot33.removeChangeListener(plotChangeListener44);
        java.awt.Paint paint46 = multiplePiePlot33.getAggregatedItemsPaint();
        java.awt.Paint paint47 = multiplePiePlot33.getNoDataMessagePaint();
        java.awt.Image image48 = multiplePiePlot33.getBackgroundImage();
        java.awt.Paint paint49 = multiplePiePlot33.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot20 and multiplePiePlot33", multiplePiePlot20.equals(multiplePiePlot33) ? multiplePiePlot20.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) 0.5f);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent11);
        multiplePiePlot9.zoom((double) 0.0f);
        multiplePiePlot9.setLimit((double) (-1));
        multiplePiePlot9.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot20.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot30.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = multiplePiePlot30.getDatasetGroup();
        boolean boolean35 = multiplePiePlot20.equals((java.lang.Object) multiplePiePlot30);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        float float38 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot37.markerChanged(markerChangeEvent39);
        java.awt.Stroke stroke41 = null;
        multiplePiePlot37.setOutlineStroke(stroke41);
        float float43 = multiplePiePlot37.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot37.getPieChart();
        multiplePiePlot30.setPieChart(jFreeChart44);
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        multiplePiePlot9.setLimit((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart49 = multiplePiePlot9.getPieChart();
        boolean boolean50 = multiplePiePlot1.equals((java.lang.Object) jFreeChart49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart44 and jFreeChart49", jFreeChart44.equals(jFreeChart49) ? jFreeChart44.hashCode() == jFreeChart49.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        multiplePiePlot9.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot9.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot9.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot9.setDataset(categoryDataset24);
        java.awt.Stroke stroke26 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke26);
        org.jfree.chart.util.TableOrder tableOrder28 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection33 = multiplePiePlot30.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = null;
        multiplePiePlot35.setDrawingSupplier(drawingSupplier38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = multiplePiePlot35.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setNoDataMessage("hi!");
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot42.addChangeListener(plotChangeListener47);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot42.setBackgroundPaint(paint49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        multiplePiePlot52.setNoDataMessage("hi!");
        multiplePiePlot52.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        multiplePiePlot52.addChangeListener(plotChangeListener57);
        java.awt.Paint paint59 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot52.setBackgroundPaint(paint59);
        multiplePiePlot42.setOutlinePaint(paint59);
        org.jfree.chart.util.TableOrder tableOrder62 = multiplePiePlot42.getDataExtractOrder();
        float float63 = multiplePiePlot42.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset64 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot65 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset64);
        multiplePiePlot65.setNoDataMessage("hi!");
        multiplePiePlot65.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener70 = null;
        multiplePiePlot65.addChangeListener(plotChangeListener70);
        multiplePiePlot65.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo76 = null;
        multiplePiePlot65.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo76);
        org.jfree.data.category.CategoryDataset categoryDataset78 = null;
        multiplePiePlot65.setDataset(categoryDataset78);
        org.jfree.data.category.CategoryDataset categoryDataset80 = null;
        multiplePiePlot65.setDataset(categoryDataset80);
        java.awt.Stroke stroke82 = multiplePiePlot65.getOutlineStroke();
        multiplePiePlot42.setOutlineStroke(stroke82);
        multiplePiePlot35.setOutlineStroke(stroke82);
        multiplePiePlot30.setOutlineStroke(stroke82);
        multiplePiePlot1.setOutlineStroke(stroke82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot65", multiplePiePlot9.equals(multiplePiePlot65) ? multiplePiePlot9.hashCode() == multiplePiePlot65.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        java.lang.Object obj24 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot26.setOutlineStroke(stroke30);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint34 = multiplePiePlot26.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj24", multiplePiePlot1.equals(obj24) ? multiplePiePlot1.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener18);
        java.lang.Comparable comparable20 = multiplePiePlot11.getAggregatedItemsKey();
        multiplePiePlot11.zoom((double) (-1L));
        java.awt.Font font23 = multiplePiePlot11.getNoDataMessageFont();
        java.awt.Paint paint24 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection9", legendItemCollection7.equals(legendItemCollection9) ? legendItemCollection7.hashCode() == legendItemCollection9.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        int int19 = multiplePiePlot18.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot21.setOutlineStroke(stroke25);
        float float27 = multiplePiePlot21.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot10.setPieChart(jFreeChart28);
        java.awt.Font font31 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot9.getDataset();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.lang.Object obj19 = multiplePiePlot1.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, 0, plotRenderingInfo22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj19", multiplePiePlot1.equals(obj19) ? multiplePiePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Stroke stroke17 = null;
        multiplePiePlot16.setOutlineStroke(stroke17);
        java.lang.Comparable comparable19 = multiplePiePlot16.getAggregatedItemsKey();
        int int20 = multiplePiePlot16.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str27 = multiplePiePlot22.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot22.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup29 = multiplePiePlot22.getDatasetGroup();
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot16.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot16.getInsets();
        java.awt.Stroke stroke33 = multiplePiePlot16.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent34 = null;
        multiplePiePlot16.datasetChanged(datasetChangeEvent34);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and multiplePiePlot22", obj10.equals(multiplePiePlot22) ? obj10.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent17);
        multiplePiePlot15.zoom((double) 0.0f);
        multiplePiePlot15.setLimit((double) (-1));
        multiplePiePlot15.setBackgroundAlpha(0.0f);
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
        multiplePiePlot15.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot15.setLimit((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart55 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot36", multiplePiePlot1.equals(multiplePiePlot36) ? multiplePiePlot1.hashCode() == multiplePiePlot36.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setNoDataMessage("hi!");
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        multiplePiePlot15.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent24);
        java.lang.String str26 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        float float29 = multiplePiePlot28.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        java.awt.Stroke stroke32 = null;
        multiplePiePlot28.setOutlineStroke(stroke32);
        float float34 = multiplePiePlot28.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot28.getPieChart();
        multiplePiePlot15.setPieChart(jFreeChart35);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        multiplePiePlot1.setDataset(categoryDataset38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        float float42 = multiplePiePlot41.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        multiplePiePlot41.zoom((double) 0.0f);
        multiplePiePlot41.setLimit((double) (-1));
        multiplePiePlot41.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        multiplePiePlot52.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier55 = null;
        multiplePiePlot52.setDrawingSupplier(drawingSupplier55);
        float float57 = multiplePiePlot52.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection58 = multiplePiePlot52.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent59 = null;
        multiplePiePlot52.markerChanged(markerChangeEvent59);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        org.jfree.data.category.CategoryDataset categoryDataset63 = multiplePiePlot62.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent64 = null;
        multiplePiePlot62.notifyListeners(plotChangeEvent64);
        org.jfree.data.general.DatasetGroup datasetGroup66 = multiplePiePlot62.getDatasetGroup();
        boolean boolean67 = multiplePiePlot52.equals((java.lang.Object) multiplePiePlot62);
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot69 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset68);
        float float70 = multiplePiePlot69.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent71 = null;
        multiplePiePlot69.markerChanged(markerChangeEvent71);
        java.awt.Stroke stroke73 = null;
        multiplePiePlot69.setOutlineStroke(stroke73);
        float float75 = multiplePiePlot69.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart76 = multiplePiePlot69.getPieChart();
        multiplePiePlot62.setPieChart(jFreeChart76);
        multiplePiePlot41.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot1.setPieChart(jFreeChart76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot62", multiplePiePlot8.equals(multiplePiePlot62) ? multiplePiePlot8.hashCode() == multiplePiePlot62.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        multiplePiePlot11.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent20);
        java.lang.String str22 = multiplePiePlot11.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot24.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot24.getDatasetGroup();
        java.lang.String str29 = multiplePiePlot24.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = multiplePiePlot24.getDrawingSupplier();
        multiplePiePlot11.setDrawingSupplier(drawingSupplier30);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier30);
        double double33 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot35.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot35.getDatasetGroup();
        java.lang.String str40 = multiplePiePlot35.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = null;
        multiplePiePlot42.setDrawingSupplier(drawingSupplier45);
        float float47 = multiplePiePlot42.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection48 = multiplePiePlot42.getLegendItems();
        org.jfree.chart.plot.Plot plot49 = multiplePiePlot42.getRootPlot();
        float float50 = multiplePiePlot42.getBackgroundImageAlpha();
        java.awt.Image image51 = multiplePiePlot42.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = null;
        multiplePiePlot42.setDrawingSupplier(drawingSupplier52);
        multiplePiePlot42.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setNoDataMessage("hi!");
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener62);
        org.jfree.chart.event.PlotChangeListener plotChangeListener64 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener64);
        java.lang.Comparable comparable66 = multiplePiePlot57.getAggregatedItemsKey();
        multiplePiePlot57.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier69 = multiplePiePlot57.getDrawingSupplier();
        multiplePiePlot42.setDrawingSupplier(drawingSupplier69);
        multiplePiePlot35.setDrawingSupplier(drawingSupplier69);
        java.awt.Paint paint72 = multiplePiePlot35.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot24 and multiplePiePlot35", multiplePiePlot24.equals(multiplePiePlot35) ? multiplePiePlot24.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str35 = multiplePiePlot30.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot30.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup37 = multiplePiePlot30.getDatasetGroup();
        double double38 = multiplePiePlot30.getLimit();
        boolean boolean39 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot30", multiplePiePlot11.equals(multiplePiePlot30) ? multiplePiePlot11.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setBackgroundPaint(paint16);
        multiplePiePlot1.setOutlinePaint(paint16);
        java.lang.Object obj19 = multiplePiePlot1.clone();
        java.lang.String str20 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj19", multiplePiePlot1.equals(obj19) ? multiplePiePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot7.getLegendItems();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Stroke stroke17 = null;
        multiplePiePlot16.setOutlineStroke(stroke17);
        java.lang.Comparable comparable19 = multiplePiePlot16.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot16.getInsets();
        plot14.setInsets(rectangleInsets20, false);
        multiplePiePlot1.setInsets(rectangleInsets20, false);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str31 = multiplePiePlot26.getNoDataMessage();
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot26.setAggregatedItemsPaint(paint32);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        float float38 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        multiplePiePlot37.setDataset(categoryDataset39);
        boolean boolean42 = multiplePiePlot37.equals((java.lang.Object) '#');
        java.lang.String str43 = multiplePiePlot37.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        multiplePiePlot45.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = null;
        multiplePiePlot45.setDrawingSupplier(drawingSupplier48);
        java.awt.Stroke stroke50 = null;
        multiplePiePlot45.setOutlineStroke(stroke50);
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = multiplePiePlot53.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        multiplePiePlot53.notifyListeners(plotChangeEvent55);
        org.jfree.data.general.DatasetGroup datasetGroup57 = multiplePiePlot53.getDatasetGroup();
        java.awt.Stroke stroke58 = null;
        multiplePiePlot53.setOutlineStroke(stroke58);
        org.jfree.chart.JFreeChart jFreeChart60 = multiplePiePlot53.getPieChart();
        multiplePiePlot45.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart60);
        multiplePiePlot37.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart60);
        multiplePiePlot26.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart60);
        multiplePiePlot1.setPieChart(jFreeChart60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot53", multiplePiePlot16.equals(multiplePiePlot53) ? multiplePiePlot16.hashCode() == multiplePiePlot53.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        float float35 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection36 = multiplePiePlot30.getLegendItems();
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot30.getRootPlot();
        java.lang.String str38 = multiplePiePlot30.getNoDataMessage();
        java.awt.Paint paint39 = multiplePiePlot30.getAggregatedItemsPaint();
        multiplePiePlot30.zoom((double) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = multiplePiePlot43.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent45);
        org.jfree.data.general.DatasetGroup datasetGroup47 = multiplePiePlot43.getDatasetGroup();
        java.lang.String str48 = multiplePiePlot43.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = multiplePiePlot43.getDrawingSupplier();
        multiplePiePlot30.setDrawingSupplier(drawingSupplier49);
        java.lang.String str51 = multiplePiePlot30.getPlotType();
        java.awt.Font font52 = multiplePiePlot30.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection28 and legendItemCollection36", legendItemCollection28.equals(legendItemCollection36) ? legendItemCollection28.hashCode() == legendItemCollection36.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setAggregatedItemsPaint(paint20);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        float float26 = multiplePiePlot25.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot25.setDataset(categoryDataset27);
        boolean boolean30 = multiplePiePlot25.equals((java.lang.Object) '#');
        java.lang.String str31 = multiplePiePlot25.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot33.setOutlineStroke(stroke38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = multiplePiePlot41.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = multiplePiePlot41.getDatasetGroup();
        java.awt.Stroke stroke46 = null;
        multiplePiePlot41.setOutlineStroke(stroke46);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot41.getPieChart();
        multiplePiePlot33.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot25.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot14.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot25", multiplePiePlot8.equals(multiplePiePlot25) ? multiplePiePlot8.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        java.lang.Object obj14 = multiplePiePlot1.clone();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.lang.Object obj5 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener12);
        multiplePiePlot7.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot7.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot7.setDataset(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot7.setDataset(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        int int28 = multiplePiePlot27.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        float float31 = multiplePiePlot30.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot30.setOutlineStroke(stroke34);
        float float36 = multiplePiePlot30.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot30.getPieChart();
        multiplePiePlot27.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj5", multiplePiePlot0.equals(obj5) ? multiplePiePlot0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot32.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot32.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.awt.Stroke stroke39 = null;
        multiplePiePlot38.setOutlineStroke(stroke39);
        java.lang.Comparable comparable41 = multiplePiePlot38.getAggregatedItemsKey();
        java.awt.Font font42 = multiplePiePlot38.getNoDataMessageFont();
        multiplePiePlot32.setNoDataMessageFont(font42);
        java.awt.Stroke stroke44 = multiplePiePlot32.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str51 = multiplePiePlot46.getNoDataMessage();
        java.awt.Paint paint52 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot46.setAggregatedItemsPaint(paint52);
        multiplePiePlot32.setNoDataMessagePaint(paint52);
        java.awt.Paint paint55 = multiplePiePlot32.getBackgroundPaint();
        java.awt.Image image56 = null;
        multiplePiePlot32.setBackgroundImage(image56);
        boolean boolean58 = multiplePiePlot1.equals((java.lang.Object) image56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot38", multiplePiePlot1.equals(multiplePiePlot38) ? multiplePiePlot1.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier12);
        float float14 = multiplePiePlot9.getForegroundAlpha();
        multiplePiePlot9.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot18.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot18.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot24.setOutlineStroke(stroke25);
        java.lang.Comparable comparable27 = multiplePiePlot24.getAggregatedItemsKey();
        java.awt.Font font28 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font28);
        java.awt.Stroke stroke30 = multiplePiePlot18.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setNoDataMessage("hi!");
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str37 = multiplePiePlot32.getNoDataMessage();
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot32.setAggregatedItemsPaint(paint38);
        multiplePiePlot18.setNoDataMessagePaint(paint38);
        multiplePiePlot9.setNoDataMessagePaint(paint38);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = null;
        multiplePiePlot43.setDrawingSupplier(drawingSupplier46);
        java.awt.Stroke stroke48 = null;
        multiplePiePlot43.setOutlineStroke(stroke48);
        org.jfree.data.general.DatasetGroup datasetGroup50 = multiplePiePlot43.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart51 = multiplePiePlot43.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        multiplePiePlot55.setNoDataMessage("hi!");
        multiplePiePlot55.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str60 = multiplePiePlot55.getNoDataMessage();
        java.awt.Paint paint61 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot55.setAggregatedItemsPaint(paint61);
        boolean boolean63 = multiplePiePlot55.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = multiplePiePlot55.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot32 and multiplePiePlot55", multiplePiePlot32.equals(multiplePiePlot55) ? multiplePiePlot32.hashCode() == multiplePiePlot55.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot17.setOutlineStroke(stroke18);
        java.lang.Comparable comparable20 = multiplePiePlot17.getAggregatedItemsKey();
        java.awt.Font font21 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot17.zoom((double) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot17.getDataset();
        multiplePiePlot17.setBackgroundImageAlignment(10);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot28.getDataset();
        int int30 = multiplePiePlot28.getBackgroundImageAlignment();
        java.awt.Image image31 = multiplePiePlot28.getBackgroundImage();
        float float32 = multiplePiePlot28.getBackgroundImageAlpha();
        float float33 = multiplePiePlot28.getBackgroundImageAlpha();
        java.lang.Comparable comparable34 = multiplePiePlot28.getAggregatedItemsKey();
        java.awt.Stroke stroke35 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot17.setOutlineStroke(stroke35);
        multiplePiePlot1.setOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot28", multiplePiePlot1.equals(multiplePiePlot28) ? multiplePiePlot1.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot12.getDataset();
        int int14 = multiplePiePlot12.getBackgroundImageAlignment();
        java.awt.Image image15 = multiplePiePlot12.getBackgroundImage();
        float float16 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        boolean boolean22 = multiplePiePlot18.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot18.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setNoDataMessage("hi!");
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener30);
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot25.setBackgroundPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setNoDataMessage("hi!");
        multiplePiePlot35.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener40);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot35.setBackgroundPaint(paint42);
        multiplePiePlot25.setOutlinePaint(paint42);
        org.jfree.chart.util.TableOrder tableOrder45 = multiplePiePlot25.getDataExtractOrder();
        java.awt.Image image46 = null;
        multiplePiePlot25.setBackgroundImage(image46);
        int int48 = multiplePiePlot25.getBackgroundImageAlignment();
        java.awt.Font font49 = multiplePiePlot25.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font49);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent51 = null;
        multiplePiePlot18.datasetChanged(datasetChangeEvent51);
        org.jfree.chart.JFreeChart jFreeChart53 = multiplePiePlot18.getPieChart();
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart53);
        multiplePiePlot1.setPieChart(jFreeChart53);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setNoDataMessage("hi!");
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener62);
        java.awt.Paint paint64 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot57.setBackgroundPaint(paint64);
        java.awt.Paint paint66 = multiplePiePlot57.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot35 and multiplePiePlot57", multiplePiePlot35.equals(multiplePiePlot57) ? multiplePiePlot35.hashCode() == multiplePiePlot57.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset63);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo67 = null;
        multiplePiePlot64.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo67);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent69 = null;
        multiplePiePlot64.datasetChanged(datasetChangeEvent69);
        multiplePiePlot64.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection73 = multiplePiePlot64.getLegendItems();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot23 and multiplePiePlot64", multiplePiePlot23.equals(multiplePiePlot64) ? multiplePiePlot23.hashCode() == multiplePiePlot64.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        java.lang.Object obj13 = multiplePiePlot1.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick(0, 0, plotRenderingInfo16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj13", multiplePiePlot1.equals(obj13) ? multiplePiePlot1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Object obj12 = multiplePiePlot1.clone();
        multiplePiePlot1.zoom((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.lang.Object obj12 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setAggregatedItemsPaint(paint20);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str16 = multiplePiePlot11.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot11.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot11.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot25.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener30);
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot25.setAggregatedItemsPaint(paint32);
        multiplePiePlot20.setOutlinePaint(paint32);
        multiplePiePlot11.setAggregatedItemsPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        multiplePiePlot37.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = null;
        multiplePiePlot37.setDrawingSupplier(drawingSupplier40);
        java.awt.Image image42 = multiplePiePlot37.getBackgroundImage();
        boolean boolean43 = multiplePiePlot11.equals((java.lang.Object) multiplePiePlot37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot25", multiplePiePlot1.equals(multiplePiePlot25) ? multiplePiePlot1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier30);
        float float32 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent33 = null;
        multiplePiePlot27.axisChanged(axisChangeEvent33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        multiplePiePlot27.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo37);
        java.awt.Image image39 = null;
        multiplePiePlot27.setBackgroundImage(image39);
        multiplePiePlot27.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection47 = multiplePiePlot44.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset48 = multiplePiePlot44.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        multiplePiePlot50.setNoDataMessage("hi!");
        multiplePiePlot50.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        multiplePiePlot50.addChangeListener(plotChangeListener55);
        java.awt.Paint paint57 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot50.setBackgroundPaint(paint57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        multiplePiePlot60.setNoDataMessage("hi!");
        multiplePiePlot60.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener65 = null;
        multiplePiePlot60.addChangeListener(plotChangeListener65);
        java.awt.Paint paint67 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot60.setBackgroundPaint(paint67);
        multiplePiePlot50.setOutlinePaint(paint67);
        org.jfree.chart.util.TableOrder tableOrder70 = multiplePiePlot50.getDataExtractOrder();
        multiplePiePlot44.setDataExtractOrder(tableOrder70);
        multiplePiePlot27.setDataExtractOrder(tableOrder70);
        multiplePiePlot1.setDataExtractOrder(tableOrder70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot50", multiplePiePlot1.equals(multiplePiePlot50) ? multiplePiePlot1.hashCode() == multiplePiePlot50.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener14);
        java.lang.Comparable comparable16 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image20 = multiplePiePlot17.getBackgroundImage();
        float float21 = multiplePiePlot17.getBackgroundImageAlpha();
        java.lang.Object obj22 = multiplePiePlot17.clone();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot17 and obj22", multiplePiePlot17.equals(obj22) ? multiplePiePlot17.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setNoDataMessage("hi!");
        boolean boolean11 = multiplePiePlot8.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener18);
        multiplePiePlot13.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        multiplePiePlot13.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot13.setDataset(categoryDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot13.setDataset(categoryDataset28);
        java.awt.Stroke stroke30 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot8.setOutlineStroke(stroke30);
        multiplePiePlot1.setOutlineStroke(stroke30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        multiplePiePlot34.setDrawingSupplier(drawingSupplier37);
        float float39 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent40 = null;
        multiplePiePlot34.axisChanged(axisChangeEvent40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setNoDataMessage("hi!");
        multiplePiePlot43.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str48 = multiplePiePlot43.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset49 = multiplePiePlot43.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        java.awt.Stroke stroke52 = null;
        multiplePiePlot51.setOutlineStroke(stroke52);
        java.awt.Font font54 = multiplePiePlot51.getNoDataMessageFont();
        multiplePiePlot43.setNoDataMessageFont(font54);
        multiplePiePlot34.setNoDataMessageFont(font54);
        multiplePiePlot1.setNoDataMessageFont(font54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot43", multiplePiePlot1.equals(multiplePiePlot43) ? multiplePiePlot1.hashCode() == multiplePiePlot43.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setNoDataMessage("hi!");
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener30);
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot25.setBackgroundPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = null;
        multiplePiePlot35.setDrawingSupplier(drawingSupplier38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot35.setOutlineStroke(stroke40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = multiplePiePlot43.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent45);
        org.jfree.data.general.DatasetGroup datasetGroup47 = multiplePiePlot43.getDatasetGroup();
        java.awt.Stroke stroke48 = null;
        multiplePiePlot43.setOutlineStroke(stroke48);
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot43.getPieChart();
        multiplePiePlot35.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot25.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot17.setPieChart(jFreeChart50);
        float float54 = multiplePiePlot17.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = multiplePiePlot17.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart12 and jFreeChart50", jFreeChart12.equals(jFreeChart50) ? jFreeChart12.hashCode() == jFreeChart50.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.lang.Comparable comparable12 = multiplePiePlot9.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot9.getDataset();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.lang.Object obj19 = multiplePiePlot1.clone();
        java.lang.String str20 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj19", multiplePiePlot1.equals(obj19) ? multiplePiePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot13.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = multiplePiePlot23.getBackgroundPaint();
        float float25 = multiplePiePlot23.getBackgroundImageAlpha();
        java.awt.Paint paint26 = multiplePiePlot23.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot23.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart20 and jFreeChart27", jFreeChart20.equals(jFreeChart27) ? jFreeChart20.hashCode() == jFreeChart27.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot15.setOutlineStroke(stroke19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        java.awt.Font font22 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener33);
        java.lang.Comparable comparable35 = multiplePiePlot26.getAggregatedItemsKey();
        multiplePiePlot26.zoom((double) (-1L));
        java.awt.Font font38 = multiplePiePlot26.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font38);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.awt.Stroke stroke44 = null;
        multiplePiePlot43.setOutlineStroke(stroke44);
        java.lang.Comparable comparable46 = multiplePiePlot43.getAggregatedItemsKey();
        java.awt.Font font47 = multiplePiePlot43.getNoDataMessageFont();
        multiplePiePlot43.zoom((double) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset50 = multiplePiePlot43.getDataset();
        multiplePiePlot43.setBackgroundImageAlignment(10);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = multiplePiePlot54.getDataset();
        int int56 = multiplePiePlot54.getBackgroundImageAlignment();
        java.awt.Image image57 = multiplePiePlot54.getBackgroundImage();
        float float58 = multiplePiePlot54.getBackgroundImageAlpha();
        float float59 = multiplePiePlot54.getBackgroundImageAlpha();
        java.lang.Comparable comparable60 = multiplePiePlot54.getAggregatedItemsKey();
        java.awt.Stroke stroke61 = multiplePiePlot54.getOutlineStroke();
        multiplePiePlot43.setOutlineStroke(stroke61);
        multiplePiePlot1.setOutlineStroke(stroke61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot54", multiplePiePlot8.equals(multiplePiePlot54) ? multiplePiePlot8.hashCode() == multiplePiePlot54.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener26);
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setBackgroundPaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener36);
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot31.setBackgroundPaint(paint38);
        multiplePiePlot21.setOutlinePaint(paint38);
        org.jfree.chart.util.TableOrder tableOrder41 = multiplePiePlot21.getDataExtractOrder();
        java.awt.Image image42 = null;
        multiplePiePlot21.setBackgroundImage(image42);
        int int44 = multiplePiePlot21.getBackgroundImageAlignment();
        java.awt.Font font45 = multiplePiePlot21.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot31", multiplePiePlot7.equals(multiplePiePlot31) ? multiplePiePlot7.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot23.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo26);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        multiplePiePlot23.datasetChanged(datasetChangeEvent28);
        float float30 = multiplePiePlot23.getBackgroundImageAlpha();
        float float31 = multiplePiePlot23.getForegroundAlpha();
        boolean boolean32 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot23);
        java.lang.Object obj33 = multiplePiePlot1.clone();
        double double34 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj33", multiplePiePlot1.equals(obj33) ? multiplePiePlot1.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot9.getDataset();
        int int11 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Image image12 = multiplePiePlot9.getBackgroundImage();
        java.awt.Paint paint13 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier18);
        float float20 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot15.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setBackgroundPaint(paint30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot33.setOutlineStroke(stroke38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = multiplePiePlot41.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent43);
        org.jfree.data.general.DatasetGroup datasetGroup45 = multiplePiePlot41.getDatasetGroup();
        java.awt.Stroke stroke46 = null;
        multiplePiePlot41.setOutlineStroke(stroke46);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot41.getPieChart();
        multiplePiePlot33.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot23.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot15.setPieChart(jFreeChart48);
        float float52 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = multiplePiePlot15.getInsets();
        multiplePiePlot9.setInsets(rectangleInsets53);
        multiplePiePlot1.setInsets(rectangleInsets53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        multiplePiePlot9.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot9.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot9.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot9.setDataset(categoryDataset24);
        java.awt.Stroke stroke26 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot29.setOutlineStroke(stroke30);
        java.awt.Font font32 = multiplePiePlot29.getNoDataMessageFont();
        java.lang.String str33 = multiplePiePlot29.getPlotType();
        java.awt.Paint paint34 = multiplePiePlot29.getNoDataMessagePaint();
        java.awt.Paint paint35 = multiplePiePlot29.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        multiplePiePlot37.setNoDataMessage("hi!");
        multiplePiePlot37.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str42 = multiplePiePlot37.getNoDataMessage();
        java.lang.String str43 = multiplePiePlot37.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot37.getPieChart();
        multiplePiePlot29.setPieChart(jFreeChart44);
        org.jfree.chart.plot.Plot plot46 = multiplePiePlot29.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        multiplePiePlot48.setNoDataMessage("hi!");
        multiplePiePlot48.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener53 = null;
        multiplePiePlot48.addChangeListener(plotChangeListener53);
        multiplePiePlot48.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        multiplePiePlot48.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo59);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        multiplePiePlot48.setDataset(categoryDataset61);
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        multiplePiePlot48.setDataset(categoryDataset63);
        org.jfree.data.general.DatasetGroup datasetGroup65 = multiplePiePlot48.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot67 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset66);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo70 = null;
        multiplePiePlot67.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo70);
        org.jfree.chart.event.PlotChangeListener plotChangeListener72 = null;
        multiplePiePlot67.addChangeListener(plotChangeListener72);
        java.awt.Paint paint74 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot67.setAggregatedItemsPaint(paint74);
        org.jfree.chart.util.TableOrder tableOrder76 = multiplePiePlot67.getDataExtractOrder();
        multiplePiePlot48.setDataExtractOrder(tableOrder76);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent78 = null;
        multiplePiePlot48.datasetChanged(datasetChangeEvent78);
        java.awt.Font font80 = multiplePiePlot48.getNoDataMessageFont();
        multiplePiePlot29.setNoDataMessageFont(font80);
        multiplePiePlot1.setNoDataMessageFont(font80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot48", multiplePiePlot9.equals(multiplePiePlot48) ? multiplePiePlot9.hashCode() == multiplePiePlot48.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener22);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setBackgroundPaint(paint24);
        boolean boolean26 = multiplePiePlot17.isOutlineVisible();
        java.awt.Font font27 = multiplePiePlot17.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str34 = multiplePiePlot29.getNoDataMessage();
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot29.setAggregatedItemsPaint(paint35);
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint39 = multiplePiePlot29.getNoDataMessagePaint();
        multiplePiePlot17.setOutlinePaint(paint39);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) true);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        float float45 = multiplePiePlot44.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent46);
        java.awt.Paint paint48 = multiplePiePlot44.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        java.awt.Stroke stroke51 = null;
        multiplePiePlot50.setOutlineStroke(stroke51);
        java.awt.Font font53 = multiplePiePlot50.getNoDataMessageFont();
        multiplePiePlot44.setNoDataMessageFont(font53);
        java.awt.Paint paint55 = multiplePiePlot44.getBackgroundPaint();
        java.awt.Paint paint56 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot44.setNoDataMessagePaint(paint56);
        multiplePiePlot17.setBackgroundPaint(paint56);
        multiplePiePlot1.setNoDataMessagePaint(paint56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection15", legendItemCollection7.equals(legendItemCollection15) ? legendItemCollection7.hashCode() == legendItemCollection15.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        float float14 = multiplePiePlot13.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.awt.Font font22 = multiplePiePlot19.getNoDataMessageFont();
        multiplePiePlot13.setNoDataMessageFont(font22);
        multiplePiePlot1.setNoDataMessageFont(font22);
        java.awt.Paint paint25 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setNoDataMessage("hi!");
        boolean boolean31 = multiplePiePlot27.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke32 = null;
        multiplePiePlot27.setOutlineStroke(stroke32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot35.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = multiplePiePlot35.getDatasetGroup();
        java.awt.Stroke stroke40 = null;
        multiplePiePlot35.setOutlineStroke(stroke40);
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot35.getPieChart();
        multiplePiePlot27.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot35", multiplePiePlot19.equals(multiplePiePlot35) ? multiplePiePlot19.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        boolean boolean18 = multiplePiePlot14.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot14.setOutlineStroke(stroke19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot22.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo25);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot22.datasetChanged(datasetChangeEvent27);
        multiplePiePlot22.setBackgroundAlpha((float) 1L);
        multiplePiePlot22.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot22.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        float float36 = multiplePiePlot35.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent37);
        multiplePiePlot35.zoom((double) 0.0f);
        multiplePiePlot35.setLimit((double) (-1));
        multiplePiePlot35.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = null;
        multiplePiePlot46.setDrawingSupplier(drawingSupplier49);
        float float51 = multiplePiePlot46.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection52 = multiplePiePlot46.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = multiplePiePlot56.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent58 = null;
        multiplePiePlot56.notifyListeners(plotChangeEvent58);
        org.jfree.data.general.DatasetGroup datasetGroup60 = multiplePiePlot56.getDatasetGroup();
        boolean boolean61 = multiplePiePlot46.equals((java.lang.Object) multiplePiePlot56);
        org.jfree.data.category.CategoryDataset categoryDataset62 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot63 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset62);
        float float64 = multiplePiePlot63.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent65 = null;
        multiplePiePlot63.markerChanged(markerChangeEvent65);
        java.awt.Stroke stroke67 = null;
        multiplePiePlot63.setOutlineStroke(stroke67);
        float float69 = multiplePiePlot63.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart70 = multiplePiePlot63.getPieChart();
        multiplePiePlot56.setPieChart(jFreeChart70);
        multiplePiePlot35.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart70);
        multiplePiePlot22.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart70);
        multiplePiePlot14.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart70);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart8 and jFreeChart70", jFreeChart8.equals(jFreeChart70) ? jFreeChart8.hashCode() == jFreeChart70.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        boolean boolean21 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot24.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image32 = multiplePiePlot29.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.awt.Stroke stroke35 = null;
        multiplePiePlot34.setOutlineStroke(stroke35);
        java.lang.Comparable comparable37 = multiplePiePlot34.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot34.getInsets();
        multiplePiePlot29.setInsets(rectangleInsets38, true);
        multiplePiePlot24.setInsets(rectangleInsets38);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent46 = null;
        multiplePiePlot24.axisChanged(axisChangeEvent46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = multiplePiePlot49.getDataset();
        int int51 = multiplePiePlot49.getBackgroundImageAlignment();
        java.awt.Image image52 = multiplePiePlot49.getBackgroundImage();
        double double53 = multiplePiePlot49.getLimit();
        double double54 = multiplePiePlot49.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        multiplePiePlot56.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo59);
        multiplePiePlot56.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = multiplePiePlot56.getInsets();
        multiplePiePlot49.setInsets(rectangleInsets63);
        multiplePiePlot24.setInsets(rectangleInsets63);
        java.awt.Font font66 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot49", multiplePiePlot11.equals(multiplePiePlot49) ? multiplePiePlot11.hashCode() == multiplePiePlot49.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        java.lang.Object obj14 = multiplePiePlot1.clone();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot15.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setAggregatedItemsPaint(paint22);
        multiplePiePlot1.setBackgroundPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot15", multiplePiePlot8.equals(multiplePiePlot15) ? multiplePiePlot8.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot23.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot23.getDatasetGroup();
        boolean boolean28 = multiplePiePlot13.equals((java.lang.Object) multiplePiePlot23);
        java.lang.Comparable comparable29 = multiplePiePlot13.getAggregatedItemsKey();
        boolean boolean30 = multiplePiePlot1.equals((java.lang.Object) comparable29);
        java.awt.Paint paint31 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        float float34 = multiplePiePlot33.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Stroke stroke37 = null;
        multiplePiePlot33.setOutlineStroke(stroke37);
        float float39 = multiplePiePlot33.getBackgroundImageAlpha();
        boolean boolean40 = multiplePiePlot33.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot33.getDrawingSupplier();
        java.awt.Paint paint42 = multiplePiePlot33.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier11 and drawingSupplier41", drawingSupplier11.equals(drawingSupplier41) ? drawingSupplier11.hashCode() == drawingSupplier41.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Stroke stroke10 = null;
        multiplePiePlot9.setOutlineStroke(stroke10);
        java.awt.Font font12 = multiplePiePlot9.getNoDataMessageFont();
        java.lang.String str13 = multiplePiePlot9.getPlotType();
        java.awt.Paint paint14 = multiplePiePlot9.getNoDataMessagePaint();
        java.awt.Paint paint15 = multiplePiePlot9.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str22 = multiplePiePlot17.getNoDataMessage();
        java.lang.String str23 = multiplePiePlot17.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot17.getPieChart();
        multiplePiePlot9.setPieChart(jFreeChart24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets6, false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        boolean boolean11 = multiplePiePlot1.isSubplot();
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot27.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot27.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot33.setOutlineStroke(stroke34);
        java.lang.Comparable comparable36 = multiplePiePlot33.getAggregatedItemsKey();
        java.awt.Font font37 = multiplePiePlot33.getNoDataMessageFont();
        multiplePiePlot27.setNoDataMessageFont(font37);
        java.awt.Stroke stroke39 = multiplePiePlot27.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        multiplePiePlot41.setNoDataMessage("hi!");
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Font font48 = multiplePiePlot41.getNoDataMessageFont();
        multiplePiePlot27.setNoDataMessageFont(font48);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = multiplePiePlot27.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets52, true);
        multiplePiePlot1.setInsets(rectangleInsets52, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot33", multiplePiePlot1.equals(multiplePiePlot33) ? multiplePiePlot1.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint10 = null;
        multiplePiePlot1.setBackgroundPaint(paint10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        boolean boolean17 = multiplePiePlot13.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot13.setOutlineStroke(stroke18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot21.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot21.getDatasetGroup();
        java.awt.Stroke stroke26 = null;
        multiplePiePlot21.setOutlineStroke(stroke26);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot13.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        float float30 = multiplePiePlot13.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        float float34 = multiplePiePlot33.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Stroke stroke37 = null;
        multiplePiePlot33.setOutlineStroke(stroke37);
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable41 = multiplePiePlot33.getAggregatedItemsKey();
        multiplePiePlot33.setNoDataMessage("");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent44 = null;
        multiplePiePlot33.datasetChanged(datasetChangeEvent44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = multiplePiePlot33.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets46);
        multiplePiePlot1.setInsets(rectangleInsets46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart9 and jFreeChart28", jFreeChart9.equals(jFreeChart28) ? jFreeChart9.hashCode() == jFreeChart28.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot18.setOutlineStroke(stroke19);
        java.lang.Comparable comparable21 = multiplePiePlot18.getAggregatedItemsKey();
        java.lang.Object obj22 = multiplePiePlot18.clone();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot26.setBackgroundPaint(paint33);
        multiplePiePlot18.setOutlinePaint(paint33);
        java.awt.Paint paint36 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        multiplePiePlot39.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = null;
        multiplePiePlot39.setDrawingSupplier(drawingSupplier42);
        float float44 = multiplePiePlot39.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection45 = multiplePiePlot39.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = multiplePiePlot49.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent51 = null;
        multiplePiePlot49.notifyListeners(plotChangeEvent51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = multiplePiePlot49.getDatasetGroup();
        boolean boolean54 = multiplePiePlot39.equals((java.lang.Object) multiplePiePlot49);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        float float57 = multiplePiePlot56.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent58 = null;
        multiplePiePlot56.markerChanged(markerChangeEvent58);
        java.awt.Stroke stroke60 = null;
        multiplePiePlot56.setOutlineStroke(stroke60);
        float float62 = multiplePiePlot56.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart63 = multiplePiePlot56.getPieChart();
        multiplePiePlot49.setPieChart(jFreeChart63);
        float float65 = multiplePiePlot49.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart66 = multiplePiePlot49.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj22 and multiplePiePlot56", obj22.equals(multiplePiePlot56) ? obj22.hashCode() == multiplePiePlot56.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str29 = multiplePiePlot24.getNoDataMessage();
        java.lang.String str30 = multiplePiePlot24.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot24.getPieChart();
        multiplePiePlot21.setPieChart(jFreeChart31);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart19 and jFreeChart31", jFreeChart19.equals(jFreeChart31) ? jFreeChart19.hashCode() == jFreeChart31.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str23 = multiplePiePlot18.getNoDataMessage();
        multiplePiePlot18.setForegroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setNoDataMessage("hi!");
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str32 = multiplePiePlot27.getNoDataMessage();
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot27.setAggregatedItemsPaint(paint33);
        multiplePiePlot18.setOutlinePaint(paint33);
        java.awt.Stroke stroke36 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot18.setOutlineStroke(stroke36);
        multiplePiePlot1.setOutlineStroke(stroke36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot27", multiplePiePlot1.equals(multiplePiePlot27) ? multiplePiePlot1.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        java.lang.Object obj27 = multiplePiePlot1.clone();
        org.jfree.chart.util.TableOrder tableOrder28 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj27", multiplePiePlot1.equals(obj27) ? multiplePiePlot1.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        java.lang.Comparable comparable38 = multiplePiePlot29.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        multiplePiePlot40.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot40.setDrawingSupplier(drawingSupplier43);
        float float45 = multiplePiePlot40.getForegroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot40.getPieChart();
        multiplePiePlot40.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        multiplePiePlot50.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo53);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent55 = null;
        multiplePiePlot50.datasetChanged(datasetChangeEvent55);
        float float57 = multiplePiePlot50.getBackgroundImageAlpha();
        float float58 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        multiplePiePlot60.setNoDataMessage("hi!");
        multiplePiePlot60.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        multiplePiePlot66.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier69 = null;
        multiplePiePlot66.setDrawingSupplier(drawingSupplier69);
        float float71 = multiplePiePlot66.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection72 = multiplePiePlot66.getLegendItems();
        org.jfree.chart.plot.Plot plot73 = multiplePiePlot66.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset74 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot75 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset74);
        java.awt.Stroke stroke76 = null;
        multiplePiePlot75.setOutlineStroke(stroke76);
        java.lang.Comparable comparable78 = multiplePiePlot75.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets79 = multiplePiePlot75.getInsets();
        plot73.setInsets(rectangleInsets79, false);
        multiplePiePlot60.setInsets(rectangleInsets79, false);
        multiplePiePlot60.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = multiplePiePlot60.getInsets();
        multiplePiePlot50.setInsets(rectangleInsets86);
        multiplePiePlot40.setInsets(rectangleInsets86);
        org.jfree.chart.util.RectangleInsets rectangleInsets89 = multiplePiePlot40.getInsets();
        multiplePiePlot29.setInsets(rectangleInsets89, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot75", multiplePiePlot9.equals(multiplePiePlot75) ? multiplePiePlot9.hashCode() == multiplePiePlot75.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setNoDataMessage("hi!");
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener26);
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setBackgroundPaint(paint28);
        multiplePiePlot11.setOutlinePaint(paint28);
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot11.getDataExtractOrder();
        float float32 = multiplePiePlot11.getBackgroundImageAlpha();
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
        multiplePiePlot11.setOutlineStroke(stroke51);
        multiplePiePlot11.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        multiplePiePlot56.setNoDataMessage("hi!");
        boolean boolean60 = multiplePiePlot56.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke61 = null;
        multiplePiePlot56.setOutlineStroke(stroke61);
        org.jfree.data.general.DatasetGroup datasetGroup63 = multiplePiePlot56.getDatasetGroup();
        java.awt.Image image64 = null;
        multiplePiePlot56.setBackgroundImage(image64);
        float float66 = multiplePiePlot56.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset67 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot68 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset67);
        multiplePiePlot68.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier71 = null;
        multiplePiePlot68.setDrawingSupplier(drawingSupplier71);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent73 = null;
        multiplePiePlot68.axisChanged(axisChangeEvent73);
        org.jfree.data.category.CategoryDataset categoryDataset75 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot76 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset75);
        int int77 = multiplePiePlot76.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset78 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot79 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset78);
        float float80 = multiplePiePlot79.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent81 = null;
        multiplePiePlot79.markerChanged(markerChangeEvent81);
        java.awt.Stroke stroke83 = null;
        multiplePiePlot79.setOutlineStroke(stroke83);
        float float85 = multiplePiePlot79.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart86 = multiplePiePlot79.getPieChart();
        multiplePiePlot76.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart86);
        multiplePiePlot68.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart86);
        multiplePiePlot56.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart86);
        multiplePiePlot11.setPieChart(jFreeChart86);
        org.jfree.chart.JFreeChart jFreeChart91 = multiplePiePlot11.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot76", multiplePiePlot1.equals(multiplePiePlot76) ? multiplePiePlot1.hashCode() == multiplePiePlot76.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        int int19 = multiplePiePlot18.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot21.setOutlineStroke(stroke25);
        float float27 = multiplePiePlot21.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot10.setPieChart(jFreeChart28);
        float float31 = multiplePiePlot10.getBackgroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent10);
        java.awt.Stroke stroke12 = multiplePiePlot8.getOutlineStroke();
        multiplePiePlot8.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot8.setNoDataMessage("Multiple Pie Plot");
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier24);
        float float26 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection27 = multiplePiePlot21.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot31.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = multiplePiePlot31.getDatasetGroup();
        boolean boolean36 = multiplePiePlot21.equals((java.lang.Object) multiplePiePlot31);
        java.awt.Paint paint37 = multiplePiePlot21.getBackgroundPaint();
        multiplePiePlot8.setBackgroundPaint(paint37);
        plot6.setBackgroundPaint(paint37);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        java.awt.Stroke stroke42 = null;
        multiplePiePlot41.setOutlineStroke(stroke42);
        java.lang.Comparable comparable44 = multiplePiePlot41.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset45 = multiplePiePlot41.getDataset();
        java.awt.Image image46 = null;
        multiplePiePlot41.setBackgroundImage(image46);
        java.lang.Object obj48 = multiplePiePlot41.clone();
        plot6.setParent((org.jfree.chart.plot.Plot) multiplePiePlot41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot6 and multiplePiePlot41", plot6.equals(multiplePiePlot41) ? plot6.hashCode() == multiplePiePlot41.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent19);
        java.lang.String str21 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Stroke stroke24 = null;
        multiplePiePlot23.setOutlineStroke(stroke24);
        java.lang.Comparable comparable26 = multiplePiePlot23.getAggregatedItemsKey();
        int int27 = multiplePiePlot23.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        multiplePiePlot29.setNoDataMessage("hi!");
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str34 = multiplePiePlot29.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot29.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot29.getDatasetGroup();
        multiplePiePlot23.setParent((org.jfree.chart.plot.Plot) multiplePiePlot29);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot23.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets38, false);
        multiplePiePlot10.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets43, true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot46.setForegroundAlpha((float) (short) -1);
        int int49 = multiplePiePlot46.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset50 = multiplePiePlot46.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        java.awt.Stroke stroke53 = null;
        multiplePiePlot52.setOutlineStroke(stroke53);
        java.lang.Comparable comparable55 = multiplePiePlot52.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset56 = multiplePiePlot52.getDataset();
        org.jfree.chart.util.TableOrder tableOrder57 = multiplePiePlot52.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder58 = multiplePiePlot52.getDataExtractOrder();
        multiplePiePlot46.setDataExtractOrder(tableOrder58);
        multiplePiePlot1.setDataExtractOrder(tableOrder58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot23 and multiplePiePlot52", multiplePiePlot23.equals(multiplePiePlot52) ? multiplePiePlot23.hashCode() == multiplePiePlot52.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot28.setOutlineStroke(stroke29);
        java.awt.Font font31 = multiplePiePlot28.getNoDataMessageFont();
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable34 = multiplePiePlot28.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        multiplePiePlot36.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        multiplePiePlot36.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        multiplePiePlot36.setDataset(categoryDataset49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        multiplePiePlot36.setDataset(categoryDataset51);
        java.awt.Stroke stroke53 = multiplePiePlot36.getOutlineStroke();
        multiplePiePlot28.setOutlineStroke(stroke53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        multiplePiePlot56.setNoDataMessage("hi!");
        boolean boolean60 = multiplePiePlot56.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke61 = null;
        multiplePiePlot56.setOutlineStroke(stroke61);
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset63);
        org.jfree.data.category.CategoryDataset categoryDataset65 = multiplePiePlot64.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent66 = null;
        multiplePiePlot64.notifyListeners(plotChangeEvent66);
        org.jfree.data.general.DatasetGroup datasetGroup68 = multiplePiePlot64.getDatasetGroup();
        java.awt.Stroke stroke69 = null;
        multiplePiePlot64.setOutlineStroke(stroke69);
        org.jfree.chart.JFreeChart jFreeChart71 = multiplePiePlot64.getPieChart();
        multiplePiePlot56.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart71);
        multiplePiePlot28.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart71);
        multiplePiePlot1.setPieChart(jFreeChart71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot64", multiplePiePlot7.equals(multiplePiePlot64) ? multiplePiePlot7.hashCode() == multiplePiePlot64.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = multiplePiePlot10.getBackgroundPaint();
        float float12 = multiplePiePlot10.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener19);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setBackgroundPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setBackgroundPaint(paint31);
        multiplePiePlot14.setOutlinePaint(paint31);
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot10.setDataExtractOrder(tableOrder34);
        multiplePiePlot1.setDataExtractOrder(tableOrder34);
        boolean boolean37 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        multiplePiePlot39.setNoDataMessage("hi!");
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str44 = multiplePiePlot39.getNoDataMessage();
        java.awt.Paint paint45 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot39.setAggregatedItemsPaint(paint45);
        boolean boolean47 = multiplePiePlot39.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = multiplePiePlot39.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        multiplePiePlot50.markerChanged(markerChangeEvent52);
        java.awt.Paint paint54 = multiplePiePlot50.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset55 = multiplePiePlot50.getDataset();
        java.awt.Paint paint56 = multiplePiePlot50.getOutlinePaint();
        multiplePiePlot39.setNoDataMessagePaint(paint56);
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot59 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset58);
        multiplePiePlot59.setNoDataMessage("hi!");
        boolean boolean63 = multiplePiePlot59.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        multiplePiePlot59.drawBackgroundImage(graphics2D64, rectangle2D65);
        java.awt.Font font67 = multiplePiePlot59.getNoDataMessageFont();
        multiplePiePlot39.setNoDataMessageFont(font67);
        multiplePiePlot1.setNoDataMessageFont(font67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot50", multiplePiePlot10.equals(multiplePiePlot50) ? multiplePiePlot10.hashCode() == multiplePiePlot50.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot9.axisChanged(axisChangeEvent12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot9.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        int int18 = multiplePiePlot17.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Stroke stroke24 = null;
        multiplePiePlot20.setOutlineStroke(stroke24);
        float float26 = multiplePiePlot20.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot20.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        multiplePiePlot9.setPieChart(jFreeChart27);
        java.awt.Font font30 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        multiplePiePlot33.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo36);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent38 = null;
        multiplePiePlot33.datasetChanged(datasetChangeEvent38);
        multiplePiePlot33.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection42 = multiplePiePlot33.getLegendItems();
        float float43 = multiplePiePlot33.getForegroundAlpha();
        int int44 = multiplePiePlot33.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str51 = multiplePiePlot46.getNoDataMessage();
        java.awt.Paint paint52 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot46.setAggregatedItemsPaint(paint52);
        boolean boolean54 = multiplePiePlot46.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = multiplePiePlot46.getInsets();
        multiplePiePlot33.setInsets(rectangleInsets55, false);
        multiplePiePlot1.setInsets(rectangleInsets55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot46", multiplePiePlot1.equals(multiplePiePlot46) ? multiplePiePlot1.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        java.awt.Stroke stroke47 = null;
        multiplePiePlot46.setOutlineStroke(stroke47);
        java.lang.Comparable comparable49 = multiplePiePlot46.getAggregatedItemsKey();
        java.awt.Font font50 = multiplePiePlot46.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent51 = null;
        multiplePiePlot46.axisChanged(axisChangeEvent51);
        java.lang.String str53 = multiplePiePlot46.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = multiplePiePlot55.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        multiplePiePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.data.general.DatasetGroup datasetGroup59 = multiplePiePlot55.getDatasetGroup();
        java.lang.String str60 = multiplePiePlot55.getPlotType();
        java.awt.Stroke stroke61 = null;
        multiplePiePlot55.setOutlineStroke(stroke61);
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset63);
        float float65 = multiplePiePlot64.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent66 = null;
        multiplePiePlot64.notifyListeners(plotChangeEvent66);
        multiplePiePlot64.zoom((double) 0.0f);
        multiplePiePlot64.setLimit((double) (-1));
        java.awt.Paint paint72 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot64.setBackgroundPaint(paint72);
        multiplePiePlot55.setNoDataMessagePaint(paint72);
        multiplePiePlot46.setAggregatedItemsPaint(paint72);
        multiplePiePlot1.setAggregatedItemsPaint(paint72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot46", multiplePiePlot19.equals(multiplePiePlot46) ? multiplePiePlot19.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot11.drawBackgroundImage(graphics2D16, rectangle2D17);
        multiplePiePlot11.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot11.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot11.removeChangeListener(plotChangeListener25);
        java.awt.Stroke stroke27 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke27);
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        boolean boolean31 = multiplePiePlot1.isOutlineVisible();
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
        multiplePiePlot1.setInsets(rectangleInsets56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot33", multiplePiePlot11.equals(multiplePiePlot33) ? multiplePiePlot11.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier33);
        float float35 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        float float38 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot37.notifyListeners(plotChangeEvent39);
        java.lang.Class<?> wildcardClass41 = multiplePiePlot37.getClass();
        boolean boolean42 = multiplePiePlot30.equals((java.lang.Object) wildcardClass41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        float float45 = multiplePiePlot44.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent46);
        java.awt.Stroke stroke48 = null;
        multiplePiePlot44.setOutlineStroke(stroke48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = multiplePiePlot44.getDataset();
        java.awt.Font font51 = multiplePiePlot44.getNoDataMessageFont();
        multiplePiePlot30.setNoDataMessageFont(font51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = multiplePiePlot30.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        multiplePiePlot55.setNoDataMessage("hi!");
        multiplePiePlot55.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener60 = null;
        multiplePiePlot55.addChangeListener(plotChangeListener60);
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        multiplePiePlot55.addChangeListener(plotChangeListener62);
        java.lang.Comparable comparable64 = multiplePiePlot55.getAggregatedItemsKey();
        multiplePiePlot55.zoom((double) (-1L));
        java.awt.Font font67 = multiplePiePlot55.getNoDataMessageFont();
        multiplePiePlot30.setNoDataMessageFont(font67);
        org.jfree.chart.JFreeChart jFreeChart69 = multiplePiePlot30.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot37", multiplePiePlot11.equals(multiplePiePlot37) ? multiplePiePlot11.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener15);
        multiplePiePlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot10.getOutlinePaint();
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
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        multiplePiePlot1.setPieChart(jFreeChart33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        java.lang.Object obj17 = multiplePiePlot11.clone();
        java.awt.Image image18 = null;
        multiplePiePlot11.setBackgroundImage(image18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj17", multiplePiePlot11.equals(obj17) ? multiplePiePlot11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot13.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot13.getDatasetGroup();
        java.awt.Image image18 = null;
        multiplePiePlot13.setBackgroundImage(image18);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot1.getPieChart();
        java.lang.String str22 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot24.setDataset(categoryDataset26);
        boolean boolean29 = multiplePiePlot24.equals((java.lang.Object) '#');
        java.lang.String str30 = multiplePiePlot24.getPlotType();
        boolean boolean31 = multiplePiePlot24.isSubplot();
        boolean boolean32 = multiplePiePlot1.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot24", multiplePiePlot13.equals(multiplePiePlot24) ? multiplePiePlot13.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        java.awt.Paint paint17 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot19.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot19.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Stroke stroke26 = null;
        multiplePiePlot25.setOutlineStroke(stroke26);
        java.lang.Comparable comparable28 = multiplePiePlot25.getAggregatedItemsKey();
        java.awt.Font font29 = multiplePiePlot25.getNoDataMessageFont();
        multiplePiePlot19.setNoDataMessageFont(font29);
        multiplePiePlot19.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        multiplePiePlot34.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo37);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent39 = null;
        multiplePiePlot34.datasetChanged(datasetChangeEvent39);
        multiplePiePlot34.setBackgroundAlpha((float) 1L);
        multiplePiePlot34.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = multiplePiePlot34.getInsets();
        multiplePiePlot19.setInsets(rectangleInsets45);
        multiplePiePlot1.setInsets(rectangleInsets45, true);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = multiplePiePlot50.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        multiplePiePlot50.notifyListeners(plotChangeEvent52);
        org.jfree.data.general.DatasetGroup datasetGroup54 = multiplePiePlot50.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        java.awt.Stroke stroke57 = null;
        multiplePiePlot56.setOutlineStroke(stroke57);
        java.lang.Comparable comparable59 = multiplePiePlot56.getAggregatedItemsKey();
        java.awt.Font font60 = multiplePiePlot56.getNoDataMessageFont();
        multiplePiePlot50.setNoDataMessageFont(font60);
        java.awt.Stroke stroke62 = multiplePiePlot50.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset63);
        multiplePiePlot64.setNoDataMessage("hi!");
        multiplePiePlot64.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str69 = multiplePiePlot64.getNoDataMessage();
        java.awt.Paint paint70 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot64.setAggregatedItemsPaint(paint70);
        multiplePiePlot50.setNoDataMessagePaint(paint70);
        org.jfree.data.category.CategoryDataset categoryDataset73 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot74 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset73);
        multiplePiePlot74.setNoDataMessage("hi!");
        multiplePiePlot74.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener79 = null;
        multiplePiePlot74.addChangeListener(plotChangeListener79);
        multiplePiePlot74.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo85 = null;
        multiplePiePlot74.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo85);
        org.jfree.data.category.CategoryDataset categoryDataset87 = null;
        multiplePiePlot74.setDataset(categoryDataset87);
        java.awt.Paint paint89 = multiplePiePlot74.getOutlinePaint();
        java.awt.Paint paint90 = multiplePiePlot74.getNoDataMessagePaint();
        multiplePiePlot50.setBackgroundPaint(paint90);
        multiplePiePlot1.setOutlinePaint(paint90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot25 and multiplePiePlot56", multiplePiePlot25.equals(multiplePiePlot56) ? multiplePiePlot25.hashCode() == multiplePiePlot56.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Object obj6 = multiplePiePlot1.clone();
        java.lang.Object obj7 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj6", multiplePiePlot1.equals(obj6) ? multiplePiePlot1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        java.lang.Object obj13 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj13", multiplePiePlot1.equals(obj13) ? multiplePiePlot1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot12.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot12.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot18.setOutlineStroke(stroke19);
        java.lang.Comparable comparable21 = multiplePiePlot18.getAggregatedItemsKey();
        java.awt.Font font22 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot12.setNoDataMessageFont(font22);
        java.awt.Stroke stroke24 = multiplePiePlot12.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Font font33 = multiplePiePlot26.getNoDataMessageFont();
        multiplePiePlot12.setNoDataMessageFont(font33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = multiplePiePlot12.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        float float38 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot37.markerChanged(markerChangeEvent39);
        java.awt.Stroke stroke41 = null;
        multiplePiePlot37.setOutlineStroke(stroke41);
        multiplePiePlot37.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint45 = multiplePiePlot37.getBackgroundPaint();
        java.awt.Image image46 = multiplePiePlot37.getBackgroundImage();
        double double47 = multiplePiePlot37.getLimit();
        org.jfree.chart.util.TableOrder tableOrder48 = multiplePiePlot37.getDataExtractOrder();
        multiplePiePlot12.setDataExtractOrder(tableOrder48);
        multiplePiePlot1.setDataExtractOrder(tableOrder48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.zoom(0.0d);
        java.awt.Image image12 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        boolean boolean18 = multiplePiePlot14.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot14.setOutlineStroke(stroke19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot14.getDatasetGroup();
        java.awt.Image image22 = null;
        multiplePiePlot14.setBackgroundImage(image22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot14.getDrawingSupplier();
        java.lang.Object obj25 = multiplePiePlot14.clone();
        boolean boolean26 = multiplePiePlot1.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and obj25", multiplePiePlot14.equals(obj25) ? multiplePiePlot14.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
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
        java.awt.Stroke stroke32 = multiplePiePlot15.getOutlineStroke();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart11 and jFreeChart33", jFreeChart11.equals(jFreeChart33) ? jFreeChart11.hashCode() == jFreeChart33.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setNoDataMessage("hi!");
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float21 = multiplePiePlot16.getBackgroundImageAlpha();
        java.awt.Font font22 = multiplePiePlot16.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        multiplePiePlot24.axisChanged(axisChangeEvent27);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        multiplePiePlot24.axisChanged(axisChangeEvent29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        int int33 = multiplePiePlot32.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        float float36 = multiplePiePlot35.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot35.markerChanged(markerChangeEvent37);
        java.awt.Stroke stroke39 = null;
        multiplePiePlot35.setOutlineStroke(stroke39);
        float float41 = multiplePiePlot35.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot35.getPieChart();
        multiplePiePlot32.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        multiplePiePlot24.setPieChart(jFreeChart42);
        java.awt.Font font45 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot16.setNoDataMessageFont(font45);
        multiplePiePlot1.setNoDataMessageFont(font45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart42", jFreeChart10.equals(jFreeChart42) ? jFreeChart10.hashCode() == jFreeChart42.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier15);
        float float17 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot12.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot22.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot22.getDatasetGroup();
        boolean boolean27 = multiplePiePlot12.equals((java.lang.Object) multiplePiePlot22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot29.setOutlineStroke(stroke33);
        float float35 = multiplePiePlot29.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot29.getPieChart();
        multiplePiePlot22.setPieChart(jFreeChart36);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart36);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = multiplePiePlot40.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent42 = null;
        multiplePiePlot40.notifyListeners(plotChangeEvent42);
        org.jfree.data.general.DatasetGroup datasetGroup44 = multiplePiePlot40.getDatasetGroup();
        java.lang.String str45 = multiplePiePlot40.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = multiplePiePlot40.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot22 and multiplePiePlot40", multiplePiePlot22.equals(multiplePiePlot40) ? multiplePiePlot22.hashCode() == multiplePiePlot40.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot13.getRootPlot();
        java.awt.Paint paint21 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection10 and legendItemCollection19", legendItemCollection10.equals(legendItemCollection19) ? legendItemCollection10.hashCode() == legendItemCollection19.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier26);
        float float28 = multiplePiePlot23.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = multiplePiePlot23.getLegendItems();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot23.getRootPlot();
        float float31 = multiplePiePlot23.getBackgroundImageAlpha();
        java.awt.Image image32 = multiplePiePlot23.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier33);
        multiplePiePlot23.setForegroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        multiplePiePlot38.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo41);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent43 = null;
        multiplePiePlot38.datasetChanged(datasetChangeEvent43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float51 = multiplePiePlot46.getBackgroundImageAlpha();
        java.awt.Font font52 = multiplePiePlot46.getNoDataMessageFont();
        multiplePiePlot38.setNoDataMessageFont(font52);
        org.jfree.chart.JFreeChart jFreeChart54 = multiplePiePlot38.getPieChart();
        multiplePiePlot23.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = null;
        multiplePiePlot57.setDrawingSupplier(drawingSupplier60);
        float float62 = multiplePiePlot57.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot63 = multiplePiePlot57.getParent();
        multiplePiePlot57.setBackgroundAlpha((float) 1L);
        java.lang.String str66 = multiplePiePlot57.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = multiplePiePlot57.getInsets();
        multiplePiePlot23.setInsets(rectangleInsets67, false);
        multiplePiePlot1.setInsets(rectangleInsets67, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot46", multiplePiePlot1.equals(multiplePiePlot46) ? multiplePiePlot1.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setNoDataMessage("hi!");
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.Object obj32 = multiplePiePlot27.clone();
        multiplePiePlot27.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = multiplePiePlot27.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and obj32", multiplePiePlot14.equals(obj32) ? multiplePiePlot14.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.zoom((double) 'a');
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot10.setDataset(categoryDataset12);
        boolean boolean15 = multiplePiePlot10.equals((java.lang.Object) '#');
        java.awt.Paint paint16 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        java.awt.Paint paint54 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier55 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = null;
        multiplePiePlot57.setDrawingSupplier(drawingSupplier60);
        java.awt.Stroke stroke62 = null;
        multiplePiePlot57.setOutlineStroke(stroke62);
        org.jfree.data.general.DatasetGroup datasetGroup64 = multiplePiePlot57.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart65 = multiplePiePlot57.getPieChart();
        java.lang.Comparable comparable66 = multiplePiePlot57.getAggregatedItemsKey();
        java.awt.Paint paint67 = multiplePiePlot57.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart50 and jFreeChart65", jFreeChart50.equals(jFreeChart65) ? jFreeChart50.hashCode() == jFreeChart65.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image16 = multiplePiePlot1.getBackgroundImage();
        java.lang.Object obj17 = multiplePiePlot1.clone();
        float float18 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj17", multiplePiePlot1.equals(obj17) ? multiplePiePlot1.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.zoom((double) 0.5f);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot11.setOutlineStroke(stroke12);
        java.awt.Font font14 = multiplePiePlot11.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot11.getParent();
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
        org.jfree.chart.util.TableOrder tableOrder37 = multiplePiePlot17.getDataExtractOrder();
        multiplePiePlot11.setDataExtractOrder(tableOrder37);
        multiplePiePlot1.setDataExtractOrder(tableOrder37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot27", multiplePiePlot1.equals(multiplePiePlot27) ? multiplePiePlot1.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        boolean boolean43 = multiplePiePlot34.isOutlineVisible();
        java.awt.Font font44 = multiplePiePlot34.getNoDataMessageFont();
        java.awt.Paint paint45 = multiplePiePlot34.getBackgroundPaint();
        multiplePiePlot8.setNoDataMessagePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot34", multiplePiePlot18.equals(multiplePiePlot34) ? multiplePiePlot18.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.lang.Object obj8 = multiplePiePlot1.clone();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj8", multiplePiePlot1.equals(obj8) ? multiplePiePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot13.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo16);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        multiplePiePlot13.datasetChanged(datasetChangeEvent18);
        float float20 = multiplePiePlot13.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot24.setOutlineStroke(stroke28);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable32 = multiplePiePlot24.getAggregatedItemsKey();
        multiplePiePlot24.setNoDataMessage("");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent35 = null;
        multiplePiePlot24.datasetChanged(datasetChangeEvent35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = multiplePiePlot24.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets37, false);
        multiplePiePlot1.setInsets(rectangleInsets37);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        float float45 = multiplePiePlot44.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent46);
        java.awt.Stroke stroke48 = null;
        multiplePiePlot44.setOutlineStroke(stroke48);
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable52 = multiplePiePlot44.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        multiplePiePlot54.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo57);
        org.jfree.chart.event.PlotChangeListener plotChangeListener59 = null;
        multiplePiePlot54.addChangeListener(plotChangeListener59);
        java.awt.Paint paint61 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot54.setAggregatedItemsPaint(paint61);
        multiplePiePlot44.setBackgroundPaint(paint61);
        org.jfree.data.category.CategoryDataset categoryDataset64 = null;
        multiplePiePlot44.setDataset(categoryDataset64);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot54", multiplePiePlot13.equals(multiplePiePlot54) ? multiplePiePlot13.hashCode() == multiplePiePlot54.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image15 = multiplePiePlot12.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Stroke stroke27 = null;
        multiplePiePlot26.setOutlineStroke(stroke27);
        java.lang.Comparable comparable29 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot26.getInsets();
        plot24.setInsets(rectangleInsets30, false);
        multiplePiePlot12.setInsets(rectangleInsets30, false);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        org.jfree.chart.util.TableOrder tableOrder43 = multiplePiePlot36.getDataExtractOrder();
        multiplePiePlot12.setDataExtractOrder(tableOrder43);
        org.jfree.chart.plot.Plot plot45 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = plot45.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot8.getRootPlot();
        float float16 = multiplePiePlot8.getBackgroundImageAlpha();
        java.awt.Image image17 = multiplePiePlot8.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot8.setForegroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot23.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo26);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        multiplePiePlot23.datasetChanged(datasetChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float36 = multiplePiePlot31.getBackgroundImageAlpha();
        java.awt.Font font37 = multiplePiePlot31.getNoDataMessageFont();
        multiplePiePlot23.setNoDataMessageFont(font37);
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot23.getPieChart();
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = null;
        multiplePiePlot42.setDrawingSupplier(drawingSupplier45);
        float float47 = multiplePiePlot42.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot48 = multiplePiePlot42.getParent();
        multiplePiePlot42.setBackgroundAlpha((float) 1L);
        java.lang.String str51 = multiplePiePlot42.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = multiplePiePlot42.getInsets();
        multiplePiePlot8.setInsets(rectangleInsets52, false);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot23", multiplePiePlot1.equals(multiplePiePlot23) ? multiplePiePlot1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        float float18 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent22);
        java.lang.Class<?> wildcardClass24 = multiplePiePlot20.getClass();
        boolean boolean25 = multiplePiePlot13.equals((java.lang.Object) wildcardClass24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        float float28 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Stroke stroke31 = null;
        multiplePiePlot27.setOutlineStroke(stroke31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot27.getDataset();
        java.awt.Font font34 = multiplePiePlot27.getNoDataMessageFont();
        multiplePiePlot13.setNoDataMessageFont(font34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = multiplePiePlot13.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        multiplePiePlot38.setNoDataMessage("hi!");
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener43);
        org.jfree.chart.event.PlotChangeListener plotChangeListener45 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener45);
        java.lang.Comparable comparable47 = multiplePiePlot38.getAggregatedItemsKey();
        multiplePiePlot38.zoom((double) (-1L));
        java.awt.Font font50 = multiplePiePlot38.getNoDataMessageFont();
        multiplePiePlot13.setNoDataMessageFont(font50);
        org.jfree.chart.JFreeChart jFreeChart52 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot27", obj5.equals(multiplePiePlot27) ? obj5.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot12.setOutlineStroke(stroke16);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable20 = multiplePiePlot12.getAggregatedItemsKey();
        multiplePiePlot12.setNoDataMessage("");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot12.datasetChanged(datasetChangeEvent23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets25, false);
        int int28 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        multiplePiePlot31.setNoDataMessage("hi!");
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener36);
        multiplePiePlot31.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent40);
        java.lang.String str42 = multiplePiePlot31.getNoDataMessage();
        multiplePiePlot31.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = multiplePiePlot46.getDataset();
        int int48 = multiplePiePlot46.getBackgroundImageAlignment();
        java.awt.Image image49 = multiplePiePlot46.getBackgroundImage();
        double double50 = multiplePiePlot46.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection51 = multiplePiePlot46.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        float float54 = multiplePiePlot53.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        multiplePiePlot53.markerChanged(markerChangeEvent55);
        java.awt.Stroke stroke57 = null;
        multiplePiePlot53.setOutlineStroke(stroke57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = multiplePiePlot53.getDataset();
        java.awt.Font font60 = multiplePiePlot53.getNoDataMessageFont();
        java.awt.Paint paint61 = multiplePiePlot53.getNoDataMessagePaint();
        boolean boolean62 = multiplePiePlot46.equals((java.lang.Object) multiplePiePlot53);
        java.lang.String str63 = multiplePiePlot53.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot64.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image67 = multiplePiePlot64.getBackgroundImage();
        int int68 = multiplePiePlot64.getBackgroundImageAlignment();
        float float69 = multiplePiePlot64.getForegroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup70 = multiplePiePlot64.getDatasetGroup();
        java.awt.Paint paint71 = multiplePiePlot64.getAggregatedItemsPaint();
        multiplePiePlot53.setBackgroundPaint(paint71);
        multiplePiePlot31.setAggregatedItemsPaint(paint71);
        multiplePiePlot1.setBackgroundPaint(paint71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot46", multiplePiePlot1.equals(multiplePiePlot46) ? multiplePiePlot1.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setForegroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier20);
        float float22 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot17.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Stroke stroke27 = null;
        multiplePiePlot26.setOutlineStroke(stroke27);
        java.lang.Comparable comparable29 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot26.getInsets();
        plot24.setInsets(rectangleInsets30, false);
        multiplePiePlot11.setInsets(rectangleInsets30, false);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = multiplePiePlot11.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets37, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str15 = multiplePiePlot10.getNoDataMessage();
        java.lang.String str16 = multiplePiePlot10.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener27);
        java.lang.Comparable comparable29 = multiplePiePlot20.getAggregatedItemsKey();
        multiplePiePlot20.zoom((double) (-1L));
        java.awt.Font font32 = multiplePiePlot20.getNoDataMessageFont();
        java.awt.Paint paint33 = multiplePiePlot20.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot20", multiplePiePlot10.equals(multiplePiePlot20) ? multiplePiePlot10.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        java.lang.Object obj10 = multiplePiePlot1.clone();
        boolean boolean11 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        multiplePiePlot21.setNoDataMessage("hi!");
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot21.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener35);
        multiplePiePlot30.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        multiplePiePlot30.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        multiplePiePlot30.setDataset(categoryDataset43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        multiplePiePlot30.setDataset(categoryDataset45);
        org.jfree.data.general.DatasetGroup datasetGroup47 = multiplePiePlot30.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        multiplePiePlot49.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo52);
        org.jfree.chart.event.PlotChangeListener plotChangeListener54 = null;
        multiplePiePlot49.addChangeListener(plotChangeListener54);
        java.awt.Paint paint56 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot49.setAggregatedItemsPaint(paint56);
        org.jfree.chart.util.TableOrder tableOrder58 = multiplePiePlot49.getDataExtractOrder();
        multiplePiePlot30.setDataExtractOrder(tableOrder58);
        boolean boolean60 = multiplePiePlot30.isSubplot();
        java.awt.Font font61 = multiplePiePlot30.getNoDataMessageFont();
        multiplePiePlot21.setNoDataMessageFont(font61);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot30", multiplePiePlot1.equals(multiplePiePlot30) ? multiplePiePlot1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        int int14 = multiplePiePlot13.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot16.setOutlineStroke(stroke20);
        float float22 = multiplePiePlot16.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot16.getPieChart();
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.awt.Stroke stroke27 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart8 and jFreeChart23", jFreeChart8.equals(jFreeChart23) ? jFreeChart8.hashCode() == jFreeChart23.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot5.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot5.datasetChanged(datasetChangeEvent10);
        float float12 = multiplePiePlot5.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot5.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier13);
        java.awt.Image image15 = null;
        multiplePiePlot0.setBackgroundImage(image15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot20.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo23);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent25 = null;
        multiplePiePlot20.datasetChanged(datasetChangeEvent25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        multiplePiePlot28.setNoDataMessage("hi!");
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float33 = multiplePiePlot28.getBackgroundImageAlpha();
        java.awt.Font font34 = multiplePiePlot28.getNoDataMessageFont();
        multiplePiePlot20.setNoDataMessageFont(font34);
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot20.getPieChart();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot20", multiplePiePlot5.equals(multiplePiePlot20) ? multiplePiePlot5.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot15.setOutlineStroke(stroke19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        java.awt.Font font22 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        multiplePiePlot26.setNoDataMessage("hi!");
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot26.addChangeListener(plotChangeListener33);
        java.lang.Comparable comparable35 = multiplePiePlot26.getAggregatedItemsKey();
        multiplePiePlot26.zoom((double) (-1L));
        java.awt.Font font38 = multiplePiePlot26.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font38);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Font font42 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent43);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent45 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        multiplePiePlot48.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = null;
        multiplePiePlot48.setDrawingSupplier(drawingSupplier51);
        float float53 = multiplePiePlot48.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection54 = multiplePiePlot48.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        multiplePiePlot48.markerChanged(markerChangeEvent55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = multiplePiePlot58.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent60 = null;
        multiplePiePlot58.notifyListeners(plotChangeEvent60);
        org.jfree.data.general.DatasetGroup datasetGroup62 = multiplePiePlot58.getDatasetGroup();
        boolean boolean63 = multiplePiePlot48.equals((java.lang.Object) multiplePiePlot58);
        org.jfree.data.category.CategoryDataset categoryDataset64 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot65 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset64);
        org.jfree.data.category.CategoryDataset categoryDataset66 = multiplePiePlot65.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent67 = null;
        multiplePiePlot65.notifyListeners(plotChangeEvent67);
        org.jfree.data.general.DatasetGroup datasetGroup69 = multiplePiePlot65.getDatasetGroup();
        java.awt.Stroke stroke70 = null;
        multiplePiePlot65.setOutlineStroke(stroke70);
        org.jfree.chart.JFreeChart jFreeChart72 = multiplePiePlot65.getPieChart();
        multiplePiePlot58.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart72);
        multiplePiePlot58.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot58.setBackgroundAlpha((float) 1);
        boolean boolean78 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot65", multiplePiePlot15.equals(multiplePiePlot65) ? multiplePiePlot15.hashCode() == multiplePiePlot65.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot13.axisChanged(axisChangeEvent18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        int int22 = multiplePiePlot21.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        float float25 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot24.setOutlineStroke(stroke28);
        float float30 = multiplePiePlot24.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot24.getPieChart();
        multiplePiePlot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        multiplePiePlot36.setNoDataMessage("hi!");
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener41);
        multiplePiePlot36.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        multiplePiePlot36.notifyListeners(plotChangeEvent45);
        java.awt.Paint paint47 = multiplePiePlot36.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        int int52 = multiplePiePlot51.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        float float55 = multiplePiePlot54.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent56 = null;
        multiplePiePlot54.markerChanged(markerChangeEvent56);
        java.awt.Stroke stroke58 = null;
        multiplePiePlot54.setOutlineStroke(stroke58);
        float float60 = multiplePiePlot54.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart61 = multiplePiePlot54.getPieChart();
        multiplePiePlot51.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart61);
        multiplePiePlot36.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart61);
        multiplePiePlot1.setPieChart(jFreeChart61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot21 and multiplePiePlot51", multiplePiePlot21.equals(multiplePiePlot51) ? multiplePiePlot21.hashCode() == multiplePiePlot51.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        boolean boolean11 = multiplePiePlot7.equals((java.lang.Object) 10L);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot7.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener19);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setBackgroundPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setNoDataMessage("hi!");
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setBackgroundPaint(paint31);
        multiplePiePlot14.setOutlinePaint(paint31);
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot14.getDataExtractOrder();
        java.awt.Image image35 = null;
        multiplePiePlot14.setBackgroundImage(image35);
        int int37 = multiplePiePlot14.getBackgroundImageAlignment();
        java.awt.Font font38 = multiplePiePlot14.getNoDataMessageFont();
        multiplePiePlot7.setNoDataMessageFont(font38);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent40 = null;
        multiplePiePlot7.datasetChanged(datasetChangeEvent40);
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        multiplePiePlot45.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = null;
        multiplePiePlot45.setDrawingSupplier(drawingSupplier48);
        multiplePiePlot45.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart52 = multiplePiePlot45.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart42 and jFreeChart52", jFreeChart42.equals(jFreeChart52) ? jFreeChart42.hashCode() == jFreeChart52.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier13);
        float float15 = multiplePiePlot10.getForegroundAlpha();
        multiplePiePlot10.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot19.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot19.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Stroke stroke26 = null;
        multiplePiePlot25.setOutlineStroke(stroke26);
        java.lang.Comparable comparable28 = multiplePiePlot25.getAggregatedItemsKey();
        java.awt.Font font29 = multiplePiePlot25.getNoDataMessageFont();
        multiplePiePlot19.setNoDataMessageFont(font29);
        java.awt.Stroke stroke31 = multiplePiePlot19.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setNoDataMessage("hi!");
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str38 = multiplePiePlot33.getNoDataMessage();
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot33.setAggregatedItemsPaint(paint39);
        multiplePiePlot19.setNoDataMessagePaint(paint39);
        multiplePiePlot10.setNoDataMessagePaint(paint39);
        multiplePiePlot1.setBackgroundPaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot33", multiplePiePlot1.equals(multiplePiePlot33) ? multiplePiePlot1.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        multiplePiePlot56.setNoDataMessage("hi!");
        multiplePiePlot56.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener61 = null;
        multiplePiePlot56.addChangeListener(plotChangeListener61);
        org.jfree.chart.event.PlotChangeListener plotChangeListener63 = null;
        multiplePiePlot56.addChangeListener(plotChangeListener63);
        java.lang.Comparable comparable65 = multiplePiePlot56.getAggregatedItemsKey();
        multiplePiePlot56.zoom((double) (-1L));
        java.awt.Font font68 = multiplePiePlot56.getNoDataMessageFont();
        java.awt.Paint paint69 = multiplePiePlot56.getAggregatedItemsPaint();
        boolean boolean70 = multiplePiePlot39.equals((java.lang.Object) multiplePiePlot56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot56", multiplePiePlot11.equals(multiplePiePlot56) ? multiplePiePlot11.hashCode() == multiplePiePlot56.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        float float5 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener12);
        multiplePiePlot7.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot7.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo18);
        multiplePiePlot7.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier26);
        float float28 = multiplePiePlot23.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = multiplePiePlot23.getLegendItems();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot23.getRootPlot();
        float float31 = multiplePiePlot23.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot23.getPieChart();
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot23);
        float float34 = multiplePiePlot7.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot7.getPieChart();
        multiplePiePlot0.setPieChart(jFreeChart35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart32 and jFreeChart35", jFreeChart32.equals(jFreeChart35) ? jFreeChart32.hashCode() == jFreeChart35.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        float float32 = multiplePiePlot31.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        multiplePiePlot31.zoom((double) 0.0f);
        multiplePiePlot31.setLimit((double) (-1));
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot31.setBackgroundPaint(paint39);
        multiplePiePlot31.setForegroundAlpha((float) (short) 100);
        multiplePiePlot31.setForegroundAlpha((float) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        multiplePiePlot46.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        multiplePiePlot46.addChangeListener(plotChangeListener51);
        java.awt.Paint paint53 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot46.setBackgroundPaint(paint53);
        multiplePiePlot31.setAggregatedItemsPaint(paint53);
        java.awt.Stroke stroke56 = null;
        multiplePiePlot31.setOutlineStroke(stroke56);
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = multiplePiePlot31.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot46", multiplePiePlot11.equals(multiplePiePlot46) ? multiplePiePlot11.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        multiplePiePlot24.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier27);
        float float29 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection30 = multiplePiePlot24.getLegendItems();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot24.getRootPlot();
        float float32 = multiplePiePlot24.getBackgroundImageAlpha();
        java.awt.Image image33 = multiplePiePlot24.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier34);
        multiplePiePlot24.setForegroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        multiplePiePlot39.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo42);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent44 = null;
        multiplePiePlot39.datasetChanged(datasetChangeEvent44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        multiplePiePlot47.setNoDataMessage("hi!");
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float52 = multiplePiePlot47.getBackgroundImageAlpha();
        java.awt.Font font53 = multiplePiePlot47.getNoDataMessageFont();
        multiplePiePlot39.setNoDataMessageFont(font53);
        org.jfree.chart.JFreeChart jFreeChart55 = multiplePiePlot39.getPieChart();
        multiplePiePlot24.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart55);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        multiplePiePlot58.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = null;
        multiplePiePlot58.setDrawingSupplier(drawingSupplier61);
        float float63 = multiplePiePlot58.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot64 = multiplePiePlot58.getParent();
        multiplePiePlot58.setBackgroundAlpha((float) 1L);
        java.lang.String str67 = multiplePiePlot58.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = multiplePiePlot58.getInsets();
        multiplePiePlot24.setInsets(rectangleInsets68, false);
        multiplePiePlot1.setInsets(rectangleInsets68, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot39", multiplePiePlot15.equals(multiplePiePlot39) ? multiplePiePlot15.hashCode() == multiplePiePlot39.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        multiplePiePlot61.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier64 = null;
        multiplePiePlot61.setDrawingSupplier(drawingSupplier64);
        float float66 = multiplePiePlot61.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection67 = multiplePiePlot61.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent68 = null;
        multiplePiePlot61.markerChanged(markerChangeEvent68);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot71 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset70);
        org.jfree.data.category.CategoryDataset categoryDataset72 = multiplePiePlot71.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent73 = null;
        multiplePiePlot71.notifyListeners(plotChangeEvent73);
        org.jfree.data.general.DatasetGroup datasetGroup75 = multiplePiePlot71.getDatasetGroup();
        boolean boolean76 = multiplePiePlot61.equals((java.lang.Object) multiplePiePlot71);
        org.jfree.data.category.CategoryDataset categoryDataset77 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot78 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset77);
        float float79 = multiplePiePlot78.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent80 = null;
        multiplePiePlot78.markerChanged(markerChangeEvent80);
        java.awt.Stroke stroke82 = null;
        multiplePiePlot78.setOutlineStroke(stroke82);
        float float84 = multiplePiePlot78.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart85 = multiplePiePlot78.getPieChart();
        multiplePiePlot71.setPieChart(jFreeChart85);
        multiplePiePlot1.setPieChart(jFreeChart85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot26 and multiplePiePlot78", multiplePiePlot26.equals(multiplePiePlot78) ? multiplePiePlot26.hashCode() == multiplePiePlot78.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot10.setOutlineStroke(stroke11);
        java.awt.Font font13 = multiplePiePlot10.getNoDataMessageFont();
        java.lang.String str14 = multiplePiePlot10.getPlotType();
        java.awt.Paint paint15 = multiplePiePlot10.getNoDataMessagePaint();
        java.awt.Paint paint16 = multiplePiePlot10.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str23 = multiplePiePlot18.getNoDataMessage();
        java.lang.String str24 = multiplePiePlot18.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        multiplePiePlot10.setPieChart(jFreeChart25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot10.getDrawingSupplier();
        plot8.setDrawingSupplier(drawingSupplier28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot10", obj5.equals(multiplePiePlot10) ? obj5.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke7 = null;
        multiplePiePlot1.setOutlineStroke(stroke7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent12);
        multiplePiePlot10.zoom((double) 0.0f);
        multiplePiePlot10.setLimit((double) (-1));
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot10.setBackgroundPaint(paint18);
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image24 = multiplePiePlot21.getBackgroundImage();
        float float25 = multiplePiePlot21.getBackgroundImageAlpha();
        java.awt.Paint paint26 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot29.getDataset();
        int int31 = multiplePiePlot29.getBackgroundImageAlignment();
        java.awt.Image image32 = multiplePiePlot29.getBackgroundImage();
        double double33 = multiplePiePlot29.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = multiplePiePlot29.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        float float37 = multiplePiePlot36.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot36.setOutlineStroke(stroke40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = multiplePiePlot36.getDataset();
        java.awt.Font font43 = multiplePiePlot36.getNoDataMessageFont();
        java.awt.Paint paint44 = multiplePiePlot36.getNoDataMessagePaint();
        boolean boolean45 = multiplePiePlot29.equals((java.lang.Object) multiplePiePlot36);
        java.lang.String str46 = multiplePiePlot36.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image50 = multiplePiePlot47.getBackgroundImage();
        int int51 = multiplePiePlot47.getBackgroundImageAlignment();
        float float52 = multiplePiePlot47.getForegroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup53 = multiplePiePlot47.getDatasetGroup();
        java.awt.Paint paint54 = multiplePiePlot47.getAggregatedItemsPaint();
        multiplePiePlot36.setBackgroundPaint(paint54);
        multiplePiePlot1.setBackgroundPaint(paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot21 and multiplePiePlot47", multiplePiePlot21.equals(multiplePiePlot47) ? multiplePiePlot21.hashCode() == multiplePiePlot47.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        double double26 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setLimit((double) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener35);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener37);
        java.lang.Comparable comparable39 = multiplePiePlot30.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        multiplePiePlot30.drawBackgroundImage(graphics2D40, rectangle2D41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.awt.Stroke stroke45 = null;
        multiplePiePlot44.setOutlineStroke(stroke45);
        java.lang.Comparable comparable47 = multiplePiePlot44.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = multiplePiePlot44.getInsets();
        org.jfree.chart.plot.Plot plot49 = multiplePiePlot44.getRootPlot();
        java.awt.Image image50 = multiplePiePlot44.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent52 = null;
        multiplePiePlot51.axisChanged(axisChangeEvent52);
        java.awt.Paint paint54 = multiplePiePlot51.getNoDataMessagePaint();
        multiplePiePlot44.setBackgroundPaint(paint54);
        multiplePiePlot30.setNoDataMessagePaint(paint54);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        java.awt.Stroke stroke59 = null;
        multiplePiePlot58.setOutlineStroke(stroke59);
        java.awt.Font font61 = multiplePiePlot58.getNoDataMessageFont();
        multiplePiePlot58.setAggregatedItemsKey((java.lang.Comparable) 1);
        multiplePiePlot58.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        multiplePiePlot58.setDataset(categoryDataset66);
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot69 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset68);
        multiplePiePlot69.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier72 = null;
        multiplePiePlot69.setDrawingSupplier(drawingSupplier72);
        java.awt.Stroke stroke74 = null;
        multiplePiePlot69.setOutlineStroke(stroke74);
        int int76 = multiplePiePlot69.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleInsets rectangleInsets77 = multiplePiePlot69.getInsets();
        multiplePiePlot58.setInsets(rectangleInsets77, true);
        boolean boolean80 = multiplePiePlot30.equals((java.lang.Object) rectangleInsets77);
        multiplePiePlot1.setInsets(rectangleInsets77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and multiplePiePlot30", multiplePiePlot14.equals(multiplePiePlot30) ? multiplePiePlot14.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot23.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo26);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        multiplePiePlot23.datasetChanged(datasetChangeEvent28);
        float float30 = multiplePiePlot23.getBackgroundImageAlpha();
        float float31 = multiplePiePlot23.getForegroundAlpha();
        boolean boolean32 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot23);
        java.lang.Object obj33 = multiplePiePlot1.clone();
        java.awt.Stroke stroke34 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj33", multiplePiePlot1.equals(obj33) ? multiplePiePlot1.hashCode() == obj33.hashCode() : true);
    }
}

