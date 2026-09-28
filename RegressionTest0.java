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
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.plot.Marker marker4 = null;
        org.jfree.chart.util.Layer layer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) 'a', marker4, layer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.plot.PlotOrientation plotOrientation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setOrientation(plotOrientation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.util.SortOrder sortOrder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRowRenderingOrder(sortOrder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.plot.CategoryMarker categoryMarker3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlineStroke(stroke4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.Marker marker1 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot0.removeAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = categoryPlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge4 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation2, plotOrientation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.CategoryMarker categoryMarker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot0.removeAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.CategoryMarker categoryMarker5 = null;
        org.jfree.chart.util.Layer layer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 100, categoryMarker5, layer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = categoryPlot0.removeAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = categoryPlot0.removeAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation9, true);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setAxisOffset(rectangleInsets7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        java.lang.Object obj4 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.CategoryMarker categoryMarker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.lang.Class<?> wildcardClass7 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers(layer7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot0.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', 1.0d, plotRenderingInfo7, point2D8);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getDomainAxisEdge((int) (byte) 1);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        java.lang.Object obj11 = categoryPlot0.clone();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot0.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge((int) 'a');
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(rectangleEdge8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Point2D point2D7 = null;
        org.jfree.chart.plot.PlotState plotState8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D5, rectangle2D6, point2D7, plotState8, plotRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.data.Range range5 = categoryPlot0.getDataRange(valueAxis4);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer5, true);
        categoryPlot0.clearRangeMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot0.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes(10.0d, (double) ' ', plotRenderingInfo5, point2D6);
        java.awt.Stroke stroke8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlineStroke(stroke8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = categoryPlot0.removeAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToRangeAxis((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.setRangeCrosshairValue((double) 100.0f);
        categoryPlot22.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = categoryPlot22.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        categoryPlot22.notifyListeners(plotChangeEvent27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean30 = categoryPlot29.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot29.getRangeAxisLocation();
        categoryPlot22.setRangeAxisLocation(axisLocation31, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.setRangeCrosshairValue((double) 100.0f);
        categoryPlot34.clearDomainMarkers();
        java.awt.Paint paint38 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot34.setBackgroundPaint(paint38);
        org.jfree.chart.axis.ValueAxis valueAxis40 = categoryPlot34.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation41 = categoryPlot34.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation31, plotOrientation41);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(plotOrientation41);
        org.junit.Assert.assertNotNull(rectangleEdge42);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers(layer7);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo12, point2D13, false);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = categoryPlot0.getDomainMarkers(layer4);
        org.jfree.chart.plot.CategoryMarker categoryMarker6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation9, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((-1), categoryAxis13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = categoryPlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot0.removeAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.awt.Paint paint0 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(layer11);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation3 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.removeChangeListener(plotChangeListener4);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        categoryPlot0.setDataset(categoryDataset4);
        org.jfree.chart.plot.CategoryMarker categoryMarker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 0, marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getRangeAxisEdge();
        boolean boolean5 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) -1, 10, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot35.getDomainAxisLocation((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation37, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation3 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer5);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(15, marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setOrientation(plotOrientation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(0, valueAxis6, false);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) 'a', (int) (byte) 1, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        java.lang.Class<?> wildcardClass8 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot0.removeAnnotation(categoryAnnotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        float float2 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis4 = categoryPlot0.getRangeAxis((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(valueAxis4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer((int) (short) 10);
        boolean boolean13 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis14, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis(valueAxis11);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 100, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleEdge rectangleEdge2 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        categoryPlot0.notifyListeners(plotChangeEvent3);
        org.jfree.chart.plot.Marker marker5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(rectangleEdge2);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRenderer((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        categoryPlot7.clearDomainMarkers();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        categoryPlot7.setDrawingSupplier(drawingSupplier14);
        categoryPlot7.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot7.setBackgroundAlpha((float) '#');
        categoryPlot7.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int24 = categoryPlot7.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot7.getDomainAxisLocation((int) 'a');
        categoryPlot0.setDomainAxisLocation((int) (byte) 100, axisLocation26);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = categoryPlot0.removeAnnotation(categoryAnnotation28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomRangeAxes(1.0d, plotRenderingInfo15, point2D16, true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        int int7 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (int) (short) 1, plotRenderingInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 100, plotRenderingInfo9, point2D10, true);
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint13);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset((int) (short) 10);
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 10, marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setAxisOffset(rectangleInsets6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(10.0d, (double) (byte) 0, plotRenderingInfo11, point2D12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot0.getDatasetGroup();
        boolean boolean13 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis((int) (short) 100);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        categoryPlot0.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getDomainAxisLocation((int) 'a');
        categoryPlot0.mapDatasetToDomainAxis(15, (int) '#');
        int int23 = categoryPlot0.getBackgroundImageAlignment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = categoryPlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleEdge rectangleEdge2 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        categoryPlot0.notifyListeners(plotChangeEvent3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(rectangleEdge2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        float float7 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot0.getFixedLegendItems();
        java.lang.Object obj10 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 100, plotRenderingInfo9, point2D10, true);
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint13);
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        java.awt.Paint paint21 = categoryPlot0.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation3 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis((int) 'a');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        java.lang.Object obj3 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        java.awt.Stroke stroke8 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer10, true);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis(valueAxis13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.data.Range range5 = categoryPlot0.getDataRange(valueAxis4);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        categoryPlot0.mapDatasetToDomainAxis(0, 10);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        categoryPlot0.setRangeGridlinesVisible(false);
        int int25 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray3 = new org.jfree.chart.axis.ValueAxis[] { valueAxis2 };
        categoryPlot0.setRangeAxes(valueAxisArray3);
        java.lang.Object obj5 = categoryPlot0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(valueAxisArray3);
        org.junit.Assert.assertArrayEquals(valueAxisArray3, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (byte) 100, axisLocation12, true);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxisForDataset((int) 'a');
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        int int8 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Font font16 = categoryPlot12.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.setRangeCrosshairValue((double) 100.0f);
        categoryPlot17.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot17.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets21);
        categoryPlot0.setInsets(rectangleInsets21, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot0.removeAnnotation(categoryAnnotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo9, point2D10, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(axisSpace7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot7.getDomainMarkers(layer8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot7.zoomDomainAxes((double) 10, (double) (short) -1, plotRenderingInfo12, point2D13);
        java.awt.Paint paint15 = categoryPlot7.getBackgroundPaint();
        categoryPlot0.setDomainGridlinePaint(paint15);
        float float17 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font10);
        java.awt.Font font12 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.setRangeCrosshairValue((double) 100.0f);
        categoryPlot14.clearDomainMarkers();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.setRangeCrosshairValue((double) 100.0f);
        categoryPlot19.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot19.getInsets();
        categoryPlot14.setAxisOffset(rectangleInsets23);
        categoryPlot0.setInsets(rectangleInsets23);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean8 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers((int) (byte) 1, layer8);
        org.jfree.chart.plot.Plot plot10 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers((int) (byte) 0, layer26);
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker28, layer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(collection27);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(10.0d, (double) (byte) 0, plotRenderingInfo11, point2D12);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePosition(categoryAnchor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot7.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation((int) '4');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(1, 1, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.addChangeListener(plotChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot11.getDomainAxisLocation((int) (byte) -1);
        categoryPlot11.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot11.getDomainAxisEdge((int) (byte) 1);
        java.awt.Paint paint18 = categoryPlot11.getRangeCrosshairPaint();
        categoryPlot0.setBackgroundPaint(paint18);
        categoryPlot0.setAnchorValue((double) '4', true);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        categoryPlot0.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.removeChangeListener(plotChangeListener23);
        java.util.List list25 = categoryPlot0.getCategories();
        double double26 = categoryPlot0.getAnchorValue();
        org.jfree.chart.plot.CategoryMarker categoryMarker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 0, categoryMarker28, layer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        categoryPlot0.setBackgroundPaint(paint14);
        java.lang.Class<?> wildcardClass17 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis5 = categoryPlot0.getRangeAxis();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge((int) (byte) 10);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace9);
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryMarker categoryMarker5 = null;
        org.jfree.chart.util.Layer layer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker5, layer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(axisSpace4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot16.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection18);
        categoryPlot16.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot16.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder22);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNotNull(sortOrder22);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray10 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer9 };
        categoryPlot0.setRenderers(categoryItemRendererArray10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.removeChangeListener(plotChangeListener13);
        org.junit.Assert.assertNotNull(categoryItemRendererArray10);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray10, new org.jfree.chart.renderer.category.CategoryItemRenderer[] { null });
        org.junit.Assert.assertNull(categoryAxis12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.plot.Marker marker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setDrawSharedDomainAxis(false);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot0.getRowRenderingOrder();
        java.util.List list35 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        categoryPlot0.setRangeGridlinesVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = categoryPlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeCrosshairVisible(true);
        java.lang.Class<?> wildcardClass5 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 100, plotRenderingInfo9, point2D10, true);
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint13);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(0, valueAxis6, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxisForDataset((int) (byte) 0);
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRendererForDataset(categoryDataset8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getColumnRenderingOrder();
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot0.getDatasetGroup();
        int int14 = categoryPlot0.getDomainAxisCount();
        java.lang.Class<?> wildcardClass15 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        java.lang.Object obj5 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getColumnRenderingOrder();
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot0.markerChanged(markerChangeEvent13);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot0.getDomainMarkers(layer27);
        java.awt.Stroke stroke29 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(collection28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot9.getDomainMarkers(layer10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        categoryPlot9.setRangeGridlinePaint(paint16);
        java.awt.Paint paint19 = categoryPlot9.getDomainGridlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint19);
        boolean boolean21 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 100, plotRenderingInfo9, point2D10, true);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getRangeMarkers(0, layer14);
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', 1.0d, plotRenderingInfo7, point2D8);
        categoryPlot0.setBackgroundAlpha((float) (short) 10);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset((int) (short) 10);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setOutlineStroke(stroke8);
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(sortOrder14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        categoryPlot0.clearAnnotations();
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRendererForDataset(categoryDataset13);
        java.awt.Stroke stroke15 = categoryPlot0.getRangeCrosshairStroke();
        java.lang.Class<?> wildcardClass16 = stroke15.getClass();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setAnchorValue((double) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(10, categoryDataset12);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot8.getDomainMarkers(layer9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.setRangeCrosshairValue((double) 100.0f);
        categoryPlot11.clearDomainMarkers();
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot11.setBackgroundPaint(paint15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot11.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot11.getOrientation();
        categoryPlot8.setOrientation(plotOrientation18);
        categoryPlot8.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot8.getRendererForDataset(categoryDataset21);
        java.awt.Stroke stroke23 = categoryPlot8.getRangeCrosshairStroke();
        categoryPlot0.setDomainGridlineStroke(stroke23);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder27 = categoryPlot26.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        categoryPlot26.setDrawingSupplier(drawingSupplier28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        categoryPlot26.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot26.getRangeAxisEdge((int) (short) 0);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot26.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plotOrientation18);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(sortOrder27);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        java.awt.Paint paint6 = plot5.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRendererForDataset(categoryDataset13);
        java.awt.Stroke stroke15 = categoryPlot0.getRangeCrosshairStroke();
        boolean boolean16 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) -1, (int) (short) -1, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.data.Range range5 = categoryPlot0.getDataRange(valueAxis4);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        categoryPlot0.mapDatasetToDomainAxis(0, 10);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis(100, valueAxis11, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer4);
        float float6 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        categoryPlot0.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getColumnRenderingOrder();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(sortOrder14);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot5.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot5.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.setRangeCrosshairValue((double) 100.0f);
        categoryPlot9.clearDomainMarkers();
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot9.setBackgroundPaint(paint13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot9.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot9.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation8, plotOrientation16);
        categoryPlot0.setDomainAxisLocation(axisLocation8);
        org.jfree.chart.plot.Plot plot19 = categoryPlot0.getParent();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder20 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(datasetRenderingOrder20);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.removeChangeListener(plotChangeListener23);
        java.util.List list25 = categoryPlot0.getCategories();
        org.jfree.chart.plot.Plot plot26 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertNull(plot26);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        java.awt.Stroke stroke15 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (byte) -1, categoryAxis17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, (int) ' ', plotRenderingInfo11);
        float float13 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.setNoDataMessage("");
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot0.removeAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        int int5 = categoryPlot0.getRangeAxisIndex(valueAxis4);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getRangeAxisEdge(100);
        java.util.List list6 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(0, valueAxis6, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation9, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        categoryPlot7.setDrawingSupplier(drawingSupplier9);
        int int11 = categoryPlot7.getWeight();
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot7.getFixedDomainAxisSpace();
        boolean boolean14 = categoryPlot7.isDomainZoomable();
        categoryPlot7.setAnchorValue((double) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot7.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, (int) (short) 100);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot0.removeAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getDomainAxisEdge((int) (byte) 10);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) '#', marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        org.jfree.chart.axis.AxisSpace axisSpace37 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        categoryPlot0.notifyListeners(plotChangeEvent38);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNull(axisSpace37);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        categoryPlot0.setRangeCrosshairValue((double) 'a', false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.setAnchorValue((double) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxisForDataset((int) 'a');
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        categoryPlot0.setWeight(0);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        categoryPlot0.clearDomainMarkers((int) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(sortOrder17);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo9, point2D10);
        int int12 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(1, marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = categoryPlot0.getDomainMarkers(layer4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        boolean boolean8 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxisForDataset(100);
        java.awt.Paint paint8 = categoryPlot0.getRangeGridlinePaint();
        java.lang.Object obj9 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.configureDomainAxes();
        java.awt.Paint paint7 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor15 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(categoryAnchor15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        boolean boolean5 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        categoryPlot0.setBackgroundAlpha(0.5f);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) '4', plotRenderingInfo8, point2D9);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 10, marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 1);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot0.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.addChangeListener(plotChangeListener13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot8.getColumnRenderingOrder();
        categoryPlot8.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot8.setRenderer(categoryItemRenderer11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot8.rendererChanged(rendererChangeEvent13);
        java.awt.Stroke stroke15 = categoryPlot8.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot8.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.setRangeCrosshairValue((double) 100.0f);
        categoryPlot18.clearDomainMarkers();
        java.awt.Paint paint22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot18.setBackgroundPaint(paint22);
        org.jfree.chart.axis.ValueAxis valueAxis24 = categoryPlot18.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot18.getOrientation();
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot18.setNoDataMessagePaint(paint26);
        categoryPlot8.setBackgroundPaint(paint26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = categoryPlot8.getRenderer();
        java.util.List list30 = categoryPlot8.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        categoryPlot8.addChangeListener(plotChangeListener31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        categoryPlot8.setDrawingSupplier(drawingSupplier33);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot8.setDomainAxis(categoryAxis35);
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot8.getRangeAxisLocation((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation38, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(sortOrder9);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryItemRenderer29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(axisLocation38);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        categoryPlot0.notifyListeners(plotChangeEvent11);
        java.lang.Class<?> wildcardClass13 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot0.markerChanged(markerChangeEvent22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 1, plotRenderingInfo25, point2D26);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setOutlineVisible(true);
        float float6 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation9, true);
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        boolean boolean13 = categoryPlot0.getDrawSharedDomainAxis();
        java.awt.Paint paint14 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        java.util.List list3 = categoryPlot0.getCategories();
        categoryPlot0.setOutlineVisible(true);
        boolean boolean6 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent10);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        java.awt.Stroke stroke15 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers(layer7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) ' ', 10, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        java.util.List list3 = categoryPlot0.getCategories();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        categoryPlot0.removeChangeListener(plotChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        java.awt.Paint paint6 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxisForDataset((int) 'a');
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer5, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot8.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot8.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(axisLocation13, true);
        java.awt.Paint paint16 = categoryPlot0.getRangeCrosshairPaint();
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.clearDomainMarkers((int) ' ');
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot5.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot11.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.setRangeCrosshairValue((double) 100.0f);
        categoryPlot13.clearDomainMarkers();
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot13.setBackgroundPaint(paint17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot13.getFixedDomainAxisSpace();
        double double20 = categoryPlot13.getRangeCrosshairValue();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot13.setOutlineStroke(stroke21);
        categoryPlot11.setRangeCrosshairStroke(stroke21);
        categoryPlot0.setDomainGridlineStroke(stroke21);
        categoryPlot0.setBackgroundAlpha((float) 100L);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(axisSpace19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot5.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot5.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.setRangeCrosshairValue((double) 100.0f);
        categoryPlot9.clearDomainMarkers();
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot9.setBackgroundPaint(paint13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot9.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot9.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation8, plotOrientation16);
        categoryPlot0.setDomainAxisLocation(axisLocation8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer20, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot0.getRenderer((int) (byte) 1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNull(categoryItemRenderer24);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        categoryPlot0.setBackgroundImageAlignment((int) '4');
        org.jfree.chart.plot.CategoryMarker categoryMarker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) '#', (double) 0, plotRenderingInfo7, point2D8);
        boolean boolean10 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setAnchorValue((double) 1);
        boolean boolean4 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        int int5 = categoryPlot0.getRangeAxisIndex(valueAxis4);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.setRangeCrosshairValue((double) (short) -1);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo9, point2D10);
        int int12 = categoryPlot0.getWeight();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        java.awt.Paint paint6 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis((int) (short) 10, valueAxis9, true);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDataset((int) (short) -1, categoryDataset13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot0.getDomainMarkers(layer27);
        boolean boolean29 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        java.util.List list4 = categoryPlot0.getAnnotations();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot7.setRenderer(categoryItemRenderer10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent12);
        java.awt.Stroke stroke14 = categoryPlot7.getOutlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke14);
        categoryPlot0.clearRangeMarkers(100);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getAxisOffset();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getDomainMarkers(layer12);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        categoryPlot0.notifyListeners(plotChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getRangeAxisEdge((int) (byte) 0);
        boolean boolean13 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 100, marker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        java.awt.Stroke stroke8 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.setRangeCrosshairValue((double) 100.0f);
        categoryPlot13.clearDomainMarkers();
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot13.setBackgroundPaint(paint17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot13.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot13.getOrientation();
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot13.setNoDataMessagePaint(paint21);
        java.awt.Font font23 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot13.setNoDataMessageFont(font23);
        java.awt.Font font25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot13.setNoDataMessageFont(font25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot13.getDomainAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation(axisLocation28);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setDrawSharedDomainAxis(false);
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot2.setRangeCrosshairValue((double) 100.0f);
        categoryPlot2.clearDomainMarkers();
        java.awt.Paint paint6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot2.setBackgroundPaint(paint6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot2.getFixedDomainAxisSpace();
        double double9 = categoryPlot2.getRangeCrosshairValue();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot2.setOutlineStroke(stroke10);
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        int int13 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, (int) (short) 100);
        categoryPlot0.setRangeCrosshairValue((double) 'a', false);
        int int14 = categoryPlot0.getRangeAxisCount();
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        org.jfree.chart.axis.AxisSpace axisSpace37 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(98, 0, plotRenderingInfo40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNull(axisSpace37);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot7.setRenderer(categoryItemRenderer10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent12);
        java.awt.Stroke stroke14 = categoryPlot7.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot7.getDataset();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot7.getDomainMarkers((int) (short) 10, layer17);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray19);
        categoryPlot0.setDomainAxes(categoryAxisArray19);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertArrayEquals(categoryAxisArray19, new org.jfree.chart.axis.CategoryAxis[] {});
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
        org.junit.Assert.assertNotNull(sortOrder23);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getRangeAxisEdge(100);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace13);
        java.lang.String str15 = categoryPlot0.getPlotType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis14, true);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(layer17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder20 = categoryPlot19.getColumnRenderingOrder();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot19.setRenderer(categoryItemRenderer22);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent24 = null;
        categoryPlot19.rendererChanged(rendererChangeEvent24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot19.drawBackgroundImage(graphics2D26, rectangle2D27);
        categoryPlot19.setDomainGridlinesVisible(true);
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot19.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(sortOrder31);
        org.junit.Assert.assertNull(datasetGroup33);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer4);
        java.awt.Paint paint6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setOutlinePaint(paint6);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot10.getRangeAxisLocation();
        categoryPlot10.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getFixedLegendItems();
        categoryPlot10.configureDomainAxes();
        java.awt.Stroke stroke17 = categoryPlot10.getRangeCrosshairStroke();
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        categoryPlot0.removeChangeListener(plotChangeListener6);
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToRangeAxis((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, (double) 10L, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.setRangeCrosshairValue((double) 100.0f);
        categoryPlot30.clearDomainMarkers();
        java.awt.Font font34 = categoryPlot30.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.setRangeCrosshairValue((double) 100.0f);
        categoryPlot35.clearDomainMarkers();
        java.awt.Paint paint39 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot35.setBackgroundPaint(paint39);
        org.jfree.chart.axis.ValueAxis valueAxis41 = categoryPlot35.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot35.getOrientation();
        categoryPlot30.setOrientation(plotOrientation42);
        java.awt.Image image44 = categoryPlot30.getBackgroundImage();
        categoryPlot30.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder47 = categoryPlot46.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection48 = null;
        categoryPlot46.setFixedLegendItems(legendItemCollection48);
        categoryPlot46.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder52 = categoryPlot46.getRowRenderingOrder();
        categoryPlot30.setColumnRenderingOrder(sortOrder52);
        categoryPlot0.setRowRenderingOrder(sortOrder52);
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        categoryPlot0.removeChangeListener(plotChangeListener55);
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.data.Range range58 = categoryPlot0.getDataRange(valueAxis57);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(valueAxis41);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(sortOrder47);
        org.junit.Assert.assertNotNull(sortOrder52);
        org.junit.Assert.assertNull(range58);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot0.getDomainAxisIndex(categoryAxis23);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis(categoryAxis25);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        java.awt.Stroke stroke9 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(0, valueAxis6, false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = categoryPlot0.getDataRange(valueAxis9);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        categoryPlot5.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot5.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot5.getInsets();
        categoryPlot0.setInsets(rectangleInsets13);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertArrayEquals(categoryAxisArray7, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        java.awt.Paint paint6 = categoryPlot0.getBackgroundPaint();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setForegroundAlpha((float) (short) 10);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        categoryPlot0.clearRangeAxes();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        boolean boolean27 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', 1.0d, plotRenderingInfo7, point2D8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers(layer13);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean8 = categoryPlot0.isRangeCrosshairVisible();
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        int int34 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers(layer7);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot0.getDomainAxis((int) ' ');
        java.lang.String str12 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Category Plot" + "'", str12, "Category Plot");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation9, true);
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 1);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot0.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = categoryPlot0.removeAnnotation(categoryAnnotation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.configureRangeAxes();
        categoryPlot0.setWeight((int) (short) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 100, plotRenderingInfo13, point2D14);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        boolean boolean37 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = categoryPlot0.getAxisOffset();
        org.jfree.chart.plot.Marker marker39 = null;
        org.jfree.chart.util.Layer layer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker39, layer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rectangleInsets38);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleEdge rectangleEdge2 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        categoryPlot0.notifyListeners(plotChangeEvent3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(rectangleEdge2);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot5.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot11.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.setRangeCrosshairValue((double) 100.0f);
        categoryPlot13.clearDomainMarkers();
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot13.setBackgroundPaint(paint17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot13.getFixedDomainAxisSpace();
        double double20 = categoryPlot13.getRangeCrosshairValue();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot13.setOutlineStroke(stroke21);
        categoryPlot11.setRangeCrosshairStroke(stroke21);
        categoryPlot0.setDomainGridlineStroke(stroke21);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot0.removeAnnotation(categoryAnnotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(axisSpace19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        categoryPlot0.clearDomainMarkers((int) (short) 1);
        java.awt.Font font17 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        categoryPlot0.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomDomainAxes((double) '4', plotRenderingInfo19, point2D20, false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        java.awt.Paint paint12 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot14.getColumnRenderingOrder();
        categoryPlot14.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot14.setRenderer(categoryItemRenderer17);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent19 = null;
        categoryPlot14.rendererChanged(rendererChangeEvent19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        categoryPlot14.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        categoryPlot14.datasetChanged(datasetChangeEvent24);
        boolean boolean26 = categoryPlot14.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis27 = categoryPlot14.getRangeAxis();
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot14.getRangeAxisLocation((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNotNull(axisLocation29);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 0, (int) ' ', plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot0.setDomainAxis(categoryAxis27);
        categoryPlot0.clearRangeMarkers((int) (short) 100);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setAnchorValue((double) 10);
        org.jfree.data.general.DatasetGroup datasetGroup10 = categoryPlot0.getDatasetGroup();
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(sortOrder12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot7.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot14.getDomainMarkers(layer15);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge();
        java.awt.Stroke stroke18 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot14.setOutlineStroke(stroke18);
        categoryPlot0.setDomainGridlineStroke(stroke18);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, (int) ' ', plotRenderingInfo11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot0.getIndexOf(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setDrawSharedDomainAxis(true);
        categoryPlot0.clearAnnotations();
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot12.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot12.getOrientation();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot12.setNoDataMessagePaint(paint20);
        java.awt.Font font22 = categoryPlot12.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot12.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets23, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.setRangeCrosshairValue((double) 100.0f);
        categoryPlot17.clearDomainMarkers();
        java.awt.Font font21 = categoryPlot17.getNoDataMessageFont();
        categoryPlot17.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot24.getLegendItems();
        categoryPlot17.setFixedLegendItems(legendItemCollection27);
        categoryPlot0.setFixedLegendItems(legendItemCollection27);
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace30);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(legendItemCollection27);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis6, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo10, point2D11, false);
        java.awt.Font font14 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        org.jfree.chart.plot.Plot plot37 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot37.setBackgroundImageAlignment((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNull(plot37);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        int int23 = categoryPlot0.getDomainAxisCount();
        int int24 = categoryPlot0.getRangeAxisCount();
        java.awt.Stroke stroke25 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot16.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection18);
        categoryPlot16.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot16.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder22);
        java.awt.Image image24 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.CategoryMarker categoryMarker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = categoryPlot0.getRangeAxisIndex(valueAxis11);
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        categoryPlot0.setDomainAxis(categoryAxis1);
        int int3 = categoryPlot0.getDomainAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset4 = categoryPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        int int6 = categoryPlot0.getRangeAxisIndex(valueAxis5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryMarker categoryMarker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.setRangeCrosshairValue((double) 100.0f);
        categoryPlot17.clearDomainMarkers();
        java.awt.Paint paint21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot17.setBackgroundPaint(paint21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot17.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation24 = categoryPlot17.getOrientation();
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot17.setNoDataMessagePaint(paint25);
        java.awt.Font font27 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot17.setNoDataMessageFont(font27);
        java.awt.Font font29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot17.setNoDataMessageFont(font29);
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot17.getDomainAxisLocation((int) (byte) 10);
        categoryPlot0.setRangeAxisLocation(1, axisLocation32, false);
        org.jfree.chart.axis.AxisLocation axisLocation36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(0, axisLocation36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(plotOrientation24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        java.awt.Image image23 = null;
        categoryPlot0.setBackgroundImage(image23);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        categoryPlot0.setRangeCrosshairValue((double) 1, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot0.getIndexOf(categoryItemRenderer13);
        org.jfree.chart.plot.Marker marker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot11.getDomainAxisLocation((int) (byte) -1);
        categoryPlot11.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot11.getDomainAxisEdge((int) (byte) 1);
        java.awt.Paint paint18 = categoryPlot11.getRangeCrosshairPaint();
        categoryPlot0.setRangeGridlinePaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset21);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot0.getDomainAxisIndex(categoryAxis23);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.setWeight((int) (short) -1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        int int6 = categoryPlot0.getRangeAxisIndex(valueAxis5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis9, categoryItemRenderer10);
        java.awt.Paint paint12 = categoryPlot11.getBackgroundPaint();
        categoryPlot0.setNoDataMessagePaint(paint12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) '#', (double) 0, plotRenderingInfo7, point2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot0.setDomainAxes(categoryAxisArray11);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis14);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot17.getColumnRenderingOrder();
        categoryPlot17.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot17.setRenderer(categoryItemRenderer20);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        categoryPlot17.rendererChanged(rendererChangeEvent22);
        java.awt.Stroke stroke24 = categoryPlot17.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot17.getDomainAxisEdge(10);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot17.getRendererForDataset(categoryDataset27);
        categoryPlot17.setBackgroundAlpha((float) (byte) 10);
        boolean boolean31 = categoryPlot17.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot17.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertArrayEquals(categoryAxisArray11, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        boolean boolean37 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace39);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot42.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setDomainAxisLocation((int) 'a', axisLocation44, false);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(axisLocation44);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(axisLocation7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) (short) 0, layer8);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot0.setDomainAxis(categoryAxis27);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (byte) 10, valueAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNull(categoryAxis12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        categoryPlot0.setDomainAxis(categoryAxis1);
        int int3 = categoryPlot0.getDomainAxisCount();
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.setRangeCrosshairValue((double) 100.0f);
        categoryPlot4.clearDomainMarkers();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot4.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        categoryPlot4.setDrawingSupplier(drawingSupplier11);
        categoryPlot4.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot4.setBackgroundAlpha((float) '#');
        categoryPlot4.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int21 = categoryPlot4.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot4.getDomainAxisLocation((int) 'a');
        categoryPlot0.setRangeAxisLocation(axisLocation23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot0.getDomainAxisLocation((int) '#');
        java.lang.Class<?> wildcardClass27 = axisLocation26.getClass();
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke3 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot4.getDomainMarkers(layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        categoryPlot7.clearDomainMarkers();
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot7.setBackgroundPaint(paint11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot7.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot7.getOrientation();
        categoryPlot4.setOrientation(plotOrientation14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.setRangeCrosshairValue((double) 100.0f);
        categoryPlot16.clearDomainMarkers();
        java.awt.Font font20 = categoryPlot16.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.setRangeCrosshairValue((double) 100.0f);
        categoryPlot21.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = categoryPlot21.getInsets();
        categoryPlot16.setAxisOffset(rectangleInsets25);
        categoryPlot4.setInsets(rectangleInsets25, true);
        categoryPlot0.setAxisOffset(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (byte) 100, axisLocation12, true);
        java.lang.String str15 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer6);
        java.awt.Stroke stroke8 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis((int) (short) 10, categoryAxis10, true);
        java.awt.Paint paint13 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePosition(categoryAnchor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        java.awt.Paint paint6 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        java.util.List list8 = categoryPlot0.getCategoriesForAxis(categoryAxis7);
        java.lang.Class<?> wildcardClass9 = list8.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer5, true);
        categoryPlot0.clearRangeMarkers();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace12);
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis14, true);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.Marker marker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray10 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer9 };
        categoryPlot0.setRenderers(categoryItemRendererArray10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(1, (int) (byte) 1, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryItemRendererArray10);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray10, new org.jfree.chart.renderer.category.CategoryItemRenderer[] { null });
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleEdge rectangleEdge2 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomRangeAxes((double) 100L, plotRenderingInfo4, point2D5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(rectangleEdge2);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot10.getColumnRenderingOrder();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot10.setRenderer(categoryItemRenderer13);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent15 = null;
        categoryPlot10.rendererChanged(rendererChangeEvent15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        categoryPlot10.drawBackgroundImage(graphics2D17, rectangle2D18);
        categoryPlot10.setDomainGridlinesVisible(true);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot10.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder22);
        java.lang.Object obj24 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        boolean boolean8 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.setRangeCrosshairValue((double) 100.0f);
        categoryPlot9.clearDomainMarkers();
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot9.setBackgroundPaint(paint13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot9.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot9.getOrientation();
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot9.setNoDataMessagePaint(paint17);
        java.awt.Font font19 = categoryPlot9.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot20.getDomainAxisLocation((int) (byte) -1);
        categoryPlot20.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot20.getDomainAxisEdge((int) (byte) 1);
        java.awt.Paint paint27 = categoryPlot20.getRangeCrosshairPaint();
        categoryPlot9.setBackgroundPaint(paint27);
        categoryPlot9.setAnchorValue((double) '4', true);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace33 = categoryPlot32.getFixedDomainAxisSpace();
        categoryPlot32.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        categoryPlot32.setRenderer(10, categoryItemRenderer37, true);
        categoryPlot32.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot41.setRangeCrosshairValue((double) 100.0f);
        categoryPlot41.clearDomainMarkers();
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        categoryPlot41.drawBackgroundImage(graphics2D45, rectangle2D46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = null;
        categoryPlot41.setDrawingSupplier(drawingSupplier48);
        categoryPlot41.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot41.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer55 = categoryPlot41.getRenderer();
        java.awt.Stroke stroke56 = categoryPlot41.getOutlineStroke();
        categoryPlot32.setRangeCrosshairStroke(stroke56);
        categoryPlot9.setRangeGridlineStroke(stroke56);
        categoryPlot0.setDomainGridlineStroke(stroke56);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(axisSpace33);
        org.junit.Assert.assertNull(categoryItemRenderer55);
        org.junit.Assert.assertNotNull(stroke56);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        java.util.List list17 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot0.setDomainAxis((int) 'a', categoryAxis19, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor10 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        categoryPlot0.setForegroundAlpha((float) '#');
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        categoryPlot0.setDomainAxis(categoryAxis1);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.setRangeCrosshairValue((double) 100.0f);
        categoryPlot4.clearDomainMarkers();
        java.awt.Font font8 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.setRangeCrosshairValue((double) 100.0f);
        categoryPlot9.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot9.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot15.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets16);
        categoryPlot0.setAxisOffset(rectangleInsets16);
        java.lang.String str19 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot0.setRangeAxis(1, valueAxis21, true);
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Category Plot" + "'", str19, "Category Plot");
        org.junit.Assert.assertNotNull(sortOrder24);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        java.awt.Image image5 = null;
        categoryPlot0.setBackgroundImage(image5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot0.getRangeAxis((int) (byte) 10);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        java.util.List list8 = categoryPlot0.getAnnotations();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (byte) -1, categoryAxis11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        java.lang.Object obj6 = categoryPlot0.clone();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(1, marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNull(categoryAxis6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = categoryPlot0.getDataRange(valueAxis9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), (double) (short) 100, plotRenderingInfo13, point2D14);
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        categoryPlot0.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getDomainAxisLocation((int) 'a');
        categoryPlot0.mapDatasetToDomainAxis(15, (int) '#');
        int int23 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = categoryPlot0.getDomainAxisForDataset((int) 'a');
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertNull(categoryAxis27);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot12.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot12.getOrientation();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot12.setNoDataMessagePaint(paint20);
        java.awt.Font font22 = categoryPlot12.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot23.getDomainAxisLocation((int) (byte) -1);
        categoryPlot23.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot23.getDomainAxisEdge((int) (byte) 1);
        java.awt.Paint paint30 = categoryPlot23.getRangeCrosshairPaint();
        categoryPlot12.setBackgroundPaint(paint30);
        categoryPlot12.setAnchorValue((double) '4', true);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot35.getFixedDomainAxisSpace();
        categoryPlot35.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot35.setRenderer(10, categoryItemRenderer40, true);
        categoryPlot35.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot44.setRangeCrosshairValue((double) 100.0f);
        categoryPlot44.clearDomainMarkers();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        categoryPlot44.drawBackgroundImage(graphics2D48, rectangle2D49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = null;
        categoryPlot44.setDrawingSupplier(drawingSupplier51);
        categoryPlot44.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot44.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = categoryPlot44.getRenderer();
        java.awt.Stroke stroke59 = categoryPlot44.getOutlineStroke();
        categoryPlot35.setRangeCrosshairStroke(stroke59);
        categoryPlot12.setRangeGridlineStroke(stroke59);
        categoryPlot0.setRangeCrosshairStroke(stroke59);
        org.jfree.chart.LegendItemCollection legendItemCollection63 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot64 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot64.setRangeCrosshairValue((double) 100.0f);
        categoryPlot64.clearDomainMarkers();
        java.awt.Paint paint68 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot64.setBackgroundPaint(paint68);
        org.jfree.chart.axis.ValueAxis valueAxis70 = categoryPlot64.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation71 = categoryPlot64.getOrientation();
        java.awt.Paint paint72 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot64.setNoDataMessagePaint(paint72);
        java.awt.Font font74 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot64.setNoDataMessageFont(font74);
        categoryPlot0.setNoDataMessageFont(font74);
        org.jfree.chart.axis.CategoryAxis categoryAxis78 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((-1), categoryAxis78, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(axisSpace36);
        org.junit.Assert.assertNull(categoryItemRenderer58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNull(legendItemCollection63);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNull(valueAxis70);
        org.junit.Assert.assertNotNull(plotOrientation71);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(font74);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        java.util.List list3 = categoryPlot0.getCategories();
        categoryPlot0.setOutlineVisible(true);
        boolean boolean6 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot11.getColumnRenderingOrder();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot11.setRenderer(categoryItemRenderer14);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent16 = null;
        categoryPlot11.rendererChanged(rendererChangeEvent16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        categoryPlot11.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        categoryPlot11.datasetChanged(datasetChangeEvent21);
        java.lang.String str23 = categoryPlot11.getPlotType();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot11.getRangeAxisEdge((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        int int27 = categoryPlot11.getRangeAxisIndex(valueAxis26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot11.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets28);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        categoryPlot0.setDomainAxis(categoryAxis30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Category Plot" + "'", str23, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        categoryPlot0.removeChangeListener(plotChangeListener5);
        java.awt.Paint paint7 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearRangeMarkers(1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (-1), plotRenderingInfo11, point2D12, false);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot0.getDomainAxisIndex(categoryAxis23);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent25 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent25);
        int int27 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) '4', plotRenderingInfo9, point2D10);
        java.awt.Stroke stroke12 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairValue((double) 0L);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot0.axisChanged(axisChangeEvent12);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = categoryPlot0.removeAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot8.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.setRangeCrosshairValue((double) 100.0f);
        categoryPlot11.clearDomainMarkers();
        java.awt.Font font15 = categoryPlot11.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.setRangeCrosshairValue((double) 100.0f);
        categoryPlot16.clearDomainMarkers();
        java.awt.Paint paint20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot16.setBackgroundPaint(paint20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = categoryPlot16.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation23 = categoryPlot16.getOrientation();
        categoryPlot11.setOrientation(plotOrientation23);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation10, plotOrientation23);
        categoryPlot0.setDomainAxisLocation(axisLocation10);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        categoryPlot0.drawBackgroundImage(graphics2D27, rectangle2D28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = categoryPlot0.getDataset((int) ' ');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(plotOrientation23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNull(categoryDataset31);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot2.setRangeCrosshairValue((double) 100.0f);
        categoryPlot2.clearDomainMarkers();
        java.awt.Paint paint6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot2.setBackgroundPaint(paint6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot2.getFixedDomainAxisSpace();
        double double9 = categoryPlot2.getRangeCrosshairValue();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot2.setOutlineStroke(stroke10);
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        int int13 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        categoryPlot7.clearDomainMarkers();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        categoryPlot7.setDrawingSupplier(drawingSupplier14);
        categoryPlot7.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot7.setBackgroundAlpha((float) '#');
        categoryPlot7.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int24 = categoryPlot7.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot7.getDomainAxisLocation((int) 'a');
        categoryPlot0.setDomainAxisLocation(axisLocation26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot0.getAxisOffset();
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRendererForDataset(categoryDataset13);
        float float15 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.setWeight((int) (short) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot0.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(axisSpace4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        boolean boolean23 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot21.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = categoryPlot24.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot24.getInsets();
        categoryPlot21.setAxisOffset(rectangleInsets27);
        categoryPlot0.setAxisOffset(rectangleInsets27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        categoryPlot0.setDataset(categoryDataset30);
        categoryPlot0.setRangeCrosshairValue((double) 0.5f);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.lang.Class<?> wildcardClass10 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        categoryPlot0.setDomainAxis(categoryAxis1);
        int int3 = categoryPlot0.getDomainAxisCount();
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleEdge5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.setNoDataMessage("");
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        boolean boolean15 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot0.getOrientation();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(plotOrientation14);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection9);
        categoryPlot7.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot7.getRowRenderingOrder();
        categoryPlot7.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = categoryPlot7.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot7.getDataRange(valueAxis17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        categoryPlot7.notifyListeners(plotChangeEvent19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.setRangeCrosshairValue((double) 100.0f);
        categoryPlot21.clearDomainMarkers();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        categoryPlot21.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        categoryPlot21.setDrawingSupplier(drawingSupplier28);
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot21.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot21.getRenderer();
        java.awt.Stroke stroke36 = categoryPlot21.getOutlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot21.getRangeAxisLocation((int) (short) 10);
        categoryPlot7.setDomainAxisLocation(axisLocation38, true);
        categoryPlot0.setDomainAxisLocation(axisLocation38, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot43.setRangeCrosshairValue((double) 100.0f);
        categoryPlot43.clearDomainMarkers();
        java.awt.Paint paint47 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot43.setBackgroundPaint(paint47);
        org.jfree.chart.axis.ValueAxis valueAxis49 = categoryPlot43.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation50 = categoryPlot43.getOrientation();
        java.awt.Paint paint51 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot43.setNoDataMessagePaint(paint51);
        java.awt.Font font53 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot43.setNoDataMessageFont(font53);
        org.jfree.chart.util.RectangleEdge rectangleEdge56 = categoryPlot43.getDomainAxisEdge(10);
        org.jfree.chart.plot.PlotOrientation plotOrientation57 = categoryPlot43.getOrientation();
        categoryPlot0.setOrientation(plotOrientation57);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(sortOrder13);
        org.junit.Assert.assertNull(categoryAxis16);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(valueAxis49);
        org.junit.Assert.assertNotNull(plotOrientation50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(rectangleEdge56);
        org.junit.Assert.assertNotNull(plotOrientation57);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(sortOrder9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.setRangeCrosshairValue((double) 100.0f);
        categoryPlot11.clearDomainMarkers();
        java.awt.Font font15 = categoryPlot11.getNoDataMessageFont();
        boolean boolean16 = categoryPlot11.isRangeGridlinesVisible();
        categoryPlot11.setRangeGridlinesVisible(false);
        categoryPlot11.setRangeCrosshairValue(10.0d);
        int int21 = categoryPlot11.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot11.getRangeAxisLocation((int) (short) 0);
        categoryPlot0.setRangeAxisLocation(axisLocation23, false);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        categoryPlot0.mapDatasetToRangeAxis(1, (int) (short) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder19 = categoryPlot18.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        categoryPlot18.setDrawingSupplier(drawingSupplier20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        categoryPlot18.setDrawingSupplier(drawingSupplier22);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot18.getRangeAxisEdge((int) (short) 0);
        java.awt.Stroke stroke26 = categoryPlot18.getOutlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke26);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(sortOrder19);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot8.getColumnRenderingOrder();
        categoryPlot8.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot8.setRenderer(categoryItemRenderer11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot8.rendererChanged(rendererChangeEvent13);
        java.awt.Stroke stroke15 = categoryPlot8.getOutlineStroke();
        categoryPlot8.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = categoryPlot8.getDataRange(valueAxis18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean21 = categoryPlot20.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot20.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.setRangeCrosshairValue((double) 100.0f);
        categoryPlot23.clearDomainMarkers();
        java.awt.Font font27 = categoryPlot23.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot28.setRangeCrosshairValue((double) 100.0f);
        categoryPlot28.clearDomainMarkers();
        java.awt.Paint paint32 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot28.setBackgroundPaint(paint32);
        org.jfree.chart.axis.ValueAxis valueAxis34 = categoryPlot28.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation35 = categoryPlot28.getOrientation();
        categoryPlot23.setOrientation(plotOrientation35);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation22, plotOrientation35);
        categoryPlot8.setRangeAxisLocation(axisLocation22);
        categoryPlot0.setDomainAxisLocation((int) (short) 100, axisLocation22, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(sortOrder9);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(valueAxis34);
        org.junit.Assert.assertNotNull(plotOrientation35);
        org.junit.Assert.assertNotNull(rectangleEdge37);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        int int5 = categoryPlot0.getDomainAxisCount();
        categoryPlot0.setAnchorValue((double) (byte) 10);
        int int8 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        boolean boolean9 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        java.awt.Stroke stroke12 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.util.Layer layer4 = null;
        java.util.Collection collection5 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getColumnRenderingOrder();
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer(categoryItemRenderer13, true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.Marker marker12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot4.setDataset((int) '4', categoryDataset7);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        categoryPlot0.setDomainGridlinesVisible(true);
        java.lang.String str12 = categoryPlot0.getPlotType();
        java.awt.Font font13 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Category Plot" + "'", str12, "Category Plot");
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot8.getDomainMarkers(layer9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot8.zoomDomainAxes((double) 10, (double) (short) -1, plotRenderingInfo13, point2D14);
        java.awt.Paint paint16 = categoryPlot8.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairPaint(paint16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(valueAxis18);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        java.awt.Image image5 = null;
        categoryPlot0.setBackgroundImage(image5);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer8);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) '#', (double) 0, plotRenderingInfo7, point2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot0.setDomainAxes(categoryAxisArray11);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot0.getDataRange(valueAxis16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertArrayEquals(categoryAxisArray11, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot7.setRenderer(categoryItemRenderer10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent12);
        java.awt.Stroke stroke14 = categoryPlot7.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot7.getDataset();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot7.getDomainMarkers((int) (short) 10, layer17);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray19);
        categoryPlot0.setDomainAxes(categoryAxisArray19);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.removeChangeListener(plotChangeListener22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertArrayEquals(categoryAxisArray19, new org.jfree.chart.axis.CategoryAxis[] {});
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.data.Range range9 = categoryPlot0.getDataRange(valueAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot10.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot12.getFixedDomainAxisSpace();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot12.setOutlineStroke(stroke20);
        categoryPlot10.setRangeCrosshairStroke(stroke20);
        categoryPlot0.setDomainGridlineStroke(stroke20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, (double) (short) 0, plotRenderingInfo26, point2D27);
        org.jfree.chart.axis.ValueAxis valueAxis29 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(valueAxis29);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot8.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot8.setFixedLegendItems(legendItemCollection10);
        categoryPlot8.setRangeCrosshairValue((double) (short) 0);
        java.awt.Paint paint14 = categoryPlot8.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint14);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(sortOrder9);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D23, rectangle2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray10 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer9 };
        categoryPlot0.setRenderers(categoryItemRendererArray10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        java.util.List list16 = categoryPlot0.getCategoriesForAxis(categoryAxis15);
        org.junit.Assert.assertNotNull(categoryItemRendererArray10);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray10, new org.jfree.chart.renderer.category.CategoryItemRenderer[] { null });
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers(layer7);
        categoryPlot0.clearRangeMarkers((int) (short) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getDomainAxisEdge((int) 'a');
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (short) 1, categoryMarker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer5, true);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertNotNull(plotOrientation9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation9, true);
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Paint paint13 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge((int) (short) -1);
        org.jfree.chart.axis.AxisSpace axisSpace16 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(axisSpace16);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes(10.0d, (double) ' ', plotRenderingInfo5, point2D6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        java.awt.Paint paint6 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation(0);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot0.render(graphics2D10, rectangle2D11, (int) (byte) 100, plotRenderingInfo13);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 100);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot8.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent10 = null;
        categoryPlot8.rendererChanged(rendererChangeEvent10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot8.setFixedRangeAxisSpace(axisSpace12);
        java.awt.Paint paint14 = categoryPlot8.getBackgroundPaint();
        categoryPlot0.setDomainGridlinePaint(paint14);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation16, plotOrientation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot12.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot12.getOrientation();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot12.setNoDataMessagePaint(paint20);
        java.awt.Font font22 = categoryPlot12.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot23.getDomainAxisLocation((int) (byte) -1);
        categoryPlot23.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot23.getDomainAxisEdge((int) (byte) 1);
        java.awt.Paint paint30 = categoryPlot23.getRangeCrosshairPaint();
        categoryPlot12.setBackgroundPaint(paint30);
        categoryPlot12.setAnchorValue((double) '4', true);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot35.getFixedDomainAxisSpace();
        categoryPlot35.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot35.setRenderer(10, categoryItemRenderer40, true);
        categoryPlot35.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot44.setRangeCrosshairValue((double) 100.0f);
        categoryPlot44.clearDomainMarkers();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        categoryPlot44.drawBackgroundImage(graphics2D48, rectangle2D49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = null;
        categoryPlot44.setDrawingSupplier(drawingSupplier51);
        categoryPlot44.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot44.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = categoryPlot44.getRenderer();
        java.awt.Stroke stroke59 = categoryPlot44.getOutlineStroke();
        categoryPlot35.setRangeCrosshairStroke(stroke59);
        categoryPlot12.setRangeGridlineStroke(stroke59);
        categoryPlot0.setRangeCrosshairStroke(stroke59);
        org.jfree.chart.LegendItemCollection legendItemCollection63 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot64 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot64.setRangeCrosshairValue((double) 100.0f);
        categoryPlot64.clearDomainMarkers();
        java.awt.Paint paint68 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot64.setBackgroundPaint(paint68);
        org.jfree.chart.axis.ValueAxis valueAxis70 = categoryPlot64.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation71 = categoryPlot64.getOrientation();
        java.awt.Paint paint72 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot64.setNoDataMessagePaint(paint72);
        java.awt.Font font74 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot64.setNoDataMessageFont(font74);
        categoryPlot0.setNoDataMessageFont(font74);
        org.jfree.chart.plot.CategoryPlot categoryPlot77 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder78 = categoryPlot77.getColumnRenderingOrder();
        categoryPlot77.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer80 = null;
        categoryPlot77.setRenderer(categoryItemRenderer80);
        categoryPlot77.setAnchorValue(1.0d);
        org.jfree.chart.axis.AxisSpace axisSpace84 = categoryPlot77.getFixedDomainAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot85 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = categoryPlot85.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation88 = categoryPlot85.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot89 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot89.setRangeCrosshairValue((double) 100.0f);
        categoryPlot89.clearDomainMarkers();
        java.awt.Paint paint93 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot89.setBackgroundPaint(paint93);
        org.jfree.chart.axis.ValueAxis valueAxis95 = categoryPlot89.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation96 = categoryPlot89.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge97 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation88, plotOrientation96);
        categoryPlot77.setOrientation(plotOrientation96);
        categoryPlot0.setOrientation(plotOrientation96);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(axisSpace36);
        org.junit.Assert.assertNull(categoryItemRenderer58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNull(legendItemCollection63);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNull(valueAxis70);
        org.junit.Assert.assertNotNull(plotOrientation71);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(font74);
        org.junit.Assert.assertNotNull(sortOrder78);
        org.junit.Assert.assertNull(axisSpace84);
        org.junit.Assert.assertNotNull(rectangleInsets86);
        org.junit.Assert.assertNotNull(axisLocation88);
        org.junit.Assert.assertNotNull(paint93);
        org.junit.Assert.assertNull(valueAxis95);
        org.junit.Assert.assertNotNull(plotOrientation96);
        org.junit.Assert.assertNotNull(rectangleEdge97);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', 1.0d, plotRenderingInfo7, point2D8);
        categoryPlot0.setBackgroundAlpha((float) (short) 10);
        categoryPlot0.setRangeGridlinesVisible(false);
        categoryPlot0.setBackgroundAlpha((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis();
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRowRenderingOrder(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryAxis10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot0.getDomainAxisIndex(categoryAxis25);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 100, 15);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer5, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot8.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot8.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(axisLocation13, true);
        java.awt.Paint paint16 = categoryPlot0.getRangeCrosshairPaint();
        java.lang.Class<?> wildcardClass17 = paint16.getClass();
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getRangeAxisEdge(100);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.data.Range range7 = categoryPlot0.getDataRange(valueAxis6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = categoryPlot0.getRangeAxisIndex(valueAxis9);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 100, marker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(plotOrientation18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = categoryPlot0.getDataRange(valueAxis9);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot0.removeAnnotation(categoryAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        categoryPlot0.setRangeCrosshairVisible(false);
        java.awt.Stroke stroke9 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setRangeCrosshairVisible(true);
        java.awt.Stroke stroke12 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.setRangeCrosshairValue((double) 100.0f);
        categoryPlot13.clearDomainMarkers();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        categoryPlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        categoryPlot13.setDrawingSupplier(drawingSupplier20);
        categoryPlot13.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot13.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot13.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot13.setRenderer(categoryItemRenderer28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.setRangeCrosshairValue((double) 100.0f);
        categoryPlot30.clearDomainMarkers();
        java.awt.Font font34 = categoryPlot30.getNoDataMessageFont();
        categoryPlot30.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection40 = categoryPlot37.getLegendItems();
        categoryPlot30.setFixedLegendItems(legendItemCollection40);
        categoryPlot13.setFixedLegendItems(legendItemCollection40);
        categoryPlot0.setFixedLegendItems(legendItemCollection40);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(legendItemCollection40);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        java.lang.Class<?> wildcardClass6 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.data.Range range5 = categoryPlot0.getDataRange(valueAxis4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot6.getColumnRenderingOrder();
        categoryPlot6.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot6.setRenderer(categoryItemRenderer9);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        categoryPlot6.rendererChanged(rendererChangeEvent11);
        java.awt.Stroke stroke13 = categoryPlot6.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot6.getDomainAxisEdge(10);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = categoryPlot6.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor16);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        java.util.List list19 = categoryPlot0.getCategoriesForAxis(categoryAxis18);
        org.jfree.chart.plot.Marker marker20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor16);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        int int7 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(10.0d, (double) (byte) 0, plotRenderingInfo11, point2D12);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot16.getDomainMarkers(layer17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot16.getDomainAxisEdge();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot16.getDomainAxisEdge((int) '4');
        java.awt.Stroke stroke22 = categoryPlot16.getDomainGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke22);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) '#', (double) 0, plotRenderingInfo7, point2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot0.setDomainAxes(categoryAxisArray11);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertArrayEquals(categoryAxisArray11, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis(valueAxis13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot15.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot15.setRangeAxis(0, valueAxis18, false);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot15.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean24 = categoryPlot23.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot23.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot26.setRangeCrosshairValue((double) 100.0f);
        categoryPlot26.clearDomainMarkers();
        java.awt.Font font30 = categoryPlot26.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot31.setRangeCrosshairValue((double) 100.0f);
        categoryPlot31.clearDomainMarkers();
        java.awt.Paint paint35 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot31.setBackgroundPaint(paint35);
        org.jfree.chart.axis.ValueAxis valueAxis37 = categoryPlot31.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation38 = categoryPlot31.getOrientation();
        categoryPlot26.setOrientation(plotOrientation38);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation25, plotOrientation38);
        categoryPlot15.setDomainAxisLocation(axisLocation25);
        categoryPlot0.setDomainAxisLocation(axisLocation25, true);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(valueAxis37);
        org.junit.Assert.assertNotNull(plotOrientation38);
        org.junit.Assert.assertNotNull(rectangleEdge40);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getAxisOffset();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 100L, 10.0d, plotRenderingInfo15, point2D16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot0.removeAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.removeChangeListener(plotChangeListener23);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot0.setDataset(15, categoryDataset26);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot0.getDomainAxisLocation((int) (short) 0);
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot0.getDomainMarkers((int) (short) 1, layer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        java.util.List list34 = categoryPlot0.getCategoriesForAxis(categoryAxis33);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot12.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot12.getOrientation();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot12.setNoDataMessagePaint(paint20);
        java.awt.Font font22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot12.setNoDataMessageFont(font22);
        org.jfree.chart.plot.PlotOrientation plotOrientation24 = categoryPlot12.getOrientation();
        categoryPlot0.setOrientation(plotOrientation24);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(plotOrientation24);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset9 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) (short) 0, layer8);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers((int) (short) 0, layer11);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxisForDataset((int) (short) 1);
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setAnchorValue((double) ' ', true);
        categoryPlot0.setDomainGridlinesVisible(false);
        boolean boolean12 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        categoryPlot5.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot5.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot5.getInsets();
        categoryPlot0.setInsets(rectangleInsets13);
        categoryPlot0.configureDomainAxes();
        java.awt.Stroke stroke16 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertArrayEquals(categoryAxisArray7, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        java.awt.Paint paint6 = categoryPlot0.getBackgroundPaint();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot8.getFixedDomainAxisSpace();
        categoryPlot8.clearRangeMarkers((int) (short) 10);
        boolean boolean12 = categoryPlot8.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot8.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot8.setRenderer((int) ' ', categoryItemRenderer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot8.getDataRange(valueAxis17);
        java.awt.Stroke stroke19 = categoryPlot8.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 1, plotRenderingInfo22, point2D23, true);
        int int26 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryMarker categoryMarker27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font10);
        java.awt.Font font12 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.setRangeCrosshairValue((double) 100.0f);
        categoryPlot14.clearDomainMarkers();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.setRangeCrosshairValue((double) 100.0f);
        categoryPlot19.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot19.getInsets();
        categoryPlot14.setAxisOffset(rectangleInsets23);
        categoryPlot0.setInsets(rectangleInsets23);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot26.setRangeCrosshairValue((double) 100.0f);
        categoryPlot26.clearDomainMarkers();
        java.awt.Paint paint30 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot26.setBackgroundPaint(paint30);
        org.jfree.chart.axis.ValueAxis valueAxis32 = categoryPlot26.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation33 = categoryPlot26.getOrientation();
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot26.setNoDataMessagePaint(paint34);
        java.awt.Font font36 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot26.setNoDataMessageFont(font36);
        java.awt.Font font38 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot26.setNoDataMessageFont(font38);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot26.getDomainAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation(axisLocation41);
        float float43 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNotNull(plotOrientation33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent10);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.AxisSpace axisSpace14 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNull(axisSpace14);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray10 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer9 };
        categoryPlot0.setRenderers(categoryItemRendererArray10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryItemRendererArray10);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray10, new org.jfree.chart.renderer.category.CategoryItemRenderer[] { null });
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot3.getFixedDomainAxisSpace();
        categoryPlot3.clearRangeMarkers((int) (short) 10);
        boolean boolean7 = categoryPlot3.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot3.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets8);
        java.awt.Image image10 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis12, false);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        java.awt.Stroke stroke9 = categoryPlot0.getOutlineStroke();
        int int10 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers(layer13);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomDomainAxes(0.0d, (double) 10, plotRenderingInfo19, point2D20);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        double double8 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge(0);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(layer11);
        java.awt.Paint paint13 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot5.setBackgroundPaint(paint9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot5.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot5.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot16.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection18);
        categoryPlot16.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot16.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder22);
        java.awt.Image image24 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer5, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot8.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot8.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(axisLocation13, true);
        java.awt.Paint paint16 = categoryPlot0.getRangeCrosshairPaint();
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot0.setRenderer(categoryItemRenderer18);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePosition(categoryAnchor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
        java.lang.Object obj8 = categoryPlot0.clone();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.setRangeCrosshairValue((double) 100.0f);
        categoryPlot8.clearDomainMarkers();
        java.awt.Paint paint12 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot8.setBackgroundPaint(paint12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot8.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot8.getOrientation();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot8.setNoDataMessagePaint(paint16);
        java.awt.Font font18 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot8.setNoDataMessageFont(font18);
        java.awt.Font font20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot8.setNoDataMessageFont(font20);
        java.awt.Paint paint22 = categoryPlot8.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint22);
        double double24 = categoryPlot0.getAnchorValue();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot0.getRangeAxisEdge(1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge26);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot3.getFixedDomainAxisSpace();
        categoryPlot3.clearRangeMarkers((int) (short) 10);
        boolean boolean7 = categoryPlot3.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot3.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets8);
        java.awt.Image image10 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (int) (byte) 10, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        int int5 = categoryPlot0.getRangeAxisIndex(valueAxis4);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = categoryPlot0.getRangeMarkers(layer6);
        categoryPlot0.clearAnnotations();
        float float9 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        java.awt.Stroke stroke5 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot6.setOutlineVisible(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        categoryPlot0.mapDatasetToDomainAxis((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        int int6 = categoryPlot0.getRangeAxisIndex(valueAxis5);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent11);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation3 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.setRangeCrosshairValue((double) 100.0f);
        categoryPlot8.clearDomainMarkers();
        java.awt.Paint paint12 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot8.setBackgroundPaint(paint12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot8.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot8.getOrientation();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot8.setNoDataMessagePaint(paint16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot8.zoomDomainAxes(0.0d, plotRenderingInfo19, point2D20);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot8.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder22);
        java.awt.Paint paint24 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getColumnRenderingOrder();
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot0.getDatasetGroup();
        int int14 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot16.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection18);
        categoryPlot16.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot16.getRowRenderingOrder();
        categoryPlot16.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.data.Range range27 = categoryPlot16.getDataRange(valueAxis26);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        categoryPlot16.notifyListeners(plotChangeEvent28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.setRangeCrosshairValue((double) 100.0f);
        categoryPlot30.clearDomainMarkers();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        categoryPlot30.drawBackgroundImage(graphics2D34, rectangle2D35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        categoryPlot30.setDrawingSupplier(drawingSupplier37);
        categoryPlot30.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot30.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = categoryPlot30.getRenderer();
        java.awt.Stroke stroke45 = categoryPlot30.getOutlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot30.getRangeAxisLocation((int) (short) 10);
        categoryPlot16.setDomainAxisLocation(axisLocation47, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNull(categoryAxis25);
        org.junit.Assert.assertNull(range27);
        org.junit.Assert.assertNull(categoryItemRenderer44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(axisLocation47);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer6);
        java.awt.Stroke stroke8 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis((int) (short) 10, categoryAxis10, true);
        java.awt.Paint paint13 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Stroke stroke14 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.data.Range range16 = categoryPlot0.getDataRange(valueAxis15);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(range16);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.data.Range range9 = categoryPlot0.getDataRange(valueAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot10.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot12.getFixedDomainAxisSpace();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot12.setOutlineStroke(stroke20);
        categoryPlot10.setRangeCrosshairStroke(stroke20);
        categoryPlot0.setDomainGridlineStroke(stroke20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, (double) (short) 0, plotRenderingInfo26, point2D27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot29.getDomainAxisLocation((int) (byte) -1);
        categoryPlot29.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        categoryPlot29.removeChangeListener(plotChangeListener34);
        java.awt.Paint paint36 = categoryPlot29.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder39 = categoryPlot38.getColumnRenderingOrder();
        categoryPlot38.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        categoryPlot38.setRenderer(categoryItemRenderer41);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent43 = null;
        categoryPlot38.rendererChanged(rendererChangeEvent43);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        categoryPlot38.drawBackgroundImage(graphics2D45, rectangle2D46);
        categoryPlot38.setDomainGridlinesVisible(true);
        org.jfree.chart.util.SortOrder sortOrder50 = categoryPlot38.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation52 = categoryPlot38.getRangeAxisLocation((int) '4');
        categoryPlot29.setDomainAxisLocation(98, axisLocation52);
        categoryPlot0.setDomainAxisLocation(axisLocation52);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(sortOrder39);
        org.junit.Assert.assertNotNull(sortOrder50);
        org.junit.Assert.assertNotNull(axisLocation52);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        java.awt.Paint paint6 = categoryPlot0.getBackgroundPaint();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot8.getFixedDomainAxisSpace();
        categoryPlot8.clearRangeMarkers((int) (short) 10);
        boolean boolean12 = categoryPlot8.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot8.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot8.setRenderer((int) ' ', categoryItemRenderer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot8.getDataRange(valueAxis17);
        java.awt.Stroke stroke19 = categoryPlot8.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 1, plotRenderingInfo22, point2D23, true);
        int int26 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.Plot plot27 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(plot27);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (byte) 100, axisLocation12, true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot0.getDatasetGroup();
        java.util.List list16 = categoryPlot0.getCategories();
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.data.Range range5 = categoryPlot0.getDataRange(valueAxis4);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        categoryPlot7.clearDomainMarkers();
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot7.setBackgroundPaint(paint11);
        categoryPlot0.setBackgroundPaint(paint11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryItemRenderer14);
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
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRendererForDataset(categoryDataset8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.setAnchorValue((double) (byte) 0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot0.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot0.getDomainMarkers(layer27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 100, (double) 100.0f, plotRenderingInfo31, point2D32);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = categoryPlot0.removeAnnotation(categoryAnnotation34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(collection28);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.setRangeCrosshairValue((double) 100.0f);
        categoryPlot5.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot5.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot11.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.setRangeCrosshairValue((double) 100.0f);
        categoryPlot13.clearDomainMarkers();
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot13.setBackgroundPaint(paint17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot13.getFixedDomainAxisSpace();
        double double20 = categoryPlot13.getRangeCrosshairValue();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot13.setOutlineStroke(stroke21);
        categoryPlot11.setRangeCrosshairStroke(stroke21);
        categoryPlot0.setDomainGridlineStroke(stroke21);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(axisSpace19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers(layer13);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.setRangeCrosshairValue((double) 100.0f);
        categoryPlot17.clearDomainMarkers();
        java.awt.Paint paint21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot17.setBackgroundPaint(paint21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setAxisOffset(rectangleInsets23);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor25 = categoryPlot17.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.setRangeCrosshairValue((double) 100.0f);
        categoryPlot27.clearDomainMarkers();
        java.awt.Font font31 = categoryPlot27.getNoDataMessageFont();
        categoryPlot27.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection37 = categoryPlot34.getLegendItems();
        categoryPlot27.setFixedLegendItems(legendItemCollection37);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot27.getRangeAxisLocation((int) '4');
        categoryPlot17.setDomainAxisLocation(0, axisLocation40);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder43 = categoryPlot42.getColumnRenderingOrder();
        categoryPlot42.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        categoryPlot42.setRenderer(categoryItemRenderer45);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent47 = null;
        categoryPlot42.rendererChanged(rendererChangeEvent47);
        java.awt.Stroke stroke49 = categoryPlot42.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge51 = categoryPlot42.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot52.setRangeCrosshairValue((double) 100.0f);
        categoryPlot52.clearDomainMarkers();
        java.awt.Paint paint56 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot52.setBackgroundPaint(paint56);
        org.jfree.chart.axis.ValueAxis valueAxis58 = categoryPlot52.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation59 = categoryPlot52.getOrientation();
        java.awt.Paint paint60 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot52.setNoDataMessagePaint(paint60);
        categoryPlot42.setBackgroundPaint(paint60);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer63 = categoryPlot42.getRenderer();
        java.util.List list64 = categoryPlot42.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener65 = null;
        categoryPlot42.addChangeListener(plotChangeListener65);
        org.jfree.chart.plot.PlotOrientation plotOrientation67 = categoryPlot42.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge68 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation40, plotOrientation67);
        categoryPlot0.setDomainAxisLocation(axisLocation40, true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(categoryAnchor25);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(legendItemCollection37);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNotNull(sortOrder43);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(rectangleEdge51);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(valueAxis58);
        org.junit.Assert.assertNotNull(plotOrientation59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNull(categoryItemRenderer63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(plotOrientation67);
        org.junit.Assert.assertNotNull(rectangleEdge68);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        categoryPlot0.setAnchorValue(100.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(sortOrder14);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        categoryPlot0.setRangeCrosshairVisible(false);
        java.awt.Stroke stroke9 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot0.render(graphics2D12, rectangle2D13, (int) '#', plotRenderingInfo15);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        java.awt.Paint paint35 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis36 = categoryPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        boolean boolean41 = categoryPlot0.render(graphics2D37, rectangle2D38, (int) (short) -1, plotRenderingInfo40);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(valueAxis36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot1.setRangeCrosshairValue((double) 100.0f);
        categoryPlot1.clearDomainMarkers();
        java.awt.Font font5 = categoryPlot1.getNoDataMessageFont();
        categoryPlot1.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot8.getLegendItems();
        categoryPlot1.setFixedLegendItems(legendItemCollection11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot1.getOrientation();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge14 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot0.getOrientation();
        boolean boolean26 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot0.getDomainMarkers((int) (byte) 100, layer28);
        java.awt.Paint paint30 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        org.jfree.chart.axis.AxisSpace axisSpace37 = categoryPlot0.getFixedRangeAxisSpace();
        java.util.List list38 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNull(axisSpace37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (byte) 100, axisLocation12, true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (byte) -1, categoryAxis17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot8.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot8.setRangeAxis(0, valueAxis11, false);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot8.setDataset(categoryDataset14);
        categoryPlot8.mapDatasetToRangeAxis((int) (short) 0, (int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot8.getDomainAxisLocation((int) (byte) 0);
        categoryPlot0.setDomainAxisLocation(axisLocation20, false);
        java.awt.Stroke stroke23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlineStroke(stroke23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        java.awt.Paint paint13 = categoryPlot12.getBackgroundPaint();
        categoryPlot0.setOutlinePaint(paint13);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        categoryPlot0.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        float float12 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer((int) (short) -1);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryMarker categoryMarker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(15, categoryMarker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot0.render(graphics2D12, rectangle2D13, (int) 'a', plotRenderingInfo15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 0, plotRenderingInfo19, point2D20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        categoryPlot0.removeChangeListener(plotChangeListener5);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot0.removeAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getDomainAxisEdge((int) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.setAnchorValue((double) 1L);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(sortOrder34);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedRangeAxisSpace();
        boolean boolean8 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.data.Range range9 = categoryPlot0.getDataRange(valueAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot10.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot12.getFixedDomainAxisSpace();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot12.setOutlineStroke(stroke20);
        categoryPlot10.setRangeCrosshairStroke(stroke20);
        categoryPlot0.setDomainGridlineStroke(stroke20);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis((int) (byte) 10, categoryAxis25);
        int int27 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean29 = categoryPlot28.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray31 = new org.jfree.chart.axis.ValueAxis[] { valueAxis30 };
        categoryPlot28.setRangeAxes(valueAxisArray31);
        java.awt.Paint paint33 = categoryPlot28.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = categoryPlot34.getDomainMarkers(layer35);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot34.getDomainAxisEdge();
        java.awt.Stroke stroke38 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot34.setOutlineStroke(stroke38);
        categoryPlot28.setRangeCrosshairStroke(stroke38);
        categoryPlot0.setOutlineStroke(stroke38);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(valueAxisArray31);
        org.junit.Assert.assertArrayEquals(valueAxisArray31, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(collection36);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean6 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = categoryPlot0.getDataRange(valueAxis9);
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        categoryPlot7.setDrawingSupplier(drawingSupplier9);
        int int11 = categoryPlot7.getWeight();
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot7.getFixedDomainAxisSpace();
        boolean boolean14 = categoryPlot7.isDomainZoomable();
        categoryPlot7.setAnchorValue((double) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot7.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot0.setDomainAxis(categoryAxis19);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        java.awt.Paint paint8 = categoryPlot0.getNoDataMessagePaint();
        float float9 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setRangeGridlinesVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot8.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.setRangeCrosshairValue((double) 100.0f);
        categoryPlot11.clearDomainMarkers();
        java.awt.Font font15 = categoryPlot11.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.setRangeCrosshairValue((double) 100.0f);
        categoryPlot16.clearDomainMarkers();
        java.awt.Paint paint20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot16.setBackgroundPaint(paint20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = categoryPlot16.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation23 = categoryPlot16.getOrientation();
        categoryPlot11.setOrientation(plotOrientation23);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation10, plotOrientation23);
        categoryPlot0.setDomainAxisLocation(axisLocation10);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        categoryPlot0.drawBackgroundImage(graphics2D27, rectangle2D28);
        int int30 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.CategoryMarker categoryMarker31 = null;
        org.jfree.chart.util.Layer layer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker31, layer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(plotOrientation23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        categoryPlot0.notifyListeners(plotChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getRangeAxisEdge((int) (byte) 0);
        java.lang.String str13 = categoryPlot0.getPlotType();
        int int14 = categoryPlot0.getDomainAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot0.getRendererForDataset(categoryDataset15);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Category Plot" + "'", str13, "Category Plot");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        java.util.List list17 = categoryPlot0.getCategories();
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker18, layer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot0.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = categoryPlot0.removeAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxisForDataset(100);
        java.lang.String str8 = categoryPlot0.getPlotType();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer10, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setAnchorValue((double) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        int int11 = categoryPlot0.getIndexOf(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryPlot0.getInsets();
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot0.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset(1);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 1, layer16);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        java.util.List list19 = categoryPlot0.getCategoriesForAxis(categoryAxis18);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setRangeCrosshairVisible(true);
        float float6 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot7.getInsets();
        java.awt.Paint paint12 = categoryPlot7.getRangeCrosshairPaint();
        categoryPlot0.setOutlinePaint(paint12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        double double15 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) (byte) -1);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis17);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, (double) 10L, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.setRangeCrosshairValue((double) 100.0f);
        categoryPlot30.clearDomainMarkers();
        java.awt.Font font34 = categoryPlot30.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.setRangeCrosshairValue((double) 100.0f);
        categoryPlot35.clearDomainMarkers();
        java.awt.Paint paint39 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot35.setBackgroundPaint(paint39);
        org.jfree.chart.axis.ValueAxis valueAxis41 = categoryPlot35.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot35.getOrientation();
        categoryPlot30.setOrientation(plotOrientation42);
        java.awt.Image image44 = categoryPlot30.getBackgroundImage();
        categoryPlot30.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder47 = categoryPlot46.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection48 = null;
        categoryPlot46.setFixedLegendItems(legendItemCollection48);
        categoryPlot46.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder52 = categoryPlot46.getRowRenderingOrder();
        categoryPlot30.setColumnRenderingOrder(sortOrder52);
        categoryPlot0.setRowRenderingOrder(sortOrder52);
        boolean boolean55 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(valueAxis41);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(sortOrder47);
        org.junit.Assert.assertNotNull(sortOrder52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.data.Range range5 = categoryPlot0.getDataRange(valueAxis4);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        categoryPlot0.mapDatasetToDomainAxis(0, 10);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor11 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(categoryAnchor11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        categoryPlot0.setRangeGridlinePaint(paint7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 10, categoryItemRenderer11, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderers(categoryItemRendererArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        java.util.List list17 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryMarker categoryMarker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.mapDatasetToDomainAxis(100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        categoryPlot0.setDataset((int) (short) 100, categoryDataset27);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(plotOrientation25);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Paint paint14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot10.setBackgroundPaint(paint14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot10.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot10.getOrientation();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint18);
        categoryPlot0.setBackgroundPaint(paint18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        java.util.List list22 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot0.getDomainMarkers(layer27);
        org.jfree.chart.plot.CategoryMarker categoryMarker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(98, categoryMarker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(collection28);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        categoryPlot0.removeChangeListener(plotChangeListener5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.setRangeCrosshairValue((double) 100.0f);
        categoryPlot9.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot9.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        categoryPlot9.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean17 = categoryPlot16.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot16.getRangeAxisLocation();
        categoryPlot9.setRangeAxisLocation(axisLocation18, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.setRangeCrosshairValue((double) 100.0f);
        categoryPlot21.clearDomainMarkers();
        java.awt.Paint paint25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot21.setBackgroundPaint(paint25);
        org.jfree.chart.axis.ValueAxis valueAxis27 = categoryPlot21.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation28 = categoryPlot21.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation18, plotOrientation28);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation8, plotOrientation28);
        org.jfree.chart.plot.PlotOrientation plotOrientation31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge32 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation8, plotOrientation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(valueAxis27);
        org.junit.Assert.assertNotNull(plotOrientation28);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getRangeAxisEdge(100);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.data.Range range7 = categoryPlot0.getDataRange(valueAxis6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(categoryAxis8);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertArrayEquals(categoryAxisArray2, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getDomainAxisEdge((int) (byte) 1);
        org.jfree.chart.plot.Marker marker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, (int) (short) 100);
        categoryPlot0.setRangeCrosshairValue((double) 'a', false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis(categoryAxis9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset(98);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.setRangeCrosshairValue((double) 100.0f);
        categoryPlot8.clearDomainMarkers();
        java.awt.Paint paint12 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot8.setBackgroundPaint(paint12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot8.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot8.getOrientation();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot8.setNoDataMessagePaint(paint16);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        categoryPlot8.axisChanged(axisChangeEvent18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot20.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        categoryPlot20.setDrawingSupplier(drawingSupplier22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        categoryPlot20.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot20.getRangeAxisEdge((int) (short) 0);
        java.awt.Paint paint28 = categoryPlot20.getNoDataMessagePaint();
        categoryPlot8.setBackgroundPaint(paint28);
        categoryPlot0.setOutlinePaint(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(sortOrder21);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        java.awt.Image image5 = null;
        categoryPlot0.setBackgroundImage(image5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis((int) (byte) 0);
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        float float2 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot3 = categoryPlot0.getParent();
        categoryPlot0.clearDomainAxes();
        categoryPlot0.mapDatasetToDomainAxis((int) ' ', (int) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(plot3);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent2 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent2);
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getRootPlot();
        categoryPlot0.mapDatasetToRangeAxis(1, (-1));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        double double8 = categoryPlot0.getRangeCrosshairValue();
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor10 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(categoryAnchor10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 100, plotRenderingInfo9, point2D10, true);
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint13);
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot16.getFixedDomainAxisSpace();
        categoryPlot16.clearRangeMarkers((int) (short) 10);
        boolean boolean20 = categoryPlot16.isSubplot();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot21.getColumnRenderingOrder();
        categoryPlot21.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot21.setRenderer(categoryItemRenderer24);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot21.rendererChanged(rendererChangeEvent26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        categoryPlot21.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        categoryPlot21.datasetChanged(datasetChangeEvent31);
        java.lang.String str33 = categoryPlot21.getPlotType();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot21.getRangeAxisEdge((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        int int37 = categoryPlot21.getRangeAxisIndex(valueAxis36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = categoryPlot21.getAxisOffset();
        categoryPlot16.setInsets(rectangleInsets38);
        categoryPlot0.setInsets(rectangleInsets38);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Category Plot" + "'", str33, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets38);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setAnchorValue((double) ' ', true);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot0.getDomainAxis(1);
        categoryPlot0.setAnchorValue((double) (-1.0f));
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean15 = categoryPlot14.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot14.setRangeAxes(valueAxisArray17);
        categoryPlot0.setRangeAxes(valueAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertArrayEquals(valueAxisArray17, new org.jfree.chart.axis.ValueAxis[] { null });
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean6 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font10);
        java.awt.Font font12 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.setRangeCrosshairValue((double) 100.0f);
        categoryPlot14.clearDomainMarkers();
        java.awt.Font font18 = categoryPlot14.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.setRangeCrosshairValue((double) 100.0f);
        categoryPlot19.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot19.getInsets();
        categoryPlot14.setAxisOffset(rectangleInsets23);
        categoryPlot0.setInsets(rectangleInsets23);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot26.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot26.setRangeAxis(0, valueAxis29, false);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        categoryPlot26.setDataset(categoryDataset32);
        categoryPlot26.mapDatasetToRangeAxis((int) (short) 0, (int) (short) 100);
        categoryPlot26.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot26.getRendererForDataset(categoryDataset38);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = categoryPlot40.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot40.getDomainAxisLocation((-1));
        categoryPlot26.setRangeAxisLocation(axisLocation43);
        categoryPlot0.setRangeAxisLocation(axisLocation43);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNull(categoryItemRenderer39);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(axisLocation43);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        boolean boolean17 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.Plot plot19 = categoryPlot0.getParent();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Stroke stroke4 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        categoryPlot5.setRangeCrosshairVisible(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot5.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot5.getInsets();
        categoryPlot0.setInsets(rectangleInsets13);
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Font font17 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder20 = categoryPlot19.getColumnRenderingOrder();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot19.setRenderer(categoryItemRenderer22);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent24 = null;
        categoryPlot19.rendererChanged(rendererChangeEvent24);
        java.awt.Stroke stroke26 = categoryPlot19.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot19.getDomainAxisEdge(10);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.setRangeCrosshairValue((double) 100.0f);
        categoryPlot29.clearDomainMarkers();
        java.awt.Paint paint33 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot29.setBackgroundPaint(paint33);
        org.jfree.chart.axis.ValueAxis valueAxis35 = categoryPlot29.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot29.getOrientation();
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot29.setNoDataMessagePaint(paint37);
        categoryPlot19.setBackgroundPaint(paint37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot19.getRenderer();
        java.util.List list41 = categoryPlot19.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener42 = null;
        categoryPlot19.addChangeListener(plotChangeListener42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = null;
        categoryPlot19.setDrawingSupplier(drawingSupplier44);
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        categoryPlot19.setDomainAxis(categoryAxis46);
        org.jfree.chart.axis.AxisLocation axisLocation49 = categoryPlot19.getRangeAxisLocation((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation49, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertArrayEquals(categoryAxisArray7, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(valueAxis35);
        org.junit.Assert.assertNotNull(plotOrientation36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(categoryItemRenderer40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(axisLocation49);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, (double) 10L, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.setRangeCrosshairValue((double) 100.0f);
        categoryPlot30.clearDomainMarkers();
        java.awt.Font font34 = categoryPlot30.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.setRangeCrosshairValue((double) 100.0f);
        categoryPlot35.clearDomainMarkers();
        java.awt.Paint paint39 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot35.setBackgroundPaint(paint39);
        org.jfree.chart.axis.ValueAxis valueAxis41 = categoryPlot35.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot35.getOrientation();
        categoryPlot30.setOrientation(plotOrientation42);
        java.awt.Image image44 = categoryPlot30.getBackgroundImage();
        categoryPlot30.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder47 = categoryPlot46.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection48 = null;
        categoryPlot46.setFixedLegendItems(legendItemCollection48);
        categoryPlot46.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder52 = categoryPlot46.getRowRenderingOrder();
        categoryPlot30.setColumnRenderingOrder(sortOrder52);
        categoryPlot0.setRowRenderingOrder(sortOrder52);
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        categoryPlot0.removeChangeListener(plotChangeListener55);
        org.jfree.chart.util.RectangleEdge rectangleEdge58 = categoryPlot0.getDomainAxisEdge(98);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = null;
        categoryPlot0.setRenderer(categoryItemRenderer59);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(valueAxis41);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(sortOrder47);
        org.junit.Assert.assertNotNull(sortOrder52);
        org.junit.Assert.assertNotNull(rectangleEdge58);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        int int5 = categoryPlot0.getRangeAxisIndex(valueAxis4);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot0.getRenderer((int) ' ');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((-1), (int) (short) 1, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(categoryItemRenderer7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        java.util.List list4 = categoryPlot0.getAnnotations();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        int int10 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRenderer((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.setRangeCrosshairValue((double) 100.0f);
        categoryPlot7.clearDomainMarkers();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        categoryPlot7.setDrawingSupplier(drawingSupplier14);
        categoryPlot7.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot7.setBackgroundAlpha((float) '#');
        categoryPlot7.mapDatasetToRangeAxis(1, (int) (short) -1);
        int int24 = categoryPlot7.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot7.getDomainAxisLocation((int) 'a');
        categoryPlot0.setDomainAxisLocation((int) (byte) 100, axisLocation26);
        float float28 = categoryPlot0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D29, rectangle2D30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot0.addChangeListener(plotChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font10);
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes(10.0d, plotRenderingInfo14, point2D15, true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(plotOrientation12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis((int) '4');
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(valueAxis6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        categoryPlot0.setAnchorValue(100.0d);
        categoryPlot0.clearDomainMarkers();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot7.setRenderer(categoryItemRenderer10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent12);
        java.awt.Stroke stroke14 = categoryPlot7.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot7.getDataset();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot7.getDomainMarkers((int) (short) 10, layer17);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray19);
        categoryPlot0.setDomainAxes(categoryAxisArray19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot0.zoomRangeAxes((double) 0.5f, plotRenderingInfo23, point2D24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.Point2D point2D28 = null;
        org.jfree.chart.plot.PlotState plotState29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D26, rectangle2D27, point2D28, plotState29, plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertArrayEquals(categoryAxisArray19, new org.jfree.chart.axis.CategoryAxis[] {});
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        java.awt.Stroke stroke8 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer10, true);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis(valueAxis13);
        categoryPlot0.setBackgroundAlpha((float) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot0.getDataRange(valueAxis17);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge((int) 'a');
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(15, layer10);
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 0, categoryMarker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot7.getDomainMarkers(layer8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot7.zoomDomainAxes((double) 10, (double) (short) -1, plotRenderingInfo12, point2D13);
        java.awt.Paint paint15 = categoryPlot7.getBackgroundPaint();
        categoryPlot0.setDomainGridlinePaint(paint15);
        org.jfree.chart.plot.Plot plot17 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset9 = categoryPlot0.getDataset((int) ' ');
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot3.setRangeCrosshairValue((double) 100.0f);
        categoryPlot3.clearDomainMarkers();
        java.awt.Paint paint7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot3.setBackgroundPaint(paint7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot3.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        categoryPlot0.mapDatasetToRangeAxis(1, (-1));
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) ' ', categoryMarker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(plotOrientation10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = categoryPlot0.getInsets();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis(categoryAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot12.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot12.getOrientation();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot12.setNoDataMessagePaint(paint20);
        java.awt.Font font22 = categoryPlot12.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot23.getDomainAxisLocation((int) (byte) -1);
        categoryPlot23.setRangeCrosshairVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot23.getDomainAxisEdge((int) (byte) 1);
        java.awt.Paint paint30 = categoryPlot23.getRangeCrosshairPaint();
        categoryPlot12.setBackgroundPaint(paint30);
        categoryPlot12.setAnchorValue((double) '4', true);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot35.getFixedDomainAxisSpace();
        categoryPlot35.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot35.setRenderer(10, categoryItemRenderer40, true);
        categoryPlot35.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot44.setRangeCrosshairValue((double) 100.0f);
        categoryPlot44.clearDomainMarkers();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        categoryPlot44.drawBackgroundImage(graphics2D48, rectangle2D49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = null;
        categoryPlot44.setDrawingSupplier(drawingSupplier51);
        categoryPlot44.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot44.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = categoryPlot44.getRenderer();
        java.awt.Stroke stroke59 = categoryPlot44.getOutlineStroke();
        categoryPlot35.setRangeCrosshairStroke(stroke59);
        categoryPlot12.setRangeGridlineStroke(stroke59);
        categoryPlot0.setRangeCrosshairStroke(stroke59);
        boolean boolean63 = categoryPlot0.isSubplot();
        boolean boolean64 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.util.Layer layer66 = null;
        java.util.Collection collection67 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer66);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(axisSpace36);
        org.junit.Assert.assertNull(categoryItemRenderer58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(collection67);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot0.getDomainAxisIndex(categoryAxis25);
        int int27 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, (double) 10L, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.setRangeCrosshairValue((double) 100.0f);
        categoryPlot30.clearDomainMarkers();
        java.awt.Font font34 = categoryPlot30.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.setRangeCrosshairValue((double) 100.0f);
        categoryPlot35.clearDomainMarkers();
        java.awt.Paint paint39 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot35.setBackgroundPaint(paint39);
        org.jfree.chart.axis.ValueAxis valueAxis41 = categoryPlot35.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot35.getOrientation();
        categoryPlot30.setOrientation(plotOrientation42);
        java.awt.Image image44 = categoryPlot30.getBackgroundImage();
        categoryPlot30.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder47 = categoryPlot46.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection48 = null;
        categoryPlot46.setFixedLegendItems(legendItemCollection48);
        categoryPlot46.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder52 = categoryPlot46.getRowRenderingOrder();
        categoryPlot30.setColumnRenderingOrder(sortOrder52);
        categoryPlot0.setRowRenderingOrder(sortOrder52);
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        categoryPlot0.removeChangeListener(plotChangeListener55);
        org.jfree.chart.util.RectangleEdge rectangleEdge58 = categoryPlot0.getDomainAxisEdge(98);
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.data.Range range60 = categoryPlot0.getDataRange(valueAxis59);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent61 = null;
        categoryPlot0.notifyListeners(plotChangeEvent61);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(valueAxis41);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(sortOrder47);
        org.junit.Assert.assertNotNull(sortOrder52);
        org.junit.Assert.assertNotNull(rectangleEdge58);
        org.junit.Assert.assertNull(range60);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        boolean boolean9 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        java.awt.Stroke stroke12 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((-1), categoryAxis14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray10 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer9 };
        categoryPlot0.setRenderers(categoryItemRendererArray10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getRangeAxisLocation((int) '#');
        org.junit.Assert.assertNotNull(categoryItemRendererArray10);
        org.junit.Assert.assertArrayEquals(categoryItemRendererArray10, new org.jfree.chart.renderer.category.CategoryItemRenderer[] { null });
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) '#', (double) 0, plotRenderingInfo7, point2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot0.setDomainAxes(categoryAxisArray11);
        float float13 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer15);
        categoryPlot0.setAnchorValue((double) (short) 100);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertArrayEquals(categoryAxisArray11, new org.jfree.chart.axis.CategoryAxis[] { null });
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis((int) '#');
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image10 = null;
        categoryPlot0.setBackgroundImage(image10);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        boolean boolean4 = categoryPlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot0.getAxisOffset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.clearDomainAxes();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNull(axisSpace1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(legendItemCollection6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.setRangeCrosshairValue((double) 100.0f);
        categoryPlot17.clearDomainMarkers();
        java.awt.Font font21 = categoryPlot17.getNoDataMessageFont();
        categoryPlot17.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.setRangeCrosshairValue((double) 100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot24.getLegendItems();
        categoryPlot17.setFixedLegendItems(legendItemCollection27);
        categoryPlot0.setFixedLegendItems(legendItemCollection27);
        java.lang.Class<?> wildcardClass30 = legendItemCollection27.getClass();
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(legendItemCollection27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot0.getDatasetRenderingOrder();
        boolean boolean8 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo10, point2D11, false);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot0.getRangeAxis();
        double double16 = categoryPlot0.getAnchorValue();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        categoryPlot0.notifyListeners(plotChangeEvent17);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray3 = new org.jfree.chart.axis.ValueAxis[] { valueAxis2 };
        categoryPlot0.setRangeAxes(valueAxisArray3);
        org.jfree.chart.axis.ValueAxis valueAxis5 = categoryPlot0.getRangeAxis();
        boolean boolean6 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = categoryPlot7.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot7.getInsets();
        categoryPlot7.clearAnnotations();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot7.getRangeAxisLocation((int) (byte) 100);
        categoryPlot0.setDomainAxisLocation(axisLocation13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(valueAxisArray3);
        org.junit.Assert.assertArrayEquals(valueAxisArray3, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNull(valueAxis5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        boolean boolean5 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) '4', plotRenderingInfo9, point2D10);
        java.awt.Stroke stroke12 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent13);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.data.Range range9 = categoryPlot0.getDataRange(valueAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot10.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.setRangeCrosshairValue((double) 100.0f);
        categoryPlot12.clearDomainMarkers();
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot12.setBackgroundPaint(paint16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot12.getFixedDomainAxisSpace();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot12.setOutlineStroke(stroke20);
        categoryPlot10.setRangeCrosshairStroke(stroke20);
        categoryPlot0.setDomainGridlineStroke(stroke20);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis((int) (byte) 10, categoryAxis25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        categoryPlot0.markerChanged(markerChangeEvent28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis6);
        org.junit.Assert.assertNotNull(plotOrientation7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(categoryItemRenderer27);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.setRangeCrosshairValue((double) 100.0f);
        categoryPlot10.clearDomainMarkers();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        categoryPlot10.setDrawingSupplier(drawingSupplier17);
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 10, (int) (byte) 1);
        categoryPlot10.setBackgroundAlpha((float) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.setRangeCrosshairValue((double) 100.0f);
        categoryPlot25.clearDomainMarkers();
        java.awt.Font font29 = categoryPlot25.getNoDataMessageFont();
        categoryPlot10.setNoDataMessageFont(font29);
        categoryPlot0.setNoDataMessageFont(font29);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis(1, valueAxis33);
        java.awt.Paint paint35 = categoryPlot0.getBackgroundPaint();
        float float36 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = categoryPlot0.removeAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sortOrder1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot2.setRangeCrosshairValue((double) 100.0f);
        categoryPlot2.clearDomainMarkers();
        java.awt.Paint paint6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot2.setBackgroundPaint(paint6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot2.getFixedDomainAxisSpace();
        double double9 = categoryPlot2.getRangeCrosshairValue();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot2.setOutlineStroke(stroke10);
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot13.getDataset((int) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot13.getInsets();
        categoryPlot13.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot13.setDomainAxis(categoryAxis19);
        java.util.List list21 = categoryPlot13.getAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot13.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = categoryPlot13.getBackgroundImage();
        float float25 = categoryPlot13.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot13.getRenderer((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot28.setRangeCrosshairValue((double) 100.0f);
        java.awt.Stroke stroke31 = categoryPlot28.getDomainGridlineStroke();
        categoryPlot13.setRangeCrosshairStroke(stroke31);
        boolean boolean33 = categoryPlot0.equals((java.lang.Object) stroke31);
        org.jfree.chart.axis.ValueAxis valueAxis35 = categoryPlot0.getRangeAxis(10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(valueAxis35);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection2);
        categoryPlot0.setRangeCrosshairValue((double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.clearRangeMarkers((int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.clearDomainMarkers((int) (byte) -1);
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis(0, valueAxis3, false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        double double8 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge(0);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        java.awt.Font font4 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(axisLocation6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier2);
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setAnchorValue((double) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getRangeMarkers(layer12);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder1 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getRangeAxisLocation((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.setRangeCrosshairValue((double) 100.0f);
        categoryPlot15.clearDomainMarkers();
        java.awt.Font font19 = categoryPlot15.getNoDataMessageFont();
        boolean boolean20 = categoryPlot15.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot15.setDataset((int) 'a', categoryDataset22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = categoryPlot15.getAxisOffset();
        categoryPlot0.setAxisOffset(rectangleInsets24);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(sortOrder1);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        categoryPlot0.clearDomainMarkers();
        int int4 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot0.setRangeAxis(valueAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot7.getColumnRenderingOrder();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot7.setRenderer(categoryItemRenderer10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent12);
        java.awt.Stroke stroke14 = categoryPlot7.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot7.getDataset();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot7.getDomainMarkers((int) (short) 10, layer17);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray19);
        categoryPlot0.setDomainAxes(categoryAxisArray19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot0.zoomRangeAxes((double) 0.5f, plotRenderingInfo23, point2D24);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot0.setRangeAxis(100, valueAxis27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertArrayEquals(categoryAxisArray19, new org.jfree.chart.axis.CategoryAxis[] {});
    }
}

