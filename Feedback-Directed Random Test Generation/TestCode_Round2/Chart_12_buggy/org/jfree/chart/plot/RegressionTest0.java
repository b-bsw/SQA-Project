package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        java.awt.Paint paint6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Class<?> wildcardClass3 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Paint paint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsPaint(paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        java.lang.Class<?> wildcardClass6 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent6);
        org.jfree.chart.JFreeChart jFreeChart8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.JFreeChart jFreeChart4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.chart.util.TableOrder tableOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke6 = plot5.getOutlineStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.chart.util.TableOrder tableOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.lang.Class<?> wildcardClass5 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D3, rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        java.lang.Class<?> wildcardClass16 = paint13.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.JFreeChart jFreeChart5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D39, rectangle2D40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.5f + "'", float35 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart36);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent10);
        multiplePiePlot8.zoom((double) 0.0f);
        multiplePiePlot8.setLimit((double) (-1));
        multiplePiePlot8.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        multiplePiePlot19.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier22);
        float float24 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot19.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot29.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = multiplePiePlot29.getDatasetGroup();
        boolean boolean34 = multiplePiePlot19.equals((java.lang.Object) multiplePiePlot29);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        float float37 = multiplePiePlot36.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent38);
        java.awt.Stroke stroke40 = null;
        multiplePiePlot36.setOutlineStroke(stroke40);
        float float42 = multiplePiePlot36.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot36.getPieChart();
        multiplePiePlot29.setPieChart(jFreeChart43);
        multiplePiePlot8.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        // The following exception was thrown during execution in test generation
        try {
            plot6.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart43);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent19);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Stroke stroke7 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(stroke7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick(100, (-1), plotRenderingInfo13);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        boolean boolean9 = multiplePiePlot1.isSubplot();
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
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (byte) 10, plotRenderingInfo5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        multiplePiePlot0.setLimit((double) (byte) -1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo12);
        java.awt.Paint paint14 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot16.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot16.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Stroke stroke23 = null;
        multiplePiePlot22.setOutlineStroke(stroke23);
        java.lang.Comparable comparable25 = multiplePiePlot22.getAggregatedItemsKey();
        java.awt.Font font26 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot16.setNoDataMessageFont(font26);
        multiplePiePlot1.setNoDataMessageFont(font26);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot7 = plot6.getRootPlot();
        org.jfree.chart.plot.Plot plot8 = plot6.getRootPlot();
        int int9 = plot8.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.lang.Class<?> wildcardClass13 = multiplePiePlot1.getClass();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0L + "'", comparable11, 0L);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(stroke18);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        java.awt.Paint paint6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsPaint(paint6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot10.setOutlineStroke(stroke11);
        java.lang.Comparable comparable13 = multiplePiePlot10.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot10.getInsets();
        plot8.setInsets(rectangleInsets14, false);
        plot8.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        java.lang.Class<?> wildcardClass5 = multiplePiePlot0.getClass();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(tableOrder14);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        java.awt.geom.Point2D point2D34 = null;
        org.jfree.chart.plot.PlotState plotState35 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D32, rectangle2D33, point2D34, plotState35, plotRenderingInfo36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(image31);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        double double17 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        java.awt.Paint paint20 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint21 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot19.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo22);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener24);
        java.awt.Paint paint26 = multiplePiePlot19.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint26);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot10.getOutlineStroke();
        multiplePiePlot10.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot18.setOutlineStroke(stroke19);
        java.lang.Comparable comparable21 = multiplePiePlot18.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot18.getDataset();
        org.jfree.chart.util.TableOrder tableOrder23 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot10.setDataExtractOrder(tableOrder23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot10.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.lang.String str28 = multiplePiePlot10.getNoDataMessage();
        boolean boolean29 = multiplePiePlot1.equals((java.lang.Object) str28);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Other" + "'", comparable21, "Other");
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(tableOrder23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot10.setOutlineStroke(stroke11);
        java.lang.Comparable comparable13 = multiplePiePlot10.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot10.getInsets();
        plot8.setInsets(rectangleInsets14, false);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot8.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        double double6 = multiplePiePlot1.getLimit();
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
        multiplePiePlot18.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier21);
        java.awt.Stroke stroke23 = null;
        multiplePiePlot18.setOutlineStroke(stroke23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot26.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot26.getDatasetGroup();
        java.awt.Stroke stroke31 = null;
        multiplePiePlot26.setOutlineStroke(stroke31);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot26.getPieChart();
        multiplePiePlot18.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        multiplePiePlot8.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNull(datasetGroup30);
        org.junit.Assert.assertNotNull(jFreeChart33);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent23);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (byte) 10, plotRenderingInfo5);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent1 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent1);
        java.awt.Paint paint3 = multiplePiePlot0.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        java.awt.geom.Point2D point2D31 = null;
        org.jfree.chart.plot.PlotState plotState32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.draw(graphics2D29, rectangle2D30, point2D31, plotState32, plotRenderingInfo33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        double double7 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint10 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(stroke18);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.awt.Image image31 = null;
        multiplePiePlot1.setBackgroundImage(image31);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        java.awt.geom.Point2D point2D35 = null;
        org.jfree.chart.plot.PlotState plotState36 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D33, rectangle2D34, point2D35, plotState36, plotRenderingInfo37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit((double) 0.0f);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setNoDataMessage("hi!");
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener30);
        org.jfree.chart.util.TableOrder tableOrder32 = multiplePiePlot25.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(tableOrder32);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot9.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot1.getPieChart();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 0L + "'", comparable35, 0L);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(jFreeChart40);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener17);
        multiplePiePlot12.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot12.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo23);
        java.awt.Paint paint25 = multiplePiePlot12.getAggregatedItemsPaint();
        plot8.setNoDataMessagePaint(paint25);
        plot8.setNoDataMessage("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier18);
        float float20 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot15.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = multiplePiePlot23.getBackgroundPaint();
        multiplePiePlot15.setOutlinePaint(paint24);
        multiplePiePlot1.setNoDataMessagePaint(paint24);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D35, rectangle2D36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(tableOrder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        java.lang.String str28 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.Class<?> wildcardClass20 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        java.lang.Class<?> wildcardClass9 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot22.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot27.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setNoDataMessage("hi!");
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        multiplePiePlot44.addChangeListener(plotChangeListener49);
        java.awt.Paint paint51 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot44.setBackgroundPaint(paint51);
        multiplePiePlot34.setOutlinePaint(paint51);
        org.jfree.chart.util.TableOrder tableOrder54 = multiplePiePlot34.getDataExtractOrder();
        float float55 = multiplePiePlot34.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setNoDataMessage("hi!");
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener62);
        multiplePiePlot57.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo68 = null;
        multiplePiePlot57.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo68);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        multiplePiePlot57.setDataset(categoryDataset70);
        org.jfree.data.category.CategoryDataset categoryDataset72 = null;
        multiplePiePlot57.setDataset(categoryDataset72);
        java.awt.Stroke stroke74 = multiplePiePlot57.getOutlineStroke();
        multiplePiePlot34.setOutlineStroke(stroke74);
        multiplePiePlot27.setOutlineStroke(stroke74);
        multiplePiePlot22.setOutlineStroke(stroke74);
        multiplePiePlot1.setOutlineStroke(stroke74);
        java.lang.Object obj79 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(tableOrder54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.5f + "'", float55 == 0.5f);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        float float23 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        java.awt.Paint paint26 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Stroke stroke29 = null;
        multiplePiePlot28.setOutlineStroke(stroke29);
        java.awt.Font font31 = multiplePiePlot28.getNoDataMessageFont();
        multiplePiePlot22.setNoDataMessageFont(font31);
        multiplePiePlot14.setNoDataMessageFont(font31);
        // The following exception was thrown during execution in test generation
        try {
            plot12.setNoDataMessageFont(font31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.lang.Object obj8 = multiplePiePlot1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        java.lang.Class<?> wildcardClass24 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        multiplePiePlot1.zoom((double) (byte) 100);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass12 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertNull(image3);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        multiplePiePlot1.setDataset(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tableOrder9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        float float27 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setNoDataMessage("hi!");
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener11);
        multiplePiePlot6.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot6.notifyListeners(plotChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot6.getOutlinePaint();
        java.lang.Object obj18 = multiplePiePlot6.clone();
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot6.setAggregatedItemsPaint(paint19);
        multiplePiePlot1.setBackgroundPaint(paint19);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(datasetGroup22);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot22.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot27.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setNoDataMessage("hi!");
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        multiplePiePlot44.addChangeListener(plotChangeListener49);
        java.awt.Paint paint51 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot44.setBackgroundPaint(paint51);
        multiplePiePlot34.setOutlinePaint(paint51);
        org.jfree.chart.util.TableOrder tableOrder54 = multiplePiePlot34.getDataExtractOrder();
        float float55 = multiplePiePlot34.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setNoDataMessage("hi!");
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener62);
        multiplePiePlot57.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo68 = null;
        multiplePiePlot57.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo68);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        multiplePiePlot57.setDataset(categoryDataset70);
        org.jfree.data.category.CategoryDataset categoryDataset72 = null;
        multiplePiePlot57.setDataset(categoryDataset72);
        java.awt.Stroke stroke74 = multiplePiePlot57.getOutlineStroke();
        multiplePiePlot34.setOutlineStroke(stroke74);
        multiplePiePlot27.setOutlineStroke(stroke74);
        multiplePiePlot22.setOutlineStroke(stroke74);
        multiplePiePlot1.setOutlineStroke(stroke74);
        java.lang.String str79 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(tableOrder54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.5f + "'", float55 == 0.5f);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Multiple Pie Plot" + "'", str79, "Multiple Pie Plot");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        int int60 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(tableOrder33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.Point2D point2D24 = null;
        org.jfree.chart.plot.PlotState plotState25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D22, rectangle2D23, point2D24, plotState25, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        boolean boolean50 = multiplePiePlot46.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke51 = null;
        multiplePiePlot46.setOutlineStroke(stroke51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = multiplePiePlot46.getDatasetGroup();
        java.awt.Image image54 = null;
        multiplePiePlot46.setBackgroundImage(image54);
        float float56 = multiplePiePlot46.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        multiplePiePlot58.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = null;
        multiplePiePlot58.setDrawingSupplier(drawingSupplier61);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent63 = null;
        multiplePiePlot58.axisChanged(axisChangeEvent63);
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        int int67 = multiplePiePlot66.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot69 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset68);
        float float70 = multiplePiePlot69.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent71 = null;
        multiplePiePlot69.markerChanged(markerChangeEvent71);
        java.awt.Stroke stroke73 = null;
        multiplePiePlot69.setOutlineStroke(stroke73);
        float float75 = multiplePiePlot69.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart76 = multiplePiePlot69.getPieChart();
        multiplePiePlot66.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot58.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot46.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot1.setPieChart(jFreeChart76);
        org.jfree.data.category.CategoryDataset categoryDataset81 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(datasetGroup53);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.5f + "'", float56 == 0.5f);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15 + "'", int67 == 15);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.5f + "'", float75 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart76);
        org.junit.Assert.assertNull(categoryDataset81);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot9.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 100);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        java.lang.Class<?> wildcardClass9 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) 0.5f);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot8.setDataset(categoryDataset10);
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) '#');
        double double14 = multiplePiePlot8.getLimit();
        java.awt.Paint paint15 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent1 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent1);
        java.awt.Paint paint3 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Image image4 = null;
        multiplePiePlot0.setBackgroundImage(image4);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.awt.Image image28 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D29, rectangle2D30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(image28);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.Class<?> wildcardClass14 = rectangleInsets13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Paint paint10 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot12.drawBackground(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1.0d + "'", comparable11, 1.0d);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlignment(15);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick(10, (int) '4', plotRenderingInfo8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot11.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot11.getDatasetGroup();
        java.awt.Stroke stroke16 = null;
        multiplePiePlot11.setOutlineStroke(stroke16);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot11.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot11.getDataset();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder20);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNotNull(tableOrder20);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((double) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 10.0d);
        multiplePiePlot12.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1.0d + "'", comparable11, 1.0d);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        multiplePiePlot1.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image3);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier18);
        float float20 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot15.getLegendItems();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot15.getRootPlot();
        java.lang.String str23 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot15.datasetChanged(datasetChangeEvent24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot15.getDataset();
        boolean boolean27 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot12.setDataset(categoryDataset14);
        boolean boolean17 = multiplePiePlot12.equals((java.lang.Object) '#');
        java.lang.String str18 = multiplePiePlot12.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier23);
        java.awt.Stroke stroke25 = null;
        multiplePiePlot20.setOutlineStroke(stroke25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot28.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        multiplePiePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = multiplePiePlot28.getDatasetGroup();
        java.awt.Stroke stroke33 = null;
        multiplePiePlot28.setOutlineStroke(stroke33);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot28.getPieChart();
        multiplePiePlot20.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart35);
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart35);
        multiplePiePlot1.setPieChart(jFreeChart35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertNotNull(jFreeChart35);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D34, rectangle2D35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart31);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot7.setBackgroundPaint(paint14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setNoDataMessage("hi!");
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener22);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setBackgroundPaint(paint24);
        multiplePiePlot7.setOutlinePaint(paint24);
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot7.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder27);
        java.lang.Class<?> wildcardClass29 = tableOrder27.getClass();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(tableOrder27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        java.lang.Class<?> wildcardClass9 = multiplePiePlot1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setOutlineVisible(false);
        multiplePiePlot1.setNoDataMessage("Other");
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.awt.Paint paint12 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 1);
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        java.lang.Object obj10 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot14.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Stroke stroke21 = null;
        multiplePiePlot20.setOutlineStroke(stroke21);
        java.awt.Font font23 = multiplePiePlot20.getNoDataMessageFont();
        multiplePiePlot14.setNoDataMessageFont(font23);
        // The following exception was thrown during execution in test generation
        try {
            plot12.setNoDataMessageFont(font23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Stroke stroke7 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Image image5 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke7 = null;
        multiplePiePlot1.setOutlineStroke(stroke7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.Class<?> wildcardClass15 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D30, rectangle2D31);
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.jfree.data.general.DatasetGroup datasetGroup38 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(tableOrder36);
        org.junit.Assert.assertNull(datasetGroup38);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(categoryDataset25);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(tableOrder11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        java.awt.geom.Point2D point2D36 = null;
        org.jfree.chart.plot.PlotState plotState37 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D34, rectangle2D35, point2D36, plotState37, plotRenderingInfo38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(image31);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(tableOrder14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.Object obj6 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Stroke stroke9 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot7.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot15.getBackgroundPaint();
        multiplePiePlot7.setOutlinePaint(paint16);
        multiplePiePlot1.setAggregatedItemsPaint(paint16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = categoryDataset7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        java.awt.Stroke stroke23 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        multiplePiePlot1.setForegroundAlpha((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        java.awt.geom.Point2D point2D33 = null;
        org.jfree.chart.plot.PlotState plotState34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D31, rectangle2D32, point2D33, plotState34, plotRenderingInfo35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(tableOrder29);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D31, rectangle2D32);
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
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets6, false);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        double double7 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setNoDataMessage("hi!");
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot11.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder19);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tableOrder19);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        java.awt.Image image34 = null;
        multiplePiePlot1.setBackgroundImage(image34);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(image31);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent25);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        multiplePiePlot1.setForegroundAlpha((float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(image40);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        java.awt.geom.Point2D point2D47 = null;
        org.jfree.chart.plot.PlotState plotState48 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D45, rectangle2D46, point2D47, plotState48, plotRenderingInfo49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        double double27 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent28);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        double double7 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup10 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.awt.Image image30 = null;
        multiplePiePlot1.setBackgroundImage(image30);
        double double32 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        double double27 = multiplePiePlot1.getLimit();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        java.awt.geom.Point2D point2D30 = null;
        org.jfree.chart.plot.PlotState plotState31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D28, rectangle2D29, point2D30, plotState31, plotRenderingInfo32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        java.lang.Class<?> wildcardClass21 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint19 = plot18.getNoDataMessagePaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent1 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent1);
        java.awt.Paint paint3 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.awt.Paint paint24 = multiplePiePlot1.getNoDataMessagePaint();
        float float25 = multiplePiePlot1.getForegroundAlpha();
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
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.lang.Object obj11 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
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
        java.awt.Paint paint24 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot9.setBackgroundAlpha((float) 'a');
        boolean boolean27 = multiplePiePlot1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        java.lang.Object obj11 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str19 = multiplePiePlot14.getNoDataMessage();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setAggregatedItemsPaint(paint20);
        boolean boolean22 = multiplePiePlot14.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot14.getInsets();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent26);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(tableOrder24);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.awt.Paint paint21 = multiplePiePlot1.getBackgroundPaint();
        int int22 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 1);
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        float float16 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot17.handleClick((int) '#', (-1), plotRenderingInfo30);
        java.awt.Paint paint32 = multiplePiePlot17.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image11 = multiplePiePlot8.getBackgroundImage();
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        plot6.setBackgroundPaint(paint12);
        org.jfree.chart.plot.Plot plot14 = plot6.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        multiplePiePlot16.setNoDataMessage("hi!");
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener21);
        multiplePiePlot16.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        multiplePiePlot16.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot16.setDataset(categoryDataset29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot16.setDataset(categoryDataset31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        int int37 = multiplePiePlot36.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        float float40 = multiplePiePlot39.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent41);
        java.awt.Stroke stroke43 = null;
        multiplePiePlot39.setOutlineStroke(stroke43);
        float float45 = multiplePiePlot39.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot39.getPieChart();
        multiplePiePlot36.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        plot6.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        java.lang.Class<?> wildcardClass50 = jFreeChart46.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart46);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        plot10.setBackgroundImageAlignment((int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.Class<?> wildcardClass6 = paint5.getClass();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.awt.Paint paint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke7 = null;
        multiplePiePlot1.setOutlineStroke(stroke7);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick(10, (int) '4', plotRenderingInfo8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot22.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot27.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setNoDataMessage("hi!");
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setNoDataMessage("hi!");
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        multiplePiePlot44.addChangeListener(plotChangeListener49);
        java.awt.Paint paint51 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot44.setBackgroundPaint(paint51);
        multiplePiePlot34.setOutlinePaint(paint51);
        org.jfree.chart.util.TableOrder tableOrder54 = multiplePiePlot34.getDataExtractOrder();
        float float55 = multiplePiePlot34.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setNoDataMessage("hi!");
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener62);
        multiplePiePlot57.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo68 = null;
        multiplePiePlot57.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo68);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        multiplePiePlot57.setDataset(categoryDataset70);
        org.jfree.data.category.CategoryDataset categoryDataset72 = null;
        multiplePiePlot57.setDataset(categoryDataset72);
        java.awt.Stroke stroke74 = multiplePiePlot57.getOutlineStroke();
        multiplePiePlot34.setOutlineStroke(stroke74);
        multiplePiePlot27.setOutlineStroke(stroke74);
        multiplePiePlot22.setOutlineStroke(stroke74);
        multiplePiePlot1.setOutlineStroke(stroke74);
        org.jfree.data.category.CategoryDataset categoryDataset79 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot80 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset79);
        multiplePiePlot80.setNoDataMessage("hi!");
        boolean boolean84 = multiplePiePlot80.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke85 = null;
        multiplePiePlot80.setOutlineStroke(stroke85);
        org.jfree.data.category.CategoryDataset categoryDataset87 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot88 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset87);
        org.jfree.data.category.CategoryDataset categoryDataset89 = multiplePiePlot88.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent90 = null;
        multiplePiePlot88.notifyListeners(plotChangeEvent90);
        org.jfree.data.general.DatasetGroup datasetGroup92 = multiplePiePlot88.getDatasetGroup();
        java.awt.Stroke stroke93 = null;
        multiplePiePlot88.setOutlineStroke(stroke93);
        org.jfree.chart.JFreeChart jFreeChart95 = multiplePiePlot88.getPieChart();
        multiplePiePlot80.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart95);
        float float97 = multiplePiePlot80.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier98 = multiplePiePlot80.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier98);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(tableOrder54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.5f + "'", float55 == 0.5f);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(categoryDataset89);
        org.junit.Assert.assertNull(datasetGroup92);
        org.junit.Assert.assertNotNull(jFreeChart95);
        org.junit.Assert.assertTrue("'" + float97 + "' != '" + 0.5f + "'", float97 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier98);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.awt.Paint paint24 = multiplePiePlot1.getNoDataMessagePaint();
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
        java.awt.Paint paint39 = multiplePiePlot26.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint39);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 0L + "'", comparable35, 0L);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setForegroundAlpha((float) 100L);
        multiplePiePlot1.zoom((double) 10.0f);
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 0);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
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
        multiplePiePlot1.setNoDataMessageFont(font35);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        multiplePiePlot1.setLimit((double) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setNoDataMessage("hi!");
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        multiplePiePlot28.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier31);
        float float33 = multiplePiePlot28.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = multiplePiePlot28.getLegendItems();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot28.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot37.setOutlineStroke(stroke38);
        java.lang.Comparable comparable40 = multiplePiePlot37.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = multiplePiePlot37.getInsets();
        plot35.setInsets(rectangleInsets41, false);
        multiplePiePlot22.setInsets(rectangleInsets41, false);
        multiplePiePlot1.setInsets(rectangleInsets41, true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection34);
        org.junit.Assert.assertNotNull(plot35);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + "Other" + "'", comparable40, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) '#');
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        multiplePiePlot13.setNoDataMessage("hi!");
        boolean boolean16 = multiplePiePlot13.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener23);
        multiplePiePlot18.setBackgroundImageAlignment(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        multiplePiePlot18.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot18.setDataset(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        multiplePiePlot18.setDataset(categoryDataset33);
        java.awt.Stroke stroke35 = multiplePiePlot18.getOutlineStroke();
        multiplePiePlot13.setOutlineStroke(stroke35);
        multiplePiePlot1.setOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        float float18 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Stroke stroke23 = null;
        multiplePiePlot22.setOutlineStroke(stroke23);
        java.lang.Comparable comparable25 = multiplePiePlot22.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot22.getInsets();
        plot20.setInsets(rectangleInsets26, false);
        multiplePiePlot1.setInsets(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection19);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.awt.Image image16 = multiplePiePlot1.getBackgroundImage();
        java.awt.Stroke stroke17 = null;
        multiplePiePlot1.setOutlineStroke(stroke17);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        multiplePiePlot1.setDataset(categoryDataset21);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        double double8 = multiplePiePlot1.getLimit();
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(drawingSupplier34);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setNoDataMessage("hi!");
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str18 = multiplePiePlot13.getNoDataMessage();
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot13.setAggregatedItemsPaint(paint19);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Paint paint23 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint23);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNull(categoryDataset26);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(plot22);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (byte) 10, plotRenderingInfo5);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        multiplePiePlot29.setNoDataMessage("hi!");
        boolean boolean33 = multiplePiePlot29.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot29.setOutlineStroke(stroke34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = multiplePiePlot37.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot37.notifyListeners(plotChangeEvent39);
        org.jfree.data.general.DatasetGroup datasetGroup41 = multiplePiePlot37.getDatasetGroup();
        java.awt.Stroke stroke42 = null;
        multiplePiePlot37.setOutlineStroke(stroke42);
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot37.getPieChart();
        multiplePiePlot29.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryDataset38);
        org.junit.Assert.assertNull(datasetGroup41);
        org.junit.Assert.assertNotNull(jFreeChart44);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke7 = null;
        multiplePiePlot1.setOutlineStroke(stroke7);
        java.lang.Class<?> wildcardClass9 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str16 = multiplePiePlot11.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot11.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot19.setOutlineStroke(stroke20);
        java.awt.Font font22 = multiplePiePlot19.getNoDataMessageFont();
        multiplePiePlot11.setNoDataMessageFont(font22);
        java.lang.Object obj24 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot11.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(jFreeChart27);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot1.setOutlineStroke(stroke7);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        multiplePiePlot1.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint13);
        multiplePiePlot1.zoom((double) 0);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit(0.0d);
        int int10 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        multiplePiePlot1.setOutlineVisible(false);
        multiplePiePlot1.setLimit((double) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        org.jfree.data.category.CategoryDataset categoryDataset62 = multiplePiePlot61.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent63 = null;
        multiplePiePlot61.notifyListeners(plotChangeEvent63);
        org.jfree.data.general.DatasetGroup datasetGroup65 = multiplePiePlot61.getDatasetGroup();
        java.lang.String str66 = multiplePiePlot61.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier67 = multiplePiePlot61.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier67);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(tableOrder33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset62);
        org.junit.Assert.assertNull(datasetGroup65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Multiple Pie Plot" + "'", str66, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier67);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        boolean boolean50 = multiplePiePlot46.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke51 = null;
        multiplePiePlot46.setOutlineStroke(stroke51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = multiplePiePlot46.getDatasetGroup();
        java.awt.Image image54 = null;
        multiplePiePlot46.setBackgroundImage(image54);
        float float56 = multiplePiePlot46.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        multiplePiePlot58.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = null;
        multiplePiePlot58.setDrawingSupplier(drawingSupplier61);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent63 = null;
        multiplePiePlot58.axisChanged(axisChangeEvent63);
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        int int67 = multiplePiePlot66.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot69 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset68);
        float float70 = multiplePiePlot69.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent71 = null;
        multiplePiePlot69.markerChanged(markerChangeEvent71);
        java.awt.Stroke stroke73 = null;
        multiplePiePlot69.setOutlineStroke(stroke73);
        float float75 = multiplePiePlot69.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart76 = multiplePiePlot69.getPieChart();
        multiplePiePlot66.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot58.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot46.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot1.setPieChart(jFreeChart76);
        org.jfree.chart.JFreeChart jFreeChart81 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(datasetGroup53);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.5f + "'", float56 == 0.5f);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15 + "'", int67 == 15);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.5f + "'", float75 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart76);
        org.junit.Assert.assertNotNull(jFreeChart81);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart27);
        org.junit.Assert.assertNotNull(font30);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setNoDataMessage("hi!");
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str15 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot10.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Stroke stroke19 = null;
        multiplePiePlot18.setOutlineStroke(stroke19);
        java.awt.Font font21 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot10.setNoDataMessageFont(font21);
        multiplePiePlot1.setNoDataMessageFont(font21);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setLimit((double) 100);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.Class<?> wildcardClass38 = multiplePiePlot1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        multiplePiePlot6.setNoDataMessage("hi!");
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener11);
        boolean boolean13 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot6);
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.zoom((double) 10L);
        org.junit.Assert.assertNull(drawingSupplier6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        multiplePiePlot1.setOutlineVisible(false);
        java.lang.Comparable comparable68 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 1.0f + "'", float60 == 1.0f);
        org.junit.Assert.assertNull(plot61);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertEquals("'" + comparable68 + "' != '" + "Other" + "'", comparable68, "Other");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 0, plotRenderingInfo21);
        java.lang.Comparable comparable23 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "Other" + "'", comparable23, "Other");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot7.setOutlineStroke(stroke11);
        float float13 = multiplePiePlot7.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot7.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = multiplePiePlot16.getBackgroundPaint();
        float float18 = multiplePiePlot16.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setNoDataMessage("hi!");
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setBackgroundPaint(paint27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        multiplePiePlot30.setNoDataMessage("hi!");
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener35);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot30.setBackgroundPaint(paint37);
        multiplePiePlot20.setOutlinePaint(paint37);
        org.jfree.chart.util.TableOrder tableOrder40 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot16.setDataExtractOrder(tableOrder40);
        multiplePiePlot7.setDataExtractOrder(tableOrder40);
        multiplePiePlot0.setDataExtractOrder(tableOrder40);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(tableOrder40);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot1.getPieChart();
        java.awt.Font font42 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.5f + "'", float35 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart36);
        org.junit.Assert.assertNotNull(jFreeChart41);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        multiplePiePlot22.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier25);
        float float27 = multiplePiePlot22.getForegroundAlpha();
        multiplePiePlot22.zoom((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot31.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = multiplePiePlot31.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot37.setOutlineStroke(stroke38);
        java.lang.Comparable comparable40 = multiplePiePlot37.getAggregatedItemsKey();
        java.awt.Font font41 = multiplePiePlot37.getNoDataMessageFont();
        multiplePiePlot31.setNoDataMessageFont(font41);
        java.awt.Stroke stroke43 = multiplePiePlot31.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        multiplePiePlot45.setNoDataMessage("hi!");
        multiplePiePlot45.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str50 = multiplePiePlot45.getNoDataMessage();
        java.awt.Paint paint51 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot45.setAggregatedItemsPaint(paint51);
        multiplePiePlot31.setNoDataMessagePaint(paint51);
        multiplePiePlot22.setNoDataMessagePaint(paint51);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        multiplePiePlot56.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = null;
        multiplePiePlot56.setDrawingSupplier(drawingSupplier59);
        java.awt.Stroke stroke61 = null;
        multiplePiePlot56.setOutlineStroke(stroke61);
        org.jfree.data.general.DatasetGroup datasetGroup63 = multiplePiePlot56.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart64 = multiplePiePlot56.getPieChart();
        multiplePiePlot22.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset32);
        org.junit.Assert.assertNull(datasetGroup35);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + "Other" + "'", comparable40, "Other");
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNull(datasetGroup63);
        org.junit.Assert.assertNotNull(jFreeChart64);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(tableOrder33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(rectangleInsets59);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str28 = multiplePiePlot23.getNoDataMessage();
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setAggregatedItemsPaint(paint29);
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot23.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        multiplePiePlot35.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        multiplePiePlot35.axisChanged(axisChangeEvent38);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent40 = null;
        multiplePiePlot35.axisChanged(axisChangeEvent40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        int int44 = multiplePiePlot43.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        float float47 = multiplePiePlot46.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent48);
        java.awt.Stroke stroke50 = null;
        multiplePiePlot46.setOutlineStroke(stroke50);
        float float52 = multiplePiePlot46.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart53 = multiplePiePlot46.getPieChart();
        multiplePiePlot43.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart53);
        multiplePiePlot35.setPieChart(jFreeChart53);
        multiplePiePlot23.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart53);
        boolean boolean57 = multiplePiePlot1.equals((java.lang.Object) jFreeChart53);
        org.jfree.chart.util.TableOrder tableOrder58 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.5f + "'", float52 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tableOrder58);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        float float25 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        float float12 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent13);
        multiplePiePlot11.zoom((double) 0.0f);
        multiplePiePlot11.setLimit((double) (-1));
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint19);
        java.awt.Paint paint21 = multiplePiePlot11.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot11.removeChangeListener(plotChangeListener22);
        java.awt.Paint paint24 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(tableOrder9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.notifyListeners(plotChangeEvent27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        multiplePiePlot1.handleClick((int) (short) 100, (int) (byte) 10, plotRenderingInfo56);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent23);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(tableOrder18);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent32);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(image31);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(tableOrder33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection60);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        int int3 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent23);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent25);
        java.awt.Paint paint27 = multiplePiePlot20.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint27);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlignment(15);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image14 = multiplePiePlot11.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot16.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo19);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        multiplePiePlot16.datasetChanged(datasetChangeEvent21);
        float float23 = multiplePiePlot16.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot11.setDrawingSupplier(drawingSupplier24);
        boolean boolean26 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        java.awt.Stroke stroke27 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(stroke27);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (byte) 10, plotRenderingInfo5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Stroke stroke12 = null;
        multiplePiePlot8.setOutlineStroke(stroke12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot8.getDataset();
        java.awt.Paint paint15 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint15);
        java.lang.Object obj17 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(tableOrder27);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(tableOrder6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        float float44 = multiplePiePlot43.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        multiplePiePlot43.markerChanged(markerChangeEvent45);
        java.awt.Stroke stroke47 = null;
        multiplePiePlot43.setOutlineStroke(stroke47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = multiplePiePlot43.getDataset();
        multiplePiePlot43.setBackgroundImageAlignment(15);
        java.awt.Paint paint52 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot43.setAggregatedItemsPaint(paint52);
        multiplePiePlot1.setOutlinePaint(paint52);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(image40);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset49);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        multiplePiePlot7.setNoDataMessage("hi!");
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot7.setBackgroundPaint(paint14);
        boolean boolean16 = multiplePiePlot7.isOutlineVisible();
        java.awt.Font font17 = multiplePiePlot7.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot7.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder18);
        java.awt.Paint paint20 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Image image1 = null;
        multiplePiePlot0.setBackgroundImage(image1);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        multiplePiePlot4.setNoDataMessage("hi!");
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot4.addChangeListener(plotChangeListener9);
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        multiplePiePlot14.setNoDataMessage("hi!");
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener19);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot14.setBackgroundPaint(paint21);
        multiplePiePlot4.setOutlinePaint(paint21);
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot4.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setInsets(rectangleInsets26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(tableOrder24);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        int int6 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        multiplePiePlot1.zoom((double) (-1));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) 0.5f);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, (int) (byte) 100, plotRenderingInfo10);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        float float47 = multiplePiePlot31.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot31.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        java.awt.Image image50 = null;
        multiplePiePlot1.setBackgroundImage(image50);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection27);
        org.junit.Assert.assertNull(categoryDataset32);
        org.junit.Assert.assertNull(datasetGroup35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart45);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.5f + "'", float47 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart48);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.awt.Paint paint31 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(datasetGroup17);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(drawingSupplier30);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        multiplePiePlot1.setLimit((double) (-1));
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        boolean boolean30 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo58 = null;
        multiplePiePlot55.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo58);
        multiplePiePlot55.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = multiplePiePlot55.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets62);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent64 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent64);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection32);
        org.junit.Assert.assertNull(categoryDataset37);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart50);
        org.junit.Assert.assertNotNull(rectangleInsets62);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 100L);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        java.lang.Object obj5 = multiplePiePlot0.clone();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setNoDataMessage("");
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        multiplePiePlot1.setPieChart(jFreeChart36);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(jFreeChart36);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 0L + "'", comparable35, 0L);
        org.junit.Assert.assertNotNull(font38);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        multiplePiePlot9.setNoDataMessage("hi!");
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener14);
        multiplePiePlot9.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent18);
        java.lang.String str20 = multiplePiePlot9.getNoDataMessage();
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Multiple Pie Plot" + "'", str27, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        float float10 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot14.setDataset(categoryDataset16);
        boolean boolean19 = multiplePiePlot14.equals((java.lang.Object) '#');
        java.awt.Paint paint20 = multiplePiePlot14.getNoDataMessagePaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint13);
        multiplePiePlot1.zoom((double) 0);
        double double17 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.jfree.chart.plot.Plot plot18 = null;
        multiplePiePlot1.setParent(plot18);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        float float43 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Other" + "'", comparable29, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getBackgroundPaint();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.awt.Graphics2D graphics2D59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D59, rectangle2D60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(tableOrder33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(stroke53);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot12.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot12.getDatasetGroup();
        java.lang.String str17 = multiplePiePlot12.getPlotType();
        java.awt.Stroke stroke18 = null;
        multiplePiePlot12.setOutlineStroke(stroke18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent23);
        multiplePiePlot21.zoom((double) 0.0f);
        multiplePiePlot21.setLimit((double) (-1));
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setBackgroundPaint(paint29);
        multiplePiePlot12.setNoDataMessagePaint(paint29);
        multiplePiePlot1.setNoDataMessagePaint(paint29);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        multiplePiePlot34.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        multiplePiePlot34.setDrawingSupplier(drawingSupplier37);
        java.awt.Stroke stroke39 = null;
        multiplePiePlot34.setOutlineStroke(stroke39);
        org.jfree.data.general.DatasetGroup datasetGroup41 = multiplePiePlot34.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setNoDataMessage("hi!");
        multiplePiePlot43.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener48 = null;
        multiplePiePlot43.addChangeListener(plotChangeListener48);
        multiplePiePlot43.setBackgroundImageAlignment(10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent52);
        java.awt.Paint paint54 = multiplePiePlot43.getOutlinePaint();
        java.lang.Object obj55 = multiplePiePlot43.clone();
        java.awt.Paint paint56 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot43.setAggregatedItemsPaint(paint56);
        multiplePiePlot34.setNoDataMessagePaint(paint56);
        boolean boolean59 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot34);
        java.lang.Class<?> wildcardClass60 = multiplePiePlot1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(datasetGroup41);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        boolean boolean21 = multiplePiePlot12.isSubplot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1.0d + "'", comparable11, 1.0d);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        double double7 = multiplePiePlot1.getLimit();
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        multiplePiePlot1.setForegroundAlpha((-1.0f));
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        multiplePiePlot1.zoom((double) (short) -1);
        float float26 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint31 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Stroke stroke34 = null;
        multiplePiePlot33.setOutlineStroke(stroke34);
        java.awt.Font font36 = multiplePiePlot33.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot33.getParent();
        multiplePiePlot33.setBackgroundAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = multiplePiePlot33.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier40);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNull(plot37);
        org.junit.Assert.assertNotNull(drawingSupplier40);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        multiplePiePlot1.zoom((double) 100L);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(tableOrder33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        multiplePiePlot1.setLimit((double) (-1));
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertNotNull(tableOrder31);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot0.handleClick((int) 'a', (int) (byte) 0, plotRenderingInfo30);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick(0, (int) (short) 0, plotRenderingInfo12);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.awt.Font font34 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(font34);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        double double19 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        java.awt.geom.Point2D point2D33 = null;
        org.jfree.chart.plot.PlotState plotState34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.draw(graphics2D31, rectangle2D32, point2D33, plotState34, plotRenderingInfo35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        multiplePiePlot1.setLimit((double) (-1));
        java.awt.Paint paint31 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str32 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Multiple Pie Plot" + "'", str32, "Multiple Pie Plot");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + "Other" + "'", comparable27, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection28);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Other" + "'", comparable29, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        multiplePiePlot4.setNoDataMessage("hi!");
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str9 = multiplePiePlot4.getNoDataMessage();
        java.lang.String str10 = multiplePiePlot4.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot4.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Stroke stroke30 = null;
        multiplePiePlot26.setOutlineStroke(stroke30);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint34 = multiplePiePlot26.getBackgroundPaint();
        java.awt.Image image35 = multiplePiePlot26.getBackgroundImage();
        double double36 = multiplePiePlot26.getLimit();
        org.jfree.chart.util.TableOrder tableOrder37 = multiplePiePlot26.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder37);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder37);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.String str29 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot17.handleClick((int) '#', (-1), plotRenderingInfo30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot33.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot33);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNull(categoryDataset34);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot1.getDatasetGroup();
        float float27 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        multiplePiePlot1.setDataset(categoryDataset15);
        java.awt.Image image17 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setOutlineVisible(false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (byte) 0, (int) (byte) 100, plotRenderingInfo8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNotNull(tableOrder7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) (short) 1);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setForegroundAlpha((float) 'a');
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = plot12.getDrawingSupplier();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsPaint(paint10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener6);
        multiplePiePlot1.setBackgroundImageAlignment(10);
        java.awt.Paint paint10 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent1 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        boolean boolean9 = plot8.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = plot8.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(legendItemCollection28);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(drawingSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.drawOutline(graphics2D27, rectangle2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot9.getDataset();
        int int11 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Image image12 = multiplePiePlot9.getBackgroundImage();
        double double13 = multiplePiePlot9.getLimit();
        double double14 = multiplePiePlot9.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot16.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo19);
        multiplePiePlot16.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot16.getInsets();
        multiplePiePlot9.setInsets(rectangleInsets23);
        multiplePiePlot1.setInsets(rectangleInsets23, false);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.awt.geom.Point2D point2D29 = null;
        org.jfree.chart.plot.PlotState plotState30 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.draw(graphics2D27, rectangle2D28, point2D29, plotState30, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot15.setDataset(categoryDataset17);
        java.awt.Paint paint19 = multiplePiePlot15.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent20);
        java.awt.Font font22 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font22);
        java.lang.Object obj24 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) 0.5f);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image11 = multiplePiePlot8.getBackgroundImage();
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) -1);
        multiplePiePlot8.setBackgroundAlpha((float) (short) 10);
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier21);
        java.awt.Stroke stroke23 = null;
        multiplePiePlot18.setOutlineStroke(stroke23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNotNull(jFreeChart26);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent30 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent30);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = multiplePiePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D33, rectangle2D34);
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
        org.junit.Assert.assertNotNull(legendItemCollection32);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        int int3 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        double double5 = multiplePiePlot1.getLimit();
        double double6 = multiplePiePlot1.getLimit();
        multiplePiePlot1.zoom(0.0d);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        float float16 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str23 = multiplePiePlot18.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        float float28 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        multiplePiePlot32.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo35);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener37);
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot32.setAggregatedItemsPaint(paint39);
        multiplePiePlot27.setOutlinePaint(paint39);
        multiplePiePlot18.setAggregatedItemsPaint(paint39);
        multiplePiePlot1.setOutlinePaint(paint39);
        float float44 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder45 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder45);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        float float34 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(tableOrder31);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot15.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint22);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        float float10 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier12);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.zoom(0.0d);
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
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
        float float29 = multiplePiePlot8.getBackgroundImageAlpha();
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
        java.awt.Stroke stroke48 = multiplePiePlot31.getOutlineStroke();
        multiplePiePlot8.setOutlineStroke(stroke48);
        multiplePiePlot1.setOutlineStroke(stroke48);
        java.lang.Object obj51 = null;
        boolean boolean52 = multiplePiePlot1.equals(obj51);
        org.junit.Assert.assertNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        multiplePiePlot46.setNoDataMessage("hi!");
        boolean boolean50 = multiplePiePlot46.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke51 = null;
        multiplePiePlot46.setOutlineStroke(stroke51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = multiplePiePlot46.getDatasetGroup();
        java.awt.Image image54 = null;
        multiplePiePlot46.setBackgroundImage(image54);
        float float56 = multiplePiePlot46.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        multiplePiePlot58.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = null;
        multiplePiePlot58.setDrawingSupplier(drawingSupplier61);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent63 = null;
        multiplePiePlot58.axisChanged(axisChangeEvent63);
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        int int67 = multiplePiePlot66.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot69 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset68);
        float float70 = multiplePiePlot69.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent71 = null;
        multiplePiePlot69.markerChanged(markerChangeEvent71);
        java.awt.Stroke stroke73 = null;
        multiplePiePlot69.setOutlineStroke(stroke73);
        float float75 = multiplePiePlot69.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart76 = multiplePiePlot69.getPieChart();
        multiplePiePlot66.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot58.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot46.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart76);
        multiplePiePlot1.setPieChart(jFreeChart76);
        java.lang.Class<?> wildcardClass81 = jFreeChart76.getClass();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(datasetGroup53);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.5f + "'", float56 == 0.5f);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15 + "'", int67 == 15);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.5f + "'", float75 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart76);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot12.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot12.getDatasetGroup();
        java.lang.String str17 = multiplePiePlot12.getPlotType();
        java.awt.Stroke stroke18 = null;
        multiplePiePlot12.setOutlineStroke(stroke18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent23);
        multiplePiePlot21.zoom((double) 0.0f);
        multiplePiePlot21.setLimit((double) (-1));
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setBackgroundPaint(paint29);
        multiplePiePlot12.setNoDataMessagePaint(paint29);
        multiplePiePlot1.setNoDataMessagePaint(paint29);
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(tableOrder33);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        multiplePiePlot1.setNoDataMessage("Other");
        java.lang.String str30 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Other" + "'", str30, "Other");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        double double45 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(jFreeChart43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.plot.Plot plot8 = null;
        multiplePiePlot1.setParent(plot8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        multiplePiePlot25.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier28);
        float float30 = multiplePiePlot25.getForegroundAlpha();
        multiplePiePlot25.zoom(0.0d);
        java.awt.Paint paint33 = multiplePiePlot25.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint33);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot29.drawOutline(graphics2D38, rectangle2D39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            plot10.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent19);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent1 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent1);
        java.awt.Paint paint3 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image11 = multiplePiePlot8.getBackgroundImage();
        multiplePiePlot8.setBackgroundImageAlignment((int) (short) -1);
        multiplePiePlot8.setBackgroundAlpha((float) (short) 10);
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        java.lang.String str18 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        multiplePiePlot1.zoom((double) (-1L));
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        java.awt.Stroke stroke46 = null;
        multiplePiePlot45.setOutlineStroke(stroke46);
        java.lang.Comparable comparable48 = multiplePiePlot45.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = multiplePiePlot45.getInsets();
        org.jfree.chart.plot.Plot plot50 = multiplePiePlot45.getRootPlot();
        org.jfree.chart.plot.Plot plot51 = plot50.getRootPlot();
        java.awt.Paint paint52 = plot51.getBackgroundPaint();
        boolean boolean53 = multiplePiePlot1.equals((java.lang.Object) paint52);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(tableOrder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(jFreeChart42);
        org.junit.Assert.assertEquals("'" + comparable48 + "' != '" + "Other" + "'", comparable48, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(plot50);
        org.junit.Assert.assertNotNull(plot51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        multiplePiePlot1.setLimit((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart31);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        boolean boolean6 = multiplePiePlot1.equals((java.lang.Object) '#');
        double double7 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder12);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.awt.Image image19 = null;
        multiplePiePlot1.setBackgroundImage(image19);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent24);
        float float26 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        java.awt.Image image15 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(plot23);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        boolean boolean14 = multiplePiePlot1.isSubplot();
        double double15 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean4 = multiplePiePlot1.isOutlineVisible();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tableOrder9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Multiple Pie Plot" + "'", str29, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint23 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        multiplePiePlot10.setBackgroundImageAlignment((int) (short) 1);
        java.awt.Image image13 = multiplePiePlot10.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot15.setOutlineStroke(stroke16);
        java.lang.Comparable comparable18 = multiplePiePlot15.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot15.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets19, true);
        multiplePiePlot1.setInsets(rectangleInsets19);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundAlpha(1.0f);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
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
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.awt.Image image16 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) (short) 1);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        float float26 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        float float24 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        boolean boolean19 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str27 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
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
        multiplePiePlot8.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        multiplePiePlot23.setNoDataMessage("hi!");
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener30);
        java.lang.Comparable comparable32 = multiplePiePlot23.getAggregatedItemsKey();
        multiplePiePlot23.zoom((double) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = multiplePiePlot23.getDrawingSupplier();
        multiplePiePlot8.setDrawingSupplier(drawingSupplier35);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier35);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 0L + "'", comparable32, 0L);
        org.junit.Assert.assertNotNull(drawingSupplier35);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        plot10.markerChanged(markerChangeEvent11);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.String str45 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent17);
        multiplePiePlot15.zoom((double) 0.0f);
        multiplePiePlot15.setLimit((double) (-1));
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setBackgroundPaint(paint23);
        java.awt.Paint paint25 = multiplePiePlot15.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot15.removeChangeListener(plotChangeListener26);
        java.awt.Paint paint28 = multiplePiePlot15.getAggregatedItemsPaint();
        java.awt.Paint paint29 = multiplePiePlot15.getNoDataMessagePaint();
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot15.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot32.setOutlineStroke(stroke33);
        java.lang.Comparable comparable35 = multiplePiePlot32.getAggregatedItemsKey();
        java.lang.Object obj36 = multiplePiePlot32.clone();
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        multiplePiePlot40.setNoDataMessage("hi!");
        multiplePiePlot40.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener45 = null;
        multiplePiePlot40.addChangeListener(plotChangeListener45);
        java.awt.Paint paint47 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot40.setBackgroundPaint(paint47);
        multiplePiePlot32.setOutlinePaint(paint47);
        java.awt.Paint paint50 = multiplePiePlot32.getNoDataMessagePaint();
        multiplePiePlot15.setOutlinePaint(paint50);
        multiplePiePlot1.setNoDataMessagePaint(paint50);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(tableOrder30);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + "Other" + "'", comparable35, "Other");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setNoDataMessage("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot9.handleClick((int) (short) 0, (int) (byte) 0, plotRenderingInfo12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot9.datasetChanged(datasetChangeEvent14);
        multiplePiePlot9.setBackgroundAlpha((float) 1L);
        multiplePiePlot9.setNoDataMessage("");
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot9.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        float float23 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent24);
        multiplePiePlot22.zoom((double) 0.0f);
        multiplePiePlot22.setLimit((double) (-1));
        multiplePiePlot22.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        multiplePiePlot33.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier36);
        float float38 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection39 = multiplePiePlot33.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = multiplePiePlot43.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent45);
        org.jfree.data.general.DatasetGroup datasetGroup47 = multiplePiePlot43.getDatasetGroup();
        boolean boolean48 = multiplePiePlot33.equals((java.lang.Object) multiplePiePlot43);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        multiplePiePlot50.markerChanged(markerChangeEvent52);
        java.awt.Stroke stroke54 = null;
        multiplePiePlot50.setOutlineStroke(stroke54);
        float float56 = multiplePiePlot50.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart57 = multiplePiePlot50.getPieChart();
        multiplePiePlot43.setPieChart(jFreeChart57);
        multiplePiePlot22.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart57);
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart57);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart57);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection39);
        org.junit.Assert.assertNull(categoryDataset44);
        org.junit.Assert.assertNull(datasetGroup47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.5f + "'", float56 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart57);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        java.lang.Class<?> wildcardClass14 = multiplePiePlot1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        multiplePiePlot1.setNoDataMessage("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection45);
        org.junit.Assert.assertNotNull(plot46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + "Other" + "'", comparable51, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(rectangleInsets59);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        multiplePiePlot1.zoom(1.0d);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot1.setOutlineVisible(false);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        multiplePiePlot1.setForegroundAlpha((float) '4');
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        double double14 = multiplePiePlot1.getLimit();
        double double15 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        float float11 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Stroke stroke14 = null;
        multiplePiePlot10.setOutlineStroke(stroke14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint18 = multiplePiePlot10.getBackgroundPaint();
        java.awt.Image image19 = multiplePiePlot10.getBackgroundImage();
        double double20 = multiplePiePlot10.getLimit();
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot10.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder21);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder21);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = null;
        multiplePiePlot1.setOutlineStroke(stroke5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        multiplePiePlot1.setPieChart(jFreeChart46);
        boolean boolean49 = multiplePiePlot1.isOutlineVisible();
        int int50 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.jfree.chart.plot.Plot plot34 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(plot34);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Stroke stroke2 = null;
        multiplePiePlot1.setOutlineStroke(stroke2);
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setLimit((double) 15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 1);
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(stroke12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setNoDataMessage("hi!");
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 10L);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
    }
}

