package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = piePlot0.getInsets();
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setCircular(false, true);
        double double16 = piePlot1.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMaximumLabelWidth();
        java.awt.Paint paint21 = piePlot19.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot19.getLabelDistributor();
        piePlot19.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable26 = piePlot19.getSectionKey((int) (short) 1);
        double double28 = piePlot19.getExplodePercent((java.lang.Comparable) (-1.0f));
        piePlot19.zoom((double) (byte) 100);
        java.awt.Paint paint32 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) 0);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        piePlot34.setLabelGap((double) 10L);
        java.lang.Comparable comparable39 = piePlot34.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        java.awt.Stroke stroke42 = null;
        piePlot41.setLabelOutlineStroke(stroke42);
        piePlot41.setStartAngle((double) (-1.0f));
        java.awt.Paint paint46 = piePlot41.getBaseSectionPaint();
        piePlot34.setBackgroundPaint(paint46);
        piePlot34.setPieIndex(100);
        java.awt.Stroke stroke52 = piePlot34.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, true);
        java.awt.Stroke stroke55 = piePlot34.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, false);
        piePlot19.setBaseSectionOutlineStroke(stroke55);
        piePlot1.setBaseSectionOutlineStroke(stroke55);
        java.awt.Paint paint58 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 1 + "'", comparable26, 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + 1 + "'", comparable39, 1);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.isCircular();
        java.awt.Font font6 = piePlot1.getNoDataMessageFont();
        boolean boolean7 = piePlot1.getSimpleLabels();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getMaximumLabelWidth();
        java.awt.Paint paint10 = piePlot8.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot8.getLabelDistributor();
        piePlot8.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable15 = piePlot8.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke16 = piePlot8.getOutlineStroke();
        piePlot1.setLabelLinkStroke(stroke16);
        piePlot1.setCircular(false);
        double double20 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setPieIndex(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.isCircular();
        piePlot1.setIgnoreZeroValues(true);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getInteriorGap();
        piePlot9.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint15 = piePlot9.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double16 = piePlot9.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot9.notifyListeners(plotChangeEvent17);
        piePlot9.setForegroundAlpha((float) (short) 1);
        piePlot9.setCircular(false, true);
        double double24 = piePlot9.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot9.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator25);
        java.awt.Paint paint27 = piePlot1.getShadowPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setCircular(false, true);
        double double16 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke18 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 10);
        piePlot1.setCircular(true, false);
        java.awt.Paint paint22 = piePlot1.getBackgroundPaint();
        int int23 = piePlot1.getBackgroundImageAlignment();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNull(pieURLGenerator24);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLabelGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot1.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot18.drawBackgroundImage(graphics2D19, rectangle2D20);
        piePlot18.setShadowYOffset((double) (byte) 1);
        boolean boolean24 = piePlot18.isCircular();
        java.lang.Comparable comparable26 = piePlot18.getSectionKey(10);
        double double27 = piePlot18.getMaximumLabelWidth();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot18);
        piePlot18.setPieIndex((int) (short) 10);
        boolean boolean31 = piePlot18.isOutlineVisible();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot18.drawBackgroundImage(graphics2D32, rectangle2D33);
        java.awt.Paint paint37 = piePlot18.lookupSectionPaint((java.lang.Comparable) 0.025d, true);
        double double38 = piePlot18.getStartAngle();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10 + "'", comparable26, 10);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 90.0d + "'", double38 == 90.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        boolean boolean7 = piePlot1.isCircular();
        java.awt.Paint paint8 = piePlot1.getBaseSectionOutlinePaint();
        piePlot1.setLabelLinksVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot1.getLegendItems();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getInteriorGap();
        piePlot13.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint19 = piePlot13.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot13.setNoDataMessage("");
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot13.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot13.getLegendLabelGenerator();
        java.awt.Paint paint28 = piePlot13.lookupSectionPaint((java.lang.Comparable) (short) 100, true);
        piePlot1.setLabelOutlinePaint(paint28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.lang.Comparable comparable6 = piePlot1.getSectionKey((int) (short) 1);
        piePlot1.setCircular(false, true);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot1.getToolTipGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot1.notifyListeners(plotChangeEvent11);
        java.awt.Paint paint14 = piePlot1.getSectionPaint((java.lang.Comparable) 52);
        java.awt.Paint paint15 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        boolean boolean7 = piePlot1.isCircular();
        java.lang.Comparable comparable9 = piePlot1.getSectionKey(10);
        boolean boolean10 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot1.setDataset(pieDataset11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor16);
        float float18 = piePlot1.getBackgroundAlpha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = piePlot1.getPlotType();
// flaky "1) test2510(org.jfree.chart.plot.RegressionTest5)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        boolean boolean7 = piePlot1.isCircular();
        java.lang.Comparable comparable9 = piePlot1.getSectionKey(10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setURLGenerator(pieURLGenerator10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.awt.Paint paint5 = piePlot1.getLabelShadowPaint();
        double double6 = piePlot1.getStartAngle();
        piePlot1.setBackgroundAlpha((float) (byte) 0);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        float float11 = piePlot10.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = piePlot10.getDrawingSupplier();
        java.awt.Font font13 = piePlot10.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot10.getURLGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot10.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot1.handleClick((int) ' ', (int) (byte) 0, plotRenderingInfo19);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint6 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getInteriorGap();
        piePlot9.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint15 = piePlot9.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot9.setURLGenerator(pieURLGenerator16);
        boolean boolean18 = piePlot9.getSimpleLabels();
        java.awt.Paint paint20 = piePlot9.lookupSectionOutlinePaint((java.lang.Comparable) (short) 10);
        piePlot1.setSectionPaint((java.lang.Comparable) (byte) 100, paint20);
        java.awt.Paint paint24 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1L, false);
        boolean boolean25 = piePlot1.getSimpleLabels();
        piePlot1.setBackgroundImageAlpha((float) (short) 0);
        int int28 = piePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        java.awt.Stroke stroke13 = piePlot11.getBaseSectionOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (byte) 1, stroke13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMaximumLabelWidth();
        java.awt.Paint paint18 = piePlot16.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        piePlot20.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint26 = piePlot20.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot16.setNoDataMessagePaint(paint26);
        double double28 = piePlot16.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getInteriorGap();
        java.awt.Paint paint33 = null;
        piePlot30.setSectionPaint((java.lang.Comparable) "", paint33);
        org.jfree.data.general.PieDataset pieDataset35 = piePlot30.getDataset();
        java.awt.Stroke stroke36 = piePlot30.getLabelOutlineStroke();
        java.awt.Stroke stroke38 = piePlot30.getSectionOutlineStroke((java.lang.Comparable) "");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        piePlot30.markerChanged(markerChangeEvent39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = piePlot42.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot42.getSimpleLabelOffset();
        boolean boolean46 = piePlot42.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        double double49 = piePlot48.getInteriorGap();
        piePlot48.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint54 = piePlot48.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot42.setNoDataMessagePaint(paint54);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getInteriorGap();
        piePlot57.setLabelGap((double) 10L);
        java.lang.Comparable comparable62 = piePlot57.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke63 = piePlot57.getLabelOutlineStroke();
        piePlot42.setOutlineStroke(stroke63);
        java.awt.Paint paint67 = piePlot42.lookupSectionPaint((java.lang.Comparable) 0.4d, false);
        piePlot30.setLabelLinkPaint(paint67);
        piePlot16.setLabelPaint(paint67);
        org.jfree.chart.util.Rotation rotation70 = piePlot16.getDirection();
        piePlot1.setDirection(rotation70);
        piePlot1.setShadowXOffset((double) (short) -1);
        org.jfree.data.general.PieDataset pieDataset74 = null;
        piePlot1.setDataset(pieDataset74);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.025d + "'", double28 == 0.025d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
        org.junit.Assert.assertNull(pieDataset35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.08d + "'", double49 == 0.08d);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.08d + "'", double58 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + 1 + "'", comparable62, 1);
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(rotation70);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot1.setSectionPaint((java.lang.Comparable) 100L, paint8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setURLGenerator(pieURLGenerator10);
        double double12 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMaximumLabelWidth();
        java.awt.Paint paint16 = piePlot14.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot14.getLabelDistributor();
        piePlot14.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable21 = piePlot14.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke24 = piePlot14.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        java.awt.Paint paint25 = piePlot14.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMaximumLabelWidth();
        java.awt.Paint paint29 = piePlot27.getLabelLinkPaint();
        java.awt.Image image30 = null;
        piePlot27.setBackgroundImage(image30);
        java.lang.String str32 = piePlot27.getNoDataMessage();
        piePlot27.setShadowYOffset(10.0d);
        java.awt.Paint paint37 = piePlot27.lookupSectionPaint((java.lang.Comparable) 10.0f, true);
        java.awt.Paint paint38 = piePlot27.getLabelOutlinePaint();
        piePlot14.setLabelPaint(paint38);
        piePlot1.setBaseSectionPaint(paint38);
        piePlot1.setMinimumArcAngleToDraw((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1 + "'", comparable21, 1);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        boolean boolean7 = piePlot1.isCircular();
        java.awt.Stroke stroke8 = piePlot1.getOutlineStroke();
        java.awt.Paint paint9 = piePlot1.getLabelLinkPaint();
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = piePlot13.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getInteriorGap();
        java.awt.Paint paint20 = null;
        piePlot17.setSectionPaint((java.lang.Comparable) "", paint20);
        java.awt.Stroke stroke23 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getInteriorGap();
        piePlot25.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint31 = piePlot25.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot17.setOutlinePaint(paint31);
        boolean boolean33 = piePlot13.equals((java.lang.Object) paint31);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = null;
        piePlot13.setURLGenerator(pieURLGenerator34);
        java.awt.Shape shape36 = piePlot13.getLegendItemShape();
        piePlot1.setLegendItemShape(shape36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator5);
        double double7 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot1.setBaseSectionPaint(paint8);
        java.awt.Paint paint12 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, false);
        org.jfree.chart.plot.Plot plot13 = piePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setBackgroundImageAlignment(35);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlotState piePlotState18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D15, (int) ' ', rectangle2D17, piePlotState18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Paint paint10 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getInteriorGap();
        piePlot12.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint18 = piePlot12.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double19 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot12.notifyListeners(plotChangeEvent20);
        piePlot12.setForegroundAlpha((float) (short) 1);
        piePlot12.setCircular(false, true);
        double double27 = piePlot12.getShadowYOffset();
        java.awt.Stroke stroke29 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 10);
        piePlot12.setCircular(true, false);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot12);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        java.awt.Stroke stroke36 = null;
        piePlot35.setLabelOutlineStroke(stroke36);
        piePlot35.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        piePlot35.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo42);
        piePlot35.setIgnoreNullValues(true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        piePlot35.markerChanged(markerChangeEvent46);
        boolean boolean48 = piePlot35.isCircular();
        java.awt.Font font49 = piePlot35.getNoDataMessageFont();
        piePlot12.setNoDataMessageFont(font49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08d + "'", double13 == 0.08d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(font49);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.lang.Comparable comparable6 = piePlot1.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        java.awt.Stroke stroke9 = null;
        piePlot8.setLabelOutlineStroke(stroke9);
        piePlot8.setStartAngle((double) (-1.0f));
        java.awt.Paint paint13 = piePlot8.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint13);
        piePlot1.setPieIndex(100);
        java.awt.Stroke stroke19 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, true);
        float float20 = piePlot1.getBackgroundAlpha();
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint23 = piePlot1.lookupSectionPaint(comparable21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = piePlot1.getShadowPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMaximumLabelWidth();
        java.awt.Paint paint14 = piePlot12.getLabelLinkPaint();
        java.awt.Image image15 = null;
        piePlot12.setBackgroundImage(image15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getInteriorGap();
        piePlot18.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint24 = piePlot18.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot12.setShadowPaint(paint24);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) "Pie Plot", paint24);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMaximumLabelWidth();
        java.awt.Paint paint30 = piePlot28.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getInteriorGap();
        piePlot32.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint38 = piePlot32.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot28.setNoDataMessagePaint(paint38);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot28.getLabelGenerator();
        piePlot28.setMinimumArcAngleToDraw((double) 10L);
        java.lang.Object obj43 = piePlot28.clone();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getMaximumLabelWidth();
        java.awt.Paint paint47 = piePlot45.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot45.getLabelDistributor();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = null;
        piePlot45.setToolTipGenerator(pieToolTipGenerator49);
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        piePlot45.addChangeListener(plotChangeListener51);
        piePlot45.setIgnoreZeroValues(false);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getMaximumLabelWidth();
        java.awt.Paint paint59 = piePlot57.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor60 = piePlot57.getLabelDistributor();
        piePlot57.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable64 = piePlot57.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke67 = piePlot57.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        boolean boolean68 = piePlot57.getSectionOutlinesVisible();
        java.awt.Paint paint69 = piePlot57.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset70 = null;
        org.jfree.chart.plot.PiePlot piePlot71 = new org.jfree.chart.plot.PiePlot(pieDataset70);
        double double72 = piePlot71.getMaximumLabelWidth();
        java.awt.Paint paint73 = piePlot71.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor74 = piePlot71.getLabelDistributor();
        piePlot71.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable78 = piePlot71.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke79 = piePlot71.getOutlineStroke();
        java.awt.Paint paint80 = piePlot71.getLabelBackgroundPaint();
        piePlot57.setBackgroundPaint(paint80);
        piePlot45.setSectionOutlinePaint((java.lang.Comparable) (byte) -1, paint80);
        piePlot28.setLabelShadowPaint(paint80);
        piePlot1.setLabelLinkPaint(paint80);
        java.awt.Paint paint85 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator86 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator86);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14d + "'", double29 == 0.14d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.08d + "'", double33 == 0.08d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.14d + "'", double46 == 0.14d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor48);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.14d + "'", double58 == 0.14d);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor60);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + 1 + "'", comparable64, 1);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.14d + "'", double72 == 0.14d);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor74);
        org.junit.Assert.assertEquals("'" + comparable78 + "' != '" + 1 + "'", comparable78, 1);
        org.junit.Assert.assertNotNull(stroke79);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(paint85);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setBackgroundImageAlignment((int) '4');
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot7.setURLGenerator(pieURLGenerator14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMaximumLabelWidth();
        java.awt.Paint paint19 = piePlot17.getLabelLinkPaint();
        piePlot7.setBaseSectionPaint(paint19);
        piePlot1.setBackgroundPaint(paint19);
        java.awt.Paint paint22 = piePlot1.getLabelOutlinePaint();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        boolean boolean10 = piePlot1.getSimpleLabels();
        piePlot1.setBackgroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = piePlot15.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getInteriorGap();
        java.awt.Paint paint22 = null;
        piePlot19.setSectionPaint((java.lang.Comparable) "", paint22);
        java.awt.Stroke stroke25 = piePlot19.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getInteriorGap();
        piePlot27.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint33 = piePlot27.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot19.setOutlinePaint(paint33);
        boolean boolean35 = piePlot15.equals((java.lang.Object) paint33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = null;
        piePlot15.setURLGenerator(pieURLGenerator36);
        piePlot15.setOutlineVisible(true);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        double double42 = piePlot41.getMaximumLabelWidth();
        java.awt.Paint paint43 = piePlot41.getLabelLinkPaint();
        java.awt.Image image44 = null;
        piePlot41.setBackgroundImage(image44);
        java.lang.String str46 = piePlot41.getNoDataMessage();
        piePlot41.setShadowYOffset(10.0d);
        java.awt.Paint paint51 = piePlot41.lookupSectionPaint((java.lang.Comparable) 10.0f, true);
        piePlot15.setLabelShadowPaint(paint51);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 10L, paint51);
        double double54 = piePlot1.getStartAngle();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.14d + "'", double42 == 0.14d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 90.0d + "'", double54 == 90.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        piePlot1.setForegroundAlpha((float) 10L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick((-1), (-1), plotRenderingInfo14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot1.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        piePlot20.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot20.addChangeListener(plotChangeListener24);
        java.awt.Paint paint27 = piePlot20.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot20.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getInteriorGap();
        java.awt.Paint paint33 = null;
        piePlot30.setSectionPaint((java.lang.Comparable) "", paint33);
        java.awt.Paint paint35 = piePlot30.getLabelPaint();
        boolean boolean36 = piePlot30.isCircular();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getMaximumLabelWidth();
        java.awt.Paint paint40 = piePlot38.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getInteriorGap();
        piePlot42.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint48 = piePlot42.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot38.setNoDataMessagePaint(paint48);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator50 = piePlot38.getLabelGenerator();
        piePlot30.setLabelGenerator(pieSectionLabelGenerator50);
        piePlot20.setLegendLabelToolTipGenerator(pieSectionLabelGenerator50);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator50);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator54);
        java.awt.Paint paint56 = piePlot1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.14d + "'", double39 == 0.14d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator50);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.lang.Comparable comparable6 = piePlot1.getSectionKey((int) (short) 1);
        piePlot1.setCircular(false, true);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot1.getToolTipGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot1.notifyListeners(plotChangeEvent11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot1.getDatasetGroup();
        piePlot1.setIgnoreNullValues(true);
        double double16 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke11 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = piePlot14.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot14.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getMaximumLabelWidth();
        java.awt.Paint paint22 = piePlot20.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getInteriorGap();
        piePlot24.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint30 = piePlot24.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot20.setNoDataMessagePaint(paint30);
        piePlot14.setSectionPaint((java.lang.Comparable) true, paint30);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot14.getLabelPadding();
        piePlot1.setInsets(rectangleInsets33, true);
        java.awt.Paint paint37 = piePlot1.getSectionPaint((java.lang.Comparable) 4.0d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator38);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator40 = piePlot1.getToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.08d + "'", double25 == 0.08d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertNull(pieToolTipGenerator40);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        piePlot11.setLabelGap((double) 10L);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        piePlot16.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint22 = piePlot16.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot16.setURLGenerator(pieURLGenerator23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getMaximumLabelWidth();
        java.awt.Paint paint28 = piePlot26.getLabelLinkPaint();
        piePlot16.setBaseSectionPaint(paint28);
        piePlot11.setOutlinePaint(paint28);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot11);
        java.awt.Image image32 = null;
        piePlot11.setBackgroundImage(image32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        double double36 = piePlot35.getInteriorGap();
        piePlot35.setLabelGap((double) 10L);
        java.awt.Paint paint39 = piePlot35.getLabelShadowPaint();
        java.awt.Shape shape40 = piePlot35.getLegendItemShape();
        piePlot11.setLegendItemShape(shape40);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        piePlot11.setDataset(pieDataset42);
        java.awt.Paint paint45 = piePlot11.getSectionPaint((java.lang.Comparable) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.08d + "'", double36 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNull(paint45);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Image image10 = piePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        piePlot1.markerChanged(markerChangeEvent11);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = piePlot1.getToolTipGenerator();
        java.lang.Object obj14 = null;
        boolean boolean15 = piePlot1.equals(obj14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNull(pieToolTipGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setBackgroundImageAlignment((int) '4');
        java.awt.Font font6 = piePlot1.getNoDataMessageFont();
        piePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        java.awt.Stroke stroke11 = null;
        piePlot10.setLabelOutlineStroke(stroke11);
        piePlot10.setStartAngle((double) (-1.0f));
        float float15 = piePlot10.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot17.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        double double22 = piePlot21.getInteriorGap();
        java.awt.Paint paint24 = null;
        piePlot21.setSectionPaint((java.lang.Comparable) "", paint24);
        java.awt.Stroke stroke27 = piePlot21.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getInteriorGap();
        piePlot29.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint35 = piePlot29.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot21.setOutlinePaint(paint35);
        boolean boolean37 = piePlot17.equals((java.lang.Object) paint35);
        piePlot10.setBaseSectionOutlinePaint(paint35);
        piePlot10.setShadowXOffset((double) 1L);
        piePlot10.setMaximumLabelWidth((double) 'a');
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot10.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator43);
        java.awt.Paint paint45 = piePlot1.getOutlinePaint();
        piePlot1.setLabelLinkMargin(0.4d);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        piePlot1.setDataset(pieDataset48);
        java.awt.Graphics2D graphics2D50 = null;
        org.jfree.chart.plot.PiePlotState piePlotState51 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord52 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D50, piePlotState51, pieLabelRecord52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator43);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getInteriorGap();
        piePlot6.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint12 = piePlot6.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot6.setURLGenerator(pieURLGenerator13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMaximumLabelWidth();
        java.awt.Paint paint18 = piePlot16.getLabelLinkPaint();
        piePlot6.setBaseSectionPaint(paint18);
        piePlot1.setOutlinePaint(paint18);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = piePlot22.getDrawingSupplier();
        java.awt.Font font25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot22.setNoDataMessageFont(font25);
        java.awt.Paint paint28 = piePlot22.lookupSectionPaint((java.lang.Comparable) 100);
        java.awt.Paint paint29 = piePlot22.getBaseSectionOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint29);
        java.awt.Shape shape31 = piePlot1.getLegendItemShape();
        java.awt.Paint paint33 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.08d + "'", double23 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        float float6 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        java.awt.Stroke stroke9 = null;
        piePlot8.setLabelOutlineStroke(stroke9);
        piePlot8.setBackgroundImageAlignment((int) '4');
        java.awt.Paint paint15 = piePlot8.lookupSectionOutlinePaint((java.lang.Comparable) 0.5f, false);
        java.awt.Paint paint16 = piePlot8.getLabelShadowPaint();
        java.awt.Stroke stroke17 = piePlot8.getOutlineStroke();
        piePlot1.setLabelLinkStroke(stroke17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot1.getLabelGenerator();
        double double20 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getMaximumLabelWidth();
        java.awt.Paint paint24 = piePlot22.getLabelLinkPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = piePlot22.getToolTipGenerator();
        java.awt.Paint paint28 = piePlot22.lookupSectionPaint((java.lang.Comparable) (byte) 10, false);
        piePlot1.setBaseSectionOutlinePaint(paint28);
        double double30 = piePlot1.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.025d + "'", double20 == 0.025d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(pieToolTipGenerator25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.025d + "'", double30 == 0.025d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.lang.Comparable comparable6 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke7 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        piePlot9.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot9.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        java.awt.Paint paint19 = null;
        piePlot16.setSectionPaint((java.lang.Comparable) "", paint19);
        java.awt.Paint paint21 = piePlot16.getLabelPaint();
        boolean boolean22 = piePlot16.isCircular();
        java.awt.Paint paint23 = piePlot16.getBaseSectionOutlinePaint();
        piePlot9.setLabelShadowPaint(paint23);
        piePlot1.setLabelOutlinePaint(paint23);
        piePlot1.setIgnoreZeroValues(false);
        java.awt.Image image28 = piePlot1.getBackgroundImage();
        int int29 = piePlot1.getPieIndex();
        java.lang.String str30 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint6 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        java.awt.Paint paint11 = null;
        piePlot8.setSectionPaint((java.lang.Comparable) "", paint11);
        java.awt.Stroke stroke14 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        piePlot16.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint22 = piePlot16.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot8.setOutlinePaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMaximumLabelWidth();
        java.awt.Paint paint27 = piePlot25.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getInteriorGap();
        piePlot29.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint35 = piePlot29.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot25.setNoDataMessagePaint(paint35);
        double double37 = piePlot25.getLabelLinkMargin();
        boolean boolean38 = piePlot25.getIgnoreNullValues();
        double double39 = piePlot25.getMaximumLabelWidth();
        double double40 = piePlot25.getMinimumArcAngleToDraw();
        java.awt.Stroke stroke41 = piePlot25.getOutlineStroke();
        piePlot8.setOutlineStroke(stroke41);
        piePlot1.setLabelLinkStroke(stroke41);
        java.awt.Stroke stroke44 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.025d + "'", double37 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.14d + "'", double39 == 0.14d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0E-5d + "'", double40 == 1.0E-5d);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        boolean boolean7 = piePlot1.isCircular();
        java.lang.Comparable comparable9 = piePlot1.getSectionKey(10);
        boolean boolean10 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot1.setDataset(pieDataset11);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = piePlot1.getToolTipGenerator();
        piePlot1.setLabelLinkMargin((double) ' ');
        java.awt.Paint paint17 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pieToolTipGenerator13);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.isCircular();
        piePlot1.setIgnoreZeroValues(true);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getInteriorGap();
        java.awt.Paint paint12 = null;
        piePlot9.setSectionPaint((java.lang.Comparable) "", paint12);
        org.jfree.data.general.PieDataset pieDataset14 = piePlot9.getDataset();
        java.awt.Shape shape15 = piePlot9.getLegendItemShape();
        piePlot1.setLegendItemShape(shape15);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot1.getLabelDistributor();
        piePlot1.setIgnoreZeroValues(false);
        java.awt.Stroke stroke20 = piePlot1.getLabelLinkStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNull(pieDataset14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        java.awt.Stroke stroke12 = null;
        piePlot11.setLabelOutlineStroke(stroke12);
        piePlot11.setBackgroundImageAlignment((int) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot11.getLabelPadding();
        piePlot1.setInsets(rectangleInsets16);
        piePlot1.setLabelLinksVisible(true);
        piePlot1.setForegroundAlpha((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo8);
        java.awt.Paint paint11 = piePlot1.getSectionPaint((java.lang.Comparable) 100L);
        boolean boolean12 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot1.setShadowPaint(paint13);
        double double16 = piePlot1.getExplodePercent((java.lang.Comparable) (short) 100);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Stroke stroke19 = null;
        piePlot18.setLabelOutlineStroke(stroke19);
        piePlot18.setStartAngle((double) (-1.0f));
        float float23 = piePlot18.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = piePlot18.getLegendItems();
        java.awt.Paint paint25 = piePlot18.getBackgroundPaint();
        piePlot1.setShadowPaint(paint25);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator29);
        java.awt.Paint paint32 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        piePlot34.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint40 = piePlot34.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot34.setNoDataMessage("");
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        piePlot34.drawBackgroundImage(graphics2D43, rectangle2D44);
        java.awt.Stroke stroke46 = piePlot34.getBaseSectionOutlineStroke();
        piePlot1.setOutlineStroke(stroke46);
        piePlot1.setShadowYOffset((double) 0.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        java.awt.Paint paint8 = null;
        piePlot5.setSectionPaint((java.lang.Comparable) "", paint8);
        java.awt.Stroke stroke11 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot1.setLabelOutlineStroke(stroke11);
        boolean boolean13 = piePlot1.getSectionOutlinesVisible();
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 1);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint17 = piePlot1.getNoDataMessagePaint();
        double double18 = piePlot1.getShadowXOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        boolean boolean7 = piePlot1.isCircular();
        piePlot1.setIgnoreNullValues(false);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot1.getDataset();
        piePlot1.zoom(0.14d);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        java.lang.Comparable comparable18 = piePlot14.getSectionKey((int) '#');
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        piePlot20.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint26 = piePlot20.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot20.setForegroundAlpha((float) '#');
        java.awt.Paint paint30 = piePlot20.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot14.setBaseSectionOutlinePaint(paint30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = piePlot14.getDatasetGroup();
        java.lang.String str33 = piePlot14.getNoDataMessage();
        piePlot14.setLabelLinkMargin((double) (byte) 1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot14.notifyListeners(plotChangeEvent36);
        piePlot14.setPieIndex((int) (short) 100);
        java.awt.Paint paint40 = null;
        piePlot14.setLabelOutlinePaint(paint40);
        java.awt.Font font42 = piePlot14.getLabelFont();
        piePlot1.setNoDataMessageFont(font42);
        piePlot1.setShadowXOffset((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 35 + "'", comparable18, 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(font42);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        double double7 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator5);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = piePlot1.getLegendItems();
        org.jfree.chart.util.Rotation rotation8 = piePlot1.getDirection();
        java.awt.Paint paint10 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1L);
        java.lang.Comparable comparable12 = piePlot1.getSectionKey(35);
        java.awt.Paint paint13 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 35 + "'", comparable12, 35);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        java.awt.Stroke stroke10 = piePlot8.getBaseSectionOutlineStroke();
        java.awt.Paint paint13 = piePlot8.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        piePlot1.setLabelLinkPaint(paint13);
        double double15 = piePlot1.getMinimumArcAngleToDraw();
        float float16 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getInteriorGap();
        piePlot18.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint24 = piePlot18.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot18.setURLGenerator(pieURLGenerator25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        piePlot28.drawBackgroundImage(graphics2D29, rectangle2D30);
        piePlot28.setShadowYOffset((double) (byte) 1);
        boolean boolean34 = piePlot28.isCircular();
        java.lang.Comparable comparable36 = piePlot28.getSectionKey(10);
        boolean boolean37 = piePlot28.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        double double41 = piePlot40.getInteriorGap();
        java.awt.Stroke stroke42 = piePlot40.getBaseSectionOutlineStroke();
        java.awt.Paint paint45 = piePlot40.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        double double49 = piePlot48.getInteriorGap();
        piePlot48.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint54 = piePlot48.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = null;
        piePlot48.setURLGenerator(pieURLGenerator55);
        boolean boolean57 = piePlot48.getSimpleLabels();
        java.awt.Paint paint59 = piePlot48.lookupSectionOutlinePaint((java.lang.Comparable) (short) 10);
        piePlot40.setSectionPaint((java.lang.Comparable) (byte) 100, paint59);
        piePlot28.setSectionPaint((java.lang.Comparable) (-1L), paint59);
        piePlot18.setLabelShadowPaint(paint59);
        piePlot1.setLabelPaint(paint59);
        java.lang.Comparable comparable65 = piePlot1.getSectionKey((int) (byte) 0);
        java.awt.Paint paint66 = null;
        piePlot1.setLabelShadowPaint(paint66);
        java.awt.Paint paint68 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 10 + "'", comparable36, 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.08d + "'", double41 == 0.08d);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.08d + "'", double49 == 0.08d);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertEquals("'" + comparable65 + "' != '" + 0 + "'", comparable65, 0);
        org.junit.Assert.assertNotNull(paint68);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        piePlot1.setForegroundAlpha((float) 10L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick((-1), (-1), plotRenderingInfo14);
        org.jfree.chart.plot.Plot plot16 = piePlot1.getParent();
        java.awt.Paint paint17 = null;
        piePlot1.setShadowPaint(paint17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        java.awt.Paint paint23 = null;
        piePlot20.setSectionPaint((java.lang.Comparable) "", paint23);
        java.awt.Paint paint25 = piePlot20.getLabelPaint();
        boolean boolean26 = piePlot20.isCircular();
        java.awt.Paint paint27 = piePlot20.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot29.getDrawingSupplier();
        java.awt.Font font32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot29.setNoDataMessageFont(font32);
        java.awt.Paint paint35 = piePlot29.lookupSectionPaint((java.lang.Comparable) 100);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getMaximumLabelWidth();
        java.awt.Paint paint39 = piePlot37.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot37.getLabelDistributor();
        piePlot37.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable44 = piePlot37.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke47 = piePlot37.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        piePlot37.setShadowYOffset((double) 100.0f);
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        java.awt.Stroke stroke52 = null;
        piePlot51.setLabelOutlineStroke(stroke52);
        piePlot51.setBackgroundImageAlignment((int) '4');
        java.awt.Font font56 = piePlot51.getNoDataMessageFont();
        piePlot37.setNoDataMessageFont(font56);
        piePlot29.setLabelFont(font56);
        piePlot20.setNoDataMessageFont(font56);
        piePlot1.setNoDataMessageFont(font56);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier31);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.14d + "'", double38 == 0.14d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor40);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 1 + "'", comparable44, 1);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(font56);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        java.awt.Paint paint8 = null;
        piePlot5.setSectionPaint((java.lang.Comparable) "", paint8);
        java.awt.Stroke stroke11 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot1.setLabelOutlineStroke(stroke11);
        piePlot1.setLabelLinkMargin((double) (byte) 1);
        org.jfree.chart.plot.Plot plot15 = piePlot1.getParent();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getInteriorGap();
        java.awt.Paint paint20 = null;
        piePlot17.setSectionPaint((java.lang.Comparable) "", paint20);
        java.awt.Paint paint22 = piePlot17.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMaximumLabelWidth();
        java.awt.Paint paint26 = piePlot24.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot24.getLegendLabelGenerator();
        piePlot17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator27);
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator27);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.plot.PiePlotState piePlotState31 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord32 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D30, piePlotState31, pieLabelRecord32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator27);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setForegroundAlpha((float) '#');
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        piePlot1.markerChanged(markerChangeEvent10);
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = piePlot1.getLegendItems();
        java.awt.Stroke stroke15 = piePlot1.getLabelLinkStroke();
        piePlot1.setNoDataMessage("");
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getInteriorGap();
        java.awt.Stroke stroke21 = piePlot19.getBaseSectionOutlineStroke();
        java.awt.Paint paint24 = piePlot19.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getInteriorGap();
        java.awt.Paint paint29 = null;
        piePlot26.setSectionPaint((java.lang.Comparable) "", paint29);
        java.awt.Stroke stroke32 = piePlot26.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        piePlot34.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint40 = piePlot34.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot26.setOutlinePaint(paint40);
        piePlot19.setBackgroundPaint(paint40);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        double double45 = piePlot44.getInteriorGap();
        piePlot44.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint50 = piePlot44.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator51 = null;
        piePlot44.setURLGenerator(pieURLGenerator51);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getMaximumLabelWidth();
        java.awt.Paint paint56 = piePlot54.getLabelLinkPaint();
        piePlot44.setBaseSectionPaint(paint56);
        piePlot19.setBaseSectionPaint(paint56);
        org.jfree.data.general.PieDataset pieDataset60 = null;
        org.jfree.chart.plot.PiePlot piePlot61 = new org.jfree.chart.plot.PiePlot(pieDataset60);
        double double62 = piePlot61.getInteriorGap();
        piePlot61.setLabelGap((double) 10L);
        java.lang.Comparable comparable66 = piePlot61.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset67 = null;
        org.jfree.chart.plot.PiePlot piePlot68 = new org.jfree.chart.plot.PiePlot(pieDataset67);
        java.awt.Stroke stroke69 = null;
        piePlot68.setLabelOutlineStroke(stroke69);
        piePlot68.setStartAngle((double) (-1.0f));
        java.awt.Paint paint73 = piePlot68.getBaseSectionPaint();
        piePlot61.setBackgroundPaint(paint73);
        piePlot19.setSectionOutlinePaint((java.lang.Comparable) "hi!", paint73);
        piePlot19.setBackgroundAlpha(0.0f);
        java.awt.Paint paint78 = piePlot19.getLabelShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator79 = piePlot19.getLabelGenerator();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot19);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.08d + "'", double45 == 0.08d);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.14d + "'", double55 == 0.14d);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.08d + "'", double62 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable66 + "' != '" + 1 + "'", comparable66, 1);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator79);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint6 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Font font9 = piePlot1.getNoDataMessageFont();
        java.awt.Font font10 = piePlot1.getNoDataMessageFont();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        piePlot12.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot12.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getInteriorGap();
        java.awt.Stroke stroke21 = piePlot19.getBaseSectionOutlineStroke();
        java.awt.Paint paint24 = piePlot19.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getInteriorGap();
        java.awt.Paint paint29 = null;
        piePlot26.setSectionPaint((java.lang.Comparable) "", paint29);
        java.awt.Stroke stroke32 = piePlot26.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        piePlot34.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint40 = piePlot34.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot26.setOutlinePaint(paint40);
        piePlot19.setBackgroundPaint(paint40);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        double double45 = piePlot44.getInteriorGap();
        piePlot44.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint50 = piePlot44.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator51 = null;
        piePlot44.setURLGenerator(pieURLGenerator51);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getMaximumLabelWidth();
        java.awt.Paint paint56 = piePlot54.getLabelLinkPaint();
        piePlot44.setBaseSectionPaint(paint56);
        piePlot19.setBaseSectionPaint(paint56);
        piePlot12.setLabelShadowPaint(paint56);
        piePlot1.setLabelPaint(paint56);
        boolean boolean61 = piePlot1.getLabelLinksVisible();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor62 = piePlot1.getLabelDistributor();
        double double63 = piePlot1.getStartAngle();
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D69 = piePlot1.getArcBounds(rectangle2D64, rectangle2D65, (double) 100.0f, (double) ' ', 0.0d);
        java.lang.String str70 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08d + "'", double13 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.08d + "'", double45 == 0.08d);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.14d + "'", double55 == 0.14d);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNull(rectangle2D69);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        java.awt.Font font4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font4);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        piePlot1.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        piePlot1.markerChanged(markerChangeEvent11);
        java.awt.Stroke stroke13 = piePlot1.getOutlineStroke();
        java.awt.Font font14 = piePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.isCircular();
        java.awt.Paint paint6 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint7 = piePlot1.getOutlinePaint();
        piePlot1.setOutlineVisible(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setURLGenerator(pieURLGenerator10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot1.removeChangeListener(plotChangeListener12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        java.awt.Stroke stroke8 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getInteriorGap();
        piePlot10.setLabelGap((double) 10L);
        java.lang.Comparable comparable15 = piePlot10.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke18 = null;
        piePlot17.setLabelOutlineStroke(stroke18);
        piePlot17.setStartAngle((double) (-1.0f));
        java.awt.Paint paint22 = piePlot17.getBaseSectionPaint();
        piePlot10.setBackgroundPaint(paint22);
        piePlot10.setPieIndex(100);
        java.awt.Paint paint26 = piePlot10.getLabelBackgroundPaint();
        piePlot1.setBackgroundPaint(paint26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator8);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot1.getLegendLabelToolTipGenerator();
        float float11 = piePlot1.getForegroundAlpha();
        java.awt.Paint paint12 = piePlot1.getNoDataMessagePaint();
        boolean boolean13 = piePlot1.isCircular();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.lang.Comparable comparable6 = piePlot1.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        java.awt.Stroke stroke9 = null;
        piePlot8.setLabelOutlineStroke(stroke9);
        piePlot8.setStartAngle((double) (-1.0f));
        java.awt.Paint paint13 = piePlot8.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint13);
        piePlot1.setPieIndex(100);
        java.awt.Stroke stroke19 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, true);
        float float20 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getMaximumLabelWidth();
        java.awt.Paint paint24 = piePlot22.getLabelLinkPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = piePlot22.getToolTipGenerator();
        java.awt.Paint paint28 = piePlot22.lookupSectionPaint((java.lang.Comparable) (byte) 10, false);
        piePlot1.setLabelOutlinePaint(paint28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(pieToolTipGenerator25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        piePlot1.setOutlineVisible(false);
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        java.lang.Object obj10 = piePlot1.clone();
        piePlot1.setSectionOutlinesVisible(false);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMaximumLabelWidth();
        java.awt.Paint paint16 = piePlot14.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot14.getLabelDistributor();
        piePlot14.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable21 = piePlot14.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke24 = piePlot14.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot14.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = piePlot27.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot27.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getMaximumLabelWidth();
        java.awt.Paint paint35 = piePlot33.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getInteriorGap();
        piePlot37.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint43 = piePlot37.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot33.setNoDataMessagePaint(paint43);
        piePlot27.setSectionPaint((java.lang.Comparable) true, paint43);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = piePlot27.getLabelPadding();
        piePlot14.setInsets(rectangleInsets46, true);
        piePlot1.setInsets(rectangleInsets46);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Font font52 = piePlot1.getNoDataMessageFont();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator53 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1 + "'", comparable21, 1);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.14d + "'", double34 == 0.14d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.08d + "'", double38 == 0.08d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator53);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLabelGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot1.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot18.drawBackgroundImage(graphics2D19, rectangle2D20);
        piePlot18.setShadowYOffset((double) (byte) 1);
        boolean boolean24 = piePlot18.isCircular();
        java.lang.Comparable comparable26 = piePlot18.getSectionKey(10);
        double double27 = piePlot18.getMaximumLabelWidth();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot18);
        java.awt.Paint paint29 = piePlot18.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getInteriorGap();
        piePlot31.setLabelGap((double) 10L);
        java.lang.Comparable comparable36 = piePlot31.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke37 = piePlot31.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot39.getLabelDistributor();
        piePlot39.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup44 = piePlot39.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        double double47 = piePlot46.getInteriorGap();
        java.awt.Paint paint49 = null;
        piePlot46.setSectionPaint((java.lang.Comparable) "", paint49);
        java.awt.Paint paint51 = piePlot46.getLabelPaint();
        boolean boolean52 = piePlot46.isCircular();
        java.awt.Paint paint53 = piePlot46.getBaseSectionOutlinePaint();
        piePlot39.setLabelShadowPaint(paint53);
        piePlot31.setLabelOutlinePaint(paint53);
        java.awt.Paint paint56 = piePlot31.getLabelOutlinePaint();
        piePlot18.setShadowPaint(paint56);
        // The following exception was thrown during execution in test generation
        try {
            piePlot18.setInteriorGap((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10 + "'", comparable26, 10);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.08d + "'", double32 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 1 + "'", comparable36, 1);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.08d + "'", double40 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor41);
        org.junit.Assert.assertNull(datasetGroup44);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.08d + "'", double47 == 0.08d);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        piePlot1.addChangeListener(plotChangeListener5);
        java.awt.Paint paint8 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        piePlot1.addChangeListener(plotChangeListener9);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setBackgroundImageAlignment(35);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint16 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint17 = piePlot1.getBaseSectionOutlinePaint();
        java.awt.Paint paint18 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = piePlot20.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot20.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getMaximumLabelWidth();
        java.awt.Paint paint28 = piePlot26.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getInteriorGap();
        piePlot30.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint36 = piePlot30.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot26.setNoDataMessagePaint(paint36);
        piePlot20.setSectionPaint((java.lang.Comparable) true, paint36);
        double double39 = piePlot20.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        java.awt.Stroke stroke42 = null;
        piePlot41.setLabelOutlineStroke(stroke42);
        piePlot41.setBackgroundImageAlignment((int) '4');
        java.awt.Font font46 = piePlot41.getNoDataMessageFont();
        piePlot41.setBackgroundAlpha((float) (byte) 10);
        java.awt.Stroke stroke49 = piePlot41.getBaseSectionOutlineStroke();
        piePlot20.setLabelLinkStroke(stroke49);
        piePlot1.setLabelLinkStroke(stroke49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 90.0d + "'", double39 == 90.0d);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot5.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot5.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        piePlot15.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint21 = piePlot15.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot11.setNoDataMessagePaint(paint21);
        piePlot5.setSectionPaint((java.lang.Comparable) true, paint21);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot5.getLabelPadding();
        piePlot1.setInsets(rectangleInsets24);
        java.awt.Stroke stroke27 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.setForegroundAlpha((float) (short) 1);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMaximumLabelWidth();
        java.awt.Paint paint34 = piePlot32.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot32.getLabelDistributor();
        piePlot32.setMaximumLabelWidth(1.0d);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot39.getLegendLabelGenerator();
        piePlot32.setLegendLabelGenerator(pieSectionLabelGenerator40);
        boolean boolean42 = piePlot32.getSimpleLabels();
        piePlot32.setCircular(false, false);
        java.awt.Paint paint46 = piePlot32.getLabelPaint();
        piePlot1.setBackgroundPaint(paint46);
        piePlot1.setSectionOutlinesVisible(true);
        java.lang.String str50 = piePlot1.getNoDataMessage();
        double double51 = piePlot1.getShadowYOffset();
        piePlot1.setSimpleLabels(true);
        float float54 = piePlot1.getBackgroundAlpha();
        java.awt.Stroke stroke55 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNull(pieURLGenerator28);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor35);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.0d + "'", double51 == 4.0d);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(stroke55);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        piePlot5.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint11 = piePlot5.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setNoDataMessagePaint(paint11);
        double double13 = piePlot1.getLabelLinkMargin();
        boolean boolean14 = piePlot1.getIgnoreNullValues();
        double double15 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 10.0d, (double) (-1));
        java.awt.Paint paint19 = piePlot1.getShadowPaint();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setForegroundAlpha((float) '#');
        java.awt.Paint paint10 = null;
        piePlot1.setBackgroundPaint(paint10);
        piePlot1.setLabelLinksVisible(false);
        piePlot1.setBackgroundAlpha((float) 15);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot1.drawBackground(graphics2D16, rectangle2D17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator5);
        double double7 = piePlot1.getMaximumLabelWidth();
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        boolean boolean10 = piePlot1.getIgnoreNullValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setCircular(false, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot1.getInsets();
        double double17 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint18 = piePlot1.getBaseSectionPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        float float6 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot8.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getInteriorGap();
        java.awt.Paint paint15 = null;
        piePlot12.setSectionPaint((java.lang.Comparable) "", paint15);
        java.awt.Stroke stroke18 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        piePlot20.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint26 = piePlot20.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot12.setOutlinePaint(paint26);
        boolean boolean28 = piePlot8.equals((java.lang.Object) paint26);
        piePlot1.setBaseSectionOutlinePaint(paint26);
        piePlot1.zoom(0.025d);
        java.awt.Paint paint32 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        java.awt.Paint paint37 = null;
        piePlot34.setSectionPaint((java.lang.Comparable) "", paint37);
        java.awt.Paint paint39 = piePlot34.getLabelPaint();
        boolean boolean40 = piePlot34.isCircular();
        java.awt.Stroke stroke41 = piePlot34.getOutlineStroke();
        java.awt.Paint paint42 = piePlot34.getLabelLinkPaint();
        piePlot1.setBaseSectionPaint(paint42);
        java.awt.Paint paint45 = piePlot1.lookupSectionPaint((java.lang.Comparable) (-1));
        java.lang.Comparable comparable47 = piePlot1.getSectionKey(1);
        org.jfree.data.general.DatasetGroup datasetGroup48 = piePlot1.getDatasetGroup();
        double double49 = piePlot1.getShadowYOffset();
        java.awt.Paint paint51 = piePlot1.getSectionPaint((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08d + "'", double13 == 0.08d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 1 + "'", comparable47, 1);
        org.junit.Assert.assertNull(datasetGroup48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.0d + "'", double49 == 4.0d);
        org.junit.Assert.assertNull(paint51);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Image image10 = null;
        piePlot1.setBackgroundImage(image10);
        piePlot1.setShadowXOffset((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        java.awt.Stroke stroke16 = null;
        piePlot15.setLabelOutlineStroke(stroke16);
        piePlot15.setStartAngle((double) (-1.0f));
        float float20 = piePlot15.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = piePlot15.getLegendItems();
        java.awt.Paint paint22 = piePlot15.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMaximumLabelWidth();
        java.awt.Paint paint26 = piePlot24.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot24.getLabelDistributor();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint31 = piePlot24.lookupSectionPaint((java.lang.Comparable) 4.0d);
        piePlot15.setBaseSectionOutlinePaint(paint31);
        java.awt.Stroke stroke35 = piePlot15.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, false);
        piePlot1.setLabelOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        org.jfree.data.general.PieDataset pieDataset8 = piePlot1.getDataset();
        int int9 = piePlot1.getBackgroundImageAlignment();
        java.lang.Comparable comparable11 = piePlot1.getSectionKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(pieDataset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10 + "'", comparable11, 10);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator5);
        double double7 = piePlot1.getMaximumLabelWidth();
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        java.awt.Paint paint14 = null;
        piePlot11.setSectionPaint((java.lang.Comparable) "", paint14);
        org.jfree.data.general.PieDataset pieDataset16 = piePlot11.getDataset();
        java.awt.Stroke stroke17 = piePlot11.getLabelOutlineStroke();
        java.awt.Stroke stroke19 = piePlot11.getSectionOutlineStroke((java.lang.Comparable) "");
        java.awt.Paint paint20 = piePlot11.getLabelPaint();
        boolean boolean21 = piePlot1.equals((java.lang.Object) paint20);
        piePlot1.setLabelGap(0.14d);
        double double24 = piePlot1.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNull(pieDataset16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08d + "'", double24 == 0.08d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Font font9 = piePlot1.getNoDataMessageFont();
        boolean boolean10 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot1.getLabelGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setURLGenerator(pieURLGenerator12);
        piePlot1.setLabelGap((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        boolean boolean10 = piePlot1.getSimpleLabels();
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (short) 10);
        org.jfree.chart.plot.Plot plot13 = piePlot1.getParent();
        java.awt.Stroke stroke16 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.025d, true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot18.drawBackgroundImage(graphics2D19, rectangle2D20);
        piePlot18.setShadowYOffset((double) (byte) 1);
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot18.setBaseSectionOutlineStroke(stroke24);
        java.awt.Paint paint26 = piePlot18.getOutlinePaint();
        piePlot1.setBaseSectionOutlinePaint(paint26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getMaximumLabelWidth();
        java.awt.Paint paint31 = piePlot29.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getInteriorGap();
        piePlot33.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint39 = piePlot33.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot29.setNoDataMessagePaint(paint39);
        double double41 = piePlot29.getLabelLinkMargin();
        boolean boolean42 = piePlot29.getIgnoreNullValues();
        double double43 = piePlot29.getMaximumLabelWidth();
        double double44 = piePlot29.getMinimumArcAngleToDraw();
        piePlot29.setForegroundAlpha((float) '#');
        java.awt.Stroke stroke47 = piePlot29.getLabelLinkStroke();
        piePlot1.setOutlineStroke(stroke47);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = piePlot1.getToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.14d + "'", double30 == 0.14d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.025d + "'", double41 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.14d + "'", double43 == 0.14d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0E-5d + "'", double44 == 1.0E-5d);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNull(pieToolTipGenerator49);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMaximumLabelWidth();
        java.awt.Paint paint9 = piePlot7.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        piePlot11.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint17 = piePlot11.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setNoDataMessagePaint(paint17);
        piePlot1.setSectionPaint((java.lang.Comparable) true, paint17);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot1.getLabelPadding();
        piePlot1.setIgnoreNullValues(true);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        java.awt.Stroke stroke25 = null;
        piePlot24.setLabelOutlineStroke(stroke25);
        piePlot24.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot24.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo31);
        double double33 = piePlot24.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        java.awt.Stroke stroke36 = null;
        piePlot35.setLabelOutlineStroke(stroke36);
        piePlot35.setBackgroundImageAlignment((int) '4');
        java.awt.Paint paint42 = piePlot35.lookupSectionOutlinePaint((java.lang.Comparable) 0.5f, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        double double45 = piePlot44.getInteriorGap();
        java.awt.Paint paint47 = null;
        piePlot44.setSectionPaint((java.lang.Comparable) "", paint47);
        org.jfree.data.general.PieDataset pieDataset49 = piePlot44.getDataset();
        java.awt.Shape shape50 = piePlot44.getLegendItemShape();
        piePlot35.setLegendItemShape(shape50);
        piePlot24.setLegendItemShape(shape50);
        piePlot1.setLegendItemShape(shape50);
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        org.jfree.chart.plot.PiePlotState piePlotState57 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D54, (int) '#', rectangle2D56, piePlotState57, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.08d + "'", double33 == 0.08d);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.08d + "'", double45 == 0.08d);
        org.junit.Assert.assertNull(pieDataset49);
        org.junit.Assert.assertNotNull(shape50);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getInteriorGap();
        piePlot6.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint12 = piePlot6.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot6.setURLGenerator(pieURLGenerator13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMaximumLabelWidth();
        java.awt.Paint paint18 = piePlot16.getLabelLinkPaint();
        piePlot6.setBaseSectionPaint(paint18);
        piePlot1.setOutlinePaint(paint18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot1.axisChanged(axisChangeEvent21);
        java.awt.Paint paint23 = piePlot1.getLabelOutlinePaint();
        piePlot1.setShadowYOffset((double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        java.lang.Comparable comparable5 = piePlot1.getSectionKey((int) '#');
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setForegroundAlpha((float) '#');
        java.awt.Paint paint17 = piePlot7.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot1.setBaseSectionOutlinePaint(paint17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot1.getDatasetGroup();
        java.lang.String str20 = piePlot1.getNoDataMessage();
        java.lang.Object obj21 = piePlot1.clone();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 35 + "'", comparable5, 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.awt.Paint paint5 = piePlot1.getLabelShadowPaint();
        java.awt.Image image6 = null;
        piePlot1.setBackgroundImage(image6);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getInteriorGap();
        java.awt.Paint paint13 = null;
        piePlot10.setSectionPaint((java.lang.Comparable) "", paint13);
        java.awt.Paint paint15 = piePlot10.getLabelPaint();
        boolean boolean16 = piePlot10.isCircular();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMaximumLabelWidth();
        java.awt.Paint paint20 = piePlot18.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getInteriorGap();
        piePlot22.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint28 = piePlot22.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot18.setNoDataMessagePaint(paint28);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot18.getLabelGenerator();
        piePlot10.setLabelGenerator(pieSectionLabelGenerator30);
        java.awt.Paint paint33 = piePlot10.lookupSectionPaint((java.lang.Comparable) 10.0f);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) (byte) -1, paint33);
        java.awt.Paint paint36 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0d);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getMaximumLabelWidth();
        java.awt.Paint paint40 = piePlot38.getLabelLinkPaint();
        java.awt.Image image41 = null;
        piePlot38.setBackgroundImage(image41);
        piePlot38.setOutlineVisible(false);
        piePlot38.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot38.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor47);
        java.awt.Paint paint49 = piePlot1.getLabelBackgroundPaint();
        double double50 = piePlot1.getLabelGap();
        java.awt.Stroke stroke51 = piePlot1.getOutlineStroke();
        java.lang.Comparable comparable53 = piePlot1.getSectionKey((int) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset54 = piePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.08d + "'", double23 == 0.08d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.14d + "'", double39 == 0.14d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + 1 + "'", comparable53, 1);
        org.junit.Assert.assertNull(pieDataset54);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot1.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        piePlot16.setLabelGap((double) 10L);
        java.lang.Comparable comparable21 = piePlot16.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke22 = piePlot16.getLabelOutlineStroke();
        piePlot1.setOutlineStroke(stroke22);
        piePlot1.zoom((double) 0.0f);
        piePlot1.zoom((double) 100.0f);
        java.awt.Font font28 = piePlot1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1 + "'", comparable21, 1);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        piePlot1.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot1.getToolTipGenerator();
        piePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot1.getLabelGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(pieURLGenerator11);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMaximumLabelWidth();
        java.awt.Paint paint9 = piePlot7.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        piePlot11.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint17 = piePlot11.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setNoDataMessagePaint(paint17);
        piePlot1.setSectionPaint((java.lang.Comparable) true, paint17);
        java.awt.Paint paint22 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 32, false);
        piePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot5.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot5.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        piePlot15.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint21 = piePlot15.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot11.setNoDataMessagePaint(paint21);
        piePlot5.setSectionPaint((java.lang.Comparable) true, paint21);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot5.getLabelPadding();
        piePlot1.setInsets(rectangleInsets24);
        java.awt.Stroke stroke27 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.setForegroundAlpha((float) (short) 1);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMaximumLabelWidth();
        java.awt.Paint paint34 = piePlot32.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot32.getLabelDistributor();
        piePlot32.setMaximumLabelWidth(1.0d);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot39.getLegendLabelGenerator();
        piePlot32.setLegendLabelGenerator(pieSectionLabelGenerator40);
        boolean boolean42 = piePlot32.getSimpleLabels();
        piePlot32.setCircular(false, false);
        java.awt.Paint paint46 = piePlot32.getLabelPaint();
        piePlot1.setBackgroundPaint(paint46);
        org.jfree.chart.plot.Plot plot48 = piePlot1.getParent();
        piePlot1.setIgnoreNullValues(false);
        org.jfree.chart.LegendItemCollection legendItemCollection51 = piePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNull(pieURLGenerator28);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor35);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(plot48);
        org.junit.Assert.assertNotNull(legendItemCollection51);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        piePlot1.setBackgroundAlpha((float) (byte) 1);
        float float6 = piePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator4 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint5 = piePlot1.getOutlinePaint();
        piePlot1.setLabelGap((double) 100);
        boolean boolean8 = piePlot1.getIgnoreNullValues();
        piePlot1.setShadowXOffset((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieToolTipGenerator4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        piePlot1.setBackgroundAlpha((float) (byte) 1);
        piePlot1.setPieIndex(1);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot9.drawBackgroundImage(graphics2D10, rectangle2D11);
        piePlot9.setShadowYOffset((double) (byte) 1);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot9.setLabelPaint(paint15);
        float float17 = piePlot9.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot19.drawBackgroundImage(graphics2D20, rectangle2D21);
        piePlot19.setShadowXOffset((double) 1L);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot26.drawBackgroundImage(graphics2D27, rectangle2D28);
        piePlot26.setShadowYOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = piePlot33.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getInteriorGap();
        java.awt.Paint paint40 = null;
        piePlot37.setSectionPaint((java.lang.Comparable) "", paint40);
        java.awt.Stroke stroke43 = piePlot37.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot33.setLabelOutlineStroke(stroke43);
        piePlot26.setOutlineStroke(stroke43);
        piePlot19.setLabelLinkStroke(stroke43);
        piePlot9.setOutlineStroke(stroke43);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot9.getLabelDistributor();
        java.awt.Paint paint51 = piePlot9.lookupSectionOutlinePaint((java.lang.Comparable) (short) 0, false);
        piePlot1.setOutlinePaint(paint51);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.08d + "'", double38 == 0.08d);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor48);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Font font9 = piePlot1.getNoDataMessageFont();
        boolean boolean10 = piePlot1.getIgnoreZeroValues();
        java.awt.Stroke stroke11 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint14 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot1.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        piePlot16.setLabelGap((double) 10L);
        java.lang.Comparable comparable21 = piePlot16.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke22 = piePlot16.getLabelOutlineStroke();
        piePlot1.setOutlineStroke(stroke22);
        piePlot1.zoom((double) 0.0f);
        boolean boolean26 = piePlot1.isOutlineVisible();
        java.awt.Paint paint27 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1 + "'", comparable21, 1);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator5);
        double double7 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint8 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        piePlot1.removeChangeListener(plotChangeListener9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        java.awt.Stroke stroke7 = null;
        piePlot6.setLabelOutlineStroke(stroke7);
        piePlot6.setStartAngle((double) (-1.0f));
        float float11 = piePlot6.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = piePlot13.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getInteriorGap();
        java.awt.Paint paint20 = null;
        piePlot17.setSectionPaint((java.lang.Comparable) "", paint20);
        java.awt.Stroke stroke23 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getInteriorGap();
        piePlot25.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint31 = piePlot25.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot17.setOutlinePaint(paint31);
        boolean boolean33 = piePlot13.equals((java.lang.Object) paint31);
        piePlot6.setBaseSectionOutlinePaint(paint31);
        piePlot6.zoom(0.025d);
        java.awt.Paint paint37 = piePlot6.getLabelBackgroundPaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 1.0f, paint37);
        piePlot1.setSectionOutlinesVisible(true);
        java.awt.Paint paint41 = piePlot1.getBackgroundPaint();
        java.awt.Shape shape42 = piePlot1.getLegendItemShape();
        piePlot1.setBackgroundAlpha((float) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(shape42);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        java.awt.Font font4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font4);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100);
        java.awt.Image image8 = piePlot1.getBackgroundImage();
        java.awt.Paint paint10 = piePlot1.lookupSectionPaint((java.lang.Comparable) 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot1.setLabelPaint(paint7);
        float float9 = piePlot1.getBackgroundAlpha();
        piePlot1.setCircular(true, true);
        java.awt.Paint paint13 = piePlot1.getLabelPaint();
        org.jfree.chart.plot.Plot plot14 = piePlot1.getRootPlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMaximumLabelWidth();
        java.awt.Paint paint18 = piePlot16.getLabelLinkPaint();
        java.awt.Image image19 = null;
        piePlot16.setBackgroundImage(image19);
        piePlot16.setOutlineVisible(false);
        piePlot16.setBackgroundImageAlignment((int) (byte) 1);
        boolean boolean25 = piePlot16.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMaximumLabelWidth();
        java.awt.Paint paint29 = piePlot27.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getInteriorGap();
        piePlot31.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint37 = piePlot31.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot27.setNoDataMessagePaint(paint37);
        double double39 = piePlot27.getLabelLinkMargin();
        boolean boolean40 = piePlot27.getIgnoreNullValues();
        double double41 = piePlot27.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        double double44 = piePlot43.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = piePlot43.getDrawingSupplier();
        piePlot27.setDrawingSupplier(drawingSupplier45);
        piePlot16.setDrawingSupplier(drawingSupplier45);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        java.awt.Stroke stroke50 = null;
        piePlot49.setLabelOutlineStroke(stroke50);
        piePlot49.setStartAngle((double) (-1.0f));
        float float54 = piePlot49.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection55 = piePlot49.getLegendItems();
        java.awt.Paint paint56 = piePlot49.getBackgroundPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator57 = piePlot49.getLabelGenerator();
        java.awt.Paint paint58 = piePlot49.getBaseSectionOutlinePaint();
        org.jfree.chart.util.Rotation rotation59 = piePlot49.getDirection();
        piePlot16.setDirection(rotation59);
        piePlot1.setDirection(rotation59);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.08d + "'", double32 == 0.08d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.025d + "'", double39 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.14d + "'", double41 == 0.14d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.08d + "'", double44 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier45);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(rotation59);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot7.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot7.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets10);
        java.awt.Paint paint12 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot1.setLabelLinkPaint(paint12);
        java.awt.Paint paint14 = null;
        piePlot1.setBackgroundPaint(paint14);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        java.awt.Paint paint8 = null;
        piePlot5.setSectionPaint((java.lang.Comparable) "", paint8);
        java.awt.Stroke stroke11 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getInteriorGap();
        piePlot13.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint19 = piePlot13.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot5.setOutlinePaint(paint19);
        boolean boolean21 = piePlot1.equals((java.lang.Object) paint19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot1.setURLGenerator(pieURLGenerator22);
        double double24 = piePlot1.getShadowXOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot1.setSimpleLabelOffset(rectangleInsets25);
        piePlot1.setLabelLinksVisible(true);
        int int29 = piePlot1.getPieIndex();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator30);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        piePlot5.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint11 = piePlot5.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setNoDataMessagePaint(paint11);
        double double13 = piePlot1.getLabelLinkMargin();
        boolean boolean14 = piePlot1.getIgnoreNullValues();
        double double15 = piePlot1.getMaximumLabelWidth();
        double double16 = piePlot1.getShadowXOffset();
        boolean boolean17 = piePlot1.isSubplot();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getInteriorGap();
        java.awt.Paint paint21 = piePlot19.getNoDataMessagePaint();
        java.awt.Paint paint22 = piePlot19.getBaseSectionPaint();
        piePlot1.setLabelShadowPaint(paint22);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0.14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        float float6 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot8.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getInteriorGap();
        java.awt.Paint paint15 = null;
        piePlot12.setSectionPaint((java.lang.Comparable) "", paint15);
        java.awt.Stroke stroke18 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        piePlot20.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint26 = piePlot20.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot12.setOutlinePaint(paint26);
        boolean boolean28 = piePlot8.equals((java.lang.Object) paint26);
        piePlot1.setBaseSectionOutlinePaint(paint26);
        piePlot1.zoom(0.025d);
        java.awt.Paint paint32 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        java.awt.Paint paint37 = null;
        piePlot34.setSectionPaint((java.lang.Comparable) "", paint37);
        java.awt.Paint paint39 = piePlot34.getLabelPaint();
        boolean boolean40 = piePlot34.isCircular();
        java.awt.Stroke stroke41 = piePlot34.getOutlineStroke();
        java.awt.Paint paint42 = piePlot34.getLabelLinkPaint();
        piePlot1.setBaseSectionPaint(paint42);
        java.awt.Paint paint45 = piePlot1.lookupSectionPaint((java.lang.Comparable) (-1));
        java.lang.Comparable comparable47 = piePlot1.getSectionKey(1);
        java.awt.Font font48 = piePlot1.getNoDataMessageFont();
        boolean boolean49 = piePlot1.isCircular();
        org.jfree.data.KeyedValues keyedValues50 = null;
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        java.awt.geom.Rectangle2D rectangle2D53 = null;
        org.jfree.chart.plot.PiePlotState piePlotState55 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues50, graphics2D51, rectangle2D52, rectangle2D53, (float) (byte) 0, piePlotState55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08d + "'", double13 == 0.08d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 1 + "'", comparable47, 1);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo8);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        piePlot1.markerChanged(markerChangeEvent12);
        double double14 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = piePlot1.getPlotType();
// flaky "2) test2590(org.jfree.chart.plot.RegressionTest5)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getInteriorGap();
        piePlot6.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint12 = piePlot6.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot6.setForegroundAlpha((float) '#');
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        piePlot6.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = piePlot6.getLabelLinkPaint();
        piePlot1.setLabelLinkPaint(paint17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getMaximumLabelWidth();
        java.awt.Paint paint22 = piePlot20.getLabelLinkPaint();
        java.awt.Image image23 = null;
        piePlot20.setBackgroundImage(image23);
        piePlot20.setOutlineVisible(false);
        piePlot20.setBackgroundImageAlignment((int) (byte) 1);
        boolean boolean29 = piePlot20.isOutlineVisible();
        float float30 = piePlot20.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot20.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setNoDataMessage("");
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot7.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Stroke stroke19 = piePlot7.getBaseSectionOutlineStroke();
        piePlot1.setOutlineStroke(stroke19);
        piePlot1.setPieIndex((int) (short) 10);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        java.awt.Stroke stroke25 = null;
        piePlot24.setLabelOutlineStroke(stroke25);
        piePlot24.setStartAngle((double) (-1.0f));
        float float29 = piePlot24.getBackgroundAlpha();
        piePlot24.setBackgroundImageAlpha((float) (short) 0);
        piePlot24.setIgnoreNullValues(false);
        double double34 = piePlot24.getInteriorGap();
        java.awt.Paint paint35 = piePlot24.getShadowPaint();
        piePlot1.setShadowPaint(paint35);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = piePlot38.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot38.getSimpleLabelOffset();
        boolean boolean42 = piePlot38.isCircular();
        java.awt.Paint paint43 = piePlot38.getBaseSectionPaint();
        float float44 = piePlot38.getForegroundAlpha();
        java.awt.Paint paint45 = piePlot38.getShadowPaint();
        java.awt.Paint paint46 = piePlot38.getBackgroundPaint();
        java.awt.Font font47 = piePlot38.getLabelFont();
        piePlot1.setNoDataMessageFont(font47);
        java.awt.Paint paint49 = piePlot1.getLabelShadowPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        piePlot1.removeChangeListener(plotChangeListener50);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.08d + "'", double39 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier40);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setCircular(false, true);
        org.jfree.chart.plot.Plot plot16 = piePlot1.getParent();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot18.drawBackgroundImage(graphics2D19, rectangle2D20);
        piePlot18.setShadowYOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getInteriorGap();
        java.awt.Stroke stroke27 = piePlot25.getBaseSectionOutlineStroke();
        java.awt.Paint paint30 = piePlot25.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        piePlot18.setLabelLinkPaint(paint30);
        double double32 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.Plot plot33 = piePlot18.getRootPlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot18.getLegendLabelToolTipGenerator();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        double double37 = piePlot36.getMaximumLabelWidth();
        java.awt.Paint paint38 = piePlot36.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot36.getLabelDistributor();
        piePlot36.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable43 = piePlot36.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke46 = piePlot36.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator47 = piePlot36.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        double double50 = piePlot49.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot49.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot49.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMaximumLabelWidth();
        java.awt.Paint paint57 = piePlot55.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        double double60 = piePlot59.getInteriorGap();
        piePlot59.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint65 = piePlot59.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot55.setNoDataMessagePaint(paint65);
        piePlot49.setSectionPaint((java.lang.Comparable) true, paint65);
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot49.getLabelPadding();
        piePlot36.setInsets(rectangleInsets68, true);
        piePlot18.setInsets(rectangleInsets68);
        piePlot1.setSimpleLabelOffset(rectangleInsets68);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator73 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator73);
        piePlot1.setStartAngle(90.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.14d + "'", double37 == 0.14d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor39);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 1 + "'", comparable43, 1);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.08d + "'", double50 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier51);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.14d + "'", double56 == 0.14d);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.08d + "'", double60 == 0.08d);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(rectangleInsets68);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        float float6 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot8.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getInteriorGap();
        java.awt.Paint paint15 = null;
        piePlot12.setSectionPaint((java.lang.Comparable) "", paint15);
        java.awt.Stroke stroke18 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        piePlot20.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint26 = piePlot20.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot12.setOutlinePaint(paint26);
        boolean boolean28 = piePlot8.equals((java.lang.Object) paint26);
        piePlot1.setBaseSectionOutlinePaint(paint26);
        piePlot1.zoom(0.025d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot1.getURLGenerator();
        java.awt.Paint paint33 = piePlot1.getBaseSectionPaint();
        float float34 = piePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08d + "'", double13 == 0.08d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(pieURLGenerator32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        piePlot11.setLabelGap((double) 10L);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        piePlot16.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint22 = piePlot16.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot16.setURLGenerator(pieURLGenerator23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getMaximumLabelWidth();
        java.awt.Paint paint28 = piePlot26.getLabelLinkPaint();
        piePlot16.setBaseSectionPaint(paint28);
        piePlot11.setOutlinePaint(paint28);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot1.getLegendLabelToolTipGenerator();
        piePlot1.setIgnoreZeroValues(true);
        java.awt.Paint paint36 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieSectionLabelGenerator32);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        java.awt.Stroke stroke10 = piePlot8.getBaseSectionOutlineStroke();
        java.awt.Paint paint13 = piePlot8.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        piePlot1.setLabelLinkPaint(paint13);
        double double15 = piePlot1.getMinimumArcAngleToDraw();
        float float16 = piePlot1.getBackgroundImageAlpha();
        java.awt.Shape shape17 = piePlot1.getLegendItemShape();
        piePlot1.setCircular(false, true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setBackgroundImageAlignment((int) '4');
        java.awt.Paint paint8 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0.5f, false);
        java.awt.Paint paint9 = piePlot1.getLabelShadowPaint();
        java.awt.Stroke stroke10 = piePlot1.getOutlineStroke();
        double double11 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setIgnoreNullValues(true);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot16.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        piePlot16.removeChangeListener(plotChangeListener19);
        boolean boolean21 = piePlot16.getIgnoreZeroValues();
        java.awt.Paint paint23 = piePlot16.lookupSectionOutlinePaint((java.lang.Comparable) 1);
        java.awt.Paint paint24 = piePlot16.getLabelLinkPaint();
        piePlot1.setSectionPaint((java.lang.Comparable) 100.0f, paint24);
        java.awt.Paint paint28 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100.0d, false);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PiePlotState piePlotState32 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D29, (int) '#', rectangle2D31, piePlotState32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Image image10 = piePlot1.getBackgroundImage();
        float float11 = piePlot1.getBackgroundAlpha();
        boolean boolean12 = piePlot1.getLabelLinksVisible();
        boolean boolean13 = piePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Image image10 = null;
        piePlot1.setBackgroundImage(image10);
        piePlot1.setBackgroundAlpha((float) 10);
        double double14 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot16.getDrawingSupplier();
        java.awt.Font font19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot16.setNoDataMessageFont(font19);
        java.awt.Paint paint22 = piePlot16.lookupSectionPaint((java.lang.Comparable) 100);
        piePlot16.setLabelLinksVisible(false);
        java.awt.Paint paint25 = piePlot16.getLabelShadowPaint();
        piePlot1.setBackgroundPaint(paint25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        piePlot28.drawBackgroundImage(graphics2D29, rectangle2D30);
        piePlot28.setShadowYOffset((double) (byte) 1);
        java.awt.Stroke stroke34 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot28.setBaseSectionOutlineStroke(stroke34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getInteriorGap();
        piePlot37.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint43 = piePlot37.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = null;
        piePlot37.setURLGenerator(pieURLGenerator44);
        boolean boolean46 = piePlot37.getSimpleLabels();
        piePlot37.setBackgroundAlpha(0.0f);
        piePlot37.zoom((double) 100);
        java.awt.Stroke stroke51 = piePlot37.getLabelOutlineStroke();
        piePlot28.setLabelOutlineStroke(stroke51);
        double double53 = piePlot28.getShadowYOffset();
        java.awt.Paint paint54 = piePlot28.getNoDataMessagePaint();
        piePlot28.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = piePlot28.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.08d + "'", double38 == 0.08d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(rectangleInsets57);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getMaximumLabelWidth();
        java.awt.Paint paint10 = piePlot8.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot8.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        piePlot1.setNoDataMessage("");
        java.awt.Paint paint16 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "");
        java.lang.String str17 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setCircular(false, true);
        org.jfree.chart.plot.Plot plot16 = piePlot1.getParent();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot18.drawBackgroundImage(graphics2D19, rectangle2D20);
        piePlot18.setShadowYOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getInteriorGap();
        java.awt.Stroke stroke27 = piePlot25.getBaseSectionOutlineStroke();
        java.awt.Paint paint30 = piePlot25.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        piePlot18.setLabelLinkPaint(paint30);
        double double32 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.Plot plot33 = piePlot18.getRootPlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot18.getLegendLabelToolTipGenerator();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        double double37 = piePlot36.getMaximumLabelWidth();
        java.awt.Paint paint38 = piePlot36.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot36.getLabelDistributor();
        piePlot36.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable43 = piePlot36.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke46 = piePlot36.lookupSectionOutlineStroke((java.lang.Comparable) (byte) -1, false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator47 = piePlot36.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        double double50 = piePlot49.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot49.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot49.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMaximumLabelWidth();
        java.awt.Paint paint57 = piePlot55.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        double double60 = piePlot59.getInteriorGap();
        piePlot59.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint65 = piePlot59.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot55.setNoDataMessagePaint(paint65);
        piePlot49.setSectionPaint((java.lang.Comparable) true, paint65);
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot49.getLabelPadding();
        piePlot36.setInsets(rectangleInsets68, true);
        piePlot18.setInsets(rectangleInsets68);
        piePlot1.setSimpleLabelOffset(rectangleInsets68);
        java.awt.Font font73 = piePlot1.getLabelFont();
        java.awt.Paint paint74 = piePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.14d + "'", double37 == 0.14d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor39);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 1 + "'", comparable43, 1);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.08d + "'", double50 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier51);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.14d + "'", double56 == 0.14d);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.08d + "'", double60 == 0.08d);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(rectangleInsets68);
        org.junit.Assert.assertNotNull(font73);
        org.junit.Assert.assertNotNull(paint74);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        org.jfree.data.general.PieDataset pieDataset6 = piePlot1.getDataset();
        java.awt.Stroke stroke7 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke9 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) "");
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getInteriorGap();
        java.awt.Stroke stroke13 = piePlot11.getBaseSectionOutlineStroke();
        java.awt.Paint paint16 = piePlot11.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        java.awt.Paint paint18 = piePlot11.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Font font19 = piePlot11.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot1.getLabelPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot1.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNull(pieDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot8.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator9);
        boolean boolean11 = piePlot1.getSimpleLabels();
        piePlot1.setCircular(false, false);
        java.awt.Paint paint15 = piePlot1.getLabelPaint();
        piePlot1.zoom((double) 0.5f);
        double double18 = piePlot1.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        piePlot5.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint11 = piePlot5.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setNoDataMessagePaint(paint11);
        double double13 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        java.awt.Paint paint18 = null;
        piePlot15.setSectionPaint((java.lang.Comparable) "", paint18);
        org.jfree.data.general.PieDataset pieDataset20 = piePlot15.getDataset();
        java.awt.Stroke stroke21 = piePlot15.getLabelOutlineStroke();
        java.awt.Stroke stroke23 = piePlot15.getSectionOutlineStroke((java.lang.Comparable) "");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        piePlot15.markerChanged(markerChangeEvent24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = piePlot27.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot27.getSimpleLabelOffset();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getInteriorGap();
        piePlot33.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint39 = piePlot33.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot27.setNoDataMessagePaint(paint39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getInteriorGap();
        piePlot42.setLabelGap((double) 10L);
        java.lang.Comparable comparable47 = piePlot42.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke48 = piePlot42.getLabelOutlineStroke();
        piePlot27.setOutlineStroke(stroke48);
        java.awt.Paint paint52 = piePlot27.lookupSectionPaint((java.lang.Comparable) 0.4d, false);
        piePlot15.setLabelLinkPaint(paint52);
        piePlot1.setLabelPaint(paint52);
        piePlot1.setStartAngle(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNull(pieDataset20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 1 + "'", comparable47, 1);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        java.lang.Comparable comparable5 = piePlot1.getSectionKey((int) '#');
        piePlot1.setShadowXOffset((double) 10);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot9.drawBackgroundImage(graphics2D10, rectangle2D11);
        piePlot9.setShadowYOffset((double) (byte) 1);
        boolean boolean15 = piePlot9.isCircular();
        java.lang.Comparable comparable17 = piePlot9.getSectionKey(10);
        double double18 = piePlot9.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        java.awt.Paint paint23 = null;
        piePlot20.setSectionPaint((java.lang.Comparable) "", paint23);
        java.awt.Stroke stroke26 = piePlot20.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot9.setLabelOutlineStroke(stroke26);
        piePlot1.setBaseSectionOutlineStroke(stroke26);
        java.awt.Paint paint29 = piePlot1.getBaseSectionOutlinePaint();
        piePlot1.setCircular(true);
        boolean boolean32 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 35 + "'", comparable5, 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10 + "'", comparable17, 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setForegroundAlpha((float) '#');
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot11.getLabelDistributor();
        piePlot11.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable18 = piePlot11.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke19 = piePlot11.getOutlineStroke();
        java.awt.Image image20 = piePlot11.getBackgroundImage();
        float float21 = piePlot11.getBackgroundAlpha();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot11);
        java.awt.Image image23 = piePlot11.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        java.awt.Stroke stroke26 = null;
        piePlot25.setLabelOutlineStroke(stroke26);
        java.awt.Paint paint28 = piePlot25.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot30.getLabelDistributor();
        piePlot30.setBackgroundAlpha((float) (byte) 1);
        java.awt.Stroke stroke35 = piePlot30.getLabelOutlineStroke();
        piePlot25.setLabelLinkStroke(stroke35);
        int int37 = piePlot25.getPieIndex();
        java.awt.Paint paint38 = piePlot25.getLabelShadowPaint();
        piePlot11.setBaseSectionPaint(paint38);
        piePlot11.setBackgroundImageAlpha((float) 0);
        float float42 = piePlot11.getBackgroundAlpha();
        org.jfree.chart.util.Rotation rotation43 = piePlot11.getDirection();
        piePlot11.setExplodePercent((java.lang.Comparable) '#', 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(rotation43);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getInteriorGap();
        piePlot9.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint15 = piePlot9.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setLabelLinkPaint(paint15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot1.removeChangeListener(plotChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot1.addChangeListener(plotChangeListener4);
        piePlot1.setLabelLinkMargin((double) 0);
        double double8 = piePlot1.getShadowXOffset();
        piePlot1.zoom((double) '#');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        boolean boolean5 = piePlot1.getSimpleLabels();
        double double6 = piePlot1.getStartAngle();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLabelGenerator();
        boolean boolean8 = piePlot1.getLabelLinksVisible();
        boolean boolean9 = piePlot1.isCircular();
        double double10 = piePlot1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setBackgroundImageAlignment(35);
        java.awt.Image image15 = null;
        piePlot1.setBackgroundImage(image15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        piePlot1.setLabelLinksVisible(false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        piePlot1.setOutlineVisible(false);
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getInteriorGap();
        piePlot14.setLabelGap((double) 10L);
        java.lang.Comparable comparable19 = piePlot14.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        java.awt.Stroke stroke22 = null;
        piePlot21.setLabelOutlineStroke(stroke22);
        piePlot21.setStartAngle((double) (-1.0f));
        java.awt.Paint paint26 = piePlot21.getBaseSectionPaint();
        piePlot14.setBackgroundPaint(paint26);
        java.awt.Paint paint29 = piePlot14.getSectionPaint((java.lang.Comparable) 35);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getInteriorGap();
        piePlot31.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint37 = piePlot31.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot31.setForegroundAlpha((float) '#');
        java.awt.Paint paint41 = piePlot31.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot14.setShadowPaint(paint41);
        java.awt.Paint paint43 = piePlot14.getLabelOutlinePaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 1, paint43);
        java.awt.Graphics2D graphics2D45 = null;
        java.util.List list46 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.plot.PiePlotState piePlotState50 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D45, list46, (double) 32, rectangle2D48, rectangle2D49, piePlotState50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1 + "'", comparable19, 1);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.08d + "'", double32 == 0.08d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        boolean boolean7 = piePlot1.isCircular();
        java.lang.Comparable comparable9 = piePlot1.getSectionKey(10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setURLGenerator(pieURLGenerator10);
        java.awt.Paint paint12 = piePlot1.getLabelOutlinePaint();
        piePlot1.setExplodePercent((java.lang.Comparable) '4', 0.025d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot1.setURLGenerator(pieURLGenerator16);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        int int5 = piePlot1.getPieIndex();
        java.awt.Paint paint7 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        java.awt.Stroke stroke10 = null;
        piePlot9.setLabelOutlineStroke(stroke10);
        piePlot9.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot9.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo16);
        double double18 = piePlot9.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        piePlot20.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup25 = piePlot20.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getInteriorGap();
        java.awt.Stroke stroke29 = piePlot27.getBaseSectionOutlineStroke();
        java.awt.Paint paint32 = piePlot27.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getInteriorGap();
        java.awt.Paint paint37 = null;
        piePlot34.setSectionPaint((java.lang.Comparable) "", paint37);
        java.awt.Stroke stroke40 = piePlot34.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getInteriorGap();
        piePlot42.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint48 = piePlot42.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot34.setOutlinePaint(paint48);
        piePlot27.setBackgroundPaint(paint48);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        double double53 = piePlot52.getInteriorGap();
        piePlot52.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint58 = piePlot52.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator59 = null;
        piePlot52.setURLGenerator(pieURLGenerator59);
        org.jfree.data.general.PieDataset pieDataset61 = null;
        org.jfree.chart.plot.PiePlot piePlot62 = new org.jfree.chart.plot.PiePlot(pieDataset61);
        double double63 = piePlot62.getMaximumLabelWidth();
        java.awt.Paint paint64 = piePlot62.getLabelLinkPaint();
        piePlot52.setBaseSectionPaint(paint64);
        piePlot27.setBaseSectionPaint(paint64);
        piePlot20.setLabelShadowPaint(paint64);
        piePlot9.setLabelPaint(paint64);
        boolean boolean69 = piePlot9.getLabelLinksVisible();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor70 = piePlot9.getLabelDistributor();
        java.awt.Shape shape71 = piePlot9.getLegendItemShape();
        piePlot1.setLegendItemShape(shape71);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent73 = null;
        piePlot1.datasetChanged(datasetChangeEvent73);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.08d + "'", double53 == 0.08d);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.14d + "'", double63 == 0.14d);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor70);
        org.junit.Assert.assertNotNull(shape71);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowXOffset((double) 1L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Image image10 = null;
        piePlot1.setBackgroundImage(image10);
        piePlot1.setBackgroundAlpha((float) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint15 = piePlot1.getShadowPaint();
        piePlot1.zoom((double) '4');
        piePlot1.setShadowXOffset((double) 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.plot.Plot plot5 = piePlot1.getParent();
        java.awt.Stroke stroke6 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.plot.Plot plot7 = piePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint8 = piePlot1.lookupSectionPaint((java.lang.Comparable) 4.0d);
        double double9 = piePlot1.getStartAngle();
        java.awt.Paint paint10 = piePlot1.getOutlinePaint();
        piePlot1.setBackgroundImageAlignment(97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getInteriorGap();
        piePlot6.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint12 = piePlot6.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot6.setURLGenerator(pieURLGenerator13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMaximumLabelWidth();
        java.awt.Paint paint18 = piePlot16.getLabelLinkPaint();
        piePlot6.setBaseSectionPaint(paint18);
        piePlot1.setOutlinePaint(paint18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot1.axisChanged(axisChangeEvent21);
        java.awt.Paint paint23 = piePlot1.getLabelOutlinePaint();
        piePlot1.setOutlineVisible(false);
        float float26 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setForegroundAlpha((float) '#');
        java.awt.Paint paint10 = null;
        piePlot1.setBackgroundPaint(paint10);
        piePlot1.setLabelLinksVisible(false);
        double double14 = piePlot1.getShadowXOffset();
        java.awt.Paint paint16 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0L);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getMaximumLabelWidth();
        java.awt.Paint paint22 = piePlot20.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot20.getLabelDistributor();
        piePlot20.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable27 = piePlot20.getSectionKey((int) (short) 1);
        double double29 = piePlot20.getExplodePercent((java.lang.Comparable) (-1.0f));
        java.awt.Paint paint30 = piePlot20.getLabelOutlinePaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 32, paint30);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D32, rectangle2D33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 1 + "'", comparable27, 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator4 = piePlot1.getToolTipGenerator();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        double double6 = piePlot1.getShadowYOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = piePlot1.getPlotType();
// flaky "3) test2620(org.jfree.chart.plot.RegressionTest5)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieToolTipGenerator4);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        float float6 = piePlot1.getBackgroundAlpha();
        piePlot1.setBackgroundImageAlpha((float) (short) 0);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint12 = piePlot1.lookupSectionPaint((java.lang.Comparable) 90.0d, false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        piePlot1.axisChanged(axisChangeEvent13);
        double double15 = piePlot1.getInteriorGap();
        java.awt.Font font16 = piePlot1.getLabelFont();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot1.handleClick((int) (short) 1, 0, plotRenderingInfo7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        piePlot1.addChangeListener(plotChangeListener9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setForegroundAlpha((float) '#');
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        piePlot1.markerChanged(markerChangeEvent10);
        java.awt.Font font12 = piePlot1.getLabelFont();
        float float13 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        java.lang.Comparable comparable5 = piePlot1.getSectionKey((int) '#');
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setForegroundAlpha((float) '#');
        java.awt.Paint paint17 = piePlot7.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot1.setBaseSectionOutlinePaint(paint17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot1.getDatasetGroup();
        java.lang.String str20 = piePlot1.getNoDataMessage();
        piePlot1.setLabelLinkMargin((double) (byte) 1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        piePlot1.notifyListeners(plotChangeEvent23);
        piePlot1.setPieIndex((int) (short) 100);
        java.awt.Paint paint27 = null;
        piePlot1.setLabelOutlinePaint(paint27);
        java.awt.Stroke stroke29 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 35 + "'", comparable5, 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        java.lang.Comparable comparable5 = piePlot1.getSectionKey((int) '#');
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setForegroundAlpha((float) '#');
        java.awt.Paint paint17 = piePlot7.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot1.setBaseSectionOutlinePaint(paint17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot1.getLabelGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot1.getURLGenerator();
        double double21 = piePlot1.getLabelLinkMargin();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        piePlot1.addChangeListener(plotChangeListener22);
        boolean boolean24 = piePlot1.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D25 = null;
        java.util.List list26 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.plot.PiePlotState piePlotState30 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D25, list26, 0.0d, rectangle2D28, rectangle2D29, piePlotState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 35 + "'", comparable5, 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertNull(pieURLGenerator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.025d + "'", double21 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double8 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        piePlot1.setForegroundAlpha((float) (short) 1);
        piePlot1.setBackgroundImageAlignment(35);
        java.awt.Image image15 = null;
        piePlot1.setBackgroundImage(image15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator4 = piePlot1.getToolTipGenerator();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        piePlot1.setOutlineVisible(true);
        piePlot1.setPieIndex(15);
        float float10 = piePlot1.getBackgroundAlpha();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieToolTipGenerator4);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setBaseSectionOutlineStroke(stroke7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot1.getInsets();
        double double10 = piePlot1.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        java.awt.Stroke stroke13 = null;
        piePlot12.setLabelOutlineStroke(stroke13);
        piePlot12.setStartAngle((double) (-1.0f));
        float float17 = piePlot12.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = piePlot19.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getInteriorGap();
        java.awt.Paint paint26 = null;
        piePlot23.setSectionPaint((java.lang.Comparable) "", paint26);
        java.awt.Stroke stroke29 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getInteriorGap();
        piePlot31.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint37 = piePlot31.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot23.setOutlinePaint(paint37);
        boolean boolean39 = piePlot19.equals((java.lang.Object) paint37);
        piePlot12.setBaseSectionOutlinePaint(paint37);
        piePlot12.setShadowXOffset((double) 1L);
        piePlot12.setMaximumLabelWidth((double) 'a');
        java.awt.Paint paint46 = piePlot12.lookupSectionPaint((java.lang.Comparable) (byte) 100);
        float float47 = piePlot12.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = piePlot12.getSimpleLabelOffset();
        piePlot12.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.Rotation rotation51 = piePlot12.getDirection();
        piePlot1.setDirection(rotation51);
        java.awt.Stroke stroke54 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        piePlot1.setExplodePercent((java.lang.Comparable) (byte) 0, (double) 100L);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08d + "'", double24 == 0.08d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.08d + "'", double32 == 0.08d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.5f + "'", float47 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNull(stroke54);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator5);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = piePlot1.getLegendItems();
        org.jfree.chart.util.Rotation rotation8 = piePlot1.getDirection();
        piePlot1.setLabelGap((double) 'a');
        double double11 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot1.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getInteriorGap();
        java.awt.Paint paint17 = null;
        piePlot14.setSectionPaint((java.lang.Comparable) "", paint17);
        java.awt.Stroke stroke20 = piePlot14.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot14.getSimpleLabelOffset();
        piePlot1.setSimpleLabelOffset(rectangleInsets21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot7.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot7.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets10);
        double double12 = piePlot1.getShadowYOffset();
        org.jfree.chart.plot.Plot plot13 = piePlot1.getParent();
        piePlot1.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator16);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor3 = piePlot1.getLabelDistributor();
        java.lang.Comparable comparable5 = piePlot1.getSectionKey((int) '#');
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getInteriorGap();
        piePlot7.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint13 = piePlot7.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot7.setForegroundAlpha((float) '#');
        java.awt.Paint paint17 = piePlot7.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot1.setBaseSectionOutlinePaint(paint17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot1.getLabelGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot1.getURLGenerator();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot1.addChangeListener(plotChangeListener21);
        org.jfree.chart.plot.Plot plot23 = piePlot1.getParent();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        java.awt.Stroke stroke26 = null;
        piePlot25.setLabelOutlineStroke(stroke26);
        piePlot25.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        piePlot25.handleClick((int) 'a', (int) (short) 100, plotRenderingInfo32);
        double double34 = piePlot25.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        double double37 = piePlot36.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        piePlot36.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup41 = piePlot36.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        double double44 = piePlot43.getInteriorGap();
        java.awt.Stroke stroke45 = piePlot43.getBaseSectionOutlineStroke();
        java.awt.Paint paint48 = piePlot43.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        double double51 = piePlot50.getInteriorGap();
        java.awt.Paint paint53 = null;
        piePlot50.setSectionPaint((java.lang.Comparable) "", paint53);
        java.awt.Stroke stroke56 = piePlot50.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        double double59 = piePlot58.getInteriorGap();
        piePlot58.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint64 = piePlot58.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot50.setOutlinePaint(paint64);
        piePlot43.setBackgroundPaint(paint64);
        org.jfree.data.general.PieDataset pieDataset67 = null;
        org.jfree.chart.plot.PiePlot piePlot68 = new org.jfree.chart.plot.PiePlot(pieDataset67);
        double double69 = piePlot68.getInteriorGap();
        piePlot68.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint74 = piePlot68.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator75 = null;
        piePlot68.setURLGenerator(pieURLGenerator75);
        org.jfree.data.general.PieDataset pieDataset77 = null;
        org.jfree.chart.plot.PiePlot piePlot78 = new org.jfree.chart.plot.PiePlot(pieDataset77);
        double double79 = piePlot78.getMaximumLabelWidth();
        java.awt.Paint paint80 = piePlot78.getLabelLinkPaint();
        piePlot68.setBaseSectionPaint(paint80);
        piePlot43.setBaseSectionPaint(paint80);
        piePlot36.setLabelShadowPaint(paint80);
        piePlot25.setLabelPaint(paint80);
        org.jfree.chart.util.RectangleInsets rectangleInsets85 = piePlot25.getInsets();
        piePlot1.setLabelPadding(rectangleInsets85);
        boolean boolean87 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 35 + "'", comparable5, 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertNull(pieURLGenerator20);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.08d + "'", double37 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor38);
        org.junit.Assert.assertNull(datasetGroup41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.08d + "'", double44 == 0.08d);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.08d + "'", double51 == 0.08d);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.08d + "'", double59 == 0.08d);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.08d + "'", double69 == 0.08d);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.14d + "'", double79 == 0.14d);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(rectangleInsets85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot5.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot5.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        piePlot15.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint21 = piePlot15.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot11.setNoDataMessagePaint(paint21);
        piePlot5.setSectionPaint((java.lang.Comparable) true, paint21);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot5.getLabelPadding();
        piePlot1.setInsets(rectangleInsets24);
        java.awt.Stroke stroke27 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 15);
        boolean boolean28 = piePlot1.getSectionOutlinesVisible();
        java.awt.Shape shape29 = piePlot1.getLegendItemShape();
        double double30 = piePlot1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot8.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator9);
        boolean boolean11 = piePlot1.getSimpleLabels();
        piePlot1.setCircular(false, false);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelShadowPaint(paint15);
        java.awt.Stroke stroke17 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke18 = piePlot1.getLabelLinkStroke();
        java.awt.Paint paint19 = piePlot1.getLabelPaint();
        piePlot1.zoom(10.0d);
        piePlot1.setLabelGap((double) (short) -1);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getInteriorGap();
        java.awt.Paint paint28 = null;
        piePlot25.setSectionPaint((java.lang.Comparable) "", paint28);
        piePlot25.setLabelLinksVisible(false);
        piePlot25.setBackgroundAlpha(100.0f);
        java.awt.Paint paint34 = piePlot25.getShadowPaint();
        piePlot1.setBaseSectionPaint(paint34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setBaseSectionOutlineStroke(stroke7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getInteriorGap();
        piePlot10.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint16 = piePlot10.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot10.setURLGenerator(pieURLGenerator17);
        boolean boolean19 = piePlot10.getSimpleLabels();
        piePlot10.setBackgroundAlpha(0.0f);
        piePlot10.zoom((double) 100);
        java.awt.Stroke stroke24 = piePlot10.getLabelOutlineStroke();
        piePlot1.setLabelOutlineStroke(stroke24);
        double double26 = piePlot1.getShadowYOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot1.addChangeListener(plotChangeListener27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot1.getSimpleLabelOffset();
        piePlot1.setForegroundAlpha((-1.0f));
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator8);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getInteriorGap();
        java.awt.Paint paint16 = null;
        piePlot13.setSectionPaint((java.lang.Comparable) "", paint16);
        org.jfree.data.general.PieDataset pieDataset18 = piePlot13.getDataset();
        java.awt.Shape shape19 = piePlot13.getLegendItemShape();
        piePlot13.setNoDataMessage("Pie Plot");
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getInteriorGap();
        java.awt.Paint paint27 = null;
        piePlot24.setSectionPaint((java.lang.Comparable) "", paint27);
        java.awt.Paint paint29 = piePlot24.getLabelPaint();
        piePlot13.setSectionOutlinePaint((java.lang.Comparable) 10L, paint29);
        piePlot1.setOutlinePaint(paint29);
        piePlot1.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNull(pieDataset18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.08d + "'", double25 == 0.08d);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = piePlot1.getLegendLabelGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getMaximumLabelWidth();
        java.awt.Paint paint11 = piePlot9.getLabelLinkPaint();
        java.awt.Image image12 = null;
        piePlot9.setBackgroundImage(image12);
        piePlot9.setOutlineVisible(false);
        piePlot9.setBackgroundImageAlignment((int) (byte) 1);
        java.lang.Object obj18 = piePlot9.clone();
        piePlot9.setSectionOutlinesVisible(false);
        java.awt.Paint paint21 = piePlot9.getBaseSectionOutlinePaint();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot9);
        boolean boolean23 = piePlot9.isSubplot();
        piePlot9.setIgnoreNullValues(true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint6 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getInteriorGap();
        piePlot9.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint15 = piePlot9.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot9.setURLGenerator(pieURLGenerator16);
        boolean boolean18 = piePlot9.getSimpleLabels();
        java.awt.Paint paint20 = piePlot9.lookupSectionOutlinePaint((java.lang.Comparable) (short) 10);
        piePlot1.setSectionPaint((java.lang.Comparable) (byte) 100, paint20);
        java.awt.Paint paint24 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1L, false);
        boolean boolean25 = piePlot1.getSimpleLabels();
        boolean boolean26 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getInteriorGap();
        piePlot28.setMaximumLabelWidth((double) (byte) -1);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getInteriorGap();
        piePlot33.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint39 = piePlot33.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot33.setForegroundAlpha((float) '#');
        java.awt.Paint paint42 = null;
        piePlot33.setBackgroundPaint(paint42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        piePlot33.handleClick(0, (int) 'a', plotRenderingInfo46);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        java.awt.Stroke stroke50 = null;
        piePlot49.setLabelOutlineStroke(stroke50);
        piePlot49.setStartAngle((double) (-1.0f));
        float float54 = piePlot49.getBackgroundAlpha();
        piePlot49.setBackgroundImageAlpha((float) (short) 0);
        piePlot49.setIgnoreNullValues(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator59 = piePlot49.getLabelGenerator();
        org.jfree.chart.plot.Plot plot60 = piePlot49.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot49.getSimpleLabelOffset();
        piePlot33.setInsets(rectangleInsets61, true);
        piePlot28.setInsets(rectangleInsets61, true);
        org.jfree.chart.LegendItemCollection legendItemCollection66 = piePlot28.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot28.getInsets();
        piePlot1.setLabelPadding(rectangleInsets67);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.08d + "'", double29 == 0.08d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator59);
        org.junit.Assert.assertNull(plot60);
        org.junit.Assert.assertNotNull(rectangleInsets61);
        org.junit.Assert.assertNotNull(legendItemCollection66);
        org.junit.Assert.assertNotNull(rectangleInsets67);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        java.awt.Paint paint4 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getOutlinePaint();
        int int7 = piePlot1.getBackgroundImageAlignment();
        double double8 = piePlot1.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setForegroundAlpha((float) '#');
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot11.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot11.getLabelDistributor();
        piePlot11.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable18 = piePlot11.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke19 = piePlot11.getOutlineStroke();
        java.awt.Image image20 = piePlot11.getBackgroundImage();
        float float21 = piePlot11.getBackgroundAlpha();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot11);
        boolean boolean23 = piePlot11.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot11.getSimpleLabelOffset();
        java.awt.Image image25 = piePlot11.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNull(image25);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        java.awt.Paint paint3 = piePlot0.lookupSectionPaint((java.lang.Comparable) (byte) 1, true);
        java.awt.Paint paint4 = piePlot0.getBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot0.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        double double10 = piePlot1.getExplodePercent((java.lang.Comparable) (-1.0f));
        piePlot1.zoom((double) (byte) 100);
        java.awt.Paint paint14 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        piePlot16.setLabelGap((double) 10L);
        java.lang.Comparable comparable21 = piePlot16.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        java.awt.Stroke stroke24 = null;
        piePlot23.setLabelOutlineStroke(stroke24);
        piePlot23.setStartAngle((double) (-1.0f));
        java.awt.Paint paint28 = piePlot23.getBaseSectionPaint();
        piePlot16.setBackgroundPaint(paint28);
        piePlot16.setPieIndex(100);
        java.awt.Stroke stroke34 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, true);
        java.awt.Stroke stroke37 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10, false);
        piePlot1.setBaseSectionOutlineStroke(stroke37);
        java.awt.Image image39 = piePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1 + "'", comparable21, 1);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNull(image39);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint7 = piePlot1.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        boolean boolean10 = piePlot1.getSimpleLabels();
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (short) 10);
        org.jfree.chart.plot.Plot plot13 = piePlot1.getParent();
        java.awt.Stroke stroke16 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.025d, true);
        java.awt.Paint paint18 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.5f);
        java.lang.String str19 = piePlot1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot21.drawBackgroundImage(graphics2D22, rectangle2D23);
        piePlot21.setShadowYOffset((double) (byte) 1);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot21.setLabelPaint(paint27);
        float float29 = piePlot21.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        java.awt.Stroke stroke32 = null;
        piePlot31.setLabelOutlineStroke(stroke32);
        piePlot31.setStartAngle((double) (-1.0f));
        float float36 = piePlot31.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection37 = piePlot31.getLegendItems();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = piePlot39.getDrawingSupplier();
        piePlot31.setDrawingSupplier(drawingSupplier41);
        piePlot21.setDrawingSupplier(drawingSupplier41);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot21.getSimpleLabelOffset();
        piePlot1.setSimpleLabelOffset(rectangleInsets44);
        org.jfree.chart.plot.Plot plot46 = null;
        piePlot1.setParent(plot46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.08d + "'", double40 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNotNull(rectangleInsets44);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setBackgroundImageAlignment((int) '4');
        java.awt.Paint paint8 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0.5f, false);
        java.awt.Paint paint9 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot", false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        java.awt.Paint paint4 = piePlot1.getNoDataMessagePaint();
        java.lang.Comparable comparable6 = piePlot1.getSectionKey(15);
        piePlot1.setInteriorGap(0.0d);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getInteriorGap();
        java.awt.Stroke stroke12 = piePlot10.getBaseSectionOutlineStroke();
        java.awt.Paint paint15 = piePlot10.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getInteriorGap();
        java.awt.Paint paint20 = null;
        piePlot17.setSectionPaint((java.lang.Comparable) "", paint20);
        java.awt.Stroke stroke23 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getInteriorGap();
        piePlot25.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint31 = piePlot25.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot17.setOutlinePaint(paint31);
        piePlot10.setBackgroundPaint(paint31);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        double double36 = piePlot35.getInteriorGap();
        piePlot35.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint41 = piePlot35.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator42 = null;
        piePlot35.setURLGenerator(pieURLGenerator42);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getMaximumLabelWidth();
        java.awt.Paint paint47 = piePlot45.getLabelLinkPaint();
        piePlot35.setBaseSectionPaint(paint47);
        piePlot10.setBaseSectionPaint(paint47);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        double double53 = piePlot52.getInteriorGap();
        piePlot52.setLabelGap((double) 10L);
        java.lang.Comparable comparable57 = piePlot52.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        java.awt.Stroke stroke60 = null;
        piePlot59.setLabelOutlineStroke(stroke60);
        piePlot59.setStartAngle((double) (-1.0f));
        java.awt.Paint paint64 = piePlot59.getBaseSectionPaint();
        piePlot52.setBackgroundPaint(paint64);
        piePlot10.setSectionOutlinePaint((java.lang.Comparable) "hi!", paint64);
        piePlot10.setBackgroundAlpha(0.0f);
        java.awt.Stroke stroke69 = piePlot10.getLabelOutlineStroke();
        org.jfree.data.general.DatasetGroup datasetGroup70 = piePlot10.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset71 = null;
        org.jfree.chart.plot.PiePlot piePlot72 = new org.jfree.chart.plot.PiePlot(pieDataset71);
        double double73 = piePlot72.getInteriorGap();
        piePlot72.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint78 = piePlot72.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        double double79 = piePlot72.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent80 = null;
        piePlot72.notifyListeners(plotChangeEvent80);
        piePlot72.setForegroundAlpha((float) (short) 1);
        piePlot72.setCircular(false, true);
        org.jfree.chart.plot.Plot plot87 = piePlot72.getParent();
        org.jfree.data.general.PieDataset pieDataset88 = null;
        org.jfree.chart.plot.PiePlot piePlot89 = new org.jfree.chart.plot.PiePlot(pieDataset88);
        java.awt.Stroke stroke90 = null;
        piePlot89.setLabelOutlineStroke(stroke90);
        piePlot89.setBackgroundImageAlignment((int) '4');
        java.awt.Paint paint96 = piePlot89.lookupSectionOutlinePaint((java.lang.Comparable) 0.5f, false);
        piePlot72.setLabelOutlinePaint(paint96);
        piePlot10.setOutlinePaint(paint96);
        piePlot1.setBaseSectionOutlinePaint(paint96);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 15 + "'", comparable6, 15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.08d + "'", double36 == 0.08d);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.14d + "'", double46 == 0.14d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.08d + "'", double53 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 1 + "'", comparable57, 1);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNull(datasetGroup70);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.08d + "'", double73 == 0.08d);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0E-5d + "'", double79 == 1.0E-5d);
        org.junit.Assert.assertNull(plot87);
        org.junit.Assert.assertNotNull(paint96);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        java.awt.Image image4 = null;
        piePlot1.setBackgroundImage(image4);
        piePlot1.setOutlineVisible(false);
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        java.awt.Paint paint12 = piePlot1.getBackgroundPaint();
        java.awt.Stroke stroke13 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        piePlot1.setLabelGap((double) 10L);
        java.lang.Comparable comparable6 = piePlot1.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        java.awt.Stroke stroke9 = null;
        piePlot8.setLabelOutlineStroke(stroke9);
        piePlot8.setStartAngle((double) (-1.0f));
        java.awt.Paint paint13 = piePlot8.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint13);
        java.awt.Paint paint16 = piePlot1.getSectionPaint((java.lang.Comparable) 35);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getInteriorGap();
        piePlot18.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint24 = piePlot18.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot18.setForegroundAlpha((float) '#');
        java.awt.Paint paint28 = piePlot18.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot1.setShadowPaint(paint28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator30);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot1.getLegendLabelToolTipGenerator();
        boolean boolean33 = piePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieSectionLabelGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(true);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        piePlot1.setMaximumLabelWidth(1.0d);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        java.awt.Stroke stroke12 = null;
        piePlot11.setLabelOutlineStroke(stroke12);
        piePlot11.setStartAngle((double) (-1.0f));
        float float16 = piePlot11.getBackgroundAlpha();
        piePlot11.setBackgroundImageAlpha((float) (short) 0);
        piePlot11.setIgnoreNullValues(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot11.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator21);
        java.awt.Paint paint23 = piePlot1.getBaseSectionOutlinePaint();
        piePlot1.setLabelLinkMargin((double) 52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot1.getLegendLabelURLGenerator();
        java.lang.String str27 = piePlot1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getInteriorGap();
        piePlot29.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Stroke stroke33 = piePlot29.getBaseSectionOutlineStroke();
        piePlot1.setOutlineStroke(stroke33);
        double double35 = piePlot1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot1.getLabelDistributor();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getInteriorGap();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.lang.Comparable comparable12 = piePlot8.getSectionKey((int) '#');
        piePlot8.setShadowXOffset((double) 10);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot16.drawBackgroundImage(graphics2D17, rectangle2D18);
        piePlot16.setShadowYOffset((double) (byte) 1);
        boolean boolean22 = piePlot16.isCircular();
        java.lang.Comparable comparable24 = piePlot16.getSectionKey(10);
        double double25 = piePlot16.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getInteriorGap();
        java.awt.Paint paint30 = null;
        piePlot27.setSectionPaint((java.lang.Comparable) "", paint30);
        java.awt.Stroke stroke33 = piePlot27.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot16.setLabelOutlineStroke(stroke33);
        piePlot8.setBaseSectionOutlineStroke(stroke33);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot8.getLabelPadding();
        piePlot1.setInsets(rectangleInsets36);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        piePlot1.markerChanged(markerChangeEvent38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 35 + "'", comparable12, 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets36);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot1.addChangeListener(plotChangeListener4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        piePlot7.drawBackgroundImage(graphics2D8, rectangle2D9);
        piePlot7.setShadowYOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getInteriorGap();
        java.awt.Stroke stroke16 = piePlot14.getBaseSectionOutlineStroke();
        java.awt.Paint paint19 = piePlot14.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        piePlot7.setLabelLinkPaint(paint19);
        piePlot1.setBackgroundPaint(paint19);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Stroke stroke3 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint6 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Font font9 = piePlot1.getNoDataMessageFont();
        piePlot1.setLabelGap((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        piePlot1.setLabelLinksVisible(false);
        piePlot1.setBackgroundAlpha(100.0f);
        java.awt.Paint paint10 = piePlot1.getShadowPaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        piePlot15.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint21 = piePlot15.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot15.setURLGenerator(pieURLGenerator22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMaximumLabelWidth();
        java.awt.Paint paint27 = piePlot25.getLabelLinkPaint();
        piePlot15.setBaseSectionPaint(paint27);
        java.awt.Paint paint29 = piePlot15.getLabelBackgroundPaint();
        piePlot1.setNoDataMessagePaint(paint29);
        double double31 = piePlot1.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        piePlot1.setShadowYOffset((double) (byte) 1);
        boolean boolean7 = piePlot1.isCircular();
        java.lang.Comparable comparable9 = piePlot1.getSectionKey(10);
        boolean boolean10 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMaximumLabelWidth();
        java.awt.Paint paint14 = piePlot12.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        java.awt.Stroke stroke18 = piePlot16.getBaseSectionOutlineStroke();
        java.awt.Paint paint21 = piePlot16.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getInteriorGap();
        piePlot24.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint30 = piePlot24.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = null;
        piePlot24.setURLGenerator(pieURLGenerator31);
        boolean boolean33 = piePlot24.getSimpleLabels();
        java.awt.Paint paint35 = piePlot24.lookupSectionOutlinePaint((java.lang.Comparable) (short) 10);
        piePlot16.setSectionPaint((java.lang.Comparable) (byte) 100, paint35);
        piePlot12.setShadowPaint(paint35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = piePlot12.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot12.getSimpleLabelOffset();
        piePlot1.setLabelPadding(rectangleInsets39);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.08d + "'", double25 == 0.08d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(drawingSupplier38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        piePlot1.drawBackgroundImage(graphics2D2, rectangle2D3);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        piePlot1.addChangeListener(plotChangeListener5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setURLGenerator(pieURLGenerator7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreNullValues(false);
        org.junit.Assert.assertNull(pieURLGenerator9);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        java.awt.Paint paint4 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) "", paint4);
        org.jfree.data.general.PieDataset pieDataset6 = piePlot1.getDataset();
        java.awt.Stroke stroke7 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke9 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) "");
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot1.handleClick((int) '4', (int) '4', plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getInteriorGap();
        java.awt.Stroke stroke18 = piePlot16.getBaseSectionOutlineStroke();
        java.awt.Paint paint21 = piePlot16.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getInteriorGap();
        java.awt.Paint paint26 = null;
        piePlot23.setSectionPaint((java.lang.Comparable) "", paint26);
        java.awt.Stroke stroke29 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getInteriorGap();
        piePlot31.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint37 = piePlot31.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot23.setOutlinePaint(paint37);
        piePlot16.setBackgroundPaint(paint37);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        double double42 = piePlot41.getInteriorGap();
        piePlot41.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint47 = piePlot41.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = null;
        piePlot41.setURLGenerator(pieURLGenerator48);
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        double double52 = piePlot51.getMaximumLabelWidth();
        java.awt.Paint paint53 = piePlot51.getLabelLinkPaint();
        piePlot41.setBaseSectionPaint(paint53);
        piePlot16.setBaseSectionPaint(paint53);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        double double59 = piePlot58.getInteriorGap();
        piePlot58.setLabelGap((double) 10L);
        java.lang.Comparable comparable63 = piePlot58.getSectionKey((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset64 = null;
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot(pieDataset64);
        java.awt.Stroke stroke66 = null;
        piePlot65.setLabelOutlineStroke(stroke66);
        piePlot65.setStartAngle((double) (-1.0f));
        java.awt.Paint paint70 = piePlot65.getBaseSectionPaint();
        piePlot58.setBackgroundPaint(paint70);
        piePlot16.setSectionOutlinePaint((java.lang.Comparable) "hi!", paint70);
        java.awt.Paint paint73 = piePlot16.getLabelShadowPaint();
        piePlot1.setLabelPaint(paint73);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNull(pieDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08d + "'", double24 == 0.08d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.08d + "'", double32 == 0.08d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.08d + "'", double42 == 0.08d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.14d + "'", double52 == 0.14d);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.08d + "'", double59 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + 1 + "'", comparable63, 1);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(paint73);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke2 = null;
        piePlot1.setLabelOutlineStroke(stroke2);
        piePlot1.setStartAngle((double) (-1.0f));
        float float6 = piePlot1.getBackgroundAlpha();
        piePlot1.setBackgroundImageAlpha((float) (short) 0);
        piePlot1.setShadowYOffset(0.0d);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot12.drawBackgroundImage(graphics2D13, rectangle2D14);
        piePlot12.setShadowYOffset((double) (byte) 1);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot12.setBaseSectionOutlineStroke(stroke18);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        double double22 = piePlot21.getInteriorGap();
        piePlot21.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint27 = piePlot21.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = null;
        piePlot21.setURLGenerator(pieURLGenerator28);
        boolean boolean30 = piePlot21.getSimpleLabels();
        piePlot21.setBackgroundAlpha(0.0f);
        piePlot21.zoom((double) 100);
        java.awt.Stroke stroke35 = piePlot21.getLabelOutlineStroke();
        piePlot12.setLabelOutlineStroke(stroke35);
        double double37 = piePlot12.getShadowYOffset();
        java.awt.Paint paint38 = piePlot12.getNoDataMessagePaint();
        piePlot12.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot12.getInsets();
        piePlot1.setLabelPadding(rectangleInsets41);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        java.awt.Paint paint8 = null;
        piePlot5.setSectionPaint((java.lang.Comparable) "", paint8);
        java.awt.Stroke stroke11 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot1.setLabelOutlineStroke(stroke11);
        boolean boolean13 = piePlot1.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot1.notifyListeners(plotChangeEvent14);
        double double16 = piePlot1.getInteriorGap();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08d + "'", double2 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint3 = piePlot1.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getInteriorGap();
        piePlot5.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint11 = piePlot5.lookupSectionPaint((java.lang.Comparable) 1.0E-5d, false);
        piePlot1.setNoDataMessagePaint(paint11);
        double double13 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getInteriorGap();
        java.awt.Paint paint18 = null;
        piePlot15.setSectionPaint((java.lang.Comparable) "", paint18);
        org.jfree.data.general.PieDataset pieDataset20 = piePlot15.getDataset();
        java.awt.Stroke stroke21 = piePlot15.getLabelOutlineStroke();
        java.awt.Stroke stroke23 = piePlot15.getSectionOutlineStroke((java.lang.Comparable) "");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        piePlot15.markerChanged(markerChangeEvent24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getInteriorGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = piePlot27.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot27.getSimpleLabelOffset();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getInteriorGap();
        piePlot33.setMaximumLabelWidth((double) (byte) -1);
        java.awt.Paint paint39 = piePlot33.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot27.setNoDataMessagePaint(paint39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getInteriorGap();
        piePlot42.setLabelGap((double) 10L);
        java.lang.Comparable comparable47 = piePlot42.getSectionKey((int) (short) 1);
        java.awt.Stroke stroke48 = piePlot42.getLabelOutlineStroke();
        piePlot27.setOutlineStroke(stroke48);
        java.awt.Paint paint52 = piePlot27.lookupSectionPaint((java.lang.Comparable) 0.4d, false);
        piePlot15.setLabelLinkPaint(paint52);
        piePlot1.setLabelPaint(paint52);
        org.jfree.chart.util.Rotation rotation55 = piePlot1.getDirection();
        java.awt.Paint paint56 = piePlot1.getLabelOutlinePaint();
        double double57 = piePlot1.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNull(pieDataset20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.08d + "'", double34 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 1 + "'", comparable47, 1);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.14d + "'", double57 == 0.14d);
    }
}
