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
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (short) 1, marker6, layer7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation3 = null;
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke7 = xYPlot6.getDomainZeroBaselineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot13.getDomainAxis(10);
        xYPlot13.configureDomainAxes();
        java.awt.Paint paint17 = xYPlot13.getDomainCrosshairPaint();
        categoryPlot12.setRangeGridlinePaint(paint17);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawRangeCrosshair(graphics2D1, rectangle2D2, plotOrientation3, (double) 100.0f, valueAxis5, stroke7, paint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxisForDataset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index 100 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        xYPlot0.setRangeCrosshairLockedOnData(false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeDomainMarker((int) (byte) 1, marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.data.Range range3 = xYPlot0.getDataRange(valueAxis2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxisForDataset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index -1 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(range3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot4.removeDomainMarker((int) 'a', marker8, layer9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot4.removeRangeMarker(10, marker9, layer10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick(10, (int) (short) 10, plotRenderingInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge7 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation5, plotOrientation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map9 = xYPlot0.drawAxes(graphics2D5, rectangle2D6, rectangle2D7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) (byte) 10, marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint7 = xYPlot6.getBackgroundPaint();
        xYPlot0.setRangeZeroBaselinePaint(paint7);
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot0.removeRangeMarker((-1), marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot14.getDomainAxis(10);
        xYPlot14.configureDomainAxes();
        java.awt.Paint paint18 = xYPlot14.getDomainCrosshairPaint();
        java.awt.Stroke stroke19 = xYPlot14.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot20.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint27 = xYPlot26.getBackgroundPaint();
        xYPlot20.setRangeZeroBaselinePaint(paint27);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D11, rectangle2D12, (double) 0.0f, stroke19, paint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxis((int) (byte) -1, categoryAxis13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDatasetRenderingOrder(datasetRenderingOrder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        java.awt.Stroke stroke10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        double double12 = xYPlot11.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.util.List list15 = null;
        xYPlot11.drawDomainGridlines(graphics2D13, rectangle2D14, list15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = xYPlot11.getDrawingSupplier();
        java.awt.Paint paint18 = xYPlot11.getDomainZeroBaselinePaint();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeCrosshair(graphics2D5, rectangle2D6, plotOrientation7, (double) 'a', valueAxis9, stroke10, paint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot4.removeDomainMarker(marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        categoryPlot4.setRangeCrosshairValue((double) (-1), true);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainGridlinePosition(categoryAnchor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxis((int) (short) -1, categoryAxis8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = categoryPlot4.getDomainAxisIndex(categoryAxis14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setSeriesRenderingOrder(seriesRenderingOrder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawQuadrants(graphics2D2, rectangle2D3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot4.getDomainAxis();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map16 = categoryPlot4.drawAxes(graphics2D12, rectangle2D13, rectangle2D14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNull(categoryAxis11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        boolean boolean6 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = categoryPlot15.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot15.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot15.setRenderer(categoryItemRenderer18);
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot20.getDomainAxisLocation((int) (short) 100);
        categoryPlot15.setDomainAxisLocation(axisLocation25);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setRangeAxisLocation((int) (short) -1, axisLocation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
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
        java.awt.Stroke stroke26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot16.setDomainGridlineStroke(stroke26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis29, valueAxis30, categoryItemRenderer31);
        java.awt.Paint paint33 = categoryPlot32.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawDomainCrosshair(graphics2D7, rectangle2D8, plotOrientation9, (double) 100, valueAxis11, stroke26, paint33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = categoryPlot4.getRangeAxisIndex(valueAxis9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.Stroke stroke11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot16.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup18 = categoryPlot16.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot16.getDomainAxisEdge();
        categoryPlot16.configureDomainAxes();
        java.awt.Paint paint21 = categoryPlot16.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D8, rectangle2D9, (double) (short) 10, stroke11, paint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke6 = xYPlot5.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot7.getDomainAxis(10);
        xYPlot7.configureDomainAxes();
        java.awt.Paint paint11 = xYPlot7.getDomainCrosshairPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawHorizontalLine(graphics2D2, rectangle2D3, (double) 0.0f, stroke6, paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        xYPlot0.zoomDomainAxes((double) 1L, (double) (byte) 0, plotRenderingInfo4, point2D5);
        java.lang.Class<?> wildcardClass7 = xYPlot0.getClass();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) 'a', marker10, layer11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        float float6 = xYPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(0, marker8, layer9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot16.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup18 = categoryPlot16.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot16.setRenderer(categoryItemRenderer19);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot21.getDomainAxisLocation((int) (short) 100);
        categoryPlot16.setDomainAxisLocation(axisLocation26);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation((int) (short) -1, axisLocation26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(layer7);
        xYPlot0.clearDomainAxes();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(100, categoryMarker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Marker marker3 = null;
        org.jfree.chart.util.Layer layer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(0, marker3, layer4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.awt.Paint paint10 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot11.drawZeroRangeBaseline(graphics2D12, rectangle2D13);
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot11.getDataset((int) (short) 0);
        boolean boolean17 = xYPlot11.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        xYPlot11.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        org.jfree.chart.axis.AxisSpace axisSpace24 = xYPlot11.calculateDomainAxisSpace(graphics2D21, rectangle2D22, axisSpace23);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace23, true);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = categoryPlot33.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot33.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot33.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
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
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis56, valueAxis57, categoryItemRenderer58);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = categoryPlot59.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup61 = categoryPlot59.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer62 = null;
        categoryPlot59.setRenderer(categoryItemRenderer62);
        org.jfree.chart.axis.CategoryAxis categoryAxis64 = null;
        categoryPlot59.setDomainAxis(categoryAxis64);
        categoryPlot59.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset67 = null;
        org.jfree.chart.axis.ValueAxis valueAxis68 = null;
        org.jfree.chart.axis.ValueAxis valueAxis69 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer70 = null;
        org.jfree.chart.plot.XYPlot xYPlot71 = new org.jfree.chart.plot.XYPlot(xYDataset67, valueAxis68, valueAxis69, xYItemRenderer70);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray72 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot71.setRangeAxes(valueAxisArray72);
        org.jfree.chart.axis.ValueAxis valueAxis75 = null;
        xYPlot71.setRangeAxis(1, valueAxis75);
        java.awt.Paint paint77 = xYPlot71.getDomainGridlinePaint();
        categoryPlot59.setRangeCrosshairPaint(paint77);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeCrosshair(graphics2D27, rectangle2D28, plotOrientation36, (-1.0d), valueAxis38, stroke53, paint77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(xYDataset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(axisSpace24);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNotNull(sortOrder35);
        org.junit.Assert.assertNotNull(plotOrientation36);
        org.junit.Assert.assertNotNull(drawingSupplier44);
        org.junit.Assert.assertNull(datasetGroup45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(drawingSupplier60);
        org.junit.Assert.assertNull(datasetGroup61);
        org.junit.Assert.assertNotNull(valueAxisArray72);
        org.junit.Assert.assertArrayEquals(valueAxisArray72, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint77);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        java.lang.Class<?> wildcardClass12 = xYPlot0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D3, rectangle2D4);
        java.lang.String str6 = xYPlot0.getPlotType();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "XY Plot" + "'", str6, "XY Plot");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.data.xy.XYDataset xYDataset11 = xYPlot6.getDataset((int) (short) 0);
        boolean boolean12 = xYPlot6.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot6.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        org.jfree.chart.axis.AxisSpace axisSpace19 = xYPlot6.calculateDomainAxisSpace(graphics2D16, rectangle2D17, axisSpace18);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace18, false);
        java.awt.Stroke stroke22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeCrosshairStroke(stroke22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(xYDataset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(axisSpace19);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        org.jfree.chart.plot.Marker marker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.data.xy.XYDataset xYDataset11 = xYPlot6.getDataset((int) (short) 0);
        boolean boolean12 = xYPlot6.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot6.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        org.jfree.chart.axis.AxisSpace axisSpace19 = xYPlot6.calculateDomainAxisSpace(graphics2D16, rectangle2D17, axisSpace18);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace19, false);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot4.removeDomainMarker((int) (short) 0, marker23, layer24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(xYDataset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(axisSpace19);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick(10, (int) (short) -1, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        org.jfree.chart.annotations.XYAnnotation xYAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.draw(graphics2D18, rectangle2D19, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot13.drawZeroRangeBaseline(graphics2D14, rectangle2D15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot13.getDomainAxisLocation((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setRangeAxisLocation((int) (short) -1, axisLocation18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot0.getRangeAxisForDataset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index 10 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        boolean boolean0 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        java.lang.Class<?> wildcardClass5 = xYPlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot11.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot11.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot11.getDomainAxisEdge();
        categoryPlot11.configureDomainAxes();
        java.awt.Stroke stroke16 = categoryPlot11.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis19, valueAxis20, categoryItemRenderer21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot22.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryPlot22.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot22.getDomainAxisEdge();
        categoryPlot22.configureDomainAxes();
        java.awt.Paint paint27 = categoryPlot22.getDomainGridlinePaint();
        xYPlot17.setNoDataMessagePaint(paint27);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawHorizontalLine(graphics2D4, rectangle2D5, (double) 1.0f, stroke16, paint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        java.awt.Stroke stroke4 = xYPlot0.getDomainCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        xYPlot0.setDataset(xYDataset5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = xYPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        categoryPlot13.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup23 = categoryPlot21.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot21.setRenderer(categoryItemRenderer24);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        xYPlot26.drawZeroRangeBaseline(graphics2D27, rectangle2D28);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot26.getDomainAxisLocation((int) (short) 100);
        categoryPlot21.setDomainAxisLocation(axisLocation31);
        categoryPlot13.setRangeAxisLocation((int) (byte) 100, axisLocation31, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation((int) (short) -1, axisLocation31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.jfree.chart.plot.Marker marker12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xYPlot0.removeDomainMarker(marker12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (byte) 0, categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.data.xy.XYDataset xYDataset11 = xYPlot6.getDataset((int) (short) 0);
        boolean boolean12 = xYPlot6.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot6.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        org.jfree.chart.axis.AxisSpace axisSpace19 = xYPlot6.calculateDomainAxisSpace(graphics2D16, rectangle2D17, axisSpace18);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace18, false);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(0, marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(xYDataset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(axisSpace19);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        categoryPlot4.setRangeCrosshairValue((double) (-1), true);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxis((-1), valueAxis12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeDomainMarker(marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.geom.Point2D point2D3 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDatasetRenderingOrder(datasetRenderingOrder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(point2D3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(xYDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisSpace31);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        categoryPlot4.setNoDataMessage("");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick((int) 'a', (int) (byte) 10, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxisForDataset((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index 1 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot0.setRangeAxis((int) (byte) 0, valueAxis16);
        org.jfree.chart.plot.Marker marker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot7.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot7.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint14 = xYPlot13.getBackgroundPaint();
        xYPlot7.setRangeZeroBaselinePaint(paint14);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setQuadrantPaint((-1), paint14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (-1) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xYPlot0.removeDomainMarker((int) (byte) 10, marker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(datasetGroup20);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xYPlot0.removeDomainMarker(marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Plot plot10 = xYPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = plot10.getNoDataMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        xYPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(seriesRenderingOrder19);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder11 = xYPlot4.getSeriesRenderingOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot4.getDomainAxisForDataset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index -1 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(seriesRenderingOrder11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder11 = xYPlot4.getSeriesRenderingOrder();
        int int12 = xYPlot4.getWeight();
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(seriesRenderingOrder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        xYPlot0.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        xYPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xYPlot0.removeRangeMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = categoryPlot4.removeRangeMarker((-1), marker30, layer31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xYPlot0.removeDomainMarker((int) (short) 100, marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker18, layer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot4.getFixedDomainAxisSpace();
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (short) 100, marker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(axisSpace17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        boolean boolean6 = xYPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint12 = xYPlot0.getQuadrantPaint((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (10) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = categoryPlot4.removeDomainMarker(marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint8 = xYPlot0.getQuadrantPaint((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (32) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        boolean boolean4 = xYPlot0.isRangeZoomable();
        xYPlot0.setDomainCrosshairValue((double) (short) -1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot6.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = xYPlot6.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke14 = xYPlot13.getDomainZeroBaselineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot19.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup21 = categoryPlot19.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot19.getDomainAxisEdge();
        categoryPlot19.configureDomainAxes();
        java.awt.Paint paint24 = categoryPlot19.getDomainGridlinePaint();
        java.awt.Paint paint25 = categoryPlot19.getRangeCrosshairPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawDomainCrosshair(graphics2D4, rectangle2D5, plotOrientation10, (double) 1.0f, valueAxis12, stroke14, paint25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot4.getRangeAxis((int) (short) 10);
        boolean boolean12 = categoryPlot4.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        int int17 = xYPlot0.getRangeAxisCount();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick((int) (short) 0, (int) (short) 1, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map13 = categoryPlot4.drawAxes(graphics2D9, rectangle2D10, rectangle2D11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRenderer((int) (byte) -1, categoryItemRenderer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(sortOrder13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset6 = xYPlot0.getDataset();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) (short) 1, marker8, layer9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(xYDataset6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        int int7 = xYPlot0.getRangeAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke10 = xYPlot9.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder11 = xYPlot9.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot9.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setRangeAxisLocation((-1), axisLocation12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder11);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot4.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (short) 100, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.Marker marker5 = null;
        org.jfree.chart.util.Layer layer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) ' ', marker5, layer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot4.removeDomainMarker(10, marker13, layer14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot4.removeRangeMarker((int) 'a', marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.geom.Point2D point2D3 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.Marker marker4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = xYPlot0.removeDomainMarker(marker4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(point2D3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        int int10 = categoryPlot4.getDatasetCount();
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxisForDataset((int) (short) 10);
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        float float19 = xYPlot0.getBackgroundImageAlpha();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xYPlot0.removeAnnotation(xYAnnotation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot();
        double double5 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot4.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = xYPlot4.getDrawingSupplier();
        java.awt.geom.Point2D point2D10 = xYPlot4.getQuadrantOrigin();
        categoryPlot0.zoomRangeAxes((double) (byte) 1, plotRenderingInfo3, point2D10);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = categoryPlot0.removeRangeMarker((int) (byte) 100, marker13, layer14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(point2D10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(1, marker11, layer12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = categoryPlot4.getRangeAxisIndex(valueAxis29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot9.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot9.getDomainAxisLocation((int) (short) 100);
        categoryPlot4.setDomainAxisLocation(axisLocation14);
        org.jfree.chart.plot.Marker marker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        java.util.List list9 = categoryPlot4.getCategories();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot4.removeAnnotation(categoryAnnotation10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        boolean boolean9 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot4.setDomainAxis((int) (short) 100, categoryAxis11);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        org.jfree.chart.plot.CrosshairState crosshairState8 = null;
        boolean boolean9 = xYPlot0.render(graphics2D4, rectangle2D5, 10, plotRenderingInfo7, crosshairState8);
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot0.removeRangeMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot4.getRowRenderingOrder();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(sortOrder9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = xYPlot4.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot11.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot11.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot11.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot11.setDomainAxis((int) ' ', categoryAxis16);
        categoryPlot11.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot11.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot11.getRangeAxisLocation();
        xYPlot4.setDomainAxisLocation(axisLocation22);
        org.jfree.chart.plot.Marker marker24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xYPlot4.removeDomainMarker(marker24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(sortOrder13);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertNull(categoryAxis21);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        double double12 = xYPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        boolean boolean15 = categoryPlot4.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset6 = xYPlot0.getDataset();
        xYPlot0.zoom((double) 0.0f);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(xYDataset6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = categoryPlot4.getDomainAxisIndex(categoryAxis17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer15, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(sortOrder13);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (short) 1, categoryMarker7, layer8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D3, rectangle2D4);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getDomainMarkers(layer6);
        int int8 = xYPlot0.getDomainAxisCount();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(10, marker15, layer16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot4.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot4.setRenderer(categoryItemRenderer35, false);
        org.jfree.chart.axis.AxisSpace axisSpace38 = categoryPlot4.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(xYDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisSpace31);
        org.junit.Assert.assertNull(axisSpace38);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot11.getDomainAxis(10);
        xYPlot11.configureDomainAxes();
        java.awt.Paint paint15 = xYPlot11.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = xYPlot11.getDataRange(valueAxis16);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot18.getDomainAxisLocation((int) (short) 100);
        xYPlot11.setDomainAxisLocation(axisLocation23);
        categoryPlot4.setRangeAxisLocation(axisLocation23, true);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis29, valueAxis30, categoryItemRenderer31);
        categoryPlot32.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup42 = categoryPlot40.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        categoryPlot40.setRenderer(categoryItemRenderer43);
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        xYPlot45.drawZeroRangeBaseline(graphics2D46, rectangle2D47);
        org.jfree.chart.axis.AxisLocation axisLocation50 = xYPlot45.getDomainAxisLocation((int) (short) 100);
        categoryPlot40.setDomainAxisLocation(axisLocation50);
        categoryPlot32.setRangeAxisLocation((int) (byte) 100, axisLocation50, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxisLocation((-1), axisLocation50, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(axisLocation50);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = xYPlot0.getDomainMarkers(layer16);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        xYPlot30.drawZeroRangeBaseline(graphics2D31, rectangle2D32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot30.getDomainAxisLocation((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation((int) (byte) -1, axisLocation35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot4.setRenderer((int) (short) 1, categoryItemRenderer13, false);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (short) -1, categoryMarker21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot4.getColumnRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot14.setDomainAxis(0, categoryAxis16, false);
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot14.getDomainAxis();
        categoryPlot14.clearDomainMarkers();
        java.util.List list22 = categoryPlot14.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis24, valueAxis25, categoryItemRenderer26);
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        categoryPlot27.setDomainAxis(0, categoryAxis29, false);
        categoryPlot27.configureDomainAxes();
        boolean boolean33 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setRangeCrosshairValue((double) 10);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        categoryPlot40.setDomainAxis(0, categoryAxis42, false);
        categoryPlot40.configureDomainAxes();
        java.awt.Stroke stroke46 = categoryPlot40.getDomainGridlineStroke();
        categoryPlot40.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean50 = categoryPlot40.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation52 = categoryPlot40.getDomainAxisLocation(10);
        categoryPlot27.setDomainAxisLocation(axisLocation52);
        categoryPlot14.setDomainAxisLocation(axisLocation52, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxisLocation((-1), axisLocation52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNull(list22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(axisLocation52);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom(0.0d);
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.setRangeGridlinesVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        boolean boolean9 = categoryPlot4.isDomainGridlinesVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRenderer((-1), categoryItemRenderer13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = categoryDataset11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        int int6 = categoryPlot4.getWeight();
        org.jfree.chart.plot.Marker marker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot4.removeRangeMarker(marker7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        org.jfree.chart.annotations.XYAnnotation xYAnnotation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.chart.plot.Marker marker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = xYPlot0.removeDomainMarker(marker9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(seriesRenderingOrder8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        double double14 = xYPlot13.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot13.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot17 = xYPlot13.getRootPlot();
        xYPlot13.clearRangeMarkers();
        boolean boolean19 = xYPlot13.isRangeCrosshairVisible();
        java.awt.Paint paint20 = xYPlot13.getRangeTickBandPaint();
        boolean boolean21 = xYPlot13.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot31.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup33 = categoryPlot31.getDatasetGroup();
        boolean boolean34 = categoryPlot31.isDomainZoomable();
        boolean boolean35 = categoryPlot31.isRangeZoomable();
        categoryPlot31.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        categoryPlot31.setDataset((int) ' ', categoryDataset39);
        java.awt.Stroke stroke41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot31.setDomainGridlineStroke(stroke41);
        categoryPlot26.setOutlineStroke(stroke41);
        xYPlot13.setOutlineStroke(stroke41);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis46, valueAxis47, categoryItemRenderer48);
        categoryPlot49.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer53 = null;
        categoryPlot49.setRenderer((int) 'a', categoryItemRenderer53, false);
        int int56 = categoryPlot49.getWeight();
        java.awt.Paint paint57 = categoryPlot49.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawHorizontalLine(graphics2D10, rectangle2D11, (double) (short) 100, stroke41, paint57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(point2D9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = categoryPlot33.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup35 = categoryPlot33.getDatasetGroup();
        boolean boolean36 = categoryPlot33.isDomainZoomable();
        boolean boolean37 = categoryPlot33.isRangeZoomable();
        categoryPlot33.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        categoryPlot33.setDataset((int) ' ', categoryDataset41);
        java.awt.Stroke stroke43 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot33.setDomainGridlineStroke(stroke43);
        categoryPlot28.setOutlineStroke(stroke43);
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot();
        double double47 = xYPlot46.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis49 = xYPlot46.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis51 = xYPlot46.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot52 = xYPlot46.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        xYPlot53.drawZeroRangeBaseline(graphics2D54, rectangle2D55);
        org.jfree.data.xy.XYDataset xYDataset58 = xYPlot53.getDataset((int) (short) 0);
        java.awt.Paint paint59 = xYPlot53.getOutlinePaint();
        xYPlot46.setRangeCrosshairPaint(paint59);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D21, rectangle2D22, (-1.0d), stroke43, paint59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNull(datasetGroup35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNull(valueAxis49);
        org.junit.Assert.assertNull(valueAxis51);
        org.junit.Assert.assertNotNull(plot52);
        org.junit.Assert.assertNull(xYDataset58);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = xYPlot4.getLegendItems();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot9.getDomainAxis(10);
        xYPlot9.configureDomainAxes();
        java.awt.Paint paint13 = xYPlot9.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.data.Range range15 = xYPlot9.getDataRange(valueAxis14);
        boolean boolean16 = xYPlot9.isRangeZeroBaselineVisible();
        xYPlot9.clearDomainMarkers(0);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot23.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder25 = categoryPlot23.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot23.getOrientation();
        xYPlot9.setOrientation(plotOrientation26);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot35.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup37 = categoryPlot35.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot35.getDomainAxisEdge();
        categoryPlot35.configureDomainAxes();
        java.awt.Paint paint40 = categoryPlot35.getDomainGridlinePaint();
        xYPlot30.setNoDataMessagePaint(paint40);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent42 = null;
        xYPlot30.rendererChanged(rendererChangeEvent42);
        boolean boolean44 = xYPlot30.isDomainCrosshairVisible();
        java.awt.Stroke stroke45 = xYPlot30.getDomainZeroBaselineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot(categoryDataset46, categoryAxis47, valueAxis48, categoryItemRenderer49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = null;
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer54 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = new org.jfree.chart.plot.CategoryPlot(categoryDataset51, categoryAxis52, valueAxis53, categoryItemRenderer54);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier56 = categoryPlot55.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup57 = categoryPlot55.getDatasetGroup();
        boolean boolean58 = categoryPlot55.isDomainZoomable();
        boolean boolean59 = categoryPlot55.isRangeZoomable();
        categoryPlot55.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        categoryPlot55.setDataset((int) ' ', categoryDataset63);
        java.awt.Stroke stroke65 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot55.setDomainGridlineStroke(stroke65);
        categoryPlot50.setOutlineStroke(stroke65);
        java.awt.Paint paint68 = categoryPlot50.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.drawRangeCrosshair(graphics2D7, rectangle2D8, plotOrientation26, (double) 0.5f, valueAxis29, stroke45, paint68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(sortOrder25);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNull(datasetGroup37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(drawingSupplier56);
        org.junit.Assert.assertNull(datasetGroup57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(paint68);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot4.removeAnnotation(categoryAnnotation24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = categoryPlot4.removeDomainMarker(10, marker15, layer16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxis((int) (byte) -1, valueAxis26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        java.awt.Image image8 = categoryPlot4.getBackgroundImage();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot4.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot4.render(graphics2D10, rectangle2D11, (int) (byte) 0, plotRenderingInfo13);
        categoryPlot4.clearDomainMarkers((int) (short) 0);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        boolean boolean8 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (byte) 1, marker10, layer11);
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
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setDomainCrosshairValue(0.0d);
        xYPlot0.clearDomainMarkers((int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        double double17 = xYPlot16.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.util.List list20 = null;
        xYPlot16.drawDomainGridlines(graphics2D18, rectangle2D19, list20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = xYPlot16.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = xYPlot16.getDrawingSupplier();
        java.awt.Stroke stroke24 = xYPlot16.getDomainZeroBaselineStroke();
        java.awt.geom.Point2D point2D25 = xYPlot16.getQuadrantOrigin();
        xYPlot0.zoomDomainAxes((double) 1.0f, (double) (byte) 0, plotRenderingInfo15, point2D25);
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) '#', marker28, layer29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(point2D25);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = xYPlot0.getBackgroundPaint();
        org.jfree.chart.plot.Marker marker3 = null;
        org.jfree.chart.util.Layer layer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = xYPlot0.removeDomainMarker((int) (short) 100, marker3, layer4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setDomainCrosshairValue(0.0d);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map15 = xYPlot0.drawAxes(graphics2D11, rectangle2D12, rectangle2D13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot4.removeAnnotation(categoryAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        int int6 = categoryPlot4.getWeight();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (short) 10, marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = categoryPlot4.getDomainAxisIndex(categoryAxis24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.awt.Paint paint10 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot4.removeRangeMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xYPlot0.removeRangeMarker(0, marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        org.jfree.chart.axis.AxisSpace axisSpace27 = xYPlot0.calculateDomainAxisSpace(graphics2D24, rectangle2D25, axisSpace26);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(axisSpace27);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass33 = point2D29.getClass();
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (short) 1, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = categoryPlot4.getDomainAxisIndex(categoryAxis15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        xYPlot0.setBackgroundAlpha((float) (-1L));
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getDomainGridlinePaint();
        java.lang.Object obj6 = categoryPlot4.clone();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot4.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot17.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup19 = categoryPlot17.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot17.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot21.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint28 = xYPlot27.getBackgroundPaint();
        xYPlot21.setRangeZeroBaselinePaint(paint28);
        categoryPlot17.setBackgroundPaint(paint28);
        boolean boolean31 = categoryPlot17.isRangeZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot17.getDomainAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation((int) (short) -1, axisLocation32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor20 = categoryPlot4.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(categoryAnchor20);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        categoryPlot4.setBackgroundAlpha((float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis6 = xYPlot4.getDomainAxisForDataset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index 52 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot4.getOrientation();
        categoryPlot4.clearAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxis((-1), categoryAxis10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.Class<?> wildcardClass13 = categoryPlot4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.awt.geom.Point2D point2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setQuadrantOrigin(point2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'origin' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot0.axisChanged(axisChangeEvent5);
        java.lang.String str7 = xYPlot0.getPlotType();
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "XY Plot" + "'", str7, "XY Plot");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot0.removeDomainMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot4.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(axisSpace17);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot4.getDomainMarkers(layer13);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        boolean boolean7 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.clearDomainMarkers(0);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        xYPlot0.setOrientation(plotOrientation17);
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot0.getDomainAxisLocation(10);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick((int) (short) 0, (int) '4', plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = categoryPlot4.removeDomainMarker((int) (short) 1, marker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = categoryPlot4.removeDomainMarker((int) 'a', marker16, layer17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        xYPlot0.setRangeCrosshairValue((double) 10.0f, true);
        org.jfree.chart.plot.Marker marker20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker20);
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
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation21 = categoryPlot4.getOrientation();
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(plotOrientation21);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = categoryPlot4.getRangeMarkers((int) (byte) -1, layer40);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNull(collection41);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = xYPlot0.getDomainMarkers(layer21);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(collection22);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xYPlot0.removeDomainMarker(100, marker30, layer31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(point2D20);
        org.junit.Assert.assertNotNull(axisLocation24);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.jfree.chart.annotations.XYAnnotation xYAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        boolean boolean5 = xYPlot0.isDomainGridlinesVisible();
        xYPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        categoryPlot4.configureRangeAxes();
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        int int10 = categoryPlot4.getDatasetCount();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot4.removeRangeMarker(100, marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        xYPlot0.setDomainCrosshairValue((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset35, categoryAxis36, valueAxis37, categoryItemRenderer38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = categoryPlot39.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder41 = categoryPlot39.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot39.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        categoryPlot39.setDomainAxis((int) ' ', categoryAxis44);
        categoryPlot39.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = categoryPlot39.getDomainAxisForDataset(0);
        int int50 = categoryPlot39.getRangeAxisCount();
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        categoryPlot39.drawAnnotations(graphics2D51, rectangle2D52, plotRenderingInfo53);
        categoryPlot39.setWeight((int) (byte) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor57 = categoryPlot39.getDomainGridlinePosition();
        categoryPlot4.setDomainGridlinePosition(categoryAnchor57);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertNull(range34);
        org.junit.Assert.assertNotNull(drawingSupplier40);
        org.junit.Assert.assertNotNull(sortOrder41);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertNull(categoryAxis49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(categoryAnchor57);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map17 = xYPlot0.drawAxes(graphics2D13, rectangle2D14, rectangle2D15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot4.setDomainAxes(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] {});
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick((-1), 100, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        xYPlot0.clearDomainMarkers((int) '4');
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot12.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        org.jfree.chart.axis.AxisLocation axisLocation17 = xYPlot12.getDomainAxisLocation((int) (short) 100);
        categoryPlot4.setRangeAxisLocation(0, axisLocation17);
        float float19 = categoryPlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray9, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot4.removeAnnotation(categoryAnnotation6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D3, rectangle2D4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        xYPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) ' ', marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder9 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        categoryPlot4.notifyListeners(plotChangeEvent10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(datasetRenderingOrder9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = xYPlot0.getInsets();
        xYPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.util.List list11 = null;
        xYPlot0.drawRangeGridlines(graphics2D9, rectangle2D10, list11);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Marker marker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(false);
        int int9 = xYPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot7.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = xYPlot7.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.data.Range range15 = xYPlot0.getDataRange(valueAxis14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis19, valueAxis20, categoryItemRenderer21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot22.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot22.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot22.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        xYPlot28.drawZeroRangeBaseline(graphics2D29, rectangle2D30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot28.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke34 = xYPlot28.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        xYPlot35.drawZeroRangeBaseline(graphics2D36, rectangle2D37);
        boolean boolean39 = xYPlot35.isDomainCrosshairVisible();
        xYPlot35.setRangeCrosshairVisible(true);
        int int42 = xYPlot35.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = categoryPlot47.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup49 = categoryPlot47.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        categoryPlot47.setRenderer(categoryItemRenderer50);
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = null;
        categoryPlot47.setDomainAxis(categoryAxis52);
        categoryPlot47.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer58 = null;
        org.jfree.chart.plot.XYPlot xYPlot59 = new org.jfree.chart.plot.XYPlot(xYDataset55, valueAxis56, valueAxis57, xYItemRenderer58);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray60 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot59.setRangeAxes(valueAxisArray60);
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        xYPlot59.setRangeAxis(1, valueAxis63);
        java.awt.Paint paint65 = xYPlot59.getDomainGridlinePaint();
        categoryPlot47.setRangeCrosshairPaint(paint65);
        xYPlot35.setRangeZeroBaselinePaint(paint65);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawRangeCrosshair(graphics2D16, rectangle2D17, plotOrientation25, (double) 100.0f, valueAxis27, stroke34, paint65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier48);
        org.junit.Assert.assertNull(datasetGroup49);
        org.junit.Assert.assertNotNull(valueAxisArray60);
        org.junit.Assert.assertArrayEquals(valueAxisArray60, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint65);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        boolean boolean8 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xYPlot0.removeRangeMarker(marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        java.awt.geom.Point2D point2D6 = xYPlot0.getQuadrantOrigin();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (byte) 10, marker8, layer9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(point2D6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick(0, 10, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick((int) (byte) -1, 10, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot31.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup33 = categoryPlot31.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot31.getDomainAxisEdge();
        categoryPlot31.configureDomainAxes();
        java.awt.Paint paint36 = categoryPlot31.getDomainGridlinePaint();
        xYPlot26.setNoDataMessagePaint(paint36);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent38 = null;
        xYPlot26.rendererChanged(rendererChangeEvent38);
        boolean boolean40 = xYPlot26.isDomainCrosshairVisible();
        java.awt.Stroke stroke41 = xYPlot26.getDomainZeroBaselineStroke();
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D23, rectangle2D24, (double) 0L, stroke41, paint51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(drawingSupplier47);
        org.junit.Assert.assertNull(datasetGroup48);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot4.getDomainMarkers(0, layer16);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(collection17);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot10.getDomainAxis(10);
        xYPlot10.configureDomainAxes();
        java.awt.Paint paint14 = xYPlot10.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.data.Range range16 = xYPlot10.getDataRange(valueAxis15);
        xYPlot10.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation19 = xYPlot10.getRangeAxisLocation();
        categoryPlot4.setRangeAxisLocation((int) (short) 10, axisLocation19);
        boolean boolean21 = categoryPlot4.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        boolean boolean7 = xYPlot0.isRangeZeroBaselineVisible();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint9 = xYPlot0.getQuadrantPaint((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (97) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        xYPlot0.setWeight((int) ' ');
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot10.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot10.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot16 = xYPlot10.getRootPlot();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = xYPlot10.getDomainMarkers(layer17);
        xYPlot10.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot24.getDrawingSupplier();
        java.awt.Stroke stroke26 = categoryPlot24.getRangeGridlineStroke();
        xYPlot10.setDomainGridlineStroke(stroke26);
        xYPlot0.setRangeGridlineStroke(stroke26);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        xYPlot0.setRangeAxis(valueAxis29);
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xYPlot0.removeRangeMarker((int) (byte) 0, marker32, layer33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        java.awt.Image image9 = categoryPlot4.getBackgroundImage();
        java.awt.Paint paint10 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeDomainMarker(marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        boolean boolean4 = xYPlot0.isRangeZoomable();
        xYPlot0.setDomainCrosshairValue((double) (short) -1);
        double double7 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDomainAxisLocation(axisLocation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick((int) '#', 0, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot8.getDomainAxis(10);
        xYPlot8.configureDomainAxes();
        java.awt.Paint paint12 = xYPlot8.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = xYPlot8.getDataRange(valueAxis13);
        boolean boolean15 = xYPlot8.isRangeZeroBaselineVisible();
        xYPlot8.clearDomainMarkers(0);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot8.getRangeMarkers((int) '#', layer19);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        double double22 = xYPlot21.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot21.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot21.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot27 = xYPlot21.getRootPlot();
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = xYPlot21.getDomainMarkers(layer28);
        xYPlot21.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot35.getDrawingSupplier();
        java.awt.Stroke stroke37 = categoryPlot35.getRangeGridlineStroke();
        xYPlot21.setDomainGridlineStroke(stroke37);
        xYPlot8.setOutlineStroke(stroke37);
        categoryPlot4.setRangeCrosshairStroke(stroke37);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder9 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        categoryPlot4.notifyListeners(plotChangeEvent10);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(datasetRenderingOrder9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot4.setRenderer((int) (short) 1, categoryItemRenderer10, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.mapDatasetToDomainAxis((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        double double10 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        xYPlot0.setRangeAxis((int) (short) 1, valueAxis12, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        boolean boolean9 = xYPlot0.isDomainCrosshairVisible();
        java.awt.Paint paint10 = xYPlot0.getDomainZeroBaselinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(seriesRenderingOrder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent8);
        categoryPlot4.setDomainGridlinesVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot4.getRendererForDataset(categoryDataset12);
        org.junit.Assert.assertNull(categoryItemRenderer13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (byte) 100, categoryMarker30, layer31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot0.getRangeAxisForDataset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index -1 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray5 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setRangeAxes(valueAxisArray5);
        org.jfree.chart.plot.Plot plot7 = xYPlot4.getRootPlot();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot4.removeDomainMarker(1, marker9, layer10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray5);
        org.junit.Assert.assertArrayEquals(valueAxisArray5, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        categoryPlot11.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot19.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup21 = categoryPlot19.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot19.setRenderer(categoryItemRenderer22);
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        xYPlot24.drawZeroRangeBaseline(graphics2D25, rectangle2D26);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot24.getDomainAxisLocation((int) (short) 100);
        categoryPlot19.setDomainAxisLocation(axisLocation29);
        categoryPlot11.setRangeAxisLocation((int) (byte) 100, axisLocation29, true);
        xYPlot4.setRangeAxisLocation(axisLocation29, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(axisLocation29);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot6 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint7 = xYPlot6.getBackgroundPaint();
        xYPlot0.setRangeZeroBaselinePaint(paint7);
        java.awt.Paint paint9 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) (byte) 10, marker16, layer17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(axisSpace14);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xYPlot0.removeDomainMarker((int) '4', marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset6 = xYPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setRangeAxis((int) (byte) 1, valueAxis8, false);
        int int11 = xYPlot0.getDatasetCount();
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(0, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(xYDataset6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot4.getAxisOffset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.plot.CategoryMarker categoryMarker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (byte) -1, categoryMarker19, layer20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(10, marker12, layer13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        xYPlot0.setDomainCrosshairLockedOnData(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick(0, (int) (byte) 0, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke6 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) (short) 100, marker8, layer9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot14.setDomainAxis(0, categoryAxis16, false);
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        xYPlot21.drawZeroRangeBaseline(graphics2D22, rectangle2D23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot21.getDomainAxisLocation((int) (short) 100);
        categoryPlot14.setRangeAxisLocation((int) (byte) 10, axisLocation26, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation((-1), axisLocation26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        boolean boolean15 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = categoryPlot4.getDomainAxisIndex(categoryAxis18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        boolean boolean20 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = xYPlot0.getRangeMarkers(100, layer22);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = xYPlot0.removeAnnotation(xYAnnotation24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick(10, (int) (byte) 0, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        xYPlot0.setDomainZeroBaselineVisible(true);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xYPlot0.removeDomainMarker(marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        java.lang.String str8 = xYPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isDomainCrosshairVisible();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint8 = xYPlot0.getQuadrantPaint((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (-1) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        xYPlot0.setDomainZeroBaselineVisible(false);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map14 = xYPlot0.drawAxes(graphics2D10, rectangle2D11, rectangle2D12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataset7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (byte) 10, marker18, layer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        xYPlot0.clearAnnotations();
        xYPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot4.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot4.getAxisOffset();
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot4.getRangeAxis((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        categoryPlot4.setBackgroundAlpha((float) (short) 1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.util.Layer layer18 = null;
        categoryPlot4.drawRangeMarkers(graphics2D15, rectangle2D16, (-1), layer18);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot4.getFixedLegendItems();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(legendItemCollection10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.plot.Marker marker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = categoryPlot4.removeDomainMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = xYPlot0.getInsets();
        java.awt.Paint paint8 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xYPlot0.removeDomainMarker(marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        org.jfree.chart.plot.Plot plot27 = categoryPlot0.getParent();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNull(plot27);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = xYPlot0.removeRangeMarker(marker27, layer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(point2D20);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNull(collection26);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getRangeAxisLocation();
        java.awt.Paint paint4 = xYPlot0.getDomainTickBandPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = xYPlot0.getRenderer();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(xYItemRenderer5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        int int29 = categoryPlot4.getDatasetCount();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setBackgroundImageAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = categoryPlot4.getDomainAxisIndex(categoryAxis22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setDomainCrosshairValue(0.0d);
        xYPlot0.clearDomainMarkers((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot0.getDomainAxisForDataset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index -1 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke14 = xYPlot13.getDomainZeroBaselineStroke();
        java.util.List list15 = xYPlot13.getAnnotations();
        java.awt.geom.Point2D point2D16 = xYPlot13.getQuadrantOrigin();
        categoryPlot4.zoomDomainAxes((double) (short) 100, plotRenderingInfo12, point2D16, false);
        org.jfree.chart.plot.Marker marker19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(point2D16);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        boolean boolean4 = xYPlot0.isRangeZoomable();
        xYPlot0.setDomainCrosshairValue((double) (short) -1);
        double double7 = xYPlot0.getRangeCrosshairValue();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint9 = xYPlot0.getQuadrantPaint((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (100) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.setDomainCrosshairLockedOnData(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
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
        org.jfree.chart.plot.PlotState plotState25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.draw(graphics2D7, rectangle2D8, point2D23, plotState25, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(point2D23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (byte) 0, marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        categoryPlot4.clearRangeAxes();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        xYPlot0.setDomainZeroBaselineVisible(true);
        xYPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot12.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        boolean boolean16 = xYPlot12.isDomainCrosshairVisible();
        xYPlot12.setRangeCrosshairVisible(true);
        int int19 = xYPlot12.getRangeAxisCount();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.data.xy.XYDataset xYDataset25 = xYPlot20.getDataset((int) (short) 0);
        java.awt.Paint paint26 = xYPlot20.getOutlinePaint();
        int int27 = xYPlot20.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = xYPlot20.getLegendItems();
        xYPlot12.setFixedLegendItems(legendItemCollection28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot35.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder37 = categoryPlot35.getRowRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation38 = categoryPlot35.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        categoryPlot35.setDomainAxis((int) ' ', categoryAxis40);
        categoryPlot35.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = categoryPlot35.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot35.getRangeAxisLocation();
        xYPlot12.setDomainAxisLocation((int) (short) 1, axisLocation46);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDomainAxisLocation((-1), axisLocation46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(xYDataset25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNotNull(sortOrder37);
        org.junit.Assert.assertNotNull(plotOrientation38);
        org.junit.Assert.assertNull(categoryAxis45);
        org.junit.Assert.assertNotNull(axisLocation46);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot4.getRangeAxis(100);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        boolean boolean22 = xYPlot21.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = xYPlot21.getLegendItems();
        categoryPlot4.setFixedLegendItems(legendItemCollection23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot4.getRangeAxisLocation((int) (short) 1);
        categoryPlot4.setAnchorValue((double) (short) -1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRendererForDataset(xYDataset7);
        xYPlot4.setRangeCrosshairValue(0.0d, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYItemRenderer8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot4.setRenderer((int) (short) 1, categoryItemRenderer10, true);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot4.getRendererForDataset(categoryDataset13);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryItemRenderer14);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot4.getRendererForDataset(categoryDataset13);
        int int15 = categoryPlot4.getRangeAxisCount();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.Marker marker3 = null;
        org.jfree.chart.util.Layer layer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = categoryPlot0.removeRangeMarker(100, marker3, layer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        xYPlot0.setRangeAxis((int) '#', valueAxis4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot0.setRangeAxis(0, valueAxis7, true);
        org.jfree.chart.axis.AxisLocation axisLocation10 = xYPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xYPlot0.removeRangeMarker(10, marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        xYPlot0.setDomainCrosshairLockedOnData(true);
        xYPlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        java.lang.Object obj9 = xYPlot0.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        int int11 = categoryPlot4.getWeight();
        categoryPlot4.clearRangeMarkers();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot4.getRangeAxis(100);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        boolean boolean22 = xYPlot21.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = xYPlot21.getLegendItems();
        categoryPlot4.setFixedLegendItems(legendItemCollection23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot4.getRangeAxisLocation((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot4.getDomainAxisForDataset((int) (short) 10);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNull(categoryAxis28);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map28 = xYPlot0.drawAxes(graphics2D24, rectangle2D25, rectangle2D26, plotRenderingInfo27);
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
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot12.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        org.jfree.chart.axis.AxisLocation axisLocation17 = xYPlot12.getDomainAxisLocation((int) (short) 100);
        categoryPlot4.setRangeAxisLocation(0, axisLocation17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        java.util.List list20 = categoryPlot4.getCategoriesForAxis(categoryAxis19);
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = categoryPlot4.removeRangeMarker(0, marker22, layer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray9, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        int int7 = xYPlot0.getRangeAxisCount();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.Layer layer3 = null;
        java.util.Collection collection4 = categoryPlot0.getRangeMarkers((int) ' ', layer3);
        org.jfree.chart.axis.ValueAxis valueAxis5 = categoryPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot8.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        boolean boolean12 = xYPlot8.isDomainCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot17.getDrawingSupplier();
        xYPlot8.setDrawingSupplier(drawingSupplier18);
        java.awt.geom.Point2D point2D20 = xYPlot8.getQuadrantOrigin();
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D6, rectangle2D7, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(point2D20);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getRangeAxisLocation();
        xYPlot0.setOutlineVisible(false);
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot0.removeDomainMarker(0, marker9, layer10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        boolean boolean20 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.setDomainCrosshairValue((double) 10L);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        boolean boolean9 = categoryPlot4.isDomainGridlinesVisible();
        org.jfree.chart.plot.Marker marker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot4.removeRangeMarker(marker10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        int int11 = categoryPlot4.getIndexOf(categoryItemRenderer10);
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
        categoryPlot4.setFixedDomainAxisSpace(axisSpace31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(xYDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisSpace31);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        boolean boolean9 = categoryPlot4.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(0, categoryMarker11, layer12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(xYDataset6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis(100);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        xYPlot0.drawAnnotations(graphics2D6, rectangle2D7, plotRenderingInfo8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawQuadrants(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        float float19 = xYPlot0.getBackgroundImageAlpha();
        java.lang.Class<?> wildcardClass20 = xYPlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick(10, (int) 'a', plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        categoryPlot26.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot26.getRangeAxisLocation((int) (short) 10);
        categoryPlot4.setRangeAxisLocation(axisLocation31, true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot4.getDomainAxis();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(categoryAxis6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        float float6 = xYPlot0.getBackgroundImageAlpha();
        int int7 = xYPlot0.getDatasetCount();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxis();
        categoryPlot4.setAnchorValue((double) 100, false);
        java.awt.Stroke stroke16 = categoryPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot4.getDomainAxisEdge((int) (byte) 100);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (byte) -1, categoryMarker12, layer13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isRangeCrosshairVisible();
        java.awt.Paint paint8 = categoryPlot4.getRangeGridlinePaint();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) 'a', marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot4.setDomainAxis(categoryAxis8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        int int11 = categoryPlot4.getIndexOf(categoryItemRenderer10);
        int int12 = categoryPlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.clearDomainMarkers((int) (short) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = xYPlot0.getRangeAxisEdge(15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick((int) ' ', (int) 'a', plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        categoryPlot4.clearAnnotations();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        categoryPlot4.setRangeCrosshairValue((double) (short) 0);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        categoryPlot4.setRangeCrosshairValue((double) (-1), true);
        categoryPlot4.clearRangeMarkers((int) (short) 0);
        categoryPlot4.clearAnnotations();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot4.setRenderer(categoryItemRenderer35, false);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = categoryPlot42.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder44 = categoryPlot42.getRowRenderingOrder();
        categoryPlot4.setRowRenderingOrder(sortOrder44);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(xYDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisSpace31);
        org.junit.Assert.assertNotNull(drawingSupplier43);
        org.junit.Assert.assertNotNull(sortOrder44);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot4.getDomainAxisLocation(10);
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot4.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(sortOrder13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        java.lang.Class<?> wildcardClass2 = categoryPlot0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        categoryPlot14.setRangeCrosshairValue((double) 1L, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        categoryPlot14.datasetChanged(datasetChangeEvent18);
        int int20 = categoryPlot14.getDatasetCount();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot14.getRangeAxisLocation((int) '4');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        double double26 = xYPlot25.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot25.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot25.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = xYPlot25.getDrawingSupplier();
        java.awt.geom.Point2D point2D31 = xYPlot25.getQuadrantOrigin();
        categoryPlot14.zoomRangeAxes(0.0d, plotRenderingInfo24, point2D31);
        categoryPlot4.zoomDomainAxes(0.0d, plotRenderingInfo9, point2D31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertNotNull(point2D31);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot4.getRangeAxis((int) (short) 10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map16 = categoryPlot4.drawAxes(graphics2D12, rectangle2D13, rectangle2D14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        java.awt.Paint paint9 = categoryPlot4.getBackgroundPaint();
        int int10 = categoryPlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot5.getDrawingSupplier();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot5.getRowRenderingOrder();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke11 = xYPlot10.getDomainZeroBaselineStroke();
        java.util.List list12 = xYPlot10.getAnnotations();
        categoryPlot5.drawRangeGridlines(graphics2D8, rectangle2D9, list12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot5.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot5.getDomainAxisLocation();
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot16.drawZeroRangeBaseline(graphics2D17, rectangle2D18);
        org.jfree.data.xy.XYDataset xYDataset21 = xYPlot16.getDataset((int) (short) 0);
        java.awt.Paint paint22 = xYPlot16.getOutlinePaint();
        xYPlot16.setDomainZeroBaselineVisible(true);
        xYPlot16.setDomainCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = xYPlot16.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation15, plotOrientation27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(xYDataset21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(rectangleEdge28);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        xYPlot0.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setRangeAxis((int) (short) -1, valueAxis10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xYPlot0.removeAnnotation(xYAnnotation6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        double double16 = xYPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        categoryPlot4.configureRangeAxes();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        categoryPlot4.notifyListeners(plotChangeEvent30);
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
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot7.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot7.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = xYPlot7.getDrawingSupplier();
        xYPlot0.setDrawingSupplier(drawingSupplier12);
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setOrientation(plotOrientation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.util.List list17 = categoryPlot4.getAnnotations();
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.jfree.chart.axis.AxisLocation axisLocation13 = xYPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick(10, 10, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = xYPlot0.getRangeAxisEdge();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        java.awt.Stroke stroke5 = xYPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        java.awt.Stroke stroke6 = xYPlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot4.getDrawingSupplier();
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        xYPlot0.setRangeGridlinesVisible(true);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.util.Layer layer15 = null;
        categoryPlot4.drawRangeMarkers(graphics2D12, rectangle2D13, 15, layer15);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot13.getDomainAxis(10);
        xYPlot13.configureDomainAxes();
        java.awt.Paint paint17 = xYPlot13.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = xYPlot13.getDataRange(valueAxis18);
        boolean boolean20 = xYPlot13.isRangeZeroBaselineVisible();
        xYPlot13.clearDomainMarkers(0);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = xYPlot13.getRangeMarkers((int) '#', layer24);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        double double27 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot26.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot26.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot32 = xYPlot26.getRootPlot();
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = xYPlot26.getDomainMarkers(layer33);
        xYPlot26.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis37, valueAxis38, categoryItemRenderer39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = categoryPlot40.getDrawingSupplier();
        java.awt.Stroke stroke42 = categoryPlot40.getRangeGridlineStroke();
        xYPlot26.setDomainGridlineStroke(stroke42);
        xYPlot13.setOutlineStroke(stroke42);
        java.awt.Paint paint45 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_PAINT;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D10, rectangle2D11, (double) (byte) 100, stroke42, paint45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        double double12 = xYPlot11.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot11.getDomainAxis(1);
        xYPlot11.setDomainCrosshairValue((double) 100.0f, false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot24.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup26 = categoryPlot24.getDatasetGroup();
        boolean boolean27 = categoryPlot24.isDomainZoomable();
        java.awt.Font font28 = categoryPlot24.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray29 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot24.setRenderers(categoryItemRendererArray29);
        java.util.List list31 = categoryPlot24.getAnnotations();
        xYPlot11.drawDomainGridlines(graphics2D18, rectangle2D19, list31);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        xYPlot11.datasetChanged(datasetChangeEvent33);
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        double double36 = xYPlot35.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis38 = xYPlot35.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot35.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot41 = xYPlot35.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        xYPlot42.drawZeroRangeBaseline(graphics2D43, rectangle2D44);
        org.jfree.data.xy.XYDataset xYDataset47 = xYPlot42.getDataset((int) (short) 0);
        java.awt.Paint paint48 = xYPlot42.getOutlinePaint();
        xYPlot35.setRangeCrosshairPaint(paint48);
        java.awt.Stroke stroke50 = xYPlot35.getDomainZeroBaselineStroke();
        xYPlot11.setDomainGridlineStroke(stroke50);
        java.awt.Paint paint52 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawVerticalLine(graphics2D8, rectangle2D9, (double) (-1.0f), stroke50, paint52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(categoryItemRendererArray29);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray29, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNull(valueAxis38);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertNull(xYDataset47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot4.getRangeAxisEdge();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) (short) 100, layer13);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        double double16 = xYPlot15.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot15.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot19 = xYPlot15.getRootPlot();
        xYPlot15.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        categoryPlot25.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot25.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder30 = categoryPlot25.getDatasetRenderingOrder();
        xYPlot15.setDatasetRenderingOrder(datasetRenderingOrder30);
        boolean boolean32 = categoryPlot4.equals((java.lang.Object) datasetRenderingOrder30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot4.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(datasetRenderingOrder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangleEdge33);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        categoryPlot4.setAnchorValue((double) (-1L), true);
        org.jfree.chart.plot.Marker marker24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = categoryPlot4.removeRangeMarker(marker24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        xYPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.plot.Marker marker5 = null;
        org.jfree.chart.util.Layer layer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) 'a', marker5, layer6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot20.setDomainAxis(0, categoryAxis22, false);
        categoryPlot20.configureDomainAxes();
        java.awt.Stroke stroke26 = categoryPlot20.getDomainGridlineStroke();
        categoryPlot20.clearDomainMarkers((int) '4');
        org.jfree.chart.axis.ValueAxis valueAxis29 = categoryPlot20.getRangeAxis();
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
        categoryPlot20.setOutlineStroke(stroke60);
        java.awt.Paint paint62 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawVerticalLine(graphics2D13, rectangle2D14, (double) 0L, stroke60, paint62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNull(categoryDataset41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNull(valueAxis45);
        org.junit.Assert.assertNull(valueAxis47);
        org.junit.Assert.assertNotNull(plot48);
        org.junit.Assert.assertNull(xYDataset54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(rectangleInsets57);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(paint62);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = categoryPlot4.getDomainAxisIndex(categoryAxis10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot12.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        org.jfree.chart.axis.AxisLocation axisLocation17 = xYPlot12.getDomainAxisLocation((int) (short) 100);
        categoryPlot4.setRangeAxisLocation(0, axisLocation17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        java.util.List list20 = categoryPlot4.getCategoriesForAxis(categoryAxis19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        xYPlot24.drawZeroRangeBaseline(graphics2D25, rectangle2D26);
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot24.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = xYPlot24.getDomainMarkers(1, layer31);
        org.jfree.chart.LegendItemCollection legendItemCollection33 = xYPlot24.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot38.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup40 = categoryPlot38.getDatasetGroup();
        boolean boolean41 = categoryPlot38.isDomainZoomable();
        java.awt.Font font42 = categoryPlot38.getNoDataMessageFont();
        xYPlot24.setNoDataMessageFont(font42);
        java.awt.Stroke stroke44 = xYPlot24.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot();
        double double46 = xYPlot45.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis48 = xYPlot45.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis50 = xYPlot45.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot51 = xYPlot45.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        xYPlot52.drawZeroRangeBaseline(graphics2D53, rectangle2D54);
        org.jfree.data.xy.XYDataset xYDataset57 = xYPlot52.getDataset((int) (short) 0);
        java.awt.Paint paint58 = xYPlot52.getOutlinePaint();
        xYPlot45.setRangeCrosshairPaint(paint58);
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        xYPlot45.setRangeAxis((int) (byte) 0, valueAxis61);
        java.awt.Paint paint63 = xYPlot45.getRangeZeroBaselinePaint();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D21, rectangle2D22, (double) (short) -1, stroke44, paint63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray9, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNotNull(legendItemCollection33);
        org.junit.Assert.assertNotNull(drawingSupplier39);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNull(valueAxis48);
        org.junit.Assert.assertNull(valueAxis50);
        org.junit.Assert.assertNotNull(plot51);
        org.junit.Assert.assertNull(xYDataset57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        xYPlot0.clearDomainAxes();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawOutline(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.setDomainCrosshairLockedOnData(true);
        xYPlot4.clearRangeMarkers();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isRangeCrosshairVisible();
        java.awt.Paint paint7 = xYPlot0.getRangeTickBandPaint();
        boolean boolean8 = xYPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot9.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        boolean boolean13 = xYPlot9.isDomainCrosshairVisible();
        xYPlot9.setRangeCrosshairVisible(true);
        int int16 = xYPlot9.getRangeAxisCount();
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
        categoryPlot21.setDomainAxis(categoryAxis26);
        categoryPlot21.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray34 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot33.setRangeAxes(valueAxisArray34);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        xYPlot33.setRangeAxis(1, valueAxis37);
        java.awt.Paint paint39 = xYPlot33.getDomainGridlinePaint();
        categoryPlot21.setRangeCrosshairPaint(paint39);
        xYPlot9.setRangeZeroBaselinePaint(paint39);
        xYPlot0.setDomainTickBandPaint(paint39);
        java.awt.Image image43 = xYPlot0.getBackgroundImage();
        org.jfree.chart.plot.Marker marker45 = null;
        org.jfree.chart.util.Layer layer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(100, marker45, layer46, false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(valueAxisArray34);
        org.junit.Assert.assertArrayEquals(valueAxisArray34, new org.jfree.chart.axis.ValueAxis[] {});
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(image43);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setOrientation(plotOrientation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        boolean boolean25 = categoryPlot4.isRangeCrosshairVisible();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.axis.AxisSpace axisSpace28 = categoryPlot4.calculateAxisSpace(graphics2D26, rectangle2D27);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot4.getDomainAxisForDataset(1);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis33, valueAxis34, categoryItemRenderer35);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        categoryPlot36.setDomainAxis(0, categoryAxis38, false);
        categoryPlot36.configureDomainAxes();
        java.awt.Stroke stroke42 = categoryPlot36.getDomainGridlineStroke();
        categoryPlot36.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean46 = categoryPlot36.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation48 = categoryPlot36.getDomainAxisLocation(10);
        categoryPlot4.setDomainAxisLocation(100, axisLocation48);
        org.jfree.chart.axis.AxisSpace axisSpace50 = categoryPlot4.getFixedRangeAxisSpace();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = null;
        categoryPlot4.setRenderer((int) '4', categoryItemRenderer52, false);
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        categoryPlot4.drawAnnotations(graphics2D55, rectangle2D56, plotRenderingInfo57);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(axisSpace28);
        org.junit.Assert.assertNull(categoryAxis30);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNull(axisSpace50);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryAxis10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        xYPlot23.drawZeroRangeBaseline(graphics2D24, rectangle2D25);
        org.jfree.data.xy.XYDataset xYDataset28 = xYPlot23.getDataset((int) (short) 0);
        java.awt.Paint paint29 = xYPlot23.getOutlinePaint();
        xYPlot23.setDomainZeroBaselineVisible(true);
        xYPlot23.setDomainCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotOrientation plotOrientation34 = xYPlot23.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot();
        double double38 = xYPlot37.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        java.util.List list41 = null;
        xYPlot37.drawDomainGridlines(graphics2D39, rectangle2D40, list41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = xYPlot37.getDrawingSupplier();
        java.awt.Paint paint44 = xYPlot37.getDomainZeroBaselinePaint();
        java.awt.Stroke stroke45 = xYPlot37.getDomainCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot(categoryDataset46, categoryAxis47, valueAxis48, categoryItemRenderer49);
        categoryPlot50.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = categoryPlot50.getAxisOffset();
        java.awt.Paint paint55 = categoryPlot50.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawDomainCrosshair(graphics2D21, rectangle2D22, plotOrientation34, (double) 10L, valueAxis36, stroke45, paint55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(point2D20);
        org.junit.Assert.assertNull(xYDataset28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(plotOrientation34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(rectangleInsets54);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        java.awt.Image image12 = null;
        xYPlot10.setBackgroundImage(image12);
        boolean boolean14 = xYPlot10.isDomainZeroBaselineVisible();
        java.util.List list15 = xYPlot10.getAnnotations();
        categoryPlot4.drawRangeGridlines(graphics2D8, rectangle2D9, list15);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Object obj17 = xYPlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot4.setRangeAxis((int) (byte) 10, valueAxis17);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker11, layer12);
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        xYPlot0.setDataset((int) (byte) 10, xYDataset15);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        xYPlot0.setRangeCrosshairValue(100.0d, true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker24, layer25);
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
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot4.setDataset((int) (short) 0, categoryDataset9);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.clearDomainMarkers();
        java.awt.Stroke stroke6 = xYPlot4.getDomainCrosshairStroke();
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeZoomable();
        java.lang.String str6 = xYPlot4.getNoDataMessage();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRenderer(100);
        java.lang.Class<?> wildcardClass9 = xYPlot4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYItemRenderer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        categoryPlot4.clearDomainMarkers((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot4.getDomainAxisLocation((-1));
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot();
        double double29 = xYPlot28.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        java.util.List list32 = null;
        xYPlot28.drawDomainGridlines(graphics2D30, rectangle2D31, list32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        xYPlot28.zoomRangeAxes((double) 1, plotRenderingInfo35, point2D36);
        xYPlot28.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis41, valueAxis42, categoryItemRenderer43);
        categoryPlot44.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = null;
        categoryPlot44.setRenderer((int) 'a', categoryItemRenderer48, false);
        int int51 = categoryPlot44.getWeight();
        boolean boolean52 = categoryPlot44.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer54 = null;
        categoryPlot44.setRenderer((int) (short) 0, categoryItemRenderer54);
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot44.getRangeAxisLocation();
        xYPlot28.setDomainAxisLocation((int) (byte) 0, axisLocation56, false);
        categoryPlot4.setRangeAxisLocation(axisLocation56);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(axisLocation56);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        boolean boolean25 = categoryPlot4.isRangeCrosshairVisible();
        java.awt.Paint paint26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeCrosshairPaint(paint26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xYPlot0.removeRangeMarker((int) (byte) 1, marker18, layer19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(xYItemRenderer13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(layer7);
        boolean boolean9 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot0.getRangeAxisEdge();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot4.getDomainAxisEdge((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker((int) (byte) -1, categoryMarker24, layer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder9 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setDomainAxis((int) (byte) -1, categoryAxis11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(datasetRenderingOrder9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        int int15 = categoryPlot4.getWeight();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        boolean boolean20 = categoryPlot4.render(graphics2D16, rectangle2D17, (int) (short) 1, plotRenderingInfo19);
        org.jfree.chart.axis.ValueAxis valueAxis22 = categoryPlot4.getRangeAxis((int) (byte) 0);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(valueAxis22);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        boolean boolean31 = categoryPlot4.isRangeZoomable();
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.jfree.chart.plot.Plot plot14 = categoryPlot4.getRootPlot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = categoryPlot4.removeAnnotation(categoryAnnotation15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        boolean boolean9 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.util.List list14 = null;
        xYPlot10.drawDomainGridlines(graphics2D12, rectangle2D13, list14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        xYPlot10.zoomRangeAxes((double) 1, plotRenderingInfo17, point2D18);
        xYPlot10.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis24, categoryItemRenderer25);
        categoryPlot26.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot26.setRenderer((int) 'a', categoryItemRenderer30, false);
        int int33 = categoryPlot26.getWeight();
        boolean boolean34 = categoryPlot26.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        categoryPlot26.setRenderer((int) (short) 0, categoryItemRenderer36);
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot26.getRangeAxisLocation();
        xYPlot10.setDomainAxisLocation((int) (byte) 0, axisLocation38, false);
        categoryPlot4.setRangeAxisLocation(axisLocation38, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(axisLocation38);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        boolean boolean7 = categoryPlot4.isDomainZoomable();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot4.getRowRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot4.getDataset();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(sortOrder9);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.mapDatasetToDomainAxis((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.handleClick((int) (byte) 1, (int) (byte) 0, plotRenderingInfo39);
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        org.jfree.chart.util.Layer layer4 = null;
        categoryPlot0.drawRangeMarkers(graphics2D1, rectangle2D2, 0, layer4);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        xYPlot0.clearDomainMarkers();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addAnnotation(xYAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(point2D9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.jfree.data.general.DatasetGroup datasetGroup11 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot17.setDomainAxis(0, categoryAxis19, false);
        categoryPlot17.configureDomainAxes();
        boolean boolean23 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setRangeCrosshairValue((double) 10);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot30.setDomainAxis(0, categoryAxis32, false);
        categoryPlot30.configureDomainAxes();
        java.awt.Stroke stroke36 = categoryPlot30.getDomainGridlineStroke();
        categoryPlot30.mapDatasetToDomainAxis(100, (int) '#');
        boolean boolean40 = categoryPlot30.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot30.getDomainAxisLocation(10);
        categoryPlot17.setDomainAxisLocation(axisLocation42);
        categoryPlot4.setDomainAxisLocation(axisLocation42, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot();
        double double49 = xYPlot48.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis51 = xYPlot48.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot48.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier53 = xYPlot48.getDrawingSupplier();
        java.awt.geom.Point2D point2D54 = xYPlot48.getQuadrantOrigin();
        categoryPlot4.zoomRangeAxes((double) 1.0f, plotRenderingInfo47, point2D54);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNull(valueAxis51);
        org.junit.Assert.assertNull(valueAxis52);
        org.junit.Assert.assertNotNull(drawingSupplier53);
        org.junit.Assert.assertNotNull(point2D54);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Image image2 = null;
        xYPlot0.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawOutline(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        boolean boolean4 = xYPlot0.isRangeZeroBaselineVisible();
        java.lang.Object obj5 = xYPlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot14.getDomainAxis(10);
        xYPlot14.configureDomainAxes();
        java.awt.Paint paint18 = xYPlot14.getDomainCrosshairPaint();
        java.awt.Stroke stroke19 = xYPlot14.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot20.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke26 = xYPlot20.getDomainGridlineStroke();
        xYPlot14.setRangeZeroBaselineStroke(stroke26);
        categoryPlot4.setOutlineStroke(stroke26);
        categoryPlot4.clearDomainAxes();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(layer7);
        xYPlot0.clearDomainAxes();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        xYPlot0.setDataset(xYDataset10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = xYPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot0.getLegendItems();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot0.removeRangeMarker((int) (byte) 0, marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map10 = xYPlot0.drawAxes(graphics2D6, rectangle2D7, rectangle2D8, plotRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot4.setDataset((int) (short) 1, categoryDataset9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xYPlot0.removeDomainMarker((int) (byte) -1, marker18, layer19, false);
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
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot14.getDomainAxis(10);
        xYPlot14.configureDomainAxes();
        java.awt.Paint paint18 = xYPlot14.getDomainCrosshairPaint();
        java.awt.Stroke stroke19 = xYPlot14.getDomainCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot20.getDomainAxisLocation((int) (short) 100);
        java.awt.Stroke stroke26 = xYPlot20.getDomainGridlineStroke();
        xYPlot14.setRangeZeroBaselineStroke(stroke26);
        categoryPlot4.setOutlineStroke(stroke26);
        org.jfree.chart.axis.AxisLocation axisLocation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation(axisLocation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = categoryPlot4.getRangeAxisIndex(valueAxis9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        int int13 = xYPlot0.getRangeAxisIndex(valueAxis12);
        boolean boolean14 = xYPlot0.isDomainCrosshairLockedOnData();
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(15, marker16, layer17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        xYPlot0.setWeight((int) ' ');
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        double double11 = xYPlot10.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot10.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot10.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot16 = xYPlot10.getRootPlot();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = xYPlot10.getDomainMarkers(layer17);
        xYPlot10.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot24.getDrawingSupplier();
        java.awt.Stroke stroke26 = categoryPlot24.getRangeGridlineStroke();
        xYPlot10.setDomainGridlineStroke(stroke26);
        xYPlot0.setRangeGridlineStroke(stroke26);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot0.getRangeAxis((int) ' ');
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker((int) (short) 0, marker32, layer33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map17 = categoryPlot4.drawAxes(graphics2D13, rectangle2D14, rectangle2D15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        java.lang.String str4 = xYPlot0.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "XY Plot" + "'", str4, "XY Plot");
        org.junit.Assert.assertNull(valueAxis5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot11.getDomainAxis(10);
        xYPlot11.configureDomainAxes();
        java.awt.Paint paint15 = xYPlot11.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = xYPlot11.getDataRange(valueAxis16);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot18.getDomainAxisLocation((int) (short) 100);
        xYPlot11.setDomainAxisLocation(axisLocation23);
        categoryPlot4.setRangeAxisLocation(axisLocation23, true);
        categoryPlot4.setAnchorValue(0.0d);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.util.Layer layer32 = null;
        categoryPlot4.drawRangeMarkers(graphics2D29, rectangle2D30, (int) (byte) -1, layer32);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (byte) 100, marker22, layer23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        java.util.List list9 = categoryPlot4.getCategories();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot4.getDomainMarkers(layer10);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot21.getDrawingSupplier();
        categoryPlot21.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot21.getDomainAxisLocation();
        xYPlot0.setRangeAxisLocation(axisLocation25, false);
        org.jfree.chart.plot.Marker marker29 = null;
        org.jfree.chart.util.Layer layer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(0, marker29, layer30, false);
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
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        java.awt.Paint paint7 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder8 = xYPlot0.getSeriesRenderingOrder();
        boolean boolean9 = xYPlot0.isRangeZeroBaselineVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(seriesRenderingOrder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeRangeMarker(100, marker10, layer11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot4.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(0, marker13, layer14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis5 = xYPlot0.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot6 = xYPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge();
        boolean boolean8 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setDomainGridlinesVisible(false);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map15 = xYPlot0.drawAxes(graphics2D11, rectangle2D12, rectangle2D13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, 15, layer10);
        boolean boolean12 = xYPlot0.isDomainZeroBaselineVisible();
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xYPlot0.removeDomainMarker(marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        java.awt.Stroke stroke10 = categoryPlot4.getDomainGridlineStroke();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot11.getDomainAxis(10);
        xYPlot11.configureDomainAxes();
        java.awt.Paint paint15 = xYPlot11.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = xYPlot11.getDataRange(valueAxis16);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot18.getDomainAxisLocation((int) (short) 100);
        xYPlot11.setDomainAxisLocation(axisLocation23);
        categoryPlot4.setRangeAxisLocation(axisLocation23, true);
        categoryPlot4.setAnchorValue(0.0d);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot4.getDomainAxisLocation((int) (short) 10);
        org.jfree.chart.axis.AxisLocation axisLocation32 = null;
        categoryPlot4.setRangeAxisLocation((int) (short) 10, axisLocation32, true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(axisLocation30);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        java.awt.Stroke stroke4 = xYPlot0.getDomainCrosshairStroke();
        boolean boolean5 = xYPlot0.isDomainGridlinesVisible();
        boolean boolean6 = xYPlot0.isRangeGridlinesVisible();
        boolean boolean7 = xYPlot0.isDomainGridlinesVisible();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        xYPlot10.drawZeroRangeBaseline(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = xYPlot10.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
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
        categoryPlot21.setDomainAxis(categoryAxis26);
        categoryPlot21.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot21.getDomainAxis((int) 'a');
        java.awt.Font font31 = categoryPlot21.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot21.getRendererForDataset(categoryDataset32);
        java.awt.Stroke stroke34 = categoryPlot21.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset35, categoryAxis36, valueAxis37, categoryItemRenderer38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = categoryPlot39.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup41 = categoryPlot39.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        categoryPlot39.setRenderer(categoryItemRenderer42);
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        categoryPlot39.setDomainAxis(categoryAxis44);
        categoryPlot39.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = categoryPlot39.getDomainAxis((int) 'a');
        java.awt.Paint paint49 = categoryPlot39.getRangeCrosshairPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawDomainCrosshair(graphics2D8, rectangle2D9, plotOrientation14, (double) (-1), valueAxis16, stroke34, paint49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNull(categoryAxis30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNull(categoryItemRenderer33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(drawingSupplier40);
        org.junit.Assert.assertNull(datasetGroup41);
        org.junit.Assert.assertNull(categoryAxis48);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        categoryPlot4.clearRangeMarkers((int) (short) 1);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertNull(range34);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent20 = null;
        xYPlot0.rendererChanged(rendererChangeEvent20);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(seriesRenderingOrder19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        org.jfree.chart.plot.Marker marker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot4.removeDomainMarker(marker13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = categoryPlot4.removeRangeMarker((int) (byte) 100, marker16, layer17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = xYPlot0.getRangeMarkers((int) 'a', layer4);
        xYPlot0.setDomainCrosshairValue((double) 15);
        xYPlot0.setRangeCrosshairValue((double) 0L);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer15, false);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = categoryPlot4.getDomainMarkers(layer18);
        java.awt.Paint paint20 = categoryPlot4.getOutlinePaint();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(sortOrder13);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeCrosshairValue((double) 1L, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        java.awt.Image image9 = categoryPlot4.getBackgroundImage();
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeDomainMarker((int) (short) 1, marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        double double16 = xYPlot15.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot15.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot15.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot21 = xYPlot15.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        xYPlot22.drawZeroRangeBaseline(graphics2D23, rectangle2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = xYPlot22.getDataset((int) (short) 0);
        java.awt.Paint paint28 = xYPlot22.getOutlinePaint();
        xYPlot15.setRangeCrosshairPaint(paint28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot15.zoomDomainAxes((double) 0L, plotRenderingInfo31, point2D32);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = xYPlot15.getSeriesRenderingOrder();
        xYPlot0.setSeriesRenderingOrder(seriesRenderingOrder34);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNull(xYDataset27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(seriesRenderingOrder34);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.ResourceBundle resourceBundle0 = org.jfree.chart.plot.CategoryPlot.localizationResources;
        org.jfree.chart.plot.CategoryPlot.localizationResources = resourceBundle0;
        org.jfree.chart.plot.CategoryPlot.localizationResources = resourceBundle0;
        org.jfree.chart.plot.XYPlot.localizationResources = resourceBundle0;
        org.jfree.chart.plot.CategoryPlot.localizationResources = resourceBundle0;
        org.junit.Assert.assertNotNull(resourceBundle0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.Layer layer3 = null;
        java.util.Collection collection4 = categoryPlot0.getRangeMarkers((int) ' ', layer3);
        java.awt.Font font5 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.Marker marker6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker((int) (short) 1, marker20, layer21, true);
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        boolean boolean3 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.XYPlot xYPlot7 = new org.jfree.chart.plot.XYPlot();
        double double8 = xYPlot7.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.util.List list11 = null;
        xYPlot7.drawDomainGridlines(graphics2D9, rectangle2D10, list11);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        int int14 = xYPlot7.getIndexOf(xYItemRenderer13);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
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
        xYPlot15.setNoDataMessagePaint(paint25);
        xYPlot7.setDomainTickBandPaint(paint25);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setQuadrantPaint(10, paint25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (10) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.plot.Plot plot4 = xYPlot0.getRootPlot();
        xYPlot0.clearRangeMarkers();
        boolean boolean6 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = xYPlot0.getRangeAxisEdge((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangleEdge8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.jfree.chart.axis.ValueAxis valueAxis20 = categoryPlot4.getRangeAxis();
        org.jfree.chart.plot.CategoryMarker categoryMarker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        java.util.List list2 = xYPlot0.getAnnotations();
        xYPlot0.setDomainCrosshairValue((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        xYPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot0.setDomainAxis((int) 'a', valueAxis8);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xYPlot0.removeRangeMarker((int) (short) 1, marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        boolean boolean25 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot4.getDomainMarkers(layer26);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(collection27);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.jfree.chart.annotations.XYAnnotation xYAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xYPlot0.removeAnnotation(xYAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        categoryPlot4.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        java.util.List list15 = categoryPlot4.getCategoriesForAxis(categoryAxis14);
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke1 = xYPlot0.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder2 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation3 = xYPlot0.getRangeAxisLocation();
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        xYPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot9.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        org.jfree.data.xy.XYDataset xYDataset14 = xYPlot9.getDataset((int) (short) 0);
        java.awt.Paint paint15 = xYPlot9.getOutlinePaint();
        xYPlot9.setDomainZeroBaselineVisible(true);
        xYPlot9.setDomainCrosshairValue(0.0d);
        xYPlot9.clearDomainMarkers((int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        double double26 = xYPlot25.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.util.List list29 = null;
        xYPlot25.drawDomainGridlines(graphics2D27, rectangle2D28, list29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = xYPlot25.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = xYPlot25.getDrawingSupplier();
        java.awt.Stroke stroke33 = xYPlot25.getDomainZeroBaselineStroke();
        java.awt.geom.Point2D point2D34 = xYPlot25.getQuadrantOrigin();
        xYPlot9.zoomDomainAxes((double) 1.0f, (double) (byte) 0, plotRenderingInfo24, point2D34);
        org.jfree.chart.plot.PlotState plotState36 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.draw(graphics2D7, rectangle2D8, point2D34, plotState36, plotRenderingInfo37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(xYDataset14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier31);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(point2D34);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xYPlot0.removeDomainMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot4.setRenderer((int) 'a', categoryItemRenderer8, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Stroke stroke14 = xYPlot13.getDomainZeroBaselineStroke();
        java.util.List list15 = xYPlot13.getAnnotations();
        java.awt.geom.Point2D point2D16 = xYPlot13.getQuadrantOrigin();
        categoryPlot4.zoomDomainAxes((double) (short) 100, plotRenderingInfo12, point2D16, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = categoryPlot4.removeAnnotation(categoryAnnotation19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(point2D16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        categoryPlot4.setRangeCrosshairVisible(false);
        int int31 = categoryPlot4.getRangeAxisCount();
        java.lang.String str32 = categoryPlot4.getPlotType();
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertArrayEquals(categoryAxisArray21, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Category Plot" + "'", str32, "Category Plot");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke7 = xYPlot0.getDomainZeroBaselineStroke();
        java.awt.Paint paint8 = xYPlot0.getDomainCrosshairPaint();
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot0.getDomainAxisForDataset(0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        xYPlot0.addChangeListener(plotChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(point2D12);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = categoryPlot4.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(categoryAnchor16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        java.awt.Stroke stroke7 = categoryPlot4.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(1, categoryItemRenderer3, true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray6 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot0.setRenderers(xYItemRendererArray6);
        xYPlot0.setDomainCrosshairLockedOnData(true);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(xYItemRendererArray6);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray6, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot4.setRenderer(categoryItemRenderer35, false);
        int int38 = categoryPlot4.getRangeAxisCount();
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(xYDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisSpace31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        java.awt.Paint paint4 = xYPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.data.Range range6 = xYPlot0.getDataRange(valueAxis5);
        xYPlot0.setOutlineVisible(true);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder9 = xYPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        xYPlot0.setRangeAxis((int) (short) 0, valueAxis11);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNotNull(datasetRenderingOrder9);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.jfree.chart.axis.AxisSpace axisSpace31 = categoryPlot4.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNull(axisSpace31);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer(categoryItemRenderer7);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot9.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot9.getDomainAxisLocation((int) (short) 100);
        categoryPlot4.setDomainAxisLocation(axisLocation14);
        categoryPlot4.setAnchorValue((double) (short) -1, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot4.getColumnRenderingOrder();
        java.awt.Stroke stroke9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeCrosshairStroke(stroke9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(sortOrder8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        double double14 = xYPlot13.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot13.getDomainAxis(1);
        java.awt.Stroke stroke17 = xYPlot13.getDomainCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis19, valueAxis20, categoryItemRenderer21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot22.setDomainAxis(0, categoryAxis24, false);
        categoryPlot22.configureDomainAxes();
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        xYPlot29.drawZeroRangeBaseline(graphics2D30, rectangle2D31);
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot29.getDomainAxisLocation((int) (short) 100);
        categoryPlot22.setRangeAxisLocation((int) (byte) 10, axisLocation34, false);
        xYPlot13.setDomainAxisLocation(axisLocation34, false);
        categoryPlot4.setRangeAxisLocation(axisLocation34, false);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = xYPlot0.getOrientation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.Marker marker6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertNull(axisSpace5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.Layer layer3 = null;
        java.util.Collection collection4 = categoryPlot0.getRangeMarkers((int) ' ', layer3);
        java.awt.Font font5 = categoryPlot0.getNoDataMessageFont();
        int int6 = categoryPlot0.getWeight();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        categoryPlot4.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        java.util.List list15 = categoryPlot4.getCategoriesForAxis(categoryAxis14);
        org.jfree.chart.plot.Marker marker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = categoryPlot4.removeDomainMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        xYPlot0.setRangeAxis((int) (short) 10, valueAxis25, false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        xYPlot0.removeChangeListener(plotChangeListener28);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot4.setRangeAxis(valueAxis26);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xYPlot0.removeDomainMarker((int) ' ', marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        java.awt.Paint paint17 = categoryPlot4.getBackgroundPaint();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        xYPlot0.configureDomainAxes();
        xYPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = xYPlot0.getRangeAxisEdge(10);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        categoryPlot4.clearRangeMarkers((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot4.getRangeMarkers(layer29);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray18, new org.jfree.chart.renderer.category.CategoryItemRenderer[] {});
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(collection30);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        org.jfree.chart.plot.Plot plot11 = xYPlot0.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint13 = xYPlot12.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        xYPlot12.zoomDomainAxes((double) 1L, (double) (byte) 0, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot12.zoomRangeAxes((double) 10, 0.0d, plotRenderingInfo21, point2D22);
        xYPlot12.configureDomainAxes();
        java.awt.Paint paint25 = xYPlot12.getDomainCrosshairPaint();
        xYPlot0.setRangeTickBandPaint(paint25);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot15.drawZeroRangeBaseline(graphics2D16, rectangle2D17);
        org.jfree.data.xy.XYDataset xYDataset20 = xYPlot15.getDataset((int) (short) 0);
        java.util.List list21 = xYPlot15.getAnnotations();
        xYPlot0.drawDomainTickBands(graphics2D13, rectangle2D14, list21);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot0.getIndexOf(xYItemRenderer23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        xYPlot0.zoomDomainAxes((double) 15, plotRenderingInfo26, point2D27, true);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(xYDataset20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawQuadrants(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        xYPlot0.addChangeListener(plotChangeListener18);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(xYItemRenderer15);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        boolean boolean18 = categoryPlot4.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxis();
        categoryPlot4.setAnchorValue((double) 100, false);
        java.awt.Stroke stroke16 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        categoryPlot4.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertArrayEquals(categoryAxisArray10, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot0.setRangeAxis((int) (short) 100, valueAxis7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        double double15 = xYPlot14.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.util.List list18 = null;
        xYPlot14.drawDomainGridlines(graphics2D16, rectangle2D17, list18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = xYPlot14.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = xYPlot14.getDrawingSupplier();
        java.awt.Stroke stroke22 = xYPlot14.getDomainZeroBaselineStroke();
        java.awt.geom.Point2D point2D23 = xYPlot14.getQuadrantOrigin();
        categoryPlot4.zoomRangeAxes((double) (short) 0, plotRenderingInfo13, point2D23);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addAnnotation(categoryAnnotation25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(point2D23);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        categoryPlot4.setAnchorValue((double) 0);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot15.getDomainAxis();
        org.jfree.chart.plot.Marker marker21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xYPlot15.removeDomainMarker(marker21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(valueAxis20);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertNull(range34);
        org.junit.Assert.assertNull(list35);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        boolean boolean11 = xYPlot0.isDomainZeroBaselineVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis6, false);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot4.getRangeAxis((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot4.setRenderer(categoryItemRenderer12, false);
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        boolean boolean19 = xYPlot0.isRangeZoomable();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.util.Layer layer23 = null;
        xYPlot0.drawDomainMarkers(graphics2D20, rectangle2D21, (int) '#', layer23);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = xYPlot0.getLegendItems();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        int int11 = xYPlot0.indexOf(xYDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot16.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup18 = categoryPlot16.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot16.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot20.drawZeroRangeBaseline(graphics2D21, rectangle2D22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot20.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint27 = xYPlot26.getBackgroundPaint();
        xYPlot20.setRangeZeroBaselinePaint(paint27);
        categoryPlot16.setBackgroundPaint(paint27);
        xYPlot0.setOutlinePaint(paint27);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        int int22 = categoryPlot4.getWeight();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot0.getRangeMarkers((int) (byte) 1, layer6);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = null;
        xYPlot0.setRenderer(xYItemRenderer8);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot4.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.handleClick((int) (byte) 1, (int) (short) 1, plotRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(categoryAxis6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = xYPlot0.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = xYPlot0.getDrawingSupplier();
        java.awt.Stroke stroke8 = xYPlot0.getDomainZeroBaselineStroke();
        boolean boolean9 = xYPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = xYPlot0.getDomainAxis(10);
        java.awt.Paint paint3 = xYPlot0.getDomainTickBandPaint();
        boolean boolean4 = xYPlot0.isRangeZoomable();
        xYPlot0.setDomainCrosshairValue((double) (short) -1);
        double double7 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker((int) (byte) 0, marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = categoryPlot4.getRangeAxisIndex(valueAxis13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(plotOrientation7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent1 = null;
        xYPlot0.rendererChanged(rendererChangeEvent1);
        java.awt.Paint paint3 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.XYPlot xYPlot5 = new org.jfree.chart.plot.XYPlot();
        double double6 = xYPlot5.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot5.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis10 = xYPlot5.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot11 = xYPlot5.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        xYPlot12.drawZeroRangeBaseline(graphics2D13, rectangle2D14);
        org.jfree.data.xy.XYDataset xYDataset17 = xYPlot12.getDataset((int) (short) 0);
        java.awt.Paint paint18 = xYPlot12.getOutlinePaint();
        xYPlot5.setRangeCrosshairPaint(paint18);
        xYPlot0.setQuadrantPaint((int) (byte) 1, paint18);
        org.jfree.chart.plot.Marker marker21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNull(xYDataset17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        categoryPlot4.setBackgroundImageAlpha(0.0f);
        categoryPlot4.clearRangeMarkers();
        java.util.List list9 = categoryPlot4.getCategories();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot4.drawDomainMarkers(graphics2D10, rectangle2D11, (int) ' ', layer13);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        double double16 = xYPlot15.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot15.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot15.getRangeAxis(10);
        org.jfree.chart.plot.Plot plot21 = xYPlot15.getRootPlot();
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        xYPlot22.drawZeroRangeBaseline(graphics2D23, rectangle2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = xYPlot22.getDataset((int) (short) 0);
        java.awt.Paint paint28 = xYPlot22.getOutlinePaint();
        xYPlot15.setRangeCrosshairPaint(paint28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot15.zoomDomainAxes((double) 0L, plotRenderingInfo31, point2D32);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder34 = xYPlot15.getSeriesRenderingOrder();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.axis.AxisSpace axisSpace37 = xYPlot15.calculateAxisSpace(graphics2D35, rectangle2D36);
        categoryPlot4.setFixedRangeAxisSpace(axisSpace37);
        java.lang.Class<?> wildcardClass39 = axisSpace37.getClass();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNull(xYDataset27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(seriesRenderingOrder34);
        org.junit.Assert.assertNotNull(axisSpace37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map20 = xYPlot0.drawAxes(graphics2D16, rectangle2D17, rectangle2D18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(axisSpace14);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = xYPlot0.getDomainMarkers(1, layer7);
        java.awt.Stroke stroke9 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot0.getDomainMarkers(layer10);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        double double4 = xYPlot0.getDomainCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot0.getRangeAxisLocation();
        xYPlot0.setOutlineVisible(false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = null;
        xYPlot0.setRenderer((int) (short) 0, xYItemRenderer9, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.util.List list6 = xYPlot0.getAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        categoryPlot11.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot11.setRenderer((int) 'a', categoryItemRenderer15, false);
        int int18 = categoryPlot11.getWeight();
        boolean boolean19 = categoryPlot11.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot11.setRenderer((int) (short) 0, categoryItemRenderer21);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot11.getRangeAxisLocation();
        xYPlot0.setRangeAxisLocation(axisLocation23, false);
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        org.jfree.chart.plot.Marker marker33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = xYPlot0.removeRangeMarker(marker33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        categoryPlot4.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.jfree.chart.plot.Plot plot14 = categoryPlot4.getRootPlot();
        int int15 = categoryPlot4.getRangeAxisCount();
        java.lang.String str16 = categoryPlot4.getNoDataMessage();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot4.getDomainAxisEdge();
        java.awt.Image image8 = categoryPlot4.getBackgroundImage();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot4.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot4.render(graphics2D10, rectangle2D11, (int) (byte) 0, plotRenderingInfo13);
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addRangeMarker(marker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.util.List list4 = null;
        xYPlot0.drawDomainGridlines(graphics2D2, rectangle2D3, list4);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot0.getIndexOf(xYItemRenderer6);
        xYPlot0.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot14.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup16 = categoryPlot14.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D19, rectangle2D20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot18.getDomainAxisLocation((int) (short) 100);
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint25 = xYPlot24.getBackgroundPaint();
        xYPlot18.setRangeZeroBaselinePaint(paint25);
        categoryPlot14.setBackgroundPaint(paint25);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent28 = null;
        categoryPlot14.rendererChanged(rendererChangeEvent28);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot14.getDomainAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(axisLocation30);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.jfree.chart.axis.AxisLocation axisLocation13 = xYPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xYPlot0.removeRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        org.jfree.chart.axis.ValueAxis valueAxis4 = xYPlot0.getRangeAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = xYPlot0.getDrawingSupplier();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        xYPlot0.setDataset((int) (short) 0, xYDataset7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D9, rectangle2D10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(valueAxis4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        boolean boolean4 = xYPlot0.isDomainCrosshairVisible();
        xYPlot0.setRangeCrosshairVisible(true);
        int int7 = xYPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisSpace axisSpace8 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.Marker marker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addRangeMarker(marker9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot4.getRangeAxis((int) '#');
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D1, rectangle2D2);
        org.jfree.data.xy.XYDataset xYDataset5 = xYPlot0.getDataset((int) (short) 0);
        java.awt.Paint paint6 = xYPlot0.getOutlinePaint();
        int int7 = xYPlot0.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot0.getLegendItems();
        java.lang.String str9 = xYPlot0.getNoDataMessage();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot13.drawZeroRangeBaseline(graphics2D14, rectangle2D15);
        org.jfree.data.xy.XYDataset xYDataset18 = xYPlot13.getDataset((int) (short) 0);
        boolean boolean19 = xYPlot13.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        xYPlot13.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.data.Range range24 = xYPlot13.getDataRange(valueAxis23);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = xYPlot13.getRenderer(1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot31.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup33 = categoryPlot31.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot31.getDomainAxisEdge();
        categoryPlot31.configureDomainAxes();
        java.awt.Stroke stroke36 = categoryPlot31.getDomainGridlineStroke();
        xYPlot13.setRangeZeroBaselineStroke(stroke36);
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint39 = xYPlot38.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        java.awt.geom.Point2D point2D43 = null;
        xYPlot38.zoomDomainAxes((double) 1L, (double) (byte) 0, plotRenderingInfo42, point2D43);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        java.awt.geom.Point2D point2D48 = null;
        xYPlot38.zoomRangeAxes((double) 10, 0.0d, plotRenderingInfo47, point2D48);
        xYPlot38.configureDomainAxes();
        java.awt.Paint paint51 = xYPlot38.getDomainCrosshairPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.drawVerticalLine(graphics2D10, rectangle2D11, (double) 10, stroke36, paint51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataset5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(xYDataset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(range24);
        org.junit.Assert.assertNull(xYItemRenderer26);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke6 = categoryPlot4.getRangeGridlineStroke();
        categoryPlot4.clearDomainMarkers((int) '4');
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot4.removeAnnotation(categoryAnnotation9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.awt.Paint paint33 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        xYPlot0.setRangeAxis(0, valueAxis35);
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
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        float float10 = categoryPlot4.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        double double1 = xYPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis3 = xYPlot0.getDomainAxis(1);
        xYPlot0.setDomainCrosshairValue((double) 100.0f, false);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = xYPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = xYPlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }
}

